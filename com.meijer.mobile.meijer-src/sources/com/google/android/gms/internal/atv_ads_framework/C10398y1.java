package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10398y1 implements InterfaceC10363m1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10372p1 f81922a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81923b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f81924c;

    /* renamed from: d, reason: collision with root package name */
    private final int f81925d;

    final String a() {
        return this.f81923b;
    }

    final Object[] b() {
        return this.f81924c;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10363m1
    public final InterfaceC10372p1 zza() {
        return this.f81922a;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10363m1
    public final boolean zzb() {
        return (this.f81925d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10363m1
    public final int zzc() {
        return (this.f81925d & 1) == 1 ? 1 : 2;
    }

    C10398y1(InterfaceC10372p1 interfaceC10372p1, String str, Object[] objArr) {
        this.f81922a = interfaceC10372p1;
        this.f81923b = str;
        this.f81924c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f81925d = cCharAt;
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
                this.f81925d = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
