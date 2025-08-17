package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class B implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144437a;

    public B(LazyJavaScope lazyJavaScope) {
        this.f144437a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.H(this.f144437a);
    }
}
