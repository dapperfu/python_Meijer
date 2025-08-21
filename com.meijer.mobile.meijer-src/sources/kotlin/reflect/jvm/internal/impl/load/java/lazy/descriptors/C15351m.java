package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15351m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145466a;

    public C15351m(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145466a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.U0(this.f145466a);
    }
}
