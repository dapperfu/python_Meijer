package dc;

import Bb.k;
import Lb.g;
import Vb.a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import cc.f;
import ic.C14713a;
import ic.C14716d;
import ic.e;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.C15395a;
import lc.C15396b;
import lc.C15397c;

/* loaded from: classes4.dex */
public class d implements Ua.b, k, ic.k {

    /* renamed from: n, reason: collision with root package name */
    private static final C6380a f127336n = C6381b.a(d.class.getName());

    /* renamed from: o, reason: collision with root package name */
    static final C6382c f127337o = C6383d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final f f127338a;

    /* renamed from: c, reason: collision with root package name */
    long f127340c;

    /* renamed from: g, reason: collision with root package name */
    private C14716d f127344g;

    /* renamed from: h, reason: collision with root package name */
    public c f127345h;

    /* renamed from: i, reason: collision with root package name */
    private e f127346i;

    /* renamed from: j, reason: collision with root package name */
    private Bb.b f127347j;

    /* renamed from: k, reason: collision with root package name */
    private g f127348k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f127349l;

    /* renamed from: m, reason: collision with root package name */
    Map<String, String> f127350m;

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC13502a> f127339b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f127341d = true;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f127342e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f127343f = new AtomicBoolean(false);

    @Override // Ua.b
    public final void a() {
        this.f127341d = false;
        long jLongValue = f().longValue();
        this.f127340c = jLongValue;
        f127337o.a("Changed to foreground departure interval - default [{}]", Long.valueOf(jLongValue));
    }

    @Override // Ua.b
    public final void b() {
        this.f127341d = true;
        long jLongValue = g().longValue();
        this.f127340c = jLongValue;
        f127337o.a("Changed to background departure interval - default [{}]", Long.valueOf(jLongValue));
    }

    public final synchronized void e() {
        try {
            Eb.f fVarY = this.f127347j.y();
            Eb.f fVar = Eb.f.ON;
            if (fVarY == fVar || (fVarY == Eb.f.NOT_SET && this.f127342e.get())) {
                Eb.f fVarY2 = this.f127347j.y();
                if (fVarY2 != fVar) {
                    if (fVarY2 == Eb.f.NOT_SET && this.f127347j.r()) {
                    }
                }
                if (!this.f127343f.get()) {
                    this.f127344g.e(this);
                    this.f127343f.set(true);
                }
                return;
            }
            if (this.f127343f.get()) {
                this.f127344g.g(this);
                this.f127343f.set(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String d(String str, String str2) {
        return str + "_" + str2;
    }

    private Long f() {
        return Long.valueOf(this.f127347j.j() / 1000);
    }

    private Long g() {
        return Long.valueOf(this.f127347j.k() / 1000);
    }

    public d(f fVar, C14716d c14716d, Bb.b bVar, Bb.e eVar, g gVar, Map<String, String> map, c cVar, e eVar2) {
        this.f127344g = c14716d;
        this.f127347j = bVar;
        this.f127338a = fVar;
        this.f127348k = gVar;
        this.f127350m = map;
        this.f127345h = cVar;
        this.f127346i = eVar2;
        this.f127349l = eVar.f();
        eVar.h(this, "Sightings_Logs");
        bVar.g(this, "allowProximity");
        bVar.g(this, "overrideProximity");
    }

    static Long c(C15395a c15395a) {
        return Long.valueOf(System.currentTimeMillis() - c15395a.e().longValue());
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (!"allowProximity".equals(str) && !"overrideProximity".equals(str)) {
            if ("Sightings_Logs".equals(str)) {
                this.f127349l = ((Boolean) obj).booleanValue();
                return;
            }
            return;
        }
        e();
    }

    @Override // ic.k
    public final void b(C14713a c14713a, C15397c c15397c) {
        C15395a c15395aB;
        Boolean bool;
        Rb.c cVar;
        Integer numA = this.f127346i.a(c14713a.i(), c15397c.c());
        if (numA != null) {
            c14713a.C(numA.intValue());
            Date dateN = c14713a.n();
            if (c15397c.f() != null) {
                for (C15396b c15396b : c15397c.f()) {
                    Boolean bool2 = Boolean.FALSE;
                    synchronized (this.f127338a) {
                        try {
                            c15395aB = this.f127338a.b(d(c15396b.f(), c15397c.c()));
                            Integer numA2 = c15396b.a();
                            Integer numD = c15396b.d();
                            if (numA2 == null) {
                                numA2 = this.f127347j.e().o();
                            }
                            if (numD == null) {
                                numD = this.f127347j.e().x();
                            }
                            if (c15395aB == null) {
                                int i10 = c14713a.i();
                                if (numA2 == null || i10 > numA2.intValue()) {
                                    c15395aB = new C15395a();
                                    c15395aB.E(c15396b.e());
                                    c15395aB.s(d(c15396b.f(), c15397c.c()));
                                    c15395aB.q(Long.valueOf(dateN.getTime()));
                                    c15395aB.r(Integer.valueOf(c14713a.i()));
                                    c15395aB.A(Integer.valueOf(c14713a.i()));
                                    c15395aB.t(a.EnumC0807a.GIMBAL);
                                    if (c14713a.d() != null) {
                                        c15395aB.B(Double.valueOf(c14713a.d()).doubleValue());
                                    }
                                    if (c14713a.e() != null) {
                                        c15395aB.C(Double.valueOf(c14713a.e()).doubleValue());
                                    }
                                    c15395aB.v(Long.valueOf(dateN.getTime()));
                                    if (c15396b.b() == null) {
                                        c15395aB.x(g());
                                    } else {
                                        c15395aB.x(Long.valueOf(c15396b.b().longValue()));
                                    }
                                    if (c15396b.c() == null) {
                                        c15395aB.y(f());
                                    } else {
                                        c15395aB.y(Long.valueOf(c15396b.c().longValue()));
                                    }
                                    c15395aB.F(c15397c.c());
                                    c15395aB.G(UUID.randomUUID().toString());
                                    this.f127338a.c(c15395aB.c(), c15395aB);
                                    c15395aB.c();
                                    c14713a.i();
                                    c15395aB.o();
                                    if (this.f127348k.f17945b && this.f127349l) {
                                        f127337o.e("Received sighting for NEW visit: [{}], [{}], [{}], [{}]", c15395aB.c(), dateN, Integer.valueOf(c14713a.i()), c15395aB.o());
                                    }
                                    bool2 = Boolean.TRUE;
                                }
                                bool = bool2;
                            } else {
                                int i11 = c14713a.i();
                                if (numD != null) {
                                    if (i11 > numD.intValue()) {
                                    }
                                }
                                c15395aB.c();
                                c14713a.i();
                                if (this.f127348k.f17945b && this.f127349l) {
                                    f127337o.c("Received sighting for EXISTING visit: [{}], [{}], [{}]", c15395aB.c(), dateN, Integer.valueOf(c14713a.i()));
                                }
                                c15395aB.A(Integer.valueOf(c14713a.i()));
                                c15395aB.v(Long.valueOf(dateN.getTime()));
                                this.f127338a.c(c15395aB.c(), c15395aB);
                                bool = Boolean.TRUE;
                            }
                            c15395aB = null;
                            bool = bool2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bool2.booleanValue()) {
                        Iterator<InterfaceC13502a> it = this.f127339b.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                        Rb.c cVar2 = this.f127345h.f127335a;
                        if (cVar2 != null) {
                            cVar2.d(c15395aB);
                        }
                    }
                    if (bool.booleanValue() && (cVar = this.f127345h.f127335a) != null) {
                        cVar.b(c14713a, c15397c);
                    }
                }
            }
        }
    }
}
