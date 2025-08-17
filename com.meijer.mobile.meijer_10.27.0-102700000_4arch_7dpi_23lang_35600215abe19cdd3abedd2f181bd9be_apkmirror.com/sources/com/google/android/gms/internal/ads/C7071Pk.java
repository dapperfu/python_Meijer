package com.google.android.gms.internal.ads;

import Pc.C4557a0;
import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Pk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7071Pk {

    /* renamed from: b, reason: collision with root package name */
    private final Context f69405b;

    /* renamed from: c, reason: collision with root package name */
    private final String f69406c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f69407d;

    /* renamed from: e, reason: collision with root package name */
    private final Z80 f69408e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.E f69409f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.E f69410g;

    /* renamed from: h, reason: collision with root package name */
    private C7037Ok f69411h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f69404a = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f69412i = 1;

    public final C6868Jk b(M9 m92) {
        Pc.p0.k("getEngine: Trying to acquire lock");
        synchronized (this.f69404a) {
            try {
                Pc.p0.k("getEngine: Lock acquired");
                Pc.p0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f69404a) {
                    try {
                        Pc.p0.k("refreshIfDestroyed: Lock acquired");
                        C7037Ok c7037Ok = this.f69411h;
                        if (c7037Ok != null && this.f69412i == 0) {
                            c7037Ok.f(new InterfaceC7279Vq() { // from class: com.google.android.gms.internal.ads.xk
                                @Override // com.google.android.gms.internal.ads.InterfaceC7279Vq
                                public final void zza(Object obj) {
                                    this.f79842a.k((InterfaceC8455jk) obj);
                                }
                            }, new InterfaceC7213Tq() { // from class: com.google.android.gms.internal.ads.yk
                                @Override // com.google.android.gms.internal.ads.InterfaceC7213Tq
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
                Pc.p0.k("refreshIfDestroyed: Lock released");
                C7037Ok c7037Ok2 = this.f69411h;
                if (c7037Ok2 != null && c7037Ok2.a() != -1) {
                    int i10 = this.f69412i;
                    if (i10 == 0) {
                        Pc.p0.k("getEngine (NO_UPDATE): Lock released");
                        return this.f69411h.g();
                    }
                    if (i10 != 1) {
                        Pc.p0.k("getEngine (UPDATING): Lock released");
                        return this.f69411h.g();
                    }
                    this.f69412i = 2;
                    d(null);
                    Pc.p0.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f69411h.g();
                }
                this.f69412i = 2;
                this.f69411h = d(null);
                Pc.p0.k("getEngine (NULL or REJECTED): Lock released");
                return this.f69411h.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final C7037Ok d(M9 m92) {
        K80 k80A = J80.a(this.f69405b, 6);
        k80A.zzi();
        final C7037Ok c7037Ok = new C7037Ok(this.f69410g);
        Pc.p0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final M9 m93 = null;
        C6908Kq.f68179f.execute(new Runnable(m93, c7037Ok) { // from class: com.google.android.gms.internal.ads.zk

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C7037Ok f80466b;

            {
                this.f80466b = c7037Ok;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f80465a.i(null, this.f80466b);
            }
        });
        Pc.p0.k("loadNewJavascriptEngine: Promise created");
        c7037Ok.f(new C6698Ek(this, c7037Ok, k80A), new C6732Fk(this, c7037Ok, k80A));
        return c7037Ok;
    }

    final /* synthetic */ void j(C7037Ok c7037Ok, final InterfaceC8455jk interfaceC8455jk, ArrayList arrayList, long j10) {
        Pc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f69404a) {
            try {
                Pc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (c7037Ok.a() != -1 && c7037Ok.a() != 1) {
                    if (((Boolean) Mc.A.c().a(C8659lf.f75908B7)).booleanValue()) {
                        c7037Ok.d(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        c7037Ok.c();
                    }
                    Xj0 xj0 = C6908Kq.f68179f;
                    Objects.requireNonNull(interfaceC8455jk);
                    xj0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC8455jk.zzc();
                        }
                    });
                    Pc.p0.k("Could not receive /jsLoaded in " + String.valueOf(Mc.A.c().a(C8659lf.f76263b)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + c7037Ok.a() + ". Update status(onEngLoadedTimeout) is " + this.f69412i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (Lc.v.c().a() - j10) + " ms. Rejecting.");
                    Pc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                Pc.p0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C7071Pk(Context context, Qc.a aVar, String str, Pc.E e10, Pc.E e11, Z80 z80) {
        this.f69406c = str;
        this.f69405b = context.getApplicationContext();
        this.f69407d = aVar;
        this.f69408e = z80;
        this.f69409f = e10;
        this.f69410g = e11;
    }

    final /* synthetic */ void i(M9 m92, C7037Ok c7037Ok) {
        long jA = Lc.v.c().a();
        ArrayList arrayList = new ArrayList();
        try {
            Pc.p0.k("loadJavascriptEngine > Before createJavascriptEngine");
            C9310rk c9310rk = new C9310rk(this.f69405b, this.f69407d, null, null);
            Pc.p0.k("loadJavascriptEngine > After createJavascriptEngine");
            Pc.p0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            c9310rk.x0(new C9631uk(this, arrayList, jA, c7037Ok, c9310rk));
            Pc.p0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            c9310rk.H0("/jsLoaded", new C6562Ak(this, jA, c7037Ok, c9310rk));
            C4557a0 c4557a0 = new C4557a0();
            C6596Bk c6596Bk = new C6596Bk(this, null, c9310rk, c4557a0);
            c4557a0.b(c6596Bk);
            Pc.p0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            c9310rk.H0("/requestReload", c6596Bk);
            Pc.p0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f69406c)));
            if (this.f69406c.endsWith(".js")) {
                Pc.p0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                c9310rk.N(this.f69406c);
                Pc.p0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f69406c.startsWith("<html>")) {
                Pc.p0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                c9310rk.i(this.f69406c);
                Pc.p0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                Pc.p0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                c9310rk.s(this.f69406c);
                Pc.p0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            Pc.p0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            Pc.D0.f25081l.postDelayed(new RunnableC6664Dk(this, c7037Ok, c9310rk, arrayList, jA), ((Integer) Mc.A.c().a(C8659lf.f76277c)).intValue());
        } catch (Throwable th2) {
            Qc.p.e("Error creating webview.", th2);
            if (((Boolean) Mc.A.c().a(C8659lf.f75908B7)).booleanValue()) {
                c7037Ok.d(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f75936D7)).booleanValue()) {
                Lc.v.s().w(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                c7037Ok.c();
            } else {
                Lc.v.s().x(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                c7037Ok.c();
            }
        }
    }

    final /* synthetic */ void k(InterfaceC8455jk interfaceC8455jk) {
        if (interfaceC8455jk.zzi()) {
            this.f69412i = 1;
        }
    }
}
