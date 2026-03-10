/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.CrossModelLink;
import org.nasdanika.models.semanticcontext.FeatureContext;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Model Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getSourceModelFrom <em>Source Model From</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getSourceModelTo <em>Source Model To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl#getFeatureContext <em>Feature Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossModelLinkImpl extends MinimalEObjectImpl.Container implements CrossModelLink {
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
	protected CrossModelLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.CROSS_MODEL_LINK;
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
		return (String)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__NAME, SemanticContextPackage.Literals.CROSS_MODEL_LINK__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__NAME, SemanticContextPackage.Literals.CROSS_MODEL_LINK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION, SemanticContextPackage.Literals.CROSS_MODEL_LINK__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION, SemanticContextPackage.Literals.CROSS_MODEL_LINK__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENamedElement getFrom() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement basicGetFrom() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__FROM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(ENamedElement newFrom) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENamedElement getTo() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement basicGetTo() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(ENamedElement newTo) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModel getSourceModelFrom() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetSourceModelFrom() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModelFrom(SourceModel newSourceModelFrom) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_FROM, newSourceModelFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModel getSourceModelTo() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetSourceModelTo() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModelTo(SourceModel newSourceModelTo) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO, SemanticContextPackage.Literals.CROSS_MODEL_LINK__SOURCE_MODEL_TO, newSourceModelTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContext getFeatureContext() {
		return (FeatureContext)eDynamicGet(SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT, SemanticContextPackage.Literals.CROSS_MODEL_LINK__FEATURE_CONTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureContext(FeatureContext newFeatureContext, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newFeatureContext, SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureContext(FeatureContext newFeatureContext) {
		eDynamicSet(SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT, SemanticContextPackage.Literals.CROSS_MODEL_LINK__FEATURE_CONTEXT, newFeatureContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT:
				return basicSetFeatureContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.CROSS_MODEL_LINK__NAME:
				return getName();
			case SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION:
				return getDocumentation();
			case SemanticContextPackage.CROSS_MODEL_LINK__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case SemanticContextPackage.CROSS_MODEL_LINK__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM:
				if (resolve) return getSourceModelFrom();
				return basicGetSourceModelFrom();
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO:
				if (resolve) return getSourceModelTo();
				return basicGetSourceModelTo();
			case SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT:
				return getFeatureContext();
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
			case SemanticContextPackage.CROSS_MODEL_LINK__NAME:
				setName((String)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__FROM:
				setFrom((ENamedElement)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__TO:
				setTo((ENamedElement)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM:
				setSourceModelFrom((SourceModel)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO:
				setSourceModelTo((SourceModel)newValue);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT:
				setFeatureContext((FeatureContext)newValue);
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
			case SemanticContextPackage.CROSS_MODEL_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__FROM:
				setFrom((ENamedElement)null);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__TO:
				setTo((ENamedElement)null);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM:
				setSourceModelFrom((SourceModel)null);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO:
				setSourceModelTo((SourceModel)null);
				return;
			case SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT:
				setFeatureContext((FeatureContext)null);
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
			case SemanticContextPackage.CROSS_MODEL_LINK__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SemanticContextPackage.CROSS_MODEL_LINK__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case SemanticContextPackage.CROSS_MODEL_LINK__FROM:
				return basicGetFrom() != null;
			case SemanticContextPackage.CROSS_MODEL_LINK__TO:
				return basicGetTo() != null;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_FROM:
				return basicGetSourceModelFrom() != null;
			case SemanticContextPackage.CROSS_MODEL_LINK__SOURCE_MODEL_TO:
				return basicGetSourceModelTo() != null;
			case SemanticContextPackage.CROSS_MODEL_LINK__FEATURE_CONTEXT:
				return getFeatureContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //CrossModelLinkImpl
