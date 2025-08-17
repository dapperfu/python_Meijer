package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144427a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassOrPackageFragmentDescriptor f144428b;

    public a(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        this.f144427a = lazyJavaResolverContext;
        this.f144428b = classOrPackageFragmentDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return ContextKt.g(this.f144427a, this.f144428b);
    }
}
