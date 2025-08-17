package L5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0093\u0001\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2<\u0010\u0015\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001e\u001a\u00020\u001d2&\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u00192\u0006\u0010\u001b\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LL5/e;", "", "<init>", "()V", "", "", "from", "to", "", "overwrite", "e", "(Ljava/util/Map;Ljava/util/Map;Z)Ljava/util/Map;", "", "f", "(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;", "g", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "fromValue", "toValue", "overwriteStrategy", "d", "(Ljava/util/Map;Ljava/util/Map;ZLkotlin/jvm/functions/Function2;)Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "targetMap", "wildcardKey", "data", "", "c", "(Ljava/util/HashMap;Ljava/lang/String;Ljava/util/Map;Z)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17883a = new e();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<no name provided>", "", "fromValue", "toValue", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function2<Object, Object, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f17884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(2);
            this.f17884f = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((obj instanceof Map) && (obj2 instanceof Map)) ? e.f17883a.g((Map) obj, (Map) obj2, this.f17884f) : !this.f17884f ? obj2 : ((obj instanceof Collection) && (obj2 instanceof Collection)) ? e.f17883a.f((Collection) obj, (Collection) obj2) : obj;
        }
    }

    private final void c(HashMap<String, Object> targetMap, String wildcardKey, Map<?, ?> data, boolean overwrite) {
        String strF1 = StringsKt.F1(wildcardKey, 3);
        Object obj = targetMap.get(strF1);
        if (obj instanceof Collection) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                Map<?, ?> map = obj2 instanceof Map ? (Map) obj2 : null;
                if (map != null) {
                    arrayList.add(f17883a.g(data, map, overwrite));
                } else {
                    arrayList.add(obj2);
                }
            }
            targetMap.put(strF1, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003¨\u0006\u0004"}, d2 = {"L5/e$b", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class b extends ArrayList<Object> {
        b(Collection<?> collection, Collection<?> collection2) {
            if (collection != null) {
                addAll(collection);
            }
            if (collection2 != null) {
                addAll(collection2);
            }
        }

        public /* bridge */ int a() {
            return super.size();
        }

        public /* bridge */ Object e(int i10) {
            return super.remove(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ Object remove(int i10) {
            return e(i10);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return a();
        }
    }

    private final Map<String, Object> d(Map<String, ? extends Object> from, Map<String, ? extends Object> to2, boolean overwrite, Function2<Object, Object, ? extends Object> overwriteStrategy) {
        HashMap<String, Object> map = new HashMap<>();
        if (to2 != null) {
            map.putAll(to2);
        }
        if (from != null) {
            for (Map.Entry<String, ? extends Object> entry : from.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (map.containsKey(key)) {
                    Object objInvoke = overwriteStrategy.invoke(value, map.get(key));
                    if (objInvoke != null) {
                        map.put(key, objInvoke);
                    } else {
                        map.remove(key);
                    }
                } else if (!StringsKt.G(key, "[*]", false, 2, null)) {
                    map.put(key, value);
                } else if (value instanceof Map) {
                    f17883a.c(map, key, (Map) value, overwrite);
                }
            }
        }
        return map;
    }

    @JvmStatic
    public static final Map<String, Object> e(Map<String, ? extends Object> from, Map<String, ? extends Object> to2, boolean overwrite) {
        return f17883a.d(from, to2, overwrite, new a(overwrite));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<Object> f(Collection<?> from, Collection<?> to2) {
        return new b(from, to2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<?, ?> g(Map<?, ?> from, Map<?, ?> to2, boolean overwrite) {
        if (from != null && !n.a(from.keySet())) {
            return to2;
        }
        if (to2 != null && !n.a(to2.keySet())) {
            return to2;
        }
        if (from == null) {
            from = null;
        }
        try {
            return e(from, to2 != null ? to2 : null, overwrite);
        } catch (Exception unused) {
            return to2;
        }
    }

    private e() {
    }
}
