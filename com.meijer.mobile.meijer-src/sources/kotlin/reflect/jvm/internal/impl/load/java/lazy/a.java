package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145334a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassOrPackageFragmentDescriptor f145335b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.f145334a = lazyJavaResolverContext;
        this.f145335b = classOrPackageFragmentDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.g(this.f145334a, this.f145335b);
    }
}
