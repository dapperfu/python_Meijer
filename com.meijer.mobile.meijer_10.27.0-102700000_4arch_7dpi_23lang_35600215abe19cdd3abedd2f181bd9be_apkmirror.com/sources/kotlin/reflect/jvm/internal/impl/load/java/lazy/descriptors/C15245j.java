package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15245j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144554a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f144555b;

    public C15245j(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f144554a = lazyJavaClassMemberScope;
        this.f144555b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.D0(this.f144554a, this.f144555b);
    }
}
