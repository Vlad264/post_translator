/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.TaskInitialization#getSingle <em>Single</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.TaskInitialization#getInterval <em>Interval</em>}</li>
 *   <li>{@link su.nsk.iae.post.poST.TaskInitialization#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see su.nsk.iae.post.poST.PoSTPackage#getTaskInitialization()
 * @model
 * @generated
 */
public interface TaskInitialization extends EObject
{
  /**
   * Returns the value of the '<em><b>Single</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single</em>' containment reference.
   * @see #setSingle(Constant)
   * @see su.nsk.iae.post.poST.PoSTPackage#getTaskInitialization_Single()
   * @model containment="true"
   * @generated
   */
  Constant getSingle();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.TaskInitialization#getSingle <em>Single</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single</em>' containment reference.
   * @see #getSingle()
   * @generated
   */
  void setSingle(Constant value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(Constant)
   * @see su.nsk.iae.post.poST.PoSTPackage#getTaskInitialization_Interval()
   * @model containment="true"
   * @generated
   */
  Constant getInterval();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.TaskInitialization#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(Constant value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see #setPriority(int)
   * @see su.nsk.iae.post.poST.PoSTPackage#getTaskInitialization_Priority()
   * @model
   * @generated
   */
  int getPriority();

  /**
   * Sets the value of the '{@link su.nsk.iae.post.poST.TaskInitialization#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see #getPriority()
   * @generated
   */
  void setPriority(int value);

} // TaskInitialization