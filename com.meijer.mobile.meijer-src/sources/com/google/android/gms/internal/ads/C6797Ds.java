package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ds, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6797Ds extends AbstractC9772us implements InterfaceC10091xr {

    /* renamed from: d, reason: collision with root package name */
    private AbstractC10198yr f67126d;

    /* renamed from: e, reason: collision with root package name */
    private String f67127e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f67128f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f67129g;

    /* renamed from: h, reason: collision with root package name */
    private C8810ls f67130h;

    /* renamed from: i, reason: collision with root package name */
    private long f67131i;

    /* renamed from: j, reason: collision with root package name */
    private long f67132j;

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void B(int i10, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void C(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void b() {
        synchronized (this) {
            this.f67128f = true;
            notify();
            release();
        }
        String str = this.f67127e;
        if (str != null) {
            d(this.f67127e, u(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final AbstractC10198yr s() {
        synchronized (this) {
            this.f67129g = true;
            notify();
        }
        this.f67126d.C(null);
        AbstractC10198yr abstractC10198yr = this.f67126d;
        this.f67126d = null;
        return abstractC10198yr;
    }

    private final void w(long j10) {
        Rc.D0.f32295l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.Cs
            @Override // java.lang.Runnable
            public final void run() {
                this.f66681a.t();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void D(String str, Exception exc) {
        Sc.p.h("Precache exception", exc);
        Nc.v.s().w(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void E(final boolean z10, final long j10) {
        final InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f79775c.get();
        if (interfaceC6932Hr != null) {
            C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Bs
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6932Hr.q0(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void F(String str, Exception exc) {
        Sc.p.h("Precache error", exc);
        Nc.v.s().w(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void i(int i10) {
        this.f67126d.A(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void j(int i10) {
        this.f67126d.B(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void k(int i10) {
        this.f67126d.D(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final void m(int i10) {
        this.f67126d.E(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final boolean o(String str, String[] strArr) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        this.f67127e = str;
        String strU = u(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f67126d.w(uriArr, this.f79774b);
            InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f79775c.get();
            if (interfaceC6932Hr != null) {
                interfaceC6932Hr.D(strU, this);
            }
            com.google.android.gms.common.util.f fVarC = Nc.v.c();
            long jA = fVarC.a();
            long jLongValue = ((Long) Oc.A.c().a(C8784lf.f76880L)).longValue();
            long jLongValue2 = ((Long) Oc.A.c().a(C8784lf.f76866K)).longValue() * 1000;
            long jIntValue = ((Integer) Oc.A.c().a(C8784lf.f77341s)).intValue();
            boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue();
            long j16 = -1;
            while (true) {
                synchronized (this) {
                    if (fVarC.a() - jA > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.f67128f) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f67129g) {
                        if (!this.f67126d.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jV = this.f67126d.V();
                        if (jV > 0) {
                            long jR = this.f67126d.R();
                            if (jR != j16) {
                                if (jR > 0) {
                                    j15 = jIntValue;
                                    z10 = true;
                                } else {
                                    j15 = jIntValue;
                                    z10 = false;
                                }
                                long j17 = jLongValue;
                                j14 = jR;
                                long jR2 = zBooleanValue ? this.f67126d.r() : -1L;
                                j11 = j15;
                                j10 = jLongValue2;
                                j13 = jV;
                                j12 = j17;
                                h(str, strU, j14, j13, z10, jR2, zBooleanValue ? this.f67126d.T() : -1L, zBooleanValue ? this.f67126d.s() : -1L, AbstractC10198yr.O(), AbstractC10198yr.Q());
                                j16 = j14;
                            } else {
                                j12 = jLongValue;
                                j10 = jLongValue2;
                                j11 = jIntValue;
                                j13 = jV;
                                j14 = jR;
                            }
                            if (j14 >= j13) {
                                f(str, strU, j13);
                            } else if (this.f67126d.S() < j11 || j14 <= 0) {
                                jLongValue = j12;
                            }
                        } else {
                            j10 = jLongValue2;
                            j11 = jIntValue;
                        }
                        try {
                            wait(jLongValue);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    }
                }
                jIntValue = j11;
                jLongValue2 = j10;
            }
            return true;
        } catch (Exception e10) {
            Sc.p.g("Failed to preload url " + str + " Exception: " + e10.getMessage());
            Nc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(str, strU, "error", v("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final boolean r(String str, String[] strArr, C8810ls c8810ls) {
        this.f67127e = str;
        this.f67130h = c8810ls;
        String strU = u(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f67126d.w(uriArr, this.f79774b);
            InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) this.f79775c.get();
            if (interfaceC6932Hr != null) {
                interfaceC6932Hr.D(strU, this);
            }
            this.f67131i = Nc.v.c().a();
            this.f67132j = -1L;
            w(0L);
            return true;
        } catch (Exception e10) {
            Sc.p.g("Failed to preload url " + str + " Exception: " + e10.getMessage());
            Nc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(str, strU, "error", v("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us, com.google.android.gms.common.api.i
    public final void release() {
        AbstractC10198yr abstractC10198yr = this.f67126d;
        if (abstractC10198yr != null) {
            abstractC10198yr.C(null);
            this.f67126d.y();
        }
    }

    final /* synthetic */ void t() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j10;
        long j11;
        long j12;
        String strU = u(this.f67127e);
        try {
            jLongValue = ((Long) Oc.A.c().a(C8784lf.f76866K)).longValue() * 1000;
            jIntValue = ((Integer) Oc.A.c().a(C8784lf.f77341s)).intValue();
            zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77064Y1)).booleanValue();
        } catch (Exception e10) {
            Sc.p.g("Failed to preload url " + this.f67127e + " Exception: " + e10.getMessage());
            Nc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(this.f67127e, strU, "error", v("error", e10));
        }
        synchronized (this) {
            if (Nc.v.c().a() - this.f67131i > jLongValue) {
                throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
            }
            if (this.f67128f) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.f67129g) {
                if (!this.f67126d.M()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jV = this.f67126d.V();
                if (jV > 0) {
                    long jR = this.f67126d.R();
                    if (jR != this.f67132j) {
                        j10 = jIntValue;
                        j11 = jV;
                        j12 = jR;
                        h(this.f67127e, strU, j12, j11, jR > 0, zBooleanValue ? this.f67126d.r() : -1L, zBooleanValue ? this.f67126d.T() : -1L, zBooleanValue ? this.f67126d.s() : -1L, AbstractC10198yr.O(), AbstractC10198yr.Q());
                        this.f67132j = j12;
                    } else {
                        j10 = jIntValue;
                        j11 = jV;
                        j12 = jR;
                    }
                    if (j12 >= j11) {
                        f(this.f67127e, strU, j11);
                    } else if (this.f67126d.S() >= j10 && j12 > 0) {
                    }
                }
                w(((Long) Oc.A.c().a(C8784lf.f76880L)).longValue());
                return;
            }
            Nc.v.C().f(this.f67130h);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10091xr
    public final void zzv() {
        Sc.p.g("Precache onRenderedFirstFrame");
    }

    public C6797Ds(InterfaceC6932Hr interfaceC6932Hr, C6898Gr c6898Gr) {
        super(interfaceC6932Hr);
        C7439Ws c7439Ws = new C7439Ws(interfaceC6932Hr.getContext(), c6898Gr, (InterfaceC6932Hr) this.f79775c.get(), null);
        Sc.p.f("ExoPlayerAdapter initialized.");
        this.f67126d = c7439Ws;
        c7439Ws.C(this);
    }

    protected static final String u(String str) {
        return "cache:".concat(String.valueOf(Sc.g.h(str)));
    }

    private static String v(String str, Exception exc) {
        return str + com.medallia.digital.mobilesdk.q2.f93563c + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9772us
    public final boolean n(String str) {
        return o(str, new String[]{str});
    }
}
