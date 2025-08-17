package Y3;

import He.f;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import d3.C13466a;
import d3.P;
import d3.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f40079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40080b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f40081c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f40082d;

    /* renamed from: e, reason: collision with root package name */
    public final float f40083e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f40084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f40085g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f40086h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f40087i;

    /* renamed from: j, reason: collision with root package name */
    public final int f40088j;

    static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Pattern f40100c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d, reason: collision with root package name */
        private static final Pattern f40101d = Pattern.compile(P.F("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e, reason: collision with root package name */
        private static final Pattern f40102e = Pattern.compile(P.F("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f, reason: collision with root package name */
        private static final Pattern f40103f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a, reason: collision with root package name */
        public final int f40104a;

        /* renamed from: b, reason: collision with root package name */
        public final PointF f40105b;

        private static int a(String str) {
            Matcher matcher = f40103f.matcher(str);
            if (matcher.find()) {
                return c.e((String) C13466a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f40100c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) C13466a.e(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f40101d.matcher(str);
            Matcher matcher2 = f40102e.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    r.g("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C13466a.e(strGroup)).trim()), Float.parseFloat(((String) C13466a.e(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f40100c.matcher(str).replaceAll("");
        }

        private b(int i10, PointF pointF) {
            this.f40104a = i10;
            this.f40105b = pointF;
        }
    }

    private static boolean d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    private static boolean f(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f40089a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40090b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40091c;

        /* renamed from: d, reason: collision with root package name */
        public final int f40092d;

        /* renamed from: e, reason: collision with root package name */
        public final int f40093e;

        /* renamed from: f, reason: collision with root package name */
        public final int f40094f;

        /* renamed from: g, reason: collision with root package name */
        public final int f40095g;

        /* renamed from: h, reason: collision with root package name */
        public final int f40096h;

        /* renamed from: i, reason: collision with root package name */
        public final int f40097i;

        /* renamed from: j, reason: collision with root package name */
        public final int f40098j;

        /* renamed from: k, reason: collision with root package name */
        public final int f40099k;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static Y3.c.a a(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Y3.c.a.a(java.lang.String):Y3.c$a");
        }

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f40089a = i10;
            this.f40090b = i11;
            this.f40091c = i12;
            this.f40092d = i13;
            this.f40093e = i14;
            this.f40094f = i15;
            this.f40095g = i16;
            this.f40096h = i17;
            this.f40097i = i18;
            this.f40098j = i19;
            this.f40099k = i20;
        }
    }

    public static c b(String str, a aVar) {
        boolean z10;
        boolean z11;
        C13466a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i10 = aVar.f40099k;
        if (length != i10) {
            r.i("SsaStyle", P.F("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f40089a].trim();
            int i11 = aVar.f40090b;
            int iE = i11 != -1 ? e(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f40091c;
            Integer numH = i12 != -1 ? h(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f40092d;
            Integer numH2 = i13 != -1 ? h(strArrSplit[i13].trim()) : null;
            int i14 = aVar.f40093e;
            float fI = i14 != -1 ? i(strArrSplit[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f40094f;
            boolean z12 = false;
            boolean z13 = true;
            if (i15 == -1 || !f(strArrSplit[i15].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z12 = true;
            }
            int i16 = aVar.f40095g;
            if (i16 == -1 || !f(strArrSplit[i16].trim())) {
                z11 = true;
                z13 = z10;
            } else {
                z11 = true;
            }
            int i17 = aVar.f40096h;
            if (i17 == -1 || !f(strArrSplit[i17].trim())) {
                z11 = false;
            }
            int i18 = aVar.f40097i;
            boolean z14 = i18 != -1 && f(strArrSplit[i18].trim());
            int i19 = aVar.f40098j;
            return new c(strTrim, iE, numH, numH2, fI, z12, z13, z11, z14, i19 != -1 ? g(strArrSplit[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            r.j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    public static Integer h(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C13466a.a(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((j10 >> 24) & 255) ^ 255), f.d(j10 & 255), f.d((j10 >> 8) & 255), f.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            r.j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    private c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f40079a = str;
        this.f40080b = i10;
        this.f40081c = num;
        this.f40082d = num2;
        this.f40083e = f10;
        this.f40084f = z10;
        this.f40085g = z11;
        this.f40086h = z12;
        this.f40087i = z13;
        this.f40088j = i11;
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int g(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (d(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        r.i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    private static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            r.j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
