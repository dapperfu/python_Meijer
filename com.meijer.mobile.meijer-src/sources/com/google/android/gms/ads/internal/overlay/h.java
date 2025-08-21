package com.google.android.gms.ads.internal.overlay;

import Nc.v;
import Oc.A;
import Oc.InterfaceC4376a;
import Qc.p;
import Qc.q;
import Rc.D0;
import Rc.p0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.internal.ads.AbstractBinderC9548sn;
import com.google.android.gms.internal.ads.AbstractC7718bf;
import com.google.android.gms.internal.ads.C7392Vf0;
import com.google.android.gms.internal.ads.C7701bT;
import com.google.android.gms.internal.ads.C7914dT;
import com.google.android.gms.internal.ads.C7947dn;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8958nC;
import com.google.android.gms.internal.ads.C9830vN;
import com.google.android.gms.internal.ads.C9937wN;
import com.google.android.gms.internal.ads.HS;
import com.google.android.gms.internal.ads.HandlerC6982Jd0;
import com.google.android.gms.internal.ads.IS;
import com.google.android.gms.internal.ads.InterfaceC8326hG;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9133ot;
import java.util.Collections;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class h extends AbstractBinderC9548sn implements Qc.h {

    /* renamed from: w, reason: collision with root package name */
    static final int f65441w = Color.argb(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    protected final Activity f65442a;

    /* renamed from: b, reason: collision with root package name */
    AdOverlayInfoParcel f65443b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC9133ot f65444c;

    /* renamed from: d, reason: collision with root package name */
    e f65445d;

    /* renamed from: e, reason: collision with root package name */
    zzu f65446e;

    /* renamed from: g, reason: collision with root package name */
    FrameLayout f65448g;

    /* renamed from: h, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f65449h;

    /* renamed from: k, reason: collision with root package name */
    zzh f65452k;

    /* renamed from: o, reason: collision with root package name */
    private Runnable f65456o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f65457p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f65458q;

    /* renamed from: u, reason: collision with root package name */
    private Toolbar f65462u;

    /* renamed from: f, reason: collision with root package name */
    boolean f65447f = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f65450i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f65451j = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f65453l = false;

    /* renamed from: v, reason: collision with root package name */
    int f65463v = 1;

    /* renamed from: m, reason: collision with root package name */
    private final Object f65454m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f65455n = new c(this);

    /* renamed from: r, reason: collision with root package name */
    private boolean f65459r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f65460s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f65461t = true;

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final boolean g() {
        this.f65463v = 1;
        if (this.f65444c == null) {
            return true;
        }
        if (((Boolean) A.c().a(C8784lf.f76931O8)).booleanValue() && this.f65444c.canGoBack()) {
            this.f65444c.goBack();
            return false;
        }
        boolean zS0 = this.f65444c.s0();
        if (!zS0) {
            this.f65444c.L("onbackblocked", Collections.EMPTY_MAP);
        }
        return zS0;
    }

    public final void zzb() {
        this.f65463v = 3;
        this.f65442a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f65417k != 5) {
            return;
        }
        this.f65442a.overridePendingTransition(0, 0);
        InterfaceC9133ot interfaceC9133ot = this.f65444c;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.P0(null);
        }
    }

    public final void zzd() {
        this.f65452k.f65477b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzi() {
        this.f65463v = 1;
    }

    @Override // Qc.h
    public final void zzj() {
        this.f65463v = 2;
        this.f65442a.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzx() {
        this.f65458q = true;
    }

    private final void G9(View view) {
        C7914dT c7914dTD;
        C7701bT c7701bTT;
        InterfaceC9133ot interfaceC9133ot = this.f65444c;
        if (interfaceC9133ot == null) {
            return;
        }
        if (((Boolean) A.c().a(C8784lf.f77165f5)).booleanValue() && (c7701bTT = interfaceC9133ot.t()) != null) {
            c7701bTT.a(view);
        } else if (((Boolean) A.c().a(C8784lf.f77151e5)).booleanValue() && (c7914dTD = interfaceC9133ot.d()) != null && c7914dTD.b()) {
            v.b().i(c7914dTD.a(), view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H9(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f65443b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            Nc.l r0 = r0.f65421o
            if (r0 == 0) goto L10
            boolean r0 = r0.f20825b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f65442a
            Rc.b r4 = Nc.v.u()
            boolean r6 = r4.d(r3, r6)
            boolean r3 = r5.f65451j
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f76951Q0
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.C8784lf.f76937P0
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f65443b
            if (r6 == 0) goto L57
            Nc.l r6 = r6.f65421o
            if (r6 == 0) goto L57
            boolean r6 = r6.f20830g
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f65442a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77273n1
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r0 = r3.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.h.H9(android.content.res.Configuration):void");
    }

    private static final void I9(C7914dT c7914dT, View view) {
        if (c7914dT == null || view == null) {
            return;
        }
        if (((Boolean) A.c().a(C8784lf.f77151e5)).booleanValue() && c7914dT.b()) {
            return;
        }
        v.b().h(c7914dT.a(), view);
    }

    public final void A() {
        synchronized (this.f65454m) {
            try {
                this.f65457p = true;
                Runnable runnable = this.f65456o;
                if (runnable != null) {
                    HandlerC6982Jd0 handlerC6982Jd0 = D0.f32295l;
                    handlerC6982Jd0.removeCallbacks(runnable);
                    handlerC6982Jd0.post(this.f65456o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void C9(int i10) {
        if (this.f65442a.getApplicationInfo().targetSdkVersion >= ((Integer) A.c().a(C8784lf.f76956Q5)).intValue()) {
            if (this.f65442a.getApplicationInfo().targetSdkVersion <= ((Integer) A.c().a(C8784lf.f76970R5)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) A.c().a(C8784lf.f76984S5)).intValue()) {
                    if (i11 <= ((Integer) A.c().a(C8784lf.f76998T5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f65442a.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            v.s().w(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void D9(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f65442a);
        this.f65448g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f65448g.addView(view, -1, -1);
        this.f65442a.setContentView(this.f65448g);
        this.f65458q = true;
        this.f65449h = customViewCallback;
        this.f65447f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void E9(boolean r32) throws org.json.JSONException, com.google.android.gms.ads.internal.overlay.d {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.h.E9(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void F2(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f65442a;
            HS hsE = IS.e();
            hsE.a(activity);
            hsE.b(this.f65443b.f65417k == 5 ? this : null);
            try {
                this.f65443b.f65428v.l2(strArr, iArr, com.google.android.gms.dynamic.d.I2(hsE.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void F9(String str) {
        Toolbar toolbar = this.f65462u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public void G3(Bundle bundle) throws JSONException, d {
        if (!this.f65458q) {
            this.f65442a.requestWindowFeature(1);
        }
        this.f65450i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.B(this.f65442a.getIntent());
            this.f65443b = adOverlayInfoParcelB;
            if (adOverlayInfoParcelB == null) {
                throw new d("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelB.f65429w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f65442a.setShowWhenLocked(true);
                } else {
                    this.f65442a.getWindow().addFlags(524288);
                }
            }
            if (this.f65443b.f65419m.f34481c > 7500000) {
                this.f65463v = 4;
            }
            if (this.f65442a.getIntent() != null) {
                this.f65461t = this.f65442a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
            Nc.l lVar = adOverlayInfoParcel.f65421o;
            if (lVar != null) {
                boolean z10 = lVar.f20824a;
                this.f65451j = z10;
                if (z10) {
                    if (adOverlayInfoParcel.f65417k != 5 && lVar.f20829f != -1) {
                        new g(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f65417k == 5) {
                this.f65451j = true;
                if (adOverlayInfoParcel.f65417k != 5) {
                    new g(this, null).b();
                }
            } else {
                this.f65451j = false;
            }
            if (bundle == null) {
                if (this.f65461t) {
                    C8958nC c8958nC = this.f65443b.f65426t;
                    if (c8958nC != null) {
                        c8958nC.zze();
                    }
                    p pVar = this.f65443b.f65409c;
                    if (pVar != null) {
                        pVar.I2();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f65443b;
                if (adOverlayInfoParcel2.f65417k != 1) {
                    InterfaceC4376a interfaceC4376a = adOverlayInfoParcel2.f65408b;
                    if (interfaceC4376a != null) {
                        interfaceC4376a.v();
                    }
                    InterfaceC8326hG interfaceC8326hG = this.f65443b.f65427u;
                    if (interfaceC8326hG != null) {
                        interfaceC8326hG.Z();
                    }
                }
            }
            Activity activity = this.f65442a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f65443b;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.f65420n, adOverlayInfoParcel3.f65419m.f34479a, adOverlayInfoParcel3.f65425s);
            this.f65452k = zzhVar;
            zzhVar.setId(1000);
            v.u().j(this.f65442a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f65443b;
            int i10 = adOverlayInfoParcel4.f65417k;
            if (i10 == 1) {
                E9(false);
                return;
            }
            if (i10 == 2) {
                this.f65445d = new e(adOverlayInfoParcel4.f65410d);
                E9(false);
            } else if (i10 == 3) {
                E9(true);
            } else {
                if (i10 != 5) {
                    throw new d("Could not determine ad overlay type.");
                }
                E9(false);
            }
        } catch (d e10) {
            Sc.p.g(e10.getMessage());
            this.f65463v = 4;
            this.f65442a.finish();
        }
    }

    public final void H4(boolean z10) throws JSONException {
        if (this.f65443b.f65429w) {
            return;
        }
        int iIntValue = ((Integer) A.c().a(C8784lf.f77025V4)).intValue();
        boolean z11 = ((Boolean) A.c().a(C8784lf.f77217j1)).booleanValue() || z10;
        q qVar = new q();
        qVar.f28031d = 50;
        qVar.f28028a = true != z11 ? 0 : iIntValue;
        qVar.f28029b = true != z11 ? iIntValue : 0;
        qVar.f28030c = iIntValue;
        this.f65446e = new zzu(this.f65442a, qVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        K9(z10, this.f65443b.f65413g);
        this.f65452k.addView(this.f65446e, layoutParams);
        G9(this.f65446e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void I0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f65450i);
    }

    public final void J9(IS is2) throws RemoteException, d {
        InterfaceC8800ln interfaceC8800ln;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel == null || (interfaceC8800ln = adOverlayInfoParcel.f65428v) == null) {
            throw new d("noioou");
        }
        interfaceC8800ln.B0(com.google.android.gms.dynamic.d.I2(is2));
    }

    public final void K9(boolean z10, boolean z11) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        Nc.l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        Nc.l lVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) A.c().a(C8784lf.f77189h1)).booleanValue() && (adOverlayInfoParcel2 = this.f65443b) != null && (lVar2 = adOverlayInfoParcel2.f65421o) != null && lVar2.f20831h;
        boolean z14 = ((Boolean) A.c().a(C8784lf.f77203i1)).booleanValue() && (adOverlayInfoParcel = this.f65443b) != null && (lVar = adOverlayInfoParcel.f65421o) != null && lVar.f20832i;
        if (z10 && z11 && z13 && !z14) {
            new C7947dn(this.f65444c, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.f65446e;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.b(z12);
        }
    }

    public final void j() throws JSONException {
        this.f65452k.removeView(this.f65446e);
        H4(true);
    }

    public final void j1(boolean z10) {
        if (z10) {
            this.f65452k.setBackgroundColor(0);
        } else {
            this.f65452k.setBackgroundColor(-16777216);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void w6(int i10, int i11, Intent intent) {
        C9937wN c9937wNZze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            AbstractC7718bf abstractC7718bf = C8784lf.f77047Wc;
            if (((Boolean) A.c().a(abstractC7718bf)).booleanValue()) {
                p0.k("Callback from intent launch with requestCode: 236 and resultCode: " + i11);
                InterfaceC9133ot interfaceC9133ot = this.f65444c;
                if (interfaceC9133ot == null || interfaceC9133ot.zzN() == null || (c9937wNZze = interfaceC9133ot.zzN().zze()) == null || (adOverlayInfoParcel = this.f65443b) == null || !((Boolean) A.c().a(abstractC7718bf)).booleanValue()) {
                    return;
                }
                C9830vN c9830vNA = c9937wNZze.a();
                c9830vNA.b("action", "hilca");
                c9830vNA.b("gqi", C7392Vf0.c(adOverlayInfoParcel.f65423q));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                c9830vNA.b("hilr", sb2.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        c9830vNA.b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        c9830vNA.b("hills", stringExtra2);
                    }
                }
                c9830vNA.f();
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p pVar;
        if (!this.f65442a.isFinishing() || this.f65459r) {
            return;
        }
        this.f65459r = true;
        InterfaceC9133ot interfaceC9133ot = this.f65444c;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.A0(this.f65463v - 1);
            synchronized (this.f65454m) {
                try {
                    if (!this.f65457p && this.f65444c.x()) {
                        if (((Boolean) A.c().a(C8784lf.f76955Q4)).booleanValue() && !this.f65460s && (adOverlayInfoParcel = this.f65443b) != null && (pVar = adOverlayInfoParcel.f65409c) != null) {
                            pVar.c2();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f65431a.zzc();
                            }
                        };
                        this.f65456o = runnable;
                        D0.f32295l.postDelayed(runnable, ((Long) A.c().a(C8784lf.f77175g1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    final void zzc() {
        InterfaceC9133ot interfaceC9133ot;
        p pVar;
        if (this.f65460s) {
            return;
        }
        this.f65460s = true;
        InterfaceC9133ot interfaceC9133ot2 = this.f65444c;
        if (interfaceC9133ot2 != null) {
            this.f65452k.removeView(interfaceC9133ot2.zzF());
            e eVar = this.f65445d;
            if (eVar != null) {
                this.f65444c.v0(eVar.f65437d);
                this.f65444c.K0(false);
                if (((Boolean) A.c().a(C8784lf.f76739Ac)).booleanValue() && this.f65444c.getParent() != null) {
                    ((ViewGroup) this.f65444c.getParent()).removeView(this.f65444c.zzF());
                }
                ViewGroup viewGroup = this.f65445d.f65436c;
                View viewZzF = this.f65444c.zzF();
                e eVar2 = this.f65445d;
                viewGroup.addView(viewZzF, eVar2.f65434a, eVar2.f65435b);
                this.f65445d = null;
            } else if (this.f65442a.getApplicationContext() != null) {
                this.f65444c.v0(this.f65442a.getApplicationContext());
            }
            this.f65444c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f65409c) != null) {
            pVar.Z3(this.f65463v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f65443b;
        if (adOverlayInfoParcel2 == null || (interfaceC9133ot = adOverlayInfoParcel2.f65410d) == null) {
            return;
        }
        I9(interfaceC9133ot.d(), this.f65443b.f65410d.zzF());
    }

    protected final void zze() {
        this.f65444c.R();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel != null && this.f65447f) {
            C9(adOverlayInfoParcel.f65416j);
        }
        if (this.f65448g != null) {
            this.f65442a.setContentView(this.f65452k);
            this.f65458q = true;
            this.f65448g.removeAllViews();
            this.f65448g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f65449h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f65449h = null;
        }
        this.f65447f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzm() {
        InterfaceC9133ot interfaceC9133ot = this.f65444c;
        if (interfaceC9133ot != null) {
            try {
                this.f65452k.removeView(interfaceC9133ot.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f65453l) {
            this.f65453l = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzr() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f65409c) != null) {
            pVar.o7();
        }
        H9(this.f65442a.getResources().getConfiguration());
        if (((Boolean) A.c().a(C8784lf.f76983S4)).booleanValue()) {
            return;
        }
        InterfaceC9133ot interfaceC9133ot = this.f65444c;
        if (interfaceC9133ot == null || interfaceC9133ot.M()) {
            Sc.p.g("The webview does not exist. Ignoring action.");
        } else {
            this.f65444c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzt() {
        if (((Boolean) A.c().a(C8784lf.f76983S4)).booleanValue()) {
            InterfaceC9133ot interfaceC9133ot = this.f65444c;
            if (interfaceC9133ot == null || interfaceC9133ot.M()) {
                Sc.p.g("The webview does not exist. Ignoring action.");
            } else {
                this.f65444c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzu() {
        if (((Boolean) A.c().a(C8784lf.f76983S4)).booleanValue() && this.f65444c != null && (!this.f65442a.isFinishing() || this.f65445d == null)) {
            this.f65444c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzv() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel == null || (pVar = adOverlayInfoParcel.f65409c) == null) {
            return;
        }
        pVar.K1();
    }

    public h(Activity activity) {
        this.f65442a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void O(com.google.android.gms.dynamic.b bVar) {
        H9((Configuration) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9655tn
    public final void zzo() {
        p pVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f65443b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f65409c) != null) {
            pVar.m6();
        }
        if (!((Boolean) A.c().a(C8784lf.f76983S4)).booleanValue() && this.f65444c != null && (!this.f65442a.isFinishing() || this.f65445d == null)) {
            this.f65444c.onPause();
        }
        zzF();
    }
}
