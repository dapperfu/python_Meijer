package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import fsimpl.C14170dq;
import io.constructor.data.local.PreferencesHelper;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class OV {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69931a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f69932b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f69933c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f69934d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f69935e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f69936f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f69937g;

    /* renamed from: h, reason: collision with root package name */
    private static HashMap f69938h;

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f69939i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f69940j;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f69941k;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f69942l;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f69943m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.gms.internal.ads.OV.f69931a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OV.A(int):int");
    }

    public static int C(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int D(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int E(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i10 = Integer.parseInt(str2);
            return z10 ? -i10 : i10;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int F(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long K(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long L(long j10, int i10) {
        return M(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long N(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static String d(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static boolean j(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean l(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Object[] n(Object[] objArr, int i10) {
        C8211gC.d(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        int iO = 65535;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = bArr[i13];
            iO = o(b10 & C14170dq.MULTIPLY, o((b10 & 255) >> 4, iO));
        }
        return iO;
    }

    public static int y(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = f69943m[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int z(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return a.e.API_PRIORITY_OTHER;
                }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f69931a = i10;
        String str = Build.DEVICE;
        f69932b = str;
        String str2 = Build.MANUFACTURER;
        f69933c = str2;
        String str3 = Build.MODEL;
        f69934d = str3;
        f69935e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f69936f = new byte[0];
        f69937g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f69939i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", PreferencesHelper.PREF_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f69940j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f69941k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f69942l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f69943m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_RESET_CONTENT, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpResponseStatus.SUCCESS_CREATED, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, 219, 220, 213, 210, com.medallia.digital.mobilesdk.l3.f93323c, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, HttpResponseStatus.SUCCESS_OK, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, BinsView.TOTE_HEIGHT_DP, com.medallia.digital.mobilesdk.l3.f93324d, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, BinsView.TOTE_WIDTH_DP, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long H(long j10, int i10) {
        return M(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static long I(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long J(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static long M(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? p(j10, j11, j12, roundingMode) : Di0.d(j11, Di0.b(j10, j12, RoundingMode.UNNECESSARY)) : Di0.b(j11, Di0.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : Di0.d(j10, Di0.b(j11, j12, RoundingMode.UNNECESSARY)) : Di0.b(j10, Di0.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static Point O(Context context) throws NumberFormatException {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m(context)) {
            String strQ = f69931a < 28 ? q("sys.display-size") : q("vendor.display-size");
            if (!TextUtils.isEmpty(strQ)) {
                try {
                    String[] strArrSplit = strQ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C10042xL.c("Util", "Invalid display size: ".concat(String.valueOf(strQ)));
            }
            if ("Sony".equals(f69933c) && f69934d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f69931a < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat P(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static C a(int i10, int i11, int i12) {
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B("audio/raw");
        c9717uH0.r0(i11);
        c9717uH0.C(i12);
        c9717uH0.u(i10);
        return c9717uH0.H();
    }

    public static String b(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String c(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strA = C8571jf0.a(str);
        int i10 = 0;
        String str2 = strA.split("-", 2)[0];
        if (f69938h == null) {
            f69938h = r();
        }
        String str3 = (String) f69938h.get(str2);
        if (str3 != null) {
            strA = str3.concat(String.valueOf(strA.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = f69940j;
                int length = strArr.length;
                if (i10 >= 18) {
                    break;
                }
                if (strA.startsWith(strArr[i10])) {
                    return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(strA.substring(strArr[i10].length())));
                }
                i10 += 2;
            }
        }
        return strA;
    }

    public static boolean i(Context context) {
        return f69931a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean k(Context context) {
        int i10 = f69931a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = f69934d;
            if (C8571jf0.c(str, "moto g(20)") || C8571jf0.c(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && C8571jf0.c(f69934d, "sm-x200");
    }

    private static int o(int i10, int i11) {
        return (char) (f69942l[i10 ^ (i11 >> 12)] ^ ((char) (i11 << 4)));
    }

    private static String q(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            C10042xL.d("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f69941k[(i12 >>> 24) ^ (bArr[i10] & com.medallia.digital.mobilesdk.l3.f93323c)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int B(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i11;
        }
        return Integer.reverseBytes(i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L11
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.android.gms.internal.ads.C8571jf0.c(r2, r0)
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r1
        L11:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L19
            return r2
        L19:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L71
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.C8571jf0.a(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L53;
                case 108321: goto L49;
                case 3242057: goto L3f;
                case 3299913: goto L35;
                default: goto L34;
            }
        L34:
            goto L5d
        L35:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r6
            goto L5e
        L3f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r1
            goto L5e
        L49:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r4
            goto L5e
        L53:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L6c
            if (r0 == r6) goto L6a
            if (r0 == r5) goto L68
            if (r0 == r1) goto L68
            r0 = r2
            goto L6d
        L68:
            r0 = r6
            goto L6d
        L6a:
            r0 = r5
            goto L6d
        L6c:
            r0 = r4
        L6d:
            if (r0 != r2) goto L70
            goto L71
        L70:
            return r0
        L71:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.OV.f69937g
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L9d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L9c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L93
            return r4
        L93:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L9c
            return r5
        L9c:
            return r6
        L9d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OV.G(android.net.Uri):int");
    }

    public static Handler Q(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        C8211gC.b(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper R() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return looperMyLooper;
        }
        return Looper.getMainLooper();
    }

    public static void f(long[] jArr, long j10, long j11) {
        long j12;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j11 >= 1000000 && j11 % 1000000 == 0) {
            long jB = Di0.b(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = Di0.b(jArr[i10], jB, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < 1000000 && 1000000 % j11 == 0) {
            long jB2 = Di0.b(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = Di0.d(jArr[i10], jB2);
                i10++;
            }
            return;
        }
        int i11 = 0;
        while (i11 < jArr.length) {
            long j13 = jArr[i11];
            if (j13 == 0) {
                j12 = j11;
            } else {
                if (j11 >= j13 && j11 % j13 == 0) {
                    jArr[i11] = Di0.b(1000000L, Di0.b(j11, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 < j13 && j13 % j11 == 0) {
                    jArr[i11] = Di0.d(1000000L, Di0.b(j13, j11, RoundingMode.UNNECESSARY));
                } else {
                    j12 = j11;
                    jArr[i11] = p(j13, 1000000L, j12, roundingMode);
                }
                j12 = j11;
            }
            i11++;
            j11 = j12;
        }
    }

    public static boolean g(SparseArray sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.k(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean h(com.google.android.gms.internal.ads.GQ r3, com.google.android.gms.internal.ads.GQ r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.r()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.s()
            int r2 = r3.r()
            if (r0 >= r2) goto L1a
            int r0 = r3.r()
            int r0 = r0 + r0
            r4.f(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.n()
            int r2 = r3.t()
            int r3 = r3.r()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.n()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.s()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.k(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.s()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.s()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.f(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OV.h(com.google.android.gms.internal.ads.GQ, com.google.android.gms.internal.ads.GQ, java.util.zip.Inflater):boolean");
    }

    public static boolean m(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    private static long p(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jD = Di0.d(j10, j11);
        if (jD != Long.MAX_VALUE && jD != Long.MIN_VALUE) {
            return Di0.b(jD, j12, roundingMode);
        }
        long jC = Di0.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = Di0.b(j11, jC, roundingMode2);
        long jB2 = Di0.b(j12, jC, roundingMode2);
        long jC2 = Di0.c(Math.abs(j10), Math.abs(jB2));
        long jB3 = Di0.b(j10, jC2, roundingMode2);
        long jB4 = Di0.b(jB2, jC2, roundingMode2);
        long jD2 = Di0.d(jB3, jB);
        if (jD2 != Long.MAX_VALUE && jD2 != Long.MIN_VALUE) {
            return Di0.b(jD2, jB4, roundingMode);
        }
        double d10 = jB3 * (jB / jB4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return C10181yi0.b(d10, roundingMode);
    }

    private static HashMap r() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f69939i.length;
        HashMap map = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f69939i;
            int length3 = strArr.length;
            if (i10 < 88) {
                map.put(strArr[i10], strArr[i10 + 1]);
                i10 += 2;
            } else {
                return map;
            }
        }
    }

    public static int s(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i10 = iBinarySearch + 1;
            if (i10 >= jArr.length || jArr[i10] != j10) {
                break;
            }
            iBinarySearch = i10;
        }
        if (!z10) {
            return i10;
        }
        return iBinarySearch;
    }

    public static int t(XL xl2, long j10, boolean z10, boolean z11) {
        int iA = xl2.a() - 1;
        int i10 = 0;
        while (i10 <= iA) {
            int i11 = (i10 + iA) >>> 1;
            if (xl2.b(i11) < j10) {
                i10 = i11 + 1;
            } else {
                iA = i11 - 1;
            }
        }
        int i12 = iA + 1;
        if (i12 < xl2.a() && xl2.b(i12) == j10) {
            return i12;
        }
        if (iA == -1) {
            return 0;
        }
        return iA;
    }

    public static int u(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            if (z10) {
                i12 = iBinarySearch;
            } else {
                i12 = i11;
            }
        }
        if (z11) {
            return Math.max(0, i12);
        }
        return i12;
    }

    public static int v(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i11 = iBinarySearch - 1;
                if (i11 < 0 || jArr[i11] != j10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i10 = iBinarySearch;
        }
        if (z11) {
            return Math.max(0, i10);
        }
        return i10;
    }
}
