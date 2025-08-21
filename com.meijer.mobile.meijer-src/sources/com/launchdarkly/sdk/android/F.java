package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.ConnectionInformation;
import com.launchdarkly.sdk.android.LDFailure;
import com.launchdarkly.sdk.android.m0;
import com.launchdarkly.sdk.android.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jh.AbstractC15036e;
import jh.C15034c;
import nh.C15945c;
import nh.InterfaceC15944b;
import nh.InterfaceC15946d;
import nh.InterfaceC15947e;
import nh.InterfaceC15948f;
import nh.InterfaceC15950h;

/* loaded from: classes8.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private final C15945c f91870a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f91871b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15946d<InterfaceC15947e> f91872c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15948f f91873d;

    /* renamed from: e, reason: collision with root package name */
    private final ConnectionInformationState f91874e;

    /* renamed from: f, reason: collision with root package name */
    private final m0.a f91875f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15950h f91876g;

    /* renamed from: h, reason: collision with root package name */
    private final n0.b f91877h;

    /* renamed from: i, reason: collision with root package name */
    private final n0.a f91878i;

    /* renamed from: j, reason: collision with root package name */
    private final v0 f91879j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f91880k;

    /* renamed from: l, reason: collision with root package name */
    private final List<WeakReference<f0>> f91881l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final K f91882m = new K();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f91883n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f91884o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f91885p;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference<InterfaceC15947e> f91886q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference<LDContext> f91887r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<Boolean> f91888s;

    /* renamed from: t, reason: collision with root package name */
    private final C15034c f91889t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f91890u;

    class a implements InterfaceC15944b<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15944b f91891a;

        a(InterfaceC15944b interfaceC15944b) {
            this.f91891a = interfaceC15944b;
        }

        @Override // nh.InterfaceC15944b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            F.this.f91890u = true;
            F f10 = F.this;
            f10.o(f10.f91874e.d());
            this.f91891a.onSuccess(null);
        }

        @Override // nh.InterfaceC15944b
        public void onError(Throwable th2) {
            F f10 = F.this;
            f10.n(f10.f91874e.d(), th2);
            this.f91891a.onSuccess(null);
        }
    }

    class b implements InterfaceC15944b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15034c f91893a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15944b f91894b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15948f f91895c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LDContext f91896d;

        b(C15034c c15034c, InterfaceC15944b interfaceC15944b, InterfaceC15948f interfaceC15948f, LDContext lDContext) {
            this.f91893a = c15034c;
            this.f91894b = interfaceC15944b;
            this.f91895c = interfaceC15948f;
            this.f91896d = lDContext;
        }

        @Override // nh.InterfaceC15944b
        public void onError(Throwable th2) {
            this.f91893a.h("Error when attempting to get flag data: [{}] [{}]: {}", i0.h(this.f91896d), this.f91896d, AbstractC15036e.b(th2));
            this.f91894b.onError(th2);
        }

        @Override // nh.InterfaceC15944b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            try {
                this.f91895c.d(this.f91896d, EnvironmentData.a(str).b());
                this.f91894b.onSuccess(Boolean.TRUE);
            } catch (Exception e10) {
                this.f91893a.b("Received invalid JSON flag data: {}", str);
                this.f91894b.onError(new LDFailure("Invalid JSON received from flags endpoint", e10, LDFailure.a.INVALID_RESPONSE_BODY));
            }
        }
    }

    private class c implements InterfaceC15948f {

        /* renamed from: a, reason: collision with root package name */
        private final I f91897a;

        c(I i10) {
            this.f91897a = i10;
        }

        @Override // nh.InterfaceC15948f
        public void a(LDContext lDContext, DataModel$Flag dataModel$Flag) {
            this.f91897a.l(lDContext, dataModel$Flag);
        }

        @Override // nh.InterfaceC15948f
        public void b() {
            F.this.k();
            c(ConnectionInformation.ConnectionMode.SHUTDOWN, null);
        }

        @Override // nh.InterfaceC15948f
        public void c(ConnectionInformation.ConnectionMode connectionMode, Throwable th2) {
            if (th2 == null) {
                F.this.o(connectionMode);
            } else {
                F.this.n(connectionMode, th2);
            }
        }

        @Override // nh.InterfaceC15948f
        public void d(LDContext lDContext, Map<String, DataModel$Flag> map) {
            this.f91897a.e(lDContext, EnvironmentData.e(map));
        }
    }

    private synchronized void j(ConnectionInformation connectionInformation) {
        this.f91875f.f(new m0.b(connectionInformation.b(), connectionInformation.a(), connectionInformation.c()));
    }

    private synchronized boolean p(boolean z10, InterfaceC15944b<Void> interfaceC15944b) {
        boolean z11;
        InterfaceC15947e andSet;
        try {
            if (!this.f91884o.get()) {
                return false;
            }
            boolean z12 = this.f91883n.get();
            boolean zK3 = this.f91871b.k3();
            boolean zX3 = this.f91871b.x3();
            boolean z13 = !zX3;
            LDContext lDContext = this.f91887r.get();
            this.f91876g.w3(z12 || !zK3);
            this.f91876g.l1(z13);
            if (z12) {
                this.f91889t.a("Initialized in offline mode");
                this.f91890u = true;
                this.f91873d.c(ConnectionInformation.ConnectionMode.SET_OFFLINE, null);
            } else if (!zK3) {
                this.f91873d.c(ConnectionInformation.ConnectionMode.OFFLINE, null);
            } else {
                if (zX3 || !this.f91880k) {
                    z11 = true;
                    if (z10 && (andSet = this.f91886q.getAndSet(null)) != null) {
                        this.f91889t.a("Stopping current data source");
                        andSet.c(i0.f());
                    }
                    if (z11 && this.f91886q.get() == null) {
                        this.f91889t.b("Creating data source (background={})", Boolean.valueOf(z13));
                        InterfaceC15947e interfaceC15947eA = this.f91872c.a(C11682s.n(this.f91870a, this.f91873d, lDContext, z13, this.f91888s.get()));
                        this.f91886q.set(interfaceC15947eA);
                        this.f91888s.set(Boolean.valueOf(z13));
                        interfaceC15947eA.a(new a(interfaceC15944b));
                        return true;
                    }
                    interfaceC15944b.onSuccess(null);
                    return false;
                }
                this.f91873d.c(ConnectionInformation.ConnectionMode.BACKGROUND_DISABLED, null);
            }
            z11 = false;
            z10 = true;
            if (z10) {
                this.f91889t.a("Stopping current data source");
                andSet.c(i0.f());
            }
            if (z11) {
                this.f91889t.b("Creating data source (background={})", Boolean.valueOf(z13));
                InterfaceC15947e interfaceC15947eA2 = this.f91872c.a(C11682s.n(this.f91870a, this.f91873d, lDContext, z13, this.f91888s.get()));
                this.f91886q.set(interfaceC15947eA2);
                this.f91888s.set(Boolean.valueOf(z13));
                interfaceC15947eA2.a(new a(interfaceC15944b));
                return true;
            }
            interfaceC15944b.onSuccess(null);
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean l(InterfaceC15944b<Void> interfaceC15944b) {
        if (!this.f91885p.get() && !this.f91884o.getAndSet(true)) {
            this.f91890u = false;
            return p(true, interfaceC15944b);
        }
        return false;
    }

    public static /* synthetic */ void a(F f10, boolean z10) {
        InterfaceC15947e interfaceC15947e = f10.f91886q.get();
        if (interfaceC15947e == null || interfaceC15947e.b(!z10, f10.f91887r.get())) {
            f10.p(true, i0.f());
        }
    }

    static void h(M m10, LDContext lDContext, InterfaceC15948f interfaceC15948f, InterfaceC15944b<Boolean> interfaceC15944b, C15034c c15034c) {
        m10.L3(lDContext, new b(c15034c, interfaceC15944b, interfaceC15948f, lDContext));
    }

    private void i() {
        m0.b bVarA = this.f91875f.a();
        Long l10 = bVarA.f92069a;
        Long l11 = bVarA.f92070b;
        ConnectionInformationState connectionInformationState = this.f91874e;
        if (l10 == null || l10.longValue() == 0) {
            l10 = null;
        }
        connectionInformationState.h(l10);
        ConnectionInformationState connectionInformationState2 = this.f91874e;
        if (l11 == null || l11.longValue() == 0) {
            l11 = null;
        }
        connectionInformationState2.f(l11);
        this.f91874e.g(bVarA.f92071c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(ConnectionInformation.ConnectionMode connectionMode, Throwable th2) {
        LDFailure lDFailure = th2 != null ? th2 instanceof LDFailure ? (LDFailure) th2 : new LDFailure("Unknown failure", th2, LDFailure.a.UNKNOWN_ERROR) : null;
        this.f91874e.e(connectionMode);
        this.f91874e.f(Long.valueOf(System.currentTimeMillis()));
        this.f91874e.g(lDFailure);
        try {
            j(this.f91874e);
        } catch (Exception e10) {
            i0.c(this.f91889t, e10, "Error saving connection information", new Object[0]);
        }
        q(this.f91874e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(ConnectionInformation.ConnectionMode connectionMode) {
        boolean z10;
        boolean z11 = true;
        if (this.f91874e.d() != connectionMode) {
            this.f91874e.e(connectionMode);
            z10 = true;
        } else {
            z10 = false;
        }
        if (connectionMode.isConnectionActive()) {
            this.f91874e.h(Long.valueOf(System.currentTimeMillis()));
        } else {
            z11 = z10;
        }
        if (z11) {
            try {
                j(this.f91874e);
            } catch (Exception e10) {
                i0.c(this.f91889t, e10, "Error saving connection information", new Object[0]);
            }
            q(this.f91874e);
        }
    }

    private void q(final ConnectionInformation connectionInformation) {
        synchronized (this.f91881l) {
            try {
                Iterator<WeakReference<f0>> it = this.f91881l.iterator();
                while (it.hasNext()) {
                    final f0 f0Var = it.next().get();
                    if (f0Var == null) {
                        it.remove();
                    } else {
                        this.f91879j.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.C
                            @Override // java.lang.Runnable
                            public final void run() {
                                f0Var.a(connectionInformation);
                            }
                        }, 0L);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k() {
        if (this.f91885p.getAndSet(true)) {
            return;
        }
        InterfaceC15947e andSet = this.f91886q.getAndSet(null);
        if (andSet != null) {
            andSet.c(i0.f());
        }
        this.f91871b.o2(this.f91877h);
        this.f91871b.s3(this.f91878i);
    }

    void m(LDContext lDContext, InterfaceC15944b<Void> interfaceC15944b) {
        InterfaceC15947e interfaceC15947e = this.f91886q.get();
        LDContext andSet = this.f91887r.getAndSet(lDContext);
        if (andSet == lDContext || andSet.equals(lDContext)) {
            interfaceC15944b.onSuccess(null);
        } else if (interfaceC15947e == null || interfaceC15947e.b(!this.f91871b.x3(), lDContext)) {
            p(true, interfaceC15944b);
        } else {
            interfaceC15944b.onSuccess(null);
        }
    }

    F(C15945c c15945c, InterfaceC15946d<InterfaceC15947e> interfaceC15946d, InterfaceC15950h interfaceC15950h, I i10, m0.a aVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f91883n = atomicBoolean;
        this.f91884o = new AtomicBoolean();
        this.f91885p = new AtomicBoolean();
        this.f91886q = new AtomicReference<>();
        AtomicReference<LDContext> atomicReference = new AtomicReference<>();
        this.f91887r = atomicReference;
        this.f91888s = new AtomicReference<>();
        this.f91890u = false;
        this.f91870a = c15945c;
        this.f91872c = interfaceC15946d;
        this.f91873d = new c(i10);
        n0 n0VarT = C11682s.p(c15945c).t();
        this.f91871b = n0VarT;
        this.f91876g = interfaceC15950h;
        this.f91875f = aVar;
        this.f91879j = C11682s.p(c15945c).u();
        this.f91889t = c15945c.a();
        atomicReference.set(c15945c.f());
        atomicBoolean.set(c15945c.l());
        c0 c0VarB = c15945c.b();
        this.f91874e = new ConnectionInformationState();
        i();
        this.f91880k = c0VarB.i();
        n0.a aVar2 = new n0.a() { // from class: com.launchdarkly.sdk.android.D
            @Override // com.launchdarkly.sdk.android.n0.a
            public final void a(boolean z10) {
                F.b(this.f91868a, z10);
            }
        };
        this.f91878i = aVar2;
        n0VarT.X2(aVar2);
        n0.b bVar = new n0.b() { // from class: com.launchdarkly.sdk.android.E
            @Override // com.launchdarkly.sdk.android.n0.b
            public final void a(boolean z10) {
                F.a(this.f91869a, z10);
            }
        };
        this.f91877h = bVar;
        n0VarT.M0(bVar);
    }

    public static /* synthetic */ void b(F f10, boolean z10) {
        f10.getClass();
        f10.p(false, i0.f());
    }
}
