package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
class D implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144445a;

    public D(LazyJavaScope lazyJavaScope) {
        this.f144445a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.F(this.f144445a, (Name) obj);
    }
}
