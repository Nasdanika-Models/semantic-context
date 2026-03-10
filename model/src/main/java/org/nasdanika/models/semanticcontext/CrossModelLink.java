/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Model Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a semantic relationship between named elements from two different source models (e.g., JiraIssue to GitLabCommit).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelFrom <em>Source Model From</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelTo <em>Source Model To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFeatureContext <em>Feature Context</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink()
 * @model
 * @generated
 */
public interface CrossModelLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name identifying this cross-model link (e.g., 'issueToCommit').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional human-readable documentation describing the semantics of this cross-model link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source-side named element of this cross-model link (e.g., a JiraIssue EClass).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ENamedElement)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_From()
	 * @model required="true"
	 * @generated
	 */
	ENamedElement getFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ENamedElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target-side named element of this cross-model link (e.g., a GitLabCommit EClass).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ENamedElement)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_To()
	 * @model required="true"
	 * @generated
	 */
	ENamedElement getTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ENamedElement value);

	/**
	 * Returns the value of the '<em><b>Source Model From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source model that owns the 'from' element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Model From</em>' reference.
	 * @see #setSourceModelFrom(SourceModel)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_SourceModelFrom()
	 * @model required="true"
	 * @generated
	 */
	SourceModel getSourceModelFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelFrom <em>Source Model From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model From</em>' reference.
	 * @see #getSourceModelFrom()
	 * @generated
	 */
	void setSourceModelFrom(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Source Model To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source model that owns the 'to' element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Model To</em>' reference.
	 * @see #setSourceModelTo(SourceModel)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_SourceModelTo()
	 * @model required="true"
	 * @generated
	 */
	SourceModel getSourceModelTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelTo <em>Source Model To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model To</em>' reference.
	 * @see #getSourceModelTo()
	 * @generated
	 */
	void setSourceModelTo(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Feature Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional feature context used when this cross-model link is reified as a feature in the projected context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Context</em>' containment reference.
	 * @see #setFeatureContext(FeatureContext)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getCrossModelLink_FeatureContext()
	 * @model containment="true"
	 * @generated
	 */
	FeatureContext getFeatureContext();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFeatureContext <em>Feature Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Context</em>' containment reference.
	 * @see #getFeatureContext()
	 * @generated
	 */
	void setFeatureContext(FeatureContext value);

} // CrossModelLink
