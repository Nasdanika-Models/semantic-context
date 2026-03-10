/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Controls visibility, renaming, and mapping of a single EStructuralFeature in the projected context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.FeatureContext#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.FeatureContext#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.FeatureContext#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.FeatureContext#isFollowReference <em>Follow Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.FeatureContext#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext()
 * @model
 * @generated
 */
public interface FeatureContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include this feature in the projected context. Defaults to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext_Include()
	 * @model default="true"
	 * @generated
	 */
	boolean isInclude();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.FeatureContext#isInclude <em>Include</em>}' attribute.
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
	 * Optional name to use for this feature in the projected context instead of its source name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rename To</em>' attribute.
	 * @see #setRenameTo(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext_RenameTo()
	 * @model
	 * @generated
	 */
	String getRenameTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.FeatureContext#getRenameTo <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename To</em>' attribute.
	 * @see #getRenameTo()
	 * @generated
	 */
	void setRenameTo(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this feature is exposed as read-only in the projected context. Defaults to false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext_ReadOnly()
	 * @model default="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.FeatureContext#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Follow Reference</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to follow this reference during projection (traverse its target). Defaults to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Follow Reference</em>' attribute.
	 * @see #setFollowReference(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext_FollowReference()
	 * @model default="true"
	 * @generated
	 */
	boolean isFollowReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.FeatureContext#isFollowReference <em>Follow Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follow Reference</em>' attribute.
	 * @see #isFollowReference()
	 * @generated
	 */
	void setFollowReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source EStructuralFeature (EAttribute or EReference) from the source metamodel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EStructuralFeature)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getFeatureContext_Source()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.FeatureContext#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EStructuralFeature value);

} // FeatureContext
