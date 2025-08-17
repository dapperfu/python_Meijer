package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class y implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144575a;

    public y(LazyJavaScope lazyJavaScope) {
        this.f144575a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.t(this.f144575a);
    }
}
