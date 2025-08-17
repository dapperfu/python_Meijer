package com.adobe.marketing.mobile.assurance.internal;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.assurance.internal.C6419a;
import com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity;
import com.adobe.marketing.mobile.util.DataReaderException;
import f6.C13845a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class AssuranceExtension extends AbstractC6453l {

    /* renamed from: e, reason: collision with root package name */
    private static final long f62119e = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f62120f = true;

    /* renamed from: b, reason: collision with root package name */
    private final E f62121b;

    /* renamed from: c, reason: collision with root package name */
    private final z f62122c;

    /* renamed from: d, reason: collision with root package name */
    private final C6424f f62123d;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (AssuranceExtension.f62120f) {
                AssuranceExtension.this.r();
            }
        }
    }

    class b extends HashMap<String, Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.adobe.marketing.mobile.H f62126b;

        b(String str, com.adobe.marketing.mobile.H h10) {
            this.f62125a = str;
            this.f62126b = h10;
            put(str, h10.b());
        }
    }

    AssuranceExtension(AbstractC6454m abstractC6454m) {
        this(abstractC6454m, new E(abstractC6454m), new C6424f(com.adobe.marketing.mobile.B.h()), (List<r>) Collections.unmodifiableList(Arrays.asList(new C6438u(), new C6440w(), new C6436s(), new C6437t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Q5.t.a("Assurance", "AssuranceExtension", "Timeout - Assurance did not receive deeplink to start Assurance session within 5 seconds. Shutting down Assurance extension", new Object[0]);
        this.f62122c.g(true);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    public boolean i(C6449h c6449h) {
        return true;
    }

    void s() {
        f62120f = false;
        Application applicationB = Q5.K.f().a().b();
        if (applicationB == null || !F.g(applicationB)) {
            Q5.t.f("Assurance", "AssuranceExtension", "startSession() API is available only on debug builds.", new Object[0]);
            return;
        }
        if (this.f62122c.d() != null) {
            Q5.t.a("Assurance", "AssuranceExtension", "Unable to start Assurance session. Session already exists", new Object[0]);
            return;
        }
        C6423e.appState.e(new C6419a.b.Authorizing(new C6419a.AbstractC1229a.QuickConnect(EnumC6426h.PROD)));
        Intent intent = new Intent(applicationB, (Class<?>) AssuranceActivity.class);
        intent.addFlags(65536);
        intent.addFlags(131072);
        intent.addFlags(268435456);
        applicationB.startActivity(intent);
    }

    void t(String str) {
        f62120f = false;
        z zVar = this.f62122c;
        if (zVar == null) {
            Q5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Make sure Assurance Extension is registered before startSession() is called.", new Object[0]);
            return;
        }
        if (zVar.d() != null) {
            Q5.t.a("Assurance", "AssuranceExtension", "Unable to start Assurance session. Session already exists", new Object[0]);
            return;
        }
        if (f6.i.a(str)) {
            Q5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Obtained null or empty deeplink url", new Object[0]);
            return;
        }
        Uri uri = Uri.parse(str);
        String strD = F.d(uri);
        if (f6.i.a(strD)) {
            Q5.t.f("Assurance", "AssuranceExtension", String.format("Unable to start Assurance session. The assurance sessionId obtained deeplink is invalid. Deeplink : %s", str), new Object[0]);
            return;
        }
        EnumC6426h enumC6426hA = F.a(uri.getQueryParameter("env"));
        Application applicationH = com.adobe.marketing.mobile.B.h();
        if (applicationH == null) {
            Q5.t.f("Assurance", "AssuranceExtension", "Unable to start Assurance session. Host application is null", new Object[0]);
            return;
        }
        C6423e.appState.e(new C6419a.b.Authorizing(new C6419a.AbstractC1229a.PinConnect(strD, enumC6426hA)));
        Intent intent = new Intent(applicationH, (Class<?>) AssuranceActivity.class);
        intent.addFlags(65536);
        intent.addFlags(131072);
        intent.addFlags(268435456);
        applicationH.startActivity(intent);
    }

    private boolean l() {
        return this.f62122c.f();
    }

    private void q() {
        String strF = this.f62121b.f();
        if (f6.i.a(strF)) {
            return;
        }
        this.f62121b.k(strF);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String b() {
        return "Assurance";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String e() {
        return "com.adobe.assurance";
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected String f() {
        return "3.0.7";
    }

    void n(C6449h c6449h) {
        this.f62121b.i(c6449h);
        HashMap map = new HashMap();
        map.put("ACPExtensionEventName", c6449h.q());
        map.put("ACPExtensionEventType", c6449h.w().toLowerCase());
        map.put("ACPExtensionEventSource", c6449h.t().toLowerCase());
        map.put("ACPExtensionEventUniqueIdentifier", c6449h.x());
        map.put("ACPExtensionEventData", c6449h.o());
        String strR = c6449h.r();
        if (!f6.i.a(strR)) {
            map.put("ACPExtensionEventParentIdentifier", strR);
        }
        if ("com.adobe.eventSource.sharedState".equalsIgnoreCase(c6449h.t())) {
            p(c6449h, map);
        } else {
            this.f62122c.e(new C6430l("generic", map));
        }
    }

    void o(EnumC6429k enumC6429k, String str) {
        C6442y c6442yD = this.f62122c.d();
        if (c6442yD != null) {
            c6442yD.o(enumC6429k, str);
        }
    }

    private void p(C6449h c6449h, Map<String, Object> map) {
        com.adobe.marketing.mobile.H hE;
        String str;
        Map<String, Object> mapO = c6449h.o();
        if (F.h(mapO)) {
            Q5.t.f("Assurance", "AssuranceExtension", "EventData for shared state change event is null. Ignoring event", new Object[0]);
            return;
        }
        try {
            String strE = C13845a.e(mapO, "stateowner");
            if ("Shared state change (XDM)".equals(c6449h.q())) {
                hE = a().f(strE, c6449h, false, com.adobe.marketing.mobile.F.ANY);
                str = "xdm.state.data";
            } else {
                hE = a().e(strE, c6449h, false, com.adobe.marketing.mobile.F.ANY);
                str = "state.data";
            }
            if (hE != null && hE.a() == com.adobe.marketing.mobile.I.SET) {
                map.put("metadata", new b(str, hE));
                this.f62122c.e(new C6430l("generic", map));
            }
        } catch (DataReaderException e10) {
            Q5.t.f("Assurance", "AssuranceExtension", "Unable to extract state owner from shared state change event: " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void g() {
        super.g();
        a().h("com.adobe.eventType._wildcard_", "com.adobe.eventSource._wildcard_", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.assurance.internal.m
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62282a.n(c6449h);
            }
        });
        a().h("com.adobe.eventType.assurance", "com.adobe.eventSource.requestContent", new InterfaceC6456o() { // from class: com.adobe.marketing.mobile.assurance.internal.n
            @Override // com.adobe.marketing.mobile.InterfaceC6456o
            public final void a(C6449h c6449h) {
                this.f62283a.m(c6449h);
            }
        });
        a().h("com.adobe.eventType.places", "com.adobe.eventSource.requestContent", new C6434p(this));
        a().h("com.adobe.eventType.places", "com.adobe.eventSource.responseContent", new C6435q(this));
        q();
        if (l()) {
            return;
        }
        new Timer().schedule(new a(), f62119e);
        Q5.t.a("Assurance", "AssuranceExtension", String.format("Assurance extension version %s is successfully registered", "3.0.7"), new Object[0]);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6453l
    protected void h() {
        super.h();
    }

    void m(C6449h c6449h) {
        Map<String, Object> mapO = c6449h.o();
        if (C13845a.l(mapO, "quickConnect", false)) {
            s();
            return;
        }
        String strO = C13845a.o(mapO, "startSessionURL", "");
        if (!f6.i.a(strO)) {
            t(strO);
        } else {
            Q5.t.f("Assurance", "AssuranceExtension", "Unable to process start session event. Could find start session URL or quick connect flag in the event", new Object[0]);
        }
    }

    AssuranceExtension(AbstractC6454m abstractC6454m, E e10, C6424f c6424f, List<r> list) {
        this(abstractC6454m, e10, c6424f, new z(com.adobe.marketing.mobile.B.h(), e10, list, c6424f));
    }

    AssuranceExtension(AbstractC6454m abstractC6454m, E e10, C6424f c6424f, z zVar) {
        super(abstractC6454m);
        this.f62121b = e10;
        this.f62123d = c6424f;
        this.f62122c = zVar;
    }
}
