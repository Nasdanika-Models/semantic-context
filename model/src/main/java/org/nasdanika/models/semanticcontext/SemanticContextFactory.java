/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage
 * @generated
 */
public interface SemanticContextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticContextFactory eINSTANCE = org.nasdanika.models.semanticcontext.impl.SemanticContextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Model</em>'.
	 * @generated
	 */
	ContextModel createContextModel();

	/**
	 * Returns a new object of class '<em>Source Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Model</em>'.
	 * @generated
	 */
	SourceModel createSourceModel();

	/**
	 * Returns a new object of class '<em>Element Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Context</em>'.
	 * @generated
	 */
	ElementContext createElementContext();

	/**
	 * Returns a new object of class '<em>Feature Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Context</em>'.
	 * @generated
	 */
	FeatureContext createFeatureContext();

	/**
	 * Returns a new object of class '<em>Operation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Context</em>'.
	 * @generated
	 */
	OperationContext createOperationContext();

	/**
	 * Returns a new object of class '<em>Type Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Mapping</em>'.
	 * @generated
	 */
	TypeMapping createTypeMapping();

	/**
	 * Returns a new object of class '<em>Cross Model Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Model Link</em>'.
	 * @generated
	 */
	CrossModelLink createCrossModelLink();

	/**
	 * Returns a new object of class '<em>Drift Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drift Rule</em>'.
	 * @generated
	 */
	DriftRule createDriftRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemanticContextPackage getSemanticContextPackage();

} //SemanticContextFactory
