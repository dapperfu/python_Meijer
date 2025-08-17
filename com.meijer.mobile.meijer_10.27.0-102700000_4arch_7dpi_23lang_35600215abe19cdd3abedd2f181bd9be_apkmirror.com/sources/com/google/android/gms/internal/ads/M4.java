package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
final class M4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68505a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68506b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68507c;

    /* renamed from: d, reason: collision with root package name */
    public final long f68508d;

    /* renamed from: e, reason: collision with root package name */
    public final long f68509e;

    /* renamed from: f, reason: collision with root package name */
    public final S4 f68510f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f68511g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68512h;

    /* renamed from: i, reason: collision with root package name */
    public final String f68513i;

    /* renamed from: j, reason: collision with root package name */
    public final M4 f68514j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap f68515k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap f68516l;

    /* renamed from: m, reason: collision with root package name */
    private List f68517m;

    private final void l(long j10, Map map, Map map2, String str, Map map3) {
        Iterator it;
        M4 m42;
        S4 s4A;
        int i10;
        int i11;
        Map map4 = map;
        if (g(j10)) {
            String str2 = !"".equals(this.f68512h) ? this.f68512h : str;
            Iterator it2 = this.f68516l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.f68515k.containsKey(str3) ? ((Integer) this.f68515k.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C7318Ww c7318Ww = (C7318Ww) map3.get(str3);
                    c7318Ww.getClass();
                    Q4 q42 = (Q4) map2.get(str2);
                    q42.getClass();
                    int i12 = q42.f69495j;
                    S4 s4A2 = R4.a(this.f68510f, this.f68511g, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c7318Ww.q();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c7318Ww.l(spannableStringBuilder);
                    }
                    if (s4A2 != null) {
                        M4 m43 = this.f68514j;
                        if (s4A2.r() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(s4A2.r()), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.i()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.j()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.h()) {
                            DA.b(spannableStringBuilder, new ForegroundColorSpan(s4A2.n()), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.g()) {
                            DA.b(spannableStringBuilder, new BackgroundColorSpan(s4A2.m()), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.d() != null) {
                            DA.b(spannableStringBuilder, new TypefaceSpan(s4A2.d()), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.u() != null) {
                            L4 l4U = s4A2.u();
                            l4U.getClass();
                            int i13 = l4U.f68257a;
                            it = it2;
                            if (i13 == -1) {
                                i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = l4U.f68258b;
                            }
                            int i14 = l4U.f68259c;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            DA.b(spannableStringBuilder, new C7870eB(i13, i11, i14), iIntValue, iIntValue2, 33);
                        } else {
                            it = it2;
                        }
                        int iQ = s4A2.q();
                        if (iQ == 2) {
                            while (true) {
                                if (m43 == null) {
                                    m43 = null;
                                    break;
                                }
                                S4 s4A3 = R4.a(m43.f68510f, m43.f68511g, map4);
                                if (s4A3 != null && s4A3.q() == 1) {
                                    break;
                                } else {
                                    m43 = m43.f68514j;
                                }
                            }
                            if (m43 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(m43);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        m42 = null;
                                        break;
                                    }
                                    M4 m44 = (M4) arrayDeque.pop();
                                    S4 s4A4 = R4.a(m44.f68510f, m44.f68511g, map4);
                                    if (s4A4 != null && s4A4.q() == 3) {
                                        m42 = m44;
                                        break;
                                    }
                                    for (int iA = m44.a() - 1; iA >= 0; iA--) {
                                        arrayDeque.push(m44.d(iA));
                                    }
                                }
                                if (m42 != null) {
                                    if (m42.a() != 1 || m42.d(0).f68506b == null) {
                                        C9917xL.e("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = m42.d(0).f68506b;
                                        int i15 = OV.f69091a;
                                        S4 s4A5 = R4.a(m42.f68510f, m42.f68511g, map4);
                                        int iP = s4A5 != null ? s4A5.p() : -1;
                                        if (iP == -1 && (s4A = R4.a(m43.f68510f, m43.f68511g, map4)) != null) {
                                            iP = s4A.p();
                                        }
                                        spannableStringBuilder.setSpan(new C7655cA(str4, iP), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iQ == 3 || iQ == 4) {
                            spannableStringBuilder.setSpan(new K4(), iIntValue, iIntValue2, 33);
                        }
                        if (s4A2.f()) {
                            i10 = 33;
                            DA.b(spannableStringBuilder, new C6611Bz(), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        int iO = s4A2.o();
                        if (iO == 1) {
                            DA.b(spannableStringBuilder, new AbsoluteSizeSpan((int) s4A2.k(), true), iIntValue, iIntValue2, i10);
                        } else if (iO == 2) {
                            DA.b(spannableStringBuilder, new RelativeSizeSpan(s4A2.k()), iIntValue, iIntValue2, i10);
                        } else if (iO == 3) {
                            DA.a(spannableStringBuilder, s4A2.k() / 100.0f, iIntValue, iIntValue2, i10);
                        }
                        if ("p".equals(this.f68505a)) {
                            if (s4A2.l() != Float.MAX_VALUE) {
                                c7318Ww.j((s4A2.l() * (-90.0f)) / 100.0f);
                            }
                            if (s4A2.t() != null) {
                                c7318Ww.m(s4A2.t());
                            }
                            if (s4A2.s() != null) {
                                c7318Ww.g(s4A2.s());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            int i16 = 0;
            while (i16 < a()) {
                d(i16).l(j10, map4, map2, str2, map3);
                i16++;
                map4 = map;
            }
        }
    }

    public final boolean g(long j10) {
        long j11 = this.f68508d;
        if (j11 == -9223372036854775807L) {
            if (this.f68509e == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && this.f68509e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f68509e) {
            return j11 <= j10 && j10 < this.f68509e;
        }
        return true;
    }

    public static M4 b(String str, long j10, long j11, S4 s42, String[] strArr, String str2, String str3, M4 m42) {
        return new M4(str, null, j10, j11, s42, strArr, str2, str3, m42);
    }

    public static M4 c(String str) {
        return new M4(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private final void j(TreeSet treeSet, boolean z10) {
        String str = this.f68505a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f68513i != null)) {
            long j10 = this.f68508d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f68509e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f68517m != null) {
            for (int i10 = 0; i10 < this.f68517m.size(); i10++) {
                M4 m42 = (M4) this.f68517m.get(i10);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                m42.j(treeSet, z11);
            }
        }
    }

    private final void k(long j10, String str, List list) {
        String str2;
        if (!"".equals(this.f68512h)) {
            str = this.f68512h;
        }
        if (g(j10) && "div".equals(this.f68505a) && (str2 = this.f68513i) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < a(); i10++) {
            d(i10).k(j10, str, list);
        }
    }

    private final void m(long j10, boolean z10, String str, Map map) {
        Map map2;
        boolean z11;
        long j11;
        this.f68515k.clear();
        this.f68516l.clear();
        if ("metadata".equals(this.f68505a)) {
            return;
        }
        if (!"".equals(this.f68512h)) {
            str = this.f68512h;
        }
        String str2 = str;
        if (this.f68507c && z10) {
            SpannableStringBuilder spannableStringBuilderI = i(str2, map);
            String str3 = this.f68506b;
            str3.getClass();
            spannableStringBuilderI.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f68505a) && z10) {
            i(str2, map).append('\n');
            return;
        }
        if (g(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map3 = this.f68515k;
                String str4 = (String) entry.getKey();
                CharSequence charSequenceQ = ((C7318Ww) entry.getValue()).q();
                charSequenceQ.getClass();
                map3.put(str4, Integer.valueOf(charSequenceQ.length()));
            }
            boolean zEquals = "p".equals(this.f68505a);
            int i10 = 0;
            while (i10 < a()) {
                M4 m4D = d(i10);
                if (z10 || zEquals) {
                    map2 = map;
                    z11 = true;
                    j11 = j10;
                } else {
                    j11 = j10;
                    map2 = map;
                    z11 = false;
                }
                m4D.m(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map map4 = map;
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderI2 = i(str2, map4);
                int length = spannableStringBuilderI2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderI2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderI2.charAt(length) != '\n') {
                    spannableStringBuilderI2.append('\n');
                }
            }
            for (Map.Entry entry2 : map4.entrySet()) {
                HashMap map5 = this.f68516l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequenceQ2 = ((C7318Ww) entry2.getValue()).q();
                charSequenceQ2.getClass();
                map5.put(str5, Integer.valueOf(charSequenceQ2.length()));
            }
        }
    }

    public final int a() {
        List list = this.f68517m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final M4 d(int i10) {
        List list = this.f68517m;
        if (list != null) {
            return (M4) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List e(long j10, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        k(j10, this.f68512h, arrayList);
        TreeMap treeMap = new TreeMap();
        m(j10, false, this.f68512h, treeMap);
        l(j10, map, map2, this.f68512h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                Q4 q42 = (Q4) map2.get(pair.first);
                q42.getClass();
                C7318Ww c7318Ww = new C7318Ww();
                c7318Ww.c(bitmapDecodeByteArray);
                c7318Ww.h(q42.f69487b);
                c7318Ww.i(0);
                c7318Ww.e(q42.f69488c, 0);
                c7318Ww.f(q42.f69490e);
                c7318Ww.k(q42.f69491f);
                c7318Ww.d(q42.f69492g);
                c7318Ww.o(q42.f69495j);
                arrayList2.add(c7318Ww.p());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Q4 q43 = (Q4) map2.get(entry.getKey());
            q43.getClass();
            C7318Ww c7318Ww2 = (C7318Ww) entry.getValue();
            CharSequence charSequenceQ = c7318Ww2.q();
            charSequenceQ.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceQ;
            for (K4 k42 : (K4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), K4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(k42), spannableStringBuilder.getSpanEnd(k42), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c7318Ww2.e(q43.f69488c, q43.f69489d);
            c7318Ww2.f(q43.f69490e);
            c7318Ww2.h(q43.f69487b);
            c7318Ww2.k(q43.f69491f);
            c7318Ww2.n(q43.f69494i, q43.f69493h);
            c7318Ww2.o(q43.f69495j);
            arrayList2.add(c7318Ww2.p());
        }
        return arrayList2;
    }

    public final void f(M4 m42) {
        if (this.f68517m == null) {
            this.f68517m = new ArrayList();
        }
        this.f68517m.add(m42);
    }

    public final long[] h() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        j(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    private M4(String str, String str2, long j10, long j11, S4 s42, String[] strArr, String str3, String str4, M4 m42) {
        boolean z10;
        this.f68505a = str;
        this.f68506b = str2;
        this.f68513i = str4;
        this.f68510f = s42;
        this.f68511g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f68507c = z10;
        this.f68508d = j10;
        this.f68509e = j11;
        str3.getClass();
        this.f68512h = str3;
        this.f68514j = m42;
        this.f68515k = new HashMap();
        this.f68516l = new HashMap();
    }

    private static SpannableStringBuilder i(String str, Map map) {
        if (!map.containsKey(str)) {
            C7318Ww c7318Ww = new C7318Ww();
            c7318Ww.l(new SpannableStringBuilder());
            map.put(str, c7318Ww);
        }
        CharSequence charSequenceQ = ((C7318Ww) map.get(str)).q();
        charSequenceQ.getClass();
        return (SpannableStringBuilder) charSequenceQ;
    }
}
