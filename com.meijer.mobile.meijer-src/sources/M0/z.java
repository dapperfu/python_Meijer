package M0;

import androidx.compose.runtime.C5899z0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010+\n\u0002\b\u0019\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u0010J\u001d\u0010*\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0017J\u001d\u0010,\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b,\u0010\u0014J \u0010-\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R$\u0010=\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b1\u0010<¨\u0006>"}, d2 = {"LM0/z;", "T", "", "LM0/m;", "parentList", "", "fromIndex", "toIndex", "<init>", "(LM0/m;II)V", "", "h", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "a", "LM0/m;", "getParentList", "()LM0/m;", "b", "I", "offset", "c", "structure", "<set-?>", "d", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class z<T> implements List<T>, KMutableList {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<T> parentList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int structure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"M0/z$a", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "c", "()Ljava/lang/Void;", "d", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListIterator<T>, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f19541a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z<T> f19542b;

        a(Ref.IntRef intRef, z<T> zVar) {
            this.f19541a = intRef;
            this.f19542b = zVar;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19541a.f143740a < this.f19542b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19541a.f143740a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f19541a.f143740a + 1;
            n.g(i10, this.f19542b.size());
            this.f19541a.f143740a = i10;
            return this.f19542b.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19541a.f143740a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f19541a.f143740a;
            n.g(i10, this.f19542b.size());
            this.f19541a.f143740a = i10 - 1;
            return this.f19542b.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19541a.f143740a;
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void add(T element) {
            n.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            n.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void set(T element) {
            n.f();
            throw new KotlinNothingValueException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        h();
        this.parentList.add(this.offset + size(), element);
        this.size = size() + 1;
        this.structure = this.parentList.p();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        h();
        boolean zAddAll = this.parentList.addAll(index + this.offset, elements);
        if (zAddAll) {
            this.size = size() + elements.size();
            this.structure = this.parentList.p();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return f(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    private final void h() {
        if (this.parentList.p() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
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

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        h();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f143740a = index - 1;
        return new a(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            C5899z0.a("fromIndex or toIndex are out of bounds");
        }
        h();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i10 = this.offset;
        return new z(snapshotStateList, fromIndex + i10, toIndex + i10);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    public z(SnapshotStateList<T> snapshotStateList, int i10, int i11) {
        this.parentList = snapshotStateList;
        this.offset = i10;
        this.structure = snapshotStateList.p();
        this.size = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            h();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i10 = this.offset;
            snapshotStateList.s(i10, size() + i10);
            this.size = 0;
            this.structure = this.parentList.p();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        if (indexOf(element) >= 0) {
            return true;
        }
        return false;
    }

    public T f(int index) {
        h();
        T tRemove = this.parentList.remove(this.offset + index);
        this.size = size() - 1;
        this.structure = this.parentList.p();
        return tRemove;
    }

    @Override // java.util.List
    public T get(int index) {
        h();
        n.g(index, size());
        return this.parentList.get(this.offset + index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        h();
        int i10 = this.offset;
        Iterator<Integer> it = RangesKt.x(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.e(element, this.parentList.get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        h();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!Intrinsics.e(element, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        h();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i10 = this.offset;
        int iU = snapshotStateList.u(elements, i10, size() + i10);
        if (iU > 0) {
            this.structure = this.parentList.p();
            this.size = size() - iU;
        }
        if (iU > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        n.g(index, size());
        h();
        T t10 = this.parentList.set(index + this.offset, element);
        this.structure = this.parentList.p();
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void add(int index, T element) {
        h();
        this.parentList.add(this.offset + index, element);
        this.size = size() + 1;
        this.structure = this.parentList.p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        return addAll(size(), elements);
    }
}
