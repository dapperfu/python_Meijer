package a4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c3.C6476a;
import d3.C13599a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5660c {

    /* renamed from: a, reason: collision with root package name */
    public final String f45091a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45092b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45093c;

    /* renamed from: d, reason: collision with root package name */
    public final long f45094d;

    /* renamed from: e, reason: collision with root package name */
    public final long f45095e;

    /* renamed from: f, reason: collision with root package name */
    public final g f45096f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f45097g;

    /* renamed from: h, reason: collision with root package name */
    public final String f45098h;

    /* renamed from: i, reason: collision with root package name */
    public final String f45099i;

    /* renamed from: j, reason: collision with root package name */
    public final C5660c f45100j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f45101k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f45102l;

    /* renamed from: m, reason: collision with root package name */
    private List<C5660c> f45103m;

    private void b(Map<String, g> map, C6476a.b bVar, int i10, int i11, int i12) {
        g gVarF = f.f(this.f45096f, this.f45097g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i10, i11, gVarF, this.f45100j, map, i12);
            if ("p".equals(this.f45091a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static C5660c c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, C5660c c5660c) {
        return new C5660c(str, null, j10, j11, gVar, strArr, str2, str3, c5660c);
    }

    public static C5660c d(String str) {
        return new C5660c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f45091a);
        boolean zEquals2 = "div".equals(this.f45091a);
        if (z10 || zEquals || (zEquals2 && this.f45099i != null)) {
            long j10 = this.f45094d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f45095e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f45103m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f45103m.size(); i10++) {
            this.f45103m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f45098h)) {
            str = this.f45098h;
        }
        if (m(j10) && "div".equals(this.f45091a) && this.f45099i != null) {
            list.add(new Pair<>(str, this.f45099i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, C6476a.b> map) {
        boolean z11;
        Map<String, C6476a.b> map2;
        long j11;
        this.f45101k.clear();
        this.f45102l.clear();
        if ("metadata".equals(this.f45091a)) {
            return;
        }
        if (!"".equals(this.f45098h)) {
            str = this.f45098h;
        }
        String str2 = str;
        if (this.f45093c && z10) {
            k(str2, map).append((CharSequence) C13599a.e(this.f45092b));
            return;
        }
        if ("br".equals(this.f45091a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, C6476a.b> entry : map.entrySet()) {
                this.f45101k.put(entry.getKey(), Integer.valueOf(((CharSequence) C13599a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f45091a);
            int i10 = 0;
            while (i10 < g()) {
                C5660c c5660cF = f(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                c5660cF.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map<String, C6476a.b> map3 = map;
            if (zEquals) {
                f.c(k(str2, map3));
            }
            for (Map.Entry<String, C6476a.b> entry2 : map3.entrySet()) {
                this.f45102l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C13599a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(C5660c c5660c) {
        if (this.f45103m == null) {
            this.f45103m = new ArrayList();
        }
        this.f45103m.add(c5660c);
    }

    public C5660c f(int i10) {
        List<C5660c> list = this.f45103m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<C5660c> list = this.f45103m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<C6476a> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f45098h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f45098h, treeMap);
        o(j10, map, map2, this.f45098h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) C13599a.e(map2.get(pair.first));
                arrayList2.add(new C6476a.b().f(bitmapDecodeByteArray).k(eVar.f45119b).l(0).h(eVar.f45120c, 0).i(eVar.f45122e).n(eVar.f45123f).g(eVar.f45124g).r(eVar.f45127j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) C13599a.e(map2.get(entry.getKey()));
            C6476a.b bVar = (C6476a.b) entry.getValue();
            e((SpannableStringBuilder) C13599a.e(bVar.e()));
            bVar.h(eVar2.f45120c, eVar2.f45121d);
            bVar.i(eVar2.f45122e);
            bVar.k(eVar2.f45119b);
            bVar.n(eVar2.f45123f);
            bVar.q(eVar2.f45126i, eVar2.f45125h);
            bVar.r(eVar2.f45127j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f45097g;
    }

    public boolean m(long j10) {
        long j11 = this.f45094d;
        if (j11 == -9223372036854775807L && this.f45095e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f45095e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f45095e) {
            return j11 <= j10 && j10 < this.f45095e;
        }
        return true;
    }

    private C5660c(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, C5660c c5660c) {
        boolean z10;
        this.f45091a = str;
        this.f45092b = str2;
        this.f45099i = str4;
        this.f45096f = gVar;
        this.f45097g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45093c = z10;
        this.f45094d = j10;
        this.f45095e = j11;
        this.f45098h = (String) C13599a.e(str3);
        this.f45100j = c5660c;
        this.f45101k = new HashMap<>();
        this.f45102l = new HashMap<>();
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C5658a c5658a : (C5658a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5658a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c5658a), spannableStringBuilder.getSpanEnd(c5658a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, C6476a.b> map) {
        if (!map.containsKey(str)) {
            C6476a.b bVar = new C6476a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C13599a.e(map.get(str).e());
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, C6476a.b> map3) {
        String str2;
        if (m(j10)) {
            if ("".equals(this.f45098h)) {
                str2 = str;
            } else {
                str2 = this.f45098h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.f45102l.entrySet().iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                if (this.f45101k.containsKey(key)) {
                    iIntValue = this.f45101k.get(key).intValue();
                }
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (C6476a.b) C13599a.e(map3.get(key)), iIntValue, iIntValue2, ((e) C13599a.e(map2.get(str2))).f45127j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }
}
