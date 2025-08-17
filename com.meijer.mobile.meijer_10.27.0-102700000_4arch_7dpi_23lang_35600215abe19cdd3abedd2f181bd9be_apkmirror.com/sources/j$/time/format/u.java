package j$.time.format;

import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class u extends t {

    /* renamed from: i, reason: collision with root package name */
    public static final Map f138882i = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final TextStyle f138883e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f138884f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f138885g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f138886h;

    public u(TextStyle textStyle, boolean z10) {
        super(j$.time.temporal.n.f138960e, "ZoneText(" + textStyle + ")");
        this.f138885g = new HashMap();
        this.f138886h = new HashMap();
        Objects.requireNonNull(textStyle, "textStyle");
        this.f138883e = textStyle;
        this.f138884f = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    @Override // j$.time.format.t, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(j$.time.format.w r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.C(j$.time.format.w, java.lang.StringBuilder):boolean");
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        n nVar;
        if (this.f138883e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.f138887a.f138815b;
        boolean z10 = vVar.f138888b;
        Set set = j$.time.zone.i.f139009d;
        int size = set.size();
        Map map = z10 ? this.f138885g : this.f138886h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVar2 = vVar.f138888b ? new n("", null, null) : new m("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar2.a(str, str);
                HashMap map2 = (HashMap) C.f138810d;
                String str2 = (String) map2.get(str);
                if (str2 == null) {
                    HashMap map3 = (HashMap) C.f138813g;
                    if (map3.containsKey(str)) {
                        str = (String) map3.get(str);
                        str2 = (String) map2.get(str);
                    }
                }
                if (str2 != null) {
                    Map map4 = (Map) ((HashMap) C.f138812f).get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) ((HashMap) C.f138811e).get(str2) : (String) map4.get(locale.getCountry());
                }
                HashMap map5 = (HashMap) C.f138813g;
                if (map5.containsKey(str)) {
                    str = (String) map5.get(str);
                }
                for (int i10 = this.f138883e == TextStyle.FULL ? 1 : 2; i10 < strArr.length; i10 += 2) {
                    nVar2.a(strArr[i10], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar2)));
        return nVar2;
    }
}
