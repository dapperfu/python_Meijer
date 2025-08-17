package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class M1 implements InterfaceC11077u1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11083w1 f84394a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84395b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f84396c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84397d;

    final String a() {
        return this.f84395b;
    }

    final Object[] b() {
        return this.f84396c;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11077u1
    public final int zza() {
        return (this.f84397d & 1) == 1 ? K1.f84388a : K1.f84389b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11077u1
    public final boolean zzb() {
        return (this.f84397d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11077u1
    public final InterfaceC11083w1 zzc() {
        return this.f84394a;
    }

    M1(InterfaceC11083w1 interfaceC11083w1, String str, Object[] objArr) {
        this.f84394a = interfaceC11083w1;
        this.f84395b = str;
        this.f84396c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f84397d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f84397d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
