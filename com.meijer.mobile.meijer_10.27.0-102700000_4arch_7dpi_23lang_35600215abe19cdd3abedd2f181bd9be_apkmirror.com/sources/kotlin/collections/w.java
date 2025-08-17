package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B>\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R/\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010)¨\u00061"}, d2 = {"Lkotlin/collections/w;", "K", "V", "Lkotlin/collections/v;", "", "map", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "key", "default", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "u", "a", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "b", "Lkotlin/jvm/functions/Function1;", "c", "size", "", "()Ljava/util/Set;", "keys", "", "d", "()Ljava/util/Collection;", "values", "", "entries", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class w<K, V> implements v<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<K, V> map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<K, V> default;

    @Override // java.util.Map
    public void clear() {
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
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(Map<K, ? extends V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.j(map, "map");
        Intrinsics.j(function1, "default");
        this.map = map;
        this.default = function1;
    }

    @Override // kotlin.collections.v
    public Map<K, V> m() {
        return this.map;
    }

    public Set<Map.Entry<K, V>> a() {
        return m().entrySet();
    }

    public Set<K> b() {
        return m().keySet();
    }

    public int c() {
        return m().size();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return m().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return m().containsValue(value);
    }

    public Collection<V> d() {
        return m().values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return m().equals(other);
    }

    @Override // java.util.Map
    public V get(Object key) {
        return m().get(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return m().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return m().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public String toString() {
        return m().toString();
    }

    @Override // kotlin.collections.v
    public V u(K key) {
        Map<K, V> mapM = m();
        V v10 = mapM.get(key);
        if (v10 == null && !mapM.containsKey(key)) {
            return this.default.invoke(key);
        }
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return d();
    }
}
