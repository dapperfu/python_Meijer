package D0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0010F\fB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\rJ\u001b\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010(J\u0015\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b1\u0010/J\u0015\u00102\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\rJ\u001b\u00103\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b3\u0010\u001cJ\u0015\u00104\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0006H\u0001¢\u0006\u0004\b;\u0010&J\u001b\u0010<\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b<\u0010\u001cJ \u0010=\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b=\u0010>J%\u0010B\u001a\u00020\u000f2\u0016\u0010A\u001a\u0012\u0012\u0004\u0012\u00028\u00000?j\b\u0012\u0004\u0012\u00028\u0000`@¢\u0006\u0004\bB\u0010CR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0010\u0010D\u0012\u0004\bE\u0010!R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"LD0/c;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "c", "(Ljava/lang/Object;)Z", "index", "", "a", "(ILjava/lang/Object;)V", "", "elements", "g", "(ILjava/util/List;)Z", "e", "(ILD0/c;)Z", "", "f", "(ILjava/util/Collection;)Z", "h", "(Ljava/util/Collection;)Z", "", "i", "()Ljava/util/List;", "k", "()V", "l", "m", "capacity", "w", "(I)V", "n", "()Ljava/lang/Object;", "", "message", "", "B", "(Ljava/lang/String;)Ljava/lang/Void;", "p", "(Ljava/lang/Object;)I", "q", "r", "s", "t", "u", "(I)Ljava/lang/Object;", "start", "end", "v", "(II)V", "newSize", "z", "x", "y", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "A", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "getContent$annotations", "b", "Ljava/util/List;", "list", "<set-?>", "I", "o", "()I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c<T> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final int f5876d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public T[] content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<T> list;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00102¨\u00064"}, d2 = {"LD0/c$a;", "T", "", "LD0/c;", "vector", "<init>", "(LD0/c;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "LD0/c;", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a<T> implements List<T>, KMutableList {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c<T> vector;

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.c(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.f(index, elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C0105c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public int a() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.a(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.h(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.k();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.l(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            return this.vector.m(elements);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.p(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0105c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.r(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new C0105c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.s(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            return this.vector.t(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            return this.vector.x(elements);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.b(this, tArr);
        }

        public a(c<T> cVar) {
            this.vector = cVar;
        }

        public T f(int index) {
            d.a(this, index);
            return this.vector.u(index);
        }

        @Override // java.util.List
        public T get(int index) {
            d.a(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d.a(this, index);
            return this.vector.y(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d.b(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00106¨\u00068"}, d2 = {"LD0/c$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "f", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "b", "I", "c", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b<T> implements List<T>, KMutableList {

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
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new C0105c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return f(i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
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
            return new C0105c(this, 0);
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
            return new C0105c(this, index);
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
            int i10 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
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
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.b(this, tArr);
        }

        public b(List<T> list, int i10, int i11) {
            this.list = list;
            this.start = i10;
            this.end = i11;
        }

        public T f(int index) {
            d.a(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List
        public T get(int index) {
            d.a(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            d.a(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            d.b(this, fromIndex, toIndex);
            return new b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LD0/c$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D0.c$c, reason: collision with other inner class name */
    private static final class C0105c<T> implements ListIterator<T>, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i10 = this.index;
            this.index = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.index - 1;
            this.index = i10;
            return this.list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.index - 1;
            this.index = i10;
            this.list.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }

        public C0105c(List<T> list, int i10) {
            this.list = list;
            this.index = i10;
        }
    }

    public final void A(Comparator<T> comparator) {
        ArraysKt.P(this.content, comparator, 0, this.size);
    }

    @PublishedApi
    public final Void B(String message) {
        throw new NoSuchElementException(message);
    }

    public final void a(int index, T element) {
        int i10 = this.size + 1;
        if (this.content.length < i10) {
            w(i10);
        }
        T[] tArr = this.content;
        int i11 = this.size;
        if (index != i11) {
            System.arraycopy(tArr, index, tArr, index + 1, i11 - index);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean c(T element) {
        int i10 = this.size + 1;
        if (this.content.length < i10) {
            w(i10);
        }
        T[] tArr = this.content;
        int i11 = this.size;
        tArr[i11] = element;
        this.size = i11 + 1;
        return true;
    }

    public final boolean e(int index, c<T> elements) {
        int i10 = elements.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size + i10;
        if (this.content.length < i11) {
            w(i11);
        }
        T[] tArr = this.content;
        int i12 = this.size;
        if (index != i12) {
            System.arraycopy(tArr, index, tArr, index + i10, i12 - index);
        }
        System.arraycopy(elements.content, 0, tArr, index, i10);
        this.size += i10;
        return true;
    }

    public final boolean h(Collection<? extends T> elements) {
        return f(this.size, elements);
    }

    public final List<T> i() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final void k() {
        T[] tArr = this.content;
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            tArr[i11] = null;
        }
        this.size = 0;
    }

    public final boolean m(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int p(T element) {
        T[] tArr = this.content;
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (Intrinsics.e(element, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    public final int r(T element) {
        T[] tArr = this.content;
        for (int i10 = this.size - 1; i10 >= 0; i10--) {
            if (Intrinsics.e(element, tArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public final T u(int index) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        if (index != getSize() - 1) {
            int i10 = index + 1;
            System.arraycopy(tArr, i10, tArr, index, this.size - i10);
        }
        int i11 = this.size - 1;
        this.size = i11;
        tArr[i11] = null;
        return t10;
    }

    public final void v(int start, int end) {
        if (end > start) {
            int i10 = this.size;
            if (end < i10) {
                T[] tArr = this.content;
                System.arraycopy(tArr, end, tArr, start, i10 - end);
            }
            int i11 = this.size - (end - start);
            int size = getSize() - 1;
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.content[i12] = null;
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.size = i11;
        }
    }

    @PublishedApi
    public final void w(int capacity) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(capacity, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean x(Collection<? extends T> elements) {
        int i10 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                u(size);
            }
        }
        return i10 != this.size;
    }

    public final T y(int index, T element) {
        T[] tArr = this.content;
        T t10 = tArr[index];
        tArr[index] = element;
        return t10;
    }

    @PublishedApi
    public final void z(int newSize) {
        this.size = newSize;
    }

    @PublishedApi
    public c(T[] tArr, int i10) {
        this.content = tArr;
        this.size = i10;
    }

    public final boolean f(int index, Collection<? extends T> elements) {
        int i10 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i11 = this.size + size;
        if (this.content.length < i11) {
            w(i11);
        }
        T[] tArr = this.content;
        int i12 = this.size;
        if (index != i12) {
            System.arraycopy(tArr, index, tArr, index + size, i12 - index);
        }
        for (T t10 : elements) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            tArr[i10 + index] = t10;
            i10 = i13;
        }
        this.size += size;
        return true;
    }

    public final boolean g(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i10 = this.size + size;
        if (this.content.length < i10) {
            w(i10);
        }
        T[] tArr = this.content;
        int i11 = this.size;
        if (index != i11) {
            System.arraycopy(tArr, index, tArr, index + size, i11 - index);
        }
        int size2 = elements.size();
        for (int i12 = 0; i12 < size2; i12++) {
            tArr[index + i12] = elements.get(i12);
        }
        this.size += size;
        return true;
    }

    public final boolean l(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i10 = 0; !Intrinsics.e(this.content[i10], element); i10++) {
                if (i10 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final T n() {
        if (getSize() != 0) {
            return this.content[0];
        }
        B("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final T q() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        B("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean s(T element) {
        int iP = p(element);
        if (iP >= 0) {
            u(iP);
            return true;
        }
        return false;
    }

    public final boolean t(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i10 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        if (i10 == this.size) {
            return false;
        }
        return true;
    }
}
