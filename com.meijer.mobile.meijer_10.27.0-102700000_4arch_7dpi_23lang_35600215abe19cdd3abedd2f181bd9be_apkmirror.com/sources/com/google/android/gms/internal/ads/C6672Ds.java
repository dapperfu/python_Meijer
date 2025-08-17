package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Ds, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6672Ds extends AbstractC9647us implements InterfaceC9966xr {

    /* renamed from: d, reason: collision with root package name */
    private AbstractC10073yr f66286d;

    /* renamed from: e, reason: collision with root package name */
    private String f66287e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66288f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66289g;

    /* renamed from: h, reason: collision with root package name */
    private C8685ls f66290h;

    /* renamed from: i, reason: collision with root package name */
    private long f66291i;

    /* renamed from: j, reason: collision with root package name */
    private long f66292j;

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void B(int i10, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void C(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void b() {
        synchronized (this) {
            this.f66288f = true;
            notify();
            release();
        }
        String str = this.f66287e;
        if (str != null) {
            d(this.f66287e, u(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final AbstractC10073yr s() {
        synchronized (this) {
            this.f66289g = true;
            notify();
        }
        this.f66286d.C(null);
        AbstractC10073yr abstractC10073yr = this.f66286d;
        this.f66286d = null;
        return abstractC10073yr;
    }

    private final void w(long j10) {
        Pc.D0.f25081l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.Cs
            @Override // java.lang.Runnable
            public final void run() {
                this.f65841a.t();
            }
        }, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void D(String str, Exception exc) {
        Qc.p.h("Precache exception", exc);
        Lc.v.s().w(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void E(final boolean z10, final long j10) {
        final InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f78935c.get();
        if (interfaceC6807Hr != null) {
            C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Bs
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC6807Hr.q0(z10, j10);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void F(String str, Exception exc) {
        Qc.p.h("Precache error", exc);
        Lc.v.s().w(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void i(int i10) {
        this.f66286d.A(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void j(int i10) {
        this.f66286d.B(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void k(int i10) {
        this.f66286d.D(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final void m(int i10) {
        this.f66286d.E(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final boolean o(String str, String[] strArr) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        this.f66287e = str;
        String strU = u(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f66286d.w(uriArr, this.f78934b);
            InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f78935c.get();
            if (interfaceC6807Hr != null) {
                interfaceC6807Hr.D(strU, this);
            }
            com.google.android.gms.common.util.f fVarC = Lc.v.c();
            long jA = fVarC.a();
            long jLongValue = ((Long) Mc.A.c().a(C8659lf.f76040L)).longValue();
            long jLongValue2 = ((Long) Mc.A.c().a(C8659lf.f76026K)).longValue() * 1000;
            long jIntValue = ((Integer) Mc.A.c().a(C8659lf.f76501s)).intValue();
            boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue();
            long j16 = -1;
            while (true) {
                synchronized (this) {
                    if (fVarC.a() - jA > jLongValue2) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                    }
                    if (this.f66288f) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.f66289g) {
                        if (!this.f66286d.M()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jV = this.f66286d.V();
                        if (jV > 0) {
                            long jR = this.f66286d.R();
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
                                long jR2 = zBooleanValue ? this.f66286d.r() : -1L;
                                j11 = j15;
                                j10 = jLongValue2;
                                j13 = jV;
                                j12 = j17;
                                h(str, strU, j14, j13, z10, jR2, zBooleanValue ? this.f66286d.T() : -1L, zBooleanValue ? this.f66286d.s() : -1L, AbstractC10073yr.O(), AbstractC10073yr.Q());
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
                            } else if (this.f66286d.S() < j11 || j14 <= 0) {
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
            Qc.p.g("Failed to preload url " + str + " Exception: " + e10.getMessage());
            Lc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(str, strU, "error", v("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final boolean r(String str, String[] strArr, C8685ls c8685ls) {
        this.f66287e = str;
        this.f66290h = c8685ls;
        String strU = u(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            this.f66286d.w(uriArr, this.f78934b);
            InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) this.f78935c.get();
            if (interfaceC6807Hr != null) {
                interfaceC6807Hr.D(strU, this);
            }
            this.f66291i = Lc.v.c().a();
            this.f66292j = -1L;
            w(0L);
            return true;
        } catch (Exception e10) {
            Qc.p.g("Failed to preload url " + str + " Exception: " + e10.getMessage());
            Lc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(str, strU, "error", v("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us, com.google.android.gms.common.api.i
    public final void release() {
        AbstractC10073yr abstractC10073yr = this.f66286d;
        if (abstractC10073yr != null) {
            abstractC10073yr.C(null);
            this.f66286d.y();
        }
    }

    final /* synthetic */ void t() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j10;
        long j11;
        long j12;
        String strU = u(this.f66287e);
        try {
            jLongValue = ((Long) Mc.A.c().a(C8659lf.f76026K)).longValue() * 1000;
            jIntValue = ((Integer) Mc.A.c().a(C8659lf.f76501s)).intValue();
            zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76224Y1)).booleanValue();
        } catch (Exception e10) {
            Qc.p.g("Failed to preload url " + this.f66287e + " Exception: " + e10.getMessage());
            Lc.v.s().w(e10, "VideoStreamExoPlayerCache.preload");
            release();
            d(this.f66287e, strU, "error", v("error", e10));
        }
        synchronized (this) {
            if (Lc.v.c().a() - this.f66291i > jLongValue) {
                throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
            }
            if (this.f66288f) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!this.f66289g) {
                if (!this.f66286d.M()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jV = this.f66286d.V();
                if (jV > 0) {
                    long jR = this.f66286d.R();
                    if (jR != this.f66292j) {
                        j10 = jIntValue;
                        j11 = jV;
                        j12 = jR;
                        h(this.f66287e, strU, j12, j11, jR > 0, zBooleanValue ? this.f66286d.r() : -1L, zBooleanValue ? this.f66286d.T() : -1L, zBooleanValue ? this.f66286d.s() : -1L, AbstractC10073yr.O(), AbstractC10073yr.Q());
                        this.f66292j = j12;
                    } else {
                        j10 = jIntValue;
                        j11 = jV;
                        j12 = jR;
                    }
                    if (j12 >= j11) {
                        f(this.f66287e, strU, j11);
                    } else if (this.f66286d.S() >= j10 && j12 > 0) {
                    }
                }
                w(((Long) Mc.A.c().a(C8659lf.f76040L)).longValue());
                return;
            }
            Lc.v.C().f(this.f66290h);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9966xr
    public final void zzv() {
        Qc.p.g("Precache onRenderedFirstFrame");
    }

    public C6672Ds(InterfaceC6807Hr interfaceC6807Hr, C6773Gr c6773Gr) {
        super(interfaceC6807Hr);
        C7314Ws c7314Ws = new C7314Ws(interfaceC6807Hr.getContext(), c6773Gr, (InterfaceC6807Hr) this.f78935c.get(), null);
        Qc.p.f("ExoPlayerAdapter initialized.");
        this.f66286d = c7314Ws;
        c7314Ws.C(this);
    }

    protected static final String u(String str) {
        return "cache:".concat(String.valueOf(Qc.g.h(str)));
    }

    private static String v(String str, Exception exc) {
        return str + com.medallia.digital.mobilesdk.q2.f92724c + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9647us
    public final boolean n(String str) {
        return o(str, new String[]{str});
    }
}
