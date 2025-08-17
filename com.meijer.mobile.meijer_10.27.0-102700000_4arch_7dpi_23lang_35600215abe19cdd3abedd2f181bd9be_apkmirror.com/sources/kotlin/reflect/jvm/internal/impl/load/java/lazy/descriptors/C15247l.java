package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15247l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f144557a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144558b;

    public C15247l(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f144557a = lazyJavaResolverContext;
        this.f144558b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.Y0(this.f144557a, this.f144558b);
    }
}
