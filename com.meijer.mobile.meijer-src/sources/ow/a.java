package ow;

import java.io.Serializable;

/* loaded from: classes14.dex */
public abstract class a implements mw.c, Serializable {
    private void v(nw.b bVar, mw.f fVar, String str, Throwable th2) {
        u(bVar, fVar, str, null, th2);
    }

    protected abstract void u(nw.b bVar, mw.f fVar, String str, Object[] objArr, Throwable th2);

    private void s(nw.b bVar, mw.f fVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            u(bVar, fVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            u(bVar, fVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void t(nw.b bVar, mw.f fVar, String str, Object[] objArr) {
        Throwable thI = f.i(objArr);
        if (thI != null) {
            u(bVar, fVar, str, f.q(objArr), thI);
        } else {
            u(bVar, fVar, str, objArr, null);
        }
    }

    private void x(nw.b bVar, mw.f fVar, String str, Object obj) {
        u(bVar, fVar, str, new Object[]{obj}, null);
    }

    @Override // mw.c
    public void a(String str) {
        if (d()) {
            v(nw.b.DEBUG, null, str, null);
        }
    }

    @Override // mw.c
    public void c(String str, Object obj, Object obj2) {
        if (d()) {
            s(nw.b.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // mw.c
    public void e(String str, Object... objArr) {
        if (b()) {
            t(nw.b.WARN, null, str, objArr);
        }
    }

    @Override // mw.c
    public void g(String str, Object obj, Object obj2) {
        if (b()) {
            s(nw.b.WARN, null, str, obj, obj2);
        }
    }

    @Override // mw.c
    public void i(String str, Object... objArr) {
        if (o()) {
            t(nw.b.ERROR, null, str, objArr);
        }
    }

    @Override // mw.c
    public void j(String str, Object... objArr) {
        if (d()) {
            t(nw.b.DEBUG, null, str, objArr);
        }
    }

    @Override // mw.c
    public void k(String str, Throwable th2) {
        if (f()) {
            v(nw.b.INFO, null, str, th2);
        }
    }

    @Override // mw.c
    public void l(String str, Object... objArr) {
        if (h()) {
            t(nw.b.TRACE, null, str, objArr);
        }
    }

    @Override // mw.c
    public void n(String str, Object obj) {
        if (f()) {
            x(nw.b.INFO, null, str, obj);
        }
    }

    @Override // mw.c
    public void p(String str, Object obj) {
        if (d()) {
            x(nw.b.DEBUG, null, str, obj);
        }
    }

    @Override // mw.c
    public void q(String str) {
        if (f()) {
            v(nw.b.INFO, null, str, null);
        }
    }

    @Override // mw.c
    public void r(String str, Object... objArr) {
        if (f()) {
            t(nw.b.INFO, null, str, objArr);
        }
    }
}
