package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144351a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaAnnotationDescriptor f144352b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        this.f144351a = lazyJavaResolverContext;
        this.f144352b = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaAnnotationDescriptor.f(this.f144351a, this.f144352b);
    }
}
