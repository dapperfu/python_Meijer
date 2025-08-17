package bf;

import java.util.Set;

/* renamed from: bf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC6246d {
    <T> If.b<Set<T>> b(C6241A<T> c6241a);

    <T> If.a<T> e(C6241A<T> c6241a);

    <T> If.b<T> g(C6241A<T> c6241a);

    default <T> T a(Class<T> cls) {
        return (T) c(C6241A.b(cls));
    }

    default <T> T c(C6241A<T> c6241a) {
        If.b<T> bVarG = g(c6241a);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default <T> Set<T> d(Class<T> cls) {
        return h(C6241A.b(cls));
    }

    default <T> If.b<T> f(Class<T> cls) {
        return g(C6241A.b(cls));
    }

    default <T> Set<T> h(C6241A<T> c6241a) {
        return b(c6241a).get();
    }

    default <T> If.a<T> i(Class<T> cls) {
        return e(C6241A.b(cls));
    }
}
