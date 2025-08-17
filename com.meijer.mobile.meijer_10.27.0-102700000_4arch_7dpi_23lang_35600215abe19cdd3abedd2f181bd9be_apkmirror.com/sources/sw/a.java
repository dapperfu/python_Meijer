package sw;

import java.io.Serializable;

/* loaded from: classes13.dex */
public abstract class a implements qw.c, Serializable {
    private void u(rw.b bVar, qw.e eVar, String str, Throwable th2) {
        t(bVar, eVar, str, null, th2);
    }

    protected abstract void t(rw.b bVar, qw.e eVar, String str, Object[] objArr, Throwable th2);

    private void r(rw.b bVar, qw.e eVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            t(bVar, eVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            t(bVar, eVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void s(rw.b bVar, qw.e eVar, String str, Object[] objArr) {
        Throwable thI = f.i(objArr);
        if (thI != null) {
            t(bVar, eVar, str, f.q(objArr), thI);
        } else {
            t(bVar, eVar, str, objArr, null);
        }
    }

    private void v(rw.b bVar, qw.e eVar, String str, Object obj) {
        t(bVar, eVar, str, new Object[]{obj}, null);
    }

    @Override // qw.c
    public void a(String str) {
        if (d()) {
            u(rw.b.DEBUG, null, str, null);
        }
    }

    @Override // qw.c
    public void c(String str, Object obj, Object obj2) {
        if (d()) {
            r(rw.b.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // qw.c
    public void e(String str, Object... objArr) {
        if (b()) {
            s(rw.b.WARN, null, str, objArr);
        }
    }

    @Override // qw.c
    public void g(String str, Object obj, Object obj2) {
        if (b()) {
            r(rw.b.WARN, null, str, obj, obj2);
        }
    }

    @Override // qw.c
    public void i(String str, Object... objArr) {
        if (n()) {
            s(rw.b.ERROR, null, str, objArr);
        }
    }

    @Override // qw.c
    public void j(String str, Object... objArr) {
        if (d()) {
            s(rw.b.DEBUG, null, str, objArr);
        }
    }

    @Override // qw.c
    public void k(String str, Throwable th2) {
        if (f()) {
            u(rw.b.INFO, null, str, th2);
        }
    }

    @Override // qw.c
    public void l(String str, Object... objArr) {
        if (h()) {
            s(rw.b.TRACE, null, str, objArr);
        }
    }

    @Override // qw.c
    public void m(String str, Object obj) {
        if (f()) {
            v(rw.b.INFO, null, str, obj);
        }
    }

    @Override // qw.c
    public void o(String str, Object obj) {
        if (d()) {
            v(rw.b.DEBUG, null, str, obj);
        }
    }

    @Override // qw.c
    public void p(String str) {
        if (f()) {
            u(rw.b.INFO, null, str, null);
        }
    }

    @Override // qw.c
    public void q(String str, Object... objArr) {
        if (f()) {
            s(rw.b.INFO, null, str, objArr);
        }
    }
}
