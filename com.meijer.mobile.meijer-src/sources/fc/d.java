package fc;

import Db.k;
import Nb.g;
import Xb.a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import ec.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kc.C15116a;
import kc.C15119d;
import kc.e;
import nc.C15929a;
import nc.C15930b;
import nc.C15931c;

/* loaded from: classes4.dex */
public class d implements Wa.b, k, kc.k {

    /* renamed from: n, reason: collision with root package name */
    private static final C13784a f131665n = C13785b.a(d.class.getName());

    /* renamed from: o, reason: collision with root package name */
    static final C13786c f131666o = C13787d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final f f131667a;

    /* renamed from: c, reason: collision with root package name */
    long f131669c;

    /* renamed from: g, reason: collision with root package name */
    private C15119d f131673g;

    /* renamed from: h, reason: collision with root package name */
    public c f131674h;

    /* renamed from: i, reason: collision with root package name */
    private e f131675i;

    /* renamed from: j, reason: collision with root package name */
    private Db.b f131676j;

    /* renamed from: k, reason: collision with root package name */
    private g f131677k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f131678l;

    /* renamed from: m, reason: collision with root package name */
    Map<String, String> f131679m;

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC13975a> f131668b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f131670d = true;

    /* renamed from: e, reason: collision with root package name */
    public AtomicBoolean f131671e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f131672f = new AtomicBoolean(false);

    @Override // Wa.b
    public final void a() {
        this.f131670d = false;
        long jLongValue = f().longValue();
        this.f131669c = jLongValue;
        f131666o.a("Changed to foreground departure interval - default [{}]", Long.valueOf(jLongValue));
    }

    @Override // Wa.b
    public final void b() {
        this.f131670d = true;
        long jLongValue = g().longValue();
        this.f131669c = jLongValue;
        f131666o.a("Changed to background departure interval - default [{}]", Long.valueOf(jLongValue));
    }

    public final synchronized void e() {
        try {
            Gb.f fVarY = this.f131676j.y();
            Gb.f fVar = Gb.f.ON;
            if (fVarY == fVar || (fVarY == Gb.f.NOT_SET && this.f131671e.get())) {
                Gb.f fVarY2 = this.f131676j.y();
                if (fVarY2 != fVar) {
                    if (fVarY2 == Gb.f.NOT_SET && this.f131676j.r()) {
                    }
                }
                if (!this.f131672f.get()) {
                    this.f131673g.e(this);
                    this.f131672f.set(true);
                }
                return;
            }
            if (this.f131672f.get()) {
                this.f131673g.g(this);
                this.f131672f.set(false);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String d(String str, String str2) {
        return str + "_" + str2;
    }

    private Long f() {
        return Long.valueOf(this.f131676j.j() / 1000);
    }

    private Long g() {
        return Long.valueOf(this.f131676j.k() / 1000);
    }

    public d(f fVar, C15119d c15119d, Db.b bVar, Db.e eVar, g gVar, Map<String, String> map, c cVar, e eVar2) {
        this.f131673g = c15119d;
        this.f131676j = bVar;
        this.f131667a = fVar;
        this.f131677k = gVar;
        this.f131679m = map;
        this.f131674h = cVar;
        this.f131675i = eVar2;
        this.f131678l = eVar.f();
        eVar.h(this, "Sightings_Logs");
        bVar.g(this, "allowProximity");
        bVar.g(this, "overrideProximity");
    }

    static Long c(C15929a c15929a) {
        return Long.valueOf(System.currentTimeMillis() - c15929a.e().longValue());
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (!"allowProximity".equals(str) && !"overrideProximity".equals(str)) {
            if ("Sightings_Logs".equals(str)) {
                this.f131678l = ((Boolean) obj).booleanValue();
                return;
            }
            return;
        }
        e();
    }

    @Override // kc.k
    public final void b(C15116a c15116a, C15931c c15931c) {
        C15929a c15929aB;
        Boolean bool;
        Tb.c cVar;
        Integer numA = this.f131675i.a(c15116a.i(), c15931c.c());
        if (numA != null) {
            c15116a.C(numA.intValue());
            Date dateN = c15116a.n();
            if (c15931c.f() != null) {
                for (C15930b c15930b : c15931c.f()) {
                    Boolean bool2 = Boolean.FALSE;
                    synchronized (this.f131667a) {
                        try {
                            c15929aB = this.f131667a.b(d(c15930b.f(), c15931c.c()));
                            Integer numA2 = c15930b.a();
                            Integer numD = c15930b.d();
                            if (numA2 == null) {
                                numA2 = this.f131676j.e().o();
                            }
                            if (numD == null) {
                                numD = this.f131676j.e().x();
                            }
                            if (c15929aB == null) {
                                int i10 = c15116a.i();
                                if (numA2 == null || i10 > numA2.intValue()) {
                                    c15929aB = new C15929a();
                                    c15929aB.E(c15930b.e());
                                    c15929aB.s(d(c15930b.f(), c15931c.c()));
                                    c15929aB.q(Long.valueOf(dateN.getTime()));
                                    c15929aB.r(Integer.valueOf(c15116a.i()));
                                    c15929aB.A(Integer.valueOf(c15116a.i()));
                                    c15929aB.t(a.EnumC0897a.GIMBAL);
                                    if (c15116a.d() != null) {
                                        c15929aB.B(Double.valueOf(c15116a.d()).doubleValue());
                                    }
                                    if (c15116a.e() != null) {
                                        c15929aB.C(Double.valueOf(c15116a.e()).doubleValue());
                                    }
                                    c15929aB.v(Long.valueOf(dateN.getTime()));
                                    if (c15930b.b() == null) {
                                        c15929aB.x(g());
                                    } else {
                                        c15929aB.x(Long.valueOf(c15930b.b().longValue()));
                                    }
                                    if (c15930b.c() == null) {
                                        c15929aB.y(f());
                                    } else {
                                        c15929aB.y(Long.valueOf(c15930b.c().longValue()));
                                    }
                                    c15929aB.F(c15931c.c());
                                    c15929aB.G(UUID.randomUUID().toString());
                                    this.f131667a.c(c15929aB.c(), c15929aB);
                                    c15929aB.c();
                                    c15116a.i();
                                    c15929aB.o();
                                    if (this.f131677k.f20765b && this.f131678l) {
                                        f131666o.e("Received sighting for NEW visit: [{}], [{}], [{}], [{}]", c15929aB.c(), dateN, Integer.valueOf(c15116a.i()), c15929aB.o());
                                    }
                                    bool2 = Boolean.TRUE;
                                }
                                bool = bool2;
                            } else {
                                int i11 = c15116a.i();
                                if (numD != null) {
                                    if (i11 > numD.intValue()) {
                                    }
                                }
                                c15929aB.c();
                                c15116a.i();
                                if (this.f131677k.f20765b && this.f131678l) {
                                    f131666o.c("Received sighting for EXISTING visit: [{}], [{}], [{}]", c15929aB.c(), dateN, Integer.valueOf(c15116a.i()));
                                }
                                c15929aB.A(Integer.valueOf(c15116a.i()));
                                c15929aB.v(Long.valueOf(dateN.getTime()));
                                this.f131667a.c(c15929aB.c(), c15929aB);
                                bool = Boolean.TRUE;
                            }
                            c15929aB = null;
                            bool = bool2;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (bool2.booleanValue()) {
                        Iterator<InterfaceC13975a> it = this.f131668b.iterator();
                        while (it.hasNext()) {
                            it.next().a();
                        }
                        Tb.c cVar2 = this.f131674h.f131664a;
                        if (cVar2 != null) {
                            cVar2.c(c15929aB);
                        }
                    }
                    if (bool.booleanValue() && (cVar = this.f131674h.f131664a) != null) {
                        cVar.b(c15116a, c15931c);
                    }
                }
            }
        }
    }
}
