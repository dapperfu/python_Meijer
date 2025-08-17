package a3;

import Be.C2957c;
import android.text.TextUtils;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13466a;
import d3.P;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList<a> f44258a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f44259b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f44260a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44261b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44262c;
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f44263a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44264b;

        public int a() {
            int i10 = this.f44264b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }

        public b(int i10, int i11) {
            this.f44263a = i10;
            this.f44264b = i11;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarI;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarI = i(str2)) != null && (iA = bVarI.a()) != 0 && iA != 16) {
                }
                break;
        }
        return false;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : P.e1(str)) {
            String strG = g(str2);
            if (strG != null && n(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrE1 = P.e1(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrE1) {
                if (str2.equals(g(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static String g(String str) {
        b bVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strE = C2957c.e(str.trim());
        if (strE.startsWith("avc1") || strE.startsWith("avc3")) {
            return "video/avc";
        }
        if (strE.startsWith("hev1") || strE.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strE.startsWith("dvav") || strE.startsWith("dva1") || strE.startsWith("dvhe") || strE.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strE.startsWith("av01")) {
            return "video/av01";
        }
        if (strE.startsWith("vp9") || strE.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strE.startsWith("vp8") || strE.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strE.startsWith("mp4a")) {
            return strE.startsWith("mha1") ? "audio/mha1" : strE.startsWith("mhm1") ? "audio/mhm1" : (strE.startsWith("ac-3") || strE.startsWith("dac3")) ? "audio/ac3" : (strE.startsWith("ec-3") || strE.startsWith("dec3")) ? "audio/eac3" : strE.startsWith("ec+3") ? "audio/eac3-joc" : (strE.startsWith("ac-4") || strE.startsWith("dac4")) ? "audio/ac4" : strE.startsWith("dtsc") ? "audio/vnd.dts" : strE.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strE.startsWith("dtsh") || strE.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strE.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strE.startsWith("opus") ? "audio/opus" : strE.startsWith("vorbis") ? "audio/vorbis" : strE.startsWith("flac") ? "audio/flac" : strE.startsWith("stpp") ? "application/ttml+xml" : strE.startsWith("wvtt") ? "text/vtt" : strE.contains("cea708") ? "application/cea-708" : (strE.contains("eia608") || strE.contains("cea608")) ? "application/cea-608" : e(strE);
        }
        if (strE.startsWith("mp4a.") && (bVarI = i(strE)) != null) {
            strH = h(bVarI.f44263a);
        }
        return strH == null ? "audio/mp4a-latm" : strH;
    }

    private static String j(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : P.e1(str)) {
            String strG = g(str2);
            if (strG != null && q(strG)) {
                return strG;
            }
        }
        return null;
    }

    private static String e(String str) {
        int size = f44258a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f44258a.get(i10);
            if (str.startsWith(aVar.f44261b)) {
                return aVar.f44260a;
            }
        }
        return null;
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case HttpResponseStatus.INFORMATIONAL_CONTINUE /* 100 */:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b i(String str) {
        Matcher matcher = f44259b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C13466a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int l(String str) {
        int size = f44258a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f44258a.get(i10);
            if (str.equals(aVar.f44260a)) {
                return aVar.f44262c;
            }
        }
        return -1;
    }

    public static boolean n(String str) {
        return "audio".equals(j(str));
    }

    public static boolean o(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean p(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean q(String str) {
        return "video".equals(j(str));
    }

    public static String r(String str) {
        String strE;
        if (str == null) {
            return null;
        }
        strE = C2957c.e(str);
        strE.getClass();
        switch (strE) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strE;
        }
    }

    public static boolean b(String str, String str2) {
        if (d(str, str2) != null) {
            return true;
        }
        return false;
    }

    public static int f(String str, String str2) {
        b bVarI;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return bVarI.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (n(str)) {
            return 1;
        }
        if (q(str)) {
            return 2;
        }
        if (p(str)) {
            return 3;
        }
        if (o(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            return l(str);
        }
        return 5;
    }
}
