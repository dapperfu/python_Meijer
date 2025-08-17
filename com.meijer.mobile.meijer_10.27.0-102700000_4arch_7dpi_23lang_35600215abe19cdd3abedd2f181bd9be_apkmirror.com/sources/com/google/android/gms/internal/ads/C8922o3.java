package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8922o3 implements InterfaceC8601l3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f77291a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77292b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f77293c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zza() {
        return this.f77291a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zzb() {
        return this.f77292b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zzc() {
        int i10 = this.f77291a;
        return i10 == -1 ? this.f77293c.F() : i10;
    }

    public C8922o3(VY vy, C c10) {
        GQ gq2 = vy.f70886b;
        this.f77293c = gq2;
        gq2.l(12);
        int iF = gq2.F();
        if ("audio/raw".equals(c10.f65664o)) {
            int iC = OV.C(c10.f65643F) * c10.f65641D;
            if (iF == 0 || iF % iC != 0) {
                C9917xL.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iC + ", stsz sample size: " + iF);
                iF = iC;
            }
        }
        this.f77291a = iF == 0 ? -1 : iF;
        this.f77292b = gq2.F();
    }
}
