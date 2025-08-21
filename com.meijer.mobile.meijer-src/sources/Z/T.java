package Z;

import a0.C5640d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003=>:B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00032\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%H\u0001¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b*\u0010\rJ\u001b\u0010+\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b+\u0010\u001bJ\u001e\u0010,\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b,\u0010!J\u0017\u0010-\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\u00032\b\b\u0001\u00100\u001a\u00020\u0003¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b3\u00104J\"\u0010\u0001\u001a\u00028\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0001\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006¢\u0006\u0004\b7\u00108R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"LZ/T;", "E", "LZ/c0;", "", "initialCapacity", "<init>", "(I)V", "index", "", "F", "element", "", "n", "(Ljava/lang/Object;)Z", "m", "(ILjava/lang/Object;)V", "", "elements", "o", "(ILjava/util/Collection;)Z", "p", "(LZ/c0;)Z", "", "r", "(Ljava/util/List;)Z", "", "q", "(Ljava/lang/Iterable;)Z", "v", "(LZ/c0;)V", "x", "(Ljava/util/List;)V", "w", "(Ljava/lang/Iterable;)V", "t", "()V", "capacity", "", "", "oldContent", "C", "(I[Ljava/lang/Object;)V", "y", "z", "u", "A", "(I)Ljava/lang/Object;", "start", "end", "B", "(II)V", "D", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "s", "()Ljava/util/List;", "LZ/T$b;", "c", "LZ/T$b;", "list", "a", "b", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class T<E> extends c0<E> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b<E> list;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LZ/T$a;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "prevIndex", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a<T> implements ListIterator<T>, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int prevIndex;

        public a(List<T> list, int i10) {
            Intrinsics.j(list, "list");
            this.list = list;
            this.prevIndex = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            List<T> list = this.list;
            int i10 = this.prevIndex + 1;
            this.prevIndex = i10;
            list.add(i10, element);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.prevIndex + 1;
            this.prevIndex = i10;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i10 = this.prevIndex;
            this.prevIndex = i10 - 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"LZ/T$b;", "T", "", "LZ/T;", "objectList", "<init>", "(LZ/T;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "LZ/T;", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b<T> implements List<T>, KMutableList {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final T<T> objectList;

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.objectList.n(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.j(elements, "elements");
            return this.objectList.o(index, elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public b(T<T> objectList) {
            Intrinsics.j(objectList, "objectList");
            this.objectList = objectList;
        }

        public int a() {
            return this.objectList.get_size();
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.objectList.m(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.j(elements, "elements");
            return this.objectList.q(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.t();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.objectList.a(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            return this.objectList.b(elements);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.objectList.f(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.g();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.objectList.k(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.objectList.y(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            return this.objectList.z(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            return this.objectList.D(elements);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.j(array, "array");
            return (T[]) CollectionToArray.b(this, array);
        }

        public T f(int index) {
            d0.d(this, index);
            return this.objectList.A(index);
        }

        @Override // java.util.List
        public T get(int index) {
            d0.d(this, index);
            return this.objectList.d(index);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d0.d(this, index);
            return this.objectList.E(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d0.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00106¨\u00068"}, d2 = {"LZ/T$c;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "b", "I", "c", "()I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c<T> implements List<T>, KMutableList {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int end;

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i10 = this.end;
            this.end = i10 + 1;
            list.add(i10, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.j(elements, "elements");
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public c(List<T> list, int i10, int i11) {
            Intrinsics.j(list, "list");
            this.list = list;
            this.start = i10;
            this.end = i11;
        }

        public int a() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 <= i10) {
                while (true) {
                    this.list.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (Intrinsics.e(this.list.get(i11), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (Intrinsics.e(this.list.get(i11), element)) {
                    return i11 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i10 = this.end - 1;
            int i11 = this.start;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.e(this.list.get(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new a(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i10 = this.end;
            for (int i11 = this.start; i11 < i10; i11++) {
                if (Intrinsics.e(this.list.get(i11), element)) {
                    this.list.remove(i11);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            int i10 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.j(elements, "elements");
            int i10 = this.end;
            int i11 = i10 - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    if (!elements.contains(this.list.get(i11))) {
                        this.list.remove(i11);
                        this.end--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.j(array, "array");
            return (T[]) CollectionToArray.b(this, array);
        }

        public T f(int index) {
            d0.d(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List
        public T get(int index) {
            d0.d(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d0.d(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d0.e(this, fromIndex, toIndex);
            return new c(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.j(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public T() {
        this(0, 1, null);
    }

    public T(int i10) {
        super(i10, null);
    }

    private final void F(int index) {
        C5640d.c("Index " + index + " must be in 0.." + this._size);
    }

    public final E A(int index) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        Object[] objArr = this.content;
        E e10 = (E) objArr[index];
        int i10 = this._size;
        if (index != i10 - 1) {
            ArraysKt.o(objArr, objArr, index, index + 1, i10);
        }
        int i11 = this._size - 1;
        this._size = i11;
        objArr[i11] = null;
        return e10;
    }

    public final void B(int start, int end) {
        int i10;
        if (start < 0 || start > (i10 = this._size) || end < 0 || end > i10) {
            C5640d.c("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
        }
        if (end < start) {
            C5640d.a("Start (" + start + ") is more than end (" + end + ')');
        }
        if (end != start) {
            int i11 = this._size;
            if (end < i11) {
                Object[] objArr = this.content;
                ArraysKt.o(objArr, objArr, start, end, i11);
            }
            int i12 = this._size;
            int i13 = i12 - (end - start);
            ArraysKt.B(this.content, null, i13, i12);
            this._size = i13;
        }
    }

    @PublishedApi
    public final void C(int capacity, Object[] oldContent) {
        Intrinsics.j(oldContent, "oldContent");
        int length = oldContent.length;
        this.content = ArraysKt.o(oldContent, new Object[Math.max(capacity, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean D(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = this._size;
        Object[] objArr = this.content;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.contains(objArr[i11])) {
                A(i11);
            }
        }
        return i10 != this._size;
    }

    public final E E(int index, E element) {
        if (index < 0 || index >= this._size) {
            l(index);
        }
        Object[] objArr = this.content;
        E e10 = (E) objArr[index];
        objArr[index] = element;
        return e10;
    }

    public final void m(int index, E element) {
        if (index < 0 || index > this._size) {
            F(index);
        }
        int i10 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            C(i10, objArr);
        }
        Object[] objArr2 = this.content;
        int i11 = this._size;
        if (index != i11) {
            ArraysKt.o(objArr2, objArr2, index + 1, index, i11);
        }
        objArr2[index] = element;
        this._size++;
    }

    public final boolean n(E element) {
        int i10 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            C(i10, objArr);
        }
        Object[] objArr2 = this.content;
        int i11 = this._size;
        objArr2[i11] = element;
        this._size = i11 + 1;
        return true;
    }

    public final boolean o(int index, Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        if (index < 0 || index > this._size) {
            F(index);
        }
        int i10 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            C(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (index != this._size) {
            ArraysKt.o(objArr2, objArr2, elements.size() + index, index, this._size);
        }
        for (Object obj : elements) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            objArr2[i10 + index] = obj;
            i10 = i11;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean p(c0<E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = this._size;
        v(elements);
        return i10 != this._size;
    }

    public final boolean q(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = this._size;
        w(elements);
        return i10 != this._size;
    }

    public final boolean r(List<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = this._size;
        x(elements);
        return i10 != this._size;
    }

    public final List<E> s() {
        b<E> bVar = this.list;
        if (bVar != null) {
            return bVar;
        }
        b<E> bVar2 = new b<>(this);
        this.list = bVar2;
        return bVar2;
    }

    public final void t() {
        ArraysKt.B(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void u(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            y(it.next());
        }
    }

    public final void v(c0<E> elements) {
        Intrinsics.j(elements, "elements");
        if (elements.g()) {
            return;
        }
        int i10 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            C(i10, objArr);
        }
        ArraysKt.o(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final void w(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            n(it.next());
        }
    }

    public final void x(List<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this._size;
        int size = elements.size() + i10;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            C(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this._size += elements.size();
    }

    public final boolean z(Iterable<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        int i10 = this._size;
        u(elements);
        return i10 != this._size;
    }

    public /* synthetic */ T(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean y(E element) {
        int iF = f(element);
        if (iF >= 0) {
            A(iF);
            return true;
        }
        return false;
    }
}
