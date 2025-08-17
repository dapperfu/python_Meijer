package a4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c3.C6350a;
import d3.C13466a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: a4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5577c {

    /* renamed from: a, reason: collision with root package name */
    public final String f44273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44274b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f44275c;

    /* renamed from: d, reason: collision with root package name */
    public final long f44276d;

    /* renamed from: e, reason: collision with root package name */
    public final long f44277e;

    /* renamed from: f, reason: collision with root package name */
    public final C5581g f44278f;

    /* renamed from: g, reason: collision with root package name */
    private final String[] f44279g;

    /* renamed from: h, reason: collision with root package name */
    public final String f44280h;

    /* renamed from: i, reason: collision with root package name */
    public final String f44281i;

    /* renamed from: j, reason: collision with root package name */
    public final C5577c f44282j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f44283k;

    /* renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f44284l;

    /* renamed from: m, reason: collision with root package name */
    private List<C5577c> f44285m;

    private void b(Map<String, C5581g> map, C6350a.b bVar, int i10, int i11, int i12) {
        C5581g c5581gF = C5580f.f(this.f44278f, this.f44279g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (c5581gF != null) {
            C5580f.a(spannableStringBuilder2, i10, i11, c5581gF, this.f44282j, map, i12);
            if ("p".equals(this.f44273a)) {
                if (c5581gF.m() != Float.MAX_VALUE) {
                    bVar.m((c5581gF.m() * (-90.0f)) / 100.0f);
                }
                if (c5581gF.o() != null) {
                    bVar.p(c5581gF.o());
                }
                if (c5581gF.i() != null) {
                    bVar.j(c5581gF.i());
                }
            }
        }
    }

    public static C5577c c(String str, long j10, long j11, C5581g c5581g, String[] strArr, String str2, String str3, C5577c c5577c) {
        return new C5577c(str, null, j10, j11, c5581g, strArr, str2, str3, c5577c);
    }

    public static C5577c d(String str) {
        return new C5577c(null, C5580f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean zEquals = "p".equals(this.f44273a);
        boolean zEquals2 = "div".equals(this.f44273a);
        if (z10 || zEquals || (zEquals2 && this.f44281i != null)) {
            long j10 = this.f44276d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f44277e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f44285m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f44285m.size(); i10++) {
            this.f44285m.get(i10).i(treeSet, z10 || zEquals);
        }
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f44280h)) {
            str = this.f44280h;
        }
        if (m(j10) && "div".equals(this.f44273a) && this.f44281i != null) {
            list.add(new Pair<>(str, this.f44281i));
            return;
        }
        for (int i10 = 0; i10 < g(); i10++) {
            f(i10).n(j10, str, list);
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, C6350a.b> map) {
        boolean z11;
        Map<String, C6350a.b> map2;
        long j11;
        this.f44283k.clear();
        this.f44284l.clear();
        if ("metadata".equals(this.f44273a)) {
            return;
        }
        if (!"".equals(this.f44280h)) {
            str = this.f44280h;
        }
        String str2 = str;
        if (this.f44275c && z10) {
            k(str2, map).append((CharSequence) C13466a.e(this.f44274b));
            return;
        }
        if ("br".equals(this.f44273a) && z10) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j10)) {
            for (Map.Entry<String, C6350a.b> entry : map.entrySet()) {
                this.f44283k.put(entry.getKey(), Integer.valueOf(((CharSequence) C13466a.e(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f44273a);
            int i10 = 0;
            while (i10 < g()) {
                C5577c c5577cF = f(i10);
                if (z10 || zEquals) {
                    z11 = true;
                    map2 = map;
                    j11 = j10;
                } else {
                    z11 = false;
                    j11 = j10;
                    map2 = map;
                }
                c5577cF.p(j11, z11, str2, map2);
                i10++;
                j10 = j11;
                map = map2;
            }
            Map<String, C6350a.b> map3 = map;
            if (zEquals) {
                C5580f.c(k(str2, map3));
            }
            for (Map.Entry<String, C6350a.b> entry2 : map3.entrySet()) {
                this.f44284l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C13466a.e(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(C5577c c5577c) {
        if (this.f44285m == null) {
            this.f44285m = new ArrayList();
        }
        this.f44285m.add(c5577c);
    }

    public C5577c f(int i10) {
        List<C5577c> list = this.f44285m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<C5577c> list = this.f44285m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<C6350a> h(long j10, Map<String, C5581g> map, Map<String, C5579e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j10, this.f44280h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f44280h, treeMap);
        o(j10, map, map2, this.f44280h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C5579e c5579e = (C5579e) C13466a.e(map2.get(pair.first));
                arrayList2.add(new C6350a.b().f(bitmapDecodeByteArray).k(c5579e.f44301b).l(0).h(c5579e.f44302c, 0).i(c5579e.f44304e).n(c5579e.f44305f).g(c5579e.f44306g).r(c5579e.f44309j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C5579e c5579e2 = (C5579e) C13466a.e(map2.get(entry.getKey()));
            C6350a.b bVar = (C6350a.b) entry.getValue();
            e((SpannableStringBuilder) C13466a.e(bVar.e()));
            bVar.h(c5579e2.f44302c, c5579e2.f44303d);
            bVar.i(c5579e2.f44304e);
            bVar.k(c5579e2.f44301b);
            bVar.n(c5579e2.f44305f);
            bVar.q(c5579e2.f44308i, c5579e2.f44307h);
            bVar.r(c5579e2.f44309j);
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
        return this.f44279g;
    }

    public boolean m(long j10) {
        long j11 = this.f44276d;
        if (j11 == -9223372036854775807L && this.f44277e == -9223372036854775807L) {
            return true;
        }
        if (j11 <= j10 && this.f44277e == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.f44277e) {
            return j11 <= j10 && j10 < this.f44277e;
        }
        return true;
    }

    private C5577c(String str, String str2, long j10, long j11, C5581g c5581g, String[] strArr, String str3, String str4, C5577c c5577c) {
        boolean z10;
        this.f44273a = str;
        this.f44274b = str2;
        this.f44281i = str4;
        this.f44278f = c5581g;
        this.f44279g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44275c = z10;
        this.f44276d = j10;
        this.f44277e = j11;
        this.f44280h = (String) C13466a.e(str3);
        this.f44282j = c5577c;
        this.f44283k = new HashMap<>();
        this.f44284l = new HashMap<>();
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (C5575a c5575a : (C5575a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5575a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c5575a), spannableStringBuilder.getSpanEnd(c5575a), "");
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

    private static SpannableStringBuilder k(String str, Map<String, C6350a.b> map) {
        if (!map.containsKey(str)) {
            C6350a.b bVar = new C6350a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C13466a.e(map.get(str).e());
    }

    private void o(long j10, Map<String, C5581g> map, Map<String, C5579e> map2, String str, Map<String, C6350a.b> map3) {
        String str2;
        if (m(j10)) {
            if ("".equals(this.f44280h)) {
                str2 = str;
            } else {
                str2 = this.f44280h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.f44284l.entrySet().iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                if (this.f44283k.containsKey(key)) {
                    iIntValue = this.f44283k.get(key).intValue();
                }
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (C6350a.b) C13466a.e(map3.get(key)), iIntValue, iIntValue2, ((C5579e) C13466a.e(map2.get(str2))).f44309j);
                }
            }
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).o(j10, map, map2, str2, map3);
            }
        }
    }
}
