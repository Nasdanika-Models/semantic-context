/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.semanticcontext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticContextFactoryImpl extends EFactoryImpl implements SemanticContextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticContextFactory init() {
		try {
			SemanticContextFactory theSemanticContextFactory = (SemanticContextFactory)EPackage.Registry.INSTANCE.getEFactory(SemanticContextPackage.eNS_URI);
			if (theSemanticContextFactory != null) {
				return theSemanticContextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticContextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticContextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SemanticContextPackage.CONTEXT_MODEL: return createContextModel();
			case SemanticContextPackage.SOURCE_MODEL: return createSourceModel();
			case SemanticContextPackage.ELEMENT_CONTEXT: return createElementContext();
			case SemanticContextPackage.FEATURE_CONTEXT: return createFeatureContext();
			case SemanticContextPackage.OPERATION_CONTEXT: return createOperationContext();
			case SemanticContextPackage.TYPE_MAPPING: return createTypeMapping();
			case SemanticContextPackage.CROSS_MODEL_LINK: return createCrossModelLink();
			case SemanticContextPackage.DRIFT_RULE: return createDriftRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextModel createContextModel() {
		ContextModelImpl contextModel = new ContextModelImpl();
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceModel createSourceModel() {
		SourceModelImpl sourceModel = new SourceModelImpl();
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementContext createElementContext() {
		ElementContextImpl elementContext = new ElementContextImpl();
		return elementContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureContext createFeatureContext() {
		FeatureContextImpl featureContext = new FeatureContextImpl();
		return featureContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationContext createOperationContext() {
		OperationContextImpl operationContext = new OperationContextImpl();
		return operationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeMapping createTypeMapping() {
		TypeMappingImpl typeMapping = new TypeMappingImpl();
		return typeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossModelLink createCrossModelLink() {
		CrossModelLinkImpl crossModelLink = new CrossModelLinkImpl();
		return crossModelLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DriftRule createDriftRule() {
		DriftRuleImpl driftRule = new DriftRuleImpl();
		return driftRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticContextPackage getSemanticContextPackage() {
		return (SemanticContextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticContextPackage getPackage() {
		return SemanticContextPackage.eINSTANCE;
	}

} //SemanticContextFactoryImpl
