/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drift Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines how to detect and handle changes in upstream source models (semantic drift) for a specific SCM element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.DriftRule#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.DriftRule#getOnMissingElement <em>On Missing Element</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedType <em>On Changed Type</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedCardinality <em>On Changed Cardinality</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.DriftRule#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule()
 * @model
 * @generated
 */
public interface DriftRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Overall severity of drift detection for this element. One of: 'warning', 'error', 'ignore'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.DriftRule#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>On Missing Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take when the source element is missing in a newer version of the source model. One of: 'fail', 'skip', 'suggest'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Missing Element</em>' attribute.
	 * @see #setOnMissingElement(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule_OnMissingElement()
	 * @model
	 * @generated
	 */
	String getOnMissingElement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnMissingElement <em>On Missing Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Missing Element</em>' attribute.
	 * @see #getOnMissingElement()
	 * @generated
	 */
	void setOnMissingElement(String value);

	/**
	 * Returns the value of the '<em><b>On Changed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take when the type of the source element has changed in a newer version of the source model. One of: 'fail', 'skip', 'suggest'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Changed Type</em>' attribute.
	 * @see #setOnChangedType(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule_OnChangedType()
	 * @model
	 * @generated
	 */
	String getOnChangedType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedType <em>On Changed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Changed Type</em>' attribute.
	 * @see #getOnChangedType()
	 * @generated
	 */
	void setOnChangedType(String value);

	/**
	 * Returns the value of the '<em><b>On Changed Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take when the cardinality of the source element has changed in a newer version of the source model. One of: 'fail', 'skip', 'suggest'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Changed Cardinality</em>' attribute.
	 * @see #setOnChangedCardinality(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule_OnChangedCardinality()
	 * @model
	 * @generated
	 */
	String getOnChangedCardinality();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedCardinality <em>On Changed Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Changed Cardinality</em>' attribute.
	 * @see #getOnChangedCardinality()
	 * @generated
	 */
	void setOnChangedCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SCM element (ENamedElement) to which this drift rule applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ENamedElement)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getDriftRule_Target()
	 * @model required="true"
	 * @generated
	 */
	ENamedElement getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.DriftRule#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ENamedElement value);

} // DriftRule
