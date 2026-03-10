/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root element of the Semantic Context Model. Owns all source model references, element contexts, type mappings, cross-model links, and drift rules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getElementContexts <em>Element Contexts</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getCrossModelLinks <em>Cross Model Links</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ContextModel#getDriftRules <em>Drift Rules</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of this Semantic Context Model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ContextModel#getName <em>Name</em>}' attribute.
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
	 * Optional human-readable documentation for this context model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ContextModel#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.SourceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more source metamodel/model pairs (e.g., Jira, GitLab) that are projected into this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_SourceModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceModel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Element Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.ElementContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Per-element projection rules describing how EClass or EDataType instances from source models are treated in this context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Contexts</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_ElementContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementContext> getElementContexts();

	/**
	 * Returns the value of the '<em><b>Type Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.TypeMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type-level projection rules supporting flattening, expansion, and type substitution across source models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Mappings</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_TypeMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeMapping> getTypeMappings();

	/**
	 * Returns the value of the '<em><b>Cross Model Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.CrossModelLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semantic relationships between elements from different source models (e.g., JiraIssue to GitLabCommit).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Model Links</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_CrossModelLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossModelLink> getCrossModelLinks();

	/**
	 * Returns the value of the '<em><b>Drift Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.DriftRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rules describing how to detect and handle upstream model changes (drift).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drift Rules</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getContextModel_DriftRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<DriftRule> getDriftRules();

} // ContextModel
