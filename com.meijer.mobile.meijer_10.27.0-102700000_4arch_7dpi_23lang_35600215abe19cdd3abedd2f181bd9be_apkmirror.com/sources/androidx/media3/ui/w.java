package androidx.media3.ui;

import Ce.M;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import androidx.media3.ui.w;
import c3.C6353d;
import d3.C13466a;
import d3.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f57609a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f57610a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f57611b;

        private b(String str, Map<String, String> map) {
            this.f57610a = str;
            this.f57611b = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator<c> f57612e = new Comparator() { // from class: androidx.media3.ui.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w.c.b((w.c) obj, (w.c) obj2);
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator<c> f57613f = new Comparator() { // from class: androidx.media3.ui.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return w.c.a((w.c) obj, (w.c) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f57614a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57615b;

        /* renamed from: c, reason: collision with root package name */
        public final String f57616c;

        /* renamed from: d, reason: collision with root package name */
        public final String f57617d;

        private c(int i10, int i11, String str, String str2) {
            this.f57614a = i10;
            this.f57615b = i11;
            this.f57616c = str;
            this.f57617d = str2;
        }

        public static /* synthetic */ int a(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f57614a, cVar.f57614a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.f57616c.compareTo(cVar.f57616c);
            return iCompareTo != 0 ? iCompareTo : cVar2.f57617d.compareTo(cVar.f57617d);
        }

        public static /* synthetic */ int b(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f57615b, cVar.f57615b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.f57616c.compareTo(cVar2.f57616c);
            return iCompareTo != 0 ? iCompareTo : cVar.f57617d.compareTo(cVar2.f57617d);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f57618a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<c> f57619b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", M.n());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), M.n());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(C6098a.a("bg_" + iIntValue), P.F("background-color:%s;", C6098a.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i10);
            sb2.append(b(spanned.subSequence(i11, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f57619b, c.f57613f);
            Iterator it2 = dVar.f57619b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f57617d);
            }
            Collections.sort(dVar.f57618a, c.f57612e);
            Iterator it3 = dVar.f57618a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f57616c);
            }
            i10++;
            i11 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), map);
    }

    private static String g(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    private static SparseArray<d> c(Spanned spanned, float f10) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f10);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                C13466a.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f57618a.add(cVar);
                f(sparseArray, spanEnd).f57619b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C6353d) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof c3.h)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof c3.f) {
                return "<rt>" + b(((c3.f) obj).f61437a) + "</rt></ruby>";
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String e(Object obj, float f10) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return P.F("<span style='color:%s;'>", C6098a.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return P.F("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof C6353d) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            return P.F("<span style='font-size:%.2fpx;'>", Float.valueOf(((AbsoluteSizeSpan) obj).getDip() ? r3.getSize() : r3.getSize() / f10));
        }
        if (obj instanceof RelativeSizeSpan) {
            return P.F("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return P.F("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof c3.f)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof c3.h)) {
                return null;
            }
            c3.h hVar = (c3.h) obj;
            return P.F("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(hVar.f61442a, hVar.f61443b), g(hVar.f61444c));
        }
        int i10 = ((c3.f) obj).f61438b;
        if (i10 == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i10 == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i10 != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    private static String h(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    private static String b(CharSequence charSequence) {
        return f57609a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static d f(SparseArray<d> sparseArray, int i10) {
        d dVar = sparseArray.get(i10);
        if (dVar == null) {
            d dVar2 = new d();
            sparseArray.put(i10, dVar2);
            return dVar2;
        }
        return dVar;
    }
}
