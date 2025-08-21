package com.launchdarkly.sdk.android;

import android.os.Process;
import com.launchdarkly.eventsource.UnsuccessfulResponseException;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.LDFailure;
import com.launchdarkly.sdk.json.SerializationException;
import ih.C14748o;
import ih.C14751r;
import ih.InterfaceC14744k;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import jh.C15034c;
import nh.C15945c;
import nh.InterfaceC15944b;
import nh.InterfaceC15947e;
import nh.InterfaceC15948f;
import oh.AbstractC16130a;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import ph.C16431h;
import qh.AbstractC16668b;
import qh.C16669c;

/* loaded from: classes8.dex */
final class u0 implements InterfaceC15947e {

    /* renamed from: a, reason: collision with root package name */
    private C14748o f92106a;

    /* renamed from: b, reason: collision with root package name */
    private final LDContext f92107b;

    /* renamed from: c, reason: collision with root package name */
    private final C16669c f92108c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f92109d;

    /* renamed from: e, reason: collision with root package name */
    final int f92110e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f92111f;

    /* renamed from: g, reason: collision with root package name */
    private final URI f92112g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC15948f f92113h;

    /* renamed from: i, reason: collision with root package name */
    private final M f92114i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f92115j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f92116k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f92117l = false;

    /* renamed from: m, reason: collision with root package name */
    private final C16431h f92118m;

    /* renamed from: n, reason: collision with root package name */
    private long f92119n;

    /* renamed from: o, reason: collision with root package name */
    private final C15034c f92120o;

    class a implements InterfaceC14744k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15944b f92121a;

        @Override // ih.InterfaceC14744k
        public void a(String str) {
        }

        a(InterfaceC15944b interfaceC15944b) {
            this.f92121a = interfaceC15944b;
        }

        @Override // ih.InterfaceC14744k
        public void c() {
            u0.this.f92120o.i("Started LaunchDarkly EventStream");
            if (u0.this.f92118m != null) {
                u0.this.f92118m.g(u0.this.f92119n, (int) (System.currentTimeMillis() - u0.this.f92119n), false);
            }
        }

        @Override // ih.InterfaceC14744k
        public void d() {
            u0.this.f92120o.i("Closed LaunchDarkly EventStream");
        }

        @Override // ih.InterfaceC14744k
        public void onError(Throwable th2) {
            C15034c c15034c = u0.this.f92120o;
            u0 u0Var = u0.this;
            i0.c(c15034c, th2, "Encountered EventStream error connecting to URI: {}", u0Var.s(u0Var.f92107b));
            if (!(th2 instanceof UnsuccessfulResponseException)) {
                this.f92121a.onError(new LDFailure("Network error in stream connection", th2, LDFailure.a.NETWORK_FAILURE));
                return;
            }
            if (u0.this.f92118m != null) {
                u0.this.f92118m.g(u0.this.f92119n, (int) (System.currentTimeMillis() - u0.this.f92119n), true);
            }
            int iA = ((UnsuccessfulResponseException) th2).a();
            if (iA < 400 || iA >= 500) {
                u0.this.f92119n = System.currentTimeMillis();
                this.f92121a.onError(new LDInvalidResponseCodeFailure("Unexpected Response Code From Stream Connection", th2, iA, true));
                return;
            }
            u0.this.f92120o.f("Encountered non-retriable error: {}. Aborting connection to stream. Verify correct Mobile Key and Stream URI", Integer.valueOf(iA));
            u0.this.f92116k = false;
            this.f92121a.onError(new LDInvalidResponseCodeFailure("Unexpected Response Code From Stream Connection", th2, iA, false));
            if (iA == 401) {
                u0.this.f92117l = true;
                u0.this.f92113h.b();
            }
            u0.this.c(null);
        }

        @Override // ih.InterfaceC14744k
        public void b(String str, C14751r c14751r) {
            String strB = c14751r.b();
            u0.this.f92120o.c("onMessage: {}: {}", str, strB);
            u0.this.t(str, strB, this.f92121a);
        }
    }

    class b implements C14748o.b.a {
        b() {
        }

        @Override // ih.C14748o.b.a
        public void a(OkHttpClient.Builder builder) {
            u0.this.f92108c.a(builder);
            builder.V(300000L, TimeUnit.MILLISECONDS);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f92124a;

        /* renamed from: b, reason: collision with root package name */
        private final int f92125b;
    }

    private synchronized void u() {
        try {
            C14748o c14748o = this.f92106a;
            if (c14748o != null) {
                c14748o.close();
            }
            this.f92116k = false;
            this.f92106a = null;
            this.f92120o.a("Stopped.");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private RequestBody r(LDContext lDContext) {
        this.f92120o.a("Attempting to report user in stream");
        return RequestBody.create(com.launchdarkly.sdk.json.d.d(lDContext), c0.f91995t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public URI s(LDContext lDContext) {
        URI uriA = AbstractC16668b.a(this.f92112g, "/meval");
        if (!this.f92111f && lDContext != null) {
            uriA = AbstractC16668b.a(uriA, i0.h(lDContext));
        }
        if (!this.f92109d) {
            return uriA;
        }
        return URI.create(uriA.toString() + "?withReasons=true");
    }

    @Override // nh.InterfaceC15947e
    public void a(InterfaceC15944b<Boolean> interfaceC15944b) {
        if (this.f92116k || this.f92117l) {
            return;
        }
        this.f92120o.a("Starting.");
        C14748o.b bVar = new C14748o.b(new a(interfaceC15944b), s(this.f92107b));
        long j10 = this.f92110e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.A(j10, timeUnit);
        bVar.v(new b());
        bVar.B(new C14748o.c() { // from class: com.launchdarkly.sdk.android.s0
            @Override // ih.C14748o.c
            public final Request a(Request request) {
                return u0.e(this.f92103a, request);
            }
        });
        if (this.f92111f) {
            bVar.z("REPORT");
            bVar.t(r(this.f92107b));
        }
        bVar.y(300000L, timeUnit);
        this.f92119n = System.currentTimeMillis();
        C14748o c14748oU = bVar.u();
        this.f92106a = c14748oU;
        c14748oU.J();
        this.f92116k = true;
    }

    @Override // nh.InterfaceC15947e
    public boolean b(boolean z10, LDContext lDContext) {
        if (lDContext.equals(this.f92107b)) {
            return z10 && !this.f92115j;
        }
        return true;
    }

    @Override // nh.InterfaceC15947e
    public void c(final InterfaceC15944b<Void> interfaceC15944b) {
        this.f92120o.a("Stopping.");
        new Thread(new Runnable() { // from class: com.launchdarkly.sdk.android.t0
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                u0.d(this.f92104a, interfaceC15944b);
            }
        }).start();
    }

    u0(C15945c c15945c, LDContext lDContext, InterfaceC15948f interfaceC15948f, M m10, int i10, boolean z10) {
        this.f92107b = lDContext;
        this.f92113h = interfaceC15948f;
        this.f92114i = m10;
        this.f92112g = c15945c.i().c();
        this.f92108c = i0.e(c15945c);
        this.f92109d = c15945c.j();
        this.f92111f = c15945c.g().d();
        this.f92110e = i10;
        this.f92115j = z10;
        this.f92118m = C11682s.p(c15945c).q();
        this.f92120o = c15945c.a();
    }

    public static /* synthetic */ void d(u0 u0Var, InterfaceC15944b interfaceC15944b) throws SecurityException, IllegalArgumentException {
        u0Var.getClass();
        Process.setThreadPriority(10);
        u0Var.u();
        if (interfaceC15944b != null) {
            interfaceC15944b.onSuccess(null);
        }
    }

    public static /* synthetic */ Request e(u0 u0Var, Request request) {
        u0Var.getClass();
        return request.g().n(request.getHeaders().k().b(u0Var.f92108c.f().f()).f()).b();
    }

    private void p(String str, InterfaceC15944b<Boolean> interfaceC15944b) {
        try {
            c cVar = (c) AbstractC16130a.a().o(str, c.class);
            if (cVar == null) {
                return;
            }
            this.f92113h.a(this.f92107b, DataModel$Flag.a(cVar.f92124a, cVar.f92125b));
            interfaceC15944b.onSuccess(null);
        } catch (Exception unused) {
            this.f92120o.b("Invalid DELETE payload: {}", str);
            interfaceC15944b.onError(new LDFailure("Invalid DELETE payload", LDFailure.a.INVALID_RESPONSE_BODY));
        }
    }

    private void q(String str, InterfaceC15944b<Boolean> interfaceC15944b) {
        try {
            DataModel$Flag dataModel$FlagB = DataModel$Flag.b(str);
            if (dataModel$FlagB == null) {
                return;
            }
            this.f92113h.a(this.f92107b, dataModel$FlagB);
            interfaceC15944b.onSuccess(null);
        } catch (SerializationException unused) {
            this.f92120o.b("Invalid PATCH payload: {}", str);
            interfaceC15944b.onError(new LDFailure("Invalid PATCH payload", LDFailure.a.INVALID_RESPONSE_BODY));
        }
    }

    void t(String str, String str2, InterfaceC15944b<Boolean> interfaceC15944b) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "delete":
                p(str2, interfaceC15944b);
                break;
            case "put":
                try {
                    this.f92113h.d(this.f92107b, EnvironmentData.a(str2).b());
                    interfaceC15944b.onSuccess(Boolean.TRUE);
                    break;
                } catch (Exception e10) {
                    this.f92120o.b("Received invalid JSON flag data: {}", str2);
                    interfaceC15944b.onError(new LDFailure("Invalid JSON received from flags endpoint", e10, LDFailure.a.INVALID_RESPONSE_BODY));
                    return;
                }
            case "ping":
                F.h(this.f92114i, this.f92107b, this.f92113h, interfaceC15944b, this.f92120o);
                break;
            case "patch":
                q(str2, interfaceC15944b);
                break;
            default:
                this.f92120o.b("Found an unknown stream protocol: {}", str);
                interfaceC15944b.onError(new LDFailure("Unknown Stream Element Type", null, LDFailure.a.UNEXPECTED_STREAM_ELEMENT_TYPE));
                break;
        }
    }
}
