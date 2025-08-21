package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aX\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "defaultValue", "b", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class x {
    @PublishedApi
    @JvmName
    public static <K, V> V a(Map<K, ? extends V> map, K k10) {
        Intrinsics.j(map, "<this>");
        if (map instanceof v) {
            return (V) ((v) map).z(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }

    public static <K, V> Map<K, V> b(Map<K, ? extends V> map, Function1<? super K, ? extends V> defaultValue) {
        Intrinsics.j(map, "<this>");
        Intrinsics.j(defaultValue, "defaultValue");
        return map instanceof v ? b(((v) map).m(), defaultValue) : new w(map, defaultValue);
    }
}
