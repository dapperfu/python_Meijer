package Gg;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class a implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f11377c = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private int[] f11378a;

    /* renamed from: b, reason: collision with root package name */
    private int f11379b;

    public a() {
        this.f11379b = 0;
        this.f11378a = f11377c;
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
        if (i10 > this.f11378a.length * 32) {
            int[] iArrO = o((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f11378a;
            System.arraycopy(iArr, 0, iArrO, 0, iArr.length);
            this.f11378a = iArrO;
        }
    }

    private static int[] o(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        f(this.f11379b + 1);
        if (z10) {
            int[] iArr = this.f11378a;
            int i10 = this.f11379b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f11379b++;
    }

    public void b(a aVar) {
        int i10 = aVar.f11379b;
        f(this.f11379b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.g(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f11379b;
        f(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f11378a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f11379b = i12;
    }

    public void d() {
        int length = this.f11378a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f11378a[i10] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f11378a.clone(), this.f11379b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11379b == aVar.f11379b && Arrays.equals(this.f11378a, aVar.f11378a);
    }

    public boolean g(int i10) {
        return ((1 << (i10 & 31)) & this.f11378a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f11379b * 31) + Arrays.hashCode(this.f11378a);
    }

    public int[] i() {
        return this.f11378a;
    }

    public int j(int i10) {
        int i11 = this.f11379b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f11378a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f11378a;
            if (i12 == iArr.length) {
                return this.f11379b;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f11379b);
    }

    public int k(int i10) {
        int i11 = this.f11379b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f11378a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f11378a;
            if (i12 == iArr.length) {
                return this.f11379b;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f11379b);
    }

    public int l() {
        return this.f11379b;
    }

    public int m() {
        return (this.f11379b + 7) / 8;
    }

    public boolean n(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f11379b) {
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
            int i17 = this.f11378a[i15] & i16;
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
        int[] iArr = new int[this.f11378a.length];
        int i10 = (this.f11379b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f11378a[i12]);
        }
        int i13 = this.f11379b;
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
        this.f11378a = iArr;
    }

    public void q(int i10) {
        int[] iArr = this.f11378a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void r(int i10, int i11) {
        this.f11378a[i10 / 32] = i11;
    }

    public void t(a aVar) {
        if (this.f11379b != aVar.f11379b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f11378a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f11378a[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f11379b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f11379b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(g(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int i10) {
        this.f11379b = i10;
        this.f11378a = o(i10);
    }

    a(int[] iArr, int i10) {
        this.f11378a = iArr;
        this.f11379b = i10;
    }
}
