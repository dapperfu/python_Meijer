package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class JF0 extends AbstractC10121zE0 implements AF0 {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC7100Qg0 f67846h;

    /* renamed from: i, reason: collision with root package name */
    private final BD0 f67847i;

    /* renamed from: j, reason: collision with root package name */
    private final int f67848j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f67849k = true;

    /* renamed from: l, reason: collision with root package name */
    private long f67850l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67851m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f67852n;

    /* renamed from: o, reason: collision with root package name */
    private Pu0 f67853o;

    /* renamed from: p, reason: collision with root package name */
    private H7 f67854p;

    /* renamed from: q, reason: collision with root package name */
    private final GF0 f67855q;

    /* renamed from: r, reason: collision with root package name */
    private final C8416jH0 f67856r;

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0, com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final synchronized void b(H7 h72) {
        this.f67854p = h72;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final synchronized H7 k() {
        return this.f67854p;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void y() {
    }

    private final void A() {
        long j10 = this.f67850l;
        boolean z10 = this.f67851m;
        boolean z11 = this.f67852n;
        H7 h7K = k();
        AbstractC7307Wl xf0 = new XF0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, h7K, z11 ? h7K.f67377c : null);
        if (this.f67849k) {
            xf0 = new FF0(this, xf0);
        }
        x(xf0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final void a(YE0 ye0) {
        ((EF0) ye0).x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7666cF0
    public final YE0 h(C7453aF0 c7453aF0, C7990fH0 c7990fH0, long j10) {
        InterfaceC9305rh0 interfaceC9305rh0Zza = this.f67846h.zza();
        Pu0 pu0 = this.f67853o;
        if (pu0 != null) {
            interfaceC9305rh0Zza.d(pu0);
        }
        C8498k5 c8498k5 = k().f67376b;
        c8498k5.getClass();
        Uri uri = c8498k5.f75574a;
        GF0 gf0 = this.f67855q;
        p();
        return new EF0(uri, interfaceC9305rh0Zza, new BE0(gf0.f67148a), this.f67847i, q(c7453aF0), this.f67856r, s(c7453aF0), this, c7990fH0, null, this.f67848j, false, OV.K(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10121zE0
    protected final void w(Pu0 pu0) {
        this.f67853o = pu0;
        Looper.myLooper().getClass();
        p();
        A();
    }

    /* synthetic */ JF0(H7 h72, InterfaceC7100Qg0 interfaceC7100Qg0, GF0 gf0, BD0 bd0, C8416jH0 c8416jH0, int i10, boolean z10, InterfaceC7300Wf0 interfaceC7300Wf0, IF0 if0) {
        this.f67854p = h72;
        this.f67846h = interfaceC7100Qg0;
        this.f67855q = gf0;
        this.f67847i = bd0;
        this.f67856r = c8416jH0;
        this.f67848j = i10;
    }

    @Override // com.google.android.gms.internal.ads.AF0
    public final void c(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f67850l;
        }
        if (!this.f67849k && this.f67850l == j10 && this.f67851m == z10 && this.f67852n == z11) {
            return;
        }
        this.f67850l = j10;
        this.f67851m = z10;
        this.f67852n = z11;
        this.f67849k = false;
        A();
    }
}
