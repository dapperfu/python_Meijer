package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f82156a;

    /* renamed from: b, reason: collision with root package name */
    private int f82157b = 0;

    Z0(String str) {
        this.f82156a = str;
    }

    final boolean a() {
        return this.f82157b < this.f82156a.length();
    }

    final int b() {
        String str = this.f82156a;
        int i10 = this.f82157b;
        this.f82157b = i10 + 1;
        char cCharAt = str.charAt(i10);
        if (cCharAt < 55296) {
            return cCharAt;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        while (true) {
            String str2 = this.f82156a;
            int i13 = this.f82157b;
            this.f82157b = i13 + 1;
            char cCharAt2 = str2.charAt(i13);
            if (cCharAt2 < 55296) {
                return i11 | (cCharAt2 << i12);
            }
            i11 |= (cCharAt2 & 8191) << i12;
            i12 += 13;
        }
    }
}
