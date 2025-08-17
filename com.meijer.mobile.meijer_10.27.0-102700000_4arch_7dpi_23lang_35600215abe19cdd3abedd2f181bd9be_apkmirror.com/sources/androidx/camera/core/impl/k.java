package androidx.camera.core.impl;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public interface k {

    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new C5652c(str, cls, obj);
        }

        a() {
        }
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    boolean c(a<?> aVar);

    void d(String str, b bVar);

    <ValueT> ValueT e(a<ValueT> aVar, c cVar);

    Set<a<?>> f();

    Set<c> g(a<?> aVar);

    <ValueT> ValueT h(a<ValueT> aVar, ValueT valuet);

    c i(a<?> aVar);

    static boolean A(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    static void G(s sVar, k kVar, k kVar2, a<?> aVar) {
        if (!Objects.equals(aVar, q.f47459v)) {
            sVar.p(aVar, kVar2.i(aVar), kVar2.a(aVar));
            return;
        }
        R.c cVar = (R.c) kVar2.h(aVar, null);
        sVar.p(aVar, kVar2.i(aVar), G.n.a((R.c) kVar.h(aVar, null), cVar));
    }

    static k P(k kVar, k kVar2) {
        if (kVar == null && kVar2 == null) {
            return t.Z();
        }
        s sVarC0 = kVar2 != null ? s.c0(kVar2) : s.b0();
        if (kVar != null) {
            Iterator<a<?>> it = kVar.f().iterator();
            while (it.hasNext()) {
                G(sVarC0, kVar2, kVar, it.next());
            }
        }
        return t.a0(sVarC0);
    }
}
