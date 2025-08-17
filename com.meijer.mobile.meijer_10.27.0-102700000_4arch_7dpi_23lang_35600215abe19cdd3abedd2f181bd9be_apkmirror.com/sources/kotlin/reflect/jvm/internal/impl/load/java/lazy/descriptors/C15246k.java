package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15246k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144556a;

    public C15246k(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f144556a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.h1(this.f144556a);
    }
}
