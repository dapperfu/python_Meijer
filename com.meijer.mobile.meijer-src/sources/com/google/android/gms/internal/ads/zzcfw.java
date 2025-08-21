package com.google.android.gms.internal.ads;

import Oc.C4447y;
import Rc.C5181c;
import Rc.C5190g0;
import Rc.C5196j0;
import Rc.C5204n0;
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
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.HandlerC6982Jd0;
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
final class zzcfw extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC9133ot {

    /* renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f81485b0 = 0;

    /* renamed from: A, reason: collision with root package name */
    private BinderC7239Qt f81486A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f81487B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f81488C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC7055Lg f81489D;

    /* renamed from: E, reason: collision with root package name */
    private InterfaceC6987Jg f81490E;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC8671kc f81491F;

    /* renamed from: G, reason: collision with root package name */
    private int f81492G;

    /* renamed from: H, reason: collision with root package name */
    private int f81493H;

    /* renamed from: I, reason: collision with root package name */
    private C10067xf f81494I;

    /* renamed from: J, reason: collision with root package name */
    private final C10067xf f81495J;

    /* renamed from: K, reason: collision with root package name */
    private C10067xf f81496K;

    /* renamed from: L, reason: collision with root package name */
    private final C10174yf f81497L;

    /* renamed from: M, reason: collision with root package name */
    private int f81498M;

    /* renamed from: N, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f81499N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f81500O;

    /* renamed from: P, reason: collision with root package name */
    private final C5204n0 f81501P;

    /* renamed from: Q, reason: collision with root package name */
    private int f81502Q;

    /* renamed from: R, reason: collision with root package name */
    private int f81503R;

    /* renamed from: S, reason: collision with root package name */
    private int f81504S;

    /* renamed from: T, reason: collision with root package name */
    private int f81505T;

    /* renamed from: U, reason: collision with root package name */
    private Map f81506U;

    /* renamed from: V, reason: collision with root package name */
    private final WindowManager f81507V;

    /* renamed from: W, reason: collision with root package name */
    private final C7517Zc f81508W;

    /* renamed from: a, reason: collision with root package name */
    private final C8388hu f81509a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f81510a0;

    /* renamed from: b, reason: collision with root package name */
    private final M9 f81511b;

    /* renamed from: c, reason: collision with root package name */
    private final C10123y60 f81512c;

    /* renamed from: d, reason: collision with root package name */
    private final C7290Sf f81513d;

    /* renamed from: e, reason: collision with root package name */
    private final Sc.a f81514e;

    /* renamed from: f, reason: collision with root package name */
    private Nc.n f81515f;

    /* renamed from: g, reason: collision with root package name */
    private final Nc.a f81516g;

    /* renamed from: h, reason: collision with root package name */
    private final DisplayMetrics f81517h;

    /* renamed from: i, reason: collision with root package name */
    private final float f81518i;

    /* renamed from: j, reason: collision with root package name */
    private Z50 f81519j;

    /* renamed from: k, reason: collision with root package name */
    private C7773c60 f81520k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f81521l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f81522m;

    /* renamed from: n, reason: collision with root package name */
    private C10309zt f81523n;

    /* renamed from: o, reason: collision with root package name */
    private com.google.android.gms.ads.internal.overlay.h f81524o;

    /* renamed from: p, reason: collision with root package name */
    private C7914dT f81525p;

    /* renamed from: q, reason: collision with root package name */
    private C7701bT f81526q;

    /* renamed from: r, reason: collision with root package name */
    private C8493iu f81527r;

    /* renamed from: s, reason: collision with root package name */
    private final String f81528s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f81529t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f81530u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f81531v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f81532w;

    /* renamed from: x, reason: collision with root package name */
    private Boolean f81533x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f81534y;

    /* renamed from: z, reason: collision with root package name */
    private final String f81535z;

    protected zzcfw(C8388hu c8388hu, C8493iu c8493iu, String str, boolean z10, boolean z11, M9 m92, C7290Sf c7290Sf, Sc.a aVar, C6679Af c6679Af, Nc.n nVar, Nc.a aVar2, C7517Zc c7517Zc, Z50 z50, C7773c60 c7773c60, C10123y60 c10123y60) {
        C7773c60 c7773c602;
        super(c8388hu);
        this.f81521l = false;
        this.f81522m = false;
        this.f81534y = true;
        this.f81535z = "";
        this.f81502Q = -1;
        this.f81503R = -1;
        this.f81504S = -1;
        this.f81505T = -1;
        this.f81509a = c8388hu;
        this.f81527r = c8493iu;
        this.f81528s = str;
        this.f81531v = z10;
        this.f81511b = m92;
        this.f81512c = c10123y60;
        this.f81513d = c7290Sf;
        this.f81514e = aVar;
        this.f81515f = nVar;
        this.f81516g = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f81507V = windowManager;
        Nc.v.t();
        DisplayMetrics displayMetricsZ = Rc.D0.Z(windowManager);
        this.f81517h = displayMetricsZ;
        this.f81518i = displayMetricsZ.density;
        this.f81508W = c7517Zc;
        this.f81519j = z50;
        this.f81520k = c7773c60;
        this.f81501P = new C5204n0(c8388hu.a(), this, this, null);
        this.f81510a0 = false;
        setBackgroundColor(0);
        if (((Boolean) Oc.A.c().a(C8784lf.f77409wb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            Sc.p.e("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) Oc.A.c().a(C8784lf.f77395vb)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(Nc.v.t().H(c8388hu, aVar.f34479a));
        Nc.v.t();
        final Context context = getContext();
        C5190g0.a(context, new Callable() { // from class: Rc.v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC6982Jd0 handlerC6982Jd0 = D0.f32295l;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) Oc.A.c().a(C8784lf.f77021V0)).booleanValue()) {
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
        addJavascriptInterface(new C7374Ut(this, new C7341Tt(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        n1();
        C10174yf c10174yf = new C10174yf(new C6679Af(true, "make_wv", this.f81528s));
        this.f81497L = c10174yf;
        c10174yf.a().c(null);
        if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() && (c7773c602 = this.f81520k) != null && c7773c602.f73943b != null) {
            c10174yf.a().d("gqi", this.f81520k.f73943b);
        }
        c10174yf.a();
        C10067xf c10067xfF = C6679Af.f();
        this.f81495J = c10067xfF;
        c10174yf.b("native:view_create", c10067xfF);
        this.f81496K = null;
        this.f81494I = null;
        C5196j0.a().b(c8388hu);
        Nc.v.s().u();
    }

    private final synchronized void f1() {
        Z50 z50 = this.f81519j;
        if (z50 != null && z50.f72886m0) {
            Sc.p.b("Disabling hardware acceleration on an overlay.");
            h1();
            return;
        }
        if (!this.f81531v && !this.f81527r.i()) {
            Sc.p.b("Enabling hardware acceleration on an AdView.");
            j1();
            return;
        }
        Sc.p.b("Enabling hardware acceleration on an overlay.");
        j1();
    }

    private final synchronized void g1() {
        if (this.f81500O) {
            return;
        }
        this.f81500O = true;
        Nc.v.s().s();
    }

    private final synchronized void h1() {
        try {
            if (!this.f81532w) {
                setLayerType(1, null);
            }
            this.f81532w = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void j1() {
        try {
            if (this.f81532w) {
                setLayerType(0, null);
            }
            this.f81532w = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void k1(String str) {
        final String str2 = "about:blank";
        try {
            Rc.D0.f32295l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.Jt

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f68830b = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    this.f68829a.b1(this.f68830b);
                }
            });
        } catch (Throwable th2) {
            Nc.v.s().x(th2, "AdWebViewImpl.loadUrlUnsafe");
            Sc.p.h("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final synchronized void m1() {
        try {
            Map map = this.f81506U;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC9772us) it.next()).release();
                }
            }
            this.f81506U = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void o1() {
        Boolean boolM = Nc.v.s().m();
        this.f81533x = boolM;
        if (boolM == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                d1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                d1(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized AbstractC9772us C(String str) {
        Map map = this.f81506U;
        if (map == null) {
            return null;
        }
        return (AbstractC9772us) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        boolean z10;
        synchronized (this) {
            z10 = c9845vb.f79930j;
            this.f81487B = z10;
        }
        i1(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized void D(String str, AbstractC9772us abstractC9772us) {
        try {
            if (this.f81506U == null) {
                this.f81506U = new HashMap();
            }
            this.f81506U.put(str, abstractC9772us);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void D0(InterfaceC8671kc interfaceC8671kc) {
        this.f81491F = interfaceC8671kc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final C10123y60 E() {
        return this.f81512c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized boolean F() {
        return this.f81529t;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void I0(String str, String str2, String str3) throws Throwable {
        Throwable th2;
        String str4;
        try {
            try {
                if (M()) {
                    Sc.p.g("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) Oc.A.c().a(C8784lf.f77104b0);
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
                    Sc.p.h("Unable to build MRAID_ENV", e10);
                    str4 = null;
                }
                String strB = C7539Zt.b(str2, str4);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void J(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void K(int i10) {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f81524o;
        if (hVar != null) {
            hVar.C9(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void K0(boolean z10) {
        try {
            boolean z11 = this.f81531v;
            this.f81531v = z10;
            f1();
            if (z10 != z11) {
                if (((Boolean) Oc.A.c().a(C8784lf.f77118c0)).booleanValue()) {
                    if (!this.f81527r.i()) {
                    }
                }
                new C7947dn(this, "").g(true != z10 ? "default" : "expanded");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized boolean M() {
        return this.f81530u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void P0(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f81524o = hVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void Q(boolean z10) {
        this.f81510a0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void Q0(boolean z10) {
        com.google.android.gms.ads.internal.overlay.h hVar = this.f81524o;
        if (hVar != null) {
            hVar.K9(this.f81523n.u(), z10);
        } else {
            this.f81529t = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void S(Z50 z50, C7773c60 c7773c60) {
        this.f81519j = z50;
        this.f81520k = c7773c60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void T(InterfaceC6987Jg interfaceC6987Jg) {
        this.f81490E = interfaceC6987Jg;
    }

    public final C10309zt T0() {
        return this.f81523n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized boolean U() {
        return this.f81531v;
    }

    final synchronized Boolean U0() {
        return this.f81533x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void W(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f81499N = hVar;
    }

    protected final synchronized void X0(String str, ValueCallback valueCallback) {
        if (M()) {
            Sc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void Y(boolean z10) {
        if (z10) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.overlay.h hVar = this.f81524o;
        if (hVar != null) {
            hVar.j1(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized String b() {
        return this.f81528s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7641au
    public final synchronized C8493iu c() {
        return this.f81527r;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void c0(InterfaceC7055Lg interfaceC7055Lg) {
        this.f81489D = interfaceC7055Lg;
    }

    protected final synchronized void c1(String str) {
        if (M()) {
            Sc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            com.fullstory.FS.trackWebView(this);
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized C7914dT d() {
        return this.f81525p;
    }

    final void d1(Boolean bool) {
        synchronized (this) {
            this.f81533x = bool;
        }
        Nc.v.s().z(bool);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void destroy() {
        try {
            n1();
            this.f81501P.a();
            com.google.android.gms.ads.internal.overlay.h hVar = this.f81524o;
            if (hVar != null) {
                hVar.zzb();
                this.f81524o.zzm();
                this.f81524o = null;
            }
            this.f81525p = null;
            this.f81526q = null;
            this.f81523n.G0();
            this.f81491F = null;
            this.f81515f = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f81530u) {
                return;
            }
            Nc.v.C().h(this);
            m1();
            this.f81530u = true;
            if (!((Boolean) Oc.A.c().a(C8784lf.f76821Ga)).booleanValue()) {
                Rc.p0.k("Destroying the WebView immediately...");
                o();
                return;
            }
            Activity activityA = this.f81509a.a();
            if (activityA != null && activityA.isDestroyed()) {
                Rc.p0.k("Destroying the WebView immediately...");
                o();
            } else {
                Rc.p0.k("Initiating WebView self destruct sequence in 3...");
                Rc.p0.k("Loading blank page in WebView, 2...");
                k1("about:blank");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC8065et
    public final Z50 e() {
        return this.f81519j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void e0(C7701bT c7701bT) {
        this.f81526q = c7701bT;
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (M()) {
            Sc.p.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76835Ha)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            C7033Kq.f69019f.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.It
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68566a.Z0(str, valueCallback);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7273Rt
    public final C7773c60 f() {
        return this.f81520k;
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.f81530u) {
                        this.f81523n.G0();
                        Nc.v.C().h(this);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final WebViewClient g() {
        return this.f81523n;
    }

    @Override // Nc.n
    public final synchronized void g0() {
        Nc.n nVar = this.f81515f;
        if (nVar != null) {
            nVar.g0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7748bu
    public final M9 h() {
        return this.f81511b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized InterfaceC8671kc k() {
        return this.f81491F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void k0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized com.google.android.gms.ads.internal.overlay.h l() {
        return this.f81524o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean l0() {
        return false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void loadData(String str, String str2, String str3) {
        if (M()) {
            Sc.p.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            com.fullstory.FS.trackWebView(this);
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (M()) {
                    Sc.p.g("#004 The webview is destroyed. Ignoring action.");
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void loadUrl(final String str) {
        if (M()) {
            Sc.p.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Lt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69288a.a1(str);
                }
            });
        } catch (Throwable th2) {
            Nc.v.s().x(th2, "AdWebViewImpl.loadUrl");
            Sc.p.h("Could not call loadUrl. ", th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized com.google.android.gms.ads.internal.overlay.h m() {
        return this.f81499N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void m0(boolean z10) {
        com.google.android.gms.ads.internal.overlay.h hVar;
        int i10 = this.f81492G + (true != z10 ? -1 : 1);
        this.f81492G = i10;
        if (i10 > 0 || (hVar = this.f81524o) == null) {
            return;
        }
        hVar.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized InterfaceC7055Lg n() {
        return this.f81489D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void n0(C8493iu c8493iu) {
        this.f81527r = c8493iu;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void o() {
        Rc.p0.k("Destroying WebView!");
        g1();
        Rc.D0.f32295l.post(new RunnableC7137Nt(this));
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!M()) {
                this.f81501P.c();
            }
            if (this.f81510a0) {
                onResume();
                this.f81510a0 = false;
            }
            boolean z10 = this.f81487B;
            C10309zt c10309zt = this.f81523n;
            if (c10309zt != null && c10309zt.L()) {
                if (!this.f81488C) {
                    this.f81523n.p0();
                    this.f81523n.x0();
                    this.f81488C = true;
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
        C10309zt c10309zt;
        synchronized (this) {
            try {
                if (!M()) {
                    this.f81501P.d();
                }
                super.onDetachedFromWindow();
                if (this.f81488C && (c10309zt = this.f81523n) != null && c10309zt.L() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f81523n.p0();
                    this.f81523n.x0();
                    this.f81488C = false;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized void p(int i10) {
        this.f81498M = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void p0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized void r(BinderC7239Qt binderC7239Qt) {
        if (this.f81486A != null) {
            Sc.p.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f81486A = binderC7239Qt;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void r0(C7914dT c7914dT) {
        this.f81525p = c7914dT;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized boolean s0() {
        return this.f81534y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized C7701bT t() {
        return this.f81526q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized void u0(boolean z10) {
        this.f81534y = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final synchronized boolean x() {
        return this.f81492G > 0;
    }

    @Override // Nc.n
    public final synchronized void z0() {
        Nc.n nVar = this.f81515f;
        if (nVar != null) {
            nVar.z0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7960du
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final /* synthetic */ InterfaceC8281gu zzN() {
        return this.f81523n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized int zzf() {
        return this.f81498M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C10067xf zzk() {
        return this.f81495J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C10174yf zzm() {
        return this.f81497L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C9984wr zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized BinderC7239Qt zzq() {
        return this.f81486A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized String zzr() {
        C7773c60 c7773c60 = this.f81520k;
        if (c7773c60 == null) {
            return null;
        }
        return c7773c60.f73943b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized String zzs() {
        return this.f81535z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final synchronized void zzw() {
        InterfaceC6987Jg interfaceC6987Jg = this.f81490E;
        if (interfaceC6987Jg != null) {
            final IK ik2 = (IK) interfaceC6987Jg;
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.GK
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ik2.zzd();
                    } catch (RemoteException e10) {
                        Sc.p.i("#007 Could not call remote method.", e10);
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
        C9532sf.a(this.f81497L.a(), this.f81495J, "aeh2");
    }

    private final void n1() {
        C10174yf c10174yf = this.f81497L;
        if (c10174yf == null) {
            return;
        }
        C6679Af c6679AfA = c10174yf.a();
        C9319qf c9319qfH = Nc.v.s().h();
        if (c9319qfH != null) {
            c9319qfH.f(c6679AfA);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final Context A() {
        return this.f81509a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void A0(int i10) {
        if (i10 == 0) {
            C10174yf c10174yf = this.f81497L;
            C9532sf.a(c10174yf.a(), this.f81495J, "aebb2");
        }
        l1();
        this.f81497L.a();
        this.f81497L.a().d("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put("version", this.f81514e.f34479a);
        L("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void H() {
        this.f81501P.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void I() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(Nc.v.v().e()));
        map.put("app_volume", String.valueOf(Nc.v.v().a()));
        map.put("device_volume", String.valueOf(C5181c.b(getContext())));
        L("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void J0(String str, String str2, int i10) throws NumberFormatException {
        this.f81523n.U0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void O(boolean z10) {
        this.f81523n.H0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void R() {
        if (this.f81494I == null) {
            C10174yf c10174yf = this.f81497L;
            C9532sf.a(c10174yf.a(), this.f81495J, "aes2");
            this.f81497L.a();
            C10067xf c10067xfF = C6679Af.f();
            this.f81494I = c10067xfF;
            this.f81497L.b("native:view_show", c10067xfF);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.f81514e.f34479a);
        L("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void X(String str, InterfaceC7194Pi interfaceC7194Pi) {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.q(str, interfaceC7194Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void a(String str, String str2) {
        Y0(str + "(" + str2 + ");");
    }

    final /* synthetic */ void b1(String str) {
        com.fullstory.FS.trackWebView(this);
        super.loadUrl("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void d0(boolean z10) {
        this.f81523n.j(false);
    }

    public final boolean e1() throws JSONException {
        int i10;
        int iX;
        if (this.f81523n.u() || this.f81523n.L()) {
            C4447y.b();
            DisplayMetrics displayMetrics = this.f81517h;
            int iX2 = Sc.g.x(displayMetrics, displayMetrics.widthPixels);
            C4447y.b();
            DisplayMetrics displayMetrics2 = this.f81517h;
            int iX3 = Sc.g.x(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityA = this.f81509a.a();
            if (activityA == null || activityA.getWindow() == null) {
                i10 = iX2;
                iX = iX3;
            } else {
                Nc.v.t();
                int[] iArrQ = Rc.D0.q(activityA);
                C4447y.b();
                int iX4 = Sc.g.x(this.f81517h, iArrQ[0]);
                C4447y.b();
                iX = Sc.g.x(this.f81517h, iArrQ[1]);
                i10 = iX4;
            }
            int i11 = this.f81503R;
            if (i11 != iX2 || this.f81502Q != iX3 || this.f81504S != i10 || this.f81505T != iX) {
                boolean z10 = (i11 == iX2 && this.f81502Q == iX3) ? false : true;
                this.f81503R = iX2;
                this.f81502Q = iX3;
                this.f81504S = i10;
                this.f81505T = iX;
                new C7947dn(this, "").e(iX2, iX3, i10, iX, this.f81517h.density, this.f81507V.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void h0(String str, InterfaceC7194Pi interfaceC7194Pi) {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.i(str, interfaceC7194Pi);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
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
        Sc.p.b("Dispatching AFMA event: ".concat(sb2.toString()));
        Y0(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void o0(String str, com.google.android.gms.common.util.o oVar) {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.s(str, oVar);
        }
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) Oc.A.c().a(C8784lf.f77031Va)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            Nc.v.t();
            Rc.D0.t(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            Sc.p.b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            Nc.v.s().x(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
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
        boolean z10 = ((Boolean) Oc.A.c().a(C8784lf.f76772D3)).booleanValue() && this.f81523n.C();
        if ((!this.f81523n.L() || this.f81523n.J()) && !z10) {
            M9 m92 = this.f81511b;
            if (m92 != null) {
                m92.d(motionEvent);
            }
            C7290Sf c7290Sf = this.f81513d;
            if (c7290Sf != null) {
                c7290Sf.b(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    InterfaceC7055Lg interfaceC7055Lg = this.f81489D;
                    if (interfaceC7055Lg != null) {
                        interfaceC7055Lg.a(motionEvent);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void q(boolean z10, int i10, boolean z11) throws NumberFormatException {
        this.f81523n.V0(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void q0(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put("success", true != z10 ? "0" : "1");
        map.put("duration", Long.toString(j10));
        L("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void t0(boolean z10, int i10, String str, boolean z11, boolean z12) throws NumberFormatException {
        this.f81523n.a(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final com.google.common.util.concurrent.q u() {
        C7290Sf c7290Sf = this.f81513d;
        return c7290Sf == null ? Mj0.h(null) : c7290Sf.a();
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void v0(Context context) {
        this.f81509a.setBaseContext(context);
        this.f81501P.e(this.f81509a.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void w() {
        Rc.p0.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void w0(Qc.l lVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        this.f81523n.T0(lVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final List y() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void y0(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        this.f81523n.X0(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void z() {
        if (this.f81496K == null) {
            this.f81497L.a();
            C10067xf c10067xfF = C6679Af.f();
            this.f81496K = c10067xfF;
            this.f81497L.b("native:view_load", c10067xfF);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7407Vt, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Activity zzi() {
        return this.f81509a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Nc.a zzj() {
        return this.f81516g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7854cu, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Sc.a zzn() {
        return this.f81514e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
        C10309zt c10309zt = this.f81523n;
        if (c10309zt != null) {
            c10309zt.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void F0() {
        com.google.android.gms.ads.internal.overlay.h hVarL = l();
        if (hVarL != null) {
            hVarL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void G() {
        l1();
        HashMap map = new HashMap(1);
        map.put("version", this.f81514e.f34479a);
        L("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final void L(String str, Map map) {
        try {
            j(str, C4447y.b().l(map));
        } catch (JSONException unused) {
            Sc.p.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean i0(final boolean z10, final int i10) {
        destroy();
        this.f81508W.b(new InterfaceC7484Yc() { // from class: com.google.android.gms.internal.ads.Kt
            @Override // com.google.android.gms.internal.ads.InterfaceC7484Yc
            public final void a(C6949Ie c6949Ie) {
                int i11 = zzcfw.f81485b0;
                C9103oe c9103oeD0 = C9210pe.d0();
                boolean zW = c9103oeD0.w();
                boolean z11 = z10;
                if (zW != z11) {
                    c9103oeD0.u(z11);
                }
                c9103oeD0.v(i10);
                c6949Ie.z(c9103oeD0.p());
            }
        });
        this.f81508W.c(10003);
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void onPause() {
        if (!M()) {
            try {
                super.onPause();
                if (((Boolean) Oc.A.c().a(C8784lf.f77396vc)).booleanValue() && M4.f.a("MUTE_AUDIO")) {
                    Sc.p.b("Muting webview");
                    M4.e.k(this, true);
                }
            } catch (Exception e10) {
                Sc.p.e("Could not pause webview.", e10);
                if (((Boolean) Oc.A.c().a(C8784lf.f77438yc)).booleanValue()) {
                    Nc.v.s().x(e10, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void onResume() {
        if (!M()) {
            try {
                super.onResume();
                if (((Boolean) Oc.A.c().a(C8784lf.f77396vc)).booleanValue() && M4.f.a("MUTE_AUDIO")) {
                    Sc.p.b("Unmuting webview");
                    M4.e.k(this, false);
                }
            } catch (Exception e10) {
                Sc.p.e("Could not resume webview.", e10);
                if (((Boolean) Oc.A.c().a(C8784lf.f77438yc)).booleanValue()) {
                    Nc.v.s().x(e10, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C10309zt) {
            this.f81523n = (C10309zt) webViewClient;
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
            Sc.p.e("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void zza(String str) {
        Y0(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final int zzh() {
        return getMeasuredWidth();
    }
}
