package d3;

import a3.C5570j;
import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* renamed from: d3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13474i {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f127117a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f127118b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f127119c = Pattern.compile("^\\D?(\\d+)$");

    public static List<byte[]> e(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    private static Integer i(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Pair<Integer, Integer> k(String str, String[] strArr) {
        int iT;
        if (strArr.length != 3) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(a3.z.h(Integer.parseInt(strArr[1], 16))) && (iT = t(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iT), 0);
            }
        } catch (NumberFormatException unused) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr, C5570j c5570j) throws NumberFormatException {
        int i10;
        if (strArr.length < 4) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                r.i("CodecSpecificDataUtil", "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                r.i("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (c5570j == null || !(c5570j.f43848d != null || (i10 = c5570j.f43847c) == 7 || i10 == 6)) ? 2 : RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT : 1;
            int iA = a(i12);
            if (iA != -1) {
                return new Pair<>(Integer.valueOf(i14), Integer.valueOf(iA));
            }
            r.i("CodecSpecificDataUtil", "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> m(String str, String[] strArr) throws NumberFormatException {
        int i10;
        int i11;
        if (strArr.length < 2) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    r.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int iC = c(i11);
            if (iC == -1) {
                r.i("CodecSpecificDataUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iB = b(i10);
            if (iB != -1) {
                return new Pair<>(Integer.valueOf(iC), Integer.valueOf(iB));
            }
            r.i("CodecSpecificDataUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        if (strArr.length < 3) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f127119c.matcher(strArr[1]);
        if (!matcher.matches()) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numJ = j(strGroup);
        if (numJ == null) {
            r.i("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numI = i(str2);
        if (numI != null) {
            return new Pair<>(numJ, numI);
        }
        r.i("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    public static Pair<Integer, Integer> q(String str, String[] strArr, C5570j c5570j) {
        if (strArr.length < 4) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f127119c.matcher(strArr[1]);
        if (!matcher.matches()) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i10 = 6;
            if ("2".equals(strGroup)) {
                i10 = (c5570j == null || c5570j.f43847c != 6) ? 2 : RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            } else if (!"6".equals(strGroup)) {
                r.i("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numS = s(str2);
        if (numS != null) {
            return new Pair<>(Integer.valueOf(i10), numS);
        }
        r.i("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> r(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iX = x(i10);
            if (iX == -1) {
                r.i("CodecSpecificDataUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iW = w(i11);
            if (iW != -1) {
                return new Pair<>(Integer.valueOf(iX), Integer.valueOf(iW));
            }
            r.i("CodecSpecificDataUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer s(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int x(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int c(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(P.F("hvc1.%s%d.%X.%c%d", f127118b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f127117a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static Ce.L<byte[]> h(byte b10, byte b11, byte b12, byte b13) {
        return Ce.L.y(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> n(a3.t r6) {
        /*
            java.lang.String r0 = r6.f43945k
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f43949o
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f43945k
            android.util.Pair r6 = o(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L7a;
                case 3006243: goto L6f;
                case 3006244: goto L64;
                case 3199032: goto L59;
                case 3214780: goto L4e;
                case 3356560: goto L43;
                case 3475740: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L83
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 7
            goto L83
        L38:
            java.lang.String r2 = "s263"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 6
            goto L83
        L43:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 5
            goto L83
        L4e:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 4
            goto L83
        L59:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 3
            goto L83
        L64:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 2
            goto L83
        L6f:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L78
            goto L2b
        L78:
            r2 = 1
            goto L83
        L7a:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L83
            goto L2b
        L83:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La5;
                case 2: goto La5;
                case 3: goto L9c;
                case 4: goto L9c;
                case 5: goto L95;
                case 6: goto L8e;
                case 7: goto L87;
                default: goto L86;
            }
        L86:
            return r1
        L87:
            java.lang.String r6 = r6.f43945k
            android.util.Pair r6 = r(r6, r0)
            return r6
        L8e:
            java.lang.String r6 = r6.f43945k
            android.util.Pair r6 = p(r6, r0)
            return r6
        L95:
            java.lang.String r6 = r6.f43945k
            android.util.Pair r6 = k(r6, r0)
            return r6
        L9c:
            java.lang.String r1 = r6.f43945k
            a3.j r6 = r6.f43922C
            android.util.Pair r6 = q(r1, r0, r6)
            return r6
        La5:
            java.lang.String r6 = r6.f43945k
            android.util.Pair r6 = m(r6, r0)
            return r6
        Lac:
            java.lang.String r1 = r6.f43945k
            a3.j r6 = r6.f43922C
            android.util.Pair r6 = l(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.C13474i.n(a3.t):android.util.Pair");
    }

    private static Pair<Integer, Integer> p(String str, String[] strArr) throws NumberFormatException {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            r.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    private static int t(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair<Integer, Integer> u(byte[] bArr) {
        D d10 = new D(bArr);
        d10.W(9);
        int iH = d10.H();
        d10.W(20);
        return Pair.create(Integer.valueOf(d10.L()), Integer.valueOf(iH));
    }

    private static int w(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return RecyclerView.m.FLAG_MOVED;
            case 61:
                return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return RecyclerView.m.FLAG_MOVED;
            case 12:
                return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case l3.f92486e /* 32 */:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return RecyclerView.m.FLAG_MOVED;
                                    case 41:
                                        return RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static String d(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static boolean v(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            return false;
        }
        return true;
    }
}
