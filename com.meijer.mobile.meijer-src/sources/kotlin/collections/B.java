package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"K", "V", "", "", "Lkotlin/Pair;", "F", "(Ljava/util/Map;)Ljava/util/List;", "Lkotlin/sequences/Sequence;", "", "E", "(Ljava/util/Map;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class B extends A {
    public static <K, V> Sequence<Map.Entry<K, V>> E(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        return CollectionsKt___CollectionsKt.f0(map.entrySet());
    }

    public static <K, V> List<Pair<K, V>> F(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        if (map.size() == 0) {
            return i.m();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return i.m();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return h.e(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
