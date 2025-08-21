package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class JF0 extends AbstractC10246zE0 implements AF0 {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7225Qg0 f68686h;

    /* renamed from: i, reason: collision with root package name */
    private final BD0 f68687i;

    /* renamed from: j, reason: collision with root package name */
    private final int f68688j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f68689k = true;

    /* renamed from: l, reason: collision with root package name */
    private long f68690l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private boolean f68691m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f68692n;

    /* renamed from: o, reason: collision with root package name */
    private Pu0 f68693o;

    /* renamed from: p, reason: collision with root package name */
    private H7 f68694p;

    /* renamed from: q, reason: collision with root package name */
    private final GF0 f68695q;

    /* renamed from: r, reason: collision with root package name */
    private final C8541jH0 f68696r;

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0, com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final synchronized void b(H7 h72) {
        this.f68694p = h72;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final synchronized H7 k() {
        return this.f68694p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void y() {
    }

    private final void A() {
        long j10 = this.f68690l;
        boolean z10 = this.f68691m;
        boolean z11 = this.f68692n;
        H7 h7K = k();
        AbstractC7432Wl xf0 = new XF0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, h7K, z11 ? h7K.f68217c : null);
        if (this.f68689k) {
            xf0 = new FF0(this, xf0);
        }
        x(xf0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final void a(YE0 ye0) {
        ((EF0) ye0).x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7791cF0
    public final YE0 h(C7578aF0 c7578aF0, C8115fH0 c8115fH0, long j10) {
        InterfaceC9430rh0 interfaceC9430rh0Zza = this.f68686h.zza();
        Pu0 pu0 = this.f68693o;
        if (pu0 != null) {
            interfaceC9430rh0Zza.d(pu0);
        }
        C8623k5 c8623k5 = k().f68216b;
        c8623k5.getClass();
        Uri uri = c8623k5.f76414a;
        GF0 gf0 = this.f68695q;
        p();
        return new EF0(uri, interfaceC9430rh0Zza, new BE0(gf0.f67988a), this.f68687i, q(c7578aF0), this.f68696r, s(c7578aF0), this, c8115fH0, null, this.f68688j, false, OV.K(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10246zE0
    protected final void w(Pu0 pu0) {
        this.f68693o = pu0;
        Looper.myLooper().getClass();
        p();
        A();
    }

    /* synthetic */ JF0(H7 h72, InterfaceC7225Qg0 interfaceC7225Qg0, GF0 gf0, BD0 bd0, C8541jH0 c8541jH0, int i10, boolean z10, InterfaceC7425Wf0 interfaceC7425Wf0, IF0 if0) {
        this.f68694p = h72;
        this.f68686h = interfaceC7225Qg0;
        this.f68695q = gf0;
        this.f68687i = bd0;
        this.f68696r = c8541jH0;
        this.f68688j = i10;
    }

    @Override // com.google.android.gms.internal.ads.AF0
    public final void c(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f68690l;
        }
        if (!this.f68689k && this.f68690l == j10 && this.f68691m == z10 && this.f68692n == z11) {
            return;
        }
        this.f68690l = j10;
        this.f68691m = z10;
        this.f68692n = z11;
        this.f68689k = false;
        A();
    }
}
