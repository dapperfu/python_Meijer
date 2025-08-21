package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/s0;", "", "Landroidx/compose/ui/layout/s0$a;", "slotIds", "", "a", "(Landroidx/compose/ui/layout/s0$a;)V", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s0 {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u001d\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010#\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/layout/s0$a;", "", "", "LZ/U;", "set", "<init>", "(LZ/U;)V", "", "isEmpty", "()Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "slotId", "a", "", "iterator", "()Ljava/util/Iterator;", "remove", "slotIds", "removeAll", "retainAll", "", "clear", "()V", "", "maxSlotsToRetainForReuse", "h", "(I)V", "LZ/U;", "f", "()I", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements Collection<Object>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Z.U<Object> set;

        public a(Z.U<Object> u10) {
            this.set = u10;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.a(this);
        }

        @Override // java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object slotId) {
            return this.set.g(slotId);
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.k();
        }

        @Override // java.util.Collection
        public boolean contains(Object element) {
            return this.set.a(element);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.set.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int f() {
            return this.set.get_size();
        }

        public final void h(int maxSlotsToRetainForReuse) {
            this.set.C(maxSlotsToRetainForReuse);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.d();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return this.set.j().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object slotId) {
            return this.set.x(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> slotIds) {
            return this.set.x(slotIds);
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> slotIds) {
            return this.set.B(slotIds);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.b(this, tArr);
        }

        public /* synthetic */ a(Z.U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Z.f0.a() : u10);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }
    }

    void a(a slotIds);

    boolean b(Object slotId, Object reusableSlotId);
}
