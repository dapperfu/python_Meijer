package androidx.camera.core.impl;

import androidx.camera.core.impl.k;
import java.util.Set;

/* loaded from: classes.dex */
public interface v extends k {
    k b();

    @Override // androidx.camera.core.impl.k
    default <ValueT> ValueT a(k.a<ValueT> aVar) {
        return (ValueT) b().a(aVar);
    }

    @Override // androidx.camera.core.impl.k
    default boolean c(k.a<?> aVar) {
        return b().c(aVar);
    }

    @Override // androidx.camera.core.impl.k
    default void d(String str, k.b bVar) {
        b().d(str, bVar);
    }

    @Override // androidx.camera.core.impl.k
    default <ValueT> ValueT e(k.a<ValueT> aVar, k.c cVar) {
        return (ValueT) b().e(aVar, cVar);
    }

    @Override // androidx.camera.core.impl.k
    default Set<k.a<?>> f() {
        return b().f();
    }

    @Override // androidx.camera.core.impl.k
    default Set<k.c> g(k.a<?> aVar) {
        return b().g(aVar);
    }

    @Override // androidx.camera.core.impl.k
    default <ValueT> ValueT h(k.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) b().h(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.k
    default k.c i(k.a<?> aVar) {
        return b().i(aVar);
    }
}
