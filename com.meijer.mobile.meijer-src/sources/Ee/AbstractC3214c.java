package Ee;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Ee.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3214c<K, V> extends AbstractC3215d<K, V> implements T<K, V> {
    @Override // Ee.AbstractC3215d
    Collection<V> A(K k10, Collection<V> collection) {
        return B(k10, (List) collection, null);
    }

    @Override // Ee.AbstractC3215d
    <E> Collection<E> z(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    protected AbstractC3214c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // Ee.AbstractC3215d, Ee.Z
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public List<V> get(K k10) {
        return (List) super.get(k10);
    }

    @Override // Ee.AbstractC3217f, Ee.Z
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // Ee.AbstractC3217f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // Ee.AbstractC3215d, Ee.Z
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }
}
