package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class F implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144448a;

    public F(LazyJavaScope lazyJavaScope) {
        this.f144448a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.I(this.f144448a);
    }
}
