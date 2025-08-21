package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class F implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145355a;

    public F(LazyJavaScope lazyJavaScope) {
        this.f145355a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.I(this.f145355a);
    }
}
