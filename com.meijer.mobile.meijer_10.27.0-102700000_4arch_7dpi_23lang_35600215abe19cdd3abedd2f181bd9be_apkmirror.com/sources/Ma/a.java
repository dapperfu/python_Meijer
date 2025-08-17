package Ma;

import F9.h;
import G9.b;
import Ka.PredictRequestContext;
import Q8.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a implements c<List<D9.a>, y9.c> {

    /* renamed from: a, reason: collision with root package name */
    private final PredictRequestContext f19070a;

    /* renamed from: b, reason: collision with root package name */
    private final Ka.c f19071b;

    private void b(Map<String, Object> map) {
        map.put("cp", 1);
        h keyValueStore = this.f19070a.getKeyValueStore();
        String strA = keyValueStore.a("predict_visitor_id");
        if (strA != null) {
            map.put("vi", strA);
        }
        String strA2 = keyValueStore.a("predict_contact_id");
        if (strA2 != null) {
            map.put("ci", strA2);
        }
    }

    private Map<String, Object> d(List<D9.a> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap);
        Iterator<D9.a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().a());
        }
        return linkedHashMap;
    }

    @Override // Q8.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public y9.c a(List<D9.a> list) {
        b.c(list, "Shards must not be null!");
        b.b(list, "Shards must not be empty!");
        b.a(list, "Shard elements must not be null!");
        return this.f19071b.g(d(list)).a();
    }

    public a(PredictRequestContext predictRequestContext, Ja.a aVar) {
        b.c(predictRequestContext, "PredictRequestContext must not be null!");
        b.c(aVar, "PredictRequestModelBuilderProvider must not be null!");
        this.f19070a = predictRequestContext;
        this.f19071b = aVar.a();
    }
}
