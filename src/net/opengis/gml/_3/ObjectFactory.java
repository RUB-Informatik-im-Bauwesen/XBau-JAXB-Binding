//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package net.opengis.gml._3;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.gml._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbstractFeature_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractFeature");
    private final static QName _Curve_QNAME = new QName("http://www.opengis.net/gml/3.2", "Curve");
    private final static QName _CurveMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "curveMember");
    private final static QName _BoundedBy_QNAME = new QName("http://www.opengis.net/gml/3.2", "boundedBy");
    private final static QName _Patches_QNAME = new QName("http://www.opengis.net/gml/3.2", "patches");
    private final static QName _Identifier_QNAME = new QName("http://www.opengis.net/gml/3.2", "identifier");
    private final static QName _Circle_QNAME = new QName("http://www.opengis.net/gml/3.2", "Circle");
    private final static QName _AbstractCurveSegment_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment");
    private final static QName _File_QNAME = new QName("http://www.opengis.net/gml/3.2", "File");
    private final static QName _AbstractGeometricAggregate_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate");
    private final static QName _Name_QNAME = new QName("http://www.opengis.net/gml/3.2", "name");
    private final static QName _AbstractCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCurve");
    private final static QName _AbstractRing_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractRing");
    private final static QName _AbstractDiscreteCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage");
    private final static QName _Arc_QNAME = new QName("http://www.opengis.net/gml/3.2", "Arc");
    private final static QName _AbstractGML_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGML");
    private final static QName _PosList_QNAME = new QName("http://www.opengis.net/gml/3.2", "posList");
    private final static QName _ArcString_QNAME = new QName("http://www.opengis.net/gml/3.2", "ArcString");
    private final static QName _CoverageMappingRule_QNAME = new QName("http://www.opengis.net/gml/3.2", "CoverageMappingRule");
    private final static QName _AbstractGeometricPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive");
    private final static QName _SurfaceMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "surfaceMember");
    private final static QName _MultiPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiPoint");
    private final static QName _Polygon_QNAME = new QName("http://www.opengis.net/gml/3.2", "Polygon");
    private final static QName _AbstractFeatureCollection_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection");
    private final static QName _DomainSet_QNAME = new QName("http://www.opengis.net/gml/3.2", "domainSet");
    private final static QName _CubicSpline_QNAME = new QName("http://www.opengis.net/gml/3.2", "CubicSpline");
    private final static QName _MultiCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiCurve");
    private final static QName _CoverageFunction_QNAME = new QName("http://www.opengis.net/gml/3.2", "coverageFunction");
    private final static QName _AbstractSurfacePatch_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch");
    private final static QName _AbstractSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSurface");
    private final static QName _RangeParameters_QNAME = new QName("http://www.opengis.net/gml/3.2", "rangeParameters");
    private final static QName _Point_QNAME = new QName("http://www.opengis.net/gml/3.2", "Point");
    private final static QName _LinearRing_QNAME = new QName("http://www.opengis.net/gml/3.2", "LinearRing");
    private final static QName _GridFunction_QNAME = new QName("http://www.opengis.net/gml/3.2", "GridFunction");
    private final static QName _PointMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointMember");
    private final static QName _TriangulatedSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface");
    private final static QName _LineString_QNAME = new QName("http://www.opengis.net/gml/3.2", "LineString");
    private final static QName _CompositeSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeSolid");
    private final static QName _AbstractObject_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractObject");
    private final static QName _LineStringSegment_QNAME = new QName("http://www.opengis.net/gml/3.2", "LineStringSegment");
    private final static QName _RangeSet_QNAME = new QName("http://www.opengis.net/gml/3.2", "rangeSet");
    private final static QName _PolygonPatch_QNAME = new QName("http://www.opengis.net/gml/3.2", "PolygonPatch");
    private final static QName _Ring_QNAME = new QName("http://www.opengis.net/gml/3.2", "Ring");
    private final static QName _FeatureMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "featureMember");
    private final static QName _Envelope_QNAME = new QName("http://www.opengis.net/gml/3.2", "Envelope");
    private final static QName _Surface_QNAME = new QName("http://www.opengis.net/gml/3.2", "Surface");
    private final static QName _Segments_QNAME = new QName("http://www.opengis.net/gml/3.2", "segments");
    private final static QName _Interior_QNAME = new QName("http://www.opengis.net/gml/3.2", "interior");
    private final static QName _DataBlock_QNAME = new QName("http://www.opengis.net/gml/3.2", "DataBlock");
    private final static QName _Description_QNAME = new QName("http://www.opengis.net/gml/3.2", "description");
    private final static QName _DescriptionReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "descriptionReference");
    private final static QName _DoubleOrNilReasonTupleList_QNAME = new QName("http://www.opengis.net/gml/3.2", "doubleOrNilReasonTupleList");
    private final static QName _MultiSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiSurface");
    private final static QName _Exterior_QNAME = new QName("http://www.opengis.net/gml/3.2", "exterior");
    private final static QName _SolidMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "solidMember");
    private final static QName _AbstractGeometry_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private final static QName _AbstractCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCoverage");
    private final static QName _RectifiedGridCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage");
    private final static QName _AbstractSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSolid");
    private final static QName _CompositeCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeCurve");
    private final static QName _Pos_QNAME = new QName("http://www.opengis.net/gml/3.2", "pos");
    private final static QName _MultiPointCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.gml._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiPointType }
     * 
     */
    public MultiPointType createMultiPointType() {
        return new MultiPointType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType }
     * 
     */
    public SurfacePropertyType createSurfacePropertyType() {
        return new SurfacePropertyType();
    }

    /**
     * Create an instance of {@link MappingRuleType }
     * 
     */
    public MappingRuleType createMappingRuleType() {
        return new MappingRuleType();
    }

    /**
     * Create an instance of {@link ArcStringType }
     * 
     */
    public ArcStringType createArcStringType() {
        return new ArcStringType();
    }

    /**
     * Create an instance of {@link DirectPositionListType }
     * 
     */
    public DirectPositionListType createDirectPositionListType() {
        return new DirectPositionListType();
    }

    /**
     * Create an instance of {@link CoverageFunctionType }
     * 
     */
    public CoverageFunctionType createCoverageFunctionType() {
        return new CoverageFunctionType();
    }

    /**
     * Create an instance of {@link MultiCurveType }
     * 
     */
    public MultiCurveType createMultiCurveType() {
        return new MultiCurveType();
    }

    /**
     * Create an instance of {@link DomainSetType }
     * 
     */
    public DomainSetType createDomainSetType() {
        return new DomainSetType();
    }

    /**
     * Create an instance of {@link CubicSplineType }
     * 
     */
    public CubicSplineType createCubicSplineType() {
        return new CubicSplineType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link CodeWithAuthorityType }
     * 
     */
    public CodeWithAuthorityType createCodeWithAuthorityType() {
        return new CodeWithAuthorityType();
    }

    /**
     * Create an instance of {@link CircleType }
     * 
     */
    public CircleType createCircleType() {
        return new CircleType();
    }

    /**
     * Create an instance of {@link ArcType }
     * 
     */
    public ArcType createArcType() {
        return new ArcType();
    }

    /**
     * Create an instance of {@link BoundingShapeType }
     * 
     */
    public BoundingShapeType createBoundingShapeType() {
        return new BoundingShapeType();
    }

    /**
     * Create an instance of {@link SurfacePatchArrayPropertyType }
     * 
     */
    public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType() {
        return new SurfacePatchArrayPropertyType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link CurvePropertyType }
     * 
     */
    public CurvePropertyType createCurvePropertyType() {
        return new CurvePropertyType();
    }

    /**
     * Create an instance of {@link DiscreteCoverageType }
     * 
     */
    public DiscreteCoverageType createDiscreteCoverageType() {
        return new DiscreteCoverageType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link SolidPropertyType }
     * 
     */
    public SolidPropertyType createSolidPropertyType() {
        return new SolidPropertyType();
    }

    /**
     * Create an instance of {@link MultiSurfaceType }
     * 
     */
    public MultiSurfaceType createMultiSurfaceType() {
        return new MultiSurfaceType();
    }

    /**
     * Create an instance of {@link AbstractRingPropertyType }
     * 
     */
    public AbstractRingPropertyType createAbstractRingPropertyType() {
        return new AbstractRingPropertyType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link EnvelopeType }
     * 
     */
    public EnvelopeType createEnvelopeType() {
        return new EnvelopeType();
    }

    /**
     * Create an instance of {@link DataBlockType }
     * 
     */
    public DataBlockType createDataBlockType() {
        return new DataBlockType();
    }

    /**
     * Create an instance of {@link SurfaceType }
     * 
     */
    public SurfaceType createSurfaceType() {
        return new SurfaceType();
    }

    /**
     * Create an instance of {@link CurveSegmentArrayPropertyType }
     * 
     */
    public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType() {
        return new CurveSegmentArrayPropertyType();
    }

    /**
     * Create an instance of {@link DirectPositionType }
     * 
     */
    public DirectPositionType createDirectPositionType() {
        return new DirectPositionType();
    }

    /**
     * Create an instance of {@link CompositeCurveType }
     * 
     */
    public CompositeCurveType createCompositeCurveType() {
        return new CompositeCurveType();
    }

    /**
     * Create an instance of {@link AbstractSolidType }
     * 
     */
    public AbstractSolidType createAbstractSolidType() {
        return new AbstractSolidType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link AssociationRoleType }
     * 
     */
    public AssociationRoleType createAssociationRoleType() {
        return new AssociationRoleType();
    }

    /**
     * Create an instance of {@link FeaturePropertyType }
     * 
     */
    public FeaturePropertyType createFeaturePropertyType() {
        return new FeaturePropertyType();
    }

    /**
     * Create an instance of {@link CompositeSolidType }
     * 
     */
    public CompositeSolidType createCompositeSolidType() {
        return new CompositeSolidType();
    }

    /**
     * Create an instance of {@link LineStringType }
     * 
     */
    public LineStringType createLineStringType() {
        return new LineStringType();
    }

    /**
     * Create an instance of {@link PolygonPatchType }
     * 
     */
    public PolygonPatchType createPolygonPatchType() {
        return new PolygonPatchType();
    }

    /**
     * Create an instance of {@link RingType }
     * 
     */
    public RingType createRingType() {
        return new RingType();
    }

    /**
     * Create an instance of {@link LineStringSegmentType }
     * 
     */
    public LineStringSegmentType createLineStringSegmentType() {
        return new LineStringSegmentType();
    }

    /**
     * Create an instance of {@link RangeSetType }
     * 
     */
    public RangeSetType createRangeSetType() {
        return new RangeSetType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link LinearRingType }
     * 
     */
    public LinearRingType createLinearRingType() {
        return new LinearRingType();
    }

    /**
     * Create an instance of {@link GridFunctionType }
     * 
     */
    public GridFunctionType createGridFunctionType() {
        return new GridFunctionType();
    }

    /**
     * Create an instance of {@link ScaleType }
     * 
     */
    public ScaleType createScaleType() {
        return new ScaleType();
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link SequenceRuleType }
     * 
     */
    public SequenceRuleType createSequenceRuleType() {
        return new SequenceRuleType();
    }

    /**
     * Create an instance of {@link CRSPropertyType }
     * 
     */
    public CRSPropertyType createCRSPropertyType() {
        return new CRSPropertyType();
    }

    /**
     * Create an instance of {@link AngleType }
     * 
     */
    public AngleType createAngleType() {
        return new AngleType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MultiCurvePropertyType }
     * 
     */
    public MultiCurvePropertyType createMultiCurvePropertyType() {
        return new MultiCurvePropertyType();
    }

    /**
     * Create an instance of {@link VolumeType }
     * 
     */
    public VolumeType createVolumeType() {
        return new VolumeType();
    }

    /**
     * Create an instance of {@link VectorType }
     * 
     */
    public VectorType createVectorType() {
        return new VectorType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link MultiSurfacePropertyType }
     * 
     */
    public MultiSurfacePropertyType createMultiSurfacePropertyType() {
        return new MultiSurfacePropertyType();
    }

    /**
     * Create an instance of {@link MultiPointPropertyType }
     * 
     */
    public MultiPointPropertyType createMultiPointPropertyType() {
        return new MultiPointPropertyType();
    }

    /**
     * Create an instance of {@link GeometryPropertyType }
     * 
     */
    public GeometryPropertyType createGeometryPropertyType() {
        return new GeometryPropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractFeatureType> createAbstractFeature(AbstractFeatureType value) {
        return new JAXBElement<AbstractFeatureType>(_AbstractFeature_QNAME, AbstractFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CurveType> createCurve(CurveType value) {
        return new JAXBElement<CurveType>(_Curve_QNAME, CurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "curveMember")
    public JAXBElement<CurvePropertyType> createCurveMember(CurvePropertyType value) {
        return new JAXBElement<CurvePropertyType>(_CurveMember_QNAME, CurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoundingShapeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "boundedBy")
    public JAXBElement<BoundingShapeType> createBoundedBy(BoundingShapeType value) {
        return new JAXBElement<BoundingShapeType>(_BoundedBy_QNAME, BoundingShapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "patches")
    public JAXBElement<SurfacePatchArrayPropertyType> createPatches(SurfacePatchArrayPropertyType value) {
        return new JAXBElement<SurfacePatchArrayPropertyType>(_Patches_QNAME, SurfacePatchArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "identifier")
    public JAXBElement<CodeWithAuthorityType> createIdentifier(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_Identifier_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Circle", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Arc")
    public JAXBElement<CircleType> createCircle(CircleType value) {
        return new JAXBElement<CircleType>(_Circle_QNAME, CircleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCurveSegment", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractCurveSegmentType> createAbstractCurveSegment(AbstractCurveSegmentType value) {
        return new JAXBElement<AbstractCurveSegmentType>(_AbstractCurveSegment_QNAME, AbstractCurveSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "File", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<FileType> createFile(FileType value) {
        return new JAXBElement<FileType>(_File_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometricAggregate", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometricAggregateType> createAbstractGeometricAggregate(AbstractGeometricAggregateType value) {
        return new JAXBElement<AbstractGeometricAggregateType>(_AbstractGeometricAggregate_QNAME, AbstractGeometricAggregateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "name")
    public JAXBElement<CodeType> createName(CodeType value) {
        return new JAXBElement<CodeType>(_Name_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractCurveType> createAbstractCurve(AbstractCurveType value) {
        return new JAXBElement<AbstractCurveType>(_AbstractCurve_QNAME, AbstractCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractRing", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractRingType> createAbstractRing(AbstractRingType value) {
        return new JAXBElement<AbstractRingType>(_AbstractRing_QNAME, AbstractRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractDiscreteCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoverage")
    public JAXBElement<DiscreteCoverageType> createAbstractDiscreteCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_AbstractDiscreteCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Arc", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ArcString")
    public JAXBElement<ArcType> createArc(ArcType value) {
        return new JAXBElement<ArcType>(_Arc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGML", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractGMLType> createAbstractGML(AbstractGMLType value) {
        return new JAXBElement<AbstractGMLType>(_AbstractGML_QNAME, AbstractGMLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectPositionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "posList")
    public JAXBElement<DirectPositionListType> createPosList(DirectPositionListType value) {
        return new JAXBElement<DirectPositionListType>(_PosList_QNAME, DirectPositionListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ArcString", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<ArcStringType> createArcString(ArcStringType value) {
        return new JAXBElement<ArcStringType>(_ArcString_QNAME, ArcStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CoverageMappingRule", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<MappingRuleType> createCoverageMappingRule(MappingRuleType value) {
        return new JAXBElement<MappingRuleType>(_CoverageMappingRule_QNAME, MappingRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometricPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometricPrimitiveType> createAbstractGeometricPrimitive(AbstractGeometricPrimitiveType value) {
        return new JAXBElement<AbstractGeometricPrimitiveType>(_AbstractGeometricPrimitive_QNAME, AbstractGeometricPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "surfaceMember")
    public JAXBElement<SurfacePropertyType> createSurfaceMember(SurfacePropertyType value) {
        return new JAXBElement<SurfacePropertyType>(_SurfaceMember_QNAME, SurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiPointType> createMultiPoint(MultiPointType value) {
        return new JAXBElement<MultiPointType>(_MultiPoint_QNAME, MultiPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Polygon", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, PolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractFeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractFeatureCollectionType> createAbstractFeatureCollection(AbstractFeatureCollectionType value) {
        return new JAXBElement<AbstractFeatureCollectionType>(_AbstractFeatureCollection_QNAME, AbstractFeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "domainSet")
    public JAXBElement<DomainSetType> createDomainSet(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_DomainSet_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CubicSpline", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<CubicSplineType> createCubicSpline(CubicSplineType value) {
        return new JAXBElement<CubicSplineType>(_CubicSpline_QNAME, CubicSplineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiCurveType> createMultiCurve(MultiCurveType value) {
        return new JAXBElement<MultiCurveType>(_MultiCurve_QNAME, MultiCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coverageFunction", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<CoverageFunctionType> createCoverageFunction(CoverageFunctionType value) {
        return new JAXBElement<CoverageFunctionType>(_CoverageFunction_QNAME, CoverageFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSurfacePatch")
    public JAXBElement<AbstractSurfacePatchType> createAbstractSurfacePatch(AbstractSurfacePatchType value) {
        return new JAXBElement<AbstractSurfacePatchType>(_AbstractSurfacePatch_QNAME, AbstractSurfacePatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractSurfaceType> createAbstractSurface(AbstractSurfaceType value) {
        return new JAXBElement<AbstractSurfaceType>(_AbstractSurface_QNAME, AbstractSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rangeParameters")
    public JAXBElement<AssociationRoleType> createRangeParameters(AssociationRoleType value) {
        return new JAXBElement<AssociationRoleType>(_RangeParameters_QNAME, AssociationRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LinearRing", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractRing")
    public JAXBElement<LinearRingType> createLinearRing(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_LinearRing_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GridFunction", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<GridFunctionType> createGridFunction(GridFunctionType value) {
        return new JAXBElement<GridFunctionType>(_GridFunction_QNAME, GridFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointMember")
    public JAXBElement<PointPropertyType> createPointMember(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_PointMember_QNAME, PointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TriangulatedSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType> createTriangulatedSurface(SurfaceType value) {
        return new JAXBElement<SurfaceType>(_TriangulatedSurface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LineString", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<LineStringType> createLineString(LineStringType value) {
        return new JAXBElement<LineStringType>(_LineString_QNAME, LineStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSolid")
    public JAXBElement<CompositeSolidType> createCompositeSolid(CompositeSolidType value) {
        return new JAXBElement<CompositeSolidType>(_CompositeSolid_QNAME, CompositeSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractObject")
    public JAXBElement<Object> createAbstractObject(Object value) {
        return new JAXBElement<Object>(_AbstractObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LineStringSegment", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<LineStringSegmentType> createLineStringSegment(LineStringSegmentType value) {
        return new JAXBElement<LineStringSegmentType>(_LineStringSegment_QNAME, LineStringSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rangeSet")
    public JAXBElement<RangeSetType> createRangeSet(RangeSetType value) {
        return new JAXBElement<RangeSetType>(_RangeSet_QNAME, RangeSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PolygonPatch", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurfacePatch")
    public JAXBElement<PolygonPatchType> createPolygonPatch(PolygonPatchType value) {
        return new JAXBElement<PolygonPatchType>(_PolygonPatch_QNAME, PolygonPatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Ring", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractRing")
    public JAXBElement<RingType> createRing(RingType value) {
        return new JAXBElement<RingType>(_Ring_QNAME, RingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "featureMember")
    public JAXBElement<FeaturePropertyType> createFeatureMember(FeaturePropertyType value) {
        return new JAXBElement<FeaturePropertyType>(_FeatureMember_QNAME, FeaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Envelope", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<EnvelopeType> createEnvelope(EnvelopeType value) {
        return new JAXBElement<EnvelopeType>(_Envelope_QNAME, EnvelopeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<SurfaceType> createSurface(SurfaceType value) {
        return new JAXBElement<SurfaceType>(_Surface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveSegmentArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "segments")
    public JAXBElement<CurveSegmentArrayPropertyType> createSegments(CurveSegmentArrayPropertyType value) {
        return new JAXBElement<CurveSegmentArrayPropertyType>(_Segments_QNAME, CurveSegmentArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "interior")
    public JAXBElement<AbstractRingPropertyType> createInterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Interior_QNAME, AbstractRingPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DataBlock", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<DataBlockType> createDataBlock(DataBlockType value) {
        return new JAXBElement<DataBlockType>(_DataBlock_QNAME, DataBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "descriptionReference")
    public JAXBElement<ReferenceType> createDescriptionReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_DescriptionReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "doubleOrNilReasonTupleList")
    public JAXBElement<List<String>> createDoubleOrNilReasonTupleList(List<String> value) {
        return new JAXBElement<List<String>>(_DoubleOrNilReasonTupleList_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiSurfaceType> createMultiSurface(MultiSurfaceType value) {
        return new JAXBElement<MultiSurfaceType>(_MultiSurface_QNAME, MultiSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "exterior")
    public JAXBElement<AbstractRingPropertyType> createExterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Exterior_QNAME, AbstractRingPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "solidMember")
    public JAXBElement<SolidPropertyType> createSolidMember(SolidPropertyType value) {
        return new JAXBElement<SolidPropertyType>(_SolidMember_QNAME, SolidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractGeometryType> createAbstractGeometry(AbstractGeometryType value) {
        return new JAXBElement<AbstractGeometryType>(_AbstractGeometry_QNAME, AbstractGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractCoverageType> createAbstractCoverage(AbstractCoverageType value) {
        return new JAXBElement<AbstractCoverageType>(_AbstractCoverage_QNAME, AbstractCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "RectifiedGridCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createRectifiedGridCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_RectifiedGridCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractSolidType> createAbstractSolid(AbstractSolidType value) {
        return new JAXBElement<AbstractSolidType>(_AbstractSolid_QNAME, AbstractSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CompositeCurveType> createCompositeCurve(CompositeCurveType value) {
        return new JAXBElement<CompositeCurveType>(_CompositeCurve_QNAME, CompositeCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pos")
    public JAXBElement<DirectPositionType> createPos(DirectPositionType value) {
        return new JAXBElement<DirectPositionType>(_Pos_QNAME, DirectPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiPointCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createMultiPointCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_MultiPointCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

}
