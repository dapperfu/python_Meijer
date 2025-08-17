package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.adobe.marketing.mobile.assurance.internal.G;
import com.adobe.marketing.mobile.assurance.internal.L;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adobe.marketing.mobile.assurance.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6442y implements H {

    /* renamed from: s, reason: collision with root package name */
    private static final long f62310s = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final E f62311a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6426h f62312b;

    /* renamed from: c, reason: collision with root package name */
    private final String f62313c;

    /* renamed from: d, reason: collision with root package name */
    private final String f62314d;

    /* renamed from: e, reason: collision with root package name */
    private final M f62315e;

    /* renamed from: f, reason: collision with root package name */
    private final L f62316f;

    /* renamed from: g, reason: collision with root package name */
    private final G f62317g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f62318h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f62319i;

    /* renamed from: j, reason: collision with root package name */
    private final C6439v f62320j;

    /* renamed from: k, reason: collision with root package name */
    private final A f62321k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<B> f62322l;

    /* renamed from: m, reason: collision with root package name */
    private final C6424f f62323m;

    /* renamed from: n, reason: collision with root package name */
    private final X f62324n;

    /* renamed from: o, reason: collision with root package name */
    final L.b f62325o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f62326p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f62327q;

    /* renamed from: r, reason: collision with root package name */
    final B f62328r;

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.y$a */
    class a implements L.b {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.L.b
        public void a(C6430l c6430l) {
            if ("startEventForwarding".equals(c6430l.b())) {
                C6442y.this.t();
            } else {
                C6442y.this.f62320j.b(c6430l);
            }
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void b(G g10) {
        Q5.t.a("Assurance", "AssuranceSession", "Websocket connected.", new Object[0]);
        this.f62326p = false;
        this.f62323m.b(g10.k());
        this.f62316f.b();
        if (this.f62315e.g()) {
            return;
        }
        this.f62315e.k();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void e(G g10) {
    }

    void u(C6430l c6430l) {
        if (c6430l == null) {
            Q5.t.f("Assurance", "AssuranceSession", "Assurance cannot send event, event cannot be null.", new Object[0]);
        } else {
            if (this.f62315e.c(c6430l)) {
                return;
            }
            Q5.t.b("Assurance", "AssuranceSession", "Assurance cannot send event, problem queuing event in outBoundEventQueue", new Object[0]);
        }
    }

    private void i() {
        this.f62315e.h();
        this.f62316f.c();
        this.f62318h.quit();
        this.f62327q = true;
        this.f62323m.b(null);
        this.f62311a.a();
    }

    private void p() {
        for (B b10 : this.f62322l) {
            if (b10 != null) {
                b10.a();
            }
        }
    }

    private void q(EnumC6425g enumC6425g) {
        for (B b10 : this.f62322l) {
            if (b10 != null) {
                b10.b(enumC6425g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f62315e.m();
        this.f62321k.d();
        p();
        if (this.f62327q) {
            Iterator<C6430l> it = this.f62311a.b().iterator();
            while (it.hasNext()) {
                u(it.next());
            }
        }
        this.f62320j.c();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void a(G g10, G.c cVar) {
        this.f62321k.g(cVar);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void c(G g10, String str, int i10, boolean z10) {
        if (i10 == 1000) {
            i();
            this.f62321k.e(i10);
            this.f62320j.e();
            r(null);
            return;
        }
        if (i10 != 4400) {
            switch (i10) {
                case 4900:
                case 4901:
                case 4902:
                case 4903:
                    break;
                default:
                    Q5.t.f("Assurance", "AssuranceSession", String.format("Abnornmal closure of websocket. Reason - %s and closeCode - %s", str, Integer.valueOf(i10)), new Object[0]);
                    if (!this.f62326p) {
                        this.f62315e.i();
                        this.f62320j.d(i10);
                        q(C6428j.a(i10));
                        if (!this.f62321k.a()) {
                            this.f62326p = true;
                            this.f62321k.f();
                            Q5.t.f("Assurance", "AssuranceSession", "Assurance disconnected, attempting to reconnect..", new Object[0]);
                        }
                    }
                    this.f62319i.postDelayed(new Runnable() { // from class: com.adobe.marketing.mobile.assurance.internal.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f62309a.j();
                        }
                    }, this.f62326p ? f62310s : 0L);
                    break;
            }
            return;
        }
        i();
        this.f62321k.e(i10);
        this.f62320j.d(i10);
        this.f62320j.e();
        r(C6428j.a(i10));
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void d(G g10, String str) {
        try {
            if (this.f62316f.a(new C6430l(str))) {
                return;
            }
            Q5.t.f("Assurance", "AssuranceSession", "Cannnot process the inbound Assurance event from server, problem queuing event in inboundEventsQueue", new Object[0]);
        } catch (UnsupportedCharsetException e10) {
            Q5.t.f("Assurance", "AssuranceSession", String.format("Unable to marshal inbound event due to encoding. Error - %s", e10.getLocalizedMessage()), new Object[0]);
        } catch (JSONException e11) {
            Q5.t.f("Assurance", "AssuranceSession", String.format("Unable to marshal inbound event due to json format. Error - %s", e11.getLocalizedMessage()), new Object[0]);
        }
    }

    void h(r rVar) {
        this.f62320j.a(rVar);
    }

    void j() {
        String strC = F.c(this.f62312b);
        String strE = this.f62311a.e(true);
        if (f6.i.a(strE)) {
            String strA = this.f62323m.a();
            if (strA == null) {
                Q5.t.a("Assurance", "AssuranceSession", "Cannot connect. No orgId from Configuration state or stored url.", new Object[0]);
                return;
            } else {
                strE = Uri.parse(strA).getQueryParameter("orgId");
                Q5.t.a("Assurance", "AssuranceSession", "Using orgId from stored reconnection url.", new Object[0]);
            }
        }
        String str = String.format("wss://connect%s.griffon.adobe.com/client/v1?sessionId=%s&token=%s&orgId=%s&clientId=%s", strC, this.f62313c, this.f62314d, strE, this.f62311a.c());
        Q5.t.a("Assurance", "AssuranceSession", "Connecting to session with URL: " + str, new Object[0]);
        this.f62317g.i(str);
    }

    void k() {
        G g10 = this.f62317g;
        if (g10 != null && g10.l() != G.c.CLOSED) {
            this.f62317g.j();
        }
        i();
        this.f62320j.e();
    }

    EnumC6426h l() {
        return this.f62312b;
    }

    X m() {
        return this.f62324n;
    }

    String n() {
        return this.f62313c;
    }

    void o(EnumC6429k enumC6429k, String str) {
        this.f62321k.b(enumC6429k, str);
    }

    void s(Activity activity) {
        this.f62321k.c(activity);
    }

    void v(B b10) {
        if (b10 != null) {
            this.f62322l.add(b10);
        }
    }

    void w(B b10) {
        if (b10 != null) {
            this.f62322l.remove(b10);
        }
    }

    C6442y(E e10, String str, String str2, EnumC6426h enumC6426h, C6424f c6424f, List<r> list, List<C6430l> list2, X x10, B b10) {
        HandlerThread handlerThread = new HandlerThread("com.adobe.assurance.mobile.socketreconnectworker");
        this.f62318h = handlerThread;
        a aVar = new a();
        this.f62325o = aVar;
        this.f62326p = false;
        this.f62327q = false;
        this.f62311a = e10;
        this.f62312b = enumC6426h;
        this.f62313c = str;
        this.f62314d = str2;
        this.f62322l = new HashSet();
        this.f62323m = c6424f;
        this.f62324n = x10;
        this.f62321k = new A(x10);
        this.f62328r = b10;
        v(b10);
        this.f62320j = new C6439v(this);
        handlerThread.start();
        this.f62319i = new Handler(handlerThread.getLooper());
        G g10 = new G(this);
        this.f62317g = g10;
        this.f62315e = new M(Executors.newSingleThreadExecutor(), g10, new C6422d());
        this.f62316f = new L(aVar);
        if (list2 != null) {
            Iterator it = new ArrayList(list2).iterator();
            while (it.hasNext()) {
                u((C6430l) it.next());
            }
        } else {
            this.f62327q = true;
        }
        if (list != null) {
            Iterator<r> it2 = list.iterator();
            while (it2.hasNext()) {
                h(it2.next());
            }
        }
    }

    private void r(EnumC6425g enumC6425g) {
        q(enumC6425g);
        this.f62322l.clear();
    }
}
