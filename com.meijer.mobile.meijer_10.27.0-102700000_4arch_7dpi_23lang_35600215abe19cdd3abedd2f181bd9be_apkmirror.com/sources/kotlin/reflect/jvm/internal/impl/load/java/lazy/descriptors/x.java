package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* loaded from: classes13.dex */
class x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageScope f144573a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f144574b;

    public x(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f144573a = lazyJavaPackageScope;
        this.f144574b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaPackageScope.i0(this.f144573a, this.f144574b, (LazyJavaPackageScope.a) obj);
    }
}
