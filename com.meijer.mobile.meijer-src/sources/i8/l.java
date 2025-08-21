package i8;

import android.app.Activity;
import android.app.Application;
import android.location.Location;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import i8.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l8.InterfaceC15473a;
import m8.C15689d;
import m8.C15691f;
import m8.C15693h;
import m8.EnumC15686a;
import n8.C15920a;
import o8.C16086a;
import o8.InterfaceC16087b;
import org.json.JSONException;
import org.json.JSONObject;
import q8.C16610a;
import q8.C16611b;
import t8.C17206b;
import u8.InterfaceC17360a;
import v7.C17645b;
import w8.C17850a;
import x8.InterfaceC18133a;
import y8.InterfaceC18295a;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static C16610a f137295i;

    /* renamed from: r, reason: collision with root package name */
    private static C15920a f137304r;

    /* renamed from: a, reason: collision with root package name */
    private static final String f137287a = x.f137411a + "Core";

    /* renamed from: b, reason: collision with root package name */
    private static final B8.b f137288b = new B8.b();

    /* renamed from: c, reason: collision with root package name */
    private static final F8.e f137289c = new F8.e();

    /* renamed from: d, reason: collision with root package name */
    private static final G8.b f137290d = new G8.b();

    /* renamed from: e, reason: collision with root package name */
    private static final D8.b f137291e = new D8.b();

    /* renamed from: f, reason: collision with root package name */
    private static final M8.f f137292f = new M8.f();

    /* renamed from: g, reason: collision with root package name */
    public static final y f137293g = new y();

    /* renamed from: h, reason: collision with root package name */
    private static final C15693h f137294h = new C15693h();

    /* renamed from: j, reason: collision with root package name */
    private static C14698e f137296j = null;

    /* renamed from: k, reason: collision with root package name */
    private static long f137297k = 12;

    /* renamed from: l, reason: collision with root package name */
    private static f f137298l = new f(12);

    /* renamed from: m, reason: collision with root package name */
    static g f137299m = new g(f137298l);

    /* renamed from: n, reason: collision with root package name */
    static C17645b f137300n = null;

    /* renamed from: o, reason: collision with root package name */
    private static AtomicBoolean f137301o = new AtomicBoolean(true);

    /* renamed from: p, reason: collision with root package name */
    private static C14695b f137302p = C14695b.e();

    /* renamed from: q, reason: collision with root package name */
    private static n f137303q = new n(f137299m);

    /* renamed from: s, reason: collision with root package name */
    private static J8.b f137305s = null;

    /* renamed from: t, reason: collision with root package name */
    private static InterfaceC15473a f137306t = null;

    /* renamed from: u, reason: collision with root package name */
    private static InterfaceC17360a f137307u = null;

    /* renamed from: v, reason: collision with root package name */
    private static InterfaceC18295a f137308v = null;

    /* renamed from: w, reason: collision with root package name */
    private static u7.e f137309w = null;

    /* renamed from: x, reason: collision with root package name */
    private static InterfaceC18133a f137310x = null;

    /* renamed from: y, reason: collision with root package name */
    private static L7.c f137311y = null;

    /* renamed from: z, reason: collision with root package name */
    private static p8.c f137312z = null;

    class a implements M8.j {
        @Override // M8.j
        public M8.c b() {
            return null;
        }

        a() {
        }

        @Override // M8.j
        public M8.d a(Window window) {
            final View rootView = window.getDecorView().getRootView();
            return new M8.d() { // from class: i8.k
                @Override // M8.d
                public final void a(MotionEvent motionEvent) {
                    l.f137308v.a(rootView, motionEvent);
                }
            };
        }
    }

    static void A(Application application, Activity activity, final C15689d c15689d, InterfaceC18133a interfaceC18133a) {
        m8.n nVar;
        InterfaceC17360a interfaceC17360a;
        f137310x = interfaceC18133a;
        if (c15689d.f150785v) {
            x.f137412b = true;
        }
        if (x.f137412b) {
            String str = f137287a;
            z8.f.u(str, "startup configuration: " + c15689d);
            z8.f.y(str, String.format("%s %s Target API %d Android API %d", C14695b.a(), D.a(), Integer.valueOf(z8.f.c(application)), Integer.valueOf(Build.VERSION.SDK_INT)));
            if (activity != null) {
                z8.f.u(str, "agent started within activity '" + activity.getClass().getName() + "'");
            }
        }
        p8.c cVar = new p8.c(application);
        f137312z = cVar;
        cVar.n();
        r.c0(c15689d);
        f137302p.i(c15689d, application);
        m8.q qVarD = f137302p.f137220d.d(new m8.l().a(c15689d), c15689d.f150789z);
        if (qVarD.E()) {
            f137310x.init();
            f137293g.b(interfaceC18133a.a());
            f137309w = interfaceC18133a.f();
            f137306t = interfaceC18133a.c();
            f137307u = interfaceC18133a.g();
            if (C15691f.a()) {
                f137308v = interfaceC18133a.b();
            }
            f137300n = interfaceC18133a.d();
        } else {
            z8.f.a("dtxStartStop", "RUM powered by Grail deactivated");
        }
        f137311y = new L7.c(new x8.h().a(), c15689d.f150763D, new Function1() { // from class: i8.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.b(c15689d, (Integer) obj);
            }
        });
        g(qVarD);
        if (c15689d.f150787x) {
            nVar = new m8.n(f137302p.f137220d.i());
        } else {
            f137302p.f137220d.k();
            nVar = m8.n.f150835b;
        }
        C14695b.f137212j = c15689d.f150765b;
        C17850a.h();
        if (f137301o.get()) {
            p8.b.x(nVar, qVarD.E());
        } else {
            z8.f.r();
            p8.b.v(nVar, qVarD.E());
        }
        f137294h.b(Boolean.valueOf(qVarD.E()));
        C16610a c16610a = new C16610a(application);
        f137295i = c16610a;
        c16610a.c(c15689d.f150765b);
        f137296j = new C14698e(c15689d.f150760A);
        C16611b.e().start();
        f137298l.c(f137297k);
        f137299m.J(f137295i, c15689d, null, f137306t);
        if (c15689d.f150777n) {
            C16086a.e();
            C16086a.h(m());
        }
        if (c15689d.f150776m) {
            f137288b.a(application, C14693B.f137207c);
        }
        f137291e.c(application);
        if (c15689d.f150775l) {
            f137289c.b(application, C14693B.f137207c);
        }
        f137290d.a(application);
        if (qVarD.E() && (interfaceC17360a = f137307u) != null) {
            interfaceC17360a.a();
        }
        ArrayList arrayList = new ArrayList();
        if (qVarD.E() && f137308v != null) {
            arrayList.add(new a());
        }
        if (c15689d.f150761B) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C17206b());
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            C14693B c14693b = C14693B.f137207c;
            f137305s = new J8.b(arrayList2, scheduledExecutorServiceNewScheduledThreadPool, c14693b);
            arrayList.add(new K8.c(f137305s, c14693b));
        }
        f137292f.a(application, activity, arrayList);
        if (c15689d.f150783t) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            String[] strArr = c15689d.f150781r;
            if (strArr != null) {
                Collections.addAll(hashSet, strArr);
            }
            String[] strArr2 = c15689d.f150782s;
            if (strArr2 != null) {
                Collections.addAll(hashSet2, strArr2);
            }
            if (c15689d.f150767d == EnumC15686a.APP_MON) {
                if (c15689d.a().startsWith("https://")) {
                    hashSet2.add(c15689d.a());
                } else {
                    hashSet.add(c15689d.a());
                }
            }
            if (c15689d.f150784u) {
                hashSet.add("file://");
            }
            f137304r = new C15920a(hashSet, hashSet2, c15689d.f150784u, c15689d.f150767d);
        }
        y(false, nVar);
        u7.e eVar = f137309w;
        if (eVar != null) {
            eVar.a(qVarD);
        }
        f137299m.I(true);
        x.f137413c.set(true);
        f137301o.set(false);
    }

    public static /* synthetic */ Unit b(C15689d c15689d, Integer num) {
        A8.b.a("EventThrottling", String.format("Dropped %d events, current limit: %d", num, Integer.valueOf(c15689d.f150763D)));
        return Unit.f143329a;
    }

    static p d(String str, int i10, long j10, q qVar, p8.b bVar, int i11, String... strArr) {
        p pVar = qVar;
        if (x.f137412b) {
            z8.f.u(f137287a, String.format("Handle event name=%s type=%s", str, Integer.valueOf(i10)));
        }
        long j11 = j10 < 0 ? 0L : j10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 20) {
                        if (i10 != 21) {
                            switch (i10) {
                                case 6:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f137391h, j11, bVar, i11, true);
                                        pVar.f137324a = z8.f.s(strArr[0], 250);
                                        f137298l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 7:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f137392i, j11, bVar, i11, true);
                                        pVar.f137324a = z8.f.s(strArr[0], 250);
                                        f137298l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 8:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f137390g, j11, bVar, i11, true);
                                        pVar.f137324a = z8.f.s(strArr[0], 250);
                                        f137298l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                case 9:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f137398o, j11, bVar, i11, true ^ bVar.o());
                                        pVar.f137324a = z8.f.s(strArr[0], 250);
                                        f137298l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 10:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new v(str, strArr[0], strArr[1], strArr[2], j11, bVar, i11, strArr[3], !bVar.o());
                                        f137298l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 11:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new o(str, strArr[0], strArr[1], bVar, i11, strArr[2], !bVar.o());
                                        f137298l.b();
                                        C16086a.f(strArr[2], str, strArr[0], strArr[1]);
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 12:
                                    pVar = new p(str, 12, w.f137401r, j11, bVar, i11, true ^ bVar.o());
                                    f137298l.b();
                                    break;
                                default:
                                    if (x.f137412b) {
                                        z8.f.u(f137287a, String.format("addEvent invalid type: %d", Integer.valueOf(i10)));
                                    }
                                    pVar = null;
                                    break;
                            }
                        } else {
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            pVar = new o(str, strArr[0], strArr[1], bVar, i11, strArr[2], true);
                            f137298l.b();
                            C16086a.f(strArr[2], str, strArr[0], strArr[1]);
                        }
                    } else {
                        if (str == null || str.isEmpty()) {
                            return null;
                        }
                        pVar = new v(str, strArr[0], strArr[1], strArr[2], j11, bVar, i11, strArr[3], true);
                        f137298l.b();
                    }
                } else {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    pVar = new p(str, 4, w.f137389f, j11, bVar, i11, true);
                    f137298l.b();
                }
            } else if (pVar != null) {
                pVar.B();
            }
        } else if (pVar != null) {
            f137298l.a(pVar);
        }
        u(pVar, i10);
        return pVar;
    }

    public static void e(A7.a aVar) {
        f137299m.t(aVar);
    }

    public static void f(m8.q qVar) {
        f137299m.x(qVar);
    }

    static void g(m8.q qVar) {
        f137302p.j(qVar);
        long jW = (qVar.w() + 9) / 10;
        f137297k = jW;
        f137298l.c(jW);
        if (x.f137412b) {
            z8.f.u(f137287a, String.format("Send event timeout set to: %s ticks", Long.valueOf(jW)));
        }
        if (qVar.G()) {
            int iX = qVar.x();
            C14695b.e().f137219c = iX;
            InterfaceC15473a interfaceC15473a = f137306t;
            if (interfaceC15473a != null) {
                interfaceC15473a.b(iX);
            }
        }
    }

    private static JSONObject h(String str) throws JSONException {
        if (str != null && !str.isEmpty()) {
            if (str.length() > 250) {
                str = str.substring(0, 250);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dt.rum.user_tag", str);
                z8.f.a("dtxEventGeneration", "identifyUser event was generated: " + jSONObject);
                return jSONObject;
            } catch (JSONException unused) {
                z8.f.a("dtxEventGeneration", "identifyUser event can't be generated");
            }
        }
        return null;
    }

    static void i() {
        if (f137295i == null) {
            return;
        }
        C16611b.e().b();
        f137298l.e();
        f137299m.r();
    }

    public static void j(String str) {
        if (x.f137412b) {
            z8.f.u(f137287a, String.format("%s ... force closed actions due to %s", Thread.currentThread().getName(), str));
        }
        C14694a.a();
        r.S();
    }

    public static f k() {
        return f137298l;
    }

    static boolean l() {
        return f137299m.C();
    }

    static InterfaceC16087b m() {
        return f137303q;
    }

    static String n(p8.b bVar) {
        return f137296j.b(bVar).toString();
    }

    static void p(p pVar) {
        if (pVar.f137331h.f().e(pVar.f())) {
            L7.c cVar = f137311y;
            if (cVar == null || !cVar.a()) {
                if (x.f137412b) {
                    z8.f.u(f137287a, "Dropped event due to throttling");
                }
            } else {
                String string = pVar.b().toString();
                f137296j.d(false);
                String strN = n(pVar.f137331h);
                if (x.f137412b) {
                    z8.f.u(f137287a, String.format("Store %dbytes", Integer.valueOf(strN.length() + string.length())));
                }
                C16611b.e().a(new C16611b.a(strN, string, pVar.f137331h, pVar.f().e(), pVar.n(), pVar.k(), C14695b.f137212j));
            }
        }
    }

    public static void q(p pVar) {
        f137298l.f(pVar);
    }

    public static void r(final p8.b bVar) {
        z8.f.a("dtxEventGeneration", "reportUserTag, session: " + bVar.j());
        d(bVar.j(), 12, 0L, null, bVar, C14695b.e().f137219c, new String[0]);
        f137293g.a(bVar, new y.a() { // from class: i8.j
            @Override // i8.y.a
            public final void a(u7.h hVar) throws JSONException {
                l.a(bVar, hVar);
            }
        });
    }

    public static synchronized void s() {
        j("resetLifecycle");
        z8.f.r();
    }

    private static void u(p pVar, int i10) {
        if (pVar != null && pVar.s() && pVar.r()) {
            if (f137296j != null) {
                p(pVar);
                if (p.f137322s.get() == 0) {
                    p.f137322s.set(1);
                }
            } else if (x.f137412b) {
                z8.f.u(f137287a, "discarded");
            }
            if (i10 == 2) {
                f137298l.f(pVar);
            }
        }
    }

    static void v(Location location) {
        X7.b bVarE;
        if (x.f137412b && location != null) {
            z8.f.u(f137287a, String.format("SetGpsCoord Lat:%s Lon:%s", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        }
        C17850a.h().p(location);
        InterfaceC18133a interfaceC18133a = f137310x;
        if (interfaceC18133a == null || (bVarE = interfaceC18133a.e()) == null) {
            return;
        }
        bVarE.w(location);
    }

    static synchronized void w(long j10) {
        try {
            x.f137413c.set(false);
            p8.c cVar = f137312z;
            if (cVar != null) {
                cVar.k();
            }
            Application application = (Application) C14695b.e().d();
            f137290d.b(application);
            f137289c.a(application);
            InterfaceC17360a interfaceC17360a = f137307u;
            if (interfaceC17360a != null) {
                interfaceC17360a.b();
            }
            InterfaceC18133a interfaceC18133a = f137310x;
            if (interfaceC18133a != null) {
                interfaceC18133a.shutdown();
            }
            f137288b.b(application);
            f137291e.d(application);
            f137292f.b(application);
            f137305s = null;
            C16611b.e().f();
            f137299m.G(j10);
            f137310x = null;
            f137293g.c();
            f137309w = null;
            f137306t = null;
            f137307u = null;
            f137300n = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void x(p8.b bVar, boolean z10) {
        J8.b bVar2;
        if (z10) {
            s();
        }
        int iX = C14695b.e().f().x();
        C14695b.e().f137219c = iX;
        InterfaceC15473a interfaceC15473a = f137306t;
        if (interfaceC15473a != null) {
            interfaceC15473a.b(iX);
        }
        f137296j.d(true);
        if (C14695b.e().f137221e) {
            if (!z10) {
                f137304r.a();
            }
            f137304r.b(bVar, C14695b.f137212j);
        }
        if (C14695b.e().c().f150761B && (bVar2 = f137305s) != null) {
            bVar2.c(bVar);
        }
        m8.n nVarF = bVar.f();
        w wVar = w.f137388e;
        if (nVarF.e(wVar)) {
            r rVar = new r("Loading " + C14695b.f137213k, bVar, iX, true);
            rVar.B();
            rVar.f137345u = z8.f.f();
            rVar.f137333j = wVar;
            t(rVar);
        }
        f137299m.H(bVar);
        i();
        f137302p.b();
        f137294h.b(Boolean.valueOf(bVar.o()));
    }

    public static void z(boolean z10, m8.n nVar, long j10) {
        long jA;
        boolean z11;
        if (x.f137412b) {
            z8.f.u(f137287a, "new session with " + nVar.c().toString());
        }
        if (nVar.d()) {
            int iL = f137312z.l() + 1;
            jA = f137312z.m();
            if (jA == 0) {
                jA = p8.f.a();
                z11 = true;
            } else {
                z11 = false;
            }
            p8.b bVarB = p8.b.b();
            i = (bVarB == null || bVarB.f156193b == jA) ? 0 : 1;
            if (z11 || (z10 && i != 0)) {
                C14695b.e().h(false);
            }
            f137312z.p(iL, jA);
            i = iL;
        } else {
            jA = p8.f.a();
            f137312z.p(0, 0L);
            C14695b.e().h(true);
            v(null);
        }
        p8.b bVarU = z10 ? p8.b.u(nVar, j10) : p8.b.w(nVar);
        bVarU.f156193b = jA;
        bVarU.f156194c = i;
        if (!z10) {
            bVarU.l(nVar);
        }
        x(bVarU, z10);
    }

    public static /* synthetic */ void a(p8.b bVar, u7.h hVar) throws JSONException {
        JSONObject jSONObjectH = h(bVar.j());
        if (jSONObjectH != null) {
            hVar.a(jSONObjectH, C14693B.a(), 0L, x8.f.a(bVar), true, null);
        }
    }

    static void o(p8.b bVar) {
        if (C14695b.e().f137221e) {
            f137304r.c(bVar);
        }
    }

    public static void t(p pVar) {
        u(pVar, pVar.p());
    }

    public static void y(boolean z10, m8.n nVar) {
        z(z10, nVar, C14693B.a());
    }
}
