/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes how a specific EClass or EDataType from a particular SourceModel is treated in the projected context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getFeatureContexts <em>Feature Contexts</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.ElementContext#getOperationContexts <em>Operation Contexts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext()
 * @model
 * @generated
 */
public interface ElementContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include this element in the projected context. Defaults to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_Include()
	 * @model default="true"
	 * @generated
	 */
	boolean isInclude();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#isInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #isInclude()
	 * @generated
	 */
	void setInclude(boolean value);

	/**
	 * Returns the value of the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional name to use for this element in the projected context instead of its source name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rename To</em>' attribute.
	 * @see #setRenameTo(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_RenameTo()
	 * @model
	 * @generated
	 */
	String getRenameTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#getRenameTo <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename To</em>' attribute.
	 * @see #getRenameTo()
	 * @generated
	 */
	void setRenameTo(String value);

	/**
	 * Returns the value of the '<em><b>Flatten</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to flatten the hierarchy of this element into its parent in the projected context. Defaults to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flatten</em>' attribute.
	 * @see #setFlatten(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_Flatten()
	 * @model default="false"
	 * @generated
	 */
	boolean isFlatten();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#isFlatten <em>Flatten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatten</em>' attribute.
	 * @see #isFlatten()
	 * @generated
	 */
	void setFlatten(boolean value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional documentation for this element context, overriding or supplementing source element documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source model from which the element originates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Model</em>' reference.
	 * @see #setSourceModel(SourceModel)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_SourceModel()
	 * @model required="true"
	 * @generated
	 */
	SourceModel getSourceModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#getSourceModel <em>Source Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' reference.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source EClass or EDataType from the source metamodel that this context applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ENamedElement)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_Source()
	 * @model required="true"
	 * @generated
	 */
	ENamedElement getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.ElementContext#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ENamedElement value);

	/**
	 * Returns the value of the '<em><b>Feature Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.FeatureContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Per-feature projection rules controlling visibility, renaming, and mapping of structural features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Contexts</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_FeatureContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureContext> getFeatureContexts();

	/**
	 * Returns the value of the '<em><b>Operation Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.semanticcontext.OperationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Per-operation projection rules controlling visibility and renaming of EOperations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Contexts</em>' containment reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getElementContext_OperationContexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationContext> getOperationContexts();

} // ElementContext
