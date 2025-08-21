package Oa;

import H9.h;
import I9.b;
import Ma.PredictRequestContext;
import S8.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class a implements c<List<F9.a>, A9.c> {

    /* renamed from: a, reason: collision with root package name */
    private final PredictRequestContext f23257a;

    /* renamed from: b, reason: collision with root package name */
    private final Ma.c f23258b;

    private void b(Map<String, Object> map) {
        map.put("cp", 1);
        h keyValueStore = this.f23257a.getKeyValueStore();
        String strA = keyValueStore.a("predict_visitor_id");
        if (strA != null) {
            map.put("vi", strA);
        }
        String strA2 = keyValueStore.a("predict_contact_id");
        if (strA2 != null) {
            map.put("ci", strA2);
        }
    }

    private Map<String, Object> d(List<F9.a> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap);
        Iterator<F9.a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().a());
        }
        return linkedHashMap;
    }

    @Override // S8.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public A9.c a(List<F9.a> list) {
        b.c(list, "Shards must not be null!");
        b.b(list, "Shards must not be empty!");
        b.a(list, "Shard elements must not be null!");
        return this.f23258b.g(d(list)).a();
    }

    public a(PredictRequestContext predictRequestContext, La.a aVar) {
        b.c(predictRequestContext, "PredictRequestContext must not be null!");
        b.c(aVar, "PredictRequestModelBuilderProvider must not be null!");
        this.f23257a = predictRequestContext;
        this.f23258b = aVar.a();
    }
}
