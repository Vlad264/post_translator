/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.PrimaryExpression#getConst <em>Const</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.PrimaryExpression#getVariable <em>Variable</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.PrimaryExpression#getProcStatus <em>Proc Status</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.PrimaryExpression#getNestExpr <em>Nest Expr</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getPrimaryExpression()
 * @model
 * @generated
 */
public interface PrimaryExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(Constant)
   * @see su.nsk.iae.post.poST.PoSTPackage#getPrimaryExpression_Const()
   * @model containment="true"
   * @generated
   */
  Constant getConst();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.PrimaryExpression#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(Constant value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(SymbolicVariable)
   * @see su.nsk.iae.post.poST.PoSTPackage#getPrimaryExpression_Variable()
   * @model
   * @generated
   */
  SymbolicVariable getVariable();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.PrimaryExpression#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(SymbolicVariable value);

  /**
   * Returns the value of the '<em><b>Proc Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proc Status</em>' containment reference.
   * @see #setProcStatus(ProcessStatusExpression)
   * @see su.nsk.iae.post.poST.PoSTPackage#getPrimaryExpression_ProcStatus()
   * @model containment="true"
   * @generated
   */
  ProcessStatusExpression getProcStatus();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.PrimaryExpression#getProcStatus <em>Proc Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proc Status</em>' containment reference.
   * @see #getProcStatus()
   * @generated
   */
  void setProcStatus(ProcessStatusExpression value);

  /**
   * Returns the value of the '<em><b>Nest Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nest Expr</em>' containment reference.
   * @see #setNestExpr(Expression)
   * @see su.nsk.iae.post.poST.PoSTPackage#getPrimaryExpression_NestExpr()
   * @model containment="true"
   * @generated
   */
  Expression getNestExpr();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.PrimaryExpression#getNestExpr <em>Nest Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nest Expr</em>' containment reference.
   * @see #getNestExpr()
   * @generated
   */
  void setNestExpr(Expression value);

} // PrimaryExpression
