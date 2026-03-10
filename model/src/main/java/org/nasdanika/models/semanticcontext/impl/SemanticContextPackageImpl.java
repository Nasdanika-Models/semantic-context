/**
 */
package org.nasdanika.models.semanticcontext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.semanticcontext.ContextModel;
import org.nasdanika.models.semanticcontext.CrossModelLink;
import org.nasdanika.models.semanticcontext.DriftRule;
import org.nasdanika.models.semanticcontext.ElementContext;
import org.nasdanika.models.semanticcontext.FeatureContext;
import org.nasdanika.models.semanticcontext.OperationContext;
import org.nasdanika.models.semanticcontext.SemanticContextFactory;
import org.nasdanika.models.semanticcontext.SemanticContextPackage;
import org.nasdanika.models.semanticcontext.SourceModel;
import org.nasdanika.models.semanticcontext.TypeMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticContextPackageImpl extends EPackageImpl implements SemanticContextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossModelLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driftRuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.semanticcontext.SemanticContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticContextPackageImpl() {
		super(eNS_URI, SemanticContextFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SemanticContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticContextPackage init() {
		if (isInited) return (SemanticContextPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticContextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemanticContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemanticContextPackageImpl theSemanticContextPackage = registeredSemanticContextPackage instanceof SemanticContextPackageImpl ? (SemanticContextPackageImpl)registeredSemanticContextPackage : new SemanticContextPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSemanticContextPackage.createPackageContents();

		// Initialize created meta-data
		theSemanticContextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticContextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticContextPackage.eNS_URI, theSemanticContextPackage);
		return theSemanticContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextModel() {
		return contextModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextModel_Name() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextModel_Documentation() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextModel_SourceModels() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextModel_ElementContexts() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextModel_TypeMappings() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextModel_CrossModelLinks() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextModel_DriftRules() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceModel() {
		return sourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceModel_Name() {
		return (EAttribute)sourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceModel_Documentation() {
		return (EAttribute)sourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceModel_Metamodel() {
		return (EReference)sourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSourceModel_RootElements() {
		return (EReference)sourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementContext() {
		return elementContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementContext_Include() {
		return (EAttribute)elementContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementContext_RenameTo() {
		return (EAttribute)elementContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementContext_Flatten() {
		return (EAttribute)elementContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementContext_Documentation() {
		return (EAttribute)elementContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementContext_SourceModel() {
		return (EReference)elementContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementContext_Source() {
		return (EReference)elementContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementContext_FeatureContexts() {
		return (EReference)elementContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementContext_OperationContexts() {
		return (EReference)elementContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureContext() {
		return featureContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureContext_Include() {
		return (EAttribute)featureContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureContext_RenameTo() {
		return (EAttribute)featureContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureContext_ReadOnly() {
		return (EAttribute)featureContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureContext_FollowReference() {
		return (EAttribute)featureContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureContext_Source() {
		return (EReference)featureContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationContext() {
		return operationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationContext_Include() {
		return (EAttribute)operationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationContext_RenameTo() {
		return (EAttribute)operationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationContext_Source() {
		return (EReference)operationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeMapping() {
		return typeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeMapping_RenameTo() {
		return (EAttribute)typeMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeMapping_Flatten() {
		return (EAttribute)typeMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeMapping_SourceModel() {
		return (EReference)typeMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeMapping_Source() {
		return (EReference)typeMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeMapping_Target() {
		return (EReference)typeMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrossModelLink() {
		return crossModelLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossModelLink_Name() {
		return (EAttribute)crossModelLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrossModelLink_Documentation() {
		return (EAttribute)crossModelLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossModelLink_From() {
		return (EReference)crossModelLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossModelLink_To() {
		return (EReference)crossModelLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossModelLink_SourceModelFrom() {
		return (EReference)crossModelLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossModelLink_SourceModelTo() {
		return (EReference)crossModelLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrossModelLink_FeatureContext() {
		return (EReference)crossModelLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDriftRule() {
		return driftRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriftRule_Severity() {
		return (EAttribute)driftRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriftRule_OnMissingElement() {
		return (EAttribute)driftRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriftRule_OnChangedType() {
		return (EAttribute)driftRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDriftRule_OnChangedCardinality() {
		return (EAttribute)driftRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDriftRule_Target() {
		return (EReference)driftRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemanticContextFactory getSemanticContextFactory() {
		return (SemanticContextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contextModelEClass = createEClass(CONTEXT_MODEL);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__NAME);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__DOCUMENTATION);
		createEReference(contextModelEClass, CONTEXT_MODEL__SOURCE_MODELS);
		createEReference(contextModelEClass, CONTEXT_MODEL__ELEMENT_CONTEXTS);
		createEReference(contextModelEClass, CONTEXT_MODEL__TYPE_MAPPINGS);
		createEReference(contextModelEClass, CONTEXT_MODEL__CROSS_MODEL_LINKS);
		createEReference(contextModelEClass, CONTEXT_MODEL__DRIFT_RULES);

		sourceModelEClass = createEClass(SOURCE_MODEL);
		createEAttribute(sourceModelEClass, SOURCE_MODEL__NAME);
		createEAttribute(sourceModelEClass, SOURCE_MODEL__DOCUMENTATION);
		createEReference(sourceModelEClass, SOURCE_MODEL__METAMODEL);
		createEReference(sourceModelEClass, SOURCE_MODEL__ROOT_ELEMENTS);

		elementContextEClass = createEClass(ELEMENT_CONTEXT);
		createEAttribute(elementContextEClass, ELEMENT_CONTEXT__INCLUDE);
		createEAttribute(elementContextEClass, ELEMENT_CONTEXT__RENAME_TO);
		createEAttribute(elementContextEClass, ELEMENT_CONTEXT__FLATTEN);
		createEAttribute(elementContextEClass, ELEMENT_CONTEXT__DOCUMENTATION);
		createEReference(elementContextEClass, ELEMENT_CONTEXT__SOURCE_MODEL);
		createEReference(elementContextEClass, ELEMENT_CONTEXT__SOURCE);
		createEReference(elementContextEClass, ELEMENT_CONTEXT__FEATURE_CONTEXTS);
		createEReference(elementContextEClass, ELEMENT_CONTEXT__OPERATION_CONTEXTS);

		featureContextEClass = createEClass(FEATURE_CONTEXT);
		createEAttribute(featureContextEClass, FEATURE_CONTEXT__INCLUDE);
		createEAttribute(featureContextEClass, FEATURE_CONTEXT__RENAME_TO);
		createEAttribute(featureContextEClass, FEATURE_CONTEXT__READ_ONLY);
		createEAttribute(featureContextEClass, FEATURE_CONTEXT__FOLLOW_REFERENCE);
		createEReference(featureContextEClass, FEATURE_CONTEXT__SOURCE);

		operationContextEClass = createEClass(OPERATION_CONTEXT);
		createEAttribute(operationContextEClass, OPERATION_CONTEXT__INCLUDE);
		createEAttribute(operationContextEClass, OPERATION_CONTEXT__RENAME_TO);
		createEReference(operationContextEClass, OPERATION_CONTEXT__SOURCE);

		typeMappingEClass = createEClass(TYPE_MAPPING);
		createEAttribute(typeMappingEClass, TYPE_MAPPING__RENAME_TO);
		createEAttribute(typeMappingEClass, TYPE_MAPPING__FLATTEN);
		createEReference(typeMappingEClass, TYPE_MAPPING__SOURCE_MODEL);
		createEReference(typeMappingEClass, TYPE_MAPPING__SOURCE);
		createEReference(typeMappingEClass, TYPE_MAPPING__TARGET);

		crossModelLinkEClass = createEClass(CROSS_MODEL_LINK);
		createEAttribute(crossModelLinkEClass, CROSS_MODEL_LINK__NAME);
		createEAttribute(crossModelLinkEClass, CROSS_MODEL_LINK__DOCUMENTATION);
		createEReference(crossModelLinkEClass, CROSS_MODEL_LINK__FROM);
		createEReference(crossModelLinkEClass, CROSS_MODEL_LINK__TO);
		createEReference(crossModelLinkEClass, CROSS_MODEL_LINK__SOURCE_MODEL_FROM);
		createEReference(crossModelLinkEClass, CROSS_MODEL_LINK__SOURCE_MODEL_TO);
		createEReference(crossModelLinkEClass, CROSS_MODEL_LINK__FEATURE_CONTEXT);

		driftRuleEClass = createEClass(DRIFT_RULE);
		createEAttribute(driftRuleEClass, DRIFT_RULE__SEVERITY);
		createEAttribute(driftRuleEClass, DRIFT_RULE__ON_MISSING_ELEMENT);
		createEAttribute(driftRuleEClass, DRIFT_RULE__ON_CHANGED_TYPE);
		createEAttribute(driftRuleEClass, DRIFT_RULE__ON_CHANGED_CARDINALITY);
		createEReference(driftRuleEClass, DRIFT_RULE__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contextModelEClass, ContextModel.class, "ContextModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_SourceModels(), this.getSourceModel(), null, "sourceModels", null, 1, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_ElementContexts(), this.getElementContext(), null, "elementContexts", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_TypeMappings(), this.getTypeMapping(), null, "typeMappings", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_CrossModelLinks(), this.getCrossModelLink(), null, "crossModelLinks", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_DriftRules(), this.getDriftRule(), null, "driftRules", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceModelEClass, SourceModel.class, "SourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceModel_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, SourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceModel_Metamodel(), ecorePackage.getEPackage(), null, "metamodel", null, 1, 1, SourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSourceModel_RootElements(), ecorePackage.getEObject(), null, "rootElements", null, 0, -1, SourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementContextEClass, ElementContext.class, "ElementContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementContext_Include(), ecorePackage.getEBoolean(), "include", "true", 0, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementContext_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementContext_Flatten(), ecorePackage.getEBoolean(), "flatten", "false", 0, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementContext_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementContext_SourceModel(), this.getSourceModel(), null, "sourceModel", null, 1, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementContext_Source(), ecorePackage.getENamedElement(), null, "source", null, 1, 1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementContext_FeatureContexts(), this.getFeatureContext(), null, "featureContexts", null, 0, -1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementContext_OperationContexts(), this.getOperationContext(), null, "operationContexts", null, 0, -1, ElementContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureContextEClass, FeatureContext.class, "FeatureContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureContext_Include(), ecorePackage.getEBoolean(), "include", "true", 0, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureContext_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureContext_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "false", 0, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureContext_FollowReference(), ecorePackage.getEBoolean(), "followReference", "true", 0, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureContext_Source(), ecorePackage.getEStructuralFeature(), null, "source", null, 1, 1, FeatureContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationContextEClass, OperationContext.class, "OperationContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationContext_Include(), ecorePackage.getEBoolean(), "include", "true", 0, 1, OperationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationContext_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, OperationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationContext_Source(), ecorePackage.getEOperation(), null, "source", null, 1, 1, OperationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMappingEClass, TypeMapping.class, "TypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeMapping_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMapping_Flatten(), ecorePackage.getEBoolean(), "flatten", "false", 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMapping_SourceModel(), this.getSourceModel(), null, "sourceModel", null, 1, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMapping_Source(), ecorePackage.getEClassifier(), null, "source", null, 1, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMapping_Target(), ecorePackage.getEClassifier(), null, "target", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crossModelLinkEClass, CrossModelLink.class, "CrossModelLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossModelLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrossModelLink_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossModelLink_From(), ecorePackage.getENamedElement(), null, "from", null, 1, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossModelLink_To(), ecorePackage.getENamedElement(), null, "to", null, 1, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossModelLink_SourceModelFrom(), this.getSourceModel(), null, "sourceModelFrom", null, 1, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossModelLink_SourceModelTo(), this.getSourceModel(), null, "sourceModelTo", null, 1, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrossModelLink_FeatureContext(), this.getFeatureContext(), null, "featureContext", null, 0, 1, CrossModelLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driftRuleEClass, DriftRule.class, "DriftRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriftRule_Severity(), ecorePackage.getEString(), "severity", null, 0, 1, DriftRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriftRule_OnMissingElement(), ecorePackage.getEString(), "onMissingElement", null, 0, 1, DriftRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriftRule_OnChangedType(), ecorePackage.getEString(), "onChangedType", null, 0, 1, DriftRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriftRule_OnChangedCardinality(), ecorePackage.getEString(), "onChangedCardinality", null, 0, 1, DriftRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriftRule_Target(), ecorePackage.getENamedElement(), null, "target", null, 1, 1, DriftRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (contextModelEClass,
		   source,
		   new String[] {
			   "documentation", "Root element of the Semantic Context Model. Owns all source model references, element contexts, type mappings, cross-model links, and drift rules."
		   });
		addAnnotation
		  (getContextModel_Name(),
		   source,
		   new String[] {
			   "documentation", "Name of this Semantic Context Model."
		   });
		addAnnotation
		  (getContextModel_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Optional human-readable documentation for this context model."
		   });
		addAnnotation
		  (getContextModel_SourceModels(),
		   source,
		   new String[] {
			   "documentation", "One or more source metamodel/model pairs (e.g., Jira, GitLab) that are projected into this context."
		   });
		addAnnotation
		  (getContextModel_ElementContexts(),
		   source,
		   new String[] {
			   "documentation", "Per-element projection rules describing how EClass or EDataType instances from source models are treated in this context."
		   });
		addAnnotation
		  (getContextModel_TypeMappings(),
		   source,
		   new String[] {
			   "documentation", "Type-level projection rules supporting flattening, expansion, and type substitution across source models."
		   });
		addAnnotation
		  (getContextModel_CrossModelLinks(),
		   source,
		   new String[] {
			   "documentation", "Semantic relationships between elements from different source models (e.g., JiraIssue to GitLabCommit)."
		   });
		addAnnotation
		  (getContextModel_DriftRules(),
		   source,
		   new String[] {
			   "documentation", "Rules describing how to detect and handle upstream model changes (drift)."
		   });
		addAnnotation
		  (sourceModelEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a single source metamodel/model pair (e.g., Jira, GitLab) included in the projection."
		   });
		addAnnotation
		  (getSourceModel_Name(),
		   source,
		   new String[] {
			   "documentation", "Logical name identifying this source model (e.g., \'Jira\', \'GitLab\')."
		   });
		addAnnotation
		  (getSourceModel_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Optional human-readable documentation for this source model."
		   });
		addAnnotation
		  (getSourceModel_Metamodel(),
		   source,
		   new String[] {
			   "documentation", "The EPackage that defines the source metamodel for this source model entry."
		   });
		addAnnotation
		  (getSourceModel_RootElements(),
		   source,
		   new String[] {
			   "documentation", "Optional root EObjects from the source model used for model-level projection."
		   });
		addAnnotation
		  (elementContextEClass,
		   source,
		   new String[] {
			   "documentation", "Describes how a specific EClass or EDataType from a particular SourceModel is treated in the projected context."
		   });
		addAnnotation
		  (getElementContext_Include(),
		   source,
		   new String[] {
			   "documentation", "Whether to include this element in the projected context. Defaults to true."
		   });
		addAnnotation
		  (getElementContext_RenameTo(),
		   source,
		   new String[] {
			   "documentation", "Optional name to use for this element in the projected context instead of its source name."
		   });
		addAnnotation
		  (getElementContext_Flatten(),
		   source,
		   new String[] {
			   "documentation", "Whether to flatten the hierarchy of this element into its parent in the projected context. Defaults to false."
		   });
		addAnnotation
		  (getElementContext_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Optional documentation for this element context, overriding or supplementing source element documentation."
		   });
		addAnnotation
		  (getElementContext_SourceModel(),
		   source,
		   new String[] {
			   "documentation", "The source model from which the element originates."
		   });
		addAnnotation
		  (getElementContext_Source(),
		   source,
		   new String[] {
			   "documentation", "The source EClass or EDataType from the source metamodel that this context applies to."
		   });
		addAnnotation
		  (getElementContext_FeatureContexts(),
		   source,
		   new String[] {
			   "documentation", "Per-feature projection rules controlling visibility, renaming, and mapping of structural features."
		   });
		addAnnotation
		  (getElementContext_OperationContexts(),
		   source,
		   new String[] {
			   "documentation", "Per-operation projection rules controlling visibility and renaming of EOperations."
		   });
		addAnnotation
		  (featureContextEClass,
		   source,
		   new String[] {
			   "documentation", "Controls visibility, renaming, and mapping of a single EStructuralFeature in the projected context."
		   });
		addAnnotation
		  (getFeatureContext_Include(),
		   source,
		   new String[] {
			   "documentation", "Whether to include this feature in the projected context. Defaults to true."
		   });
		addAnnotation
		  (getFeatureContext_RenameTo(),
		   source,
		   new String[] {
			   "documentation", "Optional name to use for this feature in the projected context instead of its source name."
		   });
		addAnnotation
		  (getFeatureContext_ReadOnly(),
		   source,
		   new String[] {
			   "documentation", "Whether this feature is exposed as read-only in the projected context. Defaults to false."
		   });
		addAnnotation
		  (getFeatureContext_FollowReference(),
		   source,
		   new String[] {
			   "documentation", "Whether to follow this reference during projection (traverse its target). Defaults to true."
		   });
		addAnnotation
		  (getFeatureContext_Source(),
		   source,
		   new String[] {
			   "documentation", "The source EStructuralFeature (EAttribute or EReference) from the source metamodel."
		   });
		addAnnotation
		  (operationContextEClass,
		   source,
		   new String[] {
			   "documentation", "Controls visibility and renaming of a single EOperation in the projected context."
		   });
		addAnnotation
		  (getOperationContext_Include(),
		   source,
		   new String[] {
			   "documentation", "Whether to include this operation in the projected context. Defaults to true."
		   });
		addAnnotation
		  (getOperationContext_RenameTo(),
		   source,
		   new String[] {
			   "documentation", "Optional name to use for this operation in the projected context instead of its source name."
		   });
		addAnnotation
		  (getOperationContext_Source(),
		   source,
		   new String[] {
			   "documentation", "The source EOperation from the source metamodel."
		   });
		addAnnotation
		  (typeMappingEClass,
		   source,
		   new String[] {
			   "documentation", "Supports flattening, expansion, and type substitution of a source EClassifier within or across source models."
		   });
		addAnnotation
		  (getTypeMapping_RenameTo(),
		   source,
		   new String[] {
			   "documentation", "Optional name to use for the mapped type in the projected context."
		   });
		addAnnotation
		  (getTypeMapping_Flatten(),
		   source,
		   new String[] {
			   "documentation", "Whether to flatten this type\'s structure into its containing type during projection. Defaults to false."
		   });
		addAnnotation
		  (getTypeMapping_SourceModel(),
		   source,
		   new String[] {
			   "documentation", "The source model that contains the source type being mapped."
		   });
		addAnnotation
		  (getTypeMapping_Source(),
		   source,
		   new String[] {
			   "documentation", "The source EClassifier (EClass or EDataType) being mapped or substituted."
		   });
		addAnnotation
		  (getTypeMapping_Target(),
		   source,
		   new String[] {
			   "documentation", "Optional target EClassifier to substitute for the source type in the projected context."
		   });
		addAnnotation
		  (crossModelLinkEClass,
		   source,
		   new String[] {
			   "documentation", "Defines a semantic relationship between named elements from two different source models (e.g., JiraIssue to GitLabCommit)."
		   });
		addAnnotation
		  (getCrossModelLink_Name(),
		   source,
		   new String[] {
			   "documentation", "Name identifying this cross-model link (e.g., \'issueToCommit\')."
		   });
		addAnnotation
		  (getCrossModelLink_Documentation(),
		   source,
		   new String[] {
			   "documentation", "Optional human-readable documentation describing the semantics of this cross-model link."
		   });
		addAnnotation
		  (getCrossModelLink_From(),
		   source,
		   new String[] {
			   "documentation", "The source-side named element of this cross-model link (e.g., a JiraIssue EClass)."
		   });
		addAnnotation
		  (getCrossModelLink_To(),
		   source,
		   new String[] {
			   "documentation", "The target-side named element of this cross-model link (e.g., a GitLabCommit EClass)."
		   });
		addAnnotation
		  (getCrossModelLink_SourceModelFrom(),
		   source,
		   new String[] {
			   "documentation", "The source model that owns the \'from\' element."
		   });
		addAnnotation
		  (getCrossModelLink_SourceModelTo(),
		   source,
		   new String[] {
			   "documentation", "The source model that owns the \'to\' element."
		   });
		addAnnotation
		  (getCrossModelLink_FeatureContext(),
		   source,
		   new String[] {
			   "documentation", "Optional feature context used when this cross-model link is reified as a feature in the projected context."
		   });
		addAnnotation
		  (driftRuleEClass,
		   source,
		   new String[] {
			   "documentation", "Defines how to detect and handle changes in upstream source models (semantic drift) for a specific SCM element."
		   });
		addAnnotation
		  (getDriftRule_Severity(),
		   source,
		   new String[] {
			   "documentation", "Overall severity of drift detection for this element. One of: \'warning\', \'error\', \'ignore\'."
		   });
		addAnnotation
		  (getDriftRule_OnMissingElement(),
		   source,
		   new String[] {
			   "documentation", "Action to take when the source element is missing in a newer version of the source model. One of: \'fail\', \'skip\', \'suggest\'."
		   });
		addAnnotation
		  (getDriftRule_OnChangedType(),
		   source,
		   new String[] {
			   "documentation", "Action to take when the type of the source element has changed in a newer version of the source model. One of: \'fail\', \'skip\', \'suggest\'."
		   });
		addAnnotation
		  (getDriftRule_OnChangedCardinality(),
		   source,
		   new String[] {
			   "documentation", "Action to take when the cardinality of the source element has changed in a newer version of the source model. One of: \'fail\', \'skip\', \'suggest\'."
		   });
		addAnnotation
		  (getDriftRule_Target(),
		   source,
		   new String[] {
			   "documentation", "The SCM element (ENamedElement) to which this drift rule applies."
		   });
	}

} //SemanticContextPackageImpl
