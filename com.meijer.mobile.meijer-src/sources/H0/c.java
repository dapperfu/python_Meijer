package H0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LH0/c;", "E", "", "", "nextElement", "", "LH0/a;", "map", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "", "a", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/lang/Object;", "b", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "", "c", "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class c<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object nextElement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<E, a> map;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public c(Object obj, Map<E, a> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void a() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public E next() {
        a();
        E e10 = (E) this.nextElement;
        this.index++;
        a aVar = this.map.get(e10);
        if (aVar != null) {
            this.nextElement = aVar.getNext();
            return e10;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e10 + ") has changed after it was added to the persistent set.");
    }
}
