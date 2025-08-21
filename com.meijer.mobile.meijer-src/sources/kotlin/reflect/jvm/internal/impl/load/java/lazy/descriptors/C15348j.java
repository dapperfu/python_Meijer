package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15348j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145461a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f145462b;

    public C15348j(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f145461a = lazyJavaClassMemberScope;
        this.f145462b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.D0(this.f145461a, this.f145462b);
    }
}
