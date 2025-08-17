package com.google.android.gms.ads.internal.overlay;

import Lc.v;
import Mc.A;
import Mc.InterfaceC4098a;
import Oc.p;
import Oc.q;
import Pc.D0;
import Pc.p0;
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
import com.google.android.gms.internal.ads.AbstractBinderC9423sn;
import com.google.android.gms.internal.ads.AbstractC7593bf;
import com.google.android.gms.internal.ads.C7267Vf0;
import com.google.android.gms.internal.ads.C7576bT;
import com.google.android.gms.internal.ads.C7789dT;
import com.google.android.gms.internal.ads.C7822dn;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8833nC;
import com.google.android.gms.internal.ads.C9705vN;
import com.google.android.gms.internal.ads.C9812wN;
import com.google.android.gms.internal.ads.HS;
import com.google.android.gms.internal.ads.HandlerC6857Jd0;
import com.google.android.gms.internal.ads.IS;
import com.google.android.gms.internal.ads.InterfaceC8201hG;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9008ot;
import java.util.Collections;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class h extends AbstractBinderC9423sn implements Oc.h {

    /* renamed from: w, reason: collision with root package name */
    static final int f64601w = Color.argb(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    protected final Activity f64602a;

    /* renamed from: b, reason: collision with root package name */
    AdOverlayInfoParcel f64603b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC9008ot f64604c;

    /* renamed from: d, reason: collision with root package name */
    e f64605d;

    /* renamed from: e, reason: collision with root package name */
    zzu f64606e;

    /* renamed from: g, reason: collision with root package name */
    FrameLayout f64608g;

    /* renamed from: h, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f64609h;

    /* renamed from: k, reason: collision with root package name */
    zzh f64612k;

    /* renamed from: o, reason: collision with root package name */
    private Runnable f64616o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f64617p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f64618q;

    /* renamed from: u, reason: collision with root package name */
    private Toolbar f64622u;

    /* renamed from: f, reason: collision with root package name */
    boolean f64607f = false;

    /* renamed from: i, reason: collision with root package name */
    boolean f64610i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f64611j = false;

    /* renamed from: l, reason: collision with root package name */
    boolean f64613l = false;

    /* renamed from: v, reason: collision with root package name */
    int f64623v = 1;

    /* renamed from: m, reason: collision with root package name */
    private final Object f64614m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f64615n = new c(this);

    /* renamed from: r, reason: collision with root package name */
    private boolean f64619r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f64620s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f64621t = true;

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final boolean f() {
        this.f64623v = 1;
        if (this.f64604c == null) {
            return true;
        }
        if (((Boolean) A.c().a(C8659lf.f76091O8)).booleanValue() && this.f64604c.canGoBack()) {
            this.f64604c.goBack();
            return false;
        }
        boolean zU0 = this.f64604c.u0();
        if (!zU0) {
            this.f64604c.L("onbackblocked", Collections.EMPTY_MAP);
        }
        return zU0;
    }

    public final void zzb() {
        this.f64623v = 3;
        this.f64602a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f64577k != 5) {
            return;
        }
        this.f64602a.overridePendingTransition(0, 0);
        InterfaceC9008ot interfaceC9008ot = this.f64604c;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.P0(null);
        }
    }

    public final void zzd() {
        this.f64612k.f64637b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzi() {
        this.f64623v = 1;
    }

    @Override // Oc.h
    public final void zzj() {
        this.f64623v = 2;
        this.f64602a.finish();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzx() {
        this.f64618q = true;
    }

    private final void G9(View view) {
        C7789dT c7789dTD;
        C7576bT c7576bTT;
        InterfaceC9008ot interfaceC9008ot = this.f64604c;
        if (interfaceC9008ot == null) {
            return;
        }
        if (((Boolean) A.c().a(C8659lf.f76325f5)).booleanValue() && (c7576bTT = interfaceC9008ot.t()) != null) {
            c7576bTT.a(view);
        } else if (((Boolean) A.c().a(C8659lf.f76311e5)).booleanValue() && (c7789dTD = interfaceC9008ot.d()) != null && c7789dTD.b()) {
            v.b().i(c7789dTD.a(), view);
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
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f64603b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            Lc.l r0 = r0.f64581o
            if (r0 == 0) goto L10
            boolean r0 = r0.f18005b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.f64602a
            Pc.b r4 = Lc.v.u()
            boolean r6 = r4.d(r3, r6)
            boolean r3 = r5.f64611j
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76111Q0
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
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
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.C8659lf.f76097P0
            com.google.android.gms.internal.ads.jf r0 = Mc.A.c()
            java.lang.Object r6 = r0.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f64603b
            if (r6 == 0) goto L57
            Lc.l r6 = r6.f64581o
            if (r6 == 0) goto L57
            boolean r6 = r6.f18010g
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.f64602a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76433n1
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
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

    private static final void I9(C7789dT c7789dT, View view) {
        if (c7789dT == null || view == null) {
            return;
        }
        if (((Boolean) A.c().a(C8659lf.f76311e5)).booleanValue() && c7789dT.b()) {
            return;
        }
        v.b().h(c7789dT.a(), view);
    }

    public final void A() {
        synchronized (this.f64614m) {
            try {
                this.f64617p = true;
                Runnable runnable = this.f64616o;
                if (runnable != null) {
                    HandlerC6857Jd0 handlerC6857Jd0 = D0.f25081l;
                    handlerC6857Jd0.removeCallbacks(runnable);
                    handlerC6857Jd0.post(this.f64616o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void C2(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.f64602a;
            HS hsE = IS.e();
            hsE.a(activity);
            hsE.b(this.f64603b.f64577k == 5 ? this : null);
            try {
                this.f64603b.f64588v.j2(strArr, iArr, com.google.android.gms.dynamic.d.F2(hsE.e()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void C9(int i10) {
        if (this.f64602a.getApplicationInfo().targetSdkVersion >= ((Integer) A.c().a(C8659lf.f76116Q5)).intValue()) {
            if (this.f64602a.getApplicationInfo().targetSdkVersion <= ((Integer) A.c().a(C8659lf.f76130R5)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) A.c().a(C8659lf.f76144S5)).intValue()) {
                    if (i11 <= ((Integer) A.c().a(C8659lf.f76158T5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f64602a.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            v.s().w(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void D9(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f64602a);
        this.f64608g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f64608g.addView(view, -1, -1);
        this.f64602a.setContentView(this.f64608g);
        this.f64618q = true;
        this.f64609h = customViewCallback;
        this.f64607f = true;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void F0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f64610i);
    }

    public final void F9(String str) {
        Toolbar toolbar = this.f64622u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void J9(IS is2) throws RemoteException, d {
        InterfaceC8675ln interfaceC8675ln;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel == null || (interfaceC8675ln = adOverlayInfoParcel.f64588v) == null) {
            throw new d("noioou");
        }
        interfaceC8675ln.y0(com.google.android.gms.dynamic.d.F2(is2));
    }

    public final void K9(boolean z10, boolean z11) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        Lc.l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        Lc.l lVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) A.c().a(C8659lf.f76349h1)).booleanValue() && (adOverlayInfoParcel2 = this.f64603b) != null && (lVar2 = adOverlayInfoParcel2.f64581o) != null && lVar2.f18011h;
        boolean z14 = ((Boolean) A.c().a(C8659lf.f76363i1)).booleanValue() && (adOverlayInfoParcel = this.f64603b) != null && (lVar = adOverlayInfoParcel.f64581o) != null && lVar.f18012i;
        if (z10 && z11 && z13 && !z14) {
            new C7822dn(this.f64604c, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.f64606e;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.b(z12);
        }
    }

    public final void h1(boolean z10) {
        if (z10) {
            this.f64612k.setBackgroundColor(0);
        } else {
            this.f64612k.setBackgroundColor(-16777216);
        }
    }

    public final void j() throws JSONException {
        this.f64612k.removeView(this.f64606e);
        u4(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void j6(int i10, int i11, Intent intent) {
        C9812wN c9812wNZze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            AbstractC7593bf abstractC7593bf = C8659lf.f76207Wc;
            if (((Boolean) A.c().a(abstractC7593bf)).booleanValue()) {
                p0.k("Callback from intent launch with requestCode: 236 and resultCode: " + i11);
                InterfaceC9008ot interfaceC9008ot = this.f64604c;
                if (interfaceC9008ot == null || interfaceC9008ot.zzN() == null || (c9812wNZze = interfaceC9008ot.zzN().zze()) == null || (adOverlayInfoParcel = this.f64603b) == null || !((Boolean) A.c().a(abstractC7593bf)).booleanValue()) {
                    return;
                }
                C9705vN c9705vNA = c9812wNZze.a();
                c9705vNA.b("action", "hilca");
                c9705vNA.b("gqi", C7267Vf0.c(adOverlayInfoParcel.f64583q));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                c9705vNA.b("hilr", sb2.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        c9705vNA.b("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        c9705vNA.b("hills", stringExtra2);
                    }
                }
                c9705vNA.f();
            }
        }
    }

    public final void u4(boolean z10) throws JSONException {
        if (this.f64603b.f64589w) {
            return;
        }
        int iIntValue = ((Integer) A.c().a(C8659lf.f76185V4)).intValue();
        boolean z11 = ((Boolean) A.c().a(C8659lf.f76377j1)).booleanValue() || z10;
        q qVar = new q();
        qVar.f23543d = 50;
        qVar.f23540a = true != z11 ? 0 : iIntValue;
        qVar.f23541b = true != z11 ? iIntValue : 0;
        qVar.f23542c = iIntValue;
        this.f64606e = new zzu(this.f64602a, qVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        K9(z10, this.f64603b.f64573g);
        this.f64612k.addView(this.f64606e, layoutParams);
        G9(this.f64606e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public void v3(Bundle bundle) throws JSONException, d {
        if (!this.f64618q) {
            this.f64602a.requestWindowFeature(1);
        }
        this.f64610i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.B(this.f64602a.getIntent());
            this.f64603b = adOverlayInfoParcelB;
            if (adOverlayInfoParcelB == null) {
                throw new d("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelB.f64589w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f64602a.setShowWhenLocked(true);
                } else {
                    this.f64602a.getWindow().addFlags(524288);
                }
            }
            if (this.f64603b.f64579m.f29931c > 7500000) {
                this.f64623v = 4;
            }
            if (this.f64602a.getIntent() != null) {
                this.f64621t = this.f64602a.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
            Lc.l lVar = adOverlayInfoParcel.f64581o;
            if (lVar != null) {
                boolean z10 = lVar.f18004a;
                this.f64611j = z10;
                if (z10) {
                    if (adOverlayInfoParcel.f64577k != 5 && lVar.f18009f != -1) {
                        new g(this, null).b();
                    }
                }
            } else if (adOverlayInfoParcel.f64577k == 5) {
                this.f64611j = true;
                if (adOverlayInfoParcel.f64577k != 5) {
                    new g(this, null).b();
                }
            } else {
                this.f64611j = false;
            }
            if (bundle == null) {
                if (this.f64621t) {
                    C8833nC c8833nC = this.f64603b.f64586t;
                    if (c8833nC != null) {
                        c8833nC.zze();
                    }
                    p pVar = this.f64603b.f64569c;
                    if (pVar != null) {
                        pVar.F2();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f64603b;
                if (adOverlayInfoParcel2.f64577k != 1) {
                    InterfaceC4098a interfaceC4098a = adOverlayInfoParcel2.f64568b;
                    if (interfaceC4098a != null) {
                        interfaceC4098a.v();
                    }
                    InterfaceC8201hG interfaceC8201hG = this.f64603b.f64587u;
                    if (interfaceC8201hG != null) {
                        interfaceC8201hG.Z();
                    }
                }
            }
            Activity activity = this.f64602a;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f64603b;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.f64580n, adOverlayInfoParcel3.f64579m.f29929a, adOverlayInfoParcel3.f64585s);
            this.f64612k = zzhVar;
            zzhVar.setId(1000);
            v.u().j(this.f64602a);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f64603b;
            int i10 = adOverlayInfoParcel4.f64577k;
            if (i10 == 1) {
                E9(false);
                return;
            }
            if (i10 == 2) {
                this.f64605d = new e(adOverlayInfoParcel4.f64570d);
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
            Qc.p.g(e10.getMessage());
            this.f64623v = 4;
            this.f64602a.finish();
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        p pVar;
        if (!this.f64602a.isFinishing() || this.f64619r) {
            return;
        }
        this.f64619r = true;
        InterfaceC9008ot interfaceC9008ot = this.f64604c;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.B0(this.f64623v - 1);
            synchronized (this.f64614m) {
                try {
                    if (!this.f64617p && this.f64604c.x()) {
                        if (((Boolean) A.c().a(C8659lf.f76115Q4)).booleanValue() && !this.f64620s && (adOverlayInfoParcel = this.f64603b) != null && (pVar = adOverlayInfoParcel.f64569c) != null) {
                            pVar.b2();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f64591a.zzc();
                            }
                        };
                        this.f64616o = runnable;
                        D0.f25081l.postDelayed(runnable, ((Long) A.c().a(C8659lf.f76335g1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    final void zzc() {
        InterfaceC9008ot interfaceC9008ot;
        p pVar;
        if (this.f64620s) {
            return;
        }
        this.f64620s = true;
        InterfaceC9008ot interfaceC9008ot2 = this.f64604c;
        if (interfaceC9008ot2 != null) {
            this.f64612k.removeView(interfaceC9008ot2.zzF());
            e eVar = this.f64605d;
            if (eVar != null) {
                this.f64604c.w0(eVar.f64597d);
                this.f64604c.L0(false);
                if (((Boolean) A.c().a(C8659lf.f75899Ac)).booleanValue() && this.f64604c.getParent() != null) {
                    ((ViewGroup) this.f64604c.getParent()).removeView(this.f64604c.zzF());
                }
                ViewGroup viewGroup = this.f64605d.f64596c;
                View viewZzF = this.f64604c.zzF();
                e eVar2 = this.f64605d;
                viewGroup.addView(viewZzF, eVar2.f64594a, eVar2.f64595b);
                this.f64605d = null;
            } else if (this.f64602a.getApplicationContext() != null) {
                this.f64604c.w0(this.f64602a.getApplicationContext());
            }
            this.f64604c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f64569c) != null) {
            pVar.N3(this.f64623v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f64603b;
        if (adOverlayInfoParcel2 == null || (interfaceC9008ot = adOverlayInfoParcel2.f64570d) == null) {
            return;
        }
        I9(interfaceC9008ot.d(), this.f64603b.f64570d.zzF());
    }

    protected final void zze() {
        this.f64604c.R();
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel != null && this.f64607f) {
            C9(adOverlayInfoParcel.f64576j);
        }
        if (this.f64608g != null) {
            this.f64602a.setContentView(this.f64612k);
            this.f64618q = true;
            this.f64608g.removeAllViews();
            this.f64608g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f64609h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f64609h = null;
        }
        this.f64607f = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzm() {
        InterfaceC9008ot interfaceC9008ot = this.f64604c;
        if (interfaceC9008ot != null) {
            try {
                this.f64612k.removeView(interfaceC9008ot.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.f64613l) {
            this.f64613l = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzr() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f64569c) != null) {
            pVar.d7();
        }
        H9(this.f64602a.getResources().getConfiguration());
        if (((Boolean) A.c().a(C8659lf.f76143S4)).booleanValue()) {
            return;
        }
        InterfaceC9008ot interfaceC9008ot = this.f64604c;
        if (interfaceC9008ot == null || interfaceC9008ot.M()) {
            Qc.p.g("The webview does not exist. Ignoring action.");
        } else {
            this.f64604c.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzt() {
        if (((Boolean) A.c().a(C8659lf.f76143S4)).booleanValue()) {
            InterfaceC9008ot interfaceC9008ot = this.f64604c;
            if (interfaceC9008ot == null || interfaceC9008ot.M()) {
                Qc.p.g("The webview does not exist. Ignoring action.");
            } else {
                this.f64604c.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzu() {
        if (((Boolean) A.c().a(C8659lf.f76143S4)).booleanValue() && this.f64604c != null && (!this.f64602a.isFinishing() || this.f64605d == null)) {
            this.f64604c.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzv() {
        p pVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel == null || (pVar = adOverlayInfoParcel.f64569c) == null) {
            return;
        }
        pVar.A1();
    }

    public h(Activity activity) {
        this.f64602a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void O(com.google.android.gms.dynamic.b bVar) {
        H9((Configuration) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9530tn
    public final void zzo() {
        p pVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f64603b;
        if (adOverlayInfoParcel != null && (pVar = adOverlayInfoParcel.f64569c) != null) {
            pVar.W5();
        }
        if (!((Boolean) A.c().a(C8659lf.f76143S4)).booleanValue() && this.f64604c != null && (!this.f64602a.isFinishing() || this.f64605d == null)) {
            this.f64604c.onPause();
        }
        zzF();
    }
}
