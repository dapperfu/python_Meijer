package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9029p3 implements InterfaceC8601l3 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f77473a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77474b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77475c;

    /* renamed from: d, reason: collision with root package name */
    private int f77476d;

    /* renamed from: e, reason: collision with root package name */
    private int f77477e;

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zzb() {
        return this.f77474b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8601l3
    public final int zzc() {
        int i10 = this.f77475c;
        if (i10 == 8) {
            return this.f77473a.C();
        }
        if (i10 == 16) {
            return this.f77473a.G();
        }
        int i11 = this.f77476d;
        this.f77476d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f77477e & 15;
        }
        int iC = this.f77473a.C();
        this.f77477e = iC;
        return (iC & 240) >> 4;
    }

    public C9029p3(VY vy) {
        GQ gq2 = vy.f70886b;
        this.f77473a = gq2;
        gq2.l(12);
        this.f77475c = gq2.F() & com.medallia.digital.mobilesdk.l3.f92484c;
        this.f77474b = gq2.F();
    }
}
