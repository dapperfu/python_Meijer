package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10273y1 implements InterfaceC10238m1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10247p1 f81082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81083b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f81084c;

    /* renamed from: d, reason: collision with root package name */
    private final int f81085d;

    final String a() {
        return this.f81083b;
    }

    final Object[] b() {
        return this.f81084c;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10238m1
    public final InterfaceC10247p1 zza() {
        return this.f81082a;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10238m1
    public final boolean zzb() {
        return (this.f81085d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10238m1
    public final int zzc() {
        return (this.f81085d & 1) == 1 ? 1 : 2;
    }

    C10273y1(InterfaceC10247p1 interfaceC10247p1, String str, Object[] objArr) {
        this.f81082a = interfaceC10247p1;
        this.f81083b = str;
        this.f81084c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f81085d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.f81085d = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
