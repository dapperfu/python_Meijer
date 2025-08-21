package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ \u0010\u0010\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "", "delegate", "<init>", "(Ljava/util/List;)V", "", "index", "get", "(I)Ljava/lang/Object;", "", "clear", "()V", "f", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "add", "(ILjava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "a", "Ljava/util/List;", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<T> delegate;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "()I", "previous", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)V", "remove", "()V", "set", "a", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ListIterator<T> delegateIterator;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReversedList<T> f143426b;

        AnonymousClass1(ReversedList<T> reversedList, int i10) {
            this.f143426b = reversedList;
            this.delegateIterator = ((ReversedList) reversedList).delegate.listIterator(o.X(reversedList, i10));
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.delegateIterator.add(element);
            this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return o.W(this.f143426b, this.delegateIterator.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return o.W(this.f143426b, this.delegateIterator.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.delegateIterator.remove();
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.delegateIterator.set(element);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public ReversedList(List<T> delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a */
    public int getLength() {
        return this.delegate.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        this.delegate.add(o.X(this, index), element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.delegate.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T f(int index) {
        return this.delegate.remove(o.V(this, index));
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.delegate.get(o.V(this, index));
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int index) {
        return new AnonymousClass1(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        return this.delegate.set(o.V(this, index), element);
    }
}
