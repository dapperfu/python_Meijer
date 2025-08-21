package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "()V", "add", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "a", "Lkotlin/collections/builders/MapBuilder;", "", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapBuilderKeys<E> extends AbstractMutableSet<E> implements Set<E>, KMutableSet {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MapBuilder<E, ?> backing;

    public MapBuilderKeys(MapBuilder<E, ?> backing) {
        Intrinsics.j(backing, "backing");
        this.backing = backing;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int a() {
        return this.backing.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.backing.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.backing.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.backing.M();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        return this.backing.V(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        this.backing.r();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        this.backing.r();
        return super.retainAll(elements);
    }
}
