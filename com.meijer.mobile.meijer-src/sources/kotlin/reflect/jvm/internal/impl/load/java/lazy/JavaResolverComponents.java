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

/* loaded from: classes14.dex */
public final class JavaResolverComponents {

    /* renamed from: a, reason: collision with root package name */
    private final StorageManager f145291a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaClassFinder f145292b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinClassFinder f145293c;

    /* renamed from: d, reason: collision with root package name */
    private final DeserializedDescriptorResolver f145294d;

    /* renamed from: e, reason: collision with root package name */
    private final SignaturePropagator f145295e;

    /* renamed from: f, reason: collision with root package name */
    private final ErrorReporter f145296f;

    /* renamed from: g, reason: collision with root package name */
    private final JavaResolverCache f145297g;

    /* renamed from: h, reason: collision with root package name */
    private final JavaPropertyInitializerEvaluator f145298h;

    /* renamed from: i, reason: collision with root package name */
    private final SamConversionResolver f145299i;

    /* renamed from: j, reason: collision with root package name */
    private final JavaSourceElementFactory f145300j;

    /* renamed from: k, reason: collision with root package name */
    private final ModuleClassResolver f145301k;

    /* renamed from: l, reason: collision with root package name */
    private final PackagePartProvider f145302l;

    /* renamed from: m, reason: collision with root package name */
    private final SupertypeLoopChecker f145303m;

    /* renamed from: n, reason: collision with root package name */
    private final LookupTracker f145304n;

    /* renamed from: o, reason: collision with root package name */
    private final ModuleDescriptor f145305o;

    /* renamed from: p, reason: collision with root package name */
    private final ReflectionTypes f145306p;

    /* renamed from: q, reason: collision with root package name */
    private final AnnotationTypeQualifierResolver f145307q;

    /* renamed from: r, reason: collision with root package name */
    private final SignatureEnhancement f145308r;

    /* renamed from: s, reason: collision with root package name */
    private final JavaClassesTracker f145309s;

    /* renamed from: t, reason: collision with root package name */
    private final JavaResolverSettings f145310t;

    /* renamed from: u, reason: collision with root package name */
    private final NewKotlinTypeChecker f145311u;

    /* renamed from: v, reason: collision with root package name */
    private final JavaTypeEnhancementState f145312v;

    /* renamed from: w, reason: collision with root package name */
    private final JavaModuleAnnotationsProvider f145313w;

    /* renamed from: x, reason: collision with root package name */
    private final SyntheticJavaPartsProvider f145314x;

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
        this.f145291a = storageManager;
        this.f145292b = finder;
        this.f145293c = kotlinClassFinder;
        this.f145294d = deserializedDescriptorResolver;
        this.f145295e = signaturePropagator;
        this.f145296f = errorReporter;
        this.f145297g = javaResolverCache;
        this.f145298h = javaPropertyInitializerEvaluator;
        this.f145299i = samConversionResolver;
        this.f145300j = sourceElementFactory;
        this.f145301k = moduleClassResolver;
        this.f145302l = packagePartProvider;
        this.f145303m = supertypeLoopChecker;
        this.f145304n = lookupTracker;
        this.f145305o = module;
        this.f145306p = reflectionTypes;
        this.f145307q = annotationTypeQualifierResolver;
        this.f145308r = signatureEnhancement;
        this.f145309s = javaClassesTracker;
        this.f145310t = settings;
        this.f145311u = kotlinTypeChecker;
        this.f145312v = javaTypeEnhancementState;
        this.f145313w = javaModuleResolver;
        this.f145314x = syntheticPartsProvider;
    }

    public final AnnotationTypeQualifierResolver a() {
        return this.f145307q;
    }

    public final DeserializedDescriptorResolver b() {
        return this.f145294d;
    }

    public final ErrorReporter c() {
        return this.f145296f;
    }

    public final JavaClassFinder d() {
        return this.f145292b;
    }

    public final JavaClassesTracker e() {
        return this.f145309s;
    }

    public final JavaModuleAnnotationsProvider f() {
        return this.f145313w;
    }

    public final JavaPropertyInitializerEvaluator g() {
        return this.f145298h;
    }

    public final JavaResolverCache h() {
        return this.f145297g;
    }

    public final JavaTypeEnhancementState i() {
        return this.f145312v;
    }

    public final KotlinClassFinder j() {
        return this.f145293c;
    }

    public final NewKotlinTypeChecker k() {
        return this.f145311u;
    }

    public final LookupTracker l() {
        return this.f145304n;
    }

    public final ModuleDescriptor m() {
        return this.f145305o;
    }

    public final ModuleClassResolver n() {
        return this.f145301k;
    }

    public final PackagePartProvider o() {
        return this.f145302l;
    }

    public final ReflectionTypes p() {
        return this.f145306p;
    }

    public final JavaResolverSettings q() {
        return this.f145310t;
    }

    public final SignatureEnhancement r() {
        return this.f145308r;
    }

    public final SignaturePropagator s() {
        return this.f145295e;
    }

    public final JavaSourceElementFactory t() {
        return this.f145300j;
    }

    public final StorageManager u() {
        return this.f145291a;
    }

    public final SupertypeLoopChecker v() {
        return this.f145303m;
    }

    public final SyntheticJavaPartsProvider w() {
        return this.f145314x;
    }

    public final JavaResolverComponents x(JavaResolverCache javaResolverCache) {
        Intrinsics.j(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f145291a, this.f145292b, this.f145293c, this.f145294d, this.f145295e, this.f145296f, javaResolverCache, this.f145298h, this.f145299i, this.f145300j, this.f145301k, this.f145302l, this.f145303m, this.f145304n, this.f145305o, this.f145306p, this.f145307q, this.f145308r, this.f145309s, this.f145310t, this.f145311u, this.f145312v, this.f145313w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i10 & 8388608) != 0 ? SyntheticJavaPartsProvider.f147151a.a() : syntheticJavaPartsProvider);
    }
}
