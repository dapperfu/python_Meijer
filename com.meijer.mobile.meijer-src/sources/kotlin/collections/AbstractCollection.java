package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/collections/AbstractCollection;", "E", "", "<init>", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class AbstractCollection<E> implements Collection<E>, KMappedMarker {
    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: f */
    public abstract int get_size();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence h(AbstractCollection abstractCollection, Object obj) {
        return obj == abstractCollection ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.B0(this, ", ", "[", "]", 0, null, new Function1() { // from class: kotlin.collections.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractCollection.h(this.f143452a, obj);
            }
        }, 24, null);
    }

    protected AbstractCollection() {
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object element) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (Intrinsics.e(it.next(), element)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return get_size();
    }
}
