package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import io.constructor.BuildConfig;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.zt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10184zt extends WebViewClient implements InterfaceC8156gu {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f80507H = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f80508A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f80509B;

    /* renamed from: C, reason: collision with root package name */
    private int f80510C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f80511D;

    /* renamed from: F, reason: collision with root package name */
    private final GS f80513F;

    /* renamed from: G, reason: collision with root package name */
    private View.OnAttachStateChangeListener f80514G;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f80515a;

    /* renamed from: b, reason: collision with root package name */
    private final C7392Zc f80516b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4098a f80519e;

    /* renamed from: f, reason: collision with root package name */
    private Oc.p f80520f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC7942eu f80521g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC8049fu f80522h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC7918ei f80523i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC8132gi f80524j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC8201hG f80525k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f80526l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f80527m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f80531q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f80532r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f80533s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f80534t;

    /* renamed from: u, reason: collision with root package name */
    private Oc.d f80535u;

    /* renamed from: v, reason: collision with root package name */
    private C7715cn f80536v;

    /* renamed from: w, reason: collision with root package name */
    private Lc.b f80537w;

    /* renamed from: y, reason: collision with root package name */
    protected InterfaceC6805Hp f80539y;

    /* renamed from: z, reason: collision with root package name */
    private C9812wN f80540z;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f80517c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f80518d = new Object();

    /* renamed from: n, reason: collision with root package name */
    private int f80528n = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f80529o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f80530p = "";

    /* renamed from: x, reason: collision with root package name */
    private C7341Xm f80538x = null;

    /* renamed from: E, reason: collision with root package name */
    private final HashSet f80512E = new HashSet(Arrays.asList(((String) Mc.A.c().a(C8659lf.f75920C5)).split(",")));

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void C0(InterfaceC8049fu interfaceC8049fu) {
        this.f80522h = interfaceC8049fu;
    }

    public final void I0(boolean z10) {
        this.f80511D = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void P(InterfaceC7942eu interfaceC7942eu) {
        this.f80521g = interfaceC7942eu;
    }

    public final void j(boolean z10) {
        this.f80526l = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f80527m = true;
        this.f80528n = i10;
        this.f80529o = str;
        this.f80530p = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void r0(InterfaceC4098a interfaceC4098a, InterfaceC7918ei interfaceC7918ei, Oc.p pVar, InterfaceC8132gi interfaceC8132gi, Oc.d dVar, boolean z10, C7171Si c7171Si, Lc.b bVar, InterfaceC7928en interfaceC7928en, InterfaceC6805Hp interfaceC6805Hp, final C9710vS c9710vS, final R90 r90, C9812wN c9812wN, C8560kj c8560kj, InterfaceC8201hG interfaceC8201hG, C8453jj c8453jj, C7814dj c7814dj, C7103Qi c7103Qi, C8269hx c8269hx) {
        Lc.b bVar2 = bVar == null ? new Lc.b(this.f80515a.getContext(), interfaceC6805Hp, null) : bVar;
        this.f80538x = new C7341Xm(this.f80515a, interfaceC7928en);
        this.f80539y = interfaceC6805Hp;
        if (((Boolean) Mc.A.c().a(C8659lf.f76265b1)).booleanValue()) {
            i("/adMetadata", new C7812di(interfaceC7918ei));
        }
        if (interfaceC8132gi != null) {
            i("/appEvent", new C8025fi(interfaceC8132gi));
        }
        i("/backButton", C7035Oi.f69141j);
        i("/refresh", C7035Oi.f69142k);
        i("/canOpenApp", C7035Oi.f69133b);
        i("/canOpenURLs", C7035Oi.f69132a);
        i("/canOpenIntents", C7035Oi.f69134c);
        i("/close", C7035Oi.f69135d);
        i("/customClose", C7035Oi.f69136e);
        i("/instrument", C7035Oi.f69145n);
        i("/delayPageLoaded", C7035Oi.f69147p);
        i("/delayPageClosed", C7035Oi.f69148q);
        i("/getLocationInfo", C7035Oi.f69149r);
        i("/log", C7035Oi.f69138g);
        i("/mraid", new C7304Wi(bVar2, this.f80538x, interfaceC7928en));
        C7715cn c7715cn = this.f80536v;
        if (c7715cn != null) {
            i("/mraidLoaded", c7715cn);
        }
        Lc.b bVar3 = bVar2;
        i("/open", new C7707cj(bVar3, this.f80538x, c9710vS, c9812wN, c8269hx));
        i("/precache", new C9754vs());
        i("/touch", C7035Oi.f69140i);
        i("/video", C7035Oi.f69143l);
        i("/videoMeta", C7035Oi.f69144m);
        if (c9710vS == null || r90 == null) {
            i("/click", new C8772mi(interfaceC8201hG, c8269hx));
            i("/httpTrack", C7035Oi.f69137f);
        } else {
            i("/click", new B60(interfaceC8201hG, c8269hx, r90, c9710vS));
            i("/httpTrack", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.C60
                @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
                public final void a(Object obj, Map map) {
                    InterfaceC7940et interfaceC7940et = (InterfaceC7940et) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        Qc.p.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    Z50 z50E = interfaceC7940et.e();
                    if (z50E != null && !z50E.f72038i0) {
                        r90.d(str, z50E.f72068x0, null);
                        return;
                    }
                    C7648c60 c7648c60H = ((InterfaceC7148Rt) interfaceC7940et).h();
                    if (c7648c60H != null) {
                        c9710vS.d(new C9924xS(Lc.v.c().a(), c7648c60H.f73103b, str, 2));
                    } else {
                        Lc.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (Lc.v.r().p(this.f80515a.getContext())) {
            Map map = new HashMap();
            if (this.f80515a.e() != null) {
                map = this.f80515a.e().f72066w0;
            }
            i("/logScionEvent", new C7271Vi(this.f80515a.getContext(), map));
        }
        if (c7171Si != null) {
            i("/setInterstitialProperties", new C7137Ri(c7171Si));
        }
        if (c8560kj != null) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue()) {
                i("/inspectorNetworkExtras", c8560kj);
            }
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76357h9)).booleanValue() && c8453jj != null) {
            i("/shareSheet", c8453jj);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue() && c7814dj != null) {
            i("/inspectorOutOfContextTest", c7814dj);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76483q9)).booleanValue() && c7103Qi != null) {
            i("/inspectorStorage", c7103Qi);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76513sb)).booleanValue()) {
            i("/bindPlayStoreOverlay", C7035Oi.f69152u);
            i("/presentPlayStoreOverlay", C7035Oi.f69153v);
            i("/expandPlayStoreOverlay", C7035Oi.f69154w);
            i("/collapsePlayStoreOverlay", C7035Oi.f69155x);
            i("/closePlayStoreOverlay", C7035Oi.f69156y);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76491r3)).booleanValue()) {
            i("/setPAIDPersonalizationEnabled", C7035Oi.f69129A);
            i("/resetPAID", C7035Oi.f69157z);
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76066Mb)).booleanValue()) {
            InterfaceC9008ot interfaceC9008ot = this.f80515a;
            if (interfaceC9008ot.e() != null && interfaceC9008ot.e().f72056r0) {
                i("/writeToLocalStorage", C7035Oi.f69130B);
                i("/clearLocalStorageKeys", C7035Oi.f69131C);
            }
        }
        this.f80519e = interfaceC4098a;
        this.f80520f = pVar;
        this.f80523i = interfaceC7918ei;
        this.f80524j = interfaceC8132gi;
        this.f80535u = dVar;
        this.f80537w = bVar3;
        this.f80525k = interfaceC8201hG;
        this.f80540z = c9812wN;
        this.f80526l = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final C9812wN zze() {
        return this.f80540z;
    }

    private static WebResourceResponse N() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76167U0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        Lc.v.t();
        Lc.v.t();
        r0 = r11.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        r13 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        Lc.v.t();
        r0 = r11.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0128, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012f, code lost:
    
        if (r0.length != 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0132, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        if (r3 >= r0.length) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        if (r0[r3].trim().startsWith("charset") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r5 = r0[r3].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0151, code lost:
    
        if (r5.length <= 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0153, code lost:
    
        r6 = r5[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015d, code lost:
    
        r0 = r11.getHeaderFields();
        r3 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0176, code lost:
    
        if (r0.hasNext() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
    
        r4 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0182, code lost:
    
        if (r4.getKey() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r4.getValue() == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0194, code lost:
    
        if (r4.getValue().isEmpty() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
    
        r3.put(r4.getKey(), r4.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ac, code lost:
    
        r6 = Lc.v.u().b(r13, r14, r11.getResponseCode(), r11.getResponseMessage(), r3, r11.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse b0(java.lang.String r20, java.util.Map r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10184zt.b0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    private final void k0() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f80514G;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f80515a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static final boolean x0(boolean z10, InterfaceC9008ot interfaceC9008ot) {
        return (!z10 || interfaceC9008ot.c().i() || interfaceC9008ot.b().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void B(int i10, int i11) {
        C7341Xm c7341Xm = this.f80538x;
        if (c7341Xm != null) {
            c7341Xm.l(i10, i11);
        }
    }

    public final boolean C() {
        boolean z10;
        synchronized (this.f80518d) {
            z10 = this.f80533s;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void F0(boolean z10) {
        synchronized (this.f80518d) {
            this.f80532r = true;
        }
    }

    public final void G0() {
        if (this.f80521g != null && ((this.f80508A && this.f80510C <= 0) || this.f80509B || this.f80527m)) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue() && this.f80515a.zzm() != null) {
                C9407sf.a(this.f80515a.zzm().a(), this.f80515a.zzk(), "awfllc");
            }
            InterfaceC7942eu interfaceC7942eu = this.f80521g;
            boolean z10 = false;
            if (!this.f80509B && !this.f80527m) {
                z10 = true;
            }
            interfaceC7942eu.a(z10, this.f80528n, this.f80529o, this.f80530p);
            this.f80521g = null;
        }
        this.f80515a.z();
    }

    public final void H0() {
        InterfaceC6805Hp interfaceC6805Hp = this.f80539y;
        if (interfaceC6805Hp != null) {
            interfaceC6805Hp.zze();
            this.f80539y = null;
        }
        k0();
        synchronized (this.f80518d) {
            try {
                this.f80517c.clear();
                this.f80519e = null;
                this.f80520f = null;
                this.f80521g = null;
                this.f80522h = null;
                this.f80523i = null;
                this.f80524j = null;
                this.f80526l = false;
                this.f80531q = false;
                this.f80532r = false;
                this.f80533s = false;
                this.f80535u = null;
                this.f80537w = null;
                this.f80536v = null;
                C7341Xm c7341Xm = this.f80538x;
                if (c7341Xm != null) {
                    c7341Xm.h(true);
                    this.f80538x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean J() {
        boolean z10;
        synchronized (this.f80518d) {
            z10 = this.f80534t;
        }
        return z10;
    }

    final /* synthetic */ void K0() throws JSONException {
        this.f80515a.H();
        com.google.android.gms.ads.internal.overlay.h hVarL = this.f80515a.l();
        if (hVarL != null) {
            hVarL.j();
        }
    }

    public final boolean L() {
        boolean z10;
        synchronized (this.f80518d) {
            z10 = this.f80532r;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void M0(C8269hx c8269hx) {
        p("/click");
        i("/click", new C8772mi(this.f80525k, c8269hx));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void N0(C8269hx c8269hx, C9710vS c9710vS, C9812wN c9812wN) {
        p("/open");
        i("/open", new C7707cj(this.f80537w, this.f80538x, c9710vS, c9812wN, c8269hx));
    }

    final /* synthetic */ void R0(boolean z10, long j10) {
        this.f80515a.q0(z10, j10);
    }

    final /* synthetic */ void S0(View view, InterfaceC6805Hp interfaceC6805Hp, int i10) {
        q0(view, interfaceC6805Hp, i10 - 1);
    }

    public final void T0(Oc.l lVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = this.f80515a;
        boolean zU = interfaceC9008ot.U();
        boolean z12 = x0(zU, interfaceC9008ot) || z11;
        boolean z13 = z12 || !z10;
        InterfaceC4098a interfaceC4098a = z12 ? null : this.f80519e;
        Oc.p pVar = zU ? null : this.f80520f;
        Oc.d dVar = this.f80535u;
        InterfaceC9008ot interfaceC9008ot2 = this.f80515a;
        W0(new AdOverlayInfoParcel(lVar, interfaceC4098a, pVar, dVar, interfaceC9008ot2.zzn(), interfaceC9008ot2, z13 ? null : this.f80525k, str));
    }

    public final void U0(String str, String str2, int i10) throws NumberFormatException {
        GS gs2 = this.f80513F;
        InterfaceC9008ot interfaceC9008ot = this.f80515a;
        W0(new AdOverlayInfoParcel(interfaceC9008ot, interfaceC9008ot.zzn(), str, str2, 14, gs2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void V(C8269hx c8269hx, C9710vS c9710vS, R90 r90) {
        p("/click");
        if (c9710vS == null || r90 == null) {
            i("/click", new C8772mi(this.f80525k, c8269hx));
        } else {
            i("/click", new B60(this.f80525k, c8269hx, r90, c9710vS));
        }
    }

    public final void V0(boolean z10, int i10, boolean z11) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = this.f80515a;
        boolean zX0 = x0(interfaceC9008ot.U(), interfaceC9008ot);
        boolean z12 = true;
        if (!zX0 && z11) {
            z12 = false;
        }
        InterfaceC4098a interfaceC4098a = zX0 ? null : this.f80519e;
        Oc.p pVar = this.f80520f;
        Oc.d dVar = this.f80535u;
        InterfaceC9008ot interfaceC9008ot2 = this.f80515a;
        W0(new AdOverlayInfoParcel(interfaceC4098a, pVar, dVar, interfaceC9008ot2, z10, i10, interfaceC9008ot2.zzn(), z12 ? null : this.f80525k, s0(this.f80515a) ? this.f80513F : null));
    }

    public final void W0(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        Oc.l lVar;
        C7341Xm c7341Xm = this.f80538x;
        boolean zM = c7341Xm != null ? c7341Xm.m() : false;
        Lc.v.m();
        Oc.o.a(this.f80515a.getContext(), adOverlayInfoParcel, !zM, this.f80540z);
        InterfaceC6805Hp interfaceC6805Hp = this.f80539y;
        if (interfaceC6805Hp != null) {
            String str = adOverlayInfoParcel.f64578l;
            if (str == null && (lVar = adOverlayInfoParcel.f64567a) != null) {
                str = lVar.f23531b;
            }
            interfaceC6805Hp.N(str);
        }
    }

    public final void X0(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = this.f80515a;
        boolean zU = interfaceC9008ot.U();
        boolean zX0 = x0(zU, interfaceC9008ot);
        boolean z12 = true;
        if (!zX0 && z11) {
            z12 = false;
        }
        InterfaceC4098a interfaceC4098a = zX0 ? null : this.f80519e;
        C9863wt c9863wt = zU ? null : new C9863wt(this.f80515a, this.f80520f);
        InterfaceC7918ei interfaceC7918ei = this.f80523i;
        InterfaceC8132gi interfaceC8132gi = this.f80524j;
        Oc.d dVar = this.f80535u;
        InterfaceC9008ot interfaceC9008ot2 = this.f80515a;
        W0(new AdOverlayInfoParcel(interfaceC4098a, c9863wt, interfaceC7918ei, interfaceC8132gi, dVar, interfaceC9008ot2, z10, i10, str, str2, interfaceC9008ot2.zzn(), z12 ? null : this.f80525k, s0(this.f80515a) ? this.f80513F : null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        InterfaceC8201hG interfaceC8201hG = this.f80525k;
        if (interfaceC8201hG != null) {
            interfaceC8201hG.Z();
        }
    }

    public final void a(boolean z10, int i10, String str, boolean z11, boolean z12) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = this.f80515a;
        boolean zU = interfaceC9008ot.U();
        boolean zX0 = x0(zU, interfaceC9008ot);
        boolean z13 = true;
        if (!zX0 && z11) {
            z13 = false;
        }
        InterfaceC4098a interfaceC4098a = zX0 ? null : this.f80519e;
        C9863wt c9863wt = zU ? null : new C9863wt(this.f80515a, this.f80520f);
        InterfaceC7918ei interfaceC7918ei = this.f80523i;
        InterfaceC8132gi interfaceC8132gi = this.f80524j;
        Oc.d dVar = this.f80535u;
        InterfaceC9008ot interfaceC9008ot2 = this.f80515a;
        W0(new AdOverlayInfoParcel(interfaceC4098a, c9863wt, interfaceC7918ei, interfaceC8132gi, dVar, interfaceC9008ot2, z10, i10, str, interfaceC9008ot2.zzn(), z13 ? null : this.f80525k, s0(this.f80515a) ? this.f80513F : null, z12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void a0(boolean z10) {
        synchronized (this.f80518d) {
            this.f80533s = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void c0(int i10, int i11, boolean z10) {
        C7715cn c7715cn = this.f80536v;
        if (c7715cn != null) {
            c7715cn.h(i10, i11);
        }
        C7341Xm c7341Xm = this.f80538x;
        if (c7341Xm != null) {
            c7341Xm.k(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void d0(boolean z10) {
        synchronized (this.f80518d) {
            this.f80534t = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void f() {
        synchronized (this.f80518d) {
            this.f80526l = false;
            this.f80531q = true;
            C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qt
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f77863a.K0();
                }
            });
        }
    }

    public final void i(String str, InterfaceC7069Pi interfaceC7069Pi) {
        synchronized (this.f80518d) {
            try {
                List copyOnWriteArrayList = (List) this.f80517c.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f80517c.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC7069Pi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void j0(Z50 z50) {
        if (Lc.v.r().p(this.f80515a.getContext())) {
            p("/logScionEvent");
            new HashMap();
            i("/logScionEvent", new C7271Vi(this.f80515a.getContext(), z50.f72066w0));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Pc.p0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            O0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f80518d) {
            try {
                if (this.f80515a.M()) {
                    Pc.p0.k("Blank page loaded, 1...");
                    this.f80515a.o();
                    return;
                }
                this.f80508A = true;
                InterfaceC8049fu interfaceC8049fu = this.f80522h;
                if (interfaceC8049fu != null) {
                    interfaceC8049fu.zza();
                    this.f80522h = null;
                }
                G0();
                if (this.f80515a.l() != null) {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76080Nb)).booleanValue()) {
                        this.f80515a.l().F9(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f80515a.i0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void p(String str) {
        synchronized (this.f80518d) {
            try {
                List list = (List) this.f80517c.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener p0() {
        synchronized (this.f80518d) {
        }
        return null;
    }

    public final void q(String str, InterfaceC7069Pi interfaceC7069Pi) {
        synchronized (this.f80518d) {
            try {
                List list = (List) this.f80517c.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC7069Pi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(String str, com.google.android.gms.common.util.o oVar) {
        synchronized (this.f80518d) {
            try {
                List<InterfaceC7069Pi> list = (List) this.f80517c.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC7069Pi interfaceC7069Pi : list) {
                    if (oVar.apply(interfaceC7069Pi)) {
                        arrayList.add(interfaceC7069Pi);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return z0(str, Collections.EMPTY_MAP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        Pc.p0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            O0(uriA);
        } else {
            if (this.f80526l && webView == this.f80515a.zzG()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || BuildConfig.SERVICE_SCHEME.equalsIgnoreCase(scheme)) {
                    InterfaceC4098a interfaceC4098a = this.f80519e;
                    if (interfaceC4098a != null) {
                        interfaceC4098a.v();
                        InterfaceC6805Hp interfaceC6805Hp = this.f80539y;
                        if (interfaceC6805Hp != null) {
                            interfaceC6805Hp.N(str);
                        }
                        this.f80519e = null;
                    }
                    InterfaceC8201hG interfaceC8201hG = this.f80525k;
                    if (interfaceC8201hG != null) {
                        interfaceC8201hG.Z();
                        this.f80525k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f80515a.zzG().willNotDraw()) {
                Qc.p.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    M9 m9G = this.f80515a.g();
                    C9998y60 c9998y60E = this.f80515a.E();
                    if (!((Boolean) Mc.A.c().a(C8659lf.f76150Sb)).booleanValue() || c9998y60E == null) {
                        if (m9G != null && m9G.f(uriA)) {
                            Context context = this.f80515a.getContext();
                            InterfaceC9008ot interfaceC9008ot = this.f80515a;
                            uriA = m9G.a(uriA, context, (View) interfaceC9008ot, interfaceC9008ot.zzi());
                        }
                    } else if (m9G != null && m9G.f(uriA)) {
                        Context context2 = this.f80515a.getContext();
                        InterfaceC9008ot interfaceC9008ot2 = this.f80515a;
                        uriA = c9998y60E.a(uriA, context2, (View) interfaceC9008ot2, interfaceC9008ot2.zzi());
                    }
                } catch (zzavb unused) {
                    Qc.p.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                Lc.b bVar = this.f80537w;
                if (bVar == null || bVar.c()) {
                    Oc.l lVar = new Oc.l("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null);
                    InterfaceC9008ot interfaceC9008ot3 = this.f80515a;
                    T0(lVar, true, false, interfaceC9008ot3 != null ? interfaceC9008ot3.zzr() : "");
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final boolean u() {
        boolean z10;
        synchronized (this.f80518d) {
            z10 = this.f80531q;
        }
        return z10;
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        InterfaceC4098a interfaceC4098a = this.f80519e;
        if (interfaceC4098a != null) {
            interfaceC4098a.v();
        }
    }

    public final ViewTreeObserver.OnScrollChangedListener y0() {
        synchronized (this.f80518d) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c6 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00bb, B:30:0x00d3, B:33:0x00ef, B:78:0x01c8, B:50:0x017d, B:97:0x02b0, B:100:0x02c0, B:102:0x02c6, B:104:0x02d4, B:86:0x0237, B:87:0x0260, B:85:0x020f, B:49:0x0156, B:32:0x00e2, B:88:0x0261, B:90:0x026c, B:92:0x0272, B:94:0x02a5), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204 A[Catch: all -> 0x01bb, TryCatch #11 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01f2, B:83:0x0204, B:84:0x020b), top: B:111:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00bb, B:30:0x00d3, B:33:0x00ef, B:78:0x01c8, B:50:0x017d, B:97:0x02b0, B:100:0x02c0, B:102:0x02c6, B:104:0x02d4, B:86:0x0237, B:87:0x0260, B:85:0x020f, B:49:0x0156, B:32:0x00e2, B:88:0x0261, B:90:0x026c, B:92:0x0272, B:94:0x02a5), top: B:112:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.webkit.WebResourceResponse z0(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10184zt.z0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final Lc.b zzd() {
        return this.f80537w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void zzl() {
        C7392Zc c7392Zc = this.f80516b;
        if (c7392Zc != null) {
            c7392Zc.c(10005);
        }
        this.f80509B = true;
        this.f80528n = 10004;
        this.f80529o = "Page loaded delay cancel.";
        G0();
        this.f80515a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void zzm() {
        synchronized (this.f80518d) {
        }
        this.f80510C++;
        G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void zzn() {
        this.f80510C--;
        G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void zzs() {
        InterfaceC6805Hp interfaceC6805Hp = this.f80539y;
        if (interfaceC6805Hp != null) {
            WebView webViewZzG = this.f80515a.zzG();
            if (ViewCompat.R(webViewZzG)) {
                q0(webViewZzG, interfaceC6805Hp, 10);
                return;
            }
            k0();
            ViewOnAttachStateChangeListenerC9649ut viewOnAttachStateChangeListenerC9649ut = new ViewOnAttachStateChangeListenerC9649ut(this, interfaceC6805Hp);
            this.f80514G = viewOnAttachStateChangeListenerC9649ut;
            ((View) this.f80515a).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC9649ut);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
        InterfaceC8201hG interfaceC8201hG = this.f80525k;
        if (interfaceC8201hG != null) {
            interfaceC8201hG.zzu();
        }
    }

    public C10184zt(InterfaceC9008ot interfaceC9008ot, C7392Zc c7392Zc, boolean z10, C7715cn c7715cn, C7341Xm c7341Xm, GS gs2) {
        this.f80516b = c7392Zc;
        this.f80515a = interfaceC9008ot;
        this.f80531q = z10;
        this.f80536v = c7715cn;
        this.f80513F = gs2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(Map map, List list, String str) {
        if (Pc.p0.m()) {
            Pc.p0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                Pc.p0.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC7069Pi) it.next()).a(this.f80515a, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(final View view, final InterfaceC6805Hp interfaceC6805Hp, final int i10) {
        if (interfaceC6805Hp.zzi() && i10 > 0) {
            interfaceC6805Hp.b(view);
            if (interfaceC6805Hp.zzi()) {
                Pc.D0.f25081l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.pt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77648a.S0(view, interfaceC6805Hp, i10);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean s0(InterfaceC9008ot interfaceC9008ot) {
        if (interfaceC9008ot.e() != null && interfaceC9008ot.e().b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8156gu
    public final void O0(Uri uri) {
        final String strSubstring;
        Pc.p0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.f80517c;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) Mc.A.c().a(C8659lf.f75906B5)).booleanValue() && this.f80512E.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) Mc.A.c().a(C8659lf.f75934D5)).intValue()) {
                    Pc.p0.k("Parsing gmsg query params on BG thread: ".concat(path));
                    Mj0.r(Lc.v.t().G(uri), new C9756vt(this, list, path, uri), C6908Kq.f68179f);
                    return;
                }
            }
            Lc.v.t();
            g0(Pc.D0.p(uri), list, path);
            return;
        }
        Pc.p0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) Mc.A.c().a(C8659lf.f75907B6)).booleanValue() && Lc.v.s().h() != null) {
            if (path != null && path.length() >= 2) {
                strSubstring = path.substring(1);
            } else {
                strSubstring = com.google.maps.android.BuildConfig.TRAVIS;
            }
            C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.st
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i10 = C10184zt.f80507H;
                    Lc.v.s().h().e(strSubstring);
                }
            });
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case com.medallia.digital.mobilesdk.l3.f92485d /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
