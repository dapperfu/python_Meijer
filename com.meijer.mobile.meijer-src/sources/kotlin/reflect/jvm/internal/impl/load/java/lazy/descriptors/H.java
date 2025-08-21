package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class H implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145357a;

    public H(LazyJavaScope lazyJavaScope) {
        this.f145357a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.u(this.f145357a);
    }
}
