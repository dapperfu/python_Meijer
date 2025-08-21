package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class G implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145356a;

    public G(LazyJavaScope lazyJavaScope) {
        this.f145356a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaScope.X(this.f145356a);
    }
}
