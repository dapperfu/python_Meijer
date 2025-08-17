package sw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes13.dex */
public class m implements qw.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f161336a;

    /* renamed from: b, reason: collision with root package name */
    private volatile qw.c f161337b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f161338c;

    /* renamed from: d, reason: collision with root package name */
    private Method f161339d;

    /* renamed from: e, reason: collision with root package name */
    private rw.a f161340e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<rw.d> f161341f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f161342g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f161336a.equals(((m) obj).f161336a);
    }

    private qw.c s() {
        if (this.f161340e == null) {
            this.f161340e = new rw.a(this, this.f161341f);
        }
        return this.f161340e;
    }

    public int hashCode() {
        return this.f161336a.hashCode();
    }

    public qw.c r() {
        return this.f161337b != null ? this.f161337b : this.f161342g ? g.f161331a : s();
    }

    public String t() {
        return this.f161336a;
    }

    public boolean u() {
        Boolean bool = this.f161338c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f161339d = this.f161337b.getClass().getMethod("log", rw.c.class);
            this.f161338c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f161338c = Boolean.FALSE;
        }
        return this.f161338c.booleanValue();
    }

    public boolean v() {
        return this.f161337b instanceof g;
    }

    public boolean w() {
        return this.f161337b == null;
    }

    public void y(qw.c cVar) {
        this.f161337b = cVar;
    }

    public m(String str, Queue<rw.d> queue, boolean z10) {
        this.f161336a = str;
        this.f161341f = queue;
        this.f161342g = z10;
    }

    @Override // qw.c
    public void a(String str) {
        r().a(str);
    }

    @Override // qw.c
    public void c(String str, Object obj, Object obj2) {
        r().c(str, obj, obj2);
    }

    @Override // qw.c
    public boolean d() {
        return r().d();
    }

    @Override // qw.c
    public void e(String str, Object... objArr) {
        r().e(str, objArr);
    }

    @Override // qw.c
    public void g(String str, Object obj, Object obj2) {
        r().g(str, obj, obj2);
    }

    @Override // qw.c
    public boolean h() {
        return r().h();
    }

    @Override // qw.c
    public void i(String str, Object... objArr) {
        r().i(str, objArr);
    }

    @Override // qw.c
    public void j(String str, Object... objArr) {
        r().j(str, objArr);
    }

    @Override // qw.c
    public void k(String str, Throwable th2) {
        r().k(str, th2);
    }

    @Override // qw.c
    public void l(String str, Object... objArr) {
        r().l(str, objArr);
    }

    @Override // qw.c
    public void m(String str, Object obj) {
        r().m(str, obj);
    }

    @Override // qw.c
    public void o(String str, Object obj) {
        r().o(str, obj);
    }

    @Override // qw.c
    public void p(String str) {
        r().p(str);
    }

    @Override // qw.c
    public void q(String str, Object... objArr) {
        r().q(str, objArr);
    }

    public void x(rw.c cVar) {
        if (u()) {
            try {
                this.f161339d.invoke(this.f161337b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }
}
