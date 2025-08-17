package com.google.android.gms.internal.ads;

import Mc.C4169y;
import Pc.C4560c;
import Pc.C4569g0;
import Pc.C4575j0;
import Pc.C4583n0;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.HandlerC6857Jd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
final class zzcfw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC9008ot {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f80645b0 = 0;

    /* renamed from: A, reason: collision with root package name */
    private BinderC7114Qt f80646A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f80647B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f80648C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC6930Lg f80649D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC6862Jg f80650E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC8546kc f80651F;

    /* renamed from: G, reason: collision with root package name */
    private int f80652G;

    /* renamed from: H, reason: collision with root package name */
    private int f80653H;

    /* renamed from: I, reason: collision with root package name */
    private C9942xf f80654I;

    /* renamed from: J, reason: collision with root package name */
    private final C9942xf f80655J;

    /* renamed from: K, reason: collision with root package name */
    private C9942xf f80656K;

    /* renamed from: L, reason: collision with root package name */
    private final C10049yf f80657L;

    /* renamed from: M, reason: collision with root package name */
    private int f80658M;

    /* renamed from: N, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f80659N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f80660O;

    /* renamed from: P, reason: collision with root package name */
    private final C4583n0 f80661P;

    /* renamed from: Q, reason: collision with root package name */
    private int f80662Q;

    /* renamed from: R, reason: collision with root package name */
    private int f80663R;

    /* renamed from: S, reason: collision with root package name */
    private int f80664S;

    /* renamed from: T, reason: collision with root package name */
    private int f80665T;

    /* renamed from: U, reason: collision with root package name */
    private Map f80666U;

    /* renamed from: V, reason: collision with root package name */
    private final WindowManager f80667V;

    /* renamed from: W, reason: collision with root package name */
    private final C7392Zc f80668W;

    /* renamed from: a, reason: collision with root package name */
    private final C8263hu f80669a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f80670a0;

    /* renamed from: b, reason: collision with root package name */
    private final M9 f80671b;

    /* renamed from: c, reason: collision with root package name */
    private final C9998y60 f80672c;

    /* renamed from: d, reason: collision with root package name */
    private final C7165Sf f80673d;

    /* renamed from: e, reason: collision with root package name */
    private final Qc.a f80674e;

    /* renamed from: f, reason: collision with root package name */
    private Lc.n f80675f;

    /* renamed from: g, reason: collision with root package name */
    private final Lc.a f80676g;

    /* renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f80677h;

    /* renamed from: i, reason: collision with root package name */
    private final float f80678i;

    /* renamed from: j, reason: collision with root package name */
    private Z50 f80679j;

    /* renamed from: k, reason: collision with root package name */
    private C7648c60 f80680k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f80681l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f80682m;

    /* renamed from: n, reason: collision with root package name */
    private C10184zt f80683n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f80684o;

    /* renamed from: p, reason: collision with root package name */
    private C7789dT f80685p;

    /* renamed from: q, reason: collision with root package name */
    private C7576bT f80686q;

    /* renamed from: r, reason: collision with root package name */
    private C8368iu f80687r;

    /* renamed from: s, reason: collision with root package name */
    private final String f80688s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f80689t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f80690u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f80691v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f80692w;

    /* renamed from: x, reason: collision with root package name */
    private Boolean f80693x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f80694y;

    /* renamed from: z, reason: collision with root package name */
    private final String f80695z;

    protected zzcfw(C8263hu c8263hu, C8368iu c8368iu, String str, boolean z10, boolean z11, M9 m92, C7165Sf c7165Sf, Qc.a aVar, C6554Af c6554Af, Lc.n nVar, Lc.a aVar2, C7392Zc c7392Zc, Z50 z50, C7648c60 c7648c60, C9998y60 c9998y60) {
        C7648c60 c7648c602;
        super(c8263hu);
        this.f80681l = false;
        this.f80682m = false;
        this.f80694y = true;
        this.f80695z = "";
        this.f80662Q = -1;
        this.f80663R = -1;
        this.f80664S = -1;
        this.f80665T = -1;
        this.f80669a = c8263hu;
        this.f80687r = c8368iu;
        this.f80688s = str;
        this.f80691v = z10;
        this.f80671b = m92;
        this.f80672c = c9998y60;
        this.f80673d = c7165Sf;
        this.f80674e = aVar;
        this.f80675f = nVar;
        this.f80676g = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f80667V = windowManager;
        Lc.v.t();
        DisplayMetrics displayMetricsZ = Pc.D0.Z(windowManager);
        this.f80677h = displayMetricsZ;
        this.f80678i = displayMetricsZ.density;
        this.f80668W = c7392Zc;
        this.f80679j = z50;
        this.f80680k = c7648c60;
        this.f80661P = new C4583n0(c8263hu.a(), this, this, null);
        this.f80670a0 = false;
        setBackgroundColor(0);
        if (((Boolean) Mc.A.c().a(C8659lf.f76569wb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            Qc.p.e("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) Mc.A.c().a(C8659lf.f76555vb)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(Lc.v.t().H(c8263hu, aVar.f29929a));
        Lc.v.t();
        final Context context = getContext();
        C4569g0.a(context, new Callable() { // from class: Pc.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC6857Jd0 handlerC6857Jd0 = D0.f25081l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) Mc.A.c().a(C8659lf.f76181V0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        f1();
        addJavascriptInterface(new C7249Ut(this, new C7216Tt(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        n1();
        C10049yf c10049yf = new C10049yf(new C6554Af(true, "make_wv", this.f80688s));
        this.f80657L = c10049yf;
        c10049yf.a().c(null);
        if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() && (c7648c602 = this.f80680k) != null && c7648c602.f73103b != null) {
            c10049yf.a().d("gqi", this.f80680k.f73103b);
        }
        c10049yf.a();
        C9942xf c9942xfF = C6554Af.f();
        this.f80655J = c9942xfF;
        c10049yf.b("native:view_create", c9942xfF);
        this.f80656K = null;
        this.f80654I = null;
        C4575j0.a().b(c8263hu);
        Lc.v.s().u();
    }

    private final synchronized void f1() {
        Z50 z50 = this.f80679j;
        if (z50 != null && z50.f72046m0) {
            Qc.p.b("Disabling hardware acceleration on an overlay.");
            h1();
            return;
        }
        if (!this.f80691v && !this.f80687r.i()) {
            Qc.p.b("Enabling hardware acceleration on an AdView.");
            j1();
            return;
        }
        Qc.p.b("Enabling hardware acceleration on an overlay.");
        j1();
    }

    private final synchronized void g1() {
        if (this.f80660O) {
            return;
        }
        this.f80660O = true;
        Lc.v.s().s();
    }

    private final synchronized void h1() {
        try {
            if (!this.f80692w) {
                setLayerType(1, null);
            }
            this.f80692w = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void j1() {
        try {
            if (this.f80692w) {
                setLayerType(0, null);
            }
            this.f80692w = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void k1(String str) {
        final String str2 = "about:blank";
        try {
            Pc.D0.f25081l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.Jt

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f67990b = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f67989a.b1(this.f67990b);
                }
            });
        } catch (Throwable th2) {
            Lc.v.s().x(th2, "AdWebViewImpl.loadUrlUnsafe");
            Qc.p.h("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final synchronized void m1() {
        try {
            Map map = this.f80666U;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC9647us) it.next()).release();
                }
            }
            this.f80666U = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void o1() {
        Boolean boolM = Lc.v.s().m();
        this.f80693x = boolM;
        if (boolM == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                d1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                d1(Boolean.FALSE);
            }
        }
    }

    @Override // Lc.n
    public final synchronized void A0() {
        Lc.n nVar = this.f80675f;
        if (nVar != null) {
            nVar.A0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized AbstractC9647us C(String str) {
        Map map = this.f80666U;
        if (map == null) {
            return null;
        }
        return (AbstractC9647us) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized void D(String str, AbstractC9647us abstractC9647us) {
        try {
            if (this.f80666U == null) {
                this.f80666U = new HashMap();
            }
            this.f80666U.put(str, abstractC9647us);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        boolean z10;
        synchronized (this) {
            z10 = c9720vb.f79090j;
            this.f80647B = z10;
        }
        i1(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final C9998y60 E() {
        return this.f80672c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void E0(InterfaceC8546kc interfaceC8546kc) {
        this.f80651F = interfaceC8546kc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized boolean F() {
        return this.f80689t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void J(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void J0(String str, String str2, String str3) throws Throwable {
        Throwable th2;
        String str4;
        try {
            try {
                if (M()) {
                    Qc.p.g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) Mc.A.c().a(C8659lf.f76264b0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (JSONException e10) {
                    Qc.p.h("Unable to build MRAID_ENV", e10);
                    str4 = null;
                }
                String strB = C7414Zt.b(str2, str4);
                com.fullstory.FS.trackWebView(this);
                super.loadDataWithBaseURL(str, strB, "text/html", "UTF-8", null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void K(int i10) {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f80684o;
        if (hVar != null) {
            hVar.C9(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void L0(boolean z10) {
        try {
            boolean z11 = this.f80691v;
            this.f80691v = z10;
            f1();
            if (z10 != z11) {
                if (((Boolean) Mc.A.c().a(C8659lf.f76278c0)).booleanValue()) {
                    if (!this.f80687r.i()) {
                    }
                }
                new C7822dn(this, "").g(true != z10 ? "default" : "expanded");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized boolean M() {
        return this.f80690u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void P0(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f80684o = hVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void Q(boolean z10) {
        this.f80670a0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void Q0(boolean z10) {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f80684o;
        if (hVar != null) {
            hVar.K9(this.f80683n.u(), z10);
        } else {
            this.f80689t = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void S(Z50 z50, C7648c60 c7648c60) {
        this.f80679j = z50;
        this.f80680k = c7648c60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void T(InterfaceC6862Jg interfaceC6862Jg) {
        this.f80650E = interfaceC6862Jg;
    }

    public final C10184zt T0() {
        return this.f80683n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized boolean U() {
        return this.f80691v;
    }

    final synchronized Boolean U0() {
        return this.f80693x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void W(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f80659N = hVar;
    }

    protected final synchronized void X0(String str, ValueCallback valueCallback) {
        if (M()) {
            Qc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void Y(boolean z10) {
        if (z10) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.overlay.h hVar = this.f80684o;
        if (hVar != null) {
            hVar.h1(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized String b() {
        return this.f80688s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7516au
    public final synchronized C8368iu c() {
        return this.f80687r;
    }

    protected final synchronized void c1(String str) {
        if (M()) {
            Qc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            com.fullstory.FS.trackWebView(this);
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized C7789dT d() {
        return this.f80685p;
    }

    final void d1(Boolean bool) {
        synchronized (this) {
            this.f80693x = bool;
        }
        Lc.v.s().z(bool);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void destroy() {
        try {
            n1();
            this.f80661P.a();
            com.google.android.gms.ads.internal.overlay.h hVar = this.f80684o;
            if (hVar != null) {
                hVar.zzb();
                this.f80684o.zzm();
                this.f80684o = null;
            }
            this.f80685p = null;
            this.f80686q = null;
            this.f80683n.H0();
            this.f80651F = null;
            this.f80675f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f80690u) {
                return;
            }
            Lc.v.C().h(this);
            m1();
            this.f80690u = true;
            if (!((Boolean) Mc.A.c().a(C8659lf.f75981Ga)).booleanValue()) {
                Pc.p0.k("Destroying the WebView immediately...");
                o();
                return;
            }
            Activity activityA = this.f80669a.a();
            if (activityA != null && activityA.isDestroyed()) {
                Pc.p0.k("Destroying the WebView immediately...");
                o();
            } else {
                Pc.p0.k("Initiating WebView self destruct sequence in 3...");
                Pc.p0.k("Loading blank page in WebView, 2...");
                k1("about:blank");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7940et
    public final Z50 e() {
        return this.f80679j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void e0(InterfaceC6930Lg interfaceC6930Lg) {
        this.f80649D = interfaceC6930Lg;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (M()) {
            Qc.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f75995Ha)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            C6908Kq.f68179f.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.It
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67726a.Z0(str, valueCallback);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final WebViewClient f() {
        return this.f80683n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void f0(C7576bT c7576bT) {
        this.f80686q = c7576bT;
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f80690u) {
                        this.f80683n.H0();
                        Lc.v.C().h(this);
                        m1();
                        g1();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7623bu
    public final M9 g() {
        return this.f80671b;
    }

    @Override // Lc.n
    public final synchronized void g0() {
        Lc.n nVar = this.f80675f;
        if (nVar != null) {
            nVar.g0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7148Rt
    public final C7648c60 h() {
        return this.f80680k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized InterfaceC8546kc k() {
        return this.f80651F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void k0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized com.google.android.gms.ads.internal.overlay.h l() {
        return this.f80684o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean l0() {
        return false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void loadData(String str, String str2, String str3) {
        if (M()) {
            Qc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            com.fullstory.FS.trackWebView(this);
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (M()) {
                    Qc.p.g("#004 The webview is destroyed. Ignoring action.");
                } else {
                    com.fullstory.FS.trackWebView(this);
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void loadUrl(final String str) {
        if (M()) {
            Qc.p.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Lt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68448a.a1(str);
                }
            });
        } catch (Throwable th2) {
            Lc.v.s().x(th2, "AdWebViewImpl.loadUrl");
            Qc.p.h("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized com.google.android.gms.ads.internal.overlay.h m() {
        return this.f80659N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void m0(boolean z10) {
        com.google.android.gms.ads.internal.overlay.h hVar;
        int i10 = this.f80652G + (true != z10 ? -1 : 1);
        this.f80652G = i10;
        if (i10 > 0 || (hVar = this.f80684o) == null) {
            return;
        }
        hVar.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized InterfaceC6930Lg n() {
        return this.f80649D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void n0(C8368iu c8368iu) {
        this.f80687r = c8368iu;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void o() {
        Pc.p0.k("Destroying WebView!");
        g1();
        Pc.D0.f25081l.post(new RunnableC7012Nt(this));
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!M()) {
                this.f80661P.c();
            }
            if (this.f80670a0) {
                onResume();
                this.f80670a0 = false;
            }
            boolean z10 = this.f80647B;
            C10184zt c10184zt = this.f80683n;
            if (c10184zt != null && c10184zt.L()) {
                if (!this.f80648C) {
                    this.f80683n.p0();
                    this.f80683n.y0();
                    this.f80648C = true;
                }
                e1();
                z10 = true;
            }
            i1(z10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        C10184zt c10184zt;
        synchronized (this) {
            try {
                if (!M()) {
                    this.f80661P.d();
                }
                super.onDetachedFromWindow();
                if (this.f80648C && (c10184zt = this.f80683n) != null && c10184zt.L() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f80683n.p0();
                    this.f80683n.y0();
                    this.f80648C = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfw.onMeasure(int, int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized void p(int i10) {
        this.f80658M = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void p0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized void r(BinderC7114Qt binderC7114Qt) {
        if (this.f80646A != null) {
            Qc.p.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f80646A = binderC7114Qt;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized C7576bT t() {
        return this.f80686q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void t0(C7789dT c7789dT) {
        this.f80685p = c7789dT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized boolean u0() {
        return this.f80694y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized void v0(boolean z10) {
        this.f80694y = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final synchronized boolean x() {
        return this.f80652G > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7835du
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final /* synthetic */ InterfaceC8156gu zzN() {
        return this.f80683n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized int zzf() {
        return this.f80658M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C9942xf zzk() {
        return this.f80655J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C10049yf zzm() {
        return this.f80657L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C9859wr zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized BinderC7114Qt zzq() {
        return this.f80646A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized String zzr() {
        C7648c60 c7648c60 = this.f80680k;
        if (c7648c60 == null) {
            return null;
        }
        return c7648c60.f73103b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized String zzs() {
        return this.f80695z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final synchronized void zzw() {
        InterfaceC6862Jg interfaceC6862Jg = this.f80650E;
        if (interfaceC6862Jg != null) {
            final IK ik2 = (IK) interfaceC6862Jg;
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.GK
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ik2.zzd();
                    } catch (RemoteException e10) {
                        Qc.p.i("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    private final void i1(boolean z10) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z10 ? "0" : "1");
        L("onAdVisibilityChanged", map);
    }

    private final void l1() {
        C9407sf.a(this.f80657L.a(), this.f80655J, "aeh2");
    }

    private final void n1() {
        C10049yf c10049yf = this.f80657L;
        if (c10049yf == null) {
            return;
        }
        C6554Af c6554AfA = c10049yf.a();
        C9194qf c9194qfH = Lc.v.s().h();
        if (c9194qfH != null) {
            c9194qfH.f(c6554AfA);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final Context A() {
        return this.f80669a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void B0(int i10) {
        if (i10 == 0) {
            C10049yf c10049yf = this.f80657L;
            C9407sf.a(c10049yf.a(), this.f80655J, "aebb2");
        }
        l1();
        this.f80657L.a();
        this.f80657L.a().d("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.f80674e.f29929a);
        L("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void H() {
        this.f80661P.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void I() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(Lc.v.v().e()));
        map.put("app_volume", String.valueOf(Lc.v.v().a()));
        map.put("device_volume", String.valueOf(C4560c.b(getContext())));
        L("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void K0(String str, String str2, int i10) throws NumberFormatException {
        this.f80683n.U0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void O(boolean z10) {
        this.f80683n.I0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void R() {
        if (this.f80654I == null) {
            C10049yf c10049yf = this.f80657L;
            C9407sf.a(c10049yf.a(), this.f80655J, "aes2");
            this.f80657L.a();
            C9942xf c9942xfF = C6554Af.f();
            this.f80654I = c9942xfF;
            this.f80657L.b("native:view_show", c9942xfF);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f80674e.f29929a);
        L("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void X(String str, InterfaceC7069Pi interfaceC7069Pi) {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.q(str, interfaceC7069Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void a(String str, String str2) {
        Y0(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void b0(boolean z10) {
        this.f80683n.j(false);
    }

    final /* synthetic */ void b1(String str) {
        com.fullstory.FS.trackWebView(this);
        super.loadUrl("about:blank");
    }

    public final boolean e1() throws JSONException {
        int i10;
        int iX;
        if (this.f80683n.u() || this.f80683n.L()) {
            C4169y.b();
            DisplayMetrics displayMetrics = this.f80677h;
            int iX2 = Qc.g.x(displayMetrics, displayMetrics.widthPixels);
            C4169y.b();
            DisplayMetrics displayMetrics2 = this.f80677h;
            int iX3 = Qc.g.x(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityA = this.f80669a.a();
            if (activityA == null || activityA.getWindow() == null) {
                i10 = iX2;
                iX = iX3;
            } else {
                Lc.v.t();
                int[] iArrQ = Pc.D0.q(activityA);
                C4169y.b();
                int iX4 = Qc.g.x(this.f80677h, iArrQ[0]);
                C4169y.b();
                iX = Qc.g.x(this.f80677h, iArrQ[1]);
                i10 = iX4;
            }
            int i11 = this.f80663R;
            if (i11 != iX2 || this.f80662Q != iX3 || this.f80664S != i10 || this.f80665T != iX) {
                boolean z10 = (i11 == iX2 && this.f80662Q == iX3) ? false : true;
                this.f80663R = iX2;
                this.f80662Q = iX3;
                this.f80664S = i10;
                this.f80665T = iX;
                new C7822dn(this, "").e(iX2, iX3, i10, iX, this.f80677h.density, this.f80667V.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void h0(String str, InterfaceC7069Pi interfaceC7069Pi) {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.i(str, interfaceC7069Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final void j(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        Qc.p.b("Dispatching AFMA event: ".concat(sb2.toString()));
        Y0(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void o0(String str, com.google.android.gms.common.util.o oVar) {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.s(str, oVar);
        }
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) Mc.A.c().a(C8659lf.f76191Va)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            Lc.v.t();
            Pc.D0.t(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            Qc.p.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            Lc.v.s().x(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = ((Boolean) Mc.A.c().a(C8659lf.f75932D3)).booleanValue() && this.f80683n.C();
        if ((!this.f80683n.L() || this.f80683n.J()) && !z10) {
            M9 m92 = this.f80671b;
            if (m92 != null) {
                m92.d(motionEvent);
            }
            C7165Sf c7165Sf = this.f80673d;
            if (c7165Sf != null) {
                c7165Sf.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC6930Lg interfaceC6930Lg = this.f80649D;
                    if (interfaceC6930Lg != null) {
                        interfaceC6930Lg.a(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (M()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void q(boolean z10, int i10, boolean z11) throws NumberFormatException {
        this.f80683n.V0(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void q0(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        L("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void s0(boolean z10, int i10, String str, boolean z11, boolean z12) throws NumberFormatException {
        this.f80683n.a(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final com.google.common.util.concurrent.q u() {
        C7165Sf c7165Sf = this.f80673d;
        return c7165Sf == null ? Mj0.h(null) : c7165Sf.a();
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void w() {
        Pc.p0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void w0(Context context) {
        this.f80669a.setBaseContext(context);
        this.f80661P.e(this.f80669a.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final List y() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void y0(Oc.l lVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        this.f80683n.T0(lVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void z() {
        if (this.f80656K == null) {
            this.f80657L.a();
            C9942xf c9942xfF = C6554Af.f();
            this.f80656K = c9942xfF;
            this.f80657L.b("native:view_load", c9942xfF);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void z0(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        this.f80683n.X0(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7282Vt, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Activity zzi() {
        return this.f80669a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Lc.a zzj() {
        return this.f80676g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7729cu, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Qc.a zzn() {
        return this.f80674e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
        C10184zt c10184zt = this.f80683n;
        if (c10184zt != null) {
            c10184zt.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void G() {
        l1();
        HashMap map = new HashMap(1);
        map.put("version", this.f80674e.f29929a);
        L("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void G0() {
        com.google.android.gms.ads.internal.overlay.h hVarL = l();
        if (hVarL != null) {
            hVarL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final void L(String str, Map map) {
        try {
            j(str, C4169y.b().l(map));
        } catch (JSONException unused) {
            Qc.p.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void R0(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    protected final void Y0(String str) {
        if (com.google.android.gms.common.util.n.b()) {
            if (U0() == null) {
                o1();
            }
            if (U0().booleanValue()) {
                X0(str, null);
                return;
            } else {
                c1("javascript:".concat(str));
                return;
            }
        }
        c1("javascript:".concat(str));
    }

    final /* synthetic */ void Z0(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void a1(String str) {
        com.fullstory.FS.trackWebView(this);
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean i0(final boolean z10, final int i10) {
        destroy();
        this.f80668W.b(new InterfaceC7359Yc() { // from class: com.google.android.gms.internal.ads.Kt
            @Override // com.google.android.gms.internal.ads.InterfaceC7359Yc
            public final void a(C6824Ie c6824Ie) {
                int i11 = zzcfw.f80645b0;
                C8978oe c8978oeD0 = C9085pe.d0();
                boolean zW = c8978oeD0.w();
                boolean z11 = z10;
                if (zW != z11) {
                    c8978oeD0.u(z11);
                }
                c8978oeD0.v(i10);
                c6824Ie.z(c8978oeD0.p());
            }
        });
        this.f80668W.c(10003);
        return true;
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (M()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zE1 = e1();
        com.google.android.gms.ads.internal.overlay.h hVarL = l();
        if (hVarL != null && zE1) {
            hVarL.zzn();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void onPause() {
        if (!M()) {
            try {
                super.onPause();
                if (((Boolean) Mc.A.c().a(C8659lf.f76556vc)).booleanValue() && L4.f.a("MUTE_AUDIO")) {
                    Qc.p.b("Muting webview");
                    L4.e.k(this, true);
                }
            } catch (Exception e10) {
                Qc.p.e("Could not pause webview.", e10);
                if (((Boolean) Mc.A.c().a(C8659lf.f76598yc)).booleanValue()) {
                    Lc.v.s().x(e10, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void onResume() {
        if (!M()) {
            try {
                super.onResume();
                if (((Boolean) Mc.A.c().a(C8659lf.f76556vc)).booleanValue() && L4.f.a("MUTE_AUDIO")) {
                    Qc.p.b("Unmuting webview");
                    L4.e.k(this, false);
                }
            } catch (Exception e10) {
                Qc.p.e("Could not resume webview.", e10);
                if (((Boolean) Mc.A.c().a(C8659lf.f76598yc)).booleanValue()) {
                    Lc.v.s().x(e10, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C10184zt) {
            this.f80683n = (C10184zt) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (M()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            Qc.p.e("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void zza(String str) {
        Y0(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final int zzh() {
        return getMeasuredWidth();
    }
}
