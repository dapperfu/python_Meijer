package kc;

import com.google.android.gms.common.api.a;
import eb.C13784a;
import eb.C13785b;
import ec.C13788a;
import fb.C13974a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.C15704a;
import nc.C15931c;
import qb.C16618a;

/* renamed from: kc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15119d implements Xb.i, l {

    /* renamed from: g, reason: collision with root package name */
    private static C13784a f141788g = C13785b.a(C15119d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final mc.d f141789a;

    /* renamed from: d, reason: collision with root package name */
    private Xb.j f141792d;

    /* renamed from: f, reason: collision with root package name */
    private Xb.b f141794f;

    /* renamed from: b, reason: collision with root package name */
    private final n f141790b = Zb.a.a().f43668d;

    /* renamed from: c, reason: collision with root package name */
    private a f141791c = new a(C13974a.c().f131651p);

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f141793e = new AtomicBoolean(false);

    /* renamed from: kc.d$a */
    protected class a extends Db.g<k> {

        /* renamed from: b, reason: collision with root package name */
        C16618a f141795b;

        public a(C16618a c16618a) {
            this.f141795b = c16618a;
        }

        @Override // Db.g
        public final void l() {
            C15119d.this.f();
        }

        @Override // Db.g
        public final void o() {
            C15119d.this.a();
        }
    }

    public final synchronized void a() {
        if (this.f141792d != null && this.f141791c.n() > 0 && !this.f141793e.get() && this.f141792d.g()) {
            this.f141792d.f();
            this.f141793e.set(true);
            Xb.b bVar = this.f141794f;
            if (bVar != null) {
                bVar.e(this);
            }
        }
    }

    @Override // kc.l
    public final synchronized void b(C15116a c15116a, C15931c c15931c) {
        try {
            c15116a.g();
            c15931c.c();
            c15931c.getName();
            n nVar = this.f141790b;
            String strC = c15931c.c();
            boolean z10 = true;
            if (nVar.f141821b > 0) {
                Long l10 = nVar.f141820a.get(strC);
                if (l10 != null && System.currentTimeMillis() - l10.longValue() < nVar.f141821b) {
                    z10 = false;
                }
                if (z10) {
                    nVar.f141820a.put(strC, Long.valueOf(System.currentTimeMillis()));
                }
            }
            if (z10) {
                if (c15931c.g() == -70) {
                    c15931c.t(Integer.valueOf(a.e.API_PRIORITY_OTHER));
                }
                a aVar = this.f141791c;
                C16618a c16618a = aVar.f141795b;
                if (c16618a.f158080a && c16618a.f158081b) {
                    if (c16618a.f158082c.e().o() == null && c16618a.f158082c.e().x() == null) {
                        C16618a.f158079d.d("Sighted '{}' with RSSI [{}]. Configured Arrival RSSI [{}], configured Departure RSSI [{}]", c15931c.getName(), Integer.valueOf(c15116a.i()), "ANY", "ANY");
                    } else {
                        C16618a.f158079d.d("Sighted '{}' with RSSI [{}]. Configured Arrival RSSI [{}], configured Departure RSSI [{}]", c15931c.getName(), Integer.valueOf(c15116a.i()), c16618a.f158082c.e().o(), c16618a.f158082c.e().x());
                    }
                }
                Iterator<k> it = aVar.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().b(c15116a, c15931c);
                    } catch (Exception unused) {
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void d(C15116a c15116a, String str) {
        this.f141789a.a(c15116a, str);
    }

    public final synchronized void e(k kVar) {
        this.f141791c.a(kVar);
    }

    public final synchronized void f() {
        if (this.f141792d != null && this.f141793e.get()) {
            this.f141792d.e();
            this.f141793e.set(false);
        }
    }

    public final synchronized void g(k kVar) {
        this.f141791c.m(kVar);
    }

    public final void c(Xb.j jVar) {
        if (this.f141792d == null) {
            this.f141792d = jVar;
            return;
        }
        f();
        this.f141792d = jVar;
        a();
    }

    public C15119d(ec.e eVar, Map<String, String> map) {
        this.f141789a = new C15704a(this, new C13788a(), eVar, map);
    }

    @Override // Xb.i
    public final void a(int i10) {
        if (this.f141792d != null) {
            if (i10 == 10) {
                f();
            } else if (i10 == 12) {
                a();
            }
        }
    }
}
