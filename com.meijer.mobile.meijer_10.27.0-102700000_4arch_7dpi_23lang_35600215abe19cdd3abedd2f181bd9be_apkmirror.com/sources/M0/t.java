package M0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0012\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0011\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R)\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&¨\u0006,"}, d2 = {"LM0/t;", "K", "V", "", "LM0/o;", "map", "", "", "iterator", "<init>", "(LM0/o;Ljava/util/Iterator;)V", "", "remove", "()V", "", "hasNext", "()Z", "d", "a", "LM0/o;", "g", "()LM0/o;", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "", "c", "I", "getModification", "()I", "setModification", "(I)V", "modification", "Ljava/util/Map$Entry;", "f", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "current", "e", "h", "setNext", "next", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
abstract class t<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateMap<K, V> map;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Iterator<Map.Entry<K, V>> iterator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int modification;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map.Entry<? extends K, ? extends V> current;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map.Entry<? extends K, ? extends V> next;

    protected final void d() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    protected final Map.Entry<K, V> f() {
        return this.current;
    }

    public final SnapshotStateMap<K, V> g() {
        return this.map;
    }

    protected final Map.Entry<K, V> h() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.h();
        d();
    }

    public final void remove() {
        if (g().h() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                Unit unit = Unit.f142422a;
                this.modification = g().h();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
