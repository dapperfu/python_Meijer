package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class RE0 implements YE0, XE0 {

    /* renamed from: a, reason: collision with root package name */
    public final C7453aF0 f69806a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69807b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7666cF0 f69808c;

    /* renamed from: d, reason: collision with root package name */
    private YE0 f69809d;

    /* renamed from: e, reason: collision with root package name */
    private XE0 f69810e;

    /* renamed from: f, reason: collision with root package name */
    private long f69811f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private final C7990fH0 f69812g;

    public RE0(C7453aF0 c7453aF0, C7990fH0 c7990fH0, long j10) {
        this.f69806a = c7453aF0;
        this.f69812g = c7990fH0;
        this.f69807b = j10;
    }

    private final long p(long j10) {
        long j11 = this.f69811f;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public final long e() {
        return this.f69811f;
    }

    public final long h() {
        return this.f69807b;
    }

    public final void j(long j10) {
        this.f69811f = j10;
    }

    @Override // com.google.android.gms.internal.ads.XE0
    public final void a(YE0 ye0) {
        XE0 xe0 = this.f69810e;
        int i10 = OV.f69091a;
        xe0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        ye0.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7869eA0 c7869eA0) {
        YE0 ye0 = this.f69809d;
        return ye0 != null && ye0.c(c7869eA0);
    }

    @Override // com.google.android.gms.internal.ads.TF0
    public final /* bridge */ /* synthetic */ void d(VF0 vf0) {
        XE0 xe0 = this.f69810e;
        int i10 = OV.f69091a;
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long f(long j10) {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.f(j10);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long g(long j10, LA0 la0) {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.g(j10, la0);
    }

    public final void i(C7453aF0 c7453aF0) {
        long jP = p(this.f69807b);
        InterfaceC7666cF0 interfaceC7666cF0 = this.f69808c;
        interfaceC7666cF0.getClass();
        YE0 ye0H = interfaceC7666cF0.h(c7453aF0, this.f69812g, jP);
        this.f69809d = ye0H;
        if (this.f69810e != null) {
            ye0H.o(this, jP);
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        ye0.k(j10, false);
    }

    public final void l() {
        YE0 ye0 = this.f69809d;
        if (ye0 != null) {
            InterfaceC7666cF0 interfaceC7666cF0 = this.f69808c;
            interfaceC7666cF0.getClass();
            interfaceC7666cF0.a(ye0);
        }
    }

    public final void m(InterfaceC7666cF0 interfaceC7666cF0) {
        C8086gC.f(this.f69808c == null);
        this.f69808c = interfaceC7666cF0;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long n(PG0[] pg0Arr, boolean[] zArr, SF0[] sf0Arr, boolean[] zArr2, long j10) {
        long j11 = this.f69811f;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f69807b) ? j10 : j11;
        this.f69811f = -9223372036854775807L;
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.n(pg0Arr, zArr, sf0Arr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f69810e = xe0;
        YE0 ye0 = this.f69809d;
        if (ye0 != null) {
            ye0.o(this, p(this.f69807b));
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.zzd();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7775dG0 zzh() {
        YE0 ye0 = this.f69809d;
        int i10 = OV.f69091a;
        return ye0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        YE0 ye0 = this.f69809d;
        if (ye0 != null) {
            ye0.zzk();
            return;
        }
        InterfaceC7666cF0 interfaceC7666cF0 = this.f69808c;
        if (interfaceC7666cF0 != null) {
            interfaceC7666cF0.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        YE0 ye0 = this.f69809d;
        return ye0 != null && ye0.zzp();
    }
}
