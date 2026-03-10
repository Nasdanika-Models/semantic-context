/**
 */
package org.nasdanika.models.semanticcontext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.semanticcontext.ElementContext;
import org.nasdanika.models.semanticcontext.FeatureContext;
import org.nasdanika.models.semanticcontext.OperationContext;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getFeatureContexts <em>Feature Contexts</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl#getOperationContexts <em>Operation Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementContextImpl extends MinimalEObjectImpl.Container implements ElementContext {
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
	 * The default value of the '{@link #isFlatten() <em>Flatten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlatten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLATTEN_EDEFAULT = false;

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
	protected ElementContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.ELEMENT_CONTEXT;
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
		return (Boolean)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE, SemanticContextPackage.Literals.ELEMENT_CONTEXT__INCLUDE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(boolean newInclude) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE, SemanticContextPackage.Literals.ELEMENT_CONTEXT__INCLUDE, newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRenameTo() {
		return (String)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.ELEMENT_CONTEXT__RENAME_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameTo(String newRenameTo) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO, SemanticContextPackage.Literals.ELEMENT_CONTEXT__RENAME_TO, newRenameTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFlatten() {
		return (Boolean)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN, SemanticContextPackage.Literals.ELEMENT_CONTEXT__FLATTEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlatten(boolean newFlatten) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN, SemanticContextPackage.Literals.ELEMENT_CONTEXT__FLATTEN, newFlatten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return (String)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION, SemanticContextPackage.Literals.ELEMENT_CONTEXT__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION, SemanticContextPackage.Literals.ELEMENT_CONTEXT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModel getSourceModel() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetSourceModel() {
		return (SourceModel)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE_MODEL, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModel(SourceModel newSourceModel) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE_MODEL, newSourceModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENamedElement getSource() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement basicGetSource() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ENamedElement newSource) {
		eDynamicSet(SemanticContextPackage.ELEMENT_CONTEXT__SOURCE, SemanticContextPackage.Literals.ELEMENT_CONTEXT__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureContext> getFeatureContexts() {
		return (EList<FeatureContext>)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS, SemanticContextPackage.Literals.ELEMENT_CONTEXT__FEATURE_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OperationContext> getOperationContexts() {
		return (EList<OperationContext>)eDynamicGet(SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS, SemanticContextPackage.Literals.ELEMENT_CONTEXT__OPERATION_CONTEXTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS:
				return ((InternalEList<?>)getFeatureContexts()).basicRemove(otherEnd, msgs);
			case SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS:
				return ((InternalEList<?>)getOperationContexts()).basicRemove(otherEnd, msgs);
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
			case SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE:
				return isInclude();
			case SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO:
				return getRenameTo();
			case SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN:
				return isFlatten();
			case SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION:
				return getDocumentation();
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL:
				if (resolve) return getSourceModel();
				return basicGetSourceModel();
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS:
				return getFeatureContexts();
			case SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS:
				return getOperationContexts();
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
			case SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE:
				setInclude((Boolean)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO:
				setRenameTo((String)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN:
				setFlatten((Boolean)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL:
				setSourceModel((SourceModel)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE:
				setSource((ENamedElement)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS:
				getFeatureContexts().clear();
				getFeatureContexts().addAll((Collection<? extends FeatureContext>)newValue);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS:
				getOperationContexts().clear();
				getOperationContexts().addAll((Collection<? extends OperationContext>)newValue);
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
			case SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN:
				setFlatten(FLATTEN_EDEFAULT);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL:
				setSourceModel((SourceModel)null);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE:
				setSource((ENamedElement)null);
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS:
				getFeatureContexts().clear();
				return;
			case SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS:
				getOperationContexts().clear();
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
			case SemanticContextPackage.ELEMENT_CONTEXT__INCLUDE:
				return isInclude() != INCLUDE_EDEFAULT;
			case SemanticContextPackage.ELEMENT_CONTEXT__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? getRenameTo() != null : !RENAME_TO_EDEFAULT.equals(getRenameTo());
			case SemanticContextPackage.ELEMENT_CONTEXT__FLATTEN:
				return isFlatten() != FLATTEN_EDEFAULT;
			case SemanticContextPackage.ELEMENT_CONTEXT__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE_MODEL:
				return basicGetSourceModel() != null;
			case SemanticContextPackage.ELEMENT_CONTEXT__SOURCE:
				return basicGetSource() != null;
			case SemanticContextPackage.ELEMENT_CONTEXT__FEATURE_CONTEXTS:
				return !getFeatureContexts().isEmpty();
			case SemanticContextPackage.ELEMENT_CONTEXT__OPERATION_CONTEXTS:
				return !getOperationContexts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementContextImpl
