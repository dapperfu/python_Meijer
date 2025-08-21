package kotlin;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0096\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00062"}, d2 = {"Ly1/r;", "Ly1/j;", "", "Ly1/k;", "fonts", "<init>", "(Ljava/util/List;)V", "element", "", "o", "(Ly1/k;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "p", "(I)Ly1/k;", "s", "(Ly1/k;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "t", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "h", "Ljava/util/List;", "q", "()Ljava/util/List;", "r", "size", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.r, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final class FontListFontFamily extends AbstractC18267j implements List<InterfaceC18268k>, KMappedMarker {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<InterfaceC18268k> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(List<? extends InterfaceC18268k> list) {
        super(null);
        this.fonts = list;
        if (list.isEmpty()) {
            A1.a.c("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, InterfaceC18268k interfaceC18268k) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends InterfaceC18268k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontListFontFamily) && Intrinsics.e(this.fonts, ((FontListFontFamily) other).fonts);
    }

    @Override // java.util.List
    public ListIterator<InterfaceC18268k> listIterator() {
        return this.fonts.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC18268k remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC18268k> collection) {
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
        if (obj instanceof InterfaceC18268k) {
            return o((InterfaceC18268k) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.fonts.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC18268k) {
            return s((InterfaceC18268k) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<InterfaceC18268k> iterator() {
        return this.fonts.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC18268k) {
            return t((InterfaceC18268k) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<InterfaceC18268k> listIterator(int index) {
        return this.fonts.listIterator(index);
    }

    public boolean o(InterfaceC18268k element) {
        return this.fonts.contains(element);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceC18268k get(int index) {
        return this.fonts.get(index);
    }

    public final List<InterfaceC18268k> q() {
        return this.fonts;
    }

    public int r() {
        return this.fonts.size();
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
    public void replaceAll(UnaryOperator<InterfaceC18268k> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s(InterfaceC18268k element) {
        return this.fonts.indexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC18268k set(int i10, InterfaceC18268k interfaceC18268k) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC18268k> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<InterfaceC18268k> subList(int fromIndex, int toIndex) {
        return this.fonts.subList(fromIndex, toIndex);
    }

    public int t(InterfaceC18268k element) {
        return this.fonts.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return r();
    }
}
