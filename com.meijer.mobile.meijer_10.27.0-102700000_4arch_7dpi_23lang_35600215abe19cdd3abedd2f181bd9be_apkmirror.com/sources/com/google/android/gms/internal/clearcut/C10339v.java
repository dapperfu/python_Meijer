package com.google.android.gms.internal.clearcut;

import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14045dq;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10339v {
    static int a(int i10, byte[] bArr, int i11, int i12, C10342w c10342w) throws zzco {
        if ((i10 >>> 3) == 0) {
            throw zzco.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return g(bArr, i11, c10342w);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return e(bArr, i11, c10342w) + c10342w.f81594a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzco.b();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = e(bArr, i11, c10342w);
            i15 = c10342w.f81594a;
            if (i15 == i14) {
                break;
            }
            i11 = a(i15, bArr, i11, i12, c10342w);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzco.d();
        }
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, int i12, InterfaceC10308k0<?> interfaceC10308k0, C10342w c10342w) {
        C10296g0 c10296g0 = (C10296g0) interfaceC10308k0;
        int iE = e(bArr, i11, c10342w);
        while (true) {
            c10296g0.e(c10342w.f81594a);
            if (iE >= i12) {
                break;
            }
            int iE2 = e(bArr, iE, c10342w);
            if (i10 != c10342w.f81594a) {
                break;
            }
            iE = e(bArr, iE2, c10342w);
        }
        return iE;
    }

    static int c(int i10, byte[] bArr, int i11, int i12, C10332s1 c10332s1, C10342w c10342w) throws IOException {
        if ((i10 >>> 3) == 0) {
            throw zzco.b();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iG = g(bArr, i11, c10342w);
            c10332s1.e(i10, Long.valueOf(c10342w.f81595b));
            return iG;
        }
        if (i13 == 1) {
            c10332s1.e(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iE = e(bArr, i11, c10342w);
            int i14 = c10342w.f81594a;
            c10332s1.e(i10, i14 == 0 ? A.f81097b : A.n(bArr, iE, i14));
            return iE + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzco.b();
            }
            c10332s1.e(i10, Integer.valueOf(h(bArr, i11)));
            return i11 + 4;
        }
        C10332s1 c10332s1I = C10332s1.i();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iE2 = e(bArr, i11, c10342w);
            i16 = c10342w.f81594a;
            if (i16 == i15) {
                i11 = iE2;
                break;
            }
            i11 = c(i16, bArr, iE2, i12, c10332s1I, c10342w);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzco.d();
        }
        c10332s1.e(i10, c10332s1I);
        return i11;
    }

    static int d(int i10, byte[] bArr, int i11, C10342w c10342w) {
        int i12;
        int i13 = i10 & l3.f92485d;
        int i14 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i12 = b10 << 7;
        } else {
            int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
            int i16 = i11 + 2;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                c10342w.f81594a = i15 | (b11 << C14045dq.LIGHTEN);
                return i16;
            }
            i13 = i15 | ((b11 & Byte.MAX_VALUE) << 14);
            i14 = i11 + 3;
            byte b12 = bArr[i16];
            if (b12 >= 0) {
                i12 = b12 << 21;
            } else {
                int i17 = i13 | ((b12 & Byte.MAX_VALUE) << 21);
                int i18 = i11 + 4;
                byte b13 = bArr[i14];
                if (b13 >= 0) {
                    c10342w.f81594a = i17 | (b13 << 28);
                    return i18;
                }
                int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i20 = i18 + 1;
                    if (bArr[i18] >= 0) {
                        c10342w.f81594a = i19;
                        return i20;
                    }
                    i18 = i20;
                }
            }
        }
        c10342w.f81594a = i13 | i12;
        return i14;
    }

    static int e(byte[] bArr, int i10, C10342w c10342w) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return d(b10, bArr, i11, c10342w);
        }
        c10342w.f81594a = b10;
        return i11;
    }

    static int f(byte[] bArr, int i10, InterfaceC10308k0<?> interfaceC10308k0, C10342w c10342w) throws IOException {
        C10296g0 c10296g0 = (C10296g0) interfaceC10308k0;
        int iE = e(bArr, i10, c10342w);
        int i11 = c10342w.f81594a + iE;
        while (iE < i11) {
            iE = e(bArr, iE, c10342w);
            c10296g0.e(c10342w.f81594a);
        }
        if (iE == i11) {
            return iE;
        }
        throw zzco.a();
    }

    static int g(byte[] bArr, int i10, C10342w c10342w) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c10342w.f81595b = j10;
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
        c10342w.f81595b = j11;
        return i12;
    }

    static int h(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i10, C10342w c10342w) {
        int iE = e(bArr, i10, c10342w);
        int i11 = c10342w.f81594a;
        if (i11 == 0) {
            c10342w.f81596c = "";
            return iE;
        }
        c10342w.f81596c = new String(bArr, iE, i11, C10299h0.f81467a);
        return iE + i11;
    }

    static int j(byte[] bArr, int i10, C10342w c10342w) throws IOException {
        int iE = e(bArr, i10, c10342w);
        int i11 = c10342w.f81594a;
        if (i11 == 0) {
            c10342w.f81596c = "";
            return iE;
        }
        int i12 = iE + i11;
        if (!A1.i(bArr, iE, i12)) {
            throw zzco.e();
        }
        c10342w.f81596c = new String(bArr, iE, i11, C10299h0.f81467a);
        return i12;
    }

    static long k(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static double l(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    static int m(byte[] bArr, int i10, C10342w c10342w) {
        int iE = e(bArr, i10, c10342w);
        int i11 = c10342w.f81594a;
        if (i11 == 0) {
            c10342w.f81596c = A.f81097b;
            return iE;
        }
        c10342w.f81596c = A.n(bArr, iE, i11);
        return iE + i11;
    }

    static float n(byte[] bArr, int i10) {
        return Float.intBitsToFloat(h(bArr, i10));
    }
}
