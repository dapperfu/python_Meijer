package ow;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes14.dex */
public class m implements mw.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155920a;

    /* renamed from: b, reason: collision with root package name */
    private volatile mw.c f155921b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f155922c;

    /* renamed from: d, reason: collision with root package name */
    private Method f155923d;

    /* renamed from: e, reason: collision with root package name */
    private nw.a f155924e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<nw.d> f155925f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155926g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f155920a.equals(((m) obj).f155920a);
    }

    private mw.c t() {
        if (this.f155924e == null) {
            this.f155924e = new nw.a(this, this.f155925f);
        }
        return this.f155924e;
    }

    public int hashCode() {
        return this.f155920a.hashCode();
    }

    public mw.c s() {
        return this.f155921b != null ? this.f155921b : this.f155926g ? g.f155915a : t();
    }

    public String u() {
        return this.f155920a;
    }

    public boolean v() {
        Boolean bool = this.f155922c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f155923d = this.f155921b.getClass().getMethod("log", nw.c.class);
            this.f155922c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f155922c = Boolean.FALSE;
        }
        return this.f155922c.booleanValue();
    }

    public boolean w() {
        return this.f155921b instanceof g;
    }

    public boolean x() {
        return this.f155921b == null;
    }

    public void z(mw.c cVar) {
        this.f155921b = cVar;
    }

    public m(String str, Queue<nw.d> queue, boolean z10) {
        this.f155920a = str;
        this.f155925f = queue;
        this.f155926g = z10;
    }

    @Override // mw.c
    public void a(String str) {
        s().a(str);
    }

    @Override // mw.c
    public boolean b() {
        return s().b();
    }

    @Override // mw.c
    public void c(String str, Object obj, Object obj2) {
        s().c(str, obj, obj2);
    }

    @Override // mw.c
    public boolean d() {
        return s().d();
    }

    @Override // mw.c
    public void e(String str, Object... objArr) {
        s().e(str, objArr);
    }

    @Override // mw.c
    public boolean f() {
        return s().f();
    }

    @Override // mw.c
    public void g(String str, Object obj, Object obj2) {
        s().g(str, obj, obj2);
    }

    @Override // mw.c
    public boolean h() {
        return s().h();
    }

    @Override // mw.c
    public void i(String str, Object... objArr) {
        s().i(str, objArr);
    }

    @Override // mw.c
    public void j(String str, Object... objArr) {
        s().j(str, objArr);
    }

    @Override // mw.c
    public void k(String str, Throwable th2) {
        s().k(str, th2);
    }

    @Override // mw.c
    public void l(String str, Object... objArr) {
        s().l(str, objArr);
    }

    @Override // mw.c
    public boolean m(nw.b bVar) {
        return s().m(bVar);
    }

    @Override // mw.c
    public void n(String str, Object obj) {
        s().n(str, obj);
    }

    @Override // mw.c
    public boolean o() {
        return s().o();
    }

    @Override // mw.c
    public void p(String str, Object obj) {
        s().p(str, obj);
    }

    @Override // mw.c
    public void q(String str) {
        s().q(str);
    }

    @Override // mw.c
    public void r(String str, Object... objArr) {
        s().r(str, objArr);
    }

    public void y(nw.c cVar) {
        if (v()) {
            try {
                this.f155923d.invoke(this.f155921b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }
}
