package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Map f139485a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f139486b;

    public y(Map map) {
        this.f139485a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l10 = (Long) entry2.getKey();
                ConcurrentMap concurrentMap = z.f139487a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, z.f139488b);
            map2.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, z.f139488b);
        this.f139486b = map2;
    }

    public final String a(long j10, TextStyle textStyle) {
        Map map = (Map) this.f139485a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
