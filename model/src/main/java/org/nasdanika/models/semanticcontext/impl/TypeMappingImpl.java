/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;
import org.nasdanika.models.semanticcontext.TypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMappingImpl extends MinimalEObjectImpl.Container implements TypeMapping {
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
	 * The default value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlatten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLATTEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.TYPE_MAPPING;
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
	public String getRenameTo() {
		return (String)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__RENAME_TO, SemanticContextPackage.Literals.TYPE_MAPPING__RENAME_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameTo(String newRenameTo) {
		eDynamicSet(SemanticContextPackage.TYPE_MAPPING__RENAME_TO, SemanticContextPackage.Literals.TYPE_MAPPING__RENAME_TO, newRenameTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlatten() {
		return (Boolean)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__FLATTEN, SemanticContextPackage.Literals.TYPE_MAPPING__FLATTEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatten(boolean newFlatten) {
		eDynamicSet(SemanticContextPackage.TYPE_MAPPING__FLATTEN, SemanticContextPackage.Literals.TYPE_MAPPING__FLATTEN, newFlatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModel getSourceModel() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetSourceModel() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModel(SourceModel newSourceModel) {
		eDynamicSet(SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE_MODEL, newSourceModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getSource() {
		return (EClassifier)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__SOURCE, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetSource() {
		return (EClassifier)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__SOURCE, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(EClassifier newSource) {
		eDynamicSet(SemanticContextPackage.TYPE_MAPPING__SOURCE, SemanticContextPackage.Literals.TYPE_MAPPING__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClassifier getTarget() {
		return (EClassifier)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__TARGET, SemanticContextPackage.Literals.TYPE_MAPPING__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetTarget() {
		return (EClassifier)eDynamicGet(SemanticContextPackage.TYPE_MAPPING__TARGET, SemanticContextPackage.Literals.TYPE_MAPPING__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EClassifier newTarget) {
		eDynamicSet(SemanticContextPackage.TYPE_MAPPING__TARGET, SemanticContextPackage.Literals.TYPE_MAPPING__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.TYPE_MAPPING__RENAME_TO:
				return getRenameTo();
			case SemanticContextPackage.TYPE_MAPPING__FLATTEN:
				return isFlatten();
			case SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL:
				if (resolve) return getSourceModel();
				return basicGetSourceModel();
			case SemanticContextPackage.TYPE_MAPPING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SemanticContextPackage.TYPE_MAPPING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case SemanticContextPackage.TYPE_MAPPING__RENAME_TO:
				setRenameTo((String)newValue);
				return;
			case SemanticContextPackage.TYPE_MAPPING__FLATTEN:
				setFlatten((Boolean)newValue);
				return;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL:
				setSourceModel((SourceModel)newValue);
				return;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE:
				setSource((EClassifier)newValue);
				return;
			case SemanticContextPackage.TYPE_MAPPING__TARGET:
				setTarget((EClassifier)newValue);
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
			case SemanticContextPackage.TYPE_MAPPING__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
				return;
			case SemanticContextPackage.TYPE_MAPPING__FLATTEN:
				setFlatten(FLATTEN_EDEFAULT);
				return;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL:
				setSourceModel((SourceModel)null);
				return;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE:
				setSource((EClassifier)null);
				return;
			case SemanticContextPackage.TYPE_MAPPING__TARGET:
				setTarget((EClassifier)null);
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
			case SemanticContextPackage.TYPE_MAPPING__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? getRenameTo() != null : !RENAME_TO_EDEFAULT.equals(getRenameTo());
			case SemanticContextPackage.TYPE_MAPPING__FLATTEN:
				return isFlatten() != FLATTEN_EDEFAULT;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE_MODEL:
				return basicGetSourceModel() != null;
			case SemanticContextPackage.TYPE_MAPPING__SOURCE:
				return basicGetSource() != null;
			case SemanticContextPackage.TYPE_MAPPING__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMappingImpl
