package Ig;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class a implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f14476c = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private int[] f14477a;

    /* renamed from: b, reason: collision with root package name */
    private int f14478b;

    public a() {
        this.f14478b = 0;
        this.f14477a = f14476c;
    }

    public void s(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (g(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    private void f(int i10) {
        if (i10 > this.f14477a.length * 32) {
            int[] iArrO = o((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f14477a;
            System.arraycopy(iArr, 0, iArrO, 0, iArr.length);
            this.f14477a = iArrO;
        }
    }

    private static int[] o(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        f(this.f14478b + 1);
        if (z10) {
            int[] iArr = this.f14477a;
            int i10 = this.f14478b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f14478b++;
    }

    public void b(a aVar) {
        int i10 = aVar.f14478b;
        f(this.f14478b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.g(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f14478b;
        f(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f14477a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f14478b = i12;
    }

    public void d() {
        int length = this.f14477a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f14477a[i10] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f14477a.clone(), this.f14478b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14478b == aVar.f14478b && Arrays.equals(this.f14477a, aVar.f14477a);
    }

    public boolean g(int i10) {
        return ((1 << (i10 & 31)) & this.f14477a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f14478b * 31) + Arrays.hashCode(this.f14477a);
    }

    public int[] i() {
        return this.f14477a;
    }

    public int j(int i10) {
        int i11 = this.f14478b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f14477a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f14477a;
            if (i12 == iArr.length) {
                return this.f14478b;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f14478b);
    }

    public int k(int i10) {
        int i11 = this.f14478b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f14477a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f14477a;
            if (i12 == iArr.length) {
                return this.f14478b;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f14478b);
    }

    public int l() {
        return this.f14478b;
    }

    public int m() {
        return (this.f14478b + 7) / 8;
    }

    public boolean n(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f14478b) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f14477a[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    public void p() {
        int[] iArr = new int[this.f14477a.length];
        int i10 = (this.f14478b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f14477a[i12]);
        }
        int i13 = this.f14478b;
        int i14 = i11 * 32;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i10] = i16;
        }
        this.f14477a = iArr;
    }

    public void q(int i10) {
        int[] iArr = this.f14477a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void r(int i10, int i11) {
        this.f14477a[i10 / 32] = i11;
    }

    public void t(a aVar) {
        if (this.f14478b != aVar.f14478b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14477a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f14477a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f14478b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f14478b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(g(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int i10) {
        this.f14478b = i10;
        this.f14477a = o(i10);
    }

    a(int[] iArr, int i10) {
        this.f14477a = iArr;
        this.f14478b = i10;
    }
}
