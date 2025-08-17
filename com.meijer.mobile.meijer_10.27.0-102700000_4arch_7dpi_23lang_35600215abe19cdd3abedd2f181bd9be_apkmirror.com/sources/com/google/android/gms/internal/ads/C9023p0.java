package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.Reason;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9023p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f77459a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f77460b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f77461c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, RecyclerView.m.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f77462d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f77463e = {5, 8, 10, 12};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f77464f = {6, 9, 12, 15};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f77465g = {2, 4, 6, 8};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f77466h = {9, 11, 13, 16};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f77467i = {5, 8, 10, 12};

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f77468j = 0;

    private static int f(C7999fQ c7999fQ, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && c7999fQ.p(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return i12 + c7999fQ.d(iArr[i10]);
    }

    private static C7999fQ g(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new C7999fQ(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        int length = bArrCopyOf.length;
        C7999fQ c7999fQ = new C7999fQ(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            C7999fQ c7999fQ2 = new C7999fQ(bArrCopyOf, length);
            while (c7999fQ2.a() >= 16) {
                c7999fQ2.n(2);
                c7999fQ.g(c7999fQ2.d(14), 14);
            }
        }
        c7999fQ.k(bArrCopyOf, bArrCopyOf.length);
        return c7999fQ;
    }

    public static C8809n0 e(byte[] bArr, AtomicInteger atomicInteger) throws zzbc {
        long jM;
        int iD;
        AtomicInteger atomicInteger2;
        int i10;
        int i11;
        C7999fQ c7999fQG = g(bArr);
        int iD2 = c7999fQG.d(32);
        int iF = f(c7999fQG, f77463e, true);
        int i12 = iF + 1;
        char c10 = iD2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jM = -9223372036854775807L;
            iD = Reason.OS_VERSION_TOO_LOW;
        } else {
            if (!c7999fQG.p()) {
                throw zzbc.c("Only supports full channel mask-based audio presentation");
            }
            int i13 = iF - 1;
            if (((bArr[iF] & 255) | ((char) (bArr[i13] << 8))) != OV.w(bArr, 0, i13, 65535)) {
                throw zzbc.a("CRC check failed", null);
            }
            int iD3 = c7999fQG.d(2);
            if (iD3 == 0) {
                i10 = 512;
            } else if (iD3 == 1) {
                i10 = 480;
            } else {
                if (iD3 != 2) {
                    throw zzbc.a("Unsupported base duration index in DTS UHD header: " + iD3, null);
                }
                i10 = 384;
            }
            int iD4 = c7999fQG.d(3) + 1;
            int iD5 = c7999fQG.d(2);
            if (iD5 == 0) {
                i11 = 32000;
            } else if (iD5 == 1) {
                i11 = 44100;
            } else {
                if (iD5 != 2) {
                    throw zzbc.a("Unsupported clock rate index in DTS UHD header: " + iD5, null);
                }
                i11 = 48000;
            }
            if (c7999fQG.p()) {
                c7999fQG.n(36);
            }
            iD = (1 << c7999fQG.d(2)) * i11;
            jM = OV.M(i10 * iD4, 1000000L, i11, RoundingMode.DOWN);
        }
        int i14 = iD;
        long j10 = jM;
        int iF2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iF2 += f(c7999fQG, f77464f, true);
        }
        for (int i15 = 0; i15 <= 0; i15++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(f(c7999fQG, f77465g, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iF2 += atomicInteger2.get() != 0 ? f(c7999fQG, f77466h, true) : 0;
        }
        return new C8809n0("audio/vnd.dts.uhd;profile=p2", 2, i14, i12 + iF2, j10, 0, null);
    }

    public static int a(byte[] bArr) {
        int i10;
        C7999fQ c7999fQG = g(bArr);
        c7999fQG.n(42);
        if (true != c7999fQG.p()) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        return c7999fQG.d(i10) + 1;
    }

    public static int b(byte[] bArr) {
        C7999fQ c7999fQG = g(bArr);
        c7999fQG.n(32);
        return f(c7999fQG, f77467i, true) + 1;
    }

    public static C c(byte[] bArr, String str, String str2, int i10, TE0 te0) {
        int i11;
        int i12;
        C7999fQ c7999fQG = g(bArr);
        c7999fQG.n(60);
        int i13 = f77459a[c7999fQG.d(6)];
        int i14 = f77460b[c7999fQG.d(4)];
        int iD = c7999fQG.d(5);
        if (iD >= 29) {
            i11 = -1;
        } else {
            i11 = (f77461c[iD] * 1000) / 2;
        }
        c7999fQG.n(10);
        if (c7999fQG.d(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = i13 + i12;
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.m(str);
        c9592uH0.B("audio/vnd.dts");
        c9592uH0.q0(i11);
        c9592uH0.r0(i15);
        c9592uH0.C(i14);
        c9592uH0.f(null);
        c9592uH0.q(str2);
        c9592uH0.y(i10);
        return c9592uH0.H();
    }

    public static C8809n0 d(byte[] bArr) throws zzbc {
        int i10;
        int i11;
        int iD;
        int i12;
        long jM;
        int i13;
        C7999fQ c7999fQG = g(bArr);
        c7999fQG.n(40);
        int iD2 = c7999fQG.d(2);
        boolean zP = c7999fQG.p();
        if (true != zP) {
            i10 = 16;
        } else {
            i10 = 20;
        }
        if (true != zP) {
            i11 = 8;
        } else {
            i11 = 12;
        }
        c7999fQG.n(i11);
        int iD3 = c7999fQG.d(i10) + 1;
        boolean zP2 = c7999fQG.p();
        int iD4 = -1;
        int i14 = 0;
        if (zP2) {
            iD = c7999fQG.d(2);
            int iD5 = c7999fQG.d(3) + 1;
            if (c7999fQG.p()) {
                c7999fQG.n(36);
            }
            int iD6 = c7999fQG.d(3) + 1;
            int iD7 = c7999fQG.d(3) + 1;
            if (iD6 == 1 && iD7 == 1) {
                int i15 = iD2 + 1;
                int iD8 = c7999fQG.d(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    if (((iD8 >> i16) & 1) == 1) {
                        c7999fQG.n(8);
                    }
                }
                int i17 = iD5 * 512;
                if (c7999fQG.p()) {
                    c7999fQG.n(2);
                    int iD9 = (c7999fQG.d(2) + 1) << 2;
                    int iD10 = c7999fQG.d(2) + 1;
                    while (i14 < iD10) {
                        c7999fQG.n(iD9);
                        i14++;
                    }
                }
                i14 = i17;
            } else {
                throw zzbc.c("Multiple audio presentations or assets not supported");
            }
        } else {
            iD = -1;
        }
        c7999fQG.n(i10);
        c7999fQG.n(12);
        if (zP2) {
            if (c7999fQG.p()) {
                c7999fQG.n(4);
            }
            if (c7999fQG.p()) {
                c7999fQG.n(24);
            }
            if (c7999fQG.p()) {
                c7999fQG.o(c7999fQG.d(10) + 1);
            }
            c7999fQG.n(5);
            i12 = f77462d[c7999fQG.d(4)];
            iD4 = c7999fQG.d(8) + 1;
        } else {
            i12 = Reason.OS_VERSION_TOO_LOW;
        }
        int i18 = i12;
        if (zP2) {
            if (iD != 0) {
                if (iD != 1) {
                    if (iD == 2) {
                        i13 = 48000;
                    } else {
                        throw zzbc.a("Unsupported reference clock code in DTS HD header: " + iD, null);
                    }
                } else {
                    i13 = 44100;
                }
            } else {
                i13 = 32000;
            }
            jM = OV.M(i14, 1000000L, i13, RoundingMode.DOWN);
        } else {
            jM = -9223372036854775807L;
        }
        return new C8809n0("audio/vnd.dts.hd;profile=lbr", iD4, i18, iD3, jM, 0, null);
    }
}
