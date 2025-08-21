package x3;

import a3.t;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.Reason;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18076o {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f170326a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f170327b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f170328c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, RecyclerView.m.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f170329d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f170330e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f170331f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f170332g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f170333h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f170334i = {5, 8, 10, 12};

    /* renamed from: x3.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f170335a;

        /* renamed from: b, reason: collision with root package name */
        public final int f170336b;

        /* renamed from: c, reason: collision with root package name */
        public final int f170337c;

        /* renamed from: d, reason: collision with root package name */
        public final int f170338d;

        /* renamed from: e, reason: collision with root package name */
        public final long f170339e;

        /* renamed from: f, reason: collision with root package name */
        public final int f170340f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f170335a = str;
            this.f170337c = i10;
            this.f170336b = i11;
            this.f170338d = i12;
            this.f170339e = j10;
            this.f170340f = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C18076o.b(byte[]):int");
    }

    private static d3.C d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new d3.C(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        d3.C c10 = new d3.C(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            d3.C c11 = new d3.C(bArrCopyOf);
            while (c11.b() >= 16) {
                c11.r(2);
                c10.f(c11.h(14), 14);
            }
        }
        c10.n(bArrCopyOf);
        return c10;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    private static int m(d3.C c10, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && c10.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + c10.h(iArr[i11]);
    }

    private static void a(byte[] bArr, int i10) throws ParserException {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != d3.P.u(bArr, 0, i11, 65535)) {
            throw ParserException.a("CRC check failed", null);
        }
    }

    public static int c(int i10) {
        if (i10 != 2147385345 && i10 != -25230976 && i10 != 536864768 && i10 != -14745368) {
            if (i10 != 1683496997 && i10 != 622876772) {
                if (i10 != 1078008818 && i10 != -233094848) {
                    if (i10 != 1908687592 && i10 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static a3.t h(byte[] bArr, String str, String str2, int i10, String str3, a3.o oVar) {
        int i11;
        int i12;
        d3.C cD = d(bArr);
        cD.r(60);
        int i13 = f170326a[cD.h(6)];
        int i14 = f170327b[cD.h(4)];
        int iH = cD.h(5);
        int[] iArr = f170328c;
        if (iH >= iArr.length) {
            i11 = -1;
        } else {
            i11 = (iArr[iH] * 1000) / 2;
        }
        cD.r(10);
        if (cD.h(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new t.b().f0(str).U(str3).u0("audio/vnd.dts").Q(i11).R(i13 + i12).v0(i14).Y(oVar).j0(str2).s0(i10).N();
    }

    public static b i(byte[] bArr) throws ParserException {
        int i10;
        int i11;
        int iH;
        int i12;
        long jV0;
        int i13;
        d3.C cD = d(bArr);
        cD.r(40);
        int iH2 = cD.h(2);
        if (!cD.g()) {
            i10 = 16;
            i11 = 8;
        } else {
            i10 = 20;
            i11 = 12;
        }
        cD.r(i11);
        int iH3 = cD.h(i10) + 1;
        boolean zG = cD.g();
        int iH4 = -1;
        int i14 = 0;
        if (zG) {
            iH = cD.h(2);
            int iH5 = (cD.h(3) + 1) * 512;
            if (cD.g()) {
                cD.r(36);
            }
            int iH6 = cD.h(3) + 1;
            int iH7 = cD.h(3) + 1;
            if (iH6 == 1 && iH7 == 1) {
                int i15 = iH2 + 1;
                int iH8 = cD.h(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    if (((iH8 >> i16) & 1) == 1) {
                        cD.r(8);
                    }
                }
                if (cD.g()) {
                    cD.r(2);
                    int iH9 = (cD.h(2) + 1) << 2;
                    int iH10 = cD.h(2) + 1;
                    while (i14 < iH10) {
                        cD.r(iH9);
                        i14++;
                    }
                }
                i14 = iH5;
            } else {
                throw ParserException.c("Multiple audio presentations or assets not supported");
            }
        } else {
            iH = -1;
        }
        cD.r(i10);
        cD.r(12);
        if (zG) {
            if (cD.g()) {
                cD.r(4);
            }
            if (cD.g()) {
                cD.r(24);
            }
            if (cD.g()) {
                cD.s(cD.h(10) + 1);
            }
            cD.r(5);
            i12 = f170329d[cD.h(4)];
            iH4 = cD.h(8) + 1;
        } else {
            i12 = Reason.OS_VERSION_TOO_LOW;
        }
        int i17 = i12;
        if (zG) {
            if (iH != 0) {
                if (iH != 1) {
                    if (iH == 2) {
                        i13 = 48000;
                    } else {
                        throw ParserException.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                    }
                } else {
                    i13 = 44100;
                }
            } else {
                i13 = 32000;
            }
            jV0 = d3.P.V0(i14, 1000000L, i13);
        } else {
            jV0 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i17, iH3, jV0, 0);
    }

    public static int j(byte[] bArr) {
        int i10;
        d3.C cD = d(bArr);
        cD.r(42);
        if (cD.g()) {
            i10 = 12;
        } else {
            i10 = 8;
        }
        return cD.h(i10) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int i10;
        int iH;
        long jV0;
        AtomicInteger atomicInteger2;
        int i11;
        int i12;
        d3.C cD = d(bArr);
        int iM = 0;
        if (cD.h(32) == 1078008818) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int iM2 = m(cD, f170330e, true) + 1;
        if (i10 != 0) {
            if (cD.g()) {
                a(bArr, iM2);
                int iH2 = cD.h(2);
                if (iH2 != 0) {
                    if (iH2 != 1) {
                        if (iH2 == 2) {
                            i11 = 384;
                        } else {
                            throw ParserException.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                        }
                    } else {
                        i11 = 480;
                    }
                } else {
                    i11 = 512;
                }
                int iH3 = i11 * (cD.h(3) + 1);
                int iH4 = cD.h(2);
                if (iH4 != 0) {
                    if (iH4 != 1) {
                        if (iH4 == 2) {
                            i12 = 48000;
                        } else {
                            throw ParserException.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                        }
                    } else {
                        i12 = 44100;
                    }
                } else {
                    i12 = 32000;
                }
                if (cD.g()) {
                    cD.r(36);
                }
                iH = (1 << cD.h(2)) * i12;
                jV0 = d3.P.V0(iH3, 1000000L, i12);
            } else {
                throw ParserException.c("Only supports full channel mask-based audio presentation");
            }
        } else {
            iH = Reason.OS_VERSION_TOO_LOW;
            jV0 = -9223372036854775807L;
        }
        int i13 = iH;
        long j10 = jV0;
        int iM3 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            iM3 += m(cD, f170331f, true);
        }
        if (i10 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(cD, f170332g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        if (atomicInteger2.get() != 0) {
            iM = m(cD, f170333h, true);
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i13, iM2 + iM3 + iM, j10, 0);
    }

    public static int l(byte[] bArr) {
        d3.C cD = d(bArr);
        cD.r(32);
        return m(cD, f170334i, true) + 1;
    }
}
