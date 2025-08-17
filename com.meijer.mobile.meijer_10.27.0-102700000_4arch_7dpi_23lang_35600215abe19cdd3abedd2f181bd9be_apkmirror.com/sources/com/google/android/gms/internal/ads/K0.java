package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f68002a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f68003b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f68004c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f68005d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f68006e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f68007f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f68008g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int c(int i10) {
        int i11;
        int i12;
        if (!m(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = i10 >>> 12;
        int i14 = (i10 >>> 10) & 3;
        int i15 = i13 & 15;
        if (i15 == 0 || i15 == 15 || i14 == 3) {
            return -1;
        }
        return l(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int i10, int i11) {
        return i11 != 1 ? i11 != 2 ? 384 : 1152 : i10 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!m(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = i13 - 1;
        int i18 = f68003b[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f68004c[i17];
            } else {
                i16 = f68005d[i17];
            }
            return (((i16 * 12) / i18) + i19) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = f68006e[i17];
            } else {
                i15 = f68007f[i17];
            }
        } else {
            i15 = f68008g[i17];
        }
        int i20 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i18) + i19;
        }
        if (i12 == 1) {
            i20 = 72;
        }
        return ((i20 * i15) / i18) + i19;
    }
}
