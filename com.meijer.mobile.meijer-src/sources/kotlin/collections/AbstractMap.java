package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\r\b'\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u00014B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "<init>", "()V", "", "entry", "", "n", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "", "o", "k", "(Ljava/lang/Object;)Ljava/lang/String;", "key", "j", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "c", "(Ljava/util/Map$Entry;)Z", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Set;", "_keys", "", "b", "Ljava/util/Collection;", "_values", "g", "size", "f", "()Ljava/util/Set;", "keys", "h", "()Ljava/util/Collection;", "values", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile Set<? extends K> _keys;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Collection<? extends V> _values;

    public final boolean c(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        V v10 = get(key);
        if (!Intrinsics.e(value, v10)) {
            return false;
        }
        if (v10 != null) {
            return true;
        }
        Intrinsics.h(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Set<Map.Entry<K, V>> d();

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Map)) {
            return false;
        }
        Map map = (Map) other;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!c((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
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
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final String k(Object o10) {
        return o10 == this ? "(this Map)" : String.valueOf(o10);
    }

    private final String n(Map.Entry<? extends K, ? extends V> entry) {
        return k(entry.getKey()) + '=' + k(entry.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(AbstractMap abstractMap, Map.Entry it) {
        Intrinsics.j(it, "it");
        return abstractMap.n(it);
    }

    public Set<K> f() {
        if (this._keys == null) {
            this._keys = new AbstractSet<K>(this) { // from class: kotlin.collections.AbstractMap$keys$1

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractMap<K, V> f143372b;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f143372b = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object element) {
                    return this.f143372b.containsKey(element);
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: f */
                public int getSize() {
                    return this.f143372b.size();
                }

                @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<K> iterator() {
                    return new AbstractMap$keys$1$iterator$1(this.f143372b.entrySet().iterator());
                }
            };
        }
        Set<? extends K> set = this._keys;
        Intrinsics.g(set);
        return set;
    }

    public Collection<V> h() {
        if (this._values == null) {
            this._values = new AbstractCollection<V>(this) { // from class: kotlin.collections.AbstractMap.values.1

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractMap<K, V> f143374a;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f143374a = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public boolean contains(Object element) {
                    return this.f143374a.containsValue(element);
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: f */
                public int getSize() {
                    return this.f143374a.size();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public Iterator<V> iterator() {
                    return new AbstractMap$values$1$iterator$1(this.f143374a.entrySet().iterator());
                }
            };
        }
        Collection<? extends V> collection = this._values;
        Intrinsics.g(collection);
        return collection;
    }

    protected AbstractMap() {
    }

    private final Map.Entry<K, V> j(K key) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.e(((Map.Entry) next).getKey(), key)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Map.Entry) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        if (j(key) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(((Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    /* renamed from: g */
    public int getSize() {
        return entrySet().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        Map.Entry<K, V> entryJ = j(key);
        if (entryJ != null) {
            return entryJ.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return f();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.B0(entrySet(), ", ", "{", "}", 0, null, new Function1() { // from class: kotlin.collections.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractMap.q(this.f143453a, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return h();
    }
}
