package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8597l1 implements InterfaceC8064g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f75734a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75735b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75736c;

    private C8597l1(int i10, int i11, int i12, int i13) {
        this.f75734a = i10;
        this.f75735b = i11;
        this.f75736c = i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8064g1
    public final int zza() {
        return 1751742049;
    }

    public static C8597l1 a(GQ gq2) {
        int iY = gq2.y();
        gq2.m(8);
        int iY2 = gq2.y();
        int iY3 = gq2.y();
        gq2.m(4);
        int iY4 = gq2.y();
        gq2.m(12);
        return new C8597l1(iY, iY2, iY3, iY4);
    }
}
