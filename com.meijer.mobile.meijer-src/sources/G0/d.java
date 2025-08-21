package G0;

import G0.t;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 -*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001.B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"LG0/d;", "K", "V", "Lkotlin/collections/AbstractMap;", "LE0/f;", "LG0/t;", "node", "", "size", "<init>", "(LG0/t;I)V", "LE0/d;", "", "t", "()LE0/d;", "", "d", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "y", "(Ljava/lang/Object;Ljava/lang/Object;)LG0/d;", "A", "(Ljava/lang/Object;)LG0/d;", "LG0/f;", "s", "()LG0/f;", "LG0/t;", "w", "()LG0/t;", "e", "I", "g", "()I", "v", "keys", "LE0/b;", "x", "()LE0/b;", "values", "f", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class d<K, V> extends AbstractMap<K, V> implements E0.f<K, V> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f11135g = 8;

    /* renamed from: h, reason: collision with root package name */
    private static final d f11136h = new d(t.INSTANCE.a(), 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<K, V> node;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LG0/d$a;", "", "<init>", "()V", "K", "V", "LG0/d;", "a", "()LG0/d;", "", "EMPTY", "LG0/d;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G0.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f11136h;
            Intrinsics.h(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    private final E0.d<Map.Entry<K, V>> t() {
        return new n(this);
    }

    public d<K, V> A(K key) {
        t<K, V> tVarQ = this.node.Q(key != null ? key.hashCode() : 0, key, 0);
        return this.node == tVarQ ? this : tVarQ == null ? INSTANCE.a() : new d<>(tVarQ, size() - 1);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: g, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // E0.f
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder2() {
        return new f<>(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public E0.d<K> f() {
        return new p(this);
    }

    public final t<K, V> w() {
        return this.node;
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public E0.b<V> h() {
        return new r(this);
    }

    public d<K, V> y(K key, V value) {
        t.b<K, V> bVarP = this.node.P(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarP == null ? this : new d<>(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    public d(t<K, V> tVar, int i10) {
        this.node = tVar;
        this.size = i10;
    }

    @Override // kotlin.collections.AbstractMap
    @PublishedApi
    public final Set<Map.Entry<K, V>> d() {
        return t();
    }
}
