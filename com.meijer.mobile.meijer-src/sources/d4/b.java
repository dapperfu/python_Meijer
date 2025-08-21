package d4;

import De.C3106c;
import android.text.TextUtils;
import d3.C13599a;
import d3.C13608j;
import d3.D;
import d3.P;
import d3.r;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f127975c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f127976d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final D f127977a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f127978b = new StringBuilder();

    private static String f(D d10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int iF = d10.f();
        int iG = d10.g();
        while (iF < iG && !z10) {
            char c10 = (char) d10.e()[iF];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iF++;
                sb2.append(c10);
            }
        }
        d10.X(iF - d10.f());
        return sb2.toString();
    }

    static void n(D d10) {
        while (true) {
            for (boolean z10 = true; d10.a() > 0 && z10; z10 = false) {
                if (c(d10) || b(d10)) {
                    break;
                }
            }
            return;
        }
    }

    private void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f127975c.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                cVar.z((String) C13599a.e(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrC1 = P.c1(str, "\\.");
        String str2 = strArrC1[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            cVar.y(str2.substring(0, iIndexOf2));
            cVar.x(str2.substring(iIndexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (strArrC1.length > 1) {
            cVar.w((String[]) P.S0(strArrC1, 1, strArrC1.length));
        }
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f127976d.matcher(C3106c.e(str));
        if (!matcher.matches()) {
            r.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C13599a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) C13599a.e(matcher.group(1))));
    }

    private static String h(D d10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iF = d10.f();
            String strG = g(d10, sb2);
            if (strG == null) {
                return null;
            }
            if ("}".equals(strG) || ";".equals(strG)) {
                d10.W(iF);
                z10 = true;
            } else {
                sb3.append(strG);
            }
        }
        return sb3.toString();
    }

    public List<c> d(D d10) {
        this.f127978b.setLength(0);
        int iF = d10.f();
        m(d10);
        this.f127977a.U(d10.e(), d10.f());
        this.f127977a.W(iF);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strI = i(this.f127977a, this.f127978b);
            if (strI == null || !"{".equals(g(this.f127977a, this.f127978b))) {
                break;
            }
            c cVar = new c();
            a(cVar, strI);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int iF2 = this.f127977a.f();
                String strG = g(this.f127977a, this.f127978b);
                boolean z11 = strG == null || "}".equals(strG);
                if (!z11) {
                    this.f127977a.W(iF2);
                    j(this.f127977a, cVar, this.f127978b);
                }
                str = strG;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private static boolean b(D d10) {
        int iF = d10.f();
        int iG = d10.g();
        byte[] bArrE = d10.e();
        if (iF + 2 <= iG) {
            int i10 = iF + 1;
            if (bArrE[iF] == 47) {
                int i11 = iF + 2;
                if (bArrE[i10] != 42) {
                    return false;
                }
                while (true) {
                    int i12 = i11 + 1;
                    if (i12 < iG) {
                        if (((char) bArrE[i11]) == '*' && ((char) bArrE[i12]) == '/') {
                            i11 += 2;
                            iG = i11;
                        } else {
                            i11 = i12;
                        }
                    } else {
                        d10.X(iG - d10.f());
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean c(D d10) {
        char cK = k(d10, d10.f());
        if (cK != '\t' && cK != '\n' && cK != '\f' && cK != '\r' && cK != ' ') {
            return false;
        }
        d10.X(1);
        return true;
    }

    static String g(D d10, StringBuilder sb2) {
        n(d10);
        if (d10.a() == 0) {
            return null;
        }
        String strF = f(d10, sb2);
        if (!"".equals(strF)) {
            return strF;
        }
        return "" + ((char) d10.H());
    }

    private static String i(D d10, StringBuilder sb2) {
        String strL;
        n(d10);
        if (d10.a() < 5 || !"::cue".equals(d10.E(5))) {
            return null;
        }
        int iF = d10.f();
        String strG = g(d10, sb2);
        if (strG == null) {
            return null;
        }
        if ("{".equals(strG)) {
            d10.W(iF);
            return "";
        }
        if ("(".equals(strG)) {
            strL = l(d10);
        } else {
            strL = null;
        }
        if (!")".equals(g(d10, sb2))) {
            return null;
        }
        return strL;
    }

    private static void j(D d10, c cVar, StringBuilder sb2) {
        n(d10);
        String strF = f(d10, sb2);
        if (!"".equals(strF) && ":".equals(g(d10, sb2))) {
            n(d10);
            String strH = h(d10, sb2);
            if (strH != null && !"".equals(strH)) {
                int iF = d10.f();
                String strG = g(d10, sb2);
                if (!";".equals(strG)) {
                    if ("}".equals(strG)) {
                        d10.W(iF);
                    } else {
                        return;
                    }
                }
                if ("color".equals(strF)) {
                    cVar.q(C13608j.b(strH));
                    return;
                }
                if ("background-color".equals(strF)) {
                    cVar.n(C13608j.b(strH));
                    return;
                }
                boolean z10 = true;
                if ("ruby-position".equals(strF)) {
                    if ("over".equals(strH)) {
                        cVar.v(1);
                        return;
                    } else {
                        if ("under".equals(strH)) {
                            cVar.v(2);
                            return;
                        }
                        return;
                    }
                }
                if ("text-combine-upright".equals(strF)) {
                    if (!"all".equals(strH) && !strH.startsWith("digits")) {
                        z10 = false;
                    }
                    cVar.p(z10);
                    return;
                }
                if ("text-decoration".equals(strF)) {
                    if ("underline".equals(strH)) {
                        cVar.A(true);
                        return;
                    }
                    return;
                }
                if ("font-family".equals(strF)) {
                    cVar.r(strH);
                    return;
                }
                if ("font-weight".equals(strF)) {
                    if ("bold".equals(strH)) {
                        cVar.o(true);
                    }
                } else if ("font-style".equals(strF)) {
                    if ("italic".equals(strH)) {
                        cVar.u(true);
                    }
                } else if ("font-size".equals(strF)) {
                    e(strH, cVar);
                }
            }
        }
    }

    private static char k(D d10, int i10) {
        return (char) d10.e()[i10];
    }

    private static String l(D d10) {
        int iF = d10.f();
        int iG = d10.g();
        boolean z10 = false;
        while (iF < iG && !z10) {
            int i10 = iF + 1;
            if (((char) d10.e()[iF]) == ')') {
                z10 = true;
            } else {
                z10 = false;
            }
            iF = i10;
        }
        return d10.E((iF - 1) - d10.f()).trim();
    }

    static void m(D d10) {
        while (!TextUtils.isEmpty(d10.s())) {
        }
    }
}
