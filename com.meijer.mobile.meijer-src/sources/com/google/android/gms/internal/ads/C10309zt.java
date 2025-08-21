package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
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
public class C10309zt extends WebViewClient implements InterfaceC8281gu {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f81347H = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f81348A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f81349B;

    /* renamed from: C, reason: collision with root package name */
    private int f81350C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f81351D;

    /* renamed from: F, reason: collision with root package name */
    private final GS f81353F;

    /* renamed from: G, reason: collision with root package name */
    private View.OnAttachStateChangeListener f81354G;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f81355a;

    /* renamed from: b, reason: collision with root package name */
    private final C7517Zc f81356b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4376a f81359e;

    /* renamed from: f, reason: collision with root package name */
    private Qc.p f81360f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC8067eu f81361g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC8174fu f81362h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC8043ei f81363i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC8257gi f81364j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC8326hG f81365k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f81366l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f81367m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f81371q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f81372r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f81373s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f81374t;

    /* renamed from: u, reason: collision with root package name */
    private Qc.d f81375u;

    /* renamed from: v, reason: collision with root package name */
    private C7840cn f81376v;

    /* renamed from: w, reason: collision with root package name */
    private Nc.b f81377w;

    /* renamed from: y, reason: collision with root package name */
    protected InterfaceC6930Hp f81379y;

    /* renamed from: z, reason: collision with root package name */
    private C9937wN f81380z;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f81357c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Object f81358d = new Object();

    /* renamed from: n, reason: collision with root package name */
    private int f81368n = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f81369o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f81370p = "";

    /* renamed from: x, reason: collision with root package name */
    private C7466Xm f81378x = null;

    /* renamed from: E, reason: collision with root package name */
    private final HashSet f81352E = new HashSet(Arrays.asList(((String) Oc.A.c().a(C8784lf.f76760C5)).split(",")));

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void B0(InterfaceC8174fu interfaceC8174fu) {
        this.f81362h = interfaceC8174fu;
    }

    public final void H0(boolean z10) {
        this.f81351D = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void N0(InterfaceC4376a interfaceC4376a, InterfaceC8043ei interfaceC8043ei, Qc.p pVar, InterfaceC8257gi interfaceC8257gi, Qc.d dVar, boolean z10, C7296Si c7296Si, Nc.b bVar, InterfaceC8053en interfaceC8053en, InterfaceC6930Hp interfaceC6930Hp, final C9835vS c9835vS, final R90 r90, C9937wN c9937wN, C8685kj c8685kj, InterfaceC8326hG interfaceC8326hG, C8578jj c8578jj, C7939dj c7939dj, C7228Qi c7228Qi, C8394hx c8394hx) {
        Nc.b bVar2 = bVar == null ? new Nc.b(this.f81355a.getContext(), interfaceC6930Hp, null) : bVar;
        this.f81378x = new C7466Xm(this.f81355a, interfaceC8053en);
        this.f81379y = interfaceC6930Hp;
        if (((Boolean) Oc.A.c().a(C8784lf.f77105b1)).booleanValue()) {
            i("/adMetadata", new C7937di(interfaceC8043ei));
        }
        if (interfaceC8257gi != null) {
            i("/appEvent", new C8150fi(interfaceC8257gi));
        }
        i("/backButton", C7160Oi.f69981j);
        i("/refresh", C7160Oi.f69982k);
        i("/canOpenApp", C7160Oi.f69973b);
        i("/canOpenURLs", C7160Oi.f69972a);
        i("/canOpenIntents", C7160Oi.f69974c);
        i("/close", C7160Oi.f69975d);
        i("/customClose", C7160Oi.f69976e);
        i("/instrument", C7160Oi.f69985n);
        i("/delayPageLoaded", C7160Oi.f69987p);
        i("/delayPageClosed", C7160Oi.f69988q);
        i("/getLocationInfo", C7160Oi.f69989r);
        i("/log", C7160Oi.f69978g);
        i("/mraid", new C7429Wi(bVar2, this.f81378x, interfaceC8053en));
        C7840cn c7840cn = this.f81376v;
        if (c7840cn != null) {
            i("/mraidLoaded", c7840cn);
        }
        Nc.b bVar3 = bVar2;
        i("/open", new C7832cj(bVar3, this.f81378x, c9835vS, c9937wN, c8394hx));
        i("/precache", new C9879vs());
        i("/touch", C7160Oi.f69980i);
        i("/video", C7160Oi.f69983l);
        i("/videoMeta", C7160Oi.f69984m);
        if (c9835vS == null || r90 == null) {
            i("/click", new C8897mi(interfaceC8326hG, c8394hx));
            i("/httpTrack", C7160Oi.f69977f);
        } else {
            i("/click", new B60(interfaceC8326hG, c8394hx, r90, c9835vS));
            i("/httpTrack", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.C60
                @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
                public final void a(Object obj, Map map) {
                    InterfaceC8065et interfaceC8065et = (InterfaceC8065et) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        Sc.p.g("URL missing from httpTrack GMSG.");
                        return;
                    }
                    Z50 z50E = interfaceC8065et.e();
                    if (z50E != null && !z50E.f72878i0) {
                        r90.d(str, z50E.f72908x0, null);
                        return;
                    }
                    C7773c60 c7773c60F = ((InterfaceC7273Rt) interfaceC8065et).f();
                    if (c7773c60F != null) {
                        c9835vS.d(new C10049xS(Nc.v.c().a(), c7773c60F.f73943b, str, 2));
                    } else {
                        Nc.v.s().x(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (Nc.v.r().p(this.f81355a.getContext())) {
            Map map = new HashMap();
            if (this.f81355a.e() != null) {
                map = this.f81355a.e().f72906w0;
            }
            i("/logScionEvent", new C7396Vi(this.f81355a.getContext(), map));
        }
        if (c7296Si != null) {
            i("/setInterstitialProperties", new C7262Ri(c7296Si));
        }
        if (c8685kj != null) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue()) {
                i("/inspectorNetworkExtras", c8685kj);
            }
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77197h9)).booleanValue() && c8578jj != null) {
            i("/shareSheet", c8578jj);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue() && c7939dj != null) {
            i("/inspectorOutOfContextTest", c7939dj);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77323q9)).booleanValue() && c7228Qi != null) {
            i("/inspectorStorage", c7228Qi);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77353sb)).booleanValue()) {
            i("/bindPlayStoreOverlay", C7160Oi.f69992u);
            i("/presentPlayStoreOverlay", C7160Oi.f69993v);
            i("/expandPlayStoreOverlay", C7160Oi.f69994w);
            i("/collapsePlayStoreOverlay", C7160Oi.f69995x);
            i("/closePlayStoreOverlay", C7160Oi.f69996y);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77331r3)).booleanValue()) {
            i("/setPAIDPersonalizationEnabled", C7160Oi.f69969A);
            i("/resetPAID", C7160Oi.f69997z);
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76906Mb)).booleanValue()) {
            InterfaceC9133ot interfaceC9133ot = this.f81355a;
            if (interfaceC9133ot.e() != null && interfaceC9133ot.e().f72896r0) {
                i("/writeToLocalStorage", C7160Oi.f69970B);
                i("/clearLocalStorageKeys", C7160Oi.f69971C);
            }
        }
        this.f81359e = interfaceC4376a;
        this.f81360f = pVar;
        this.f81363i = interfaceC8043ei;
        this.f81364j = interfaceC8257gi;
        this.f81375u = dVar;
        this.f81377w = bVar3;
        this.f81365k = interfaceC8326hG;
        this.f81380z = c9937wN;
        this.f81366l = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void P(InterfaceC8067eu interfaceC8067eu) {
        this.f81361g = interfaceC8067eu;
    }

    public final void j(boolean z10) {
        this.f81366l = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f81367m = true;
        this.f81368n = i10;
        this.f81369o = str;
        this.f81370p = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final C9937wN zze() {
        return this.f81380z;
    }

    private static WebResourceResponse N() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77007U0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fa, code lost:
    
        Nc.v.t();
        Nc.v.t();
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
    
        Nc.v.t();
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
    
        r6 = Nc.v.u().b(r13, r14, r11.getResponseCode(), r11.getResponseMessage(), r3, r11.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse d0(java.lang.String r20, java.util.Map r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10309zt.d0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    private final void k0() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f81354G;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f81355a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static final boolean w0(boolean z10, InterfaceC9133ot interfaceC9133ot) {
        return (!z10 || interfaceC9133ot.c().i() || interfaceC9133ot.b().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void B(int i10, int i11) {
        C7466Xm c7466Xm = this.f81378x;
        if (c7466Xm != null) {
            c7466Xm.l(i10, i11);
        }
    }

    public final boolean C() {
        boolean z10;
        synchronized (this.f81358d) {
            z10 = this.f81373s;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void E0(boolean z10) {
        synchronized (this.f81358d) {
            this.f81372r = true;
        }
    }

    public final void F0() {
        if (this.f81361g != null && ((this.f81348A && this.f81350C <= 0) || this.f81349B || this.f81367m)) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue() && this.f81355a.zzm() != null) {
                C9532sf.a(this.f81355a.zzm().a(), this.f81355a.zzk(), "awfllc");
            }
            InterfaceC8067eu interfaceC8067eu = this.f81361g;
            boolean z10 = false;
            if (!this.f81349B && !this.f81367m) {
                z10 = true;
            }
            interfaceC8067eu.a(z10, this.f81368n, this.f81369o, this.f81370p);
            this.f81361g = null;
        }
        this.f81355a.z();
    }

    public final void G0() {
        InterfaceC6930Hp interfaceC6930Hp = this.f81379y;
        if (interfaceC6930Hp != null) {
            interfaceC6930Hp.zze();
            this.f81379y = null;
        }
        k0();
        synchronized (this.f81358d) {
            try {
                this.f81357c.clear();
                this.f81359e = null;
                this.f81360f = null;
                this.f81361g = null;
                this.f81362h = null;
                this.f81363i = null;
                this.f81364j = null;
                this.f81366l = false;
                this.f81371q = false;
                this.f81372r = false;
                this.f81373s = false;
                this.f81375u = null;
                this.f81377w = null;
                this.f81376v = null;
                C7466Xm c7466Xm = this.f81378x;
                if (c7466Xm != null) {
                    c7466Xm.h(true);
                    this.f81378x = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean J() {
        boolean z10;
        synchronized (this.f81358d) {
            z10 = this.f81374t;
        }
        return z10;
    }

    final /* synthetic */ void J0() throws JSONException {
        this.f81355a.H();
        com.google.android.gms.ads.internal.overlay.h hVarL = this.f81355a.l();
        if (hVarL != null) {
            hVarL.j();
        }
    }

    public final boolean L() {
        boolean z10;
        synchronized (this.f81358d) {
            z10 = this.f81372r;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void L0(C8394hx c8394hx) {
        p("/click");
        i("/click", new C8897mi(this.f81365k, c8394hx));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void M0(C8394hx c8394hx, C9835vS c9835vS, C9937wN c9937wN) {
        p("/open");
        i("/open", new C7832cj(this.f81377w, this.f81378x, c9835vS, c9937wN, c8394hx));
    }

    final /* synthetic */ void R0(boolean z10, long j10) {
        this.f81355a.q0(z10, j10);
    }

    final /* synthetic */ void S0(View view, InterfaceC6930Hp interfaceC6930Hp, int i10) {
        q0(view, interfaceC6930Hp, i10 - 1);
    }

    public final void T0(Qc.l lVar, boolean z10, boolean z11, String str) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = this.f81355a;
        boolean zU = interfaceC9133ot.U();
        boolean z12 = w0(zU, interfaceC9133ot) || z11;
        boolean z13 = z12 || !z10;
        InterfaceC4376a interfaceC4376a = z12 ? null : this.f81359e;
        Qc.p pVar = zU ? null : this.f81360f;
        Qc.d dVar = this.f81375u;
        InterfaceC9133ot interfaceC9133ot2 = this.f81355a;
        W0(new AdOverlayInfoParcel(lVar, interfaceC4376a, pVar, dVar, interfaceC9133ot2.zzn(), interfaceC9133ot2, z13 ? null : this.f81365k, str));
    }

    public final void U0(String str, String str2, int i10) throws NumberFormatException {
        GS gs2 = this.f81353F;
        InterfaceC9133ot interfaceC9133ot = this.f81355a;
        W0(new AdOverlayInfoParcel(interfaceC9133ot, interfaceC9133ot.zzn(), str, str2, 14, gs2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void V(C8394hx c8394hx, C9835vS c9835vS, R90 r90) {
        p("/click");
        if (c9835vS == null || r90 == null) {
            i("/click", new C8897mi(this.f81365k, c8394hx));
        } else {
            i("/click", new B60(this.f81365k, c8394hx, r90, c9835vS));
        }
    }

    public final void V0(boolean z10, int i10, boolean z11) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = this.f81355a;
        boolean zW0 = w0(interfaceC9133ot.U(), interfaceC9133ot);
        boolean z12 = true;
        if (!zW0 && z11) {
            z12 = false;
        }
        InterfaceC4376a interfaceC4376a = zW0 ? null : this.f81359e;
        Qc.p pVar = this.f81360f;
        Qc.d dVar = this.f81375u;
        InterfaceC9133ot interfaceC9133ot2 = this.f81355a;
        W0(new AdOverlayInfoParcel(interfaceC4376a, pVar, dVar, interfaceC9133ot2, z10, i10, interfaceC9133ot2.zzn(), z12 ? null : this.f81365k, t0(this.f81355a) ? this.f81353F : null));
    }

    public final void W0(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        Qc.l lVar;
        C7466Xm c7466Xm = this.f81378x;
        boolean zM = c7466Xm != null ? c7466Xm.m() : false;
        Nc.v.m();
        Qc.o.a(this.f81355a.getContext(), adOverlayInfoParcel, !zM, this.f81380z);
        InterfaceC6930Hp interfaceC6930Hp = this.f81379y;
        if (interfaceC6930Hp != null) {
            String str = adOverlayInfoParcel.f65418l;
            if (str == null && (lVar = adOverlayInfoParcel.f65407a) != null) {
                str = lVar.f28019b;
            }
            interfaceC6930Hp.N(str);
        }
    }

    public final void X0(boolean z10, int i10, String str, String str2, boolean z11) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = this.f81355a;
        boolean zU = interfaceC9133ot.U();
        boolean zW0 = w0(zU, interfaceC9133ot);
        boolean z12 = true;
        if (!zW0 && z11) {
            z12 = false;
        }
        InterfaceC4376a interfaceC4376a = zW0 ? null : this.f81359e;
        C9988wt c9988wt = zU ? null : new C9988wt(this.f81355a, this.f81360f);
        InterfaceC8043ei interfaceC8043ei = this.f81363i;
        InterfaceC8257gi interfaceC8257gi = this.f81364j;
        Qc.d dVar = this.f81375u;
        InterfaceC9133ot interfaceC9133ot2 = this.f81355a;
        W0(new AdOverlayInfoParcel(interfaceC4376a, c9988wt, interfaceC8043ei, interfaceC8257gi, dVar, interfaceC9133ot2, z10, i10, str, str2, interfaceC9133ot2.zzn(), z12 ? null : this.f81365k, t0(this.f81355a) ? this.f81353F : null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        InterfaceC8326hG interfaceC8326hG = this.f81365k;
        if (interfaceC8326hG != null) {
            interfaceC8326hG.Z();
        }
    }

    public final void a(boolean z10, int i10, String str, boolean z11, boolean z12) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = this.f81355a;
        boolean zU = interfaceC9133ot.U();
        boolean zW0 = w0(zU, interfaceC9133ot);
        boolean z13 = true;
        if (!zW0 && z11) {
            z13 = false;
        }
        InterfaceC4376a interfaceC4376a = zW0 ? null : this.f81359e;
        C9988wt c9988wt = zU ? null : new C9988wt(this.f81355a, this.f81360f);
        InterfaceC8043ei interfaceC8043ei = this.f81363i;
        InterfaceC8257gi interfaceC8257gi = this.f81364j;
        Qc.d dVar = this.f81375u;
        InterfaceC9133ot interfaceC9133ot2 = this.f81355a;
        W0(new AdOverlayInfoParcel(interfaceC4376a, c9988wt, interfaceC8043ei, interfaceC8257gi, dVar, interfaceC9133ot2, z10, i10, str, interfaceC9133ot2.zzn(), z13 ? null : this.f81365k, t0(this.f81355a) ? this.f81353F : null, z12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void a0(boolean z10) {
        synchronized (this.f81358d) {
            this.f81373s = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void b0(int i10, int i11, boolean z10) {
        C7840cn c7840cn = this.f81376v;
        if (c7840cn != null) {
            c7840cn.h(i10, i11);
        }
        C7466Xm c7466Xm = this.f81378x;
        if (c7466Xm != null) {
            c7466Xm.k(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void f0(boolean z10) {
        synchronized (this.f81358d) {
            this.f81374t = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void g() {
        synchronized (this.f81358d) {
            this.f81366l = false;
            this.f81371q = true;
            C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qt
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.f78703a.J0();
                }
            });
        }
    }

    public final void i(String str, InterfaceC7194Pi interfaceC7194Pi) {
        synchronized (this.f81358d) {
            try {
                List copyOnWriteArrayList = (List) this.f81357c.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.f81357c.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(interfaceC7194Pi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void j0(Z50 z50) {
        if (Nc.v.r().p(this.f81355a.getContext())) {
            p("/logScionEvent");
            new HashMap();
            i("/logScionEvent", new C7396Vi(this.f81355a.getContext(), z50.f72906w0));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Rc.p0.k("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            O0(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f81358d) {
            try {
                if (this.f81355a.M()) {
                    Rc.p0.k("Blank page loaded, 1...");
                    this.f81355a.o();
                    return;
                }
                this.f81348A = true;
                InterfaceC8174fu interfaceC8174fu = this.f81362h;
                if (interfaceC8174fu != null) {
                    interfaceC8174fu.zza();
                    this.f81362h = null;
                }
                F0();
                if (this.f81355a.l() != null) {
                    if (((Boolean) Oc.A.c().a(C8784lf.f76920Nb)).booleanValue()) {
                        this.f81355a.l().F9(str);
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
        return this.f81355a.i0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void p(String str) {
        synchronized (this.f81358d) {
            try {
                List list = (List) this.f81357c.get(str);
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
        synchronized (this.f81358d) {
        }
        return null;
    }

    public final void q(String str, InterfaceC7194Pi interfaceC7194Pi) {
        synchronized (this.f81358d) {
            try {
                List list = (List) this.f81357c.get(str);
                if (list == null) {
                    return;
                }
                list.remove(interfaceC7194Pi);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(String str, com.google.android.gms.common.util.o oVar) {
        synchronized (this.f81358d) {
            try {
                List<InterfaceC7194Pi> list = (List) this.f81357c.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC7194Pi interfaceC7194Pi : list) {
                    if (oVar.apply(interfaceC7194Pi)) {
                        arrayList.add(interfaceC7194Pi);
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
        return y0(str, Collections.EMPTY_MAP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        Rc.p0.k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriA = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriA.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriA.getHost())) {
            O0(uriA);
        } else {
            if (this.f81366l && webView == this.f81355a.zzG()) {
                String scheme = uriA.getScheme();
                if ("http".equalsIgnoreCase(scheme) || BuildConfig.SERVICE_SCHEME.equalsIgnoreCase(scheme)) {
                    InterfaceC4376a interfaceC4376a = this.f81359e;
                    if (interfaceC4376a != null) {
                        interfaceC4376a.v();
                        InterfaceC6930Hp interfaceC6930Hp = this.f81379y;
                        if (interfaceC6930Hp != null) {
                            interfaceC6930Hp.N(str);
                        }
                        this.f81359e = null;
                    }
                    InterfaceC8326hG interfaceC8326hG = this.f81365k;
                    if (interfaceC8326hG != null) {
                        interfaceC8326hG.Z();
                        this.f81365k = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f81355a.zzG().willNotDraw()) {
                Sc.p.g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    M9 m9H = this.f81355a.h();
                    C10123y60 c10123y60E = this.f81355a.E();
                    if (!((Boolean) Oc.A.c().a(C8784lf.f76990Sb)).booleanValue() || c10123y60E == null) {
                        if (m9H != null && m9H.f(uriA)) {
                            Context context = this.f81355a.getContext();
                            InterfaceC9133ot interfaceC9133ot = this.f81355a;
                            uriA = m9H.a(uriA, context, (View) interfaceC9133ot, interfaceC9133ot.zzi());
                        }
                    } else if (m9H != null && m9H.f(uriA)) {
                        Context context2 = this.f81355a.getContext();
                        InterfaceC9133ot interfaceC9133ot2 = this.f81355a;
                        uriA = c10123y60E.a(uriA, context2, (View) interfaceC9133ot2, interfaceC9133ot2.zzi());
                    }
                } catch (zzavb unused) {
                    Sc.p.g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                Nc.b bVar = this.f81377w;
                if (bVar == null || bVar.c()) {
                    Qc.l lVar = new Qc.l("android.intent.action.VIEW", uriA.toString(), null, null, null, null, null, null);
                    InterfaceC9133ot interfaceC9133ot3 = this.f81355a;
                    T0(lVar, true, false, interfaceC9133ot3 != null ? interfaceC9133ot3.zzr() : "");
                } else {
                    bVar.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final boolean u() {
        boolean z10;
        synchronized (this.f81358d) {
            z10 = this.f81371q;
        }
        return z10;
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        InterfaceC4376a interfaceC4376a = this.f81359e;
        if (interfaceC4376a != null) {
            interfaceC4376a.v();
        }
    }

    public final ViewTreeObserver.OnScrollChangedListener x0() {
        synchronized (this.f81358d) {
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
    protected final android.webkit.WebResourceResponse y0(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10309zt.y0(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final Nc.b zzd() {
        return this.f81377w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void zzl() {
        C7517Zc c7517Zc = this.f81356b;
        if (c7517Zc != null) {
            c7517Zc.c(10005);
        }
        this.f81349B = true;
        this.f81368n = 10004;
        this.f81369o = "Page loaded delay cancel.";
        F0();
        this.f81355a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void zzm() {
        synchronized (this.f81358d) {
        }
        this.f81350C++;
        F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void zzn() {
        this.f81350C--;
        F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void zzs() {
        InterfaceC6930Hp interfaceC6930Hp = this.f81379y;
        if (interfaceC6930Hp != null) {
            WebView webViewZzG = this.f81355a.zzG();
            if (ViewCompat.R(webViewZzG)) {
                q0(webViewZzG, interfaceC6930Hp, 10);
                return;
            }
            k0();
            ViewOnAttachStateChangeListenerC9774ut viewOnAttachStateChangeListenerC9774ut = new ViewOnAttachStateChangeListenerC9774ut(this, interfaceC6930Hp);
            this.f81354G = viewOnAttachStateChangeListenerC9774ut;
            ((View) this.f81355a).addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC9774ut);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
        InterfaceC8326hG interfaceC8326hG = this.f81365k;
        if (interfaceC8326hG != null) {
            interfaceC8326hG.zzu();
        }
    }

    public C10309zt(InterfaceC9133ot interfaceC9133ot, C7517Zc c7517Zc, boolean z10, C7840cn c7840cn, C7466Xm c7466Xm, GS gs2) {
        this.f81356b = c7517Zc;
        this.f81355a = interfaceC9133ot;
        this.f81371q = z10;
        this.f81376v = c7840cn;
        this.f81353F = gs2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(Map map, List list, String str) {
        if (Rc.p0.m()) {
            Rc.p0.k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                Rc.p0.k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC7194Pi) it.next()).a(this.f81355a, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(final View view, final InterfaceC6930Hp interfaceC6930Hp, final int i10) {
        if (interfaceC6930Hp.zzi() && i10 > 0) {
            interfaceC6930Hp.b(view);
            if (interfaceC6930Hp.zzi()) {
                Rc.D0.f32295l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.pt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f78488a.S0(view, interfaceC6930Hp, i10);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean t0(InterfaceC9133ot interfaceC9133ot) {
        if (interfaceC9133ot.e() != null && interfaceC9133ot.e().b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8281gu
    public final void O0(Uri uri) {
        final String strSubstring;
        Rc.p0.k("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.f81357c;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) Oc.A.c().a(C8784lf.f76746B5)).booleanValue() && this.f81352E.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) Oc.A.c().a(C8784lf.f76774D5)).intValue()) {
                    Rc.p0.k("Parsing gmsg query params on BG thread: ".concat(path));
                    Mj0.r(Nc.v.t().G(uri), new C9881vt(this, list, path, uri), C7033Kq.f69019f);
                    return;
                }
            }
            Nc.v.t();
            g0(Rc.D0.p(uri), list, path);
            return;
        }
        Rc.p0.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) Oc.A.c().a(C8784lf.f76747B6)).booleanValue() && Nc.v.s().h() != null) {
            if (path != null && path.length() >= 2) {
                strSubstring = path.substring(1);
            } else {
                strSubstring = com.google.maps.android.BuildConfig.TRAVIS;
            }
            C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.st
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i10 = C10309zt.f81347H;
                    Nc.v.s().h().e(strSubstring);
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
                    case com.medallia.digital.mobilesdk.l3.f93324d /* 127 */:
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
