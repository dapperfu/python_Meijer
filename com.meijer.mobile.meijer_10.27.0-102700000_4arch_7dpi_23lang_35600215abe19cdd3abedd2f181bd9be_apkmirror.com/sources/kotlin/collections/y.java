package kotlin.collections;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0010\u001a\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "g", "(Lkotlin/Pair;)Ljava/util/Map;", "", "d", "()Ljava/util/Map;", "", "capacity", "e", "(I)Ljava/util/Map;", "builder", "c", "(Ljava/util/Map;)Ljava/util/Map;", "", "Ljava/util/SortedMap;", "i", "(Ljava/util/Map;)Ljava/util/SortedMap;", "Ljava/util/Comparator;", "comparator", "j", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;", "h", "expectedSize", "f", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* loaded from: classes4.dex */
public class y extends x {
    @PublishedApi
    public static int f(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> c(Map<K, V> builder) {
        Intrinsics.j(builder, "builder");
        return ((MapBuilder) builder).q();
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> d() {
        return new MapBuilder();
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> e(int i10) {
        return new MapBuilder(i10);
    }

    public static <K, V> Map<K, V> g(Pair<? extends K, ? extends V> pair) {
        Intrinsics.j(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        Intrinsics.i(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> h(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.i(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> i(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        return new TreeMap(map);
    }

    public static <K, V> SortedMap<K, V> j(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
