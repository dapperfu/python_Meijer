package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f72796a;

    /* renamed from: b, reason: collision with root package name */
    private final int f72797b;

    /* renamed from: c, reason: collision with root package name */
    private int f72798c;

    /* renamed from: d, reason: collision with root package name */
    private int f72799d;

    public final int a() {
        return (this.f72798c * 8) + this.f72799d;
    }

    public final int b(int i10) {
        int i11 = this.f72798c;
        int i12 = 8 - this.f72799d;
        int i13 = i11 + 1;
        byte[] bArr = this.f72796a;
        int iMin = Math.min(i10, i12);
        int i14 = ((bArr[i11] & 255) >> this.f72799d) & (com.medallia.digital.mobilesdk.l3.f93323c >> (8 - iMin));
        while (iMin < i10) {
            i14 |= (this.f72796a[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        c(i10);
        return i15;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f72798c + i12;
        this.f72798c = i13;
        int i14 = this.f72799d + (i10 - (i12 * 8));
        this.f72799d = i14;
        if (i14 > 7) {
            i13++;
            this.f72798c = i13;
            i14 -= 8;
            this.f72799d = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f72797b) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        C8211gC.f(z10);
    }

    public final boolean d() {
        int i10 = (this.f72796a[this.f72798c] & 255) >> this.f72799d;
        c(1);
        return 1 == (i10 & 1);
    }

    public Z0(byte[] bArr) {
        this.f72796a = bArr;
        this.f72797b = bArr.length;
    }
}
