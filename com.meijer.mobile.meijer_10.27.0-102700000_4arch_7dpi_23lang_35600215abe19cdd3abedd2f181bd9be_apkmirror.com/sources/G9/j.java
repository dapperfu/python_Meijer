package G9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u001a3\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u0014\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "", "", "key", "b", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "K", "V", "a", "(Ljava/util/Map;)Ljava/util/Map;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {
    public static final <K, V> Map<K, V> a(Map<? extends K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        HashMap map2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<K, V> entry2 : linkedHashMap.entrySet()) {
            K key = entry2.getKey();
            Intrinsics.g(key);
            V value = entry2.getValue();
            Intrinsics.g(value);
            map2.put(key, value);
        }
        return map2;
    }

    public static final <T> T b(Map<String, ? extends T> map, String str) {
        String lowerCase;
        String next;
        String lowerCase2;
        Intrinsics.j(map, "<this>");
        Iterator<String> it = map.keySet().iterator();
        do {
            lowerCase = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            if (next != null) {
                lowerCase2 = next.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase2, "toLowerCase(...)");
            } else {
                lowerCase2 = null;
            }
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            }
        } while (!Intrinsics.e(lowerCase2, lowerCase));
        return map.get(next);
    }
}
