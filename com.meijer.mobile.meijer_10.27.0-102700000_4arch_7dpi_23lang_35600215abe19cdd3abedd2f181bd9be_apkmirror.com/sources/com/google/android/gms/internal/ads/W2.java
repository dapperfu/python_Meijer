package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class W2 extends C7848e0 implements InterfaceC7535b3 {

    /* renamed from: g, reason: collision with root package name */
    private final long f70987g;

    /* renamed from: h, reason: collision with root package name */
    private final int f70988h;

    /* renamed from: i, reason: collision with root package name */
    private final int f70989i;

    /* renamed from: j, reason: collision with root package name */
    private final long f70990j;

    public W2(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, false);
        this.f70987g = j11;
        this.f70988h = i10;
        this.f70989i = i11;
        this.f70990j = j10 != -1 ? j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final int zzc() {
        return this.f70988h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long zzd() {
        return this.f70990j;
    }

    public final W2 c(long j10) {
        return new W2(j10, this.f70987g, this.f70988h, this.f70989i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long f(long j10) {
        return a(j10);
    }
}
