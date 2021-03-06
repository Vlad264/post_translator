/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Status Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.ProcessStatusExpression#getProcess <em>Process</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ProcessStatusExpression#getStateName <em>State Name</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ProcessStatusExpression#isStop <em>Stop</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.ProcessStatusExpression#isError <em>Error</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getProcessStatusExpression()
 * @model
 * @generated
 */
public interface ProcessStatusExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference.
   * @see #setProcess(su.nsk.iae.post.poST.Process)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProcessStatusExpression_Process()
   * @model
   * @generated
   */
  su.nsk.iae.post.poST.Process getProcess();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProcessStatusExpression#getProcess <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(su.nsk.iae.post.poST.Process value);

  /**
   * Returns the value of the '<em><b>State Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Name</em>' reference.
   * @see #setStateName(State)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProcessStatusExpression_StateName()
   * @model
   * @generated
   */
  State getStateName();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProcessStatusExpression#getStateName <em>State Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Name</em>' reference.
   * @see #getStateName()
   * @generated
   */
  void setStateName(State value);

  /**
   * Returns the value of the '<em><b>Stop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop</em>' attribute.
   * @see #setStop(boolean)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProcessStatusExpression_Stop()
   * @model
   * @generated
   */
  boolean isStop();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProcessStatusExpression#isStop <em>Stop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop</em>' attribute.
   * @see #isStop()
   * @generated
   */
  void setStop(boolean value);

  /**
   * Returns the value of the '<em><b>Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error</em>' attribute.
   * @see #setError(boolean)
   * @see su.nsk.iae.post.poST.PoSTPackage#getProcessStatusExpression_Error()
   * @model
   * @generated
   */
  boolean isError();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.ProcessStatusExpression#isError <em>Error</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error</em>' attribute.
   * @see #isError()
   * @generated
   */
  void setError(boolean value);

} // ProcessStatusExpression
