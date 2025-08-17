package Z;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010/R\u0014\u00101\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017¨\u00062"}, d2 = {"LZ/F;", "K", "V", "", "LZ/h0;", "parent", "<init>", "(LZ/h0;)V", "", "isEmpty", "()Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "containsValue", "(Ljava/lang/Object;)Z", "containsKey", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LZ/h0;", "LZ/h;", "b", "LZ/h;", "_entries", "LZ/u;", "c", "LZ/u;", "_keys", "LZ/r0;", "d", "LZ/r0;", "_values", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
class F<K, V> implements Map<K, V>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h0<K, V> parent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C5510h<K, V> _entries;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C5522u<K, V> _keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r0<K, V> _values;

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public F(h0<K, V> parent) {
        Intrinsics.j(parent, "parent");
        this.parent = parent;
    }

    public Set<Map.Entry<K, V>> a() {
        C5510h<K, V> c5510h = this._entries;
        if (c5510h != null) {
            return c5510h;
        }
        C5510h<K, V> c5510h2 = new C5510h<>(this.parent);
        this._entries = c5510h2;
        return c5510h2;
    }

    public Set<K> b() {
        C5522u<K, V> c5522u = this._keys;
        if (c5522u != null) {
            return c5522u;
        }
        C5522u<K, V> c5522u2 = new C5522u<>(this.parent);
        this._keys = c5522u2;
        return c5522u2;
    }

    public int c() {
        return this.parent._size;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.parent.c(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.parent.d(value);
    }

    public Collection<V> d() {
        r0<K, V> r0Var = this._values;
        if (r0Var != null) {
            return r0Var;
        }
        r0<K, V> r0Var2 = new r0<>(this.parent);
        this._values = r0Var2;
        return r0Var2;
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.e(this.parent, ((F) other).parent);
    }

    @Override // java.util.Map
    public V get(Object key) {
        return this.parent.e(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.parent.h();
    }

    @Override // java.util.Map
    public V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
