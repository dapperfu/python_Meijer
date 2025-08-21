package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15350l implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f145464a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145465b;

    public C15350l(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145464a = lazyJavaResolverContext;
        this.f145465b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.Y0(this.f145464a, this.f145465b);
    }
}
