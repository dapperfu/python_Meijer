package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* loaded from: classes13.dex */
class w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144571a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageScope f144572b;

    public w(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaPackageScope lazyJavaPackageScope) {
        this.f144571a = lazyJavaResolverContext;
        this.f144572b = lazyJavaPackageScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageScope.o0(this.f144571a, this.f144572b);
    }
}
