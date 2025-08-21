package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class W2 extends C7973e0 implements InterfaceC7660b3 {

    /* renamed from: g, reason: collision with root package name */
    private final long f71827g;

    /* renamed from: h, reason: collision with root package name */
    private final int f71828h;

    /* renamed from: i, reason: collision with root package name */
    private final int f71829i;

    /* renamed from: j, reason: collision with root package name */
    private final long f71830j;

    public W2(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, false);
        this.f71827g = j11;
        this.f71828h = i10;
        this.f71829i = i11;
        this.f71830j = j10 != -1 ? j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final int zzc() {
        return this.f71828h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final long zzd() {
        return this.f71830j;
    }

    public final W2 c(long j10) {
        return new W2(j10, this.f71827g, this.f71828h, this.f71829i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final long f(long j10) {
        return a(j10);
    }
}
