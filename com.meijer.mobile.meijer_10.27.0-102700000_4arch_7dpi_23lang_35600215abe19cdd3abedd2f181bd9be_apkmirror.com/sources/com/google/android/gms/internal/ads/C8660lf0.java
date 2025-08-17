package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8660lf0 extends AbstractC8553kf0 {

    /* renamed from: a, reason: collision with root package name */
    private final char f76613a;

    C8660lf0(char c10) {
        this.f76613a = c10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8981of0
    public final boolean a(char c10) {
        return c10 == this.f76613a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.f76613a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
