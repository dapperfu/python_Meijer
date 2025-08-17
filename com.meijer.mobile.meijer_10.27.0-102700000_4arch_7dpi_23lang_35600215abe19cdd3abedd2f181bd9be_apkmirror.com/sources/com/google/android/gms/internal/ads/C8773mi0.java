package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8773mi0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f76861a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f76862b;

    /* renamed from: c, reason: collision with root package name */
    final int f76863c;

    /* renamed from: d, reason: collision with root package name */
    final int f76864d;

    /* renamed from: e, reason: collision with root package name */
    final int f76865e;

    /* renamed from: f, reason: collision with root package name */
    final int f76866f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f76867g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f76868h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f76869i;

    /* JADX WARN: Illegal instructions before constructor call */
    C8773mi0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            C6657Df0.g(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            C6657Df0.g(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final C8773mi0 c() {
        boolean z10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = this.f76862b;
            if (i11 >= cArr.length) {
                return this;
            }
            if (C8446jf0.e(cArr[i11])) {
                int i12 = 0;
                while (true) {
                    if (i12 >= cArr.length) {
                        z10 = false;
                        break;
                    }
                    if (C8446jf0.d(cArr[i12])) {
                        z10 = true;
                        break;
                    }
                    i12++;
                }
                C6657Df0.m(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.f76862b.length];
                while (true) {
                    char[] cArr3 = this.f76862b;
                    if (i10 >= cArr3.length) {
                        break;
                    }
                    char c10 = cArr3[i10];
                    if (C8446jf0.e(c10)) {
                        c10 ^= 32;
                    }
                    cArr2[i10] = (char) c10;
                    i10++;
                }
                C8773mi0 c8773mi0 = new C8773mi0(this.f76861a.concat(".lowerCase()"), cArr2);
                if (!this.f76869i || c8773mi0.f76869i) {
                    return c8773mi0;
                }
                byte[] bArr = c8773mi0.f76867g;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i13 = 65; i13 <= 90; i13++) {
                    int i14 = i13 | 32;
                    byte[] bArr2 = c8773mi0.f76867g;
                    byte b10 = bArr2[i13];
                    byte b11 = bArr2[i14];
                    if (b10 == -1) {
                        bArrCopyOf[i13] = b11;
                    } else {
                        char c11 = (char) i13;
                        char c12 = (char) i14;
                        if (b11 != -1) {
                            throw new IllegalStateException(C7267Vf0.b("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c11), Character.valueOf(c12)));
                        }
                        bArrCopyOf[i14] = b10;
                    }
                }
                return new C8773mi0(c8773mi0.f76861a.concat(".ignoreCase()"), c8773mi0.f76862b, bArrCopyOf, true);
            }
            i11++;
        }
    }

    public final String toString() {
        return this.f76861a;
    }

    final char a(int i10) {
        return this.f76862b[i10];
    }

    final int b(char c10) throws zzfzy {
        if (c10 > 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.f76867g[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzfzy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzfzy("Unrecognized character: " + c10);
    }

    final boolean d(int i10) {
        return this.f76868h[i10 % this.f76865e];
    }

    public final boolean e(char c10) {
        byte[] bArr = this.f76867g;
        return bArr.length > 61 && bArr[61] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8773mi0) {
            C8773mi0 c8773mi0 = (C8773mi0) obj;
            if (this.f76869i == c8773mi0.f76869i && Arrays.equals(this.f76862b, c8773mi0.f76862b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f76862b) + (true != this.f76869i ? 1237 : 1231);
    }

    private C8773mi0(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f76861a = str;
        cArr.getClass();
        this.f76862b = cArr;
        try {
            int length = cArr.length;
            int iC = Bi0.c(length, RoundingMode.UNNECESSARY);
            this.f76864d = iC;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iC);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f76865e = i10;
            this.f76866f = iC >> iNumberOfTrailingZeros;
            this.f76863c = length - 1;
            this.f76867g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f76866f; i11++) {
                zArr[Bi0.b(i11 * 8, this.f76864d, RoundingMode.CEILING)] = true;
            }
            this.f76868h = zArr;
            this.f76869i = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
