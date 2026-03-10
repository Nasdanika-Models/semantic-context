/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a single source metamodel/model pair (e.g., Jira, GitLab) included in the projection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.semanticcontext.SourceModel#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.SourceModel#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.SourceModel#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link org.nasdanika.models.semanticcontext.SourceModel#getRootElements <em>Root Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getSourceModel()
 * @model
 * @generated
 */
public interface SourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical name identifying this source model (e.g., 'Jira', 'GitLab').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getSourceModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.SourceModel#getName <em>Name</em>}' attribute.
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
	 * Optional human-readable documentation for this source model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getSourceModel_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.SourceModel#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EPackage that defines the source metamodel for this source model entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(EPackage)
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getSourceModel_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	EPackage getMetamodel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.semanticcontext.SourceModel#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional root EObjects from the source model used for model-level projection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Elements</em>' reference list.
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#getSourceModel_RootElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getRootElements();

} // SourceModel
