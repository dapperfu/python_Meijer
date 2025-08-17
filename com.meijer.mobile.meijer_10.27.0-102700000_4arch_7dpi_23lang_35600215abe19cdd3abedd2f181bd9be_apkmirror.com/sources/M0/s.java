package M0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LM0/s;", "K", "V", "LM0/t;", "", "", "LM0/o;", "map", "", "", "iterator", "<init>", "(LM0/o;Ljava/util/Iterator;)V", "j", "()Ljava/util/Map$Entry;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class s<K, V> extends t<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"M0/s$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "b", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private V value;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s<K, V> f18787c;

        a(s<K, V> sVar) {
            this.f18787c = sVar;
            Map.Entry<K, V> entryF = sVar.f();
            Intrinsics.g(entryF);
            this.key = entryF.getKey();
            Map.Entry<K, V> entryF2 = sVar.f();
            Intrinsics.g(entryF2);
            this.value = entryF2.getValue();
        }

        public void a(V v10) {
            this.value = v10;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            s<K, V> sVar = this.f18787c;
            if (sVar.g().h() != ((t) sVar).modification) {
                throw new ConcurrentModificationException();
            }
            V v10 = (V) getValue();
            sVar.g().put(getKey(), newValue);
            a(newValue);
            return v10;
        }
    }

    public s(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        d();
        if (f() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
