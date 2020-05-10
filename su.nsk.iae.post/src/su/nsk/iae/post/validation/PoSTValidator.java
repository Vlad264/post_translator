package su.nsk.iae.post.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

import su.nsk.iae.post.poST.Configuration;
import su.nsk.iae.post.poST.ExternalVarDeclaration;
import su.nsk.iae.post.poST.ExternalVarInitDeclaration;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.GlobalVarInitDeclaration;
import su.nsk.iae.post.poST.InputOutputVarDeclaration;
import su.nsk.iae.post.poST.InputVarDeclaration;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.OutputVarDeclaration;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.Process;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.Resource;
import su.nsk.iae.post.poST.SetStateStatement;
import su.nsk.iae.post.poST.StartProcessStatement;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.TempVarDeclaration;
import su.nsk.iae.post.poST.VarDeclaration;
import su.nsk.iae.post.poST.VarInitDeclaration;

public class PoSTValidator extends AbstractPoSTValidator {
	
	/* ======================= START Variables Validator ======================= */
	
	@Check
	public void checkDirectVariable(GlobalVarInitDeclaration varDecl) {
		String str = varDecl.getLocation();
		String[] arr = str.substring(3).split("\\.");
		if (str.charAt(1) == 'M') {
			error("Direct variable error: Arduino doesn't suppurt direct memory variable",
					PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
			return;
		}
		if (str.charAt(2) == 'X') {
			
			if (arr.length == 1) {
				error("Direct variable format error: \"%(I / Q)X<reg>.<bit>\" For X need need bit declaration",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			if (arr.length > 2) {
				error("Direct variable format error: \"%(I / Q)X<reg>.<bit>\" For X no need other input",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			int reg = Integer.valueOf(arr[0]);
			if ((reg != 2) && (reg != 3) && (reg != 4)) {
				error("Direct variable format error: \"%(I / Q)X<reg>.<bit>\" reg must be in range [2..4]",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			int bit = Integer.valueOf(arr[1]);
			if ((bit == 0) || (bit > 8)) {
				error("Direct variable format error: \"%(I / Q)X<reg>.<bit>\" bit must be in range [1..8]",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			if (!varDecl.getType().equals("BOOL")) {
				error("Attached variable error: for X need type \"BOOL\"",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Type());
				return;
			}
			
		} else if (str.charAt(2) == 'B') {
			if (str.contains(".")) {
				error("Direct variable format error: \"%(I / Q)B<reg>\" For B no need other input",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			int reg = Integer.valueOf(str.substring(3));
			if ((reg != 2) && (reg != 3) && (reg != 4)) {
				error("Direct variable format error: \"%(I / Q)B<reg>\" reg must be in range [2..4]",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
				return;
			}
			if (!varDecl.getType().equals("BYTE")) {
				error("Attached variable error: for B need type \"BYTE\"",
						PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Type());
				return;
			}
		} else {
			error("Direct variable error: Arduino doesn't support direct variables larger than one byte",
					PoSTPackage.eINSTANCE.getGlobalVarInitDeclaration_Location());
		}
	}
	
	@Check
	public void checkVariableNameConflicts(SymbolicVariable varName) {
		if (EcoreUtil2.getContainerOfType(varName, ExternalVarDeclaration.class) != null) {
			if (checkVariableNameConflictsInExternalVars(varName)) {
				error("External var error: An external global variable cannot be found",
						PoSTPackage.eINSTANCE.getSymbolicVariable_Name());
				return;
			}
			return;
		}
		Process process = EcoreUtil2.getContainerOfType(varName, Process.class);
		if ((process != null) && checkVariableNameConflictsInProcess(process, varName)) {
			if (checkVariableNameConflictsInProcess(process, varName)) {
				error("Var conflict: Process already has a variable with this name",
						PoSTPackage.eINSTANCE.getSymbolicVariable_Name());
				return;
			}
		}
		Program program = EcoreUtil2.getContainerOfType(varName, Program.class);
		if (program != null) {
			if (checkVariableNameConflictsInProgram(program, varName)) {
				error("Var conflict: Program already has a variable with this name",
						PoSTPackage.eINSTANCE.getSymbolicVariable_Name());
				return;
			}
			return;
		}
		Resource res = EcoreUtil2.getContainerOfType(varName, Resource.class);
		if ((res != null) && checkVariableNameConflictsInResource(res, varName)) {
			error("Var conflict: Configuration already has a variable with this name",
					PoSTPackage.eINSTANCE.getSymbolicVariable_Name());
		}
	}
	
	private boolean checkVariableNameConflictsInExternalVars(SymbolicVariable varName) {
		Model model = EcoreUtil2.getContainerOfType(varName, Model.class);
		for (GlobalVarDeclaration varDecl : model.getConf().getResources().get(0).getResGlobVars()) {
			if (!checkVarInitDeclaration(varDecl.getVarsSimple(), varName) && 
					!checkGlobalVarInitDeclaration(varDecl.getVarsAs(), varName)) {
				return true;
			}
		}
		if (model.getConf().getResources().get(0).getResGlobVars().isEmpty()) {
			return true;
		}
		return false;
	}
	
	private boolean checkVariableNameConflictsInProcess(Process process, SymbolicVariable varName) {
		for (VarDeclaration varDecl : process.getProcVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (TempVarDeclaration varDecl : process.getProcTempVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkVariableNameConflictsInProgram(Program program, SymbolicVariable varName) {
		for (InputVarDeclaration varDecl : program.getProgInVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (OutputVarDeclaration varDecl : program.getProgOutVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (InputOutputVarDeclaration varDecl : program.getProgInOutVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (ExternalVarDeclaration varDecl : program.getProgExternVars()) {
			if (checkExternalVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (VarDeclaration varDecl : program.getProgVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		for (TempVarDeclaration varDecl : program.getProgTempVars()) {
			if (checkVarInitDeclaration(varDecl.getVars(), varName)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkVariableNameConflictsInResource(Resource resource, SymbolicVariable varName) {
		for (GlobalVarDeclaration varDecl : resource.getResGlobVars()) {
			if (checkVarInitDeclaration(varDecl.getVarsSimple(), varName) || 
					checkGlobalVarInitDeclaration(varDecl.getVarsAs(), varName)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkVarInitDeclaration(EList<VarInitDeclaration> decls, SymbolicVariable varName) {
		for (VarInitDeclaration varList : decls) {
			for (SymbolicVariable v : varList.getVarList().getVars()) {
				if ((v != varName) && (v.getName().equals(varName.getName()))) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean checkGlobalVarInitDeclaration(EList<GlobalVarInitDeclaration> decls, SymbolicVariable varName) {
		for (GlobalVarInitDeclaration varList : decls) {
			for (SymbolicVariable v : varList.getVarList().getVars()) {
				if ((v != varName) && (v.getName().equals(varName.getName()))) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean checkExternalVarInitDeclaration(EList<ExternalVarInitDeclaration> decls, SymbolicVariable varName) {
		for (ExternalVarInitDeclaration varList : decls) {
			for (SymbolicVariable v : varList.getVarList().getVars()) {
				if ((v != varName) && (v.getName().equals(varName.getName()))) {
					return true;
				}
			}
		}
		return false;
	}
	
	/* ======================= END Variables Validator ======================= */
	
	/* ======================= START poST Validator ======================= */
	
	@Check
	public void checkNextState(SetStateStatement statement) {
		Process process = EcoreUtil2.getContainerOfType(statement, Process.class);
		if (statement.isNext()) {
			su.nsk.iae.post.poST.State state = EcoreUtil2.getContainerOfType(statement, su.nsk.iae.post.poST.State.class);
			if (process.getStates().indexOf(state) + 1 >= process.getStates().size()) {
				error("Invalide statement: no next state in the process",
						PoSTPackage.eINSTANCE.getSetStateStatement_Next());
			}
		} else {
			if (!process.getStates().contains(statement.getState())) {
				error("Invalide statement: no state " + statement.getState().getName() + " in the process " + process.getName(),
						PoSTPackage.eINSTANCE.getSetStateStatement_Next());
			}
		}
	}
	
	@Check
	public void checkStartProcess(StartProcessStatement statement) {
		Program program = EcoreUtil2.getContainerOfType(statement, Program.class);
		if (!program.getProcesses().contains(statement.getProcess())) {
			//error("Invalide statement: no process " + statement.getProcess().getName() + " in the program " + program.getName(),
			//		statement.);
		}
	}
	
	/* ======================= END poST Validator ======================= */
	
}
