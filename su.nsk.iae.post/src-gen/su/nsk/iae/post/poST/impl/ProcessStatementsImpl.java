/**
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.poST.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import su.nsk.iae.post.poST.PoSTPackage;
import su.nsk.iae.post.poST.ProcessStatements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Statements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link su.nsk.iae.post.poST.impl.ProcessStatementsImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessStatementsImpl extends StatementImpl implements ProcessStatements
{
  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected su.nsk.iae.post.poST.Process process;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessStatementsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PoSTPackage.Literals.PROCESS_STATEMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public su.nsk.iae.post.poST.Process getProcess()
  {
    if (process != null && process.eIsProxy())
    {
      InternalEObject oldProcess = (InternalEObject)process;
      process = (su.nsk.iae.post.poST.Process)eResolveProxy(oldProcess);
      if (process != oldProcess)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PoSTPackage.PROCESS_STATEMENTS__PROCESS, oldProcess, process));
      }
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public su.nsk.iae.post.poST.Process basicGetProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcess(su.nsk.iae.post.poST.Process newProcess)
  {
    su.nsk.iae.post.poST.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PoSTPackage.PROCESS_STATEMENTS__PROCESS, oldProcess, process));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PoSTPackage.PROCESS_STATEMENTS__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PoSTPackage.PROCESS_STATEMENTS__PROCESS:
        setProcess((su.nsk.iae.post.poST.Process)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.PROCESS_STATEMENTS__PROCESS:
        setProcess((su.nsk.iae.post.poST.Process)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PoSTPackage.PROCESS_STATEMENTS__PROCESS:
        return process != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessStatementsImpl
