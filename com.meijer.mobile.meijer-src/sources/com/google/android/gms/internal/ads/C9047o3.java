package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9047o3 implements InterfaceC8726l3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f78131a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78132b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f78133c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zza() {
        return this.f78131a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zzb() {
        return this.f78132b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8726l3
    public final int zzc() {
        int i10 = this.f78131a;
        return i10 == -1 ? this.f78133c.F() : i10;
    }

    public C9047o3(VY vy, C c10) {
        GQ gq2 = vy.f71726b;
        this.f78133c = gq2;
        gq2.l(12);
        int iF = gq2.F();
        if ("audio/raw".equals(c10.f66504o)) {
            int iC = OV.C(c10.f66483F) * c10.f66481D;
            if (iF == 0 || iF % iC != 0) {
                C10042xL.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iC + ", stsz sample size: " + iF);
                iF = iC;
            }
        }
        this.f78131a = iF == 0 ? -1 : iF;
        this.f78132b = gq2.F();
    }
}
