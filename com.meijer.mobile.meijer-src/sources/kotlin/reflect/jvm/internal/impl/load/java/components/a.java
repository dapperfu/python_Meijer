package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145258a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaAnnotationDescriptor f145259b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        this.f145258a = lazyJavaResolverContext;
        this.f145259b = javaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaAnnotationDescriptor.f(this.f145258a, this.f145259b);
    }
}
