package e4;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;

/* loaded from: classes4.dex */
final class v {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f129913a;

        /* renamed from: b, reason: collision with root package name */
        public long f129914b;

        /* renamed from: c, reason: collision with root package name */
        public int f129915c;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f129916a;

        /* renamed from: b, reason: collision with root package name */
        public final int f129917b;

        /* renamed from: c, reason: collision with root package name */
        public final int f129918c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f129919d;

        private c(int i10, int i11, int i12, byte[] bArr) {
            this.f129916a = i10;
            this.f129917b = i11;
            this.f129918c = i12;
            this.f129919d = bArr;
        }
    }

    private static boolean i(d3.C c10) {
        c10.r(3);
        boolean zG = c10.g();
        if (zG) {
            c10.r(13);
        }
        return zG;
    }

    private static int j(d3.C c10) {
        int iH = c10.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = c10.h(3);
            iK += k(c10, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && c10.g()) {
                p(c10);
            }
        }
        return iK;
    }

    private static void m(d3.C c10, int i10, int i11) {
        int iH;
        int iK = k(c10, 4, 8, 16) + 1;
        c10.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = c10.h(2);
            if (iH2 == 0) {
                i(c10);
                if (i11 > 0) {
                    o(c10);
                }
            } else if (iH2 == 1) {
                if (i(c10)) {
                    c10.q();
                }
                if (i11 > 0) {
                    o(c10);
                    iH = c10.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    c10.r(6);
                    int iH3 = c10.h(2);
                    c10.r(4);
                    if (c10.g()) {
                        c10.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        c10.r(6);
                    }
                    if (iH3 == 2) {
                        c10.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = c10.h(2);
                if (iH4 > 0 && c10.g()) {
                    c10.r(iFloor);
                }
                if (c10.g()) {
                    c10.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    c10.q();
                }
            } else if (iH2 == 3) {
                k(c10, 4, 8, 16);
                int iK2 = k(c10, 4, 8, 16);
                if (c10.g()) {
                    k(c10, 8, 16, 0);
                }
                c10.q();
                if (iK2 > 0) {
                    c10.r(iK2 * 8);
                }
            }
        }
    }

    private static void o(d3.C c10) {
        c10.r(3);
        c10.r(8);
        boolean zG = c10.g();
        boolean zG2 = c10.g();
        if (zG) {
            c10.r(5);
        }
        if (zG2) {
            c10.r(6);
        }
    }

    private static void p(d3.C c10) {
        int iH = c10.h(2);
        if (iH == 0) {
            c10.r(6);
            return;
        }
        int iK = k(c10, 5, 8, 16) + 1;
        if (iH == 1) {
            c10.r(iK * 7);
        } else if (iH == 2) {
            n(c10, iK);
        }
    }

    private static int a(int i10) throws ParserException {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return 1024;
        }
        if (i10 == 2 || i10 == 3) {
            return RecyclerView.m.FLAG_MOVED;
        }
        if (i10 == 4) {
            return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    private static int d(int i10) throws ParserException {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static c h(d3.C c10) throws ParserException {
        int iH = c10.h(8);
        int iH2 = c10.h(5);
        int iH3 = iH2 == 31 ? c10.h(24) : c(iH2);
        int iH4 = c10.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        c10.r(2);
        p(c10);
        m(c10, j(c10), iD);
        byte[] bArr = null;
        if (c10.g()) {
            int iK = k(c10, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(c10, 4, 8, 16);
                int iK3 = k(c10, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = c10.h(4) + 1;
                    c10.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) c10.h(8);
                    }
                    bArr = bArr2;
                } else {
                    c10.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (iH3 * dB), (int) (iA * dB), bArr3);
    }

    private static double b(int i10) throws ParserException {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.c("Unsupported sampling rate " + i10);
        }
    }

    private static int c(int i10) throws ParserException {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.c("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static boolean e(int i10) {
        if ((i10 & 16777215) == 12583333) {
            return true;
        }
        return false;
    }

    public static int f(d3.C c10) {
        if (c10.g()) {
            c10.r(2);
            return c10.h(13);
        }
        return 0;
    }

    public static boolean g(d3.C c10, b bVar) throws ParserException {
        c10.d();
        int iK = k(c10, 3, 8, 8);
        bVar.f129913a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(c10, 2, 8, 32);
        bVar.f129914b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL <= 16) {
            if (jL == 0) {
                int i10 = bVar.f129913a;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 17) {
                            throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
                        }
                    } else {
                        throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
                    }
                } else {
                    throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
                }
            }
            int iK2 = k(c10, 11, 24, 24);
            bVar.f129915c = iK2;
            if (iK2 == -1) {
                return false;
            }
            return true;
        }
        throw ParserException.c("Contains sub-stream with an invalid packet label " + bVar.f129914b);
    }

    private static int k(d3.C c10, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        He.c.a(He.c.a(i13, i14), 1 << i12);
        if (c10.b() < i10) {
            return -1;
        }
        int iH = c10.h(i10);
        if (iH == i13) {
            if (c10.b() < i11) {
                return -1;
            }
            int iH2 = c10.h(i11);
            int i15 = iH + iH2;
            if (iH2 == i14) {
                if (c10.b() < i12) {
                    return -1;
                }
                return i15 + c10.h(i12);
            }
            return i15;
        }
        return iH;
    }

    private static long l(d3.C c10, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 63) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        He.d.a(He.d.a(j10, j11), 1 << i12);
        if (c10.b() < i10) {
            return -1L;
        }
        long j12 = c10.j(i10);
        if (j12 == j10) {
            if (c10.b() < i11) {
                return -1L;
            }
            long j13 = c10.j(i11);
            long j14 = j12 + j13;
            if (j13 == j11) {
                if (c10.b() < i12) {
                    return -1L;
                }
                return j14 + c10.j(i12);
            }
            return j14;
        }
        return j12;
    }

    private static void n(d3.C c10, int i10) {
        int i11;
        int i12;
        int iH;
        boolean zG = c10.g();
        int i13 = 5;
        if (zG) {
            i11 = 1;
        } else {
            i11 = 5;
        }
        if (zG) {
            i13 = 7;
        }
        if (zG) {
            i12 = 8;
        } else {
            i12 = 6;
        }
        int i14 = 0;
        while (i14 < i10) {
            if (c10.g()) {
                c10.r(7);
                iH = 0;
            } else {
                if (c10.h(2) == 3 && c10.h(i13) * i11 != 0) {
                    c10.q();
                }
                iH = c10.h(i12) * i11;
                if (iH != 0 && iH != 180) {
                    c10.q();
                }
                c10.q();
            }
            if (iH != 0 && iH != 180 && c10.g()) {
                i14++;
            }
            i14++;
        }
    }
}
