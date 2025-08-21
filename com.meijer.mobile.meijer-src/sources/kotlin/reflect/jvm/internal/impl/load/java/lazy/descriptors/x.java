package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;

/* loaded from: classes14.dex */
class x implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageScope f145480a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f145481b;

    public x(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f145480a = lazyJavaPackageScope;
        this.f145481b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaPackageScope.i0(this.f145480a, this.f145481b, (LazyJavaPackageScope.a) obj);
    }
}
