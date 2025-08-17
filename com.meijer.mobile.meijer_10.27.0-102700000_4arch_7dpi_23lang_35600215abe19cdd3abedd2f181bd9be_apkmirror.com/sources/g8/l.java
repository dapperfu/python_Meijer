package g8;

import android.app.Activity;
import android.app.Application;
import android.location.Location;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import g8.y;
import j8.InterfaceC14874a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.C15118d;
import k8.C15120f;
import k8.C15122h;
import k8.EnumC15115a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l8.C15386a;
import m8.C15576a;
import m8.InterfaceC15577b;
import o8.C16002a;
import o8.C16003b;
import org.json.JSONException;
import org.json.JSONObject;
import r8.C16732b;
import s8.InterfaceC16913a;
import t7.C17070b;
import u8.C17233a;
import v8.InterfaceC17521a;
import w8.InterfaceC17802a;
import y7.AbstractC18186a;
import y8.C18189b;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: i, reason: collision with root package name */
    public static C16002a f133079i;

    /* renamed from: r, reason: collision with root package name */
    private static C15386a f133088r;

    /* renamed from: a, reason: collision with root package name */
    private static final String f133071a = x.f133195a + "Core";

    /* renamed from: b, reason: collision with root package name */
    private static final z8.b f133072b = new z8.b();

    /* renamed from: c, reason: collision with root package name */
    private static final D8.e f133073c = new D8.e();

    /* renamed from: d, reason: collision with root package name */
    private static final E8.b f133074d = new E8.b();

    /* renamed from: e, reason: collision with root package name */
    private static final B8.b f133075e = new B8.b();

    /* renamed from: f, reason: collision with root package name */
    private static final K8.f f133076f = new K8.f();

    /* renamed from: g, reason: collision with root package name */
    public static final y f133077g = new y();

    /* renamed from: h, reason: collision with root package name */
    private static final C15122h f133078h = new C15122h();

    /* renamed from: j, reason: collision with root package name */
    private static C14222e f133080j = null;

    /* renamed from: k, reason: collision with root package name */
    private static long f133081k = 12;

    /* renamed from: l, reason: collision with root package name */
    private static f f133082l = new f(12);

    /* renamed from: m, reason: collision with root package name */
    static g f133083m = new g(f133082l);

    /* renamed from: n, reason: collision with root package name */
    static C17070b f133084n = null;

    /* renamed from: o, reason: collision with root package name */
    private static AtomicBoolean f133085o = new AtomicBoolean(true);

    /* renamed from: p, reason: collision with root package name */
    private static C14219b f133086p = C14219b.e();

    /* renamed from: q, reason: collision with root package name */
    private static n f133087q = new n(f133083m);

    /* renamed from: s, reason: collision with root package name */
    private static H8.b f133089s = null;

    /* renamed from: t, reason: collision with root package name */
    private static InterfaceC14874a f133090t = null;

    /* renamed from: u, reason: collision with root package name */
    private static InterfaceC16913a f133091u = null;

    /* renamed from: v, reason: collision with root package name */
    private static InterfaceC17802a f133092v = null;

    /* renamed from: w, reason: collision with root package name */
    private static s7.e f133093w = null;

    /* renamed from: x, reason: collision with root package name */
    private static InterfaceC17521a f133094x = null;

    /* renamed from: y, reason: collision with root package name */
    private static J7.c f133095y = null;

    /* renamed from: z, reason: collision with root package name */
    private static n8.c f133096z = null;

    class a implements K8.j {
        @Override // K8.j
        public K8.c b() {
            return null;
        }

        a() {
        }

        @Override // K8.j
        public K8.d a(Window window) {
            final View rootView = window.getDecorView().getRootView();
            return new K8.d() { // from class: g8.k
                @Override // K8.d
                public final void a(MotionEvent motionEvent) {
                    l.f133092v.a(rootView, motionEvent);
                }
            };
        }
    }

    static void A(Application application, Activity activity, final C15118d c15118d, InterfaceC17521a interfaceC17521a) {
        k8.n nVar;
        InterfaceC16913a interfaceC16913a;
        f133094x = interfaceC17521a;
        if (c15118d.f141639v) {
            x.f133196b = true;
        }
        if (x.f133196b) {
            String str = f133071a;
            x8.f.u(str, "startup configuration: " + c15118d);
            x8.f.y(str, String.format("%s %s Target API %d Android API %d", C14219b.a(), D.a(), Integer.valueOf(x8.f.c(application)), Integer.valueOf(Build.VERSION.SDK_INT)));
            if (activity != null) {
                x8.f.u(str, "agent started within activity '" + activity.getClass().getName() + "'");
            }
        }
        n8.c cVar = new n8.c(application);
        f133096z = cVar;
        cVar.n();
        r.c0(c15118d);
        f133086p.i(c15118d, application);
        k8.q qVarD = f133086p.f133004d.d(new k8.l().a(c15118d), c15118d.f141643z);
        if (qVarD.E()) {
            f133094x.init();
            f133077g.b(interfaceC17521a.a());
            f133093w = interfaceC17521a.f();
            f133090t = interfaceC17521a.c();
            f133091u = interfaceC17521a.g();
            if (C15120f.a()) {
                f133092v = interfaceC17521a.b();
            }
            f133084n = interfaceC17521a.d();
        } else {
            x8.f.a("dtxStartStop", "RUM powered by Grail deactivated");
        }
        f133095y = new J7.c(new v8.h().a(), c15118d.f141617D, new Function1() { // from class: g8.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.b(c15118d, (Integer) obj);
            }
        });
        g(qVarD);
        if (c15118d.f141641x) {
            nVar = new k8.n(f133086p.f133004d.i());
        } else {
            f133086p.f133004d.k();
            nVar = k8.n.f141689b;
        }
        C14219b.f132996j = c15118d.f141619b;
        C17233a.h();
        if (f133085o.get()) {
            n8.b.x(nVar, qVarD.E());
        } else {
            x8.f.r();
            n8.b.v(nVar, qVarD.E());
        }
        f133078h.b(Boolean.valueOf(qVarD.E()));
        C16002a c16002a = new C16002a(application);
        f133079i = c16002a;
        c16002a.c(c15118d.f141619b);
        f133080j = new C14222e(c15118d.f141614A);
        C16003b.e().start();
        f133082l.c(f133081k);
        f133083m.J(f133079i, c15118d, null, f133090t);
        if (c15118d.f141631n) {
            C15576a.e();
            C15576a.h(m());
        }
        if (c15118d.f141630m) {
            f133072b.a(application, C14217B.f132991c);
        }
        f133075e.c(application);
        if (c15118d.f141629l) {
            f133073c.b(application, C14217B.f132991c);
        }
        f133074d.a(application);
        if (qVarD.E() && (interfaceC16913a = f133091u) != null) {
            interfaceC16913a.a();
        }
        ArrayList arrayList = new ArrayList();
        if (qVarD.E() && f133092v != null) {
            arrayList.add(new a());
        }
        if (c15118d.f141615B) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C16732b());
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            C14217B c14217b = C14217B.f132991c;
            f133089s = new H8.b(arrayList2, scheduledExecutorServiceNewScheduledThreadPool, c14217b);
            arrayList.add(new I8.c(f133089s, c14217b));
        }
        f133076f.a(application, activity, arrayList);
        if (c15118d.f141637t) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            String[] strArr = c15118d.f141635r;
            if (strArr != null) {
                Collections.addAll(hashSet, strArr);
            }
            String[] strArr2 = c15118d.f141636s;
            if (strArr2 != null) {
                Collections.addAll(hashSet2, strArr2);
            }
            if (c15118d.f141621d == EnumC15115a.APP_MON) {
                if (c15118d.a().startsWith("https://")) {
                    hashSet2.add(c15118d.a());
                } else {
                    hashSet.add(c15118d.a());
                }
            }
            if (c15118d.f141638u) {
                hashSet.add("file://");
            }
            f133088r = new C15386a(hashSet, hashSet2, c15118d.f141638u, c15118d.f141621d);
        }
        y(false, nVar);
        s7.e eVar = f133093w;
        if (eVar != null) {
            eVar.a(qVarD);
        }
        f133083m.I(true);
        x.f133197c.set(true);
        f133085o.set(false);
    }

    public static /* synthetic */ Unit b(C15118d c15118d, Integer num) {
        C18189b.a("EventThrottling", String.format("Dropped %d events, current limit: %d", num, Integer.valueOf(c15118d.f141617D)));
        return Unit.f142422a;
    }

    static p d(String str, int i10, long j10, q qVar, n8.b bVar, int i11, String... strArr) {
        p pVar = qVar;
        if (x.f133196b) {
            x8.f.u(f133071a, String.format("Handle event name=%s type=%s", str, Integer.valueOf(i10)));
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
                                        pVar = new p(str, 6, w.f133175h, j11, bVar, i11, true);
                                        pVar.f133108a = x8.f.s(strArr[0], 250);
                                        f133082l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 7:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f133176i, j11, bVar, i11, true);
                                        pVar.f133108a = x8.f.s(strArr[0], 250);
                                        f133082l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 8:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f133174g, j11, bVar, i11, true);
                                        pVar.f133108a = x8.f.s(strArr[0], 250);
                                        f133082l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                case 9:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new p(str, 6, w.f133182o, j11, bVar, i11, true ^ bVar.o());
                                        pVar.f133108a = x8.f.s(strArr[0], 250);
                                        f133082l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 10:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new v(str, strArr[0], strArr[1], strArr[2], j11, bVar, i11, strArr[3], !bVar.o());
                                        f133082l.b();
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 11:
                                    if (str != null && !str.isEmpty()) {
                                        pVar = new o(str, strArr[0], strArr[1], bVar, i11, strArr[2], !bVar.o());
                                        f133082l.b();
                                        C15576a.f(strArr[2], str, strArr[0], strArr[1]);
                                        break;
                                    } else {
                                        return null;
                                    }
                                    break;
                                case 12:
                                    pVar = new p(str, 12, w.f133185r, j11, bVar, i11, true ^ bVar.o());
                                    f133082l.b();
                                    break;
                                default:
                                    if (x.f133196b) {
                                        x8.f.u(f133071a, String.format("addEvent invalid type: %d", Integer.valueOf(i10)));
                                    }
                                    pVar = null;
                                    break;
                            }
                        } else {
                            if (str == null || str.isEmpty()) {
                                return null;
                            }
                            pVar = new o(str, strArr[0], strArr[1], bVar, i11, strArr[2], true);
                            f133082l.b();
                            C15576a.f(strArr[2], str, strArr[0], strArr[1]);
                        }
                    } else {
                        if (str == null || str.isEmpty()) {
                            return null;
                        }
                        pVar = new v(str, strArr[0], strArr[1], strArr[2], j11, bVar, i11, strArr[3], true);
                        f133082l.b();
                    }
                } else {
                    if (str == null || str.isEmpty()) {
                        return null;
                    }
                    pVar = new p(str, 4, w.f133173f, j11, bVar, i11, true);
                    f133082l.b();
                }
            } else if (pVar != null) {
                pVar.B();
            }
        } else if (pVar != null) {
            f133082l.a(pVar);
        }
        u(pVar, i10);
        return pVar;
    }

    public static void e(AbstractC18186a abstractC18186a) {
        f133083m.t(abstractC18186a);
    }

    public static void f(k8.q qVar) {
        f133083m.x(qVar);
    }

    static void g(k8.q qVar) {
        f133086p.j(qVar);
        long jW = (qVar.w() + 9) / 10;
        f133081k = jW;
        f133082l.c(jW);
        if (x.f133196b) {
            x8.f.u(f133071a, String.format("Send event timeout set to: %s ticks", Long.valueOf(jW)));
        }
        if (qVar.G()) {
            int iX = qVar.x();
            C14219b.e().f133003c = iX;
            InterfaceC14874a interfaceC14874a = f133090t;
            if (interfaceC14874a != null) {
                interfaceC14874a.b(iX);
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
                x8.f.a("dtxEventGeneration", "identifyUser event was generated: " + jSONObject);
                return jSONObject;
            } catch (JSONException unused) {
                x8.f.a("dtxEventGeneration", "identifyUser event can't be generated");
            }
        }
        return null;
    }

    static void i() {
        if (f133079i == null) {
            return;
        }
        C16003b.e().b();
        f133082l.e();
        f133083m.r();
    }

    public static void j(String str) {
        if (x.f133196b) {
            x8.f.u(f133071a, String.format("%s ... force closed actions due to %s", Thread.currentThread().getName(), str));
        }
        C14218a.a();
        r.S();
    }

    public static f k() {
        return f133082l;
    }

    static boolean l() {
        return f133083m.C();
    }

    static InterfaceC15577b m() {
        return f133087q;
    }

    static String n(n8.b bVar) {
        return f133080j.b(bVar).toString();
    }

    static void p(p pVar) {
        if (pVar.f133115h.f().e(pVar.f())) {
            J7.c cVar = f133095y;
            if (cVar == null || !cVar.a()) {
                if (x.f133196b) {
                    x8.f.u(f133071a, "Dropped event due to throttling");
                }
            } else {
                String string = pVar.b().toString();
                f133080j.d(false);
                String strN = n(pVar.f133115h);
                if (x.f133196b) {
                    x8.f.u(f133071a, String.format("Store %dbytes", Integer.valueOf(strN.length() + string.length())));
                }
                C16003b.e().a(new C16003b.a(strN, string, pVar.f133115h, pVar.f().e(), pVar.n(), pVar.k(), C14219b.f132996j));
            }
        }
    }

    public static void q(p pVar) {
        f133082l.f(pVar);
    }

    public static void r(final n8.b bVar) {
        x8.f.a("dtxEventGeneration", "reportUserTag, session: " + bVar.j());
        d(bVar.j(), 12, 0L, null, bVar, C14219b.e().f133003c, new String[0]);
        f133077g.a(bVar, new y.a() { // from class: g8.j
            @Override // g8.y.a
            public final void a(s7.h hVar) throws JSONException {
                l.a(bVar, hVar);
            }
        });
    }

    public static synchronized void s() {
        j("resetLifecycle");
        x8.f.r();
    }

    private static void u(p pVar, int i10) {
        if (pVar != null && pVar.s() && pVar.r()) {
            if (f133080j != null) {
                p(pVar);
                if (p.f133106s.get() == 0) {
                    p.f133106s.set(1);
                }
            } else if (x.f133196b) {
                x8.f.u(f133071a, "discarded");
            }
            if (i10 == 2) {
                f133082l.f(pVar);
            }
        }
    }

    static void v(Location location) {
        V7.b bVarE;
        if (x.f133196b && location != null) {
            x8.f.u(f133071a, String.format("SetGpsCoord Lat:%s Lon:%s", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        }
        C17233a.h().p(location);
        InterfaceC17521a interfaceC17521a = f133094x;
        if (interfaceC17521a == null || (bVarE = interfaceC17521a.e()) == null) {
            return;
        }
        bVarE.w(location);
    }

    static synchronized void w(long j10) {
        try {
            x.f133197c.set(false);
            n8.c cVar = f133096z;
            if (cVar != null) {
                cVar.k();
            }
            Application application = (Application) C14219b.e().d();
            f133074d.b(application);
            f133073c.a(application);
            InterfaceC16913a interfaceC16913a = f133091u;
            if (interfaceC16913a != null) {
                interfaceC16913a.b();
            }
            InterfaceC17521a interfaceC17521a = f133094x;
            if (interfaceC17521a != null) {
                interfaceC17521a.shutdown();
            }
            f133072b.b(application);
            f133075e.d(application);
            f133076f.b(application);
            f133089s = null;
            C16003b.e().f();
            f133083m.G(j10);
            f133094x = null;
            f133077g.c();
            f133093w = null;
            f133090t = null;
            f133091u = null;
            f133084n = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void x(n8.b bVar, boolean z10) {
        H8.b bVar2;
        if (z10) {
            s();
        }
        int iX = C14219b.e().f().x();
        C14219b.e().f133003c = iX;
        InterfaceC14874a interfaceC14874a = f133090t;
        if (interfaceC14874a != null) {
            interfaceC14874a.b(iX);
        }
        f133080j.d(true);
        if (C14219b.e().f133005e) {
            if (!z10) {
                f133088r.a();
            }
            f133088r.b(bVar, C14219b.f132996j);
        }
        if (C14219b.e().c().f141615B && (bVar2 = f133089s) != null) {
            bVar2.c(bVar);
        }
        k8.n nVarF = bVar.f();
        w wVar = w.f133172e;
        if (nVarF.e(wVar)) {
            r rVar = new r("Loading " + C14219b.f132997k, bVar, iX, true);
            rVar.B();
            rVar.f133129u = x8.f.f();
            rVar.f133117j = wVar;
            t(rVar);
        }
        f133083m.H(bVar);
        i();
        f133086p.b();
        f133078h.b(Boolean.valueOf(bVar.o()));
    }

    public static void z(boolean z10, k8.n nVar, long j10) {
        long jA;
        boolean z11;
        if (x.f133196b) {
            x8.f.u(f133071a, "new session with " + nVar.c().toString());
        }
        if (nVar.d()) {
            int iL = f133096z.l() + 1;
            jA = f133096z.m();
            if (jA == 0) {
                jA = n8.e.a();
                z11 = true;
            } else {
                z11 = false;
            }
            n8.b bVarB = n8.b.b();
            i = (bVarB == null || bVarB.f151062b == jA) ? 0 : 1;
            if (z11 || (z10 && i != 0)) {
                C14219b.e().h(false);
            }
            f133096z.p(iL, jA);
            i = iL;
        } else {
            jA = n8.e.a();
            f133096z.p(0, 0L);
            C14219b.e().h(true);
            v(null);
        }
        n8.b bVarU = z10 ? n8.b.u(nVar, j10) : n8.b.w(nVar);
        bVarU.f151062b = jA;
        bVarU.f151063c = i;
        if (!z10) {
            bVarU.l(nVar);
        }
        x(bVarU, z10);
    }

    public static /* synthetic */ void a(n8.b bVar, s7.h hVar) throws JSONException {
        JSONObject jSONObjectH = h(bVar.j());
        if (jSONObjectH != null) {
            hVar.b(jSONObjectH, C14217B.a(), 0L, v8.f.a(bVar), true, null);
        }
    }

    static void o(n8.b bVar) {
        if (C14219b.e().f133005e) {
            f133088r.c(bVar);
        }
    }

    public static void t(p pVar) {
        u(pVar, pVar.p());
    }

    public static void y(boolean z10, k8.n nVar) {
        z(z10, nVar, C14217B.a());
    }
}
