package d3;

import De.C3106c;
import a3.B;
import a3.t;
import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import com.google.android.gms.common.api.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.core.source.CameraSettings;
import fsimpl.C14170dq;
import io.constructor.data.local.PreferencesHelper;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final int f127888a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final String f127889b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final String f127890c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final String f127891d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f127892e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f127893f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f127894g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f127895h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f127896i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f127897j;

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f127898k;

    /* renamed from: l, reason: collision with root package name */
    private static HashMap<String, String> f127899l;

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f127900m;

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f127901n;

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f127902o;

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f127903p;

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f127904q;

    public static Handler B() {
        return C(null);
    }

    public static boolean C0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static long E(long j10, int i10) {
        return X0(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static int I0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    private static String K0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f127901n;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static int P(int i10) {
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

    public static <T> T[] Q0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] R0(T[] tArr, int i10) {
        C13599a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] S0(T[] tArr, int i10, int i11) {
        C13599a.a(i10 >= 0);
        C13599a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static long U0(long j10, int i10) {
        return X0(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static int X(int i10) {
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

    public static int Y(String str) throws NumberFormatException {
        String[] strArrC1;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrC1 = c1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrC1[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrC1[length - 2]);
        try {
            i10 = Integer.parseInt((String) C13599a.e(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static boolean b1(a3.B b10, boolean z10) {
        return b10 == null || !b10.F() || b10.U() == 1 || b10.U() == 4 || (z10 && b10.x() != 0);
    }

    public static String[] c1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] d1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static <T> T h(T t10) {
        return t10;
    }

    public static <T> T[] i(T[] tArr) {
        return tArr;
    }

    public static long i1(int i10) {
        return i10 & 4294967295L;
    }

    public static int j(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static long k(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static boolean r(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean s(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f127888a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s0(a3.B r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.U()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.v(r3)
            if (r3 == 0) goto L17
            r4.g()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.v(r3)
            if (r1 == 0) goto L24
            r4.m()
            goto L15
        L24:
            boolean r1 = r4.v(r2)
            if (r1 == 0) goto L2e
            r4.i()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.P.s0(a3.B):boolean");
    }

    public static Handler z() {
        return A(null);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f127888a = i10;
        String str = Build.DEVICE;
        f127889b = str;
        String str2 = Build.MANUFACTURER;
        f127890c = str2;
        String str3 = Build.MODEL;
        f127891d = str3;
        f127892e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f127893f = new byte[0];
        f127894g = new long[0];
        f127895h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f127896i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f127897j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f127898k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f127900m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", PreferencesHelper.PREF_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f127901n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f127902o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f127903p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f127904q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_RESET_CONTENT, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, HttpResponseStatus.SUCCESS_CREATED, HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, 219, 220, 213, 210, l3.f93323c, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, HttpResponseStatus.SUCCESS_OK, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, BinsView.TOTE_HEIGHT_DP, l3.f93324d, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, BinsView.TOTE_WIDTH_DP, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, HttpResponseStatus.SUCCESS_NO_CONTENT, HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean B0(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean D0(Context context) {
        int i10 = f127888a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (C3106c.a(str, "moto g(20)") || C3106c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && C3106c.a(Build.MODEL, "sm-x200");
    }

    public static boolean E0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static String F(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String G(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String H(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static int J(int i10) {
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

    public static AudioFormat K(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    @SuppressLint({"InlinedApi"})
    public static int L(int i10) {
        if (i10 == 10) {
            return f127888a >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return f127888a >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return HttpResponseStatus.SUCCESS_NO_CONTENT;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static <T> void L0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String M(int i10) {
        if (i10 == 0) {
            return "undefined";
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static ExecutorService N0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: d3.N
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return P.b(str, runnable);
            }
        });
    }

    public static ScheduledExecutorService O0(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: d3.O
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return P.a(str, runnable);
            }
        });
    }

    public static String P0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = C3106c.e(str);
        String str2 = d1(strE, "-")[0];
        if (f127899l == null) {
            f127899l = D();
        }
        String str3 = f127899l.get(str2);
        if (str3 != null) {
            strE = str3 + strE.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? K0(strE) : strE;
    }

    public static String Q(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C3106c.f(networkCountryIso);
            }
        }
        return C3106c.f(Locale.getDefault().getCountry());
    }

    public static Point R(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) C13599a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return S(context, display);
    }

    public static Locale U() {
        return f127888a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static long V0(long j10, long j11, long j12) {
        return X0(j10, j11, j12, RoundingMode.DOWN);
    }

    public static void W0(long[] jArr, long j10, long j11) {
        Z0(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static long X0(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? Y0(j10, j11, j12, roundingMode) : He.d.e(j11, He.d.b(j10, j12, RoundingMode.UNNECESSARY)) : He.d.b(j11, He.d.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : He.d.e(j10, He.d.b(j11, j12, RoundingMode.UNNECESSARY)) : He.d.b(j10, He.d.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static String Z(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static void Z0(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jB = He.d.b(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = He.d.b(jArr[i10], jB, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jB2 = He.d.b(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = He.d.e(jArr[i10], jB2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = He.d.b(j10, He.d.b(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = Y0(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = He.d.e(j10, He.d.b(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static boolean a1(a3.B b10) {
        if (b10 == null || !b10.v(1)) {
            return false;
        }
        return (b10.v(17) && b10.y().q()) ? false : true;
    }

    public static /* synthetic */ Thread b(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static long c(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static long c0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static int e0(int i10) {
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

    public static a3.t f0(int i10, int i11, int i12) {
        return new t.b().u0("audio/raw").R(i11).v0(i12).o0(i10).N();
    }

    public static long f1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static String g1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & C14170dq.MULTIPLY, 16));
        }
        return sb2.toString();
    }

    public static long h0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static List<String> i0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & RecyclerView.m.FLAG_MOVED) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static List<String> j0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add(CameraSettings.FOCUS_STRATEGY_AUTO);
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static void l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int m(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String o0(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            r.e("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static byte[] q0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static boolean r0(a3.B b10) {
        if (b10 == null || !b10.v(1)) {
            return false;
        }
        b10.pause();
        return true;
    }

    public static <T> int t(SparseArray<T> sparseArray) {
        if (f127888a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iKeyAt = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i10)) * 31) + Objects.hashCode(sparseArray.valueAt(i10));
        }
        return iKeyAt;
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int iB = Je.i.b(bArr[i10]);
            i12 = v(iB & 15, v(iB >> 4, i12));
            i10++;
        }
        return i12;
    }

    private static int v(int i10, int i11) {
        return (f127903p[(i10 ^ ((i11 >> 12) & l3.f93323c)) & l3.f93323c] ^ ((i11 << 4) & 65535)) & 65535;
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f127902o[((i12 >>> 24) ^ (bArr[i10] & l3.f93323c)) & l3.f93323c] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int w0(Uri uri, String str) {
        if (str == null) {
            return u0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f127904q[i12 ^ (bArr[i10] & l3.f93323c)];
            i10++;
        }
        return i12;
    }

    public static Handler y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String y0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean z0(Context context) {
        return f127888a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Handler A(Handler.Callback callback) {
        return y((Looper) C13599a.i(Looper.myLooper()), callback);
    }

    public static boolean A0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                if (f127888a >= 34) {
                    return true;
                }
                return false;
            case "image/heic":
            case "image/heif":
                if (f127888a >= 26) {
                    return true;
                }
                return false;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static Handler C(Handler.Callback callback) {
        return y(T(), callback);
    }

    private static HashMap<String, String> D() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f127900m.length);
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
            String[] strArr = f127900m;
            if (i10 < strArr.length) {
                map.put(strArr[i10], strArr[i10 + 1]);
                i10 += 2;
            } else {
                return map;
            }
        }
    }

    public static boolean F0(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    public static boolean G0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static boolean H0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int I(Context context) {
        return b3.m.c(context).generateAudioSessionId();
    }

    public static boolean J0(D d10, D d11, Inflater inflater) {
        if (d10.a() > 0 && d10.j() == 120 && x0(d10, d11, inflater)) {
            return true;
        }
        return false;
    }

    public static B.b N(a3.B b10, B.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zJ = b10.j();
        boolean zT = b10.T();
        boolean zN = b10.N();
        boolean zS = b10.s();
        boolean zI0 = b10.i0();
        boolean zW = b10.w();
        boolean zQ = b10.y().q();
        B.b.a aVarD = new B.b.a().b(bVar).d(4, !zJ);
        boolean z16 = false;
        if (zT && !zJ) {
            z10 = true;
        } else {
            z10 = false;
        }
        B.b.a aVarD2 = aVarD.d(5, z10);
        if (zN && !zJ) {
            z11 = true;
        } else {
            z11 = false;
        }
        B.b.a aVarD3 = aVarD2.d(6, z11);
        if (!zQ && ((zN || !zI0 || zT) && !zJ)) {
            z12 = true;
        } else {
            z12 = false;
        }
        B.b.a aVarD4 = aVarD3.d(7, z12);
        if (zS && !zJ) {
            z13 = true;
        } else {
            z13 = false;
        }
        B.b.a aVarD5 = aVarD4.d(8, z13);
        if (!zQ && ((zS || (zI0 && zW)) && !zJ)) {
            z14 = true;
        } else {
            z14 = false;
        }
        B.b.a aVarD6 = aVarD5.d(9, z14).d(10, !zJ);
        if (zT && !zJ) {
            z15 = true;
        } else {
            z15 = false;
        }
        B.b.a aVarD7 = aVarD6.d(11, z15);
        if (zT && !zJ) {
            z16 = true;
        }
        return aVarD7.d(12, z16).e();
    }

    public static int O(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return i11;
        }
        return Integer.reverseBytes(i11);
    }

    public static Point S(Context context, Display display) throws ClassNotFoundException, NumberFormatException {
        String strO0;
        if (display.getDisplayId() == 0 && G0(context)) {
            if (f127888a < 28) {
                strO0 = o0("sys.display-size");
            } else {
                strO0 = o0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strO0)) {
                try {
                    String[] strArrC1 = c1(strO0.trim(), "x");
                    if (strArrC1.length == 2) {
                        int i10 = Integer.parseInt(strArrC1[0]);
                        int i11 = Integer.parseInt(strArrC1[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                r.d("Util", "Invalid display size: " + strO0);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f127888a >= 23) {
            V(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static Looper T() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            return looperMyLooper;
        }
        return Looper.getMainLooper();
    }

    public static boolean T0(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    private static void V(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static Drawable W(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    private static long Y0(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jE = He.d.e(j10, j11);
        if (jE != Long.MAX_VALUE && jE != Long.MIN_VALUE) {
            return He.d.b(jE, j12, roundingMode);
        }
        long jC = He.d.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = He.d.b(j11, jC, roundingMode2);
        long jB2 = He.d.b(j12, jC, roundingMode2);
        long jC2 = He.d.c(Math.abs(j10), Math.abs(jB2));
        long jB3 = He.d.b(j10, jC2, roundingMode2);
        long jB4 = He.d.b(jB2, jC2, roundingMode2);
        long jE2 = He.d.e(jB3, jB);
        if (jE2 != Long.MAX_VALUE && jE2 != Long.MIN_VALUE) {
            return He.d.b(jE2, jB4, roundingMode);
        }
        double d10 = jB3 * (jB / jB4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return He.a.f(d10, roundingMode);
    }

    public static String a0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static int b0(Context context) {
        if (D0(context)) {
            return 1;
        }
        return 5;
    }

    public static int d(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            if (z10) {
                i11 = iBinarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z11) {
            return Math.min(jArr.length - 1, i11);
        }
        return i11;
    }

    public static int e(s sVar, long j10, boolean z10, boolean z11) {
        int i10;
        int iD = sVar.d() - 1;
        int i11 = 0;
        while (i11 <= iD) {
            int i12 = (i11 + iD) >>> 1;
            if (sVar.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                iD = i12 - 1;
            }
        }
        if (z10 && (i10 = iD + 1) < sVar.d() && sVar.c(i10) == j10) {
            return i10;
        }
        if (z11 && iD == -1) {
            return 0;
        }
        return iD;
    }

    public static String[] e1(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return c1(str.trim(), "(\\s*,\\s*)");
    }

    public static int f(int[] iArr, int i10, boolean z10, boolean z11) {
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

    public static int g(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            if (z10) {
                i11 = iBinarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z11) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static int g0(int i10, int i11) {
        return P(i10) * i11;
    }

    public static long h1(int i10, int i11) {
        return i1(i11) | (i1(i10) << 32);
    }

    public static String[] l0() {
        String[] strArrM0 = m0();
        for (int i10 = 0; i10 < strArrM0.length; i10++) {
            strArrM0[i10] = P0(strArrM0[i10]);
        }
        return strArrM0;
    }

    private static String[] m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f127888a >= 24) {
            return n0(configuration);
        }
        return new String[]{a0(configuration.locale)};
    }

    public static float n(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    private static String[] n0(Configuration configuration) {
        return c1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static int o(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static long p(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static String p0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return zzbz.UNKNOWN_CONTENT_TYPE;
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
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    return "custom (" + i10 + ")";
                }
                return "?";
        }
    }

    public static <T> boolean q(SparseArray<T> sparseArray, int i10) {
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean t0(a3.B b10, boolean z10) {
        if (b1(b10, z10)) {
            return s0(b10);
        }
        return r0(b10);
    }

    public static int u0(Uri uri) {
        int iV0;
        String scheme = uri.getScheme();
        if (scheme != null && C3106c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iV0 = v0(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iV0;
        }
        Matcher matcher = f127898k.matcher((CharSequence) C13599a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int v0(String str) {
        String strE = C3106c.e(str);
        strE.getClass();
        switch (strE) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static boolean x0(D d10, D d11, Inflater inflater) {
        if (d10.a() <= 0) {
            return false;
        }
        if (d11.b() < d10.a()) {
            d11.c(d10.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(d10.e(), d10.f(), d10.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(d11.e(), iInflate, d11.b() - iInflate);
                if (inflater.finished()) {
                    d11.V(iInflate);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (iInflate == d11.b()) {
                    d11.c(d11.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static long M0(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 * 1000;
        }
        return j10;
    }

    public static long d0(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j10;
    }

    public static long j1(long j10) {
        if (j10 != -9223372036854775807L && j10 != Long.MIN_VALUE) {
            return j10 / 1000;
        }
        return j10;
    }

    public static String k0(StringBuilder sb2, Formatter formatter, long j10) {
        String str;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        if (j10 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        if (j13 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }
}
