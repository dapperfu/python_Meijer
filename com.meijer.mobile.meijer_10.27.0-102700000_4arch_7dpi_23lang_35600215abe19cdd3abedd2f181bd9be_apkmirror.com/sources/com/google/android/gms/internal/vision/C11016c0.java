package com.google.android.gms.internal.vision;

import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14045dq;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11016c0 {
    static int f(O1 o12, byte[] bArr, int i10, int i11, int i12, C11020d0 c11020d0) throws IOException {
        A1 a12 = (A1) o12;
        Object objZza = a12.zza();
        int iJ = a12.j(objZza, bArr, i10, i11, i12, c11020d0);
        a12.zzc(objZza);
        c11020d0.f84521c = objZza;
        return iJ;
    }

    static int a(int i10, byte[] bArr, int i11, int i12, C11020d0 c11020d0) throws zzjk {
        if ((i10 >>> 3) == 0) {
            throw zzjk.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return k(bArr, i11, c11020d0);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return i(bArr, i11, c11020d0) + c11020d0.f84519a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzjk.c();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = i(bArr, i11, c11020d0);
            i15 = c11020d0.f84519a;
            if (i15 == i14) {
                break;
            }
            i11 = a(i15, bArr, i11, i12, c11020d0);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzjk.e();
        }
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, int i12, X0<?> x02, C11020d0 c11020d0) {
        Q0 q02 = (Q0) x02;
        int i13 = i(bArr, i11, c11020d0);
        q02.f(c11020d0.f84519a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, c11020d0);
            if (i10 != c11020d0.f84519a) {
                break;
            }
            i13 = i(bArr, i14, c11020d0);
            q02.f(c11020d0.f84519a);
        }
        return i13;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, C11038h2 c11038h2, C11020d0 c11020d0) throws zzjk {
        if ((i10 >>> 3) == 0) {
            throw zzjk.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, c11020d0);
            c11038h2.c(i10, Long.valueOf(c11020d0.f84520b));
            return iK;
        }
        if (i13 == 1) {
            c11038h2.c(i10, Long.valueOf(l(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int i14 = i(bArr, i11, c11020d0);
            int i15 = c11020d0.f84519a;
            if (i15 < 0) {
                throw zzjk.b();
            }
            if (i15 > bArr.length - i14) {
                throw zzjk.a();
            }
            if (i15 == 0) {
                c11038h2.c(i10, AbstractC11036h0.f84545b);
            } else {
                c11038h2.c(i10, AbstractC11036h0.m(bArr, i14, i15));
            }
            return i14 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzjk.c();
            }
            c11038h2.c(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        C11038h2 c11038h2G = C11038h2.g();
        int i16 = (i10 & (-8)) | 4;
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int i18 = i(bArr, i11, c11020d0);
            i17 = c11020d0.f84519a;
            if (i17 == i16) {
                i11 = i18;
                break;
            }
            i11 = c(i17, bArr, i18, i12, c11038h2G, c11020d0);
        }
        if (i11 > i12 || i17 != i16) {
            throw zzjk.e();
        }
        c11038h2.c(i10, c11038h2G);
        return i11;
    }

    static int d(int i10, byte[] bArr, int i11, C11020d0 c11020d0) {
        int i12 = i10 & l3.f92485d;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c11020d0.f84519a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c11020d0.f84519a = i14 | (b11 << C14045dq.LIGHTEN);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c11020d0.f84519a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c11020d0.f84519a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c11020d0.f84519a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int g(O1 o12, byte[] bArr, int i10, int i11, C11020d0 c11020d0) throws IOException {
        int iD = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iD = d(i12, bArr, iD, c11020d0);
            i12 = c11020d0.f84519a;
        }
        int i13 = iD;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzjk.a();
        }
        Object objZza = o12.zza();
        int i14 = i13 + i12;
        o12.d(objZza, bArr, i13, i14, c11020d0);
        o12.zzc(objZza);
        c11020d0.f84521c = objZza;
        return i14;
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i10, C11020d0 c11020d0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, c11020d0);
        }
        c11020d0.f84519a = b10;
        return i11;
    }

    static int j(byte[] bArr, int i10, X0<?> x02, C11020d0 c11020d0) throws IOException {
        Q0 q02 = (Q0) x02;
        int i11 = i(bArr, i10, c11020d0);
        int i12 = c11020d0.f84519a + i11;
        while (i11 < i12) {
            i11 = i(bArr, i11, c11020d0);
            q02.f(c11020d0.f84519a);
        }
        if (i11 == i12) {
            return i11;
        }
        throw zzjk.a();
    }

    static int k(byte[] bArr, int i10, C11020d0 c11020d0) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c11020d0.f84520b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c11020d0.f84520b = j11;
        return i12;
    }

    static long l(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int e(O1<?> o12, int i10, byte[] bArr, int i11, int i12, X0<?> x02, C11020d0 c11020d0) throws IOException {
        int iG = g(o12, bArr, i11, i12, c11020d0);
        x02.add(c11020d0.f84521c);
        while (iG < i12) {
            int i13 = i(bArr, iG, c11020d0);
            if (i10 != c11020d0.f84519a) {
                break;
            }
            iG = g(o12, bArr, i13, i12, c11020d0);
            x02.add(c11020d0.f84521c);
        }
        return iG;
    }

    static double m(byte[] bArr, int i10) {
        return Double.longBitsToDouble(l(bArr, i10));
    }

    static int n(byte[] bArr, int i10, C11020d0 c11020d0) throws zzjk {
        int i11 = i(bArr, i10, c11020d0);
        int i12 = c11020d0.f84519a;
        if (i12 >= 0) {
            if (i12 == 0) {
                c11020d0.f84521c = "";
                return i11;
            }
            c11020d0.f84521c = new String(bArr, i11, i12, S0.f84465a);
            return i11 + i12;
        }
        throw zzjk.b();
    }

    static float o(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }

    static int p(byte[] bArr, int i10, C11020d0 c11020d0) throws zzjk {
        int i11 = i(bArr, i10, c11020d0);
        int i12 = c11020d0.f84519a;
        if (i12 >= 0) {
            if (i12 == 0) {
                c11020d0.f84521c = "";
                return i11;
            }
            c11020d0.f84521c = o2.k(bArr, i11, i12);
            return i11 + i12;
        }
        throw zzjk.b();
    }

    static int q(byte[] bArr, int i10, C11020d0 c11020d0) throws zzjk {
        int i11 = i(bArr, i10, c11020d0);
        int i12 = c11020d0.f84519a;
        if (i12 >= 0) {
            if (i12 <= bArr.length - i11) {
                if (i12 == 0) {
                    c11020d0.f84521c = AbstractC11036h0.f84545b;
                    return i11;
                }
                c11020d0.f84521c = AbstractC11036h0.m(bArr, i11, i12);
                return i11 + i12;
            }
            throw zzjk.a();
        }
        throw zzjk.b();
    }
}
