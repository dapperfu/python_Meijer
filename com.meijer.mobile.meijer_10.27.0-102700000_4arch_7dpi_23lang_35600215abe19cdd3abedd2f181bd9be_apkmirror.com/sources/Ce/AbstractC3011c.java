package Ce;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Ce.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3011c<K, V> extends AbstractC3012d<K, V> implements T<K, V> {
    @Override // Ce.AbstractC3012d
    Collection<V> A(K k10, Collection<V> collection) {
        return B(k10, (List) collection, null);
    }

    @Override // Ce.AbstractC3012d
    <E> Collection<E> z(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    protected AbstractC3011c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // Ce.AbstractC3012d, Ce.Z
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    @Override // Ce.AbstractC3014f, Ce.Z
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // Ce.AbstractC3014f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // Ce.AbstractC3012d, Ce.Z
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }
}
