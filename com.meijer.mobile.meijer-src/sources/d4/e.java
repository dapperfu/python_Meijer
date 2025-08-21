package d4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c3.C6476a;
import c3.C6479d;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import d3.D;
import d3.P;
import d3.r;
import d4.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f127999a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f128000b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f128001c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, Integer> f128002d;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final Comparator<b> f128003c = new Comparator() { // from class: d4.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((e.b) obj).f128004a.f128007b, ((e.b) obj2).f128004a.f128007b);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final c f128004a;

        /* renamed from: b, reason: collision with root package name */
        private final int f128005b;

        private b(c cVar, int i10) {
            this.f128004a = cVar;
            this.f128005b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f128006a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128007b;

        /* renamed from: c, reason: collision with root package name */
        public final String f128008c;

        /* renamed from: d, reason: collision with root package name */
        public final Set<String> f128009d;

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }

        private c(String str, int i10, String str2, Set<String> set) {
            this.f128007b = i10;
            this.f128006a = str;
            this.f128008c = str2;
            this.f128009d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String strTrim = str.trim();
            C13599a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrC1 = P.c1(strTrim, "\\.");
            String str3 = strArrC1[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < strArrC1.length; i11++) {
                hashSet.add(strArrC1[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final int f128010a;

        /* renamed from: b, reason: collision with root package name */
        public final d4.c f128011b;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f128010a, dVar.f128010a);
        }

        public d(int i10, d4.c cVar) {
            this.f128010a = i10;
            this.f128011b = cVar;
        }
    }

    /* renamed from: d4.e$e, reason: collision with other inner class name */
    private static final class C2005e {

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f128014c;

        /* renamed from: a, reason: collision with root package name */
        public long f128012a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f128013b = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f128015d = 2;

        /* renamed from: e, reason: collision with root package name */
        public float f128016e = -3.4028235E38f;

        /* renamed from: f, reason: collision with root package name */
        public int f128017f = 1;

        /* renamed from: g, reason: collision with root package name */
        public int f128018g = 0;

        /* renamed from: h, reason: collision with root package name */
        public float f128019h = -3.4028235E38f;

        /* renamed from: i, reason: collision with root package name */
        public int f128020i = Integer.MIN_VALUE;

        /* renamed from: j, reason: collision with root package name */
        public float f128021j = 1.0f;

        /* renamed from: k, reason: collision with root package name */
        public int f128022k = Integer.MIN_VALUE;

        private static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            r.i("WebvttCueParser", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public d4.d a() {
            return new d4.d(g().a(), this.f128012a, this.f128013b);
        }

        public C6476a.b g() {
            float fE = this.f128019h;
            if (fE == -3.4028235E38f) {
                fE = e(this.f128015d);
            }
            int iF = this.f128020i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.f128015d);
            }
            C6476a.b bVarR = new C6476a.b().p(c(this.f128015d)).h(b(this.f128016e, this.f128017f), this.f128017f).i(this.f128018g).k(fE).l(iF).n(Math.min(this.f128021j, d(iF, fE))).r(this.f128022k);
            CharSequence charSequence = this.f128014c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }

        private static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            if (i10 != 0) {
                return -3.4028235E38f;
            }
            return 1.0f;
        }
    }

    private static int h(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(l3.f93323c, l3.f93323c, l3.f93323c)));
        map.put("lime", Integer.valueOf(Color.rgb(0, l3.f93323c, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, l3.f93323c, l3.f93323c)));
        map.put("red", Integer.valueOf(Color.rgb(l3.f93323c, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(l3.f93323c, l3.f93323c, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(l3.f93323c, 0, l3.f93323c)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, l3.f93323c)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f128001c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(l3.f93323c, l3.f93323c, l3.f93323c)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, l3.f93323c, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, l3.f93323c, l3.f93323c)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(l3.f93323c, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(l3.f93323c, l3.f93323c, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(l3.f93323c, 0, l3.f93323c)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, l3.f93323c)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f128002d = Collections.unmodifiableMap(map2);
    }

    private static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<d4.c> list2) {
        int i10;
        int length;
        i10 = cVar.f128007b;
        length = spannableStringBuilder.length();
        String str2 = cVar.f128006a;
        str2.getClass();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.f128009d, i10, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "v":
                f(spannableStringBuilder, cVar.f128008c, i10, length);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listI = i(list2, str, cVar);
        for (int i11 = 0; i11 < listI.size(); i11++) {
            e(spannableStringBuilder, listI.get(i11).f128011b, i10, length);
        }
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, d4.c cVar, int i10, int i11) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            c3.g.b(spannableStringBuilder, new StyleSpan(cVar.i()), i10, i11, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (cVar.k()) {
            c3.g.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i10, i11, 33);
        }
        if (cVar.j()) {
            c3.g.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i10, i11, 33);
        }
        if (cVar.d() != null) {
            c3.g.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i10, i11, 33);
        }
        int iF = cVar.f();
        if (iF == 1) {
            c3.g.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i10, i11, 33);
        } else if (iF == 2) {
            c3.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i10, i11, 33);
        } else if (iF == 3) {
            c3.g.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i10, i11, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new C6479d(), i10, i11, 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        spannableStringBuilder.setSpan(new c3.i(str), i10, i11, 33);
    }

    private static int g(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static List<d> i(List<d4.c> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d4.c cVar2 = list.get(i10);
            int iH = cVar2.h(str, cVar.f128006a, cVar.f128009d, cVar.f128008c);
            if (iH > 0) {
                arrayList.add(new d(iH, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static C6476a m(CharSequence charSequence) {
        C2005e c2005e = new C2005e();
        c2005e.f128014c = charSequence;
        return c2005e.g().a();
    }

    private static d4.d o(String str, Matcher matcher, D d10, List<d4.c> list) {
        C2005e c2005e = new C2005e();
        try {
            c2005e.f128012a = h.c((String) C13599a.e(matcher.group(1)));
            c2005e.f128013b = h.c((String) C13599a.e(matcher.group(2)));
            q((String) C13599a.e(matcher.group(3)), c2005e);
            StringBuilder sb2 = new StringBuilder();
            String strS = d10.s();
            while (!TextUtils.isEmpty(strS)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strS.trim());
                strS = d10.s();
            }
            c2005e.f128014c = r(str, sb2.toString(), list);
            return c2005e.a();
        } catch (IllegalArgumentException unused) {
            r.i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    static C6476a.b p(String str) {
        C2005e c2005e = new C2005e();
        q(str, c2005e);
        return c2005e.g();
    }

    private static void q(String str, C2005e c2005e) {
        Matcher matcher = f128000b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C13599a.e(matcher.group(1));
            String str3 = (String) C13599a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    t(str3, c2005e);
                } else if ("align".equals(str2)) {
                    c2005e.f128015d = w(str3);
                } else if ("position".equals(str2)) {
                    v(str3, c2005e);
                } else if ("size".equals(str2)) {
                    c2005e.f128021j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    c2005e.f128022k = x(str3);
                } else {
                    r.i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                r.i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    static SpannedString r(String str, String str2, List<d4.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i10, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int iG = i10 + 1;
                if (iG < str2.length()) {
                    boolean z10 = str2.charAt(iG) == '/';
                    iG = g(str2, iG);
                    int i11 = iG - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = iG - 1;
                    }
                    String strSubstring = str2.substring(i12, i11);
                    if (!strSubstring.trim().isEmpty()) {
                        String strK = k(strSubstring);
                        if (l(strK)) {
                            if (z10) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f128006a.equals(strK)) {
                                        break;
                                    }
                                }
                            } else if (!z11) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i10 = iG;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void t(String str, C2005e c2005e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c2005e.f128018g = s(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c2005e.f128016e = h.b(str);
            c2005e.f128017f = 0;
        } else {
            c2005e.f128016e = Integer.parseInt(str);
            c2005e.f128017f = 1;
        }
    }

    private static void v(String str, C2005e c2005e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c2005e.f128020i = u(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c2005e.f128019h = h.b(str);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            Map<String, Integer> map = f128001c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map2 = f128002d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                r.i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<d4.c> list2) {
        int iJ = j(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f128003c);
        int i10 = cVar.f128007b;
        int length = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f128004a.f128006a)) {
                b bVar = (b) arrayList.get(i11);
                int iH = h(j(list2, str, bVar.f128004a), iJ, 1);
                int i12 = bVar.f128004a.f128007b - length;
                int i13 = bVar.f128005b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new c3.f(charSequenceSubSequence.toString(), iH), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    private static int j(List<d4.c> list, String str, c cVar) {
        List<d> listI = i(list, str, cVar);
        for (int i10 = 0; i10 < listI.size(); i10++) {
            d4.c cVar2 = listI.get(i10).f128011b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    private static String k(String str) {
        String strTrim = str.trim();
        C13599a.a(!strTrim.isEmpty());
        return P.d1(strTrim, "[ \\.]")[0];
    }

    private static boolean l(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static d4.d n(D d10, List<d4.c> list) {
        String strS = d10.s();
        if (strS == null) {
            return null;
        }
        Pattern pattern = f127999a;
        Matcher matcher = pattern.matcher(strS);
        if (matcher.matches()) {
            return o(null, matcher, d10, list);
        }
        String strS2 = d10.s();
        if (strS2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strS2);
        if (!matcher2.matches()) {
            return null;
        }
        return o(strS.trim(), matcher2, d10, list);
    }

    private static int s(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int u(String str) {
        str.getClass();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                r.i("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int w(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                r.i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int x(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                r.i("WebvttCueParser", "Invalid 'vertical' value: " + str);
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }
}
