/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.OperationContext;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.OperationContextImpl#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.OperationContextImpl#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.OperationContextImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationContextImpl extends MinimalEObjectImpl.Container implements OperationContext {
	/**
	 * The default value of the '{@link #isInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getRenameTo() <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenameTo()
	 * @generated
	 * @ordered
	 */
	protected static final String RENAME_TO_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.OPERATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInclude() {
		return (Boolean)eDynamicGet(SemanticContextPackage.OPERATION_CONTEXT__INCLUDE, SemanticContextPackage.Literals.OPERATION_CONTEXT__INCLUDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(boolean newInclude) {
		eDynamicSet(SemanticContextPackage.OPERATION_CONTEXT__INCLUDE, SemanticContextPackage.Literals.OPERATION_CONTEXT__INCLUDE, newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRenameTo() {
		return (String)eDynamicGet(SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.OPERATION_CONTEXT__RENAME_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameTo(String newRenameTo) {
		eDynamicSet(SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.OPERATION_CONTEXT__RENAME_TO, newRenameTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSource() {
		return (EOperation)eDynamicGet(SemanticContextPackage.OPERATION_CONTEXT__SOURCE, SemanticContextPackage.Literals.OPERATION_CONTEXT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation basicGetSource() {
		return (EOperation)eDynamicGet(SemanticContextPackage.OPERATION_CONTEXT__SOURCE, SemanticContextPackage.Literals.OPERATION_CONTEXT__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(EOperation newSource) {
		eDynamicSet(SemanticContextPackage.OPERATION_CONTEXT__SOURCE, SemanticContextPackage.Literals.OPERATION_CONTEXT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.OPERATION_CONTEXT__INCLUDE:
				return isInclude();
			case SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO:
				return getRenameTo();
			case SemanticContextPackage.OPERATION_CONTEXT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemanticContextPackage.OPERATION_CONTEXT__INCLUDE:
				setInclude((Boolean)newValue);
				return;
			case SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO:
				setRenameTo((String)newValue);
				return;
			case SemanticContextPackage.OPERATION_CONTEXT__SOURCE:
				setSource((EOperation)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SemanticContextPackage.OPERATION_CONTEXT__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
				return;
			case SemanticContextPackage.OPERATION_CONTEXT__SOURCE:
				setSource((EOperation)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SemanticContextPackage.OPERATION_CONTEXT__INCLUDE:
				return isInclude() != INCLUDE_EDEFAULT;
			case SemanticContextPackage.OPERATION_CONTEXT__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? getRenameTo() != null : !RENAME_TO_EDEFAULT.equals(getRenameTo());
			case SemanticContextPackage.OPERATION_CONTEXT__SOURCE:
				return basicGetSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationContextImpl
