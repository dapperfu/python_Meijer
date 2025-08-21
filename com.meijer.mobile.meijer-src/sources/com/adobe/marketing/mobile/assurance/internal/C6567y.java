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
class C6567y implements H {

    /* renamed from: s, reason: collision with root package name */
    private static final long f63149s = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a, reason: collision with root package name */
    private final E f63150a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC6551h f63151b;

    /* renamed from: c, reason: collision with root package name */
    private final String f63152c;

    /* renamed from: d, reason: collision with root package name */
    private final String f63153d;

    /* renamed from: e, reason: collision with root package name */
    private final M f63154e;

    /* renamed from: f, reason: collision with root package name */
    private final L f63155f;

    /* renamed from: g, reason: collision with root package name */
    private final G f63156g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f63157h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f63158i;

    /* renamed from: j, reason: collision with root package name */
    private final C6564v f63159j;

    /* renamed from: k, reason: collision with root package name */
    private final A f63160k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<B> f63161l;

    /* renamed from: m, reason: collision with root package name */
    private final C6549f f63162m;

    /* renamed from: n, reason: collision with root package name */
    private final X f63163n;

    /* renamed from: o, reason: collision with root package name */
    final L.b f63164o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f63165p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f63166q;

    /* renamed from: r, reason: collision with root package name */
    final B f63167r;

    /* renamed from: com.adobe.marketing.mobile.assurance.internal.y$a */
    class a implements L.b {
        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.L.b
        public void a(C6555l c6555l) {
            if ("startEventForwarding".equals(c6555l.b())) {
                C6567y.this.t();
            } else {
                C6567y.this.f63159j.b(c6555l);
            }
        }
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void b(G g10) {
        R5.t.a("Assurance", "AssuranceSession", "Websocket connected.", new Object[0]);
        this.f63165p = false;
        this.f63162m.b(g10.k());
        this.f63155f.b();
        if (this.f63154e.g()) {
            return;
        }
        this.f63154e.k();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void e(G g10) {
    }

    void u(C6555l c6555l) {
        if (c6555l == null) {
            R5.t.f("Assurance", "AssuranceSession", "Assurance cannot send event, event cannot be null.", new Object[0]);
        } else {
            if (this.f63154e.c(c6555l)) {
                return;
            }
            R5.t.b("Assurance", "AssuranceSession", "Assurance cannot send event, problem queuing event in outBoundEventQueue", new Object[0]);
        }
    }

    private void i() {
        this.f63154e.h();
        this.f63155f.c();
        this.f63157h.quit();
        this.f63166q = true;
        this.f63162m.b(null);
        this.f63150a.a();
    }

    private void p() {
        for (B b10 : this.f63161l) {
            if (b10 != null) {
                b10.a();
            }
        }
    }

    private void q(EnumC6550g enumC6550g) {
        for (B b10 : this.f63161l) {
            if (b10 != null) {
                b10.b(enumC6550g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.f63154e.m();
        this.f63160k.d();
        p();
        if (this.f63166q) {
            Iterator<C6555l> it = this.f63150a.b().iterator();
            while (it.hasNext()) {
                u(it.next());
            }
        }
        this.f63159j.c();
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void a(G g10, G.c cVar) {
        this.f63160k.g(cVar);
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void c(G g10, String str, int i10, boolean z10) {
        if (i10 == 1000) {
            i();
            this.f63160k.e(i10);
            this.f63159j.e();
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
                    R5.t.f("Assurance", "AssuranceSession", String.format("Abnornmal closure of websocket. Reason - %s and closeCode - %s", str, Integer.valueOf(i10)), new Object[0]);
                    if (!this.f63165p) {
                        this.f63154e.i();
                        this.f63159j.d(i10);
                        q(C6553j.a(i10));
                        if (!this.f63160k.a()) {
                            this.f63165p = true;
                            this.f63160k.f();
                            R5.t.f("Assurance", "AssuranceSession", "Assurance disconnected, attempting to reconnect..", new Object[0]);
                        }
                    }
                    this.f63158i.postDelayed(new Runnable() { // from class: com.adobe.marketing.mobile.assurance.internal.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f63148a.j();
                        }
                    }, this.f63165p ? f63149s : 0L);
                    break;
            }
            return;
        }
        i();
        this.f63160k.e(i10);
        this.f63159j.d(i10);
        this.f63159j.e();
        r(C6553j.a(i10));
    }

    @Override // com.adobe.marketing.mobile.assurance.internal.H
    public void d(G g10, String str) {
        try {
            if (this.f63155f.a(new C6555l(str))) {
                return;
            }
            R5.t.f("Assurance", "AssuranceSession", "Cannnot process the inbound Assurance event from server, problem queuing event in inboundEventsQueue", new Object[0]);
        } catch (UnsupportedCharsetException e10) {
            R5.t.f("Assurance", "AssuranceSession", String.format("Unable to marshal inbound event due to encoding. Error - %s", e10.getLocalizedMessage()), new Object[0]);
        } catch (JSONException e11) {
            R5.t.f("Assurance", "AssuranceSession", String.format("Unable to marshal inbound event due to json format. Error - %s", e11.getLocalizedMessage()), new Object[0]);
        }
    }

    void h(r rVar) {
        this.f63159j.a(rVar);
    }

    void j() {
        String strC = F.c(this.f63151b);
        String strE = this.f63150a.e(true);
        if (g6.i.a(strE)) {
            String strA = this.f63162m.a();
            if (strA == null) {
                R5.t.a("Assurance", "AssuranceSession", "Cannot connect. No orgId from Configuration state or stored url.", new Object[0]);
                return;
            } else {
                strE = Uri.parse(strA).getQueryParameter("orgId");
                R5.t.a("Assurance", "AssuranceSession", "Using orgId from stored reconnection url.", new Object[0]);
            }
        }
        String str = String.format("wss://connect%s.griffon.adobe.com/client/v1?sessionId=%s&token=%s&orgId=%s&clientId=%s", strC, this.f63152c, this.f63153d, strE, this.f63150a.c());
        R5.t.a("Assurance", "AssuranceSession", "Connecting to session with URL: " + str, new Object[0]);
        this.f63156g.i(str);
    }

    void k() {
        G g10 = this.f63156g;
        if (g10 != null && g10.l() != G.c.CLOSED) {
            this.f63156g.j();
        }
        i();
        this.f63159j.e();
    }

    EnumC6551h l() {
        return this.f63151b;
    }

    X m() {
        return this.f63163n;
    }

    String n() {
        return this.f63152c;
    }

    void o(EnumC6554k enumC6554k, String str) {
        this.f63160k.b(enumC6554k, str);
    }

    void s(Activity activity) {
        this.f63160k.c(activity);
    }

    void v(B b10) {
        if (b10 != null) {
            this.f63161l.add(b10);
        }
    }

    void w(B b10) {
        if (b10 != null) {
            this.f63161l.remove(b10);
        }
    }

    C6567y(E e10, String str, String str2, EnumC6551h enumC6551h, C6549f c6549f, List<r> list, List<C6555l> list2, X x10, B b10) {
        HandlerThread handlerThread = new HandlerThread("com.adobe.assurance.mobile.socketreconnectworker");
        this.f63157h = handlerThread;
        a aVar = new a();
        this.f63164o = aVar;
        this.f63165p = false;
        this.f63166q = false;
        this.f63150a = e10;
        this.f63151b = enumC6551h;
        this.f63152c = str;
        this.f63153d = str2;
        this.f63161l = new HashSet();
        this.f63162m = c6549f;
        this.f63163n = x10;
        this.f63160k = new A(x10);
        this.f63167r = b10;
        v(b10);
        this.f63159j = new C6564v(this);
        handlerThread.start();
        this.f63158i = new Handler(handlerThread.getLooper());
        G g10 = new G(this);
        this.f63156g = g10;
        this.f63154e = new M(Executors.newSingleThreadExecutor(), g10, new C6547d());
        this.f63155f = new L(aVar);
        if (list2 != null) {
            Iterator it = new ArrayList(list2).iterator();
            while (it.hasNext()) {
                u((C6555l) it.next());
            }
        } else {
            this.f63166q = true;
        }
        if (list != null) {
            Iterator<r> it2 = list.iterator();
            while (it2.hasNext()) {
                h(it2.next());
            }
        }
    }

    private void r(EnumC6550g enumC6550g) {
        q(enumC6550g);
        this.f63161l.clear();
    }
}
