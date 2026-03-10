/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Supports flattening, expansion, and type substitution of a source EClassifier within or across source models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.TypeMapping#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.TypeMapping#isFlatten <em>Flatten</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.TypeMapping#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.TypeMapping#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.TypeMapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping()
 * @model
 * @generated
 */
public interface TypeMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional name to use for the mapped type in the projected context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rename To</em>' attribute.
	 * @see #setRenameTo(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping_RenameTo()
	 * @model
	 * @generated
	 */
	String getRenameTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.TypeMapping#getRenameTo <em>Rename To</em>}' attribute.
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
	 * Whether to flatten this type's structure into its containing type during projection. Defaults to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flatten</em>' attribute.
	 * @see #setFlatten(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping_Flatten()
	 * @model default="false"
	 * @generated
	 */
	boolean isFlatten();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.TypeMapping#isFlatten <em>Flatten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flatten</em>' attribute.
	 * @see #isFlatten()
	 * @generated
	 */
	void setFlatten(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source model that contains the source type being mapped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Model</em>' reference.
	 * @see #setSourceModel(SourceModel)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping_SourceModel()
	 * @model required="true"
	 * @generated
	 */
	SourceModel getSourceModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.TypeMapping#getSourceModel <em>Source Model</em>}' reference.
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
	 * The source EClassifier (EClass or EDataType) being mapped or substituted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EClassifier)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping_Source()
	 * @model required="true"
	 * @generated
	 */
	EClassifier getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.TypeMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional target EClassifier to substitute for the source type in the projected context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EClassifier)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getTypeMapping_Target()
	 * @model
	 * @generated
	 */
	EClassifier getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.TypeMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EClassifier value);

} // TypeMapping
