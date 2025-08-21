package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
class E implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f145354a;

    public E(LazyJavaScope lazyJavaScope) {
        this.f145354a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.J(this.f145354a, (Name) obj);
    }
}
