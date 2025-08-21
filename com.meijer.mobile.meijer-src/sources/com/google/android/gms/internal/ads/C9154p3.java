package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9154p3 implements InterfaceC8726l3 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f78313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78314b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78315c;

    /* renamed from: d, reason: collision with root package name */
    private int f78316d;

    /* renamed from: e, reason: collision with root package name */
    private int f78317e;

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zzb() {
        return this.f78314b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zzc() {
        int i10 = this.f78315c;
        if (i10 == 8) {
            return this.f78313a.C();
        }
        if (i10 == 16) {
            return this.f78313a.G();
        }
        int i11 = this.f78316d;
        this.f78316d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f78317e & 15;
        }
        int iC = this.f78313a.C();
        this.f78317e = iC;
        return (iC & 240) >> 4;
    }

    public C9154p3(VY vy) {
        GQ gq2 = vy.f71726b;
        this.f78313a = gq2;
        gq2.l(12);
        this.f78315c = gq2.F() & com.medallia.digital.mobilesdk.l3.f93323c;
        this.f78314b = gq2.F();
    }
}
