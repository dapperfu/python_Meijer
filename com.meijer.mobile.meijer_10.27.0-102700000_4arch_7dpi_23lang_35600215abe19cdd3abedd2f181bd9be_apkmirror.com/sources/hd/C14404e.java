package hd;

import Td.AbstractC5232j;
import Td.C5233k;
import Z.C5504b;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC6527i;
import com.google.android.gms.common.internal.C6534p;
import com.google.android.gms.common.internal.C6536s;
import com.google.android.gms.common.internal.C6537t;
import com.google.android.gms.common.internal.C6539v;
import com.google.android.gms.common.internal.C6540w;
import com.google.android.gms.common.internal.InterfaceC6541x;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import gd.C14243b;
import gd.C14247f;
import hd.C14409j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14404e implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f134619p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    private static final Status f134620q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    private static final Object f134621r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static C14404e f134622s;

    /* renamed from: c, reason: collision with root package name */
    private C6539v f134625c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6541x f134626d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f134627e;

    /* renamed from: f, reason: collision with root package name */
    private final C14247f f134628f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.internal.K f134629g;

    /* renamed from: n, reason: collision with root package name */
    private final Handler f134636n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f134637o;

    /* renamed from: a, reason: collision with root package name */
    private long f134623a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private boolean f134624b = false;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f134630h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f134631i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    private final Map f134632j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    private C14423y f134633k = null;

    /* renamed from: l, reason: collision with root package name */
    private final Set f134634l = new C5504b();

    /* renamed from: m, reason: collision with root package name */
    private final Set f134635m = new C5504b();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        H h10 = null;
        switch (i10) {
            case 1:
                this.f134623a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f134636n.removeMessages(12);
                for (C14401b c14401b : this.f134632j.keySet()) {
                    Handler handler = this.f134636n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c14401b), this.f134623a);
                }
                return true;
            case 2:
                p0 p0Var = (p0) message.obj;
                Iterator it = p0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C14401b c14401b2 = (C14401b) it.next();
                        H h11 = (H) this.f134632j.get(c14401b2);
                        if (h11 == null) {
                            p0Var.b(c14401b2, new C14243b(13), null);
                        } else if (h11.N()) {
                            p0Var.b(c14401b2, C14243b.f133305e, h11.t().getEndpointPackageName());
                        } else {
                            C14243b c14243bR = h11.r();
                            if (c14243bR != null) {
                                p0Var.b(c14401b2, c14243bR, null);
                            } else {
                                h11.H(p0Var);
                                h11.C();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (H h12 : this.f134632j.values()) {
                    h12.B();
                    h12.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                W w10 = (W) message.obj;
                H hG = (H) this.f134632j.get(w10.f134602c.getApiKey());
                if (hG == null) {
                    hG = g(w10.f134602c);
                }
                if (!hG.a() || this.f134631i.get() == w10.f134601b) {
                    hG.D(w10.f134600a);
                } else {
                    w10.f134600a.a(f134619p);
                    hG.J();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C14243b c14243b = (C14243b) message.obj;
                Iterator it2 = this.f134632j.values().iterator();
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
                } else if (c14243b.B() == 13) {
                    h10.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f134628f.e(c14243b.B()) + ": " + c14243b.T()));
                } else {
                    h10.e(f(h10.f134562c, c14243b));
                }
                return true;
            case 6:
                if (this.f134627e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C14402c.c((Application) this.f134627e.getApplicationContext());
                    ComponentCallbacks2C14402c.b().a(new C(this));
                    if (!ComponentCallbacks2C14402c.b().e(true)) {
                        this.f134623a = 300000L;
                    }
                }
                return true;
            case 7:
                g((com.google.android.gms.common.api.d) message.obj);
                return true;
            case 9:
                if (this.f134632j.containsKey(message.obj)) {
                    ((H) this.f134632j.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it3 = this.f134635m.iterator();
                while (it3.hasNext()) {
                    H h14 = (H) this.f134632j.remove((C14401b) it3.next());
                    if (h14 != null) {
                        h14.J();
                    }
                }
                this.f134635m.clear();
                return true;
            case 11:
                if (this.f134632j.containsKey(message.obj)) {
                    ((H) this.f134632j.get(message.obj)).K();
                }
                return true;
            case 12:
                if (this.f134632j.containsKey(message.obj)) {
                    ((H) this.f134632j.get(message.obj)).b();
                }
                return true;
            case 14:
                C14424z c14424z = (C14424z) message.obj;
                C14401b c14401bA = c14424z.a();
                if (this.f134632j.containsKey(c14401bA)) {
                    c14424z.b().c(Boolean.valueOf(((H) this.f134632j.get(c14401bA)).o(false)));
                } else {
                    c14424z.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                J j10 = (J) message.obj;
                if (this.f134632j.containsKey(j10.f134573a)) {
                    H.z((H) this.f134632j.get(j10.f134573a), j10);
                }
                return true;
            case 16:
                J j11 = (J) message.obj;
                if (this.f134632j.containsKey(j11.f134573a)) {
                    H.A((H) this.f134632j.get(j11.f134573a), j11);
                }
                return true;
            case 17:
                i();
                return true;
            case 18:
                T t10 = (T) message.obj;
                if (t10.f134595c == 0) {
                    h().b(new C6539v(t10.f134594b, Arrays.asList(t10.f134593a)));
                } else {
                    C6539v c6539v = this.f134625c;
                    if (c6539v != null) {
                        List listT = c6539v.T();
                        if (c6539v.B() != t10.f134594b || (listT != null && listT.size() >= t10.f134596d)) {
                            this.f134636n.removeMessages(17);
                            i();
                        } else {
                            this.f134625c.c0(t10.f134593a);
                        }
                    }
                    if (this.f134625c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t10.f134593a);
                        this.f134625c = new C6539v(t10.f134594b, arrayList);
                        Handler handler2 = this.f134636n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t10.f134595c);
                    }
                }
                return true;
            case 19:
                this.f134624b = false;
                return true;
            default:
                FS.log_w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status f(C14401b c14401b, C14243b c14243b) {
        return new Status(c14243b, "API: " + c14401b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c14243b));
    }

    @ResultIgnorabilityUnspecified
    private final H g(com.google.android.gms.common.api.d dVar) {
        Map map = this.f134632j;
        C14401b apiKey = dVar.getApiKey();
        H h10 = (H) map.get(apiKey);
        if (h10 == null) {
            h10 = new H(this, dVar);
            this.f134632j.put(apiKey, h10);
        }
        if (h10.a()) {
            this.f134635m.add(apiKey);
        }
        h10.C();
        return h10;
    }

    private final InterfaceC6541x h() {
        if (this.f134626d == null) {
            this.f134626d = C6540w.a(this.f134627e);
        }
        return this.f134626d;
    }

    private final void i() {
        C6539v c6539v = this.f134625c;
        if (c6539v != null) {
            if (c6539v.B() > 0 || d()) {
                h().b(c6539v);
            }
            this.f134625c = null;
        }
    }

    private final void j(C5233k c5233k, int i10, com.google.android.gms.common.api.d dVar) {
        S sA;
        if (i10 == 0 || (sA = S.a(this, i10, dVar.getApiKey())) == null) {
            return;
        }
        AbstractC5232j abstractC5232jA = c5233k.a();
        final Handler handler = this.f134636n;
        handler.getClass();
        abstractC5232jA.d(new Executor() { // from class: hd.B
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, sA);
    }

    @ResultIgnorabilityUnspecified
    public static C14404e t(Context context) {
        C14404e c14404e;
        synchronized (f134621r) {
            try {
                if (f134622s == null) {
                    f134622s = new C14404e(context.getApplicationContext(), AbstractC6527i.c().getLooper(), C14247f.m());
                }
                c14404e = f134622s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c14404e;
    }

    public final void C(com.google.android.gms.common.api.d dVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f134636n.sendMessage(this.f134636n.obtainMessage(4, new W(new k0(i10, aVar), this.f134631i.get(), dVar)));
    }

    final void E(C6534p c6534p, int i10, long j10, int i11) {
        this.f134636n.sendMessage(this.f134636n.obtainMessage(18, new T(c6534p, i10, j10, i11)));
    }

    public final void G() {
        Handler handler = this.f134636n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(com.google.android.gms.common.api.d dVar) {
        Handler handler = this.f134636n;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void a(C14423y c14423y) {
        synchronized (f134621r) {
            try {
                if (this.f134633k != c14423y) {
                    this.f134633k = c14423y;
                    this.f134634l.clear();
                }
                this.f134634l.addAll(c14423y.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void b(C14423y c14423y) {
        synchronized (f134621r) {
            try {
                if (this.f134633k == c14423y) {
                    this.f134633k = null;
                    this.f134634l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean d() {
        if (this.f134624b) {
            return false;
        }
        C6537t c6537tA = C6536s.b().a();
        if (c6537tA != null && !c6537tA.c0()) {
            return false;
        }
        int iA = this.f134629g.a(this.f134627e, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean e(C14243b c14243b, int i10) throws Resources.NotFoundException {
        return this.f134628f.w(this.f134627e, c14243b, i10);
    }

    public final int k() {
        return this.f134630h.getAndIncrement();
    }

    final H s(C14401b c14401b) {
        return (H) this.f134632j.get(c14401b);
    }

    @ResultIgnorabilityUnspecified
    public final AbstractC5232j v(com.google.android.gms.common.api.d dVar) {
        C14424z c14424z = new C14424z(dVar.getApiKey());
        this.f134636n.sendMessage(this.f134636n.obtainMessage(14, c14424z));
        return c14424z.b().a();
    }

    public final AbstractC5232j w(com.google.android.gms.common.api.d dVar, AbstractC14413n abstractC14413n, AbstractC14419u abstractC14419u, Runnable runnable) {
        C5233k c5233k = new C5233k();
        j(c5233k, abstractC14413n.e(), dVar);
        this.f134636n.sendMessage(this.f134636n.obtainMessage(8, new W(new l0(new X(abstractC14413n, abstractC14419u, runnable), c5233k), this.f134631i.get(), dVar)));
        return c5233k.a();
    }

    public final AbstractC5232j x(com.google.android.gms.common.api.d dVar, C14409j.a aVar, int i10) {
        C5233k c5233k = new C5233k();
        j(c5233k, i10, dVar);
        this.f134636n.sendMessage(this.f134636n.obtainMessage(13, new W(new n0(aVar, c5233k), this.f134631i.get(), dVar)));
        return c5233k.a();
    }

    private C14404e(Context context, Looper looper, C14247f c14247f) {
        this.f134637o = true;
        this.f134627e = context;
        wd.j jVar = new wd.j(looper, this);
        this.f134636n = jVar;
        this.f134628f = c14247f;
        this.f134629g = new com.google.android.gms.common.internal.K(c14247f);
        if (com.google.android.gms.common.util.j.a(context)) {
            this.f134637o = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    public final void D(com.google.android.gms.common.api.d dVar, int i10, AbstractC14417s abstractC14417s, C5233k c5233k, InterfaceC14416q interfaceC14416q) {
        j(c5233k, abstractC14417s.d(), dVar);
        this.f134636n.sendMessage(this.f134636n.obtainMessage(4, new W(new m0(i10, abstractC14417s, c5233k, interfaceC14416q), this.f134631i.get(), dVar)));
    }

    public final void F(C14243b c14243b, int i10) throws Resources.NotFoundException {
        if (!e(c14243b, i10)) {
            Handler handler = this.f134636n;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, c14243b));
        }
    }
}
