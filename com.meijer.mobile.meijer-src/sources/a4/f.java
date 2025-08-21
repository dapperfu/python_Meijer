package a4;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c3.C6479d;
import d3.C13599a;
import d3.P;
import d3.r;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes4.dex */
final class f {
    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    private static C5660c d(C5660c c5660c, Map<String, g> map) {
        while (c5660c != null) {
            g gVarF = f(c5660c.f45096f, c5660c.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return c5660c;
            }
            c5660c = c5660c.f45100j;
        }
        return null;
    }

    private static C5660c e(C5660c c5660c, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5660c);
        while (!arrayDeque.isEmpty()) {
            C5660c c5660c2 = (C5660c) arrayDeque.pop();
            g gVarF = f(c5660c2.f45096f, c5660c2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return c5660c2;
            }
            for (int iG = c5660c2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(c5660c2.f(iG));
            }
        }
        return null;
    }

    public static void a(Spannable spannable, int i10, int i11, g gVar, C5660c c5660c, Map<String, g> map, int i12) {
        C5660c c5660cE;
        int iK;
        g gVarF;
        int i13;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i10, i11, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.s()) {
            c3.g.b(spannable, new ForegroundColorSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.r()) {
            c3.g.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.e() != null) {
            c3.g.b(spannable, new TypefaceSpan(gVar.e()), i10, i11, 33);
        }
        if (gVar.q() != null) {
            C5659b c5659b = (C5659b) C13599a.e(gVar.q());
            int i14 = c5659b.f45088a;
            if (i14 == -1) {
                if (i12 != 2 && i12 != 1) {
                    i14 = 1;
                } else {
                    i14 = 3;
                }
                i13 = 1;
            } else {
                i13 = c5659b.f45089b;
            }
            int i15 = c5659b.f45090c;
            if (i15 == -2) {
                i15 = 1;
            }
            c3.g.b(spannable, new c3.h(i14, i13, i15), i10, i11, 33);
        }
        int iL = gVar.l();
        if (iL != 2) {
            if (iL == 3 || iL == 4) {
                spannable.setSpan(new C5658a(), i10, i11, 33);
            }
        } else {
            C5660c c5660cD = d(c5660c, map);
            if (c5660cD != null && (c5660cE = e(c5660cD, map)) != null) {
                if (c5660cE.g() == 1 && c5660cE.f(0).f45092b != null) {
                    String str = (String) P.h(c5660cE.f(0).f45092b);
                    g gVarF2 = f(c5660cE.f45096f, c5660cE.l(), map);
                    if (gVarF2 != null) {
                        iK = gVarF2.k();
                    } else {
                        iK = -1;
                    }
                    if (iK == -1 && (gVarF = f(c5660cD.f45096f, c5660cD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new c3.f(str, iK), i10, i11, 33);
                } else {
                    r.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (gVar.p()) {
            c3.g.b(spannable, new C6479d(), i10, i11, 33);
        }
        int iG = gVar.g();
        if (iG != 1) {
            if (iG != 2) {
                if (iG != 3) {
                    return;
                }
                c3.g.a(spannable, gVar.f() / 100.0f, i10, i11, 33);
                return;
            }
            c3.g.b(spannable, new RelativeSizeSpan(gVar.f()), i10, i11, 33);
            return;
        }
        c3.g.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i10, i11, 33);
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
