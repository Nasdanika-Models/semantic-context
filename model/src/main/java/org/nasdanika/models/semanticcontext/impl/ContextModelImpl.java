/**
 */
package org.nasdanika.models.semanticcontext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.semanticcontext.ContextModel;
import org.nasdanika.models.semanticcontext.CrossModelLink;
import org.nasdanika.models.semanticcontext.DriftRule;
import org.nasdanika.models.semanticcontext.ElementContext;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;
import org.nasdanika.models.semanticcontext.TypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getElementContexts <em>Element Contexts</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getCrossModelLinks <em>Cross Model Links</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl#getDriftRules <em>Drift Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextModelImpl extends MinimalEObjectImpl.Container implements ContextModel {
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
	protected ContextModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.CONTEXT_MODEL;
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
		return (String)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__NAME, SemanticContextPackage.Literals.CONTEXT_MODEL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(SemanticContextPackage.CONTEXT_MODEL__NAME, SemanticContextPackage.Literals.CONTEXT_MODEL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION, SemanticContextPackage.Literals.CONTEXT_MODEL__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION, SemanticContextPackage.Literals.CONTEXT_MODEL__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SourceModel> getSourceModels() {
		return (EList<SourceModel>)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS, SemanticContextPackage.Literals.CONTEXT_MODEL__SOURCE_MODELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ElementContext> getElementContexts() {
		return (EList<ElementContext>)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS, SemanticContextPackage.Literals.CONTEXT_MODEL__ELEMENT_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TypeMapping> getTypeMappings() {
		return (EList<TypeMapping>)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS, SemanticContextPackage.Literals.CONTEXT_MODEL__TYPE_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CrossModelLink> getCrossModelLinks() {
		return (EList<CrossModelLink>)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS, SemanticContextPackage.Literals.CONTEXT_MODEL__CROSS_MODEL_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DriftRule> getDriftRules() {
		return (EList<DriftRule>)eDynamicGet(SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES, SemanticContextPackage.Literals.CONTEXT_MODEL__DRIFT_RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS:
				return ((InternalEList<?>)getElementContexts()).basicRemove(otherEnd, msgs);
			case SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS:
				return ((InternalEList<?>)getTypeMappings()).basicRemove(otherEnd, msgs);
			case SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS:
				return ((InternalEList<?>)getCrossModelLinks()).basicRemove(otherEnd, msgs);
			case SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES:
				return ((InternalEList<?>)getDriftRules()).basicRemove(otherEnd, msgs);
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
			case SemanticContextPackage.CONTEXT_MODEL__NAME:
				return getName();
			case SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION:
				return getDocumentation();
			case SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS:
				return getSourceModels();
			case SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS:
				return getElementContexts();
			case SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS:
				return getTypeMappings();
			case SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS:
				return getCrossModelLinks();
			case SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES:
				return getDriftRules();
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
			case SemanticContextPackage.CONTEXT_MODEL__NAME:
				setName((String)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModel>)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS:
				getElementContexts().clear();
				getElementContexts().addAll((Collection<? extends ElementContext>)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS:
				getTypeMappings().clear();
				getTypeMappings().addAll((Collection<? extends TypeMapping>)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS:
				getCrossModelLinks().clear();
				getCrossModelLinks().addAll((Collection<? extends CrossModelLink>)newValue);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES:
				getDriftRules().clear();
				getDriftRules().addAll((Collection<? extends DriftRule>)newValue);
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
			case SemanticContextPackage.CONTEXT_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS:
				getElementContexts().clear();
				return;
			case SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS:
				getTypeMappings().clear();
				return;
			case SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS:
				getCrossModelLinks().clear();
				return;
			case SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES:
				getDriftRules().clear();
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
			case SemanticContextPackage.CONTEXT_MODEL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SemanticContextPackage.CONTEXT_MODEL__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case SemanticContextPackage.CONTEXT_MODEL__SOURCE_MODELS:
				return !getSourceModels().isEmpty();
			case SemanticContextPackage.CONTEXT_MODEL__ELEMENT_CONTEXTS:
				return !getElementContexts().isEmpty();
			case SemanticContextPackage.CONTEXT_MODEL__TYPE_MAPPINGS:
				return !getTypeMappings().isEmpty();
			case SemanticContextPackage.CONTEXT_MODEL__CROSS_MODEL_LINKS:
				return !getCrossModelLinks().isEmpty();
			case SemanticContextPackage.CONTEXT_MODEL__DRIFT_RULES:
				return !getDriftRules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextModelImpl
