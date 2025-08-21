package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;

@SourceDebugExtension
/* loaded from: classes14.dex */
final class d0 extends AbstractSignatureParts<AnnotationDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final Annotated f145611a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f145612b;

    /* renamed from: c, reason: collision with root package name */
    private final LazyJavaResolverContext f145613c;

    /* renamed from: d, reason: collision with root package name */
    private final AnnotationQualifierApplicabilityType f145614d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f145615e;

    public /* synthetic */ d0(Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotated, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i10 & 16) != 0 ? false : z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    protected NullabilityQualifierWithMigrationStatus t(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusB;
        if (nullabilityQualifierWithMigrationStatus != null && (nullabilityQualifierWithMigrationStatusB = NullabilityQualifierWithMigrationStatus.b(nullabilityQualifierWithMigrationStatus, NullabilityQualifier.f145560c, false, 2, null)) != null) {
            return nullabilityQualifierWithMigrationStatusB;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.d();
        }
        return null;
    }

    public d0(Annotated annotated, boolean z10, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z11) {
        Intrinsics.j(containerContext, "containerContext");
        Intrinsics.j(containerApplicabilityType, "containerApplicabilityType");
        this.f145611a = annotated;
        this.f145612b = z10;
        this.f145613c = containerContext;
        this.f145614d = containerApplicabilityType;
        this.f145615e = z11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean B(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return KotlinBuiltIns.f0((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean C() {
        return this.f145612b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean D(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker other) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        Intrinsics.j(other, "other");
        return this.f145613c.a().k().b((KotlinType) kotlinTypeMarker, (KotlinType) other);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean E(TypeParameterMarker typeParameterMarker) {
        Intrinsics.j(typeParameterMarker, "<this>");
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean F(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).N0() instanceof NotNullTypeParameterImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public boolean l(AnnotationDescriptor annotationDescriptor, KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(annotationDescriptor, "<this>");
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).k()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !u() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).m() || q() == AnnotationQualifierApplicabilityType.f145063f)) {
            return true;
        }
        return kotlinTypeMarker != null && KotlinBuiltIns.r0((KotlinType) kotlinTypeMarker) && m().p(annotationDescriptor) && !this.f145613c.a().q().d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public AnnotationTypeQualifierResolver m() {
        return this.f145613c.a().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public KotlinType v(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return TypeWithEnhancementKt.a((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public TypeSystemInferenceExtensionContext A() {
        return SimpleClassicTypeSystemContext.f147746a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<AnnotationDescriptor> n(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<AnnotationDescriptor> p() {
        Annotations annotations;
        Annotated annotated = this.f145611a;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? CollectionsKt.m() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public AnnotationQualifierApplicabilityType q() {
        return this.f145614d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public JavaTypeQualifiersByElementType r() {
        return this.f145613c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean s() {
        Annotated annotated = this.f145611a;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).s0() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean u() {
        return this.f145613c.a().q().c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public FqNameUnsafe x(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        ClassDescriptor classDescriptorF = TypeUtils.f((KotlinType) kotlinTypeMarker);
        if (classDescriptorF != null) {
            return DescriptorUtils.m(classDescriptorF);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean z() {
        return this.f145615e;
    }
}
