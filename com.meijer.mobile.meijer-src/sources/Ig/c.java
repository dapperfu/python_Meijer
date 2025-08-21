package Ig;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14483a;

    /* renamed from: b, reason: collision with root package name */
    private int f14484b;

    /* renamed from: c, reason: collision with root package name */
    private int f14485c;

    public int d(int i10) {
        if (i10 < 1 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f14485c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int iMin = Math.min(i10, i13);
            int i14 = i13 - iMin;
            int i15 = (l3.f93323c >> (8 - iMin)) << i14;
            byte[] bArr = this.f14483a;
            int i16 = this.f14484b;
            int i17 = (i15 & bArr[i16]) >> i14;
            i10 -= iMin;
            int i18 = this.f14485c + iMin;
            this.f14485c = i18;
            if (i18 == 8) {
                this.f14485c = 0;
                this.f14484b = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i19 = i12 << 8;
                byte[] bArr2 = this.f14483a;
                int i20 = this.f14484b;
                i12 = (bArr2[i20] & 255) | i19;
                this.f14484b = i20 + 1;
                i10 -= 8;
            }
            if (i10 > 0) {
                int i21 = 8 - i10;
                int i22 = ((((l3.f93323c >> i21) << i21) & this.f14483a[this.f14484b]) >> i21) | (i12 << i10);
                this.f14485c += i10;
                return i22;
            }
        }
        return i12;
    }

    public int a() {
        return ((this.f14483a.length - this.f14484b) * 8) - this.f14485c;
    }

    public int b() {
        return this.f14485c;
    }

    public int c() {
        return this.f14484b;
    }

    public c(byte[] bArr) {
        this.f14483a = bArr;
    }
}
