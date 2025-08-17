package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* loaded from: classes13.dex */
public final class JavaResolverComponents {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f144384a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaClassFinder f144385b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinClassFinder f144386c;

    /* renamed from: d, reason: collision with root package name */
    private final DeserializedDescriptorResolver f144387d;

    /* renamed from: e, reason: collision with root package name */
    private final SignaturePropagator f144388e;

    /* renamed from: f, reason: collision with root package name */
    private final ErrorReporter f144389f;

    /* renamed from: g, reason: collision with root package name */
    private final JavaResolverCache f144390g;

    /* renamed from: h, reason: collision with root package name */
    private final JavaPropertyInitializerEvaluator f144391h;

    /* renamed from: i, reason: collision with root package name */
    private final SamConversionResolver f144392i;

    /* renamed from: j, reason: collision with root package name */
    private final JavaSourceElementFactory f144393j;

    /* renamed from: k, reason: collision with root package name */
    private final ModuleClassResolver f144394k;

    /* renamed from: l, reason: collision with root package name */
    private final PackagePartProvider f144395l;

    /* renamed from: m, reason: collision with root package name */
    private final SupertypeLoopChecker f144396m;

    /* renamed from: n, reason: collision with root package name */
    private final LookupTracker f144397n;

    /* renamed from: o, reason: collision with root package name */
    private final ModuleDescriptor f144398o;

    /* renamed from: p, reason: collision with root package name */
    private final ReflectionTypes f144399p;

    /* renamed from: q, reason: collision with root package name */
    private final AnnotationTypeQualifierResolver f144400q;

    /* renamed from: r, reason: collision with root package name */
    private final SignatureEnhancement f144401r;

    /* renamed from: s, reason: collision with root package name */
    private final JavaClassesTracker f144402s;

    /* renamed from: t, reason: collision with root package name */
    private final JavaResolverSettings f144403t;

    /* renamed from: u, reason: collision with root package name */
    private final NewKotlinTypeChecker f144404u;

    /* renamed from: v, reason: collision with root package name */
    private final JavaTypeEnhancementState f144405v;

    /* renamed from: w, reason: collision with root package name */
    private final JavaModuleAnnotationsProvider f144406w;

    /* renamed from: x, reason: collision with root package name */
    private final SyntheticJavaPartsProvider f144407x;

    public JavaResolverComponents(StorageManager storageManager, JavaClassFinder finder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory sourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor module, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings settings, NewKotlinTypeChecker kotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleResolver, SyntheticJavaPartsProvider syntheticPartsProvider) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(finder, "finder");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.j(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.j(signaturePropagator, "signaturePropagator");
        Intrinsics.j(errorReporter, "errorReporter");
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        Intrinsics.j(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.j(samConversionResolver, "samConversionResolver");
        Intrinsics.j(sourceElementFactory, "sourceElementFactory");
        Intrinsics.j(moduleClassResolver, "moduleClassResolver");
        Intrinsics.j(packagePartProvider, "packagePartProvider");
        Intrinsics.j(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.j(lookupTracker, "lookupTracker");
        Intrinsics.j(module, "module");
        Intrinsics.j(reflectionTypes, "reflectionTypes");
        Intrinsics.j(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.j(signatureEnhancement, "signatureEnhancement");
        Intrinsics.j(javaClassesTracker, "javaClassesTracker");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.j(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.j(javaModuleResolver, "javaModuleResolver");
        Intrinsics.j(syntheticPartsProvider, "syntheticPartsProvider");
        this.f144384a = storageManager;
        this.f144385b = finder;
        this.f144386c = kotlinClassFinder;
        this.f144387d = deserializedDescriptorResolver;
        this.f144388e = signaturePropagator;
        this.f144389f = errorReporter;
        this.f144390g = javaResolverCache;
        this.f144391h = javaPropertyInitializerEvaluator;
        this.f144392i = samConversionResolver;
        this.f144393j = sourceElementFactory;
        this.f144394k = moduleClassResolver;
        this.f144395l = packagePartProvider;
        this.f144396m = supertypeLoopChecker;
        this.f144397n = lookupTracker;
        this.f144398o = module;
        this.f144399p = reflectionTypes;
        this.f144400q = annotationTypeQualifierResolver;
        this.f144401r = signatureEnhancement;
        this.f144402s = javaClassesTracker;
        this.f144403t = settings;
        this.f144404u = kotlinTypeChecker;
        this.f144405v = javaTypeEnhancementState;
        this.f144406w = javaModuleResolver;
        this.f144407x = syntheticPartsProvider;
    }

    public final AnnotationTypeQualifierResolver a() {
        return this.f144400q;
    }

    public final DeserializedDescriptorResolver b() {
        return this.f144387d;
    }

    public final ErrorReporter c() {
        return this.f144389f;
    }

    public final JavaClassFinder d() {
        return this.f144385b;
    }

    public final JavaClassesTracker e() {
        return this.f144402s;
    }

    public final JavaModuleAnnotationsProvider f() {
        return this.f144406w;
    }

    public final JavaPropertyInitializerEvaluator g() {
        return this.f144391h;
    }

    public final JavaResolverCache h() {
        return this.f144390g;
    }

    public final JavaTypeEnhancementState i() {
        return this.f144405v;
    }

    public final KotlinClassFinder j() {
        return this.f144386c;
    }

    public final NewKotlinTypeChecker k() {
        return this.f144404u;
    }

    public final LookupTracker l() {
        return this.f144397n;
    }

    public final ModuleDescriptor m() {
        return this.f144398o;
    }

    public final ModuleClassResolver n() {
        return this.f144394k;
    }

    public final PackagePartProvider o() {
        return this.f144395l;
    }

    public final ReflectionTypes p() {
        return this.f144399p;
    }

    public final JavaResolverSettings q() {
        return this.f144403t;
    }

    public final SignatureEnhancement r() {
        return this.f144401r;
    }

    public final SignaturePropagator s() {
        return this.f144388e;
    }

    public final JavaSourceElementFactory t() {
        return this.f144393j;
    }

    public final StorageManager u() {
        return this.f144384a;
    }

    public final SupertypeLoopChecker v() {
        return this.f144396m;
    }

    public final SyntheticJavaPartsProvider w() {
        return this.f144407x;
    }

    public final JavaResolverComponents x(JavaResolverCache javaResolverCache) {
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f144384a, this.f144385b, this.f144386c, this.f144387d, this.f144388e, this.f144389f, javaResolverCache, this.f144391h, this.f144392i, this.f144393j, this.f144394k, this.f144395l, this.f144396m, this.f144397n, this.f144398o, this.f144399p, this.f144400q, this.f144401r, this.f144402s, this.f144403t, this.f144404u, this.f144405v, this.f144406w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i10 & 8388608) != 0 ? SyntheticJavaPartsProvider.f146244a.a() : syntheticJavaPartsProvider);
    }
}
