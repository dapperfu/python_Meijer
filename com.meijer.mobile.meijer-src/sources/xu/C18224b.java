package xu;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: xu.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18224b<V> implements Map<Class<?>, V> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, V> f171030a;

    public static <V> Map<Class<?>, V> a(Map<String, V> map) {
        return new C18224b(map);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public V put(Class<?> cls, V v10) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f171030a.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f171030a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (obj instanceof Class) {
            return this.f171030a.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f171030a.isEmpty();
    }

    @Override // java.util.Map
    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f171030a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f171030a.values();
    }

    private C18224b(Map<String, V> map) {
        this.f171030a = map;
    }
}
