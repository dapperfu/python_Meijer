package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class zzcck extends zzcay implements TextureView.SurfaceTextureListener, InterfaceC9966xr {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6807Hr f80619c;

    /* renamed from: d, reason: collision with root package name */
    private final C6841Ir f80620d;

    /* renamed from: e, reason: collision with root package name */
    private final C6773Gr f80621e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC8897nr f80622f;

    /* renamed from: g, reason: collision with root package name */
    private Surface f80623g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC10073yr f80624h;

    /* renamed from: i, reason: collision with root package name */
    private String f80625i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f80626j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f80627k;

    /* renamed from: l, reason: collision with root package name */
    private int f80628l;

    /* renamed from: m, reason: collision with root package name */
    private C6739Fr f80629m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f80630n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f80631o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f80632p;

    /* renamed from: q, reason: collision with root package name */
    private int f80633q;

    /* renamed from: r, reason: collision with root package name */
    private int f80634r;

    /* renamed from: s, reason: collision with root package name */
    private float f80635s;

    private final boolean a0() {
        return b0() && this.f80628l != 1;
    }

    private final boolean b0() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        return (abstractC10073yr == null || !abstractC10073yr.M() || this.f80627k) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int e() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            return abstractC10073yr.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int g() {
        return this.f80634r;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int h() {
        return this.f80633q;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String l() {
        return "ExoPlayer/2".concat(true != this.f80630n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void p(InterfaceC8897nr interfaceC8897nr) {
        this.f80622f = interfaceC8897nr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final Integer t() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            return abstractC10073yr.t();
        }
        return null;
    }

    private final void S() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.H(true);
        }
    }

    private final void T() {
        if (this.f80631o) {
            return;
        }
        this.f80631o = true;
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Zr
            @Override // java.lang.Runnable
            public final void run() {
                this.f72257a.G();
            }
        });
        zzn();
        this.f80620d.b();
        if (this.f80632p) {
            n();
        }
    }

    private final void U(boolean z10, Integer num) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null && !z10) {
            abstractC10073yr.G(num);
            return;
        }
        if (this.f80625i == null || this.f80623g == null) {
            return;
        }
        if (z10) {
            if (!b0()) {
                Qc.p.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                abstractC10073yr.L();
                W();
            }
        }
        if (this.f80625i.startsWith("cache:")) {
            AbstractC9647us abstractC9647usC = this.f80619c.C(this.f80625i);
            if (abstractC9647usC instanceof C6672Ds) {
                AbstractC10073yr abstractC10073yrS = ((C6672Ds) abstractC9647usC).s();
                this.f80624h = abstractC10073yrS;
                abstractC10073yrS.G(num);
                if (!this.f80624h.M()) {
                    Qc.p.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC9647usC instanceof C6570As)) {
                    Qc.p.g("Stream cache miss: ".concat(String.valueOf(this.f80625i)));
                    return;
                }
                C6570As c6570As = (C6570As) abstractC9647usC;
                String strY = y();
                ByteBuffer byteBufferU = c6570As.u();
                boolean zV = c6570As.v();
                String strT = c6570As.t();
                if (strT == null) {
                    Qc.p.g("Stream cache URL is null.");
                    return;
                } else {
                    AbstractC10073yr abstractC10073yrX = x(num);
                    this.f80624h = abstractC10073yrX;
                    abstractC10073yrX.x(new Uri[]{Uri.parse(strT)}, strY, byteBufferU, zV);
                }
            }
        } else {
            this.f80624h = x(num);
            String strY2 = y();
            Uri[] uriArr = new Uri[this.f80626j.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.f80626j;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            this.f80624h.w(uriArr, strY2);
        }
        this.f80624h.C(this);
        X(this.f80623g, false);
        if (this.f80624h.M()) {
            int iP = this.f80624h.P();
            this.f80628l = iP;
            if (iP == 3) {
                T();
            }
        }
    }

    private final void V() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.H(false);
        }
    }

    private final void W() {
        if (this.f80624h != null) {
            X(null, true);
            AbstractC10073yr abstractC10073yr = this.f80624h;
            if (abstractC10073yr != null) {
                abstractC10073yr.C(null);
                this.f80624h.y();
                this.f80624h = null;
            }
            this.f80628l = 1;
            this.f80627k = false;
            this.f80631o = false;
            this.f80632p = false;
        }
    }

    private final void X(Surface surface, boolean z10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr == null) {
            Qc.p.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC10073yr.J(surface, z10);
        } catch (IOException e10) {
            Qc.p.h("", e10);
        }
    }

    private final void Y() {
        Z(this.f80633q, this.f80634r);
    }

    private final void Z(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.f80635s != f10) {
            this.f80635s = f10;
            requestLayout();
        }
    }

    final /* synthetic */ void A() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void B(int i10, int i11) {
        this.f80633q = i10;
        this.f80634r = i11;
        Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void C(int i10) {
        if (this.f80628l != i10) {
            this.f80628l = i10;
            if (i10 == 3) {
                T();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.f80621e.f67277a) {
                V();
            }
            this.f80620d.e();
            this.f80600b.c();
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Yr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71616a.A();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void D(String str, Exception exc) {
        final String strR = R("onLoadException", exc);
        Qc.p.g("ExoPlayerAdapter exception: ".concat(strR));
        Lc.v.s().w(exc, "AdExoPlayerView.onException");
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ur
            @Override // java.lang.Runnable
            public final void run() {
                this.f70703a.I(strR);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void E(final boolean z10, final long j10) {
        if (this.f80619c != null) {
            C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Tr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70463a.H(z10, j10);
                }
            });
        }
    }

    final /* synthetic */ void G() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzf();
        }
    }

    final /* synthetic */ void H(boolean z10, long j10) {
        this.f80619c.q0(z10, j10);
    }

    final /* synthetic */ void I(String str) {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.K0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void J() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzg();
        }
    }

    final /* synthetic */ void K() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzh();
        }
    }

    final /* synthetic */ void L() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzi();
        }
    }

    final /* synthetic */ void M(int i10, int i11) {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.c(i10, i11);
        }
    }

    final /* synthetic */ void N() {
        float fA = this.f80600b.a();
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr == null) {
            Qc.p.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC10073yr.K(fA, false);
        } catch (IOException e10) {
            Qc.p.h("", e10);
        }
    }

    final /* synthetic */ void O(int i10) {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void P() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zzd();
        }
    }

    final /* synthetic */ void Q() {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void a(int i10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.E(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void b(int i10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.I(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void c(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f80626j = new String[]{str};
        } else {
            this.f80626j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f80625i;
        boolean z10 = false;
        if (this.f80621e.f67287k && str2 != null && !str.equals(str2) && this.f80628l == 4) {
            z10 = true;
        }
        this.f80625i = str;
        U(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long i() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            return abstractC10073yr.T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long j() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            return abstractC10073yr.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long k() {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            return abstractC10073yr.s();
        }
        return -1L;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws InterruptedException {
        if (this.f80630n) {
            C6739Fr c6739Fr = new C6739Fr(getContext());
            this.f80629m = c6739Fr;
            c6739Fr.c(surfaceTexture, i10, i11);
            this.f80629m.start();
            SurfaceTexture surfaceTextureA = this.f80629m.a();
            if (surfaceTextureA != null) {
                surfaceTexture = surfaceTextureA;
            } else {
                this.f80629m.e();
                this.f80629m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f80623g = surface;
        if (this.f80624h == null) {
            U(false, null);
        } else {
            X(surface, true);
            if (!this.f80621e.f67277a) {
                S();
            }
        }
        if (this.f80633q == 0 || this.f80634r == 0) {
            Z(i10, i11);
        } else {
            Y();
        }
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Wr
            @Override // java.lang.Runnable
            public final void run() {
                this.f71174a.K();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        C6739Fr c6739Fr = this.f80629m;
        if (c6739Fr != null) {
            c6739Fr.b(i10, i11);
        }
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Rr
            @Override // java.lang.Runnable
            public final void run() {
                this.f69949a.M(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f80620d.f(this);
        this.f80599a.a(surfaceTexture, this.f80622f);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        Pc.p0.k("AdExoPlayerView3 window visibility changed to " + i10);
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Qr
            @Override // java.lang.Runnable
            public final void run() {
                this.f69665a.O(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void q(String str) {
        if (str != null) {
            c(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void s(float f10, float f11) {
        C6739Fr c6739Fr = this.f80629m;
        if (c6739Fr != null) {
            c6739Fr.f(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void u(int i10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.A(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void v(int i10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.B(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void w(int i10) {
        AbstractC10073yr abstractC10073yr = this.f80624h;
        if (abstractC10073yr != null) {
            abstractC10073yr.D(i10);
        }
    }

    final AbstractC10073yr x(Integer num) {
        C6773Gr c6773Gr = this.f80621e;
        InterfaceC6807Hr interfaceC6807Hr = this.f80619c;
        C7314Ws c7314Ws = new C7314Ws(interfaceC6807Hr.getContext(), c6773Gr, interfaceC6807Hr, num);
        Qc.p.f("ExoPlayerAdapter initialized.");
        return c7314Ws;
    }

    final String y() {
        InterfaceC6807Hr interfaceC6807Hr = this.f80619c;
        return Lc.v.t().H(interfaceC6807Hr.getContext(), interfaceC6807Hr.zzn().f29929a);
    }

    final /* synthetic */ void z(String str) {
        InterfaceC8897nr interfaceC8897nr = this.f80622f;
        if (interfaceC8897nr != null) {
            interfaceC8897nr.a("ExoPlayerAdapter error", str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC6909Kr
    public final void zzn() {
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Or
            @Override // java.lang.Runnable
            public final void run() {
                this.f69187a.N();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void zzv() {
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Mr
            @Override // java.lang.Runnable
            public final void run() {
                this.f68744a.J();
            }
        });
    }

    public zzcck(Context context, C6841Ir c6841Ir, InterfaceC6807Hr interfaceC6807Hr, boolean z10, boolean z11, C6773Gr c6773Gr) {
        super(context);
        this.f80628l = 1;
        this.f80619c = interfaceC6807Hr;
        this.f80620d = c6841Ir;
        this.f80630n = z10;
        this.f80621e = c6773Gr;
        setSurfaceTextureListener(this);
        c6841Ir.a(this);
    }

    private static String R(String str, Exception exc) {
        return str + com.medallia.digital.mobilesdk.q2.f92724c + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void F(String str, Exception exc) {
        final String strR = R(str, exc);
        Qc.p.g("ExoPlayerAdapter error: ".concat(strR));
        this.f80627k = true;
        if (this.f80621e.f67277a) {
            V();
        }
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Xr
            @Override // java.lang.Runnable
            public final void run() {
                this.f71416a.z(strR);
            }
        });
        Lc.v.s().w(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int d() {
        if (a0()) {
            return (int) this.f80624h.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int f() {
        if (a0()) {
            return (int) this.f80624h.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() {
        if (a0()) {
            if (this.f80621e.f67277a) {
                V();
            }
            this.f80624h.F(false);
            this.f80620d.e();
            this.f80600b.c();
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Vr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70931a.P();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() {
        if (a0()) {
            if (this.f80621e.f67277a) {
                S();
            }
            this.f80624h.F(true);
            this.f80620d.c();
            this.f80600b.b();
            this.f80599a.b();
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Nr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68953a.Q();
                }
            });
            return;
        }
        this.f80632p = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) {
        if (a0()) {
            this.f80624h.z(i10);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f80635s;
        if (f10 != 0.0f && this.f80629m == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C6739Fr c6739Fr = this.f80629m;
        if (c6739Fr != null) {
            c6739Fr.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m();
        C6739Fr c6739Fr = this.f80629m;
        if (c6739Fr != null) {
            c6739Fr.e();
            this.f80629m = null;
        }
        if (this.f80624h != null) {
            V();
            Surface surface = this.f80623g;
            if (surface != null) {
                surface.release();
            }
            this.f80623g = null;
            X(null, true);
        }
        Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Sr
            @Override // java.lang.Runnable
            public final void run() {
                this.f70171a.L();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() {
        if (b0()) {
            this.f80624h.L();
            W();
        }
        this.f80620d.e();
        this.f80600b.c();
        this.f80620d.d();
    }
}
