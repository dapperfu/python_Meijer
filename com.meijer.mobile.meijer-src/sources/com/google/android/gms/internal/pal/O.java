package com.google.android.gms.internal.pal;

import fsimpl.C14170dq;
import java.io.IOException;

/* loaded from: classes6.dex */
final class O {
    static int c(InterfaceC11006s1 interfaceC11006s1, byte[] bArr, int i10, int i11, int i12, N n10) throws IOException {
        C10863j1 c10863j1 = (C10863j1) interfaceC11006s1;
        Object objZze = c10863j1.zze();
        int iB = c10863j1.B(objZze, bArr, i10, i11, i12, n10);
        c10863j1.zzf(objZze);
        n10.f83619c = objZze;
        return iB;
    }

    static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int d(InterfaceC11006s1 interfaceC11006s1, byte[] bArr, int i10, int i11, N n10) throws IOException {
        int iK = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iK = k(i12, bArr, iK, n10);
            i12 = n10.f83617a;
        }
        int i13 = iK;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzadi.i();
        }
        Object objZze = interfaceC11006s1.zze();
        int i14 = i13 + i12;
        interfaceC11006s1.a(objZze, bArr, i13, i14, n10);
        interfaceC11006s1.zzf(objZze);
        n10.f83619c = objZze;
        return i14;
    }

    static int f(byte[] bArr, int i10, I0 i02, N n10) throws IOException {
        D0 d02 = (D0) i02;
        int iJ = j(bArr, i10, n10);
        int i11 = n10.f83617a + iJ;
        while (iJ < i11) {
            iJ = j(bArr, iJ, n10);
            d02.f(n10.f83617a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw zzadi.i();
    }

    static int i(int i10, byte[] bArr, int i11, int i12, K1 k12, N n10) throws zzadi {
        if ((i10 >>> 3) == 0) {
            throw zzadi.c();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM = m(bArr, i11, n10);
            k12.h(i10, Long.valueOf(n10.f83618b));
            return iM;
        }
        if (i13 == 1) {
            k12.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iJ = j(bArr, i11, n10);
            int i14 = n10.f83617a;
            if (i14 < 0) {
                throw zzadi.f();
            }
            if (i14 > bArr.length - iJ) {
                throw zzadi.i();
            }
            if (i14 == 0) {
                k12.h(i10, AbstractC10730b0.f83895b);
            } else {
                k12.h(i10, AbstractC10730b0.t(bArr, iJ, i14));
            }
            return iJ + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzadi.c();
            }
            k12.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        K1 k1E = K1.e();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iJ2 = j(bArr, i11, n10);
            i16 = n10.f83617a;
            if (i16 == i15) {
                i11 = iJ2;
                break;
            }
            i11 = i(i16, bArr, iJ2, i12, k1E, n10);
        }
        if (i11 > i12 || i16 != i15) {
            throw zzadi.g();
        }
        k12.h(i10, k1E);
        return i11;
    }

    static int j(byte[] bArr, int i10, N n10) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return k(b10, bArr, i11, n10);
        }
        n10.f83617a = b10;
        return i11;
    }

    static int k(int i10, byte[] bArr, int i11, N n10) {
        int i12 = i10 & com.medallia.digital.mobilesdk.l3.f93324d;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            n10.f83617a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            n10.f83617a = i14 | (b11 << C14170dq.LIGHTEN);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            n10.f83617a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            n10.f83617a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                n10.f83617a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int l(int i10, byte[] bArr, int i11, int i12, I0 i02, N n10) {
        D0 d02 = (D0) i02;
        int iJ = j(bArr, i11, n10);
        d02.f(n10.f83617a);
        while (iJ < i12) {
            int iJ2 = j(bArr, iJ, n10);
            if (i10 != n10.f83617a) {
                break;
            }
            iJ = j(bArr, iJ2, n10);
            d02.f(n10.f83617a);
        }
        return iJ;
    }

    static int m(byte[] bArr, int i10, N n10) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            n10.f83618b = j10;
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
        n10.f83618b = j11;
        return i12;
    }

    static long n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int a(byte[] bArr, int i10, N n10) throws zzadi {
        int iJ = j(bArr, i10, n10);
        int i11 = n10.f83617a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - iJ) {
                if (i11 == 0) {
                    n10.f83619c = AbstractC10730b0.f83895b;
                    return iJ;
                }
                n10.f83619c = AbstractC10730b0.t(bArr, iJ, i11);
                return iJ + i11;
            }
            throw zzadi.i();
        }
        throw zzadi.f();
    }

    static int e(InterfaceC11006s1 interfaceC11006s1, int i10, byte[] bArr, int i11, int i12, I0 i02, N n10) throws IOException {
        int iD = d(interfaceC11006s1, bArr, i11, i12, n10);
        i02.add(n10.f83619c);
        while (iD < i12) {
            int iJ = j(bArr, iD, n10);
            if (i10 != n10.f83617a) {
                break;
            }
            iD = d(interfaceC11006s1, bArr, iJ, i12, n10);
            i02.add(n10.f83619c);
        }
        return iD;
    }

    static int g(byte[] bArr, int i10, N n10) throws zzadi {
        int iJ = j(bArr, i10, n10);
        int i11 = n10.f83617a;
        if (i11 >= 0) {
            if (i11 == 0) {
                n10.f83619c = "";
                return iJ;
            }
            n10.f83619c = new String(bArr, iJ, i11, J0.f83517b);
            return iJ + i11;
        }
        throw zzadi.f();
    }

    static int h(byte[] bArr, int i10, N n10) throws zzadi {
        int iJ = j(bArr, i10, n10);
        int i11 = n10.f83617a;
        if (i11 >= 0) {
            if (i11 == 0) {
                n10.f83619c = "";
                return iJ;
            }
            n10.f83619c = Y1.d(bArr, iJ, i11);
            return iJ + i11;
        }
        throw zzadi.f();
    }
}
