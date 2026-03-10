/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Controls visibility and renaming of a single EOperation in the projected context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.OperationContext#isInclude <em>Include</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.OperationContext#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.OperationContext#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getOperationContext()
 * @model
 * @generated
 */
public interface OperationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include this operation in the projected context. Defaults to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(boolean)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getOperationContext_Include()
	 * @model default="true"
	 * @generated
	 */
	boolean isInclude();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.OperationContext#isInclude <em>Include</em>}' attribute.
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
	 * Optional name to use for this operation in the projected context instead of its source name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rename To</em>' attribute.
	 * @see #setRenameTo(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getOperationContext_RenameTo()
	 * @model
	 * @generated
	 */
	String getRenameTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.OperationContext#getRenameTo <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rename To</em>' attribute.
	 * @see #getRenameTo()
	 * @generated
	 */
	void setRenameTo(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source EOperation from the source metamodel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EOperation)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getOperationContext_Source()
	 * @model required="true"
	 * @generated
	 */
	EOperation getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.OperationContext#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EOperation value);

} // OperationContext
