package F6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kw.InterfaceC15330g;
import y6.DeferredFragmentIdentifier;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJC\u0010\u000f\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0014J9\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00062\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003R&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR)\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010+R$\u00101\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b \u00100R$\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b*\u00100¨\u00063"}, d2 = {"LF6/c;", "", "<init>", "()V", "", "", "Lcom/apollographql/apollo/internal/JsonMap;", "incrementalItem", "", "h", "(Ljava/util/Map;)V", "", "Lcom/apollographql/apollo/internal/MutableJsonMap;", "destination", "map", "a", "(Ljava/util/Map;Ljava/util/Map;)V", "Lkw/g;", "json", "e", "(Lkw/g;)Ljava/util/Map;", "", "path", "i", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "payload", "g", "f", "(Ljava/util/Map;)Ljava/util/Map;", "j", "Ljava/util/Map;", "_merged", "b", "getMerged", "()Ljava/util/Map;", "merged", "", "Ly6/q;", "c", "Ljava/util/Set;", "_mergedFragmentIds", "", "d", "()Ljava/util/Set;", "mergedFragmentIds", "", "value", "Z", "()Z", "hasNext", "isEmptyPayload", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> _merged;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> merged;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<DeferredFragmentIdentifier> _mergedFragmentIds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<DeferredFragmentIdentifier> mergedFragmentIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isEmptyPayload;

    private final Map<String, Object> e(InterfaceC15330g json) {
        Object objD = C6.a.d(new C6.d(json));
        Intrinsics.h(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return (Map) objD;
    }

    private final void h(Map<String, ? extends Object> incrementalItem) {
        Map<String, ? extends Object> map = (Map) incrementalItem.get("data");
        Object obj = incrementalItem.get("path");
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List<? extends Object> list = (List) obj;
        Object obj2 = this.merged.get("data");
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map<String, ? extends Object> map2 = (Map) obj2;
        if (map != null) {
            Object objI = i(map2, list);
            Intrinsics.h(objI, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            a(TypeIntrinsics.d(objI), map);
            this._mergedFragmentIds.add(new DeferredFragmentIdentifier(list, (String) incrementalItem.get("label")));
        }
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    public final Set<DeferredFragmentIdentifier> c() {
        return this.mergedFragmentIds;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEmptyPayload() {
        return this.isEmptyPayload;
    }

    public final Map<String, Object> f(Map<String, ? extends Object> payload) {
        Intrinsics.j(payload, "payload");
        if (this.merged.isEmpty()) {
            this._merged.putAll(payload);
            return this.merged;
        }
        Object obj = payload.get("incremental");
        List<Map<String, ? extends Object>> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            this.isEmptyPayload = true;
        } else {
            this.isEmptyPayload = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map<String, ? extends Object> map : list) {
                h(map);
                Object obj2 = map.get("errors");
                List list2 = obj2 instanceof List ? (List) obj2 : null;
                if (list2 != null) {
                    CollectionsKt.C(arrayList, list2);
                }
                Object obj3 = map.get("extensions");
                Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map2 != null) {
                    arrayList2.add(map2);
                }
            }
            if (arrayList.isEmpty()) {
                this._merged.remove("errors");
            } else {
                this._merged.put("errors", arrayList);
            }
            if (arrayList2.isEmpty()) {
                this._merged.remove("extensions");
            } else {
                this._merged.put("extensions", MapsKt.g(TuplesKt.a("incremental", arrayList2)));
            }
        }
        Boolean bool = (Boolean) payload.get("hasNext");
        this.hasNext = bool != null ? bool.booleanValue() : false;
        return this.merged;
    }

    public final Map<String, Object> g(InterfaceC15330g payload) {
        Intrinsics.j(payload, "payload");
        return f(e(payload));
    }

    public final void j() {
        this._merged.clear();
        this._mergedFragmentIds.clear();
        this.hasNext = true;
        this.isEmptyPayload = false;
    }

    public c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this._merged = linkedHashMap;
        this.merged = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this._mergedFragmentIds = linkedHashSet;
        this.mergedFragmentIds = linkedHashSet;
        this.hasNext = true;
    }

    private final void a(Map<String, Object> destination, Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (destination.containsKey(key) && TypeIntrinsics.o(destination.get(key))) {
                Object obj = destination.get(key);
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                Map<String, Object> mapD = TypeIntrinsics.d(obj);
                if (value instanceof Map) {
                    map2 = (Map) value;
                } else {
                    map2 = null;
                }
                if (map2 != null) {
                    a(mapD, map2);
                } else {
                    throw new IllegalStateException(("'" + key + "' is an object in destination but not in map").toString());
                }
            } else {
                destination.put(key, value);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    private final Object i(Map<String, ? extends Object> map, List<? extends Object> path) {
        for (Object obj : path) {
            if (map instanceof List) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
                map = ((List) map).get(((Integer) obj).intValue());
            } else {
                Intrinsics.h(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                map = ((Map) map).get(obj);
            }
        }
        return map;
    }
}
