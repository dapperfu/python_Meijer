package d3;

import com.medallia.digital.mobilesdk.l3;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f127860a;

    /* renamed from: b, reason: collision with root package name */
    private int f127861b;

    /* renamed from: c, reason: collision with root package name */
    private int f127862c;

    /* renamed from: d, reason: collision with root package name */
    private int f127863d;

    public C() {
        this.f127860a = P.f127893f;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f127862c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f127862c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f127862c = i13;
            byte[] bArr = this.f127860a;
            int i14 = this.f127861b;
            this.f127861b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f127860a;
        int i15 = this.f127861b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f127862c = 0;
            this.f127861b = i15 + 1;
        }
        a();
        return i16;
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    private void a() {
        int i10;
        int i11 = this.f127861b;
        C13599a.g(i11 >= 0 && (i11 < (i10 = this.f127863d) || (i11 == i10 && this.f127862c == 0)));
    }

    public int b() {
        return ((this.f127863d - this.f127861b) * 8) - this.f127862c;
    }

    public void c() {
        if (this.f127862c == 0) {
            return;
        }
        this.f127862c = 0;
        this.f127861b++;
        a();
    }

    public int d() {
        C13599a.g(this.f127862c == 0);
        return this.f127861b;
    }

    public int e() {
        return (this.f127861b * 8) + this.f127862c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f127862c, i11);
        int i12 = this.f127862c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f127860a;
        int i14 = this.f127861b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f127860a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f127860a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f127860a[this.f127861b] & (128 >> this.f127862c)) != 0;
        q();
        return z10;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f127860a;
            int i13 = this.f127861b;
            int i14 = i13 + 1;
            this.f127861b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f127862c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (l3.f93323c >> i16));
        bArr[i12] = b12;
        int i17 = this.f127862c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f127860a;
            int i18 = this.f127861b;
            this.f127861b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f127862c = i17 - 8;
        }
        int i19 = this.f127862c + i16;
        this.f127862c = i19;
        byte[] bArr4 = this.f127860a;
        int i20 = this.f127861b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f127862c = 0;
            this.f127861b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? P.i1(h(i10)) : P.h1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        C13599a.g(this.f127862c == 0);
        System.arraycopy(this.f127860a, this.f127861b, bArr, i10, i11);
        this.f127861b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void o(byte[] bArr, int i10) {
        this.f127860a = bArr;
        this.f127861b = 0;
        this.f127862c = 0;
        this.f127863d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f127861b = i11;
        this.f127862c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f127862c + 1;
        this.f127862c = i10;
        if (i10 == 8) {
            this.f127862c = 0;
            this.f127861b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f127861b + i11;
        this.f127861b = i12;
        int i13 = this.f127862c + (i10 - (i11 * 8));
        this.f127862c = i13;
        if (i13 > 7) {
            this.f127861b = i12 + 1;
            this.f127862c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        C13599a.g(this.f127862c == 0);
        this.f127861b += i10;
        a();
    }

    public C(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void m(D d10) {
        o(d10.e(), d10.g());
        p(d10.f() * 8);
    }

    public C(byte[] bArr, int i10) {
        this.f127860a = bArr;
        this.f127863d = i10;
    }
}
