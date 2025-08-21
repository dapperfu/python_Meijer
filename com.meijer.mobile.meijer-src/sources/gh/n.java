package gh;

import android.graphics.Rect;

/* loaded from: classes8.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f134224a;

    /* renamed from: b, reason: collision with root package name */
    private int f134225b;

    /* renamed from: c, reason: collision with root package name */
    private int f134226c;

    public static byte[] e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i10) + i14];
                i13--;
            }
        }
        return bArr2;
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i10 * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i10) + i13];
                i12++;
            }
        }
        return bArr2;
    }

    public byte[] b() {
        return this.f134224a;
    }

    public int c() {
        return this.f134226c;
    }

    public int d() {
        return this.f134225b;
    }

    public n h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new n(f(this.f134224a, this.f134225b, this.f134226c), this.f134226c, this.f134225b) : new n(e(this.f134224a, this.f134225b, this.f134226c), this.f134225b, this.f134226c) : new n(g(this.f134224a, this.f134225b, this.f134226c), this.f134226c, this.f134225b);
    }

    public n(byte[] bArr, int i10, int i11) {
        this.f134224a = bArr;
        this.f134225b = i10;
        this.f134226c = i11;
    }

    public n a(Rect rect, int i10) {
        int iWidth = rect.width() / i10;
        int iHeight = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[iWidth * iHeight];
        if (i10 == 1) {
            int i12 = (i11 * this.f134225b) + rect.left;
            for (int i13 = 0; i13 < iHeight; i13++) {
                System.arraycopy(this.f134224a, i12, bArr, i13 * iWidth, iWidth);
                i12 += this.f134225b;
            }
        } else {
            int i14 = (i11 * this.f134225b) + rect.left;
            for (int i15 = 0; i15 < iHeight; i15++) {
                int i16 = i15 * iWidth;
                int i17 = i14;
                for (int i18 = 0; i18 < iWidth; i18++) {
                    bArr[i16] = this.f134224a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f134225b * i10;
            }
        }
        return new n(bArr, iWidth, iHeight);
    }
}
