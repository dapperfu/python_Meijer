package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15349k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145463a;

    public C15349k(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145463a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.h1(this.f145463a);
    }
}
