package com.launchdarkly.sdk.android;

import android.os.Process;
import com.launchdarkly.eventsource.UnsuccessfulResponseException;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.android.LDFailure;
import com.launchdarkly.sdk.json.SerializationException;
import hh.C14468o;
import hh.C14471r;
import hh.InterfaceC14464k;
import ih.C14724c;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import mh.C15622c;
import mh.InterfaceC15621b;
import mh.InterfaceC15624e;
import mh.InterfaceC15625f;
import nh.AbstractC15796a;
import oh.C16066h;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import ph.AbstractC16304b;
import ph.C16305c;

/* loaded from: classes7.dex */
final class u0 implements InterfaceC15624e {

    /* renamed from: a, reason: collision with root package name */
    private C14468o f91267a;

    /* renamed from: b, reason: collision with root package name */
    private final LDContext f91268b;

    /* renamed from: c, reason: collision with root package name */
    private final C16305c f91269c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f91270d;

    /* renamed from: e, reason: collision with root package name */
    final int f91271e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f91272f;

    /* renamed from: g, reason: collision with root package name */
    private final URI f91273g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC15625f f91274h;

    /* renamed from: i, reason: collision with root package name */
    private final M f91275i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f91276j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f91277k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f91278l = false;

    /* renamed from: m, reason: collision with root package name */
    private final C16066h f91279m;

    /* renamed from: n, reason: collision with root package name */
    private long f91280n;

    /* renamed from: o, reason: collision with root package name */
    private final C14724c f91281o;

    class a implements InterfaceC14464k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15621b f91282a;

        @Override // hh.InterfaceC14464k
        public void a(String str) {
        }

        a(InterfaceC15621b interfaceC15621b) {
            this.f91282a = interfaceC15621b;
        }

        @Override // hh.InterfaceC14464k
        public void b() {
            u0.this.f91281o.i("Started LaunchDarkly EventStream");
            if (u0.this.f91279m != null) {
                u0.this.f91279m.g(u0.this.f91280n, (int) (System.currentTimeMillis() - u0.this.f91280n), false);
            }
        }

        @Override // hh.InterfaceC14464k
        public void c() {
            u0.this.f91281o.i("Closed LaunchDarkly EventStream");
        }

        @Override // hh.InterfaceC14464k
        public void onError(Throwable th2) {
            C14724c c14724c = u0.this.f91281o;
            u0 u0Var = u0.this;
            i0.c(c14724c, th2, "Encountered EventStream error connecting to URI: {}", u0Var.s(u0Var.f91268b));
            if (!(th2 instanceof UnsuccessfulResponseException)) {
                this.f91282a.onError(new LDFailure("Network error in stream connection", th2, LDFailure.a.NETWORK_FAILURE));
                return;
            }
            if (u0.this.f91279m != null) {
                u0.this.f91279m.g(u0.this.f91280n, (int) (System.currentTimeMillis() - u0.this.f91280n), true);
            }
            int iA = ((UnsuccessfulResponseException) th2).a();
            if (iA < 400 || iA >= 500) {
                u0.this.f91280n = System.currentTimeMillis();
                this.f91282a.onError(new LDInvalidResponseCodeFailure("Unexpected Response Code From Stream Connection", th2, iA, true));
                return;
            }
            u0.this.f91281o.f("Encountered non-retriable error: {}. Aborting connection to stream. Verify correct Mobile Key and Stream URI", Integer.valueOf(iA));
            u0.this.f91277k = false;
            this.f91282a.onError(new LDInvalidResponseCodeFailure("Unexpected Response Code From Stream Connection", th2, iA, false));
            if (iA == 401) {
                u0.this.f91278l = true;
                u0.this.f91274h.b();
            }
            u0.this.b(null);
        }

        @Override // hh.InterfaceC14464k
        public void d(String str, C14471r c14471r) {
            String strB = c14471r.b();
            u0.this.f91281o.c("onMessage: {}: {}", str, strB);
            u0.this.t(str, strB, this.f91282a);
        }
    }

    class b implements C14468o.b.a {
        b() {
        }

        @Override // hh.C14468o.b.a
        public void a(OkHttpClient.Builder builder) {
            u0.this.f91269c.a(builder);
            builder.V(300000L, TimeUnit.MILLISECONDS);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f91285a;

        /* renamed from: b, reason: collision with root package name */
        private final int f91286b;
    }

    private synchronized void u() {
        try {
            C14468o c14468o = this.f91267a;
            if (c14468o != null) {
                c14468o.close();
            }
            this.f91277k = false;
            this.f91267a = null;
            this.f91281o.a("Stopped.");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private RequestBody r(LDContext lDContext) {
        this.f91281o.a("Attempting to report user in stream");
        return RequestBody.create(com.launchdarkly.sdk.json.d.d(lDContext), c0.f91156t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public URI s(LDContext lDContext) {
        URI uriA = AbstractC16304b.a(this.f91273g, "/meval");
        if (!this.f91272f && lDContext != null) {
            uriA = AbstractC16304b.a(uriA, i0.h(lDContext));
        }
        if (!this.f91270d) {
            return uriA;
        }
        return URI.create(uriA.toString() + "?withReasons=true");
    }

    @Override // mh.InterfaceC15624e
    public boolean a(boolean z10, LDContext lDContext) {
        if (lDContext.equals(this.f91268b)) {
            return z10 && !this.f91276j;
        }
        return true;
    }

    @Override // mh.InterfaceC15624e
    public void b(final InterfaceC15621b<Void> interfaceC15621b) {
        this.f91281o.a("Stopping.");
        new Thread(new Runnable() { // from class: com.launchdarkly.sdk.android.t0
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                u0.d(this.f91265a, interfaceC15621b);
            }
        }).start();
    }

    @Override // mh.InterfaceC15624e
    public void c(InterfaceC15621b<Boolean> interfaceC15621b) {
        if (this.f91277k || this.f91278l) {
            return;
        }
        this.f91281o.a("Starting.");
        C14468o.b bVar = new C14468o.b(new a(interfaceC15621b), s(this.f91268b));
        long j10 = this.f91271e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.A(j10, timeUnit);
        bVar.v(new b());
        bVar.B(new C14468o.c() { // from class: com.launchdarkly.sdk.android.s0
            @Override // hh.C14468o.c
            public final Request a(Request request) {
                return u0.e(this.f91264a, request);
            }
        });
        if (this.f91272f) {
            bVar.z("REPORT");
            bVar.t(r(this.f91268b));
        }
        bVar.y(300000L, timeUnit);
        this.f91280n = System.currentTimeMillis();
        C14468o c14468oU = bVar.u();
        this.f91267a = c14468oU;
        c14468oU.J();
        this.f91277k = true;
    }

    u0(C15622c c15622c, LDContext lDContext, InterfaceC15625f interfaceC15625f, M m10, int i10, boolean z10) {
        this.f91268b = lDContext;
        this.f91274h = interfaceC15625f;
        this.f91275i = m10;
        this.f91273g = c15622c.i().c();
        this.f91269c = i0.e(c15622c);
        this.f91270d = c15622c.j();
        this.f91272f = c15622c.g().d();
        this.f91271e = i10;
        this.f91276j = z10;
        this.f91279m = C11557s.p(c15622c).q();
        this.f91281o = c15622c.a();
    }

    public static /* synthetic */ void d(u0 u0Var, InterfaceC15621b interfaceC15621b) throws SecurityException, IllegalArgumentException {
        u0Var.getClass();
        Process.setThreadPriority(10);
        u0Var.u();
        if (interfaceC15621b != null) {
            interfaceC15621b.onSuccess(null);
        }
    }

    public static /* synthetic */ Request e(u0 u0Var, Request request) {
        u0Var.getClass();
        return request.g().n(request.getHeaders().k().b(u0Var.f91269c.f().f()).f()).b();
    }

    private void p(String str, InterfaceC15621b<Boolean> interfaceC15621b) {
        try {
            c cVar = (c) AbstractC15796a.a().o(str, c.class);
            if (cVar == null) {
                return;
            }
            this.f91274h.a(this.f91268b, DataModel$Flag.a(cVar.f91285a, cVar.f91286b));
            interfaceC15621b.onSuccess(null);
        } catch (Exception unused) {
            this.f91281o.b("Invalid DELETE payload: {}", str);
            interfaceC15621b.onError(new LDFailure("Invalid DELETE payload", LDFailure.a.INVALID_RESPONSE_BODY));
        }
    }

    private void q(String str, InterfaceC15621b<Boolean> interfaceC15621b) {
        try {
            DataModel$Flag dataModel$FlagB = DataModel$Flag.b(str);
            if (dataModel$FlagB == null) {
                return;
            }
            this.f91274h.a(this.f91268b, dataModel$FlagB);
            interfaceC15621b.onSuccess(null);
        } catch (SerializationException unused) {
            this.f91281o.b("Invalid PATCH payload: {}", str);
            interfaceC15621b.onError(new LDFailure("Invalid PATCH payload", LDFailure.a.INVALID_RESPONSE_BODY));
        }
    }

    void t(String str, String str2, InterfaceC15621b<Boolean> interfaceC15621b) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "delete":
                p(str2, interfaceC15621b);
                break;
            case "put":
                try {
                    this.f91274h.d(this.f91268b, EnvironmentData.a(str2).b());
                    interfaceC15621b.onSuccess(Boolean.TRUE);
                    break;
                } catch (Exception e10) {
                    this.f91281o.b("Received invalid JSON flag data: {}", str2);
                    interfaceC15621b.onError(new LDFailure("Invalid JSON received from flags endpoint", e10, LDFailure.a.INVALID_RESPONSE_BODY));
                    return;
                }
            case "ping":
                F.h(this.f91275i, this.f91268b, this.f91274h, interfaceC15621b, this.f91281o);
                break;
            case "patch":
                q(str2, interfaceC15621b);
                break;
            default:
                this.f91281o.b("Found an unknown stream protocol: {}", str);
                interfaceC15621b.onError(new LDFailure("Unknown Stream Element Type", null, LDFailure.a.UNEXPECTED_STREAM_ELEMENT_TYPE));
                break;
        }
    }
}
