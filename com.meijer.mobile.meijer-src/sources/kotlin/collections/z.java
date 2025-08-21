package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u001c\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aa\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0014\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010!\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001f*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a2\u0006\u0010 \u001a\u00028\u0002¢\u0006\u0004\b!\u0010\"\u001a=\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b#\u0010\t\u001aS\u0010$\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u001f*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010 \u001a\u00028\u0002¢\u0006\u0004\b$\u0010%\u001a9\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b&\u0010'\u001a9\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b(\u0010'\u001aN\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b*\u0010+\u001aT\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001aH\u0086\u0002¢\u0006\u0004\b,\u0010-\u001aP\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010.\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\b/\u00100\u001aB\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0014\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b1\u00102\u001aH\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\u0002¢\u0006\u0004\b4\u0010-\u001a7\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b5\u0010'¨\u00066"}, d2 = {"K", "V", "", "k", "()Ljava/util/Map;", "", "Lkotlin/Pair;", "pairs", "o", "([Lkotlin/Pair;)Ljava/util/Map;", "", "r", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "m", "([Lkotlin/Pair;)Ljava/util/HashMap;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "n", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "key", "l", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "x", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "w", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "y", "(Ljava/lang/Iterable;)Ljava/util/Map;", "M", "destination", "z", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "B", "C", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "A", "(Ljava/util/Map;)Ljava/util/Map;", "D", "pair", "v", "(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;", "t", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "map", "u", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "q", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "p", "s", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class z extends y {
    @SinceKotlin
    public static <K, V> Map<K, V> A(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? D(map) : y.h(map) : k();
    }

    public static <K, V> Map<K, V> B(Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.j(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? C(pairArr, new LinkedHashMap(y.f(pairArr.length))) : y.g(pairArr[0]) : k();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M C(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        Intrinsics.j(pairArr, "<this>");
        Intrinsics.j(destination, "destination");
        x(destination, pairArr);
        return destination;
    }

    @SinceKotlin
    public static <K, V> Map<K, V> D(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static <K, V> Map<K, V> k() {
        s sVar = s.f143508a;
        Intrinsics.h(sVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return sVar;
    }

    @SinceKotlin
    public static <K, V> V l(Map<K, ? extends V> map, K k10) {
        Intrinsics.j(map, "<this>");
        return (V) x.a(map, k10);
    }

    public static <K, V> HashMap<K, V> m(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.j(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(y.f(pairs.length));
        x(map, pairs);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> n(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.j(pairs, "pairs");
        return (LinkedHashMap) C(pairs, new LinkedHashMap(y.f(pairs.length)));
    }

    public static <K, V> Map<K, V> o(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.j(pairs, "pairs");
        return pairs.length > 0 ? C(pairs, new LinkedHashMap(y.f(pairs.length))) : k();
    }

    @SinceKotlin
    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map, Iterable<? extends K> keys) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(keys, "keys");
        Map mapD = D(map);
        n.I(mapD.keySet(), keys);
        return s(mapD);
    }

    @SinceKotlin
    public static <K, V> Map<K, V> q(Map<? extends K, ? extends V> map, K k10) {
        Intrinsics.j(map, "<this>");
        Map mapD = D(map);
        mapD.remove(k10);
        return s(mapD);
    }

    public static <K, V> Map<K, V> r(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.j(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.f(pairs.length));
        x(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> s(Map<K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.h(map) : k();
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(pairs, "pairs");
        if (map.isEmpty()) {
            return y(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> u(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> v(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(pair, "pair");
        if (map.isEmpty()) {
            return y.g(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final <K, V> void w(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    public static final <K, V> void x(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    public static <K, V> Map<K, V> y(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return s(z(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return k();
        }
        if (size != 1) {
            return z(iterable, new LinkedHashMap(y.f(collection.size())));
        }
        return y.g((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M z(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(destination, "destination");
        w(destination, iterable);
        return destination;
    }
}
