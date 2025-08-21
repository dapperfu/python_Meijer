package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010,J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00105J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\u0004R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/ui/node/w;", "", "Landroidx/compose/ui/Modifier$c;", "<init>", "()V", "Landroidx/compose/ui/node/r;", "q", "()J", "", "depth", "", "y", "(I)V", "startDepth", "endDepth", "B", "(II)V", "", "t", "()Z", "a", "", "distanceFromEdge", "isInLayer", "w", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "u", "(Landroidx/compose/ui/Modifier$c;ZLkotlin/jvm/functions/Function0;)V", "C", "(Landroidx/compose/ui/Modifier$c;FZLkotlin/jvm/functions/Function0;)V", "element", "p", "(Landroidx/compose/ui/Modifier$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "r", "(I)Landroidx/compose/ui/Modifier$c;", "v", "(Landroidx/compose/ui/Modifier$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "x", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "LZ/T;", "", "LZ/T;", "values", "LZ/N;", "b", "LZ/N;", "distanceFromEdgeAndFlags", "c", "I", "hitDepth", "s", "()I", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5968w implements List<Modifier.c>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Z.T<Object> values = new Z.T<>(16);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Z.N distanceFromEdgeAndFlags = new Z.N(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/w$a;", "", "Landroidx/compose/ui/Modifier$c;", "", "index", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/w;III)V", "", "hasNext", "()Z", "hasPrevious", "a", "()Landroidx/compose/ui/Modifier$c;", "nextIndex", "()I", "c", "previousIndex", "I", "getIndex", "setIndex", "(I)V", "b", "getMinIndex", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.w$a */
    private final class a implements ListIterator<Modifier.c>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i10, int i11, int i12) {
            this.index = i10;
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Modifier.c next() {
            Z.T t10 = C5968w.this.values;
            int i10 = this.index;
            this.index = i10 + 1;
            E eD = t10.d(i10);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) eD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Modifier.c previous() {
            Z.T t10 = C5968w.this.values;
            int i10 = this.index - 1;
            this.index = i10;
            E eD = t10.d(i10);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) eD;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        public /* synthetic */ a(C5968w c5968w, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? c5968w.size() : i12);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/w$b;", "", "Landroidx/compose/ui/Modifier$c;", "", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/w;II)V", "element", "", "a", "(Landroidx/compose/ui/Modifier$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "f", "(I)Landroidx/compose/ui/Modifier$c;", "k", "(Landroidx/compose/ui/Modifier$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "n", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "I", "getMinIndex", "()I", "b", "getMaxIndex", "h", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.w$b */
    private final class b implements List<Modifier.c>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, Modifier.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends Modifier.c> collection) {
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

        @Override // java.util.List
        public ListIterator<Modifier.c> listIterator() {
            C5968w c5968w = C5968w.this;
            int i10 = this.minIndex;
            return c5968w.new a(i10, i10, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.c remove(int i10) {
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
        public void replaceAll(UnaryOperator<Modifier.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.c set(int i10, Modifier.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        public b(int i10, int i11) {
            this.minIndex = i10;
            this.maxIndex = i11;
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.c) {
                return a((Modifier.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Modifier.c get(int index) {
            E eD = C5968w.this.values.d(index + this.minIndex);
            Intrinsics.h(eD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) eD;
        }

        public int h() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.c) {
                return k((Modifier.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<Modifier.c> iterator() {
            C5968w c5968w = C5968w.this;
            int i10 = this.minIndex;
            return c5968w.new a(i10, i10, this.maxIndex);
        }

        public int k(Modifier.c element) {
            int i10 = this.minIndex;
            int i11 = this.maxIndex;
            if (i10 > i11) {
                return -1;
            }
            while (!Intrinsics.e(C5968w.this.values.d(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.c) {
                return n((Modifier.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.c> listIterator(int index) {
            C5968w c5968w = C5968w.this;
            int i10 = this.minIndex;
            return c5968w.new a(index + i10, i10, this.maxIndex);
        }

        public int n(Modifier.c element) {
            int i10 = this.maxIndex;
            int i11 = this.minIndex;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.e(C5968w.this.values.d(i10), element)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<Modifier.c> subList(int fromIndex, int toIndex) {
            C5968w c5968w = C5968w.this;
            int i10 = this.minIndex;
            return c5968w.new b(fromIndex + i10, i10 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.b(this, tArr);
        }

        public boolean a(Modifier.c element) {
            if (indexOf(element) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return h();
        }
    }

    private final long q() {
        long jB = C5969x.b(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i10 = this.hitDepth + 1;
        int iO = CollectionsKt.o(this);
        if (i10 <= iO) {
            while (true) {
                long jB2 = r.b(this.distanceFromEdgeAndFlags.a(i10));
                if (r.a(jB2, jB) < 0) {
                    jB = jB2;
                }
                if ((r.c(jB) < 0.0f && r.e(jB)) || i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return jB;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, Modifier.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends Modifier.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.t();
        this.distanceFromEdgeAndFlags.f();
    }

    @Override // java.util.List
    public ListIterator<Modifier.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.c remove(int i10) {
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
    public void replaceAll(UnaryOperator<Modifier.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.c set(int i10, Modifier.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.B(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.i(startDepth, endDepth);
    }

    private final void y(int depth) {
        this.values.A(depth);
        this.distanceFromEdgeAndFlags.h(depth);
    }

    public final void C(Modifier.c node, float distanceFromEdge, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == CollectionsKt.o(this)) {
            int i10 = this.hitDepth;
            B(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(C5969x.a(distanceFromEdge, isInLayer, false));
            childHitTest.invoke();
            this.hitDepth = i10;
            if (this.hitDepth + 1 == CollectionsKt.o(this) || r.d(q())) {
                y(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jQ = q();
        int i11 = this.hitDepth;
        this.hitDepth = CollectionsKt.o(this);
        int i12 = this.hitDepth;
        B(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(C5969x.a(distanceFromEdge, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i12;
        long jQ2 = q();
        if (this.hitDepth + 1 >= CollectionsKt.o(this) || r.a(jQ, jQ2) <= 0) {
            B(this.hitDepth + 1, size());
        } else {
            B(i11 + 1, r.d(jQ2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.c) {
            return p((Modifier.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((Modifier.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.c) {
            return v((Modifier.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Modifier.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.c) {
            return x((Modifier.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.c> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Modifier.c get(int index) {
        Object objD = this.values.d(index);
        Intrinsics.h(objD, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.c) objD;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return this.values.get_size();
    }

    @Override // java.util.List
    public List<Modifier.c> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    public final void u(Modifier.c node, boolean isInLayer, Function0<Unit> childHitTest) {
        if (this.hitDepth == CollectionsKt.o(this)) {
            int i10 = this.hitDepth;
            B(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.n(node);
            this.distanceFromEdgeAndFlags.d(C5969x.a(0.0f, isInLayer, true));
            childHitTest.invoke();
            this.hitDepth = i10;
            return;
        }
        long jQ = q();
        int i11 = this.hitDepth;
        if (!r.d(jQ)) {
            if (r.c(jQ) > 0.0f) {
                int i12 = this.hitDepth;
                B(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.n(node);
                this.distanceFromEdgeAndFlags.d(C5969x.a(0.0f, isInLayer, true));
                childHitTest.invoke();
                this.hitDepth = i12;
                return;
            }
            return;
        }
        this.hitDepth = CollectionsKt.o(this);
        int i13 = this.hitDepth;
        B(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.n(node);
        this.distanceFromEdgeAndFlags.d(C5969x.a(0.0f, isInLayer, true));
        childHitTest.invoke();
        this.hitDepth = i13;
        if (r.c(q()) < 0.0f) {
            B(i11 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i11;
    }

    public final boolean w(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == CollectionsKt.o(this)) {
            return true;
        }
        return r.a(q(), C5969x.b(distanceFromEdge, isInLayer, false, 4, null)) > 0;
    }

    public final void a() {
        this.hitDepth = size() - 1;
    }

    public boolean p(Modifier.c element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    public final boolean t() {
        long jQ = q();
        if (r.c(jQ) < 0.0f && r.e(jQ) && !r.d(jQ)) {
            return true;
        }
        return false;
    }

    public int v(Modifier.c element) {
        int iO = CollectionsKt.o(this);
        if (iO >= 0) {
            int i10 = 0;
            while (!Intrinsics.e(this.values.d(i10), element)) {
                if (i10 != iO) {
                    i10++;
                } else {
                    return -1;
                }
            }
            return i10;
        }
        return -1;
    }

    public int x(Modifier.c element) {
        for (int iO = CollectionsKt.o(this); -1 < iO; iO--) {
            if (Intrinsics.e(this.values.d(iO), element)) {
                return iO;
            }
        }
        return -1;
    }
}
