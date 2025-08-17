package hl;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010*\n\u0002\b\r\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\nJ3\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0096\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010'\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0017H\u0096\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b.\u0010-J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/H\u0096\u0001¢\u0006\u0004\b0\u00101J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/2\u0006\u0010)\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b0\u00102J&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b5\u00106R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010\u0019¨\u0006<"}, d2 = {"Lhl/z;", "", "Lmk/i;", "changes", "<init>", "(Ljava/util/List;)V", "other", "w", "(Ljava/util/List;)Lhl/z;", "v", "(Lhl/z;)Lhl/z;", "s", "", "matchZeros", "Lkotlin/Pair;", "t", "(Ljava/util/List;Z)Lkotlin/Pair;", "k", "(Ljava/util/List;Z)Lhl/z;", "f", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "element", "a", "(Lmk/i;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "n", "(I)Lmk/i;", "q", "(Lmk/i;)I", "r", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "o", "()Ljava/util/List;", "p", "size", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hl.z, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class ProductChangeRequest implements List<mk.i>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<mk.i> changes;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductChangeRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, mk.i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends mk.i> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductChangeRequest) && Intrinsics.e(this.changes, ((ProductChangeRequest) other).changes);
    }

    @Override // java.util.List
    public ListIterator<mk.i> listIterator() {
        return this.changes.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ mk.i remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductChangeRequest(List<? extends mk.i> changes) {
        Intrinsics.j(changes, "changes");
        this.changes = changes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductChangeRequest h(ProductChangeRequest productChangeRequest, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = productChangeRequest.changes;
        }
        return productChangeRequest.f(list);
    }

    public boolean a(mk.i element) {
        Intrinsics.j(element, "element");
        return this.changes.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends mk.i> collection) {
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
        if (obj instanceof mk.i) {
            return a((mk.i) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        return this.changes.containsAll(elements);
    }

    public final ProductChangeRequest f(List<? extends mk.i> changes) {
        Intrinsics.j(changes, "changes");
        return new ProductChangeRequest(changes);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.changes.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof mk.i) {
            return q((mk.i) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.changes.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<mk.i> iterator() {
        return this.changes.iterator();
    }

    public final ProductChangeRequest k(List<? extends mk.i> other, boolean matchZeros) {
        Intrinsics.j(other, "other");
        return t(other, matchZeros).c();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof mk.i) {
            return r((mk.i) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<mk.i> listIterator(int index) {
        return this.changes.listIterator(index);
    }

    @Override // java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public mk.i get(int index) {
        return this.changes.get(index);
    }

    public final List<mk.i> o() {
        return this.changes;
    }

    public int p() {
        return this.changes.size();
    }

    public int q(mk.i element) {
        Intrinsics.j(element, "element");
        return this.changes.indexOf(element);
    }

    public int r(mk.i element) {
        Intrinsics.j(element, "element");
        return this.changes.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<mk.i> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final ProductChangeRequest s(ProductChangeRequest other) {
        Intrinsics.j(other, "other");
        return new ProductChangeRequest(CollectionsKt.j1(MapsKt.p(mk.k.a(this.changes), mk.k.a(other.changes).keySet()).values()));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ mk.i set(int i10, mk.i iVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super mk.i> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<mk.i> subList(int fromIndex, int toIndex) {
        return this.changes.subList(fromIndex, toIndex);
    }

    public final Pair<ProductChangeRequest, ProductChangeRequest> t(List<? extends mk.i> other, boolean matchZeros) {
        Intrinsics.j(other, "other");
        Map mapA = mk.k.a(other);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mk.k.a(this.changes).entrySet()) {
            String str = (String) entry.getKey();
            mk.i iVar = (mk.i) entry.getValue();
            if (matchZeros && mapA.get(str) == null && iVar.getQuantity() == 0.0d) {
                linkedHashMap.put(str, iVar);
            } else {
                double quantity = iVar.getQuantity();
                mk.i iVar2 = (mk.i) mapA.get(str);
                if (Intrinsics.a(quantity, iVar2 != null ? Double.valueOf(iVar2.getQuantity()) : null)) {
                    mk.i iVar3 = (mk.i) mapA.get(str);
                    if (iVar3 != null) {
                        iVar = iVar3;
                    }
                    linkedHashMap.put(str, iVar);
                } else {
                    linkedHashMap2.put(str, iVar);
                }
            }
        }
        return TuplesKt.a(new ProductChangeRequest(CollectionsKt.j1(linkedHashMap.values())), new ProductChangeRequest(CollectionsKt.j1(linkedHashMap2.values())));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    public String toString() {
        return "ProductChangeRequest(changes=" + this.changes + ')';
    }

    public final ProductChangeRequest v(ProductChangeRequest other) {
        Intrinsics.j(other, "other");
        return w(other.changes);
    }

    public final ProductChangeRequest w(List<? extends mk.i> other) {
        Intrinsics.j(other, "other");
        return new ProductChangeRequest(CollectionsKt.j1(MapsKt.u(mk.k.a(this.changes), mk.k.a(other)).values()));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return p();
    }

    public /* synthetic */ ProductChangeRequest(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}
