package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f146928Z = {Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* renamed from: A, reason: collision with root package name */
    private final ReadWriteProperty f146929A;

    /* renamed from: B, reason: collision with root package name */
    private final ReadWriteProperty f146930B;

    /* renamed from: C, reason: collision with root package name */
    private final ReadWriteProperty f146931C;

    /* renamed from: D, reason: collision with root package name */
    private final ReadWriteProperty f146932D;

    /* renamed from: E, reason: collision with root package name */
    private final ReadWriteProperty f146933E;

    /* renamed from: F, reason: collision with root package name */
    private final ReadWriteProperty f146934F;

    /* renamed from: G, reason: collision with root package name */
    private final ReadWriteProperty f146935G;

    /* renamed from: H, reason: collision with root package name */
    private final ReadWriteProperty f146936H;

    /* renamed from: I, reason: collision with root package name */
    private final ReadWriteProperty f146937I;

    /* renamed from: J, reason: collision with root package name */
    private final ReadWriteProperty f146938J;

    /* renamed from: K, reason: collision with root package name */
    private final ReadWriteProperty f146939K;

    /* renamed from: L, reason: collision with root package name */
    private final ReadWriteProperty f146940L;

    /* renamed from: M, reason: collision with root package name */
    private final ReadWriteProperty f146941M;

    /* renamed from: N, reason: collision with root package name */
    private final ReadWriteProperty f146942N;

    /* renamed from: O, reason: collision with root package name */
    private final ReadWriteProperty f146943O;

    /* renamed from: P, reason: collision with root package name */
    private final ReadWriteProperty f146944P;

    /* renamed from: Q, reason: collision with root package name */
    private final ReadWriteProperty f146945Q;

    /* renamed from: R, reason: collision with root package name */
    private final ReadWriteProperty f146946R;

    /* renamed from: S, reason: collision with root package name */
    private final ReadWriteProperty f146947S;

    /* renamed from: T, reason: collision with root package name */
    private final ReadWriteProperty f146948T;

    /* renamed from: U, reason: collision with root package name */
    private final ReadWriteProperty f146949U;

    /* renamed from: V, reason: collision with root package name */
    private final ReadWriteProperty f146950V;

    /* renamed from: W, reason: collision with root package name */
    private final ReadWriteProperty f146951W;

    /* renamed from: X, reason: collision with root package name */
    private final ReadWriteProperty f146952X;

    /* renamed from: Y, reason: collision with root package name */
    private final ReadWriteProperty f146953Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f146954a;

    /* renamed from: b, reason: collision with root package name */
    private final ReadWriteProperty f146955b = s0(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f146891a);

    /* renamed from: c, reason: collision with root package name */
    private final ReadWriteProperty f146956c;

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteProperty f146957d;

    /* renamed from: e, reason: collision with root package name */
    private final ReadWriteProperty f146958e;

    /* renamed from: f, reason: collision with root package name */
    private final ReadWriteProperty f146959f;

    /* renamed from: g, reason: collision with root package name */
    private final ReadWriteProperty f146960g;

    /* renamed from: h, reason: collision with root package name */
    private final ReadWriteProperty f146961h;

    /* renamed from: i, reason: collision with root package name */
    private final ReadWriteProperty f146962i;

    /* renamed from: j, reason: collision with root package name */
    private final ReadWriteProperty f146963j;

    /* renamed from: k, reason: collision with root package name */
    private final ReadWriteProperty f146964k;

    /* renamed from: l, reason: collision with root package name */
    private final ReadWriteProperty f146965l;

    /* renamed from: m, reason: collision with root package name */
    private final ReadWriteProperty f146966m;

    /* renamed from: n, reason: collision with root package name */
    private final ReadWriteProperty f146967n;

    /* renamed from: o, reason: collision with root package name */
    private final ReadWriteProperty f146968o;

    /* renamed from: p, reason: collision with root package name */
    private final ReadWriteProperty f146969p;

    /* renamed from: q, reason: collision with root package name */
    private final ReadWriteProperty f146970q;

    /* renamed from: r, reason: collision with root package name */
    private final ReadWriteProperty f146971r;

    /* renamed from: s, reason: collision with root package name */
    private final ReadWriteProperty f146972s;

    /* renamed from: t, reason: collision with root package name */
    private final ReadWriteProperty f146973t;

    /* renamed from: u, reason: collision with root package name */
    private final ReadWriteProperty f146974u;

    /* renamed from: v, reason: collision with root package name */
    private final ReadWriteProperty f146975v;

    /* renamed from: w, reason: collision with root package name */
    private final ReadWriteProperty f146976w;

    /* renamed from: x, reason: collision with root package name */
    private final ReadWriteProperty f146977x;

    /* renamed from: y, reason: collision with root package name */
    private final ReadWriteProperty f146978y;

    /* renamed from: z, reason: collision with root package name */
    private final ReadWriteProperty f146979z;

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType t0(KotlinType it) {
        Intrinsics.j(it, "it");
        return it;
    }

    public final void r0() {
        this.f146954a = true;
    }

    private final <T> ReadWriteProperty<DescriptorRendererOptionsImpl, T> s0(final T t10) {
        Delegates delegates = Delegates.f143781a;
        return new ObservableProperty<T>(t10) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            protected boolean beforeChange(KProperty<?> property, T t11, T t12) {
                Intrinsics.j(property, "property");
                if (this.q0()) {
                    throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
                }
                return true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(ValueParameterDescriptor it) {
        Intrinsics.j(it, "it");
        return "...";
    }

    public ClassifierNamePolicy A() {
        return (ClassifierNamePolicy) this.f146955b.getValue(this, f146928Z[0]);
    }

    public Function1<ValueParameterDescriptor, String> B() {
        return (Function1) this.f146979z.getValue(this, f146928Z[24]);
    }

    public boolean C() {
        return ((Boolean) this.f146938J.getValue(this, f146928Z[34])).booleanValue();
    }

    public Set<FqName> D() {
        return (Set) this.f146939K.getValue(this, f146928Z[35]);
    }

    public boolean E() {
        return ((Boolean) this.f146948T.getValue(this, f146928Z[44])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f146974u.getValue(this, f146928Z[19])).booleanValue();
    }

    public boolean I() {
        return ((Boolean) this.f146953Y.getValue(this, f146928Z[49])).booleanValue();
    }

    public Set<DescriptorRendererModifier> J() {
        return (Set) this.f146958e.getValue(this, f146928Z[3]);
    }

    public boolean K() {
        return ((Boolean) this.f146967n.getValue(this, f146928Z[12])).booleanValue();
    }

    public OverrideRenderingPolicy L() {
        return (OverrideRenderingPolicy) this.f146930B.getValue(this, f146928Z[26]);
    }

    public ParameterNameRenderingPolicy M() {
        return (ParameterNameRenderingPolicy) this.f146933E.getValue(this, f146928Z[29]);
    }

    public boolean N() {
        return ((Boolean) this.f146949U.getValue(this, f146928Z[45])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f146951W.getValue(this, f146928Z[47])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy P() {
        return (PropertyAccessorRenderingPolicy) this.f146936H.getValue(this, f146928Z[32]);
    }

    public Function1<ConstantValue<?>, String> Q() {
        return (Function1) this.f146975v.getValue(this, f146928Z[20]);
    }

    public boolean R() {
        return ((Boolean) this.f146934F.getValue(this, f146928Z[30])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f146947S.getValue(this, f146928Z[43])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f146935G.getValue(this, f146928Z[31])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f146970q.getValue(this, f146928Z[15])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f146944P.getValue(this, f146928Z[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f146937I.getValue(this, f146928Z[33])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f146969p.getValue(this, f146928Z[14])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f146968o.getValue(this, f146928Z[13])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f146971r.getValue(this, f146928Z[16])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void a(boolean z10) {
        this.f146959f.setValue(this, f146928Z[4], Boolean.valueOf(z10));
    }

    public boolean a0() {
        return ((Boolean) this.f146946R.getValue(this, f146928Z[42])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void b(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.j(parameterNameRenderingPolicy, "<set-?>");
        this.f146933E.setValue(this, f146928Z[29], parameterNameRenderingPolicy);
    }

    public boolean b0() {
        return ((Boolean) this.f146945Q.getValue(this, f146928Z[41])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void c(boolean z10) {
        this.f146956c.setValue(this, f146928Z[1], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f146929A.getValue(this, f146928Z[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean d() {
        return ((Boolean) this.f146966m.getValue(this, f146928Z[11])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f146960g.getValue(this, f146928Z[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void e(boolean z10) {
        this.f146977x.setValue(this, f146928Z[22], Boolean.valueOf(z10));
    }

    public boolean e0() {
        return ((Boolean) this.f146959f.getValue(this, f146928Z[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void f(boolean z10) {
        this.f146934F.setValue(this, f146928Z[30], Boolean.valueOf(z10));
    }

    public RenderingFormat f0() {
        return (RenderingFormat) this.f146932D.getValue(this, f146928Z[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void g(RenderingFormat renderingFormat) {
        Intrinsics.j(renderingFormat, "<set-?>");
        this.f146932D.setValue(this, f146928Z[28], renderingFormat);
    }

    public Function1<KotlinType, KotlinType> g0() {
        return (Function1) this.f146978y.getValue(this, f146928Z[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void h(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.j(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f146942N.setValue(this, f146928Z[38], annotationArgumentsRenderingPolicy);
    }

    public boolean h0() {
        return ((Boolean) this.f146973t.getValue(this, f146928Z[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> i() {
        return (Set) this.f146940L.getValue(this, f146928Z[36]);
    }

    public boolean i0() {
        return ((Boolean) this.f146964k.getValue(this, f146928Z[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean j() {
        return ((Boolean) this.f146961h.getValue(this, f146928Z[6])).booleanValue();
    }

    public DescriptorRenderer.ValueParametersHandler j0() {
        return (DescriptorRenderer.ValueParametersHandler) this.f146931C.getValue(this, f146928Z[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy k() {
        return (AnnotationArgumentsRenderingPolicy) this.f146942N.getValue(this, f146928Z[38]);
    }

    public boolean k0() {
        return ((Boolean) this.f146963j.getValue(this, f146928Z[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void l(Set<FqName> set) {
        Intrinsics.j(set, "<set-?>");
        this.f146940L.setValue(this, f146928Z[36], set);
    }

    public boolean l0() {
        return ((Boolean) this.f146956c.getValue(this, f146928Z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void m(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.j(set, "<set-?>");
        this.f146958e.setValue(this, f146928Z[3], set);
    }

    public boolean m0() {
        return ((Boolean) this.f146957d.getValue(this, f146928Z[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void n(boolean z10) {
        this.f146963j.setValue(this, f146928Z[8], Boolean.valueOf(z10));
    }

    public boolean n0() {
        return ((Boolean) this.f146965l.getValue(this, f146928Z[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void o(ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.j(classifierNamePolicy, "<set-?>");
        this.f146955b.setValue(this, f146928Z[0], classifierNamePolicy);
    }

    public boolean o0() {
        return ((Boolean) this.f146977x.getValue(this, f146928Z[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void p(boolean z10) {
        this.f146935G.setValue(this, f146928Z[31], Boolean.valueOf(z10));
    }

    public boolean p0() {
        return ((Boolean) this.f146976w.getValue(this, f146928Z[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void q(boolean z10) {
        this.f146976w.setValue(this, f146928Z[21], Boolean.valueOf(z10));
    }

    public final boolean q0() {
        return this.f146954a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.f146961h.setValue(this, f146928Z[6], Boolean.valueOf(z10));
    }

    public final DescriptorRendererOptionsImpl t() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Iterator itA = ArrayIteratorKt.a(DescriptorRendererOptionsImpl.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    Intrinsics.i(name, "getName(...)");
                    StringsKt.W(name, "is", false, 2, null);
                    KClass kClassB = Reflection.b(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get");
                    String name3 = field.getName();
                    Intrinsics.i(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        Intrinsics.i(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb2.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.s0(observableProperty.getValue(this, new PropertyReference1Impl(kClassB, name2, sb2.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean v() {
        return ((Boolean) this.f146972s.getValue(this, f146928Z[17])).booleanValue();
    }

    public boolean w() {
        return ((Boolean) this.f146943O.getValue(this, f146928Z[39])).booleanValue();
    }

    public Function1<AnnotationDescriptor, Boolean> x() {
        return (Function1) this.f146941M.getValue(this, f146928Z[37]);
    }

    public boolean y() {
        return ((Boolean) this.f146952X.getValue(this, f146928Z[48])).booleanValue();
    }

    public boolean z() {
        return ((Boolean) this.f146962i.getValue(this, f146928Z[7])).booleanValue();
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f146956c = s0(bool);
        this.f146957d = s0(bool);
        this.f146958e = s0(DescriptorRendererModifier.f146909c);
        Boolean bool2 = Boolean.FALSE;
        this.f146959f = s0(bool2);
        this.f146960g = s0(bool2);
        this.f146961h = s0(bool2);
        this.f146962i = s0(bool2);
        this.f146963j = s0(bool2);
        this.f146964k = s0(bool);
        this.f146965l = s0(bool2);
        this.f146966m = s0(bool2);
        this.f146967n = s0(bool2);
        this.f146968o = s0(bool);
        this.f146969p = s0(bool);
        this.f146970q = s0(bool2);
        this.f146971r = s0(bool2);
        this.f146972s = s0(bool2);
        this.f146973t = s0(bool2);
        this.f146974u = s0(bool2);
        this.f146975v = s0(null);
        this.f146976w = s0(bool2);
        this.f146977x = s0(bool2);
        this.f146978y = s0(r.f147020a);
        this.f146979z = s0(s.f147021a);
        this.f146929A = s0(bool);
        this.f146930B = s0(OverrideRenderingPolicy.f146985b);
        this.f146931C = s0(DescriptorRenderer.ValueParametersHandler.DEFAULT.f146904a);
        this.f146932D = s0(RenderingFormat.f146999a);
        this.f146933E = s0(ParameterNameRenderingPolicy.f146989a);
        this.f146934F = s0(bool2);
        this.f146935G = s0(bool2);
        this.f146936H = s0(PropertyAccessorRenderingPolicy.f146995b);
        this.f146937I = s0(bool2);
        this.f146938J = s0(bool2);
        this.f146939K = s0(SetsKt.e());
        this.f146940L = s0(ExcludedTypeAnnotations.f146981a.a());
        this.f146941M = s0(null);
        this.f146942N = s0(AnnotationArgumentsRenderingPolicy.f146882c);
        this.f146943O = s0(bool2);
        this.f146944P = s0(bool);
        this.f146945Q = s0(bool);
        this.f146946R = s0(bool2);
        this.f146947S = s0(bool2);
        this.f146948T = s0(bool);
        this.f146949U = s0(bool);
        this.f146950V = s0(bool2);
        this.f146951W = s0(bool2);
        this.f146952X = s0(bool2);
        this.f146953Y = s0(bool);
    }

    public boolean F() {
        return DescriptorRendererOptions.DefaultImpls.a(this);
    }

    public boolean G() {
        return DescriptorRendererOptions.DefaultImpls.b(this);
    }
}
