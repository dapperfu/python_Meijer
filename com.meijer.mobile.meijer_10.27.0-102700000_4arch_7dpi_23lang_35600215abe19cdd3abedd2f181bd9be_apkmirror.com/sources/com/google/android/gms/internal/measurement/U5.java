package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class U5 implements H5 {

    /* renamed from: a, reason: collision with root package name */
    private final K5 f82008a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82009b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f82010c;

    /* renamed from: d, reason: collision with root package name */
    private final int f82011d;

    final String a() {
        return this.f82009b;
    }

    final Object[] b() {
        return this.f82010c;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final boolean zza() {
        return (this.f82011d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final K5 zzb() {
        return this.f82008a;
    }

    @Override // com.google.android.gms.internal.measurement.H5
    public final int zzc() {
        int i10 = this.f82011d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    U5(K5 k52, String str, Object[] objArr) {
        this.f82008a = k52;
        this.f82009b = str;
        this.f82010c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f82011d = cCharAt;
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
                this.f82011d = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
