package x3;

import androidx.media3.common.ParserException;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18062a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f170214a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f170215b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: x3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f170216a;

        /* renamed from: b, reason: collision with root package name */
        public final int f170217b;

        /* renamed from: c, reason: collision with root package name */
        public final String f170218c;

        private b(int i10, int i11, String str) {
            this.f170216a = i10;
            this.f170217b = i11;
            this.f170218c = str;
        }
    }

    private static int b(d3.C c10) {
        int iH = c10.h(5);
        return iH == 31 ? c10.h(6) + 32 : iH;
    }

    private static int c(d3.C c10) throws ParserException {
        int iH = c10.h(4);
        if (iH == 15) {
            if (c10.b() >= 24) {
                return c10.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f170214a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & BinsView.TOTE_HEIGHT_DP))};
    }

    public static b e(byte[] bArr) throws ParserException {
        return d(new d3.C(bArr), false);
    }

    public static b d(d3.C c10, boolean z10) throws ParserException {
        int iB = b(c10);
        int iC = c(c10);
        int iH = c10.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(c10);
            iB = b(c10);
            if (iB == 22) {
                iH = c10.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + iB);
                }
            }
            f(c10, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                    int iH2 = c10.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iH2);
                    }
            }
        }
        int i10 = f170215b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw ParserException.a(null, null);
    }

    private static void f(d3.C c10, int i10, int i11) {
        if (c10.g()) {
            d3.r.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c10.g()) {
            c10.r(14);
        }
        boolean zG = c10.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                c10.r(3);
            }
            if (zG) {
                if (i10 == 22) {
                    c10.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    c10.r(3);
                }
                c10.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
