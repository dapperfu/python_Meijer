package Ce;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class F<K, V> extends G implements Map<K, V> {
    protected abstract Map<K, V> b();

    protected F() {
    }

    protected boolean B(Object obj) {
        return Y.c(this, obj);
    }

    protected int C() {
        return s0.d(entrySet());
    }

    @Override // java.util.Map
    public void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return b().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().values();
    }

    protected boolean w(Object obj) {
        return Y.b(this, obj);
    }
}
