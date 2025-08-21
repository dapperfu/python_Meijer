package B1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001c¨\u0006)"}, d2 = {"LB1/e;", "", "LB1/d;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "i", "h", "(I)LB1/d;", "element", "", "f", "(LB1/d;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "k", "()Ljava/util/List;", "b", "I", "n", "size", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B1.e, reason: from toString */
/* loaded from: classes.dex */
public final class LocaleList implements Collection<d>, KMappedMarker {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final LocaleList f2192d = new LocaleList(CollectionsKt.m());

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<d> localeList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"LB1/e$a;", "", "<init>", "()V", "LB1/e;", "Empty", "LB1/e;", "b", "()LB1/e;", "a", "current", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: B1.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LocaleList a() {
            return g.a().getCurrent();
        }

        public final LocaleList b() {
            return LocaleList.f2192d;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LocaleList) && Intrinsics.e(this.localeList, ((LocaleList) other).localeList);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d) {
            return f((d) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return this.localeList.containsAll(elements);
    }

    public boolean f(d element) {
        return this.localeList.contains(element);
    }

    public final d h(int i10) {
        return this.localeList.get(i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<d> iterator() {
        return this.localeList.iterator();
    }

    public final List<d> k() {
        return this.localeList;
    }

    /* renamed from: n, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super d> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }

    public LocaleList(List<d> list) {
        this.localeList = list;
        this.size = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
