package su.nsk.iae.post.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;

import su.nsk.iae.post.poST.AssignmentStatement;
import su.nsk.iae.post.poST.AssignmentType;
import su.nsk.iae.post.poST.ErrorProcessStatement;
import su.nsk.iae.post.poST.ExternalVarDeclaration;
import su.nsk.iae.post.poST.ExternalVarInitDeclaration;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.GlobalVarInitDeclaration;
import su.nsk.iae.post.poST.InputOutputVarDeclaration;
import su.nsk.iae.post.poST.InputVarDeclaration;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.OutputVarDeclaration;
import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.PrimaryExpression;
import su.nsk.iae.post.poST.Process;
import su.nsk.iae.post.poST.ProcessStatusExpression;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.ProgramConfElement;
import su.nsk.iae.post.poST.ProgramConfiguration;
import su.nsk.iae.post.poST.Resource;
import su.nsk.iae.post.poST.SetStateStatement;
import su.nsk.iae.post.poST.StartProcessStatement;
import su.nsk.iae.post.poST.StopProcessStatement;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.Task;
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
	
	@Check
	public void checkNeverUseVariable(SymbolicVariable varName) {
		Program program = EcoreUtil2.getContainerOfType(varName, Program.class);
		if ((program != null) && !hasCrossReferences(program, varName)) {
			warning("Variable is never use", PoSTPackage.eINSTANCE.getSymbolicVariable_Name());
		}
		
	}
	
	@Check
	public void checkAssignmentStatement(AssignmentStatement statement) {
		SymbolicVariable varName = statement.getVariable();
		if (checkVariableNameConflictsInProcess(EcoreUtil2.getContainerOfType(statement, Process.class), varName) ||
				checkVariableNameConflictsInProgram(EcoreUtil2.getContainerOfType(statement, Program.class), varName)) {
			error("Scope error: Variable is not visible in this process",
					PoSTPackage.eINSTANCE.getAssignmentStatement_Variable());
			return;
		}
		if ((EcoreUtil2.getContainerOfType(varName, InputVarDeclaration.class) != null)) {
			error("Assignment error: Couldn't modidy input varsiable",
					PoSTPackage.eINSTANCE.getAssignmentStatement_Variable());
			return;
		}
		VarDeclaration inputDecl = EcoreUtil2.getContainerOfType(varName, VarDeclaration.class);
		ExternalVarDeclaration externalDecl = EcoreUtil2.getContainerOfType(varName, ExternalVarDeclaration.class);
		if (((inputDecl != null) && inputDecl.isConst()) || ((externalDecl != null) && externalDecl.isConst())) {
			error("Assignment error: Couldn't modidy constant varsiable",
					PoSTPackage.eINSTANCE.getAssignmentStatement_Variable());
		}
	}
	
	@Check
	public void chekPrimaryExpression(PrimaryExpression expr) {
		if (expr.getVariable() == null) {
			return;
		}
		SymbolicVariable varName = expr.getVariable();
		if (checkVariableNameConflictsInProcess(EcoreUtil2.getContainerOfType(expr, Process.class), varName) ||
				checkVariableNameConflictsInProgram(EcoreUtil2.getContainerOfType(expr, Program.class), varName)) {
			error("Scope error: Variable is not visible in this process",
					PoSTPackage.eINSTANCE.getPrimaryExpression_Variable());
			return;
		}
	}
	
	@Check
	public void checkTaskNameConflicts(Task task) {
		Resource res = EcoreUtil2.getContainerOfType(task, Resource.class);
		for (Task t : res.getResStatement().getTasks()) {
			if ((t != task) && t.getName().equals(task.getName())) {
				error("Name error: Task with this name already exists",
						PoSTPackage.eINSTANCE.getTask_Name());
			}
		}
	}
	
	@Check
	public void checkProgramConfiguration(ProgramConfiguration conf) {
		int programVars = 0;
		for (InputVarDeclaration varDecl : conf.getProgram().getProgInVars()) {
			for (VarInitDeclaration varList : varDecl.getVars()) {
				programVars += varList.getVarList().getVars().size();
			}
		}
		for (OutputVarDeclaration varDecl : conf.getProgram().getProgOutVars()) {
			for (VarInitDeclaration varList : varDecl.getVars()) {
				programVars += varList.getVarList().getVars().size();
			}
		}
		if ((conf.getAgrs() != null) && (programVars != conf.getAgrs().getElements().size())) {
			error("Attached error: Not all input and output variables are used",
					PoSTPackage.eINSTANCE.getProgramConfiguration_Agrs());
		}
	}
	
	@Check
	public void checkProgramConfElement(ProgramConfElement element) {
		if (element.getAssig() == AssignmentType.IN) {
			if (EcoreUtil2.getContainerOfType(element.getProgramVar(), InputVarDeclaration.class) == null) {
				error("Attached error: Must be a input var from Program",
						PoSTPackage.eINSTANCE.getProgramConfElement_ProgramVar());
			}
		} else {
			if (EcoreUtil2.getContainerOfType(element.getProgramVar(), OutputVarDeclaration.class) == null) {
				error("Attached error: Must be a output var from Program",
						PoSTPackage.eINSTANCE.getProgramConfElement_ProgramVar());
			}
		}
		if (EcoreUtil2.getContainerOfType(element.getGlobVar(), Resource.class) == null) {
			error("Attached error: Must be a global var from Resource",
					PoSTPackage.eINSTANCE.getProgramConfElement_GlobVar());
		}
	}
	
	/* ======================= END Variables Validator ======================= */
	
	/* ======================= START poST Validator ======================= */
	
	@Check
	public void checkProcessNameConflicts(Process process) {
		Program program = EcoreUtil2.getContainerOfType(process, Program.class);
		for (Process p : program.getProcesses()) {
			if ((p != process) && p.getName().equals(process.getName())) {
				error("Name error: Process with this name already exists",
						PoSTPackage.eINSTANCE.getProcess_Name());
			}
		}
	}
	
	@Check
	public void checkProcessUnreachable(Process process) {
		Program program = EcoreUtil2.getContainerOfType(process, Program.class);
		if (program.getProcesses().indexOf(process) == 0) {
			return;
		}
		for (Process p : program.getProcesses()) {
			if (p == process) {
				continue;
			}
			for (StartProcessStatement s : EcoreUtil2.getAllContentsOfType(p, StartProcessStatement.class)) {
				if (s.getProcess() == process) {
					return;
				}
			}
		}
		warning("Process is unreachable", 
				PoSTPackage.eINSTANCE.getProcess_Name());
	}
	
	@Check
	public void checkStateNameConflicts(su.nsk.iae.post.poST.State state) {
		Process process = EcoreUtil2.getContainerOfType(state, Process.class);
		for (su.nsk.iae.post.poST.State s : process.getStates()) {
			if ((s != state) && s.getName().equals(state.getName())) {
				error("Name error: State with this name already exists",
						PoSTPackage.eINSTANCE.getState_Name());
			}
		}
	}
	
	@Check
	public void checkStateUnreachable(su.nsk.iae.post.poST.State state) {
		Process process = EcoreUtil2.getContainerOfType(state, Process.class);
		if (process.getStates().indexOf(state) == 0) {
			return;
		}
		for (su.nsk.iae.post.poST.State st : process.getStates()) {
			if (st == state) {
				continue;
			}
			for (SetStateStatement s : EcoreUtil2.getAllContentsOfType(st, SetStateStatement.class)) {
				if (s.getState() == state) {
					return;
				}
			}
		}
		for (SetStateStatement s : EcoreUtil2.getAllContentsOfType(process.getStates().get(process.getStates().indexOf(state) - 1), SetStateStatement.class)) {
			if (s.isNext()) {
				return;
			}
		}
		warning("State is unreachable", 
				PoSTPackage.eINSTANCE.getState_Name());
	}
	
	@Check
	public void checkProcessStatusExpression(ProcessStatusExpression expr) {
		Program program = EcoreUtil2.getContainerOfType(expr, Program.class);
		if (!program.getProcesses().contains(expr.getProcess())) {
			error("Name error: No process with this name",
					PoSTPackage.eINSTANCE.getProcessStatements_Process());
		}
	}
	
	@Check
	public void checkNextState(SetStateStatement statement) {
		Process process = EcoreUtil2.getContainerOfType(statement, Process.class);
		if (statement.isNext()) {
			su.nsk.iae.post.poST.State state = EcoreUtil2.getContainerOfType(statement, su.nsk.iae.post.poST.State.class);
			if (process.getStates().indexOf(state) + 1 >= process.getStates().size()) {
				error("Invalide statement: No next state in the process",
						PoSTPackage.eINSTANCE.getSetStateStatement_Next());
			}
		} else {
			if (!process.getStates().contains(statement.getState())) {
				error("Invalide statement: No state with this name",
						PoSTPackage.eINSTANCE.getSetStateStatement_Next());
			}
		}
	}
	
	@Check
	public void checkStartProcessStatement(StartProcessStatement statement) {
		Program program = EcoreUtil2.getContainerOfType(statement, Program.class);
		if (!program.getProcesses().contains(statement.getProcess())) {
			error("Invalide statement: No process with this name", null);
		}
	}
	
	@Check
	public void checkStopProcessStatement(StopProcessStatement statement) {
		if (statement.getProcess() == null) {
			return;
		}
		Program program = EcoreUtil2.getContainerOfType(statement, Program.class);
		if (!program.getProcesses().contains(statement.getProcess())) {
			error("Invalide statement: No process with this name", null);
		}
	}
	
	@Check
	public void checkErrorProcessStatement(ErrorProcessStatement statement) {
		if (statement.getProcess() == null) {
			return;
		}
		Program program = EcoreUtil2.getContainerOfType(statement, Program.class);
		if (!program.getProcesses().contains(statement.getProcess())) {
			error("Invalide statement: No process with this name", null);
		}
	}
	
	/* ======================= END poST Validator ======================= */
	
	private boolean hasCrossReferences(EObject context, EObject target) {
		Set<EObject> targetSet = new HashSet<EObject>();
		targetSet.add(target);
		List<EReference> res = new ArrayList<EReference>();
		EcoreUtil2.ElementReferenceAcceptor acceptor = (EObject referrer, EObject referenced, EReference reference, int index) -> {
				res.add(reference);
		};
		EcoreUtil2.findCrossReferences(context, targetSet, acceptor);
		return !res.isEmpty();
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
				if ((v != varName) && v.getName().equals(varName.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean checkGlobalVarInitDeclaration(EList<GlobalVarInitDeclaration> decls, SymbolicVariable varName) {
		for (GlobalVarInitDeclaration varList : decls) {
			for (SymbolicVariable v : varList.getVarList().getVars()) {
				if ((v != varName) && v.getName().equals(varName.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean checkExternalVarInitDeclaration(EList<ExternalVarInitDeclaration> decls, SymbolicVariable varName) {
		for (ExternalVarInitDeclaration varList : decls) {
			for (SymbolicVariable v : varList.getVarList().getVars()) {
				if ((v != varName) && v.getName().equals(varName.getName())) {
					return true;
				}
			}
		}
		return false;
	}
}
