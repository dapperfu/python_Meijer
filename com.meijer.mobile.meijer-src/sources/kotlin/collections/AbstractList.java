package kotlin.collections;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000  *\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004! \"#B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "c", "b", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "<init>", "()V", "", "index", "size", "", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "oldCapacity", "minCapacity", "e", "(II)I", "", "g", "(Ljava/util/Collection;)I", "other", "", "f", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int e(int oldCapacity, int minCapacity) {
            int i10 = oldCapacity + (oldCapacity >> 1);
            if (i10 - minCapacity < 0) {
                i10 = minCapacity;
            }
            if (i10 - 2147483639 <= 0) {
                return i10;
            }
            if (minCapacity > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        private Companion() {
        }

        public final void a(int startIndex, int endIndex, int size) {
            if (startIndex < 0 || endIndex > size) {
                throw new IndexOutOfBoundsException("startIndex: " + startIndex + ", endIndex: " + endIndex + ", size: " + size);
            }
            if (startIndex <= endIndex) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + startIndex + " > endIndex: " + endIndex);
        }

        public final void b(int index, int size) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
            }
        }

        public final void c(int index, int size) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
            }
        }

        public final void d(int fromIndex, int toIndex, int size) {
            if (fromIndex < 0 || toIndex > size) {
                throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
            }
            if (fromIndex <= toIndex) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
        }

        public final boolean f(Collection<?> c10, Collection<?> other) {
            Intrinsics.j(c10, "c");
            Intrinsics.j(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.e(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> c10) {
            Intrinsics.j(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/collections/AbstractList$a;", "", "<init>", "(Lkotlin/collections/AbstractList;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "a", "I", "()I", "c", "(I)V", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private class a implements Iterator<E>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a() {
        }

        /* renamed from: a, reason: from getter */
        protected final int getIndex() {
            return this.index;
        }

        protected final void c(int i10) {
            this.index = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                AbstractList<E> abstractList = AbstractList.this;
                int i10 = this.index;
                this.index = i10 + 1;
                return abstractList.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/collections/AbstractList$b;", "Lkotlin/collections/AbstractList$a;", "Lkotlin/collections/AbstractList;", "", "", "index", "<init>", "(Lkotlin/collections/AbstractList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private class b extends AbstractList<E>.a implements ListIterator<E>, KMappedMarker {
        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public b(int i10) {
            super();
            AbstractList.INSTANCE.c(i10, AbstractList.this.size());
            c(i10);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (getIndex() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                AbstractList<E> abstractList = AbstractList.this;
                c(getIndex() - 1);
                return abstractList.get(getIndex());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/collections/AbstractList$c;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "fromIndex", "toIndex", "<init>", "(Lkotlin/collections/AbstractList;II)V", "index", "get", "(I)Ljava/lang/Object;", "b", "Lkotlin/collections/AbstractList;", "c", "I", "d", "_size", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c<E> extends AbstractList<E> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractList<E> list;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractList<? extends E> list, int i10, int i11) {
            Intrinsics.j(list, "list");
            this.list = list;
            this.fromIndex = i10;
            AbstractList.INSTANCE.d(i10, i11, list.size());
            this._size = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: f, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int index) {
            AbstractList.INSTANCE.b(index, this._size);
            return this.list.get(this.fromIndex + index);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract E get(int index);

    public ListIterator<E> listIterator() {
        return new b(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return INSTANCE.f(this, (Collection) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return INSTANCE.g(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    public ListIterator<E> listIterator(int index) {
        return new b(index);
    }

    public List<E> subList(int fromIndex, int toIndex) {
        return new c(this, fromIndex, toIndex);
    }

    protected AbstractList() {
    }

    public int indexOf(Object element) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (Intrinsics.e(it.next(), element)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int lastIndexOf(Object element) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.e(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
