/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.FeatureContext;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl#isFollowReference <em>Follow Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureContextImpl extends MinimalEObjectImpl.Container implements FeatureContext {
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
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFollowReference() <em>Follow Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFollowReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOLLOW_REFERENCE_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.FEATURE_CONTEXT;
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
		return (Boolean)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__INCLUDE, SemanticContextPackage.Literals.FEATURE_CONTEXT__INCLUDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(boolean newInclude) {
		eDynamicSet(SemanticContextPackage.FEATURE_CONTEXT__INCLUDE, SemanticContextPackage.Literals.FEATURE_CONTEXT__INCLUDE, newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRenameTo() {
		return (String)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.FEATURE_CONTEXT__RENAME_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameTo(String newRenameTo) {
		eDynamicSet(SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.FEATURE_CONTEXT__RENAME_TO, newRenameTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return (Boolean)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY, SemanticContextPackage.Literals.FEATURE_CONTEXT__READ_ONLY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		eDynamicSet(SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY, SemanticContextPackage.Literals.FEATURE_CONTEXT__READ_ONLY, newReadOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFollowReference() {
		return (Boolean)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE, SemanticContextPackage.Literals.FEATURE_CONTEXT__FOLLOW_REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowReference(boolean newFollowReference) {
		eDynamicSet(SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE, SemanticContextPackage.Literals.FEATURE_CONTEXT__FOLLOW_REFERENCE, newFollowReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStructuralFeature getSource() {
		return (EStructuralFeature)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__SOURCE, SemanticContextPackage.Literals.FEATURE_CONTEXT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetSource() {
		return (EStructuralFeature)eDynamicGet(SemanticContextPackage.FEATURE_CONTEXT__SOURCE, SemanticContextPackage.Literals.FEATURE_CONTEXT__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(EStructuralFeature newSource) {
		eDynamicSet(SemanticContextPackage.FEATURE_CONTEXT__SOURCE, SemanticContextPackage.Literals.FEATURE_CONTEXT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.FEATURE_CONTEXT__INCLUDE:
				return isInclude();
			case SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO:
				return getRenameTo();
			case SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY:
				return isReadOnly();
			case SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE:
				return isFollowReference();
			case SemanticContextPackage.FEATURE_CONTEXT__SOURCE:
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
			case SemanticContextPackage.FEATURE_CONTEXT__INCLUDE:
				setInclude((Boolean)newValue);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO:
				setRenameTo((String)newValue);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE:
				setFollowReference((Boolean)newValue);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__SOURCE:
				setSource((EStructuralFeature)newValue);
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
			case SemanticContextPackage.FEATURE_CONTEXT__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE:
				setFollowReference(FOLLOW_REFERENCE_EDEFAULT);
				return;
			case SemanticContextPackage.FEATURE_CONTEXT__SOURCE:
				setSource((EStructuralFeature)null);
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
			case SemanticContextPackage.FEATURE_CONTEXT__INCLUDE:
				return isInclude() != INCLUDE_EDEFAULT;
			case SemanticContextPackage.FEATURE_CONTEXT__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? getRenameTo() != null : !RENAME_TO_EDEFAULT.equals(getRenameTo());
			case SemanticContextPackage.FEATURE_CONTEXT__READ_ONLY:
				return isReadOnly() != READ_ONLY_EDEFAULT;
			case SemanticContextPackage.FEATURE_CONTEXT__FOLLOW_REFERENCE:
				return isFollowReference() != FOLLOW_REFERENCE_EDEFAULT;
			case SemanticContextPackage.FEATURE_CONTEXT__SOURCE:
				return basicGetSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureContextImpl
