package G0;

import E0.f;
import I0.DeltaCounter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010@\u001a\u0002072\u0006\u0010\u0011\u001a\u0002078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u00109\u001a\u0004\b)\u0010;\"\u0004\b?\u0010=R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010B0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010G¨\u0006I"}, d2 = {"LG0/f;", "K", "V", "LE0/f$a;", "Lkotlin/collections/AbstractMutableMap;", "LG0/d;", "map", "<init>", "(LG0/d;)V", "f", "()LG0/d;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "a", "LG0/d;", "LI0/e;", "<set-?>", "b", "LI0/e;", "j", "()LI0/e;", "q", "(LI0/e;)V", "ownership", "LG0/t;", "c", "LG0/t;", "h", "()LG0/t;", "setNode$runtime_release", "(LG0/t;)V", "node", "d", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "n", "(Ljava/lang/Object;)V", "operationResult", "", "e", "I", "g", "()I", "k", "(I)V", "modCount", "r", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class f<K, V> extends AbstractMutableMap<K, V> implements f.a<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d<K, V> map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private I0.e ownership = new I0.e();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t<K, V> node;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V operationResult;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.D(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K key) {
        this.operationResult = null;
        t tVarG = this.node.G(key != null ? key.hashCode() : 0, key, 0, this);
        if (tVarG == null) {
            tVarG = t.INSTANCE.a();
            Intrinsics.h(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarG;
        return this.operationResult;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> b() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t<K, V> tVarA = t.INSTANCE.a();
        Intrinsics.h(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVarA;
        r(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> d() {
        return new l(this);
    }

    @Override // E0.f.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d<K, V> build2() {
        d<K, V> dVar;
        if (this.node == this.map.x()) {
            dVar = this.map;
        } else {
            this.ownership = new I0.e();
            dVar = new d<>(this.node, size());
        }
        this.map = dVar;
        return dVar;
    }

    /* renamed from: g, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    public final t<K, V> h() {
        return this.node;
    }

    /* renamed from: j, reason: from getter */
    public final I0.e getOwnership() {
        return this.ownership;
    }

    public final void k(int i10) {
        this.modCount = i10;
    }

    public final void n(V v10) {
        this.operationResult = v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        d<K, V> dVarBuild = from instanceof d ? (d) from : null;
        if (dVarBuild == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarBuild = fVar != null ? fVar.build2() : null;
        }
        if (dVarBuild == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        t<K, V> tVar = this.node;
        t<K, V> tVarX = dVarBuild.x();
        Intrinsics.h(tVarX, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVar.E(tVarX, 0, deltaCounter, this);
        int size2 = (dVarBuild.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            r(size2);
        }
    }

    protected final void q(I0.e eVar) {
        this.ownership = eVar;
    }

    public void r(int i10) {
        this.size = i10;
        this.modCount++;
    }

    public f(d<K, V> dVar) {
        this.map = dVar;
        this.node = this.map.x();
        this.size = this.map.size();
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        t tVarH = this.node.H(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (tVarH == null) {
            tVarH = t.INSTANCE.a();
            Intrinsics.h(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarH;
        return size != size();
    }
}
