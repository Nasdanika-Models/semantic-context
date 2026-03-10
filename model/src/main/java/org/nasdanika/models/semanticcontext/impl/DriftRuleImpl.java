/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.semanticcontext.DriftRule;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drift Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl#getOnMissingElement <em>On Missing Element</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl#getOnChangedType <em>On Changed Type</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl#getOnChangedCardinality <em>On Changed Cardinality</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriftRuleImpl extends MinimalEObjectImpl.Container implements DriftRule {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnMissingElement() <em>On Missing Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnMissingElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_MISSING_ELEMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnChangedType() <em>On Changed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChangedType()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CHANGED_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnChangedCardinality() <em>On Changed Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChangedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CHANGED_CARDINALITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriftRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticContextPackage.Literals.DRIFT_RULE;
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
	public String getSeverity() {
		return (String)eDynamicGet(SemanticContextPackage.DRIFT_RULE__SEVERITY, SemanticContextPackage.Literals.DRIFT_RULE__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(String newSeverity) {
		eDynamicSet(SemanticContextPackage.DRIFT_RULE__SEVERITY, SemanticContextPackage.Literals.DRIFT_RULE__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnMissingElement() {
		return (String)eDynamicGet(SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT, SemanticContextPackage.Literals.DRIFT_RULE__ON_MISSING_ELEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnMissingElement(String newOnMissingElement) {
		eDynamicSet(SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT, SemanticContextPackage.Literals.DRIFT_RULE__ON_MISSING_ELEMENT, newOnMissingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnChangedType() {
		return (String)eDynamicGet(SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE, SemanticContextPackage.Literals.DRIFT_RULE__ON_CHANGED_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChangedType(String newOnChangedType) {
		eDynamicSet(SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE, SemanticContextPackage.Literals.DRIFT_RULE__ON_CHANGED_TYPE, newOnChangedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnChangedCardinality() {
		return (String)eDynamicGet(SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY, SemanticContextPackage.Literals.DRIFT_RULE__ON_CHANGED_CARDINALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChangedCardinality(String newOnChangedCardinality) {
		eDynamicSet(SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY, SemanticContextPackage.Literals.DRIFT_RULE__ON_CHANGED_CARDINALITY, newOnChangedCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENamedElement getTarget() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.DRIFT_RULE__TARGET, SemanticContextPackage.Literals.DRIFT_RULE__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENamedElement basicGetTarget() {
		return (ENamedElement)eDynamicGet(SemanticContextPackage.DRIFT_RULE__TARGET, SemanticContextPackage.Literals.DRIFT_RULE__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ENamedElement newTarget) {
		eDynamicSet(SemanticContextPackage.DRIFT_RULE__TARGET, SemanticContextPackage.Literals.DRIFT_RULE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticContextPackage.DRIFT_RULE__SEVERITY:
				return getSeverity();
			case SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT:
				return getOnMissingElement();
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE:
				return getOnChangedType();
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY:
				return getOnChangedCardinality();
			case SemanticContextPackage.DRIFT_RULE__TARGET:
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
			case SemanticContextPackage.DRIFT_RULE__SEVERITY:
				setSeverity((String)newValue);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT:
				setOnMissingElement((String)newValue);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE:
				setOnChangedType((String)newValue);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY:
				setOnChangedCardinality((String)newValue);
				return;
			case SemanticContextPackage.DRIFT_RULE__TARGET:
				setTarget((ENamedElement)newValue);
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
			case SemanticContextPackage.DRIFT_RULE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT:
				setOnMissingElement(ON_MISSING_ELEMENT_EDEFAULT);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE:
				setOnChangedType(ON_CHANGED_TYPE_EDEFAULT);
				return;
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY:
				setOnChangedCardinality(ON_CHANGED_CARDINALITY_EDEFAULT);
				return;
			case SemanticContextPackage.DRIFT_RULE__TARGET:
				setTarget((ENamedElement)null);
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
			case SemanticContextPackage.DRIFT_RULE__SEVERITY:
				return SEVERITY_EDEFAULT == null ? getSeverity() != null : !SEVERITY_EDEFAULT.equals(getSeverity());
			case SemanticContextPackage.DRIFT_RULE__ON_MISSING_ELEMENT:
				return ON_MISSING_ELEMENT_EDEFAULT == null ? getOnMissingElement() != null : !ON_MISSING_ELEMENT_EDEFAULT.equals(getOnMissingElement());
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_TYPE:
				return ON_CHANGED_TYPE_EDEFAULT == null ? getOnChangedType() != null : !ON_CHANGED_TYPE_EDEFAULT.equals(getOnChangedType());
			case SemanticContextPackage.DRIFT_RULE__ON_CHANGED_CARDINALITY:
				return ON_CHANGED_CARDINALITY_EDEFAULT == null ? getOnChangedCardinality() != null : !ON_CHANGED_CARDINALITY_EDEFAULT.equals(getOnChangedCardinality());
			case SemanticContextPackage.DRIFT_RULE__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //DriftRuleImpl
