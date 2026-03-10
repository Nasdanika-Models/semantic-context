/**
 */
package org.nasdanika.models.semanticcontext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.semanticcontext.SemanticContextFactory
 * @model kind="package"
 * @generated
 */
public interface SemanticContextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semanticcontext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/semanticcontext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.semanticcontext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticContextPackage eINSTANCE = org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl <em>Context Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.ContextModelImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__SOURCE_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Element Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ELEMENT_CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__TYPE_MAPPINGS = 4;

	/**
	 * The feature id for the '<em><b>Cross Model Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__CROSS_MODEL_LINKS = 5;

	/**
	 * The feature id for the '<em><b>Drift Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__DRIFT_RULES = 6;

	/**
	 * The number of structural features of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl <em>Source Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.SourceModelImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getSourceModel()
	 * @generated
	 */
	int SOURCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__ROOT_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl <em>Element Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.ElementContextImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getElementContext()
	 * @generated
	 */
	int ELEMENT_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__RENAME_TO = 1;

	/**
	 * The feature id for the '<em><b>Flatten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__FLATTEN = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__SOURCE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Feature Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__FEATURE_CONTEXTS = 6;

	/**
	 * The feature id for the '<em><b>Operation Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT__OPERATION_CONTEXTS = 7;

	/**
	 * The number of structural features of the '<em>Element Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Element Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl <em>Feature Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.FeatureContextImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getFeatureContext()
	 * @generated
	 */
	int FEATURE_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__RENAME_TO = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__READ_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Follow Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__FOLLOW_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Feature Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Feature Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.OperationContextImpl <em>Operation Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.OperationContextImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getOperationContext()
	 * @generated
	 */
	int OPERATION_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT__RENAME_TO = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Operation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.TypeMappingImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getTypeMapping()
	 * @generated
	 */
	int TYPE_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Rename To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__RENAME_TO = 0;

	/**
	 * The feature id for the '<em><b>Flatten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__FLATTEN = 1;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__SOURCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl <em>Cross Model Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getCrossModelLink()
	 * @generated
	 */
	int CROSS_MODEL_LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__FROM = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__TO = 3;

	/**
	 * The feature id for the '<em><b>Source Model From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__SOURCE_MODEL_FROM = 4;

	/**
	 * The feature id for the '<em><b>Source Model To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__SOURCE_MODEL_TO = 5;

	/**
	 * The feature id for the '<em><b>Feature Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK__FEATURE_CONTEXT = 6;

	/**
	 * The number of structural features of the '<em>Cross Model Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Cross Model Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_MODEL_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl <em>Drift Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.semanticcontext.impl.DriftRuleImpl
	 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getDriftRule()
	 * @generated
	 */
	int DRIFT_RULE = 7;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>On Missing Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE__ON_MISSING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>On Changed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE__ON_CHANGED_TYPE = 2;

	/**
	 * The feature id for the '<em><b>On Changed Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE__ON_CHANGED_CARDINALITY = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Drift Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drift Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ContextModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getName()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ContextModel#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getDocumentation()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Documentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ContextModel#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getSourceModels()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ContextModel#getElementContexts <em>Element Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Contexts</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getElementContexts()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_ElementContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ContextModel#getTypeMappings <em>Type Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Mappings</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getTypeMappings()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_TypeMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ContextModel#getCrossModelLinks <em>Cross Model Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Model Links</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getCrossModelLinks()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_CrossModelLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ContextModel#getDriftRules <em>Drift Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drift Rules</em>'.
	 * @see org.nasdanika.models.semanticcontext.ContextModel#getDriftRules()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_DriftRules();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.SourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model</em>'.
	 * @see org.nasdanika.models.semanticcontext.SourceModel
	 * @generated
	 */
	EClass getSourceModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.SourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.semanticcontext.SourceModel#getName()
	 * @see #getSourceModel()
	 * @generated
	 */
	EAttribute getSourceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.SourceModel#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.semanticcontext.SourceModel#getDocumentation()
	 * @see #getSourceModel()
	 * @generated
	 */
	EAttribute getSourceModel_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.SourceModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see org.nasdanika.models.semanticcontext.SourceModel#getMetamodel()
	 * @see #getSourceModel()
	 * @generated
	 */
	EReference getSourceModel_Metamodel();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.semanticcontext.SourceModel#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Root Elements</em>'.
	 * @see org.nasdanika.models.semanticcontext.SourceModel#getRootElements()
	 * @see #getSourceModel()
	 * @generated
	 */
	EReference getSourceModel_RootElements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.ElementContext <em>Element Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Context</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext
	 * @generated
	 */
	EClass getElementContext();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ElementContext#isInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#isInclude()
	 * @see #getElementContext()
	 * @generated
	 */
	EAttribute getElementContext_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ElementContext#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getRenameTo()
	 * @see #getElementContext()
	 * @generated
	 */
	EAttribute getElementContext_RenameTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ElementContext#isFlatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flatten</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#isFlatten()
	 * @see #getElementContext()
	 * @generated
	 */
	EAttribute getElementContext_Flatten();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.ElementContext#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getDocumentation()
	 * @see #getElementContext()
	 * @generated
	 */
	EAttribute getElementContext_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.ElementContext#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getSourceModel()
	 * @see #getElementContext()
	 * @generated
	 */
	EReference getElementContext_SourceModel();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.ElementContext#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getSource()
	 * @see #getElementContext()
	 * @generated
	 */
	EReference getElementContext_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ElementContext#getFeatureContexts <em>Feature Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Contexts</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getFeatureContexts()
	 * @see #getElementContext()
	 * @generated
	 */
	EReference getElementContext_FeatureContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.semanticcontext.ElementContext#getOperationContexts <em>Operation Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Contexts</em>'.
	 * @see org.nasdanika.models.semanticcontext.ElementContext#getOperationContexts()
	 * @see #getElementContext()
	 * @generated
	 */
	EReference getElementContext_OperationContexts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.FeatureContext <em>Feature Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Context</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext
	 * @generated
	 */
	EClass getFeatureContext();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.FeatureContext#isInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext#isInclude()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EAttribute getFeatureContext_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.FeatureContext#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext#getRenameTo()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EAttribute getFeatureContext_RenameTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.FeatureContext#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext#isReadOnly()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EAttribute getFeatureContext_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.FeatureContext#isFollowReference <em>Follow Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Follow Reference</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext#isFollowReference()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EAttribute getFeatureContext_FollowReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.FeatureContext#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.semanticcontext.FeatureContext#getSource()
	 * @see #getFeatureContext()
	 * @generated
	 */
	EReference getFeatureContext_Source();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.OperationContext <em>Operation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Context</em>'.
	 * @see org.nasdanika.models.semanticcontext.OperationContext
	 * @generated
	 */
	EClass getOperationContext();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.OperationContext#isInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see org.nasdanika.models.semanticcontext.OperationContext#isInclude()
	 * @see #getOperationContext()
	 * @generated
	 */
	EAttribute getOperationContext_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.OperationContext#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see org.nasdanika.models.semanticcontext.OperationContext#getRenameTo()
	 * @see #getOperationContext()
	 * @generated
	 */
	EAttribute getOperationContext_RenameTo();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.OperationContext#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.semanticcontext.OperationContext#getSource()
	 * @see #getOperationContext()
	 * @generated
	 */
	EReference getOperationContext_Source();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.TypeMapping <em>Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Mapping</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping
	 * @generated
	 */
	EClass getTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.TypeMapping#getRenameTo <em>Rename To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rename To</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping#getRenameTo()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EAttribute getTypeMapping_RenameTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.TypeMapping#isFlatten <em>Flatten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flatten</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping#isFlatten()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EAttribute getTypeMapping_Flatten();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.TypeMapping#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping#getSourceModel()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_SourceModel();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.TypeMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping#getSource()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.TypeMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.semanticcontext.TypeMapping#getTarget()
	 * @see #getTypeMapping()
	 * @generated
	 */
	EReference getTypeMapping_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.CrossModelLink <em>Cross Model Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Model Link</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink
	 * @generated
	 */
	EClass getCrossModelLink();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getName()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EAttribute getCrossModelLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getDocumentation()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EAttribute getCrossModelLink_Documentation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getFrom()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EReference getCrossModelLink_From();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getTo()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EReference getCrossModelLink_To();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelFrom <em>Source Model From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model From</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelFrom()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EReference getCrossModelLink_SourceModelFrom();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelTo <em>Source Model To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model To</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getSourceModelTo()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EReference getCrossModelLink_SourceModelTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.semanticcontext.CrossModelLink#getFeatureContext <em>Feature Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Context</em>'.
	 * @see org.nasdanika.models.semanticcontext.CrossModelLink#getFeatureContext()
	 * @see #getCrossModelLink()
	 * @generated
	 */
	EReference getCrossModelLink_FeatureContext();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.semanticcontext.DriftRule <em>Drift Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drift Rule</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule
	 * @generated
	 */
	EClass getDriftRule();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.DriftRule#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule#getSeverity()
	 * @see #getDriftRule()
	 * @generated
	 */
	EAttribute getDriftRule_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnMissingElement <em>On Missing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Missing Element</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule#getOnMissingElement()
	 * @see #getDriftRule()
	 * @generated
	 */
	EAttribute getDriftRule_OnMissingElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedType <em>On Changed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Changed Type</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule#getOnChangedType()
	 * @see #getDriftRule()
	 * @generated
	 */
	EAttribute getDriftRule_OnChangedType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.semanticcontext.DriftRule#getOnChangedCardinality <em>On Changed Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Changed Cardinality</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule#getOnChangedCardinality()
	 * @see #getDriftRule()
	 * @generated
	 */
	EAttribute getDriftRule_OnChangedCardinality();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.semanticcontext.DriftRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.semanticcontext.DriftRule#getTarget()
	 * @see #getDriftRule()
	 * @generated
	 */
	EReference getDriftRule_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemanticContextFactory getSemanticContextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.ContextModelImpl <em>Context Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.ContextModelImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__NAME = eINSTANCE.getContextModel_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__DOCUMENTATION = eINSTANCE.getContextModel_Documentation();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__SOURCE_MODELS = eINSTANCE.getContextModel_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Element Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ELEMENT_CONTEXTS = eINSTANCE.getContextModel_ElementContexts();

		/**
		 * The meta object literal for the '<em><b>Type Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__TYPE_MAPPINGS = eINSTANCE.getContextModel_TypeMappings();

		/**
		 * The meta object literal for the '<em><b>Cross Model Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__CROSS_MODEL_LINKS = eINSTANCE.getContextModel_CrossModelLinks();

		/**
		 * The meta object literal for the '<em><b>Drift Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__DRIFT_RULES = eINSTANCE.getContextModel_DriftRules();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.SourceModelImpl <em>Source Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.SourceModelImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getSourceModel()
		 * @generated
		 */
		EClass SOURCE_MODEL = eINSTANCE.getSourceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_MODEL__NAME = eINSTANCE.getSourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_MODEL__DOCUMENTATION = eINSTANCE.getSourceModel_Documentation();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MODEL__METAMODEL = eINSTANCE.getSourceModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Root Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MODEL__ROOT_ELEMENTS = eINSTANCE.getSourceModel_RootElements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.ElementContextImpl <em>Element Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.ElementContextImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getElementContext()
		 * @generated
		 */
		EClass ELEMENT_CONTEXT = eINSTANCE.getElementContext();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONTEXT__INCLUDE = eINSTANCE.getElementContext_Include();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONTEXT__RENAME_TO = eINSTANCE.getElementContext_RenameTo();

		/**
		 * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONTEXT__FLATTEN = eINSTANCE.getElementContext_Flatten();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CONTEXT__DOCUMENTATION = eINSTANCE.getElementContext_Documentation();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTEXT__SOURCE_MODEL = eINSTANCE.getElementContext_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTEXT__SOURCE = eINSTANCE.getElementContext_Source();

		/**
		 * The meta object literal for the '<em><b>Feature Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTEXT__FEATURE_CONTEXTS = eINSTANCE.getElementContext_FeatureContexts();

		/**
		 * The meta object literal for the '<em><b>Operation Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CONTEXT__OPERATION_CONTEXTS = eINSTANCE.getElementContext_OperationContexts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.FeatureContextImpl <em>Feature Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.FeatureContextImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getFeatureContext()
		 * @generated
		 */
		EClass FEATURE_CONTEXT = eINSTANCE.getFeatureContext();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONTEXT__INCLUDE = eINSTANCE.getFeatureContext_Include();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONTEXT__RENAME_TO = eINSTANCE.getFeatureContext_RenameTo();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONTEXT__READ_ONLY = eINSTANCE.getFeatureContext_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Follow Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_CONTEXT__FOLLOW_REFERENCE = eINSTANCE.getFeatureContext_FollowReference();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTEXT__SOURCE = eINSTANCE.getFeatureContext_Source();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.OperationContextImpl <em>Operation Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.OperationContextImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getOperationContext()
		 * @generated
		 */
		EClass OPERATION_CONTEXT = eINSTANCE.getOperationContext();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONTEXT__INCLUDE = eINSTANCE.getOperationContext_Include();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CONTEXT__RENAME_TO = eINSTANCE.getOperationContext_RenameTo();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CONTEXT__SOURCE = eINSTANCE.getOperationContext_Source();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.TypeMappingImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getTypeMapping()
		 * @generated
		 */
		EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Rename To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MAPPING__RENAME_TO = eINSTANCE.getTypeMapping_RenameTo();

		/**
		 * The meta object literal for the '<em><b>Flatten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_MAPPING__FLATTEN = eINSTANCE.getTypeMapping_Flatten();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__SOURCE_MODEL = eINSTANCE.getTypeMapping_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__SOURCE = eINSTANCE.getTypeMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAPPING__TARGET = eINSTANCE.getTypeMapping_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl <em>Cross Model Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.CrossModelLinkImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getCrossModelLink()
		 * @generated
		 */
		EClass CROSS_MODEL_LINK = eINSTANCE.getCrossModelLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_MODEL_LINK__NAME = eINSTANCE.getCrossModelLink_Name();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_MODEL_LINK__DOCUMENTATION = eINSTANCE.getCrossModelLink_Documentation();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_MODEL_LINK__FROM = eINSTANCE.getCrossModelLink_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_MODEL_LINK__TO = eINSTANCE.getCrossModelLink_To();

		/**
		 * The meta object literal for the '<em><b>Source Model From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_MODEL_LINK__SOURCE_MODEL_FROM = eINSTANCE.getCrossModelLink_SourceModelFrom();

		/**
		 * The meta object literal for the '<em><b>Source Model To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_MODEL_LINK__SOURCE_MODEL_TO = eINSTANCE.getCrossModelLink_SourceModelTo();

		/**
		 * The meta object literal for the '<em><b>Feature Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_MODEL_LINK__FEATURE_CONTEXT = eINSTANCE.getCrossModelLink_FeatureContext();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.semanticcontext.impl.DriftRuleImpl <em>Drift Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.semanticcontext.impl.DriftRuleImpl
		 * @see org.nasdanika.models.semanticcontext.impl.SemanticContextPackageImpl#getDriftRule()
		 * @generated
		 */
		EClass DRIFT_RULE = eINSTANCE.getDriftRule();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_RULE__SEVERITY = eINSTANCE.getDriftRule_Severity();

		/**
		 * The meta object literal for the '<em><b>On Missing Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_RULE__ON_MISSING_ELEMENT = eINSTANCE.getDriftRule_OnMissingElement();

		/**
		 * The meta object literal for the '<em><b>On Changed Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_RULE__ON_CHANGED_TYPE = eINSTANCE.getDriftRule_OnChangedType();

		/**
		 * The meta object literal for the '<em><b>On Changed Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_RULE__ON_CHANGED_CARDINALITY = eINSTANCE.getDriftRule_OnChangedCardinality();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIFT_RULE__TARGET = eINSTANCE.getDriftRule_Target();

	}

} //SemanticContextPackage
