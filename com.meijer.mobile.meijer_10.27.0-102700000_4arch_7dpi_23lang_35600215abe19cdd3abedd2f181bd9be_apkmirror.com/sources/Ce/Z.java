package Ce;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public interface Z<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    boolean c(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k10);

    boolean put(K k10, V v10);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
