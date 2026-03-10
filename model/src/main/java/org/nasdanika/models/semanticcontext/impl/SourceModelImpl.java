/**
 */
package org.nasdanika.models.semanticcontext.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl#getRootElements <em>Root Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceModelImpl extends MinimalEObjectImpl.Container implements SourceModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.SOURCE_MODEL;
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
	public String getName() {
		return (String)eDynamicGet(SemanticContextPackage.SOURCE_MODEL__NAME, SemanticContextPackage.Literals.SOURCE_MODEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(SemanticContextPackage.SOURCE_MODEL__NAME, SemanticContextPackage.Literals.SOURCE_MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION, SemanticContextPackage.Literals.SOURCE_MODEL__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION, SemanticContextPackage.Literals.SOURCE_MODEL__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getMetamodel() {
		return (EPackage)eDynamicGet(SemanticContextPackage.SOURCE_MODEL__METAMODEL, SemanticContextPackage.Literals.SOURCE_MODEL__METAMODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetMetamodel() {
		return (EPackage)eDynamicGet(SemanticContextPackage.SOURCE_MODEL__METAMODEL, SemanticContextPackage.Literals.SOURCE_MODEL__METAMODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetamodel(EPackage newMetamodel) {
		eDynamicSet(SemanticContextPackage.SOURCE_MODEL__METAMODEL, SemanticContextPackage.Literals.SOURCE_MODEL__METAMODEL, newMetamodel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getRootElements() {
		return (EList<EObject>)eDynamicGet(SemanticContextPackage.SOURCE_MODEL__ROOT_ELEMENTS, SemanticContextPackage.Literals.SOURCE_MODEL__ROOT_ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.SOURCE_MODEL__NAME:
				return getName();
			case SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION:
				return getDocumentation();
			case SemanticContextPackage.SOURCE_MODEL__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case SemanticContextPackage.SOURCE_MODEL__ROOT_ELEMENTS:
				return getRootElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SemanticContextPackage.SOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SemanticContextPackage.SOURCE_MODEL__METAMODEL:
				setMetamodel((EPackage)newValue);
				return;
			case SemanticContextPackage.SOURCE_MODEL__ROOT_ELEMENTS:
				getRootElements().clear();
				getRootElements().addAll((Collection<? extends EObject>)newValue);
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
			case SemanticContextPackage.SOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SemanticContextPackage.SOURCE_MODEL__METAMODEL:
				setMetamodel((EPackage)null);
				return;
			case SemanticContextPackage.SOURCE_MODEL__ROOT_ELEMENTS:
				getRootElements().clear();
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
			case SemanticContextPackage.SOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SemanticContextPackage.SOURCE_MODEL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case SemanticContextPackage.SOURCE_MODEL__METAMODEL:
				return basicGetMetamodel() != null;
			case SemanticContextPackage.SOURCE_MODEL__ROOT_ELEMENTS:
				return !getRootElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceModelImpl
