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
public final class zzcck extends zzcay implements TextureView.SurfaceTextureListener, InterfaceC10091xr {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6932Hr f81459c;

    /* renamed from: d, reason: collision with root package name */
    private final C6966Ir f81460d;

    /* renamed from: e, reason: collision with root package name */
    private final C6898Gr f81461e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9022nr f81462f;

    /* renamed from: g, reason: collision with root package name */
    private Surface f81463g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC10198yr f81464h;

    /* renamed from: i, reason: collision with root package name */
    private String f81465i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f81466j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f81467k;

    /* renamed from: l, reason: collision with root package name */
    private int f81468l;

    /* renamed from: m, reason: collision with root package name */
    private C6864Fr f81469m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f81470n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f81471o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f81472p;

    /* renamed from: q, reason: collision with root package name */
    private int f81473q;

    /* renamed from: r, reason: collision with root package name */
    private int f81474r;

    /* renamed from: s, reason: collision with root package name */
    private float f81475s;

    private final boolean a0() {
        return b0() && this.f81468l != 1;
    }

    private final boolean b0() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        return (abstractC10198yr == null || !abstractC10198yr.M() || this.f81467k) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int e() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            return abstractC10198yr.N();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int g() {
        return this.f81474r;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int h() {
        return this.f81473q;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String l() {
        return "ExoPlayer/2".concat(true != this.f81470n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void p(InterfaceC9022nr interfaceC9022nr) {
        this.f81462f = interfaceC9022nr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final Integer t() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            return abstractC10198yr.t();
        }
        return null;
    }

    private final void S() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.H(true);
        }
    }

    private final void T() {
        if (this.f81471o) {
            return;
        }
        this.f81471o = true;
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Zr
            @Override // java.lang.Runnable
            public final void run() {
                this.f73097a.G();
            }
        });
        zzn();
        this.f81460d.b();
        if (this.f81472p) {
            n();
        }
    }

    private final void U(boolean z10, Integer num) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null && !z10) {
            abstractC10198yr.G(num);
            return;
        }
        if (this.f81465i == null || this.f81463g == null) {
            return;
        }
        if (z10) {
            if (!b0()) {
                Sc.p.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                abstractC10198yr.L();
                W();
            }
        }
        if (this.f81465i.startsWith("cache:")) {
            AbstractC9772us abstractC9772usC = this.f81459c.C(this.f81465i);
            if (abstractC9772usC instanceof C6797Ds) {
                AbstractC10198yr abstractC10198yrS = ((C6797Ds) abstractC9772usC).s();
                this.f81464h = abstractC10198yrS;
                abstractC10198yrS.G(num);
                if (!this.f81464h.M()) {
                    Sc.p.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC9772usC instanceof C6695As)) {
                    Sc.p.g("Stream cache miss: ".concat(String.valueOf(this.f81465i)));
                    return;
                }
                C6695As c6695As = (C6695As) abstractC9772usC;
                String strY = y();
                ByteBuffer byteBufferU = c6695As.u();
                boolean zV = c6695As.v();
                String strT = c6695As.t();
                if (strT == null) {
                    Sc.p.g("Stream cache URL is null.");
                    return;
                } else {
                    AbstractC10198yr abstractC10198yrX = x(num);
                    this.f81464h = abstractC10198yrX;
                    abstractC10198yrX.x(new Uri[]{Uri.parse(strT)}, strY, byteBufferU, zV);
                }
            }
        } else {
            this.f81464h = x(num);
            String strY2 = y();
            Uri[] uriArr = new Uri[this.f81466j.length];
            int i10 = 0;
            while (true) {
                String[] strArr = this.f81466j;
                if (i10 >= strArr.length) {
                    break;
                }
                uriArr[i10] = Uri.parse(strArr[i10]);
                i10++;
            }
            this.f81464h.w(uriArr, strY2);
        }
        this.f81464h.C(this);
        X(this.f81463g, false);
        if (this.f81464h.M()) {
            int iP = this.f81464h.P();
            this.f81468l = iP;
            if (iP == 3) {
                T();
            }
        }
    }

    private final void V() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.H(false);
        }
    }

    private final void W() {
        if (this.f81464h != null) {
            X(null, true);
            AbstractC10198yr abstractC10198yr = this.f81464h;
            if (abstractC10198yr != null) {
                abstractC10198yr.C(null);
                this.f81464h.y();
                this.f81464h = null;
            }
            this.f81468l = 1;
            this.f81467k = false;
            this.f81471o = false;
            this.f81472p = false;
        }
    }

    private final void X(Surface surface, boolean z10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr == null) {
            Sc.p.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            abstractC10198yr.J(surface, z10);
        } catch (IOException e10) {
            Sc.p.h("", e10);
        }
    }

    private final void Y() {
        Z(this.f81473q, this.f81474r);
    }

    private final void Z(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.f81475s != f10) {
            this.f81475s = f10;
            requestLayout();
        }
    }

    final /* synthetic */ void A() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void B(int i10, int i11) {
        this.f81473q = i10;
        this.f81474r = i11;
        Y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void C(int i10) {
        if (this.f81468l != i10) {
            this.f81468l = i10;
            if (i10 == 3) {
                T();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.f81461e.f68117a) {
                V();
            }
            this.f81460d.e();
            this.f81440b.c();
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Yr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72456a.A();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void D(String str, Exception exc) {
        final String strR = R("onLoadException", exc);
        Sc.p.g("ExoPlayerAdapter exception: ".concat(strR));
        Nc.v.s().w(exc, "AdExoPlayerView.onException");
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ur
            @Override // java.lang.Runnable
            public final void run() {
                this.f71543a.I(strR);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void E(final boolean z10, final long j10) {
        if (this.f81459c != null) {
            C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Tr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71303a.H(z10, j10);
                }
            });
        }
    }

    final /* synthetic */ void G() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzf();
        }
    }

    final /* synthetic */ void H(boolean z10, long j10) {
        this.f81459c.q0(z10, j10);
    }

    final /* synthetic */ void I(String str) {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.M0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void J() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzg();
        }
    }

    final /* synthetic */ void K() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzh();
        }
    }

    final /* synthetic */ void L() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzi();
        }
    }

    final /* synthetic */ void M(int i10, int i11) {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.c(i10, i11);
        }
    }

    final /* synthetic */ void N() {
        float fA = this.f81440b.a();
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr == null) {
            Sc.p.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            abstractC10198yr.K(fA, false);
        } catch (IOException e10) {
            Sc.p.h("", e10);
        }
    }

    final /* synthetic */ void O(int i10) {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void P() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zzd();
        }
    }

    final /* synthetic */ void Q() {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void a(int i10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.E(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void b(int i10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.I(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void c(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f81466j = new String[]{str};
        } else {
            this.f81466j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f81465i;
        boolean z10 = false;
        if (this.f81461e.f68127k && str2 != null && !str.equals(str2) && this.f81468l == 4) {
            z10 = true;
        }
        this.f81465i = str;
        U(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long i() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            return abstractC10198yr.T();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long j() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            return abstractC10198yr.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long k() {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            return abstractC10198yr.s();
        }
        return -1L;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws InterruptedException {
        if (this.f81470n) {
            C6864Fr c6864Fr = new C6864Fr(getContext());
            this.f81469m = c6864Fr;
            c6864Fr.c(surfaceTexture, i10, i11);
            this.f81469m.start();
            SurfaceTexture surfaceTextureA = this.f81469m.a();
            if (surfaceTextureA != null) {
                surfaceTexture = surfaceTextureA;
            } else {
                this.f81469m.e();
                this.f81469m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f81463g = surface;
        if (this.f81464h == null) {
            U(false, null);
        } else {
            X(surface, true);
            if (!this.f81461e.f68117a) {
                S();
            }
        }
        if (this.f81473q == 0 || this.f81474r == 0) {
            Z(i10, i11);
        } else {
            Y();
        }
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Wr
            @Override // java.lang.Runnable
            public final void run() {
                this.f72014a.K();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        C6864Fr c6864Fr = this.f81469m;
        if (c6864Fr != null) {
            c6864Fr.b(i10, i11);
        }
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Rr
            @Override // java.lang.Runnable
            public final void run() {
                this.f70789a.M(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f81460d.f(this);
        this.f81439a.a(surfaceTexture, this.f81462f);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        Rc.p0.k("AdExoPlayerView3 window visibility changed to " + i10);
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Qr
            @Override // java.lang.Runnable
            public final void run() {
                this.f70505a.O(i10);
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
        C6864Fr c6864Fr = this.f81469m;
        if (c6864Fr != null) {
            c6864Fr.f(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void u(int i10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.A(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void v(int i10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.B(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void w(int i10) {
        AbstractC10198yr abstractC10198yr = this.f81464h;
        if (abstractC10198yr != null) {
            abstractC10198yr.D(i10);
        }
    }

    final AbstractC10198yr x(Integer num) {
        C6898Gr c6898Gr = this.f81461e;
        InterfaceC6932Hr interfaceC6932Hr = this.f81459c;
        C7439Ws c7439Ws = new C7439Ws(interfaceC6932Hr.getContext(), c6898Gr, interfaceC6932Hr, num);
        Sc.p.f("ExoPlayerAdapter initialized.");
        return c7439Ws;
    }

    final String y() {
        InterfaceC6932Hr interfaceC6932Hr = this.f81459c;
        return Nc.v.t().H(interfaceC6932Hr.getContext(), interfaceC6932Hr.zzn().f34479a);
    }

    final /* synthetic */ void z(String str) {
        InterfaceC9022nr interfaceC9022nr = this.f81462f;
        if (interfaceC9022nr != null) {
            interfaceC9022nr.a("ExoPlayerAdapter error", str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.InterfaceC7034Kr
    public final void zzn() {
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Or
            @Override // java.lang.Runnable
            public final void run() {
                this.f70027a.N();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void zzv() {
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Mr
            @Override // java.lang.Runnable
            public final void run() {
                this.f69584a.J();
            }
        });
    }

    public zzcck(Context context, C6966Ir c6966Ir, InterfaceC6932Hr interfaceC6932Hr, boolean z10, boolean z11, C6898Gr c6898Gr) {
        super(context);
        this.f81468l = 1;
        this.f81459c = interfaceC6932Hr;
        this.f81460d = c6966Ir;
        this.f81470n = z10;
        this.f81461e = c6898Gr;
        setSurfaceTextureListener(this);
        c6966Ir.a(this);
    }

    private static String R(String str, Exception exc) {
        return str + com.medallia.digital.mobilesdk.q2.f93563c + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void F(String str, Exception exc) {
        final String strR = R(str, exc);
        Sc.p.g("ExoPlayerAdapter error: ".concat(strR));
        this.f81467k = true;
        if (this.f81461e.f68117a) {
            V();
        }
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Xr
            @Override // java.lang.Runnable
            public final void run() {
                this.f72256a.z(strR);
            }
        });
        Nc.v.s().w(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int d() {
        if (a0()) {
            return (int) this.f81464h.U();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int f() {
        if (a0()) {
            return (int) this.f81464h.V();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void m() {
        if (a0()) {
            if (this.f81461e.f68117a) {
                V();
            }
            this.f81464h.F(false);
            this.f81460d.e();
            this.f81440b.c();
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Vr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71771a.P();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void n() {
        if (a0()) {
            if (this.f81461e.f68117a) {
                S();
            }
            this.f81464h.F(true);
            this.f81460d.c();
            this.f81440b.b();
            this.f81439a.b();
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Nr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69793a.Q();
                }
            });
            return;
        }
        this.f81472p = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void o(int i10) {
        if (a0()) {
            this.f81464h.z(i10);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f81475s;
        if (f10 != 0.0f && this.f81469m == null) {
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
        C6864Fr c6864Fr = this.f81469m;
        if (c6864Fr != null) {
            c6864Fr.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m();
        C6864Fr c6864Fr = this.f81469m;
        if (c6864Fr != null) {
            c6864Fr.e();
            this.f81469m = null;
        }
        if (this.f81464h != null) {
            V();
            Surface surface = this.f81463g;
            if (surface != null) {
                surface.release();
            }
            this.f81463g = null;
            X(null, true);
        }
        Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Sr
            @Override // java.lang.Runnable
            public final void run() {
                this.f71011a.L();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void r() {
        if (b0()) {
            this.f81464h.L();
            W();
        }
        this.f81460d.e();
        this.f81440b.c();
        this.f81460d.d();
    }
}
