package com.google.android.gms.internal.ads;

import fsimpl.C14170dq;
import java.io.IOException;

/* loaded from: classes6.dex */
final class Nt0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f69800a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f69801b = 0;

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int f(byte[] bArr, int i10, Su0 su0, Mt0 mt0) throws IOException {
        Hu0 hu0 = (Hu0) su0;
        int iH = h(bArr, i10, mt0);
        int i11 = mt0.f69589a + iH;
        while (iH < i11) {
            iH = h(bArr, iH, mt0);
            hu0.zzi(mt0.f69589a);
        }
        if (iH == i11) {
            return iH;
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int g(int i10, byte[] bArr, int i11, int i12, Vv0 vv0, Mt0 mt0) throws zzgyg {
        if ((i10 >>> 3) == 0) {
            throw new zzgyg("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, mt0);
            vv0.j(i10, Long.valueOf(mt0.f69590b));
            return iK;
        }
        if (i13 == 1) {
            vv0.j(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, mt0);
            int i14 = mt0.f69589a;
            if (i14 < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iH) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                vv0.j(i10, Zt0.f73122b);
            } else {
                vv0.j(i10, Zt0.z(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzgyg("Protocol message contained an invalid tag (zero).");
            }
            vv0.j(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        Vv0 vv0F = Vv0.f();
        int i16 = mt0.f69593e + 1;
        mt0.f69593e = i16;
        o(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iH2 = h(bArr, i11, mt0);
            int i18 = mt0.f69589a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iH2;
                break;
            }
            i11 = g(i18, bArr, iH2, i12, vv0F, mt0);
            i17 = i18;
        }
        mt0.f69593e--;
        if (i11 > i12 || i17 != i15) {
            throw new zzgyg("Failed to parse the message.");
        }
        vv0.j(i10, vv0F);
        return i11;
    }

    static int h(byte[] bArr, int i10, Mt0 mt0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, mt0);
        }
        mt0.f69589a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, Mt0 mt0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & com.medallia.digital.mobilesdk.l3.f93324d;
        if (b10 >= 0) {
            mt0.f69589a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            mt0.f69589a = i14 | (b11 << C14170dq.LIGHTEN);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            mt0.f69589a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            mt0.f69589a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                mt0.f69589a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, Su0 su0, Mt0 mt0) {
        Hu0 hu0 = (Hu0) su0;
        int iH = h(bArr, i11, mt0);
        hu0.zzi(mt0.f69589a);
        while (iH < i12) {
            int iH2 = h(bArr, iH, mt0);
            if (i10 != mt0.f69589a) {
                break;
            }
            iH = h(bArr, iH2, mt0);
            hu0.zzi(mt0.f69589a);
        }
        return iH;
    }

    static int k(byte[] bArr, int i10, Mt0 mt0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            mt0.f69590b = j10;
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
        mt0.f69590b = j11;
        return i12;
    }

    static int l(Object obj, Hv0 hv0, byte[] bArr, int i10, int i11, int i12, Mt0 mt0) throws IOException {
        int i13 = mt0.f69593e + 1;
        mt0.f69593e = i13;
        o(i13);
        int iX = ((C9565sv0) hv0).x(obj, bArr, i10, i11, i12, mt0);
        mt0.f69593e--;
        mt0.f69591c = obj;
        return iX;
    }

    static int m(Object obj, Hv0 hv0, byte[] bArr, int i10, int i11, Mt0 mt0) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, mt0);
            i13 = mt0.f69589a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = mt0.f69593e + 1;
        mt0.f69593e = i15;
        o(i15);
        int i16 = i14 + i13;
        hv0.a(obj, bArr, i14, i16, mt0);
        mt0.f69593e--;
        mt0.f69591c = obj;
        return i16;
    }

    static long n(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void o(int i10) throws zzgyg {
        if (i10 >= f69800a) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int a(byte[] bArr, int i10, Mt0 mt0) throws zzgyg {
        int iH = h(bArr, i10, mt0);
        int i11 = mt0.f69589a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - iH) {
                if (i11 == 0) {
                    mt0.f69591c = Zt0.f73122b;
                    return iH;
                }
                mt0.f69591c = Zt0.z(bArr, iH, i11);
                return iH + i11;
            }
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int c(Hv0 hv0, byte[] bArr, int i10, int i11, int i12, Mt0 mt0) throws IOException {
        Object objZze = hv0.zze();
        int iL = l(objZze, hv0, bArr, i10, i11, i12, mt0);
        hv0.zzf(objZze);
        mt0.f69591c = objZze;
        return iL;
    }

    static int d(Hv0 hv0, byte[] bArr, int i10, int i11, Mt0 mt0) throws IOException {
        Object objZze = hv0.zze();
        int iM = m(objZze, hv0, bArr, i10, i11, mt0);
        hv0.zzf(objZze);
        mt0.f69591c = objZze;
        return iM;
    }

    static int e(Hv0 hv0, int i10, byte[] bArr, int i11, int i12, Su0 su0, Mt0 mt0) throws IOException {
        int iD = d(hv0, bArr, i11, i12, mt0);
        su0.add(mt0.f69591c);
        while (iD < i12) {
            int iH = h(bArr, iD, mt0);
            if (i10 != mt0.f69589a) {
                break;
            }
            iD = d(hv0, bArr, iH, i12, mt0);
            su0.add(mt0.f69591c);
        }
        return iD;
    }
}
