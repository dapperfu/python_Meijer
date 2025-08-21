package kotlin;

import M0.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0096\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010'R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010,\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ln0/F;", "", "Ln0/F$a;", "", "items", "<init>", "(Ljava/util/List;)V", "()V", "element", "", "a", "(Ln0/F$a;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "f", "(I)Ln0/F$a;", "k", "(Ln0/F$a;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "n", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "item", "", "o", "(Ln0/F$a;)V", "p", "Ljava/util/List;", "h", "()I", "size", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15847F implements List<a>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> items;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Ln0/F$a;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getIndex", "()I", "index", "Ln0/D;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.F$a */
    public interface a {
        int getIndex();

        Object getKey();
    }

    private C15847F(List<a> list) {
        this.items = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<a> listIterator() {
        return this.items.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public C15847F() {
        this(new SnapshotStateList());
    }

    public boolean a(a element) {
        return this.items.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a) {
            return a((a) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.items.containsAll(elements);
    }

    @Override // java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a get(int index) {
        return this.items.get(index);
    }

    public int h() {
        return this.items.size();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof a) {
            return k((a) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<a> iterator() {
        return this.items.iterator();
    }

    public int k(a element) {
        return this.items.indexOf(element);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof a) {
            return n((a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<a> listIterator(int index) {
        return this.items.listIterator(index);
    }

    public int n(a element) {
        return this.items.lastIndexOf(element);
    }

    public final void o(a item) {
        this.items.add(item);
    }

    public final void p(a item) {
        this.items.remove(item);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a set(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<a> subList(int fromIndex, int toIndex) {
        return this.items.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }
}
