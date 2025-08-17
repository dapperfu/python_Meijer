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
import c3.C6353d;
import d3.C13466a;
import d3.P;
import d3.r;
import java.util.ArrayDeque;
import java.util.Map;

/* renamed from: a4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5580f {
    public static C5581g f(C5581g c5581g, String[] strArr, Map<String, C5581g> map) {
        int i10 = 0;
        if (c5581g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5581g c5581g2 = new C5581g();
                int length = strArr.length;
                while (i10 < length) {
                    c5581g2.a(map.get(strArr[i10]));
                    i10++;
                }
                return c5581g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return c5581g.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    c5581g.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c5581g;
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    private static C5577c d(C5577c c5577c, Map<String, C5581g> map) {
        while (c5577c != null) {
            C5581g c5581gF = f(c5577c.f44278f, c5577c.l(), map);
            if (c5581gF != null && c5581gF.l() == 1) {
                return c5577c;
            }
            c5577c = c5577c.f44282j;
        }
        return null;
    }

    private static C5577c e(C5577c c5577c, Map<String, C5581g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c5577c);
        while (!arrayDeque.isEmpty()) {
            C5577c c5577c2 = (C5577c) arrayDeque.pop();
            C5581g c5581gF = f(c5577c2.f44278f, c5577c2.l(), map);
            if (c5581gF != null && c5581gF.l() == 3) {
                return c5577c2;
            }
            for (int iG = c5577c2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(c5577c2.f(iG));
            }
        }
        return null;
    }

    public static void a(Spannable spannable, int i10, int i11, C5581g c5581g, C5577c c5577c, Map<String, C5581g> map, int i12) {
        C5577c c5577cE;
        int iK;
        C5581g c5581gF;
        int i13;
        if (c5581g.n() != -1) {
            spannable.setSpan(new StyleSpan(c5581g.n()), i10, i11, 33);
        }
        if (c5581g.u()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (c5581g.v()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (c5581g.s()) {
            c3.g.b(spannable, new ForegroundColorSpan(c5581g.d()), i10, i11, 33);
        }
        if (c5581g.r()) {
            c3.g.b(spannable, new BackgroundColorSpan(c5581g.b()), i10, i11, 33);
        }
        if (c5581g.e() != null) {
            c3.g.b(spannable, new TypefaceSpan(c5581g.e()), i10, i11, 33);
        }
        if (c5581g.q() != null) {
            C5576b c5576b = (C5576b) C13466a.e(c5581g.q());
            int i14 = c5576b.f44270a;
            if (i14 == -1) {
                if (i12 != 2 && i12 != 1) {
                    i14 = 1;
                } else {
                    i14 = 3;
                }
                i13 = 1;
            } else {
                i13 = c5576b.f44271b;
            }
            int i15 = c5576b.f44272c;
            if (i15 == -2) {
                i15 = 1;
            }
            c3.g.b(spannable, new c3.h(i14, i13, i15), i10, i11, 33);
        }
        int iL = c5581g.l();
        if (iL != 2) {
            if (iL == 3 || iL == 4) {
                spannable.setSpan(new C5575a(), i10, i11, 33);
            }
        } else {
            C5577c c5577cD = d(c5577c, map);
            if (c5577cD != null && (c5577cE = e(c5577cD, map)) != null) {
                if (c5577cE.g() == 1 && c5577cE.f(0).f44274b != null) {
                    String str = (String) P.h(c5577cE.f(0).f44274b);
                    C5581g c5581gF2 = f(c5577cE.f44278f, c5577cE.l(), map);
                    if (c5581gF2 != null) {
                        iK = c5581gF2.k();
                    } else {
                        iK = -1;
                    }
                    if (iK == -1 && (c5581gF = f(c5577cD.f44278f, c5577cD.l(), map)) != null) {
                        iK = c5581gF.k();
                    }
                    spannable.setSpan(new c3.f(str, iK), i10, i11, 33);
                } else {
                    r.g("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        }
        if (c5581g.p()) {
            c3.g.b(spannable, new C6353d(), i10, i11, 33);
        }
        int iG = c5581g.g();
        if (iG != 1) {
            if (iG != 2) {
                if (iG != 3) {
                    return;
                }
                c3.g.a(spannable, c5581g.f() / 100.0f, i10, i11, 33);
                return;
            }
            c3.g.b(spannable, new RelativeSizeSpan(c5581g.f()), i10, i11, 33);
            return;
        }
        c3.g.b(spannable, new AbsoluteSizeSpan((int) c5581g.f(), true), i10, i11, 33);
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
