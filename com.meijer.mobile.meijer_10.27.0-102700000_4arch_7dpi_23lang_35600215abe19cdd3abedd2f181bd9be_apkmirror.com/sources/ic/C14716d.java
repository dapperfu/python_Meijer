package ic;

import cb.C6380a;
import cb.C6381b;
import cc.C6384a;
import com.google.android.gms.common.api.a;
import db.C13501a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.C15133a;
import lc.C15397c;
import ob.C16010a;

/* renamed from: ic.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14716d implements Vb.i, l {

    /* renamed from: g, reason: collision with root package name */
    private static C6380a f137699g = C6381b.a(C14716d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final kc.d f137700a;

    /* renamed from: d, reason: collision with root package name */
    private Vb.j f137703d;

    /* renamed from: f, reason: collision with root package name */
    private Vb.b f137705f;

    /* renamed from: b, reason: collision with root package name */
    private final n f137701b = Xb.a.a().f39190d;

    /* renamed from: c, reason: collision with root package name */
    private a f137702c = new a(C13501a.c().f127322p);

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f137704e = new AtomicBoolean(false);

    /* renamed from: ic.d$a */
    protected class a extends Bb.g<k> {

        /* renamed from: b, reason: collision with root package name */
        C16010a f137706b;

        public a(C16010a c16010a) {
            this.f137706b = c16010a;
        }

        @Override // Bb.g
        public final void l() {
            C14716d.this.f();
        }

        @Override // Bb.g
        public final void o() {
            C14716d.this.a();
        }
    }

    public final synchronized void a() {
        if (this.f137703d != null && this.f137702c.n() > 0 && !this.f137704e.get() && this.f137703d.g()) {
            this.f137703d.f();
            this.f137704e.set(true);
            Vb.b bVar = this.f137705f;
            if (bVar != null) {
                bVar.e(this);
            }
        }
    }

    @Override // ic.l
    public final synchronized void b(C14713a c14713a, C15397c c15397c) {
        try {
            c14713a.g();
            c15397c.c();
            c15397c.getName();
            n nVar = this.f137701b;
            String strC = c15397c.c();
            boolean z10 = true;
            if (nVar.f137732b > 0) {
                Long l10 = nVar.f137731a.get(strC);
                if (l10 != null && System.currentTimeMillis() - l10.longValue() < nVar.f137732b) {
                    z10 = false;
                }
                if (z10) {
                    nVar.f137731a.put(strC, Long.valueOf(System.currentTimeMillis()));
                }
            }
            if (z10) {
                if (c15397c.g() == -70) {
                    c15397c.t(Integer.valueOf(a.e.API_PRIORITY_OTHER));
                }
                a aVar = this.f137702c;
                C16010a c16010a = aVar.f137706b;
                if (c16010a.f153228a && c16010a.f153229b) {
                    if (c16010a.f153230c.e().o() == null && c16010a.f153230c.e().x() == null) {
                        C16010a.f153227d.d("Sighted '{}' with RSSI [{}]. Configured Arrival RSSI [{}], configured Departure RSSI [{}]", c15397c.getName(), Integer.valueOf(c14713a.i()), "ANY", "ANY");
                    } else {
                        C16010a.f153227d.d("Sighted '{}' with RSSI [{}]. Configured Arrival RSSI [{}], configured Departure RSSI [{}]", c15397c.getName(), Integer.valueOf(c14713a.i()), c16010a.f153230c.e().o(), c16010a.f153230c.e().x());
                    }
                }
                Iterator<k> it = aVar.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().b(c14713a, c15397c);
                    } catch (Exception unused) {
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void d(C14713a c14713a, String str) {
        this.f137700a.a(c14713a, str);
    }

    public final synchronized void e(k kVar) {
        this.f137702c.a(kVar);
    }

    public final synchronized void f() {
        if (this.f137703d != null && this.f137704e.get()) {
            this.f137703d.e();
            this.f137704e.set(false);
        }
    }

    public final synchronized void g(k kVar) {
        this.f137702c.m(kVar);
    }

    public final void c(Vb.j jVar) {
        if (this.f137703d == null) {
            this.f137703d = jVar;
            return;
        }
        f();
        this.f137703d = jVar;
        a();
    }

    public C14716d(cc.e eVar, Map<String, String> map) {
        this.f137700a = new C15133a(this, new C6384a(), eVar, map);
    }

    @Override // Vb.i
    public final void a(int i10) {
        if (this.f137703d != null) {
            if (i10 == 10) {
                f();
            } else if (i10 == 12) {
                a();
            }
        }
    }
}
