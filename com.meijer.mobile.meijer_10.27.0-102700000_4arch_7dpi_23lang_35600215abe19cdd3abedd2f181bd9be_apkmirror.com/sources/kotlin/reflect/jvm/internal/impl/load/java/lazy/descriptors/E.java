package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
class E implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaScope f144447a;

    public E(LazyJavaScope lazyJavaScope) {
        this.f144447a = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.J(this.f144447a, (Name) obj);
    }
}
