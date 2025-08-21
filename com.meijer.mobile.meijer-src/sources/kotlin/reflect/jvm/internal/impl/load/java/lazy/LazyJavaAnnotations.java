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

/* loaded from: classes14.dex */
public final class LazyJavaAnnotations implements Annotations {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145317a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaAnnotationOwner f145318b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f145319c;

    /* renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> f145320d;

    public LazyJavaAnnotations(LazyJavaResolverContext c10, JavaAnnotationOwner annotationOwner, boolean z10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(annotationOwner, "annotationOwner");
        this.f145317a = c10;
        this.f145318b = annotationOwner;
        this.f145319c = z10;
        this.f145320d = c10.a().u().g(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotationDescriptor f(LazyJavaAnnotations lazyJavaAnnotations, JavaAnnotation annotation) {
        Intrinsics.j(annotation, "annotation");
        return JavaAnnotationMapper.f145235a.e(annotation, lazyJavaAnnotations.f145317a, lazyJavaAnnotations.f145319c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public AnnotationDescriptor i(FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        Intrinsics.j(fqName, "fqName");
        JavaAnnotation javaAnnotationI = this.f145318b.i(fqName);
        return (javaAnnotationI == null || (annotationDescriptorInvoke = this.f145320d.invoke(javaAnnotationI)) == null) ? JavaAnnotationMapper.f145235a.a(fqName, this.f145318b, this.f145317a) : annotationDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.f145318b.getAnnotations().isEmpty() && !this.f145318b.E();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt.D(SequencesKt.Q(SequencesKt.M(CollectionsKt.f0(this.f145318b.getAnnotations()), this.f145320d), JavaAnnotationMapper.f145235a.a(StandardNames.FqNames.f144323y, this.f145318b, this.f145317a))).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean p3(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i10 & 4) != 0 ? false : z10);
    }
}
