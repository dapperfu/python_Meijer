package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.ConnectionInformation;
import com.launchdarkly.sdk.android.LDFailure;
import com.launchdarkly.sdk.android.m0;
import com.launchdarkly.sdk.android.n0;
import ih.AbstractC14726e;
import ih.C14724c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mh.C15622c;
import mh.InterfaceC15621b;
import mh.InterfaceC15623d;
import mh.InterfaceC15624e;
import mh.InterfaceC15625f;
import mh.InterfaceC15627h;

/* loaded from: classes7.dex */
class F {

    /* renamed from: a, reason: collision with root package name */
    private final C15622c f91031a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f91032b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15623d<InterfaceC15624e> f91033c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15625f f91034d;

    /* renamed from: e, reason: collision with root package name */
    private final ConnectionInformationState f91035e;

    /* renamed from: f, reason: collision with root package name */
    private final m0.a f91036f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15627h f91037g;

    /* renamed from: h, reason: collision with root package name */
    private final n0.b f91038h;

    /* renamed from: i, reason: collision with root package name */
    private final n0.a f91039i;

    /* renamed from: j, reason: collision with root package name */
    private final v0 f91040j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f91041k;

    /* renamed from: l, reason: collision with root package name */
    private final List<WeakReference<f0>> f91042l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final K f91043m = new K();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f91044n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f91045o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f91046p;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicReference<InterfaceC15624e> f91047q;

    /* renamed from: r, reason: collision with root package name */
    private final AtomicReference<LDContext> f91048r;

    /* renamed from: s, reason: collision with root package name */
    private final AtomicReference<Boolean> f91049s;

    /* renamed from: t, reason: collision with root package name */
    private final C14724c f91050t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f91051u;

    class a implements InterfaceC15621b<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15621b f91052a;

        a(InterfaceC15621b interfaceC15621b) {
            this.f91052a = interfaceC15621b;
        }

        @Override // mh.InterfaceC15621b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            F.this.f91051u = true;
            F f10 = F.this;
            f10.o(f10.f91035e.d());
            this.f91052a.onSuccess(null);
        }

        @Override // mh.InterfaceC15621b
        public void onError(Throwable th2) {
            F f10 = F.this;
            f10.n(f10.f91035e.d(), th2);
            this.f91052a.onSuccess(null);
        }
    }

    class b implements InterfaceC15621b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14724c f91054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC15621b f91055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC15625f f91056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LDContext f91057d;

        b(C14724c c14724c, InterfaceC15621b interfaceC15621b, InterfaceC15625f interfaceC15625f, LDContext lDContext) {
            this.f91054a = c14724c;
            this.f91055b = interfaceC15621b;
            this.f91056c = interfaceC15625f;
            this.f91057d = lDContext;
        }

        @Override // mh.InterfaceC15621b
        public void onError(Throwable th2) {
            this.f91054a.h("Error when attempting to get flag data: [{}] [{}]: {}", i0.h(this.f91057d), this.f91057d, AbstractC14726e.b(th2));
            this.f91055b.onError(th2);
        }

        @Override // mh.InterfaceC15621b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            try {
                this.f91056c.d(this.f91057d, EnvironmentData.a(str).b());
                this.f91055b.onSuccess(Boolean.TRUE);
            } catch (Exception e10) {
                this.f91054a.b("Received invalid JSON flag data: {}", str);
                this.f91055b.onError(new LDFailure("Invalid JSON received from flags endpoint", e10, LDFailure.a.INVALID_RESPONSE_BODY));
            }
        }
    }

    private class c implements InterfaceC15625f {

        /* renamed from: a, reason: collision with root package name */
        private final I f91058a;

        c(I i10) {
            this.f91058a = i10;
        }

        @Override // mh.InterfaceC15625f
        public void a(LDContext lDContext, DataModel$Flag dataModel$Flag) {
            this.f91058a.l(lDContext, dataModel$Flag);
        }

        @Override // mh.InterfaceC15625f
        public void b() {
            F.this.k();
            c(ConnectionInformation.ConnectionMode.SHUTDOWN, null);
        }

        @Override // mh.InterfaceC15625f
        public void c(ConnectionInformation.ConnectionMode connectionMode, Throwable th2) {
            if (th2 == null) {
                F.this.o(connectionMode);
            } else {
                F.this.n(connectionMode, th2);
            }
        }

        @Override // mh.InterfaceC15625f
        public void d(LDContext lDContext, Map<String, DataModel$Flag> map) {
            this.f91058a.e(lDContext, EnvironmentData.e(map));
        }
    }

    private synchronized void j(ConnectionInformation connectionInformation) {
        this.f91036f.f(new m0.b(connectionInformation.b(), connectionInformation.a(), connectionInformation.c()));
    }

    private synchronized boolean p(boolean z10, InterfaceC15621b<Void> interfaceC15621b) {
        boolean z11;
        InterfaceC15624e andSet;
        try {
            if (!this.f91045o.get()) {
                return false;
            }
            boolean z12 = this.f91044n.get();
            boolean zK3 = this.f91032b.k3();
            boolean zX3 = this.f91032b.x3();
            boolean z13 = !zX3;
            LDContext lDContext = this.f91048r.get();
            this.f91037g.w3(z12 || !zK3);
            this.f91037g.k1(z13);
            if (z12) {
                this.f91050t.a("Initialized in offline mode");
                this.f91051u = true;
                this.f91034d.c(ConnectionInformation.ConnectionMode.SET_OFFLINE, null);
            } else if (!zK3) {
                this.f91034d.c(ConnectionInformation.ConnectionMode.OFFLINE, null);
            } else {
                if (zX3 || !this.f91041k) {
                    z11 = true;
                    if (z10 && (andSet = this.f91047q.getAndSet(null)) != null) {
                        this.f91050t.a("Stopping current data source");
                        andSet.b(i0.f());
                    }
                    if (z11 && this.f91047q.get() == null) {
                        this.f91050t.b("Creating data source (background={})", Boolean.valueOf(z13));
                        InterfaceC15624e interfaceC15624eB = this.f91033c.b(C11557s.n(this.f91031a, this.f91034d, lDContext, z13, this.f91049s.get()));
                        this.f91047q.set(interfaceC15624eB);
                        this.f91049s.set(Boolean.valueOf(z13));
                        interfaceC15624eB.c(new a(interfaceC15621b));
                        return true;
                    }
                    interfaceC15621b.onSuccess(null);
                    return false;
                }
                this.f91034d.c(ConnectionInformation.ConnectionMode.BACKGROUND_DISABLED, null);
            }
            z11 = false;
            z10 = true;
            if (z10) {
                this.f91050t.a("Stopping current data source");
                andSet.b(i0.f());
            }
            if (z11) {
                this.f91050t.b("Creating data source (background={})", Boolean.valueOf(z13));
                InterfaceC15624e interfaceC15624eB2 = this.f91033c.b(C11557s.n(this.f91031a, this.f91034d, lDContext, z13, this.f91049s.get()));
                this.f91047q.set(interfaceC15624eB2);
                this.f91049s.set(Boolean.valueOf(z13));
                interfaceC15624eB2.c(new a(interfaceC15621b));
                return true;
            }
            interfaceC15621b.onSuccess(null);
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean l(InterfaceC15621b<Void> interfaceC15621b) {
        if (!this.f91046p.get() && !this.f91045o.getAndSet(true)) {
            this.f91051u = false;
            return p(true, interfaceC15621b);
        }
        return false;
    }

    public static /* synthetic */ void a(F f10, boolean z10) {
        InterfaceC15624e interfaceC15624e = f10.f91047q.get();
        if (interfaceC15624e == null || interfaceC15624e.a(!z10, f10.f91048r.get())) {
            f10.p(true, i0.f());
        }
    }

    static void h(M m10, LDContext lDContext, InterfaceC15625f interfaceC15625f, InterfaceC15621b<Boolean> interfaceC15621b, C14724c c14724c) {
        m10.k2(lDContext, new b(c14724c, interfaceC15621b, interfaceC15625f, lDContext));
    }

    private void i() {
        m0.b bVarA = this.f91036f.a();
        Long l10 = bVarA.f91230a;
        Long l11 = bVarA.f91231b;
        ConnectionInformationState connectionInformationState = this.f91035e;
        if (l10 == null || l10.longValue() == 0) {
            l10 = null;
        }
        connectionInformationState.h(l10);
        ConnectionInformationState connectionInformationState2 = this.f91035e;
        if (l11 == null || l11.longValue() == 0) {
            l11 = null;
        }
        connectionInformationState2.f(l11);
        this.f91035e.g(bVarA.f91232c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(ConnectionInformation.ConnectionMode connectionMode, Throwable th2) {
        LDFailure lDFailure = th2 != null ? th2 instanceof LDFailure ? (LDFailure) th2 : new LDFailure("Unknown failure", th2, LDFailure.a.UNKNOWN_ERROR) : null;
        this.f91035e.e(connectionMode);
        this.f91035e.f(Long.valueOf(System.currentTimeMillis()));
        this.f91035e.g(lDFailure);
        try {
            j(this.f91035e);
        } catch (Exception e10) {
            i0.c(this.f91050t, e10, "Error saving connection information", new Object[0]);
        }
        q(this.f91035e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(ConnectionInformation.ConnectionMode connectionMode) {
        boolean z10;
        boolean z11 = true;
        if (this.f91035e.d() != connectionMode) {
            this.f91035e.e(connectionMode);
            z10 = true;
        } else {
            z10 = false;
        }
        if (connectionMode.isConnectionActive()) {
            this.f91035e.h(Long.valueOf(System.currentTimeMillis()));
        } else {
            z11 = z10;
        }
        if (z11) {
            try {
                j(this.f91035e);
            } catch (Exception e10) {
                i0.c(this.f91050t, e10, "Error saving connection information", new Object[0]);
            }
            q(this.f91035e);
        }
    }

    private void q(final ConnectionInformation connectionInformation) {
        synchronized (this.f91042l) {
            try {
                Iterator<WeakReference<f0>> it = this.f91042l.iterator();
                while (it.hasNext()) {
                    final f0 f0Var = it.next().get();
                    if (f0Var == null) {
                        it.remove();
                    } else {
                        this.f91040j.V2(new Runnable() { // from class: com.launchdarkly.sdk.android.C
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
        if (this.f91046p.getAndSet(true)) {
            return;
        }
        InterfaceC15624e andSet = this.f91047q.getAndSet(null);
        if (andSet != null) {
            andSet.b(i0.f());
        }
        this.f91032b.q2(this.f91038h);
        this.f91032b.s3(this.f91039i);
    }

    void m(LDContext lDContext, InterfaceC15621b<Void> interfaceC15621b) {
        InterfaceC15624e interfaceC15624e = this.f91047q.get();
        LDContext andSet = this.f91048r.getAndSet(lDContext);
        if (andSet == lDContext || andSet.equals(lDContext)) {
            interfaceC15621b.onSuccess(null);
        } else if (interfaceC15624e == null || interfaceC15624e.a(!this.f91032b.x3(), lDContext)) {
            p(true, interfaceC15621b);
        } else {
            interfaceC15621b.onSuccess(null);
        }
    }

    F(C15622c c15622c, InterfaceC15623d<InterfaceC15624e> interfaceC15623d, InterfaceC15627h interfaceC15627h, I i10, m0.a aVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f91044n = atomicBoolean;
        this.f91045o = new AtomicBoolean();
        this.f91046p = new AtomicBoolean();
        this.f91047q = new AtomicReference<>();
        AtomicReference<LDContext> atomicReference = new AtomicReference<>();
        this.f91048r = atomicReference;
        this.f91049s = new AtomicReference<>();
        this.f91051u = false;
        this.f91031a = c15622c;
        this.f91033c = interfaceC15623d;
        this.f91034d = new c(i10);
        n0 n0VarT = C11557s.p(c15622c).t();
        this.f91032b = n0VarT;
        this.f91037g = interfaceC15627h;
        this.f91036f = aVar;
        this.f91040j = C11557s.p(c15622c).u();
        this.f91050t = c15622c.a();
        atomicReference.set(c15622c.f());
        atomicBoolean.set(c15622c.l());
        c0 c0VarB = c15622c.b();
        this.f91035e = new ConnectionInformationState();
        i();
        this.f91041k = c0VarB.i();
        n0.a aVar2 = new n0.a() { // from class: com.launchdarkly.sdk.android.D
            @Override // com.launchdarkly.sdk.android.n0.a
            public final void a(boolean z10) {
                F.b(this.f91029a, z10);
            }
        };
        this.f91039i = aVar2;
        n0VarT.Y2(aVar2);
        n0.b bVar = new n0.b() { // from class: com.launchdarkly.sdk.android.E
            @Override // com.launchdarkly.sdk.android.n0.b
            public final void a(boolean z10) {
                F.a(this.f91030a, z10);
            }
        };
        this.f91038h = bVar;
        n0VarT.P0(bVar);
    }

    public static /* synthetic */ void b(F f10, boolean z10) {
        f10.getClass();
        f10.p(false, i0.f());
    }
}
