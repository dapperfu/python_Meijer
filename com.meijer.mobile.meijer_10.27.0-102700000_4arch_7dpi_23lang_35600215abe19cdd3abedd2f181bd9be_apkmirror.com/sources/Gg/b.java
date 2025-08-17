package Gg;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f11380a;

    /* renamed from: b, reason: collision with root package name */
    private int f11381b;

    /* renamed from: c, reason: collision with root package name */
    private int f11382c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f11383d;

    public b(int i10) {
        this(i10, i10);
    }

    public int[] l() {
        int[] iArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f11383d;
            if (i11 >= iArr.length || iArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == iArr.length) {
            return null;
        }
        int i12 = this.f11382c;
        int i13 = i11 / i12;
        int i14 = (i11 % i12) * 32;
        while ((iArr[i11] << (31 - i10)) == 0) {
            i10++;
        }
        return new int[]{i14 + i10, i13};
    }

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f11380a = i10;
        this.f11381b = i11;
        int i12 = (i10 + 31) / 32;
        this.f11382c = i12;
        this.f11383d = new int[i12 * i11];
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f11381b * (this.f11380a + 1));
        for (int i10 = 0; i10 < this.f11381b; i10++) {
            for (int i11 = 0; i11 < this.f11380a; i11++) {
                sb2.append(f(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.f11383d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f11383d[i10] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f11380a, this.f11381b, this.f11382c, (int[]) this.f11383d.clone());
    }

    public void d() {
        int length = this.f11383d.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f11383d;
            iArr[i10] = ~iArr[i10];
        }
    }

    public void e(int i10, int i11) {
        int i12 = (i11 * this.f11382c) + (i10 / 32);
        int[] iArr = this.f11383d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11380a == bVar.f11380a && this.f11381b == bVar.f11381b && this.f11382c == bVar.f11382c && Arrays.equals(this.f11383d, bVar.f11383d);
    }

    public boolean f(int i10, int i11) {
        return ((this.f11383d[(i11 * this.f11382c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] g() {
        int length = this.f11383d.length - 1;
        while (length >= 0 && this.f11383d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f11382c;
        int i11 = length / i10;
        int i12 = (length % i10) * 32;
        int i13 = 31;
        while ((this.f11383d[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int hashCode() {
        int i10 = this.f11380a;
        return (((((((i10 * 31) + i10) * 31) + this.f11381b) * 31) + this.f11382c) * 31) + Arrays.hashCode(this.f11383d);
    }

    public int[] i() {
        int i10 = this.f11380a;
        int i11 = this.f11381b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f11381b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f11382c;
                if (i15 < i16) {
                    int i17 = this.f11383d[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 * 32;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    public int j() {
        return this.f11381b;
    }

    public a k(int i10, a aVar) {
        if (aVar == null || aVar.l() < this.f11380a) {
            aVar = new a(this.f11380a);
        } else {
            aVar.d();
        }
        int i11 = i10 * this.f11382c;
        for (int i12 = 0; i12 < this.f11382c; i12++) {
            aVar.r(i12 * 32, this.f11383d[i11 + i12]);
        }
        return aVar;
    }

    public int m() {
        return this.f11380a;
    }

    public void n(int i10) {
        int i11 = i10 % 360;
        if (i11 != 0) {
            if (i11 == 90) {
                p();
                return;
            }
            if (i11 == 180) {
                o();
            } else {
                if (i11 != 270) {
                    throw new IllegalArgumentException("degrees must be a multiple of 0, 90, 180, or 270");
                }
                p();
                o();
            }
        }
    }

    public void o() {
        a aVar = new a(this.f11380a);
        a aVar2 = new a(this.f11380a);
        int i10 = (this.f11381b + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = k(i11, aVar);
            int i12 = (this.f11381b - 1) - i11;
            aVar2 = k(i12, aVar2);
            aVar.p();
            aVar2.p();
            s(i11, aVar2);
            s(i12, aVar);
        }
    }

    public void p() {
        int i10 = this.f11381b;
        int i11 = this.f11380a;
        int i12 = (i10 + 31) / 32;
        int[] iArr = new int[i12 * i11];
        for (int i13 = 0; i13 < this.f11381b; i13++) {
            for (int i14 = 0; i14 < this.f11380a; i14++) {
                if (((this.f11383d[(this.f11382c * i13) + (i14 / 32)] >>> (i14 & 31)) & 1) != 0) {
                    int i15 = (((i11 - 1) - i14) * i12) + (i13 / 32);
                    iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
                }
            }
        }
        this.f11380a = i10;
        this.f11381b = i11;
        this.f11382c = i12;
        this.f11383d = iArr;
    }

    public void q(int i10, int i11) {
        int i12 = (i11 * this.f11382c) + (i10 / 32);
        int[] iArr = this.f11383d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void r(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f11381b || i14 > this.f11380a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f11382c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f11383d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public String t(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return t("X ", "  ");
    }

    public void s(int i10, a aVar) {
        int[] iArrI = aVar.i();
        int[] iArr = this.f11383d;
        int i11 = this.f11382c;
        System.arraycopy(iArrI, 0, iArr, i10 * i11, i11);
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f11380a = i10;
        this.f11381b = i11;
        this.f11382c = i12;
        this.f11383d = iArr;
    }
}
