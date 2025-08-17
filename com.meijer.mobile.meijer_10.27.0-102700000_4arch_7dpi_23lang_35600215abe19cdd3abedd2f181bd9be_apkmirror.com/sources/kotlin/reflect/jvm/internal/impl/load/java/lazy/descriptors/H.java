package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class H implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144450a;

    public H(LazyJavaScope lazyJavaScope) {
        this.f144450a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.u(this.f144450a);
    }
}
