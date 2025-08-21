package mw;

/* loaded from: classes14.dex */
public interface c {
    void a(String str);

    boolean b();

    void c(String str, Object obj, Object obj2);

    boolean d();

    void e(String str, Object... objArr);

    boolean f();

    void g(String str, Object obj, Object obj2);

    boolean h();

    void i(String str, Object... objArr);

    void j(String str, Object... objArr);

    void k(String str, Throwable th2);

    void l(String str, Object... objArr);

    void n(String str, Object obj);

    boolean o();

    void p(String str, Object obj);

    void q(String str);

    void r(String str, Object... objArr);

    default boolean m(nw.b bVar) {
        int iB = bVar.b();
        if (iB != 0) {
            if (iB != 10) {
                if (iB != 20) {
                    if (iB != 30) {
                        if (iB == 40) {
                            return o();
                        }
                        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
                    }
                    return b();
                }
                return f();
            }
            return d();
        }
        return h();
    }
}
