package df;

import java.util.Set;

/* renamed from: df.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC13677d {
    <T> Kf.b<Set<T>> d(C13672A<T> c13672a);

    <T> Kf.b<T> f(C13672A<T> c13672a);

    <T> Kf.a<T> h(C13672A<T> c13672a);

    default <T> T a(Class<T> cls) {
        return (T) c(C13672A.b(cls));
    }

    default <T> Set<T> b(Class<T> cls) {
        return e(C13672A.b(cls));
    }

    default <T> T c(C13672A<T> c13672a) {
        Kf.b<T> bVarF = f(c13672a);
        if (bVarF == null) {
            return null;
        }
        return bVarF.get();
    }

    default <T> Set<T> e(C13672A<T> c13672a) {
        return d(c13672a).get();
    }

    default <T> Kf.b<T> g(Class<T> cls) {
        return f(C13672A.b(cls));
    }

    default <T> Kf.a<T> i(Class<T> cls) {
        return h(C13672A.b(cls));
    }
}
