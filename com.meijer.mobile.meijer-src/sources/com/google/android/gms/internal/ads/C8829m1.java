package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8829m1 implements InterfaceC8189g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f77532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77534c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77536e;

    private C8829m1(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f77532a = i10;
        this.f77533b = i12;
        this.f77534c = i13;
        this.f77535d = i14;
        this.f77536e = i15;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8189g1
    public final int zza() {
        return 1752331379;
    }

    public static C8829m1 a(GQ gq2) {
        int iY = gq2.y();
        gq2.m(12);
        int iY2 = gq2.y();
        int iY3 = gq2.y();
        int iY4 = gq2.y();
        gq2.m(4);
        int iY5 = gq2.y();
        int iY6 = gq2.y();
        gq2.m(8);
        return new C8829m1(iY, iY2, iY3, iY4, iY5, iY6);
    }
}
