package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15248m implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144559a;

    public C15248m(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f144559a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.U0(this.f144559a);
    }
}
