package kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes14.dex */
public class TargetPlatform implements Collection<SimplePlatform>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    private final Set<SimplePlatform> f146722a;

    public boolean a(SimplePlatform element) {
        Intrinsics.j(element, "element");
        return this.f146722a.contains(element);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        return this.f146722a.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetPlatform) && Intrinsics.e(this.f146722a, ((TargetPlatform) obj).f146722a);
    }

    public int h() {
        return this.f146722a.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f146722a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<SimplePlatform> iterator() {
        return this.f146722a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super SimplePlatform> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return a((SimplePlatform) obj);
        }
        return false;
    }

    public final Set<SimplePlatform> f() {
        return this.f146722a;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f146722a.hashCode();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return h();
    }

    public String toString() {
        return PlatformUtilKt.a(this);
    }
}
