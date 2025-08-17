package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Av0 implements InterfaceC8799mv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9120pv0 f65362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65363b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f65364c;

    /* renamed from: d, reason: collision with root package name */
    private final int f65365d;

    final String a() {
        return this.f65363b;
    }

    final Object[] b() {
        return this.f65364c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8799mv0
    public final InterfaceC9120pv0 zza() {
        return this.f65362a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8799mv0
    public final boolean zzb() {
        return (this.f65365d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8799mv0
    public final int zzc() {
        int i10 = this.f65365d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    Av0(InterfaceC9120pv0 interfaceC9120pv0, String str, Object[] objArr) {
        this.f65362a = interfaceC9120pv0;
        this.f65363b = str;
        this.f65364c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f65365d = cCharAt;
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
                this.f65365d = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
