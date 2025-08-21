package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15352n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145467a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f145468b;

    public C15352n(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f145467a = lazyJavaClassMemberScope;
        this.f145468b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.i1(this.f145467a, this.f145468b, (Name) obj);
    }
}
