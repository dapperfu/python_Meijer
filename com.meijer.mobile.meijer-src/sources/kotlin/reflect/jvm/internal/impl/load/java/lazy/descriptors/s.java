package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145474a;

    public s(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145474a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaClassMemberScope.j1(this.f145474a);
    }
}
