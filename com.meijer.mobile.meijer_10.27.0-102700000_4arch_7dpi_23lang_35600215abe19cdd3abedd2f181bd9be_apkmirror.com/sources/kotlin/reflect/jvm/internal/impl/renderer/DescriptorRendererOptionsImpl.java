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
/* loaded from: classes13.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* renamed from: Z, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f146021Z = {Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), Reflection.f(new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};

    /* renamed from: A, reason: collision with root package name */
    private final ReadWriteProperty f146022A;

    /* renamed from: B, reason: collision with root package name */
    private final ReadWriteProperty f146023B;

    /* renamed from: C, reason: collision with root package name */
    private final ReadWriteProperty f146024C;

    /* renamed from: D, reason: collision with root package name */
    private final ReadWriteProperty f146025D;

    /* renamed from: E, reason: collision with root package name */
    private final ReadWriteProperty f146026E;

    /* renamed from: F, reason: collision with root package name */
    private final ReadWriteProperty f146027F;

    /* renamed from: G, reason: collision with root package name */
    private final ReadWriteProperty f146028G;

    /* renamed from: H, reason: collision with root package name */
    private final ReadWriteProperty f146029H;

    /* renamed from: I, reason: collision with root package name */
    private final ReadWriteProperty f146030I;

    /* renamed from: J, reason: collision with root package name */
    private final ReadWriteProperty f146031J;

    /* renamed from: K, reason: collision with root package name */
    private final ReadWriteProperty f146032K;

    /* renamed from: L, reason: collision with root package name */
    private final ReadWriteProperty f146033L;

    /* renamed from: M, reason: collision with root package name */
    private final ReadWriteProperty f146034M;

    /* renamed from: N, reason: collision with root package name */
    private final ReadWriteProperty f146035N;

    /* renamed from: O, reason: collision with root package name */
    private final ReadWriteProperty f146036O;

    /* renamed from: P, reason: collision with root package name */
    private final ReadWriteProperty f146037P;

    /* renamed from: Q, reason: collision with root package name */
    private final ReadWriteProperty f146038Q;

    /* renamed from: R, reason: collision with root package name */
    private final ReadWriteProperty f146039R;

    /* renamed from: S, reason: collision with root package name */
    private final ReadWriteProperty f146040S;

    /* renamed from: T, reason: collision with root package name */
    private final ReadWriteProperty f146041T;

    /* renamed from: U, reason: collision with root package name */
    private final ReadWriteProperty f146042U;

    /* renamed from: V, reason: collision with root package name */
    private final ReadWriteProperty f146043V;

    /* renamed from: W, reason: collision with root package name */
    private final ReadWriteProperty f146044W;

    /* renamed from: X, reason: collision with root package name */
    private final ReadWriteProperty f146045X;

    /* renamed from: Y, reason: collision with root package name */
    private final ReadWriteProperty f146046Y;

    /* renamed from: a, reason: collision with root package name */
    private boolean f146047a;

    /* renamed from: b, reason: collision with root package name */
    private final ReadWriteProperty f146048b = s0(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f145984a);

    /* renamed from: c, reason: collision with root package name */
    private final ReadWriteProperty f146049c;

    /* renamed from: d, reason: collision with root package name */
    private final ReadWriteProperty f146050d;

    /* renamed from: e, reason: collision with root package name */
    private final ReadWriteProperty f146051e;

    /* renamed from: f, reason: collision with root package name */
    private final ReadWriteProperty f146052f;

    /* renamed from: g, reason: collision with root package name */
    private final ReadWriteProperty f146053g;

    /* renamed from: h, reason: collision with root package name */
    private final ReadWriteProperty f146054h;

    /* renamed from: i, reason: collision with root package name */
    private final ReadWriteProperty f146055i;

    /* renamed from: j, reason: collision with root package name */
    private final ReadWriteProperty f146056j;

    /* renamed from: k, reason: collision with root package name */
    private final ReadWriteProperty f146057k;

    /* renamed from: l, reason: collision with root package name */
    private final ReadWriteProperty f146058l;

    /* renamed from: m, reason: collision with root package name */
    private final ReadWriteProperty f146059m;

    /* renamed from: n, reason: collision with root package name */
    private final ReadWriteProperty f146060n;

    /* renamed from: o, reason: collision with root package name */
    private final ReadWriteProperty f146061o;

    /* renamed from: p, reason: collision with root package name */
    private final ReadWriteProperty f146062p;

    /* renamed from: q, reason: collision with root package name */
    private final ReadWriteProperty f146063q;

    /* renamed from: r, reason: collision with root package name */
    private final ReadWriteProperty f146064r;

    /* renamed from: s, reason: collision with root package name */
    private final ReadWriteProperty f146065s;

    /* renamed from: t, reason: collision with root package name */
    private final ReadWriteProperty f146066t;

    /* renamed from: u, reason: collision with root package name */
    private final ReadWriteProperty f146067u;

    /* renamed from: v, reason: collision with root package name */
    private final ReadWriteProperty f146068v;

    /* renamed from: w, reason: collision with root package name */
    private final ReadWriteProperty f146069w;

    /* renamed from: x, reason: collision with root package name */
    private final ReadWriteProperty f146070x;

    /* renamed from: y, reason: collision with root package name */
    private final ReadWriteProperty f146071y;

    /* renamed from: z, reason: collision with root package name */
    private final ReadWriteProperty f146072z;

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType t0(KotlinType it) {
        Intrinsics.j(it, "it");
        return it;
    }

    public final void r0() {
        this.f146047a = true;
    }

    private final <T> ReadWriteProperty<DescriptorRendererOptionsImpl, T> s0(final T t10) {
        Delegates delegates = Delegates.f142874a;
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
        return (ClassifierNamePolicy) this.f146048b.getValue(this, f146021Z[0]);
    }

    public Function1<ValueParameterDescriptor, String> B() {
        return (Function1) this.f146072z.getValue(this, f146021Z[24]);
    }

    public boolean C() {
        return ((Boolean) this.f146031J.getValue(this, f146021Z[34])).booleanValue();
    }

    public Set<FqName> D() {
        return (Set) this.f146032K.getValue(this, f146021Z[35]);
    }

    public boolean E() {
        return ((Boolean) this.f146041T.getValue(this, f146021Z[44])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.f146067u.getValue(this, f146021Z[19])).booleanValue();
    }

    public boolean I() {
        return ((Boolean) this.f146046Y.getValue(this, f146021Z[49])).booleanValue();
    }

    public Set<DescriptorRendererModifier> J() {
        return (Set) this.f146051e.getValue(this, f146021Z[3]);
    }

    public boolean K() {
        return ((Boolean) this.f146060n.getValue(this, f146021Z[12])).booleanValue();
    }

    public OverrideRenderingPolicy L() {
        return (OverrideRenderingPolicy) this.f146023B.getValue(this, f146021Z[26]);
    }

    public ParameterNameRenderingPolicy M() {
        return (ParameterNameRenderingPolicy) this.f146026E.getValue(this, f146021Z[29]);
    }

    public boolean N() {
        return ((Boolean) this.f146042U.getValue(this, f146021Z[45])).booleanValue();
    }

    public boolean O() {
        return ((Boolean) this.f146044W.getValue(this, f146021Z[47])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy P() {
        return (PropertyAccessorRenderingPolicy) this.f146029H.getValue(this, f146021Z[32]);
    }

    public Function1<ConstantValue<?>, String> Q() {
        return (Function1) this.f146068v.getValue(this, f146021Z[20]);
    }

    public boolean R() {
        return ((Boolean) this.f146027F.getValue(this, f146021Z[30])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.f146040S.getValue(this, f146021Z[43])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f146028G.getValue(this, f146021Z[31])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.f146063q.getValue(this, f146021Z[15])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.f146037P.getValue(this, f146021Z[40])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f146030I.getValue(this, f146021Z[33])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f146062p.getValue(this, f146021Z[14])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f146061o.getValue(this, f146021Z[13])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.f146064r.getValue(this, f146021Z[16])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void a(boolean z10) {
        this.f146052f.setValue(this, f146021Z[4], Boolean.valueOf(z10));
    }

    public boolean a0() {
        return ((Boolean) this.f146039R.getValue(this, f146021Z[42])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void b(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.j(parameterNameRenderingPolicy, "<set-?>");
        this.f146026E.setValue(this, f146021Z[29], parameterNameRenderingPolicy);
    }

    public boolean b0() {
        return ((Boolean) this.f146038Q.getValue(this, f146021Z[41])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void c(boolean z10) {
        this.f146049c.setValue(this, f146021Z[1], Boolean.valueOf(z10));
    }

    public boolean c0() {
        return ((Boolean) this.f146022A.getValue(this, f146021Z[25])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean d() {
        return ((Boolean) this.f146059m.getValue(this, f146021Z[11])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f146053g.getValue(this, f146021Z[5])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void e(boolean z10) {
        this.f146070x.setValue(this, f146021Z[22], Boolean.valueOf(z10));
    }

    public boolean e0() {
        return ((Boolean) this.f146052f.getValue(this, f146021Z[4])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void f(boolean z10) {
        this.f146027F.setValue(this, f146021Z[30], Boolean.valueOf(z10));
    }

    public RenderingFormat f0() {
        return (RenderingFormat) this.f146025D.getValue(this, f146021Z[28]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void g(RenderingFormat renderingFormat) {
        Intrinsics.j(renderingFormat, "<set-?>");
        this.f146025D.setValue(this, f146021Z[28], renderingFormat);
    }

    public Function1<KotlinType, KotlinType> g0() {
        return (Function1) this.f146071y.getValue(this, f146021Z[23]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void h(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.j(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f146035N.setValue(this, f146021Z[38], annotationArgumentsRenderingPolicy);
    }

    public boolean h0() {
        return ((Boolean) this.f146066t.getValue(this, f146021Z[18])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> i() {
        return (Set) this.f146033L.getValue(this, f146021Z[36]);
    }

    public boolean i0() {
        return ((Boolean) this.f146057k.getValue(this, f146021Z[9])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean j() {
        return ((Boolean) this.f146054h.getValue(this, f146021Z[6])).booleanValue();
    }

    public DescriptorRenderer.ValueParametersHandler j0() {
        return (DescriptorRenderer.ValueParametersHandler) this.f146024C.getValue(this, f146021Z[27]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy k() {
        return (AnnotationArgumentsRenderingPolicy) this.f146035N.getValue(this, f146021Z[38]);
    }

    public boolean k0() {
        return ((Boolean) this.f146056j.getValue(this, f146021Z[8])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void l(Set<FqName> set) {
        Intrinsics.j(set, "<set-?>");
        this.f146033L.setValue(this, f146021Z[36], set);
    }

    public boolean l0() {
        return ((Boolean) this.f146049c.getValue(this, f146021Z[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void m(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.j(set, "<set-?>");
        this.f146051e.setValue(this, f146021Z[3], set);
    }

    public boolean m0() {
        return ((Boolean) this.f146050d.getValue(this, f146021Z[2])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void n(boolean z10) {
        this.f146056j.setValue(this, f146021Z[8], Boolean.valueOf(z10));
    }

    public boolean n0() {
        return ((Boolean) this.f146058l.getValue(this, f146021Z[10])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void o(ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.j(classifierNamePolicy, "<set-?>");
        this.f146048b.setValue(this, f146021Z[0], classifierNamePolicy);
    }

    public boolean o0() {
        return ((Boolean) this.f146070x.getValue(this, f146021Z[22])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void p(boolean z10) {
        this.f146028G.setValue(this, f146021Z[31], Boolean.valueOf(z10));
    }

    public boolean p0() {
        return ((Boolean) this.f146069w.getValue(this, f146021Z[21])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void q(boolean z10) {
        this.f146069w.setValue(this, f146021Z[21], Boolean.valueOf(z10));
    }

    public final boolean q0() {
        return this.f146047a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.f146054h.setValue(this, f146021Z[6], Boolean.valueOf(z10));
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
        return ((Boolean) this.f146065s.getValue(this, f146021Z[17])).booleanValue();
    }

    public boolean w() {
        return ((Boolean) this.f146036O.getValue(this, f146021Z[39])).booleanValue();
    }

    public Function1<AnnotationDescriptor, Boolean> x() {
        return (Function1) this.f146034M.getValue(this, f146021Z[37]);
    }

    public boolean y() {
        return ((Boolean) this.f146045X.getValue(this, f146021Z[48])).booleanValue();
    }

    public boolean z() {
        return ((Boolean) this.f146055i.getValue(this, f146021Z[7])).booleanValue();
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f146049c = s0(bool);
        this.f146050d = s0(bool);
        this.f146051e = s0(DescriptorRendererModifier.f146002c);
        Boolean bool2 = Boolean.FALSE;
        this.f146052f = s0(bool2);
        this.f146053g = s0(bool2);
        this.f146054h = s0(bool2);
        this.f146055i = s0(bool2);
        this.f146056j = s0(bool2);
        this.f146057k = s0(bool);
        this.f146058l = s0(bool2);
        this.f146059m = s0(bool2);
        this.f146060n = s0(bool2);
        this.f146061o = s0(bool);
        this.f146062p = s0(bool);
        this.f146063q = s0(bool2);
        this.f146064r = s0(bool2);
        this.f146065s = s0(bool2);
        this.f146066t = s0(bool2);
        this.f146067u = s0(bool2);
        this.f146068v = s0(null);
        this.f146069w = s0(bool2);
        this.f146070x = s0(bool2);
        this.f146071y = s0(r.f146113a);
        this.f146072z = s0(s.f146114a);
        this.f146022A = s0(bool);
        this.f146023B = s0(OverrideRenderingPolicy.f146078b);
        this.f146024C = s0(DescriptorRenderer.ValueParametersHandler.DEFAULT.f145997a);
        this.f146025D = s0(RenderingFormat.f146092a);
        this.f146026E = s0(ParameterNameRenderingPolicy.f146082a);
        this.f146027F = s0(bool2);
        this.f146028G = s0(bool2);
        this.f146029H = s0(PropertyAccessorRenderingPolicy.f146088b);
        this.f146030I = s0(bool2);
        this.f146031J = s0(bool2);
        this.f146032K = s0(SetsKt.e());
        this.f146033L = s0(ExcludedTypeAnnotations.f146074a.a());
        this.f146034M = s0(null);
        this.f146035N = s0(AnnotationArgumentsRenderingPolicy.f145975c);
        this.f146036O = s0(bool2);
        this.f146037P = s0(bool);
        this.f146038Q = s0(bool);
        this.f146039R = s0(bool2);
        this.f146040S = s0(bool2);
        this.f146041T = s0(bool);
        this.f146042U = s0(bool);
        this.f146043V = s0(bool2);
        this.f146044W = s0(bool2);
        this.f146045X = s0(bool2);
        this.f146046Y = s0(bool);
    }

    public boolean F() {
        return DescriptorRendererOptions.DefaultImpls.a(this);
    }

    public boolean G() {
        return DescriptorRendererOptions.DefaultImpls.b(this);
    }
}
