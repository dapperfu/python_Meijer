package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* loaded from: classes14.dex */
class w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145478a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageScope f145479b;

    public w(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        this.f145478a = lazyJavaResolverContext;
        this.f145479b = lazyJavaPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageScope.o0(this.f145478a, this.f145479b);
    }
}
