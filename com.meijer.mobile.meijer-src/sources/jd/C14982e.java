package jd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Z.C5604b;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC6652i;
import com.google.android.gms.common.internal.C6659p;
import com.google.android.gms.common.internal.C6661s;
import com.google.android.gms.common.internal.C6662t;
import com.google.android.gms.common.internal.C6664v;
import com.google.android.gms.common.internal.C6665w;
import com.google.android.gms.common.internal.InterfaceC6666x;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import id.C14719b;
import id.C14723f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jd.C14987j;

/* renamed from: jd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14982e implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f140308p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f140309q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f140310r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C14982e f140311s;

    /* renamed from: c, reason: collision with root package name */
    private C6664v f140314c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6666x f140315d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f140316e;

    /* renamed from: f, reason: collision with root package name */
    private final C14723f f140317f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.internal.K f140318g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f140325n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f140326o;

    /* renamed from: a, reason: collision with root package name */
    private long f140312a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private boolean f140313b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f140319h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f140320i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f140321j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private C15001y f140322k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f140323l = new C5604b();

    /* renamed from: m, reason: collision with root package name */
    private final Set f140324m = new C5604b();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        H h10 = null;
        switch (i10) {
            case 1:
                this.f140312a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f140325n.removeMessages(12);
                for (C14979b c14979b : this.f140321j.keySet()) {
                    Handler handler = this.f140325n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c14979b), this.f140312a);
                }
                return true;
            case 2:
                p0 p0Var = (p0) message.obj;
                Iterator it = p0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C14979b c14979b2 = (C14979b) it.next();
                        H h11 = (H) this.f140321j.get(c14979b2);
                        if (h11 == null) {
                            p0Var.b(c14979b2, new C14719b(13), null);
                        } else if (h11.N()) {
                            p0Var.b(c14979b2, C14719b.f137521e, h11.t().getEndpointPackageName());
                        } else {
                            C14719b c14719bR = h11.r();
                            if (c14719bR != null) {
                                p0Var.b(c14979b2, c14719bR, null);
                            } else {
                                h11.H(p0Var);
                                h11.C();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (H h12 : this.f140321j.values()) {
                    h12.B();
                    h12.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                W w10 = (W) message.obj;
                H hG = (H) this.f140321j.get(w10.f140291c.getApiKey());
                if (hG == null) {
                    hG = g(w10.f140291c);
                }
                if (!hG.a() || this.f140320i.get() == w10.f140290b) {
                    hG.D(w10.f140289a);
                } else {
                    w10.f140289a.a(f140308p);
                    hG.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C14719b c14719b = (C14719b) message.obj;
                Iterator it2 = this.f140321j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        H h13 = (H) it2.next();
                        if (h13.p() == i11) {
                            h10 = h13;
                        }
                    }
                }
                if (h10 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c14719b.B() == 13) {
                    h10.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f140317f.e(c14719b.B()) + ": " + c14719b.T()));
                } else {
                    h10.e(f(h10.f140251c, c14719b));
                }
                return true;
            case 6:
                if (this.f140316e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C14980c.c((Application) this.f140316e.getApplicationContext());
                    ComponentCallbacks2C14980c.b().a(new C(this));
                    if (!ComponentCallbacks2C14980c.b().e(true)) {
                        this.f140312a = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.d) message.obj);
                return true;
            case 9:
                if (this.f140321j.containsKey(message.obj)) {
                    ((H) this.f140321j.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it3 = this.f140324m.iterator();
                while (it3.hasNext()) {
                    H h14 = (H) this.f140321j.remove((C14979b) it3.next());
                    if (h14 != null) {
                        h14.J();
                    }
                }
                this.f140324m.clear();
                return true;
            case 11:
                if (this.f140321j.containsKey(message.obj)) {
                    ((H) this.f140321j.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f140321j.containsKey(message.obj)) {
                    ((H) this.f140321j.get(message.obj)).b();
                }
                return true;
            case 14:
                C15002z c15002z = (C15002z) message.obj;
                C14979b c14979bA = c15002z.a();
                if (this.f140321j.containsKey(c14979bA)) {
                    c15002z.b().c(Boolean.valueOf(((H) this.f140321j.get(c14979bA)).o(false)));
                } else {
                    c15002z.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                J j10 = (J) message.obj;
                if (this.f140321j.containsKey(j10.f140262a)) {
                    H.z((H) this.f140321j.get(j10.f140262a), j10);
                }
                return true;
            case 16:
                J j11 = (J) message.obj;
                if (this.f140321j.containsKey(j11.f140262a)) {
                    H.A((H) this.f140321j.get(j11.f140262a), j11);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                T t10 = (T) message.obj;
                if (t10.f140284c == 0) {
                    h().c(new C6664v(t10.f140283b, Arrays.asList(t10.f140282a)));
                } else {
                    C6664v c6664v = this.f140314c;
                    if (c6664v != null) {
                        List listT = c6664v.T();
                        if (c6664v.B() != t10.f140283b || (listT != null && listT.size() >= t10.f140285d)) {
                            this.f140325n.removeMessages(17);
                            i();
                        } else {
                            this.f140314c.b0(t10.f140282a);
                        }
                    }
                    if (this.f140314c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t10.f140282a);
                        this.f140314c = new C6664v(t10.f140283b, arrayList);
                        Handler handler2 = this.f140325n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t10.f140284c);
                    }
                }
                return true;
            case 19:
                this.f140313b = false;
                return true;
            default:
                FS.log_w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C14979b c14979b, C14719b c14719b) {
        return new Status(c14719b, "API: " + c14979b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c14719b));
    }

    @ResultIgnorabilityUnspecified
    private final H g(com.google.android.gms.common.api.d dVar) {
        Map map = this.f140321j;
        C14979b apiKey = dVar.getApiKey();
        H h10 = (H) map.get(apiKey);
        if (h10 == null) {
            h10 = new H(this, dVar);
            this.f140321j.put(apiKey, h10);
        }
        if (h10.a()) {
            this.f140324m.add(apiKey);
        }
        h10.C();
        return h10;
    }

    private final InterfaceC6666x h() {
        if (this.f140315d == null) {
            this.f140315d = C6665w.a(this.f140316e);
        }
        return this.f140315d;
    }

    private final void i() {
        C6664v c6664v = this.f140314c;
        if (c6664v != null) {
            if (c6664v.B() > 0 || d()) {
                h().c(c6664v);
            }
            this.f140314c = null;
        }
    }

    private final void j(C5517k c5517k, int i10, com.google.android.gms.common.api.d dVar) {
        S sA;
        if (i10 == 0 || (sA = S.a(this, i10, dVar.getApiKey())) == null) {
            return;
        }
        AbstractC5516j abstractC5516jA = c5517k.a();
        final Handler handler = this.f140325n;
        handler.getClass();
        abstractC5516jA.d(new Executor() { // from class: jd.B
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, sA);
    }

    @ResultIgnorabilityUnspecified
    public static C14982e t(Context context) {
        C14982e c14982e;
        synchronized (f140310r) {
            try {
                if (f140311s == null) {
                    f140311s = new C14982e(context.getApplicationContext(), AbstractC6652i.c().getLooper(), C14723f.m());
                }
                c14982e = f140311s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c14982e;
    }

    public final void C(com.google.android.gms.common.api.d dVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f140325n.sendMessage(this.f140325n.obtainMessage(4, new W(new k0(i10, aVar), this.f140320i.get(), dVar)));
    }

    final void E(C6659p c6659p, int i10, long j10, int i11) {
        this.f140325n.sendMessage(this.f140325n.obtainMessage(18, new T(c6659p, i10, j10, i11)));
    }

    public final void G() {
        Handler handler = this.f140325n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(com.google.android.gms.common.api.d dVar) {
        Handler handler = this.f140325n;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void a(C15001y c15001y) {
        synchronized (f140310r) {
            try {
                if (this.f140322k != c15001y) {
                    this.f140322k = c15001y;
                    this.f140323l.clear();
                }
                this.f140323l.addAll(c15001y.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void b(C15001y c15001y) {
        synchronized (f140310r) {
            try {
                if (this.f140322k == c15001y) {
                    this.f140322k = null;
                    this.f140323l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean d() {
        if (this.f140313b) {
            return false;
        }
        C6662t c6662tA = C6661s.b().a();
        if (c6662tA != null && !c6662tA.b0()) {
            return false;
        }
        int iA = this.f140318g.a(this.f140316e, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean e(C14719b c14719b, int i10) throws Resources.NotFoundException {
        return this.f140317f.w(this.f140316e, c14719b, i10);
    }

    public final int k() {
        return this.f140319h.getAndIncrement();
    }

    final H s(C14979b c14979b) {
        return (H) this.f140321j.get(c14979b);
    }

    @ResultIgnorabilityUnspecified
    public final AbstractC5516j v(com.google.android.gms.common.api.d dVar) {
        C15002z c15002z = new C15002z(dVar.getApiKey());
        this.f140325n.sendMessage(this.f140325n.obtainMessage(14, c15002z));
        return c15002z.b().a();
    }

    public final AbstractC5516j w(com.google.android.gms.common.api.d dVar, AbstractC14991n abstractC14991n, AbstractC14997u abstractC14997u, Runnable runnable) {
        C5517k c5517k = new C5517k();
        j(c5517k, abstractC14991n.e(), dVar);
        this.f140325n.sendMessage(this.f140325n.obtainMessage(8, new W(new l0(new X(abstractC14991n, abstractC14997u, runnable), c5517k), this.f140320i.get(), dVar)));
        return c5517k.a();
    }

    public final AbstractC5516j x(com.google.android.gms.common.api.d dVar, C14987j.a aVar, int i10) {
        C5517k c5517k = new C5517k();
        j(c5517k, i10, dVar);
        this.f140325n.sendMessage(this.f140325n.obtainMessage(13, new W(new n0(aVar, c5517k), this.f140320i.get(), dVar)));
        return c5517k.a();
    }

    private C14982e(Context context, Looper looper, C14723f c14723f) {
        this.f140326o = true;
        this.f140316e = context;
        yd.j jVar = new yd.j(looper, this);
        this.f140325n = jVar;
        this.f140317f = c14723f;
        this.f140318g = new com.google.android.gms.common.internal.K(c14723f);
        if (com.google.android.gms.common.util.j.a(context)) {
            this.f140326o = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public final void D(com.google.android.gms.common.api.d dVar, int i10, AbstractC14995s abstractC14995s, C5517k c5517k, InterfaceC14994q interfaceC14994q) {
        j(c5517k, abstractC14995s.d(), dVar);
        this.f140325n.sendMessage(this.f140325n.obtainMessage(4, new W(new m0(i10, abstractC14995s, c5517k, interfaceC14994q), this.f140320i.get(), dVar)));
    }

    public final void F(C14719b c14719b, int i10) throws Resources.NotFoundException {
        if (!e(c14719b, i10)) {
            Handler handler = this.f140325n;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, c14719b));
        }
    }
}
