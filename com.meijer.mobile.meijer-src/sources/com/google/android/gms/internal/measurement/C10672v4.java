package com.google.android.gms.internal.measurement;

import fsimpl.C14170dq;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10672v4 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f83283a = 100;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f83284b = 0;

    static int a(byte[] bArr, int i10, C10663u4 c10663u4) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return b(b10, bArr, i11, c10663u4);
        }
        c10663u4.f83265a = b10;
        return i11;
    }

    static int b(int i10, byte[] bArr, int i11, C10663u4 c10663u4) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & com.medallia.digital.mobilesdk.l3.f93324d;
        if (b10 >= 0) {
            c10663u4.f83265a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c10663u4.f83265a = i14 | (b11 << C14170dq.LIGHTEN);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c10663u4.f83265a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c10663u4.f83265a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c10663u4.f83265a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int c(byte[] bArr, int i10, C10663u4 c10663u4) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c10663u4.f83266b = j10;
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
        c10663u4.f83266b = j11;
        return i12;
    }

    static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static long e(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    static int j(Object obj, V5 v52, byte[] bArr, int i10, int i11, C10663u4 c10663u4) throws IOException {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = b(i12, bArr, iB, c10663u4);
            i12 = c10663u4.f83265a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c10663u4.f83269e + 1;
        c10663u4.f83269e = i14;
        q(i14);
        int i15 = i13 + i12;
        v52.c(obj, bArr, i13, i15, c10663u4);
        c10663u4.f83269e--;
        c10663u4.f83267c = obj;
        return i15;
    }

    static int k(Object obj, V5 v52, byte[] bArr, int i10, int i11, int i12, C10663u4 c10663u4) throws IOException {
        int i13 = c10663u4.f83269e + 1;
        c10663u4.f83269e = i13;
        q(i13);
        int iV = ((N5) v52).v(obj, bArr, i10, i11, i12, c10663u4);
        c10663u4.f83269e--;
        c10663u4.f83267c = obj;
        return iV;
    }

    static int l(int i10, byte[] bArr, int i11, int i12, InterfaceC10602n5 interfaceC10602n5, C10663u4 c10663u4) {
        C10530f5 c10530f5 = (C10530f5) interfaceC10602n5;
        int iA = a(bArr, i11, c10663u4);
        c10530f5.zzh(c10663u4.f83265a);
        while (iA < i12) {
            int iA2 = a(bArr, iA, c10663u4);
            if (i10 != c10663u4.f83265a) {
                break;
            }
            iA = a(bArr, iA2, c10663u4);
            c10530f5.zzh(c10663u4.f83265a);
        }
        return iA;
    }

    static int m(byte[] bArr, int i10, InterfaceC10602n5 interfaceC10602n5, C10663u4 c10663u4) throws IOException {
        C10530f5 c10530f5 = (C10530f5) interfaceC10602n5;
        int iA = a(bArr, i10, c10663u4);
        int i11 = c10663u4.f83265a + iA;
        while (iA < i11) {
            iA = a(bArr, iA, c10663u4);
            c10530f5.zzh(c10663u4.f83265a);
        }
        if (iA == i11) {
            return iA;
        }
        throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(int i10, byte[] bArr, int i11, int i12, C10549h6 c10549h6, C10663u4 c10663u4) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iC = c(bArr, i11, c10663u4);
            c10549h6.k(i10, Long.valueOf(c10663u4.f83266b));
            return iC;
        }
        if (i13 == 1) {
            c10549h6.k(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iA = a(bArr, i11, c10663u4);
            int i14 = c10663u4.f83265a;
            if (i14 < 0) {
                throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iA) {
                throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c10549h6.k(i10, G4.f82610b);
            } else {
                c10549h6.k(i10, G4.m(bArr, iA, i14));
            }
            return iA + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zzmr("Protocol message contained an invalid tag (zero).");
            }
            c10549h6.k(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C10549h6 c10549h6B = C10549h6.b();
        int i16 = c10663u4.f83269e + 1;
        c10663u4.f83269e = i16;
        q(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iA2 = a(bArr, i11, c10663u4);
            int i18 = c10663u4.f83265a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iA2;
                break;
            }
            i11 = o(i18, bArr, iA2, i12, c10549h6B, c10663u4);
            i17 = i18;
        }
        c10663u4.f83269e--;
        if (i11 > i12 || i17 != i15) {
            throw new zzmr("Failed to parse the message.");
        }
        c10549h6.k(i10, c10549h6B);
        return i11;
    }

    static int p(int i10, byte[] bArr, int i11, int i12, C10663u4 c10663u4) throws zzmr {
        if ((i10 >>> 3) == 0) {
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, c10663u4);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, c10663u4) + c10663u4.f83265a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zzmr("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, c10663u4);
            i15 = c10663u4.f83265a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, c10663u4);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zzmr("Failed to parse the message.");
        }
        return i11;
    }

    private static void q(int i10) throws zzmr {
        if (i10 >= f83283a) {
            throw new zzmr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static int f(byte[] bArr, int i10, C10663u4 c10663u4) throws zzmr {
        int i11;
        int iA = a(bArr, i10, c10663u4);
        int i12 = c10663u4.f83265a;
        if (i12 >= 0) {
            if (i12 == 0) {
                c10663u4.f83267c = "";
                return iA;
            }
            int i13 = C10630q6.f83195a;
            int length = bArr.length;
            if ((((length - iA) - i12) | iA | i12) >= 0) {
                int i14 = iA + i12;
                char[] cArr = new char[i12];
                int i15 = 0;
                while (iA < i14) {
                    byte b10 = bArr[iA];
                    if (!C10612o6.a(b10)) {
                        break;
                    }
                    iA++;
                    cArr[i15] = (char) b10;
                    i15++;
                }
                int i16 = i15;
                while (iA < i14) {
                    int i17 = iA + 1;
                    byte b11 = bArr[iA];
                    if (C10612o6.a(b11)) {
                        cArr[i16] = (char) b11;
                        i16++;
                        iA = i17;
                        while (iA < i14) {
                            byte b12 = bArr[iA];
                            if (C10612o6.a(b12)) {
                                iA++;
                                cArr[i16] = (char) b12;
                                i16++;
                            }
                        }
                    } else {
                        if (b11 < -32) {
                            if (i17 < i14) {
                                i11 = i16 + 1;
                                iA += 2;
                                C10612o6.b(b11, bArr[i17], cArr, i16);
                            } else {
                                throw new zzmr("Protocol message had invalid UTF-8.");
                            }
                        } else if (b11 < -16) {
                            if (i17 < i14 - 1) {
                                i11 = i16 + 1;
                                int i18 = iA + 2;
                                iA += 3;
                                C10612o6.c(b11, bArr[i17], bArr[i18], cArr, i16);
                            } else {
                                throw new zzmr("Protocol message had invalid UTF-8.");
                            }
                        } else if (i17 < i14 - 2) {
                            byte b13 = bArr[i17];
                            int i19 = iA + 3;
                            byte b14 = bArr[iA + 2];
                            iA += 4;
                            C10612o6.d(b11, b13, b14, bArr[i19], cArr, i16);
                            i16 += 2;
                        } else {
                            throw new zzmr("Protocol message had invalid UTF-8.");
                        }
                        i16 = i11;
                    }
                }
                c10663u4.f83267c = new String(cArr, 0, i16);
                return i14;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i12)));
        }
        throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int g(byte[] bArr, int i10, C10663u4 c10663u4) throws zzmr {
        int iA = a(bArr, i10, c10663u4);
        int i11 = c10663u4.f83265a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - iA) {
                if (i11 == 0) {
                    c10663u4.f83267c = G4.f82610b;
                    return iA;
                }
                c10663u4.f83267c = G4.m(bArr, iA, i11);
                return iA + i11;
            }
            throw new zzmr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzmr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static int h(V5 v52, byte[] bArr, int i10, int i11, C10663u4 c10663u4) throws IOException {
        Object objZza = v52.zza();
        int iJ = j(objZza, v52, bArr, i10, i11, c10663u4);
        v52.b(objZza);
        c10663u4.f83267c = objZza;
        return iJ;
    }

    static int i(V5 v52, byte[] bArr, int i10, int i11, int i12, C10663u4 c10663u4) throws IOException {
        Object objZza = v52.zza();
        int iK = k(objZza, v52, bArr, i10, i11, i12, c10663u4);
        v52.b(objZza);
        c10663u4.f83267c = objZza;
        return iK;
    }

    static int n(V5 v52, int i10, byte[] bArr, int i11, int i12, InterfaceC10602n5 interfaceC10602n5, C10663u4 c10663u4) throws IOException {
        int iH = h(v52, bArr, i11, i12, c10663u4);
        interfaceC10602n5.add(c10663u4.f83267c);
        while (iH < i12) {
            int iA = a(bArr, iH, c10663u4);
            if (i10 != c10663u4.f83265a) {
                break;
            }
            iH = h(v52, bArr, iA, i12, c10663u4);
            interfaceC10602n5.add(c10663u4.f83267c);
        }
        return iH;
    }
}
