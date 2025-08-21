package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class RE0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7578aF0 f70646a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70647b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7791cF0 f70648c;

    /* renamed from: d, reason: collision with root package name */
    private YE0 f70649d;

    /* renamed from: e, reason: collision with root package name */
    private XE0 f70650e;

    /* renamed from: f, reason: collision with root package name */
    private long f70651f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private final C8115fH0 f70652g;

    public RE0(C7578aF0 c7578aF0, C8115fH0 c8115fH0, long j10) {
        this.f70646a = c7578aF0;
        this.f70652g = c8115fH0;
        this.f70647b = j10;
    }

    private final long p(long j10) {
        long j11 = this.f70651f;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long e() {
        return this.f70651f;
    }

    public final long h() {
        return this.f70647b;
    }

    public final void j(long j10) {
        this.f70651f = j10;
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        XE0 xe0 = this.f70650e;
        int i10 = OV.f69931a;
        xe0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        ye0.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        YE0 ye0 = this.f70649d;
        return ye0 != null && ye0.c(c7994eA0);
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f70650e;
        int i10 = OV.f69931a;
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long f(long j10) {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.f(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long g(long j10, LA0 la0) {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.g(j10, la0);
    }

    public final void i(C7578aF0 c7578aF0) {
        long jP = p(this.f70647b);
        InterfaceC7791cF0 interfaceC7791cF0 = this.f70648c;
        interfaceC7791cF0.getClass();
        YE0 ye0H = interfaceC7791cF0.h(c7578aF0, this.f70652g, jP);
        this.f70649d = ye0H;
        if (this.f70650e != null) {
            ye0H.o(this, jP);
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        ye0.k(j10, false);
    }

    public final void l() {
        YE0 ye0 = this.f70649d;
        if (ye0 != null) {
            InterfaceC7791cF0 interfaceC7791cF0 = this.f70648c;
            interfaceC7791cF0.getClass();
            interfaceC7791cF0.a(ye0);
        }
    }

    public final void m(InterfaceC7791cF0 interfaceC7791cF0) {
        C8211gC.f(this.f70648c == null);
        this.f70648c = interfaceC7791cF0;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long n(PG0[] pg0Arr, boolean[] zArr, SF0[] sf0Arr, boolean[] zArr2, long j10) {
        long j11 = this.f70651f;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f70647b) ? j10 : j11;
        this.f70651f = -9223372036854775807L;
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.n(pg0Arr, zArr, sf0Arr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f70650e = xe0;
        YE0 ye0 = this.f70649d;
        if (ye0 != null) {
            ye0.o(this, p(this.f70647b));
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.zzd();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7900dG0 zzh() {
        YE0 ye0 = this.f70649d;
        int i10 = OV.f69931a;
        return ye0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        YE0 ye0 = this.f70649d;
        if (ye0 != null) {
            ye0.zzk();
            return;
        }
        InterfaceC7791cF0 interfaceC7791cF0 = this.f70648c;
        if (interfaceC7791cF0 != null) {
            interfaceC7791cF0.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        YE0 ye0 = this.f70649d;
        return ye0 != null && ye0.zzp();
    }
}
