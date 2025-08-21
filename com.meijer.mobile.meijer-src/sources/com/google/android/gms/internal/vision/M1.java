package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class M1 implements InterfaceC11202u1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11208w1 f85234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85235b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f85236c;

    /* renamed from: d, reason: collision with root package name */
    private final int f85237d;

    final String a() {
        return this.f85235b;
    }

    final Object[] b() {
        return this.f85236c;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11202u1
    public final int zza() {
        return (this.f85237d & 1) == 1 ? K1.f85228a : K1.f85229b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11202u1
    public final boolean zzb() {
        return (this.f85237d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11202u1
    public final InterfaceC11208w1 zzc() {
        return this.f85234a;
    }

    M1(InterfaceC11208w1 interfaceC11208w1, String str, Object[] objArr) {
        this.f85234a = interfaceC11208w1;
        this.f85235b = str;
        this.f85236c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f85237d = cCharAt;
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
                this.f85237d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
