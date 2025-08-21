package com.google.android.gms.internal.ads;

import Rc.C5178a0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Pk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7196Pk {

    /* renamed from: b, reason: collision with root package name */
    private final Context f70245b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70246c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f70247d;

    /* renamed from: e, reason: collision with root package name */
    private final Z80 f70248e;

    /* renamed from: f, reason: collision with root package name */
    private final Rc.E f70249f;

    /* renamed from: g, reason: collision with root package name */
    private final Rc.E f70250g;

    /* renamed from: h, reason: collision with root package name */
    private C7162Ok f70251h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f70244a = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f70252i = 1;

    public final C6993Jk b(M9 m92) {
        Rc.p0.k("getEngine: Trying to acquire lock");
        synchronized (this.f70244a) {
            try {
                Rc.p0.k("getEngine: Lock acquired");
                Rc.p0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f70244a) {
                    try {
                        Rc.p0.k("refreshIfDestroyed: Lock acquired");
                        C7162Ok c7162Ok = this.f70251h;
                        if (c7162Ok != null && this.f70252i == 0) {
                            c7162Ok.f(new InterfaceC7404Vq() { // from class: com.google.android.gms.internal.ads.xk
                                @Override // com.google.android.gms.internal.ads.InterfaceC7404Vq
                                public final void zza(Object obj) {
                                    this.f80682a.k((InterfaceC8580jk) obj);
                                }
                            }, new InterfaceC7338Tq() { // from class: com.google.android.gms.internal.ads.yk
                                @Override // com.google.android.gms.internal.ads.InterfaceC7338Tq
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                Rc.p0.k("refreshIfDestroyed: Lock released");
                C7162Ok c7162Ok2 = this.f70251h;
                if (c7162Ok2 != null && c7162Ok2.a() != -1) {
                    int i10 = this.f70252i;
                    if (i10 == 0) {
                        Rc.p0.k("getEngine (NO_UPDATE): Lock released");
                        return this.f70251h.g();
                    }
                    if (i10 != 1) {
                        Rc.p0.k("getEngine (UPDATING): Lock released");
                        return this.f70251h.g();
                    }
                    this.f70252i = 2;
                    d(null);
                    Rc.p0.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f70251h.g();
                }
                this.f70252i = 2;
                this.f70251h = d(null);
                Rc.p0.k("getEngine (NULL or REJECTED): Lock released");
                return this.f70251h.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final C7162Ok d(M9 m92) {
        K80 k80A = J80.a(this.f70245b, 6);
        k80A.zzi();
        final C7162Ok c7162Ok = new C7162Ok(this.f70250g);
        Rc.p0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final M9 m93 = null;
        C7033Kq.f69019f.execute(new Runnable(m93, c7162Ok) { // from class: com.google.android.gms.internal.ads.zk

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C7162Ok f81306b;

            {
                this.f81306b = c7162Ok;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f81305a.i(null, this.f81306b);
            }
        });
        Rc.p0.k("loadNewJavascriptEngine: Promise created");
        c7162Ok.f(new C6823Ek(this, c7162Ok, k80A), new C6857Fk(this, c7162Ok, k80A));
        return c7162Ok;
    }

    final /* synthetic */ void j(C7162Ok c7162Ok, final InterfaceC8580jk interfaceC8580jk, ArrayList arrayList, long j10) {
        Rc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f70244a) {
            try {
                Rc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (c7162Ok.a() != -1 && c7162Ok.a() != 1) {
                    if (((Boolean) Oc.A.c().a(C8784lf.f76748B7)).booleanValue()) {
                        c7162Ok.d(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        c7162Ok.c();
                    }
                    Xj0 xj0 = C7033Kq.f69019f;
                    Objects.requireNonNull(interfaceC8580jk);
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8580jk.zzc();
                        }
                    });
                    Rc.p0.k("Could not receive /jsLoaded in " + String.valueOf(Oc.A.c().a(C8784lf.f77103b)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c7162Ok.a() + ". Update status(onEngLoadedTimeout) is " + this.f70252i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (Nc.v.c().a() - j10) + " ms. Rejecting.");
                    Rc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                Rc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C7196Pk(Context context, Sc.a aVar, String str, Rc.E e10, Rc.E e11, Z80 z80) {
        this.f70246c = str;
        this.f70245b = context.getApplicationContext();
        this.f70247d = aVar;
        this.f70248e = z80;
        this.f70249f = e10;
        this.f70250g = e11;
    }

    final /* synthetic */ void i(M9 m92, C7162Ok c7162Ok) {
        long jA = Nc.v.c().a();
        ArrayList arrayList = new ArrayList();
        try {
            Rc.p0.k("loadJavascriptEngine > Before createJavascriptEngine");
            C9435rk c9435rk = new C9435rk(this.f70245b, this.f70247d, null, null);
            Rc.p0.k("loadJavascriptEngine > After createJavascriptEngine");
            Rc.p0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            c9435rk.x0(new C9756uk(this, arrayList, jA, c7162Ok, c9435rk));
            Rc.p0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            c9435rk.G0("/jsLoaded", new C6687Ak(this, jA, c7162Ok, c9435rk));
            C5178a0 c5178a0 = new C5178a0();
            C6721Bk c6721Bk = new C6721Bk(this, null, c9435rk, c5178a0);
            c5178a0.b(c6721Bk);
            Rc.p0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            c9435rk.G0("/requestReload", c6721Bk);
            Rc.p0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f70246c)));
            if (this.f70246c.endsWith(".js")) {
                Rc.p0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                c9435rk.N(this.f70246c);
                Rc.p0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f70246c.startsWith("<html>")) {
                Rc.p0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                c9435rk.i(this.f70246c);
                Rc.p0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                Rc.p0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                c9435rk.s(this.f70246c);
                Rc.p0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            Rc.p0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            Rc.D0.f32295l.postDelayed(new RunnableC6789Dk(this, c7162Ok, c9435rk, arrayList, jA), ((Integer) Oc.A.c().a(C8784lf.f77117c)).intValue());
        } catch (Throwable th2) {
            Sc.p.e("Error creating webview.", th2);
            if (((Boolean) Oc.A.c().a(C8784lf.f76748B7)).booleanValue()) {
                c7162Ok.d(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f76776D7)).booleanValue()) {
                Nc.v.s().w(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                c7162Ok.c();
            } else {
                Nc.v.s().x(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                c7162Ok.c();
            }
        }
    }

    final /* synthetic */ void k(InterfaceC8580jk interfaceC8580jk) {
        if (interfaceC8580jk.zzi()) {
            this.f70252i = 1;
        }
    }
}
