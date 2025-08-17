package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class G implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144449a;

    public G(LazyJavaScope lazyJavaScope) {
        this.f144449a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.X(this.f144449a);
    }
}
