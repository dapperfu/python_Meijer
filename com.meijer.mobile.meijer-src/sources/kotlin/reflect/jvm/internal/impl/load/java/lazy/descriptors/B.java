package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class B implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145344a;

    public B(LazyJavaScope lazyJavaScope) {
        this.f145344a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.H(this.f145344a);
    }
}
