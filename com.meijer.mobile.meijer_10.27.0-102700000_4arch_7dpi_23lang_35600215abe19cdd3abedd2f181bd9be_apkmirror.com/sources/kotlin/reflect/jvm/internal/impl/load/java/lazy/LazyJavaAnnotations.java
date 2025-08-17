package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.sequences.SequencesKt;

/* loaded from: classes13.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144410a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaAnnotationOwner f144411b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f144412c;

    /* renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f144413d;

    public LazyJavaAnnotations(LazyJavaResolverContext c10, JavaAnnotationOwner annotationOwner, boolean z10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(annotationOwner, "annotationOwner");
        this.f144410a = c10;
        this.f144411b = annotationOwner;
        this.f144412c = z10;
        this.f144413d = c10.a().u().g(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor f(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        return JavaAnnotationMapper.f144328a.e(annotation, lazyJavaAnnotations.f144410a, lazyJavaAnnotations.f144412c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        Intrinsics.j(fqName, "fqName");
        JavaAnnotation javaAnnotationI = this.f144411b.i(fqName);
        return (javaAnnotationI == null || (annotationDescriptorInvoke = this.f144413d.invoke(javaAnnotationI)) == null) ? JavaAnnotationMapper.f144328a.a(fqName, this.f144411b, this.f144410a) : annotationDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f144411b.getAnnotations().isEmpty() && !this.f144411b.E();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt.D(SequencesKt.P(SequencesKt.M(CollectionsKt.f0(this.f144411b.getAnnotations()), this.f144413d), JavaAnnotationMapper.f144328a.a(StandardNames.FqNames.f143416y, this.f144411b, this.f144410a))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i10 & 4) != 0 ? false : z10);
    }
}
