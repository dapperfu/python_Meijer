package com.adobe.marketing.mobile.assurance.internal;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.assurance.internal.C6544a;
import com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity;
import com.adobe.marketing.mobile.util.DataReaderException;
import g6.C14328a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class AssuranceExtension extends AbstractC6578l {

    /* renamed from: e, reason: collision with root package name */
    private static final long f62958e = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f62959f = true;

    /* renamed from: b, reason: collision with root package name */
    private final E f62960b;

    /* renamed from: c, reason: collision with root package name */
    private final z f62961c;

    /* renamed from: d, reason: collision with root package name */
    private final C6549f f62962d;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AssuranceExtension.f62959f) {
                AssuranceExtension.this.r();
            }
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.adobe.marketing.mobile.H f62965b;

        b(String str, com.adobe.marketing.mobile.H h10) {
            this.f62964a = str;
            this.f62965b = h10;
            put(str, h10.b());
        }
    }

    AssuranceExtension(AbstractC6579m abstractC6579m) {
        this(abstractC6579m, new E(abstractC6579m), new C6549f(com.adobe.marketing.mobile.B.h()), (List<r>) Collections.unmodifiableList(Arrays.asList(new C6563u(), new C6565w(), new C6561s(), new C6562t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        R5.t.a("Assurance", "AssuranceExtension", "Timeout - Assurance did not receive deeplink to start Assurance session within 5 seconds. Shutting down Assurance extension", new Object[0]);
        this.f62961c.g(true);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    public boolean i(C6574h c6574h) {
        return true;
    }

    void s() {
        f62959f = false;
        Application applicationB = R5.K.f().a().b();
        if (applicationB == null || !F.g(applicationB)) {
            R5.t.f("Assurance", "AssuranceExtension", "startSession() API is available only on debug builds.", new Object[0]);
            return;
        }
        if (this.f62961c.d() != null) {
            R5.t.a("Assurance", "AssuranceExtension", "Unable to start Assurance session. Session already exists", new Object[0]);
            return;
        }
        C6548e.appState.e(new C6544a.b.Authorizing(new C6544a.AbstractC1239a.QuickConnect(EnumC6551h.PROD)));
        Intent intent = new Intent(applicationB, (Class<?>) AssuranceActivity.class);
        intent.addFlags(65536);
        intent.addFlags(131072);
        intent.addFlags(268435456);
        applicationB.startActivity(intent);
    }

    void t(String str) {
        f62959f = false;
        z zVar = this.f62961c;
        if (zVar == null) {
            R5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Make sure Assurance Extension is registered before startSession() is called.", new Object[0]);
            return;
        }
        if (zVar.d() != null) {
            R5.t.a("Assurance", "AssuranceExtension", "Unable to start Assurance session. Session already exists", new Object[0]);
            return;
        }
        if (g6.i.a(str)) {
            R5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Obtained null or empty deeplink url", new Object[0]);
            return;
        }
        Uri uri = Uri.parse(str);
        String strD = F.d(uri);
        if (g6.i.a(strD)) {
            R5.t.f("Assurance", "AssuranceExtension", String.format("Unable to start Assurance session. The assurance sessionId obtained deeplink is invalid. Deeplink : %s", str), new Object[0]);
            return;
        }
        EnumC6551h enumC6551hA = F.a(uri.getQueryParameter("env"));
        Application applicationH = com.adobe.marketing.mobile.B.h();
        if (applicationH == null) {
            R5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Host application is null", new Object[0]);
            return;
        }
        C6548e.appState.e(new C6544a.b.Authorizing(new C6544a.AbstractC1239a.PinConnect(strD, enumC6551hA)));
        Intent intent = new Intent(applicationH, (Class<?>) AssuranceActivity.class);
        intent.addFlags(65536);
        intent.addFlags(131072);
        intent.addFlags(268435456);
        applicationH.startActivity(intent);
    }

    private boolean l() {
        return this.f62961c.f();
    }

    private void q() {
        String strF = this.f62960b.f();
        if (g6.i.a(strF)) {
            return;
        }
        this.f62960b.k(strF);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String b() {
        return "Assurance";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String e() {
        return "com.adobe.assurance";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected String f() {
        return "3.0.7";
    }

    void n(C6574h c6574h) {
        this.f62960b.i(c6574h);
        HashMap map = new HashMap();
        map.put("ACPExtensionEventName", c6574h.q());
        map.put("ACPExtensionEventType", c6574h.w().toLowerCase());
        map.put("ACPExtensionEventSource", c6574h.t().toLowerCase());
        map.put("ACPExtensionEventUniqueIdentifier", c6574h.x());
        map.put("ACPExtensionEventData", c6574h.o());
        String strR = c6574h.r();
        if (!g6.i.a(strR)) {
            map.put("ACPExtensionEventParentIdentifier", strR);
        }
        if ("com.adobe.eventSource.sharedState".equalsIgnoreCase(c6574h.t())) {
            p(c6574h, map);
        } else {
            this.f62961c.e(new C6555l("generic", map));
        }
    }

    void o(EnumC6554k enumC6554k, String str) {
        C6567y c6567yD = this.f62961c.d();
        if (c6567yD != null) {
            c6567yD.o(enumC6554k, str);
        }
    }

    private void p(C6574h c6574h, Map<String, Object> map) {
        com.adobe.marketing.mobile.H hE;
        String str;
        Map<String, Object> mapO = c6574h.o();
        if (F.h(mapO)) {
            R5.t.f("Assurance", "AssuranceExtension", "EventData for shared state change event is null. Ignoring event", new Object[0]);
            return;
        }
        try {
            String strE = C14328a.e(mapO, "stateowner");
            if ("Shared state change (XDM)".equals(c6574h.q())) {
                hE = a().f(strE, c6574h, false, com.adobe.marketing.mobile.F.ANY);
                str = "xdm.state.data";
            } else {
                hE = a().e(strE, c6574h, false, com.adobe.marketing.mobile.F.ANY);
                str = "state.data";
            }
            if (hE != null && hE.a() == com.adobe.marketing.mobile.I.SET) {
                map.put("metadata", new b(str, hE));
                this.f62961c.e(new C6555l("generic", map));
            }
        } catch (DataReaderException e10) {
            R5.t.f("Assurance", "AssuranceExtension", "Unable to extract state owner from shared state change event: " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void g() {
        super.g();
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.assurance.internal.m
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63121a.n(c6574h);
            }
        });
        a().h("com.adobe.eventType.assurance", "com.adobe.eventSource.requestContent", new InterfaceC6581o() { // from class: com.adobe.marketing.mobile.assurance.internal.n
            @Override // com.adobe.marketing.mobile.InterfaceC6581o
            public final void a(C6574h c6574h) {
                this.f63122a.m(c6574h);
            }
        });
        a().h("com.adobe.eventType.places", "com.adobe.eventSource.requestContent", new C6559p(this));
        a().h("com.adobe.eventType.places", "com.adobe.eventSource.responseContent", new C6560q(this));
        q();
        if (l()) {
            return;
        }
        new Timer().schedule(new a(), f62958e);
        R5.t.a("Assurance", "AssuranceExtension", String.format("Assurance extension version %s is successfully registered", "3.0.7"), new Object[0]);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6578l
    protected void h() {
        super.h();
    }

    void m(C6574h c6574h) {
        Map<String, Object> mapO = c6574h.o();
        if (C14328a.l(mapO, "quickConnect", false)) {
            s();
            return;
        }
        String strO = C14328a.o(mapO, "startSessionURL", "");
        if (!g6.i.a(strO)) {
            t(strO);
        } else {
            R5.t.f("Assurance", "AssuranceExtension", "Unable to process start session event. Could find start session URL or quick connect flag in the event", new Object[0]);
        }
    }

    AssuranceExtension(AbstractC6579m abstractC6579m, E e10, C6549f c6549f, List<r> list) {
        this(abstractC6579m, e10, c6549f, new z(com.adobe.marketing.mobile.B.h(), e10, list, c6549f));
    }

    AssuranceExtension(AbstractC6579m abstractC6579m, E e10, C6549f c6549f, z zVar) {
        super(abstractC6579m);
        this.f62960b = e10;
        this.f62962d = c6549f;
        this.f62961c = zVar;
    }
}
