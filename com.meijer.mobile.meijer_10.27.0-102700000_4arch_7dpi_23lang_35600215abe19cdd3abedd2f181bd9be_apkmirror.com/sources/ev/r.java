package ev;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class r<T> extends AtomicInteger implements List<T>, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<T> f130084a = new ArrayList<>();

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        boolean zAdd = this.f130084a.add(t10);
        lazySet(this.f130084a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.f130084a.addAll(collection);
        lazySet(this.f130084a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f130084a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f130084a.remove(obj);
        lazySet(this.f130084a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f130084a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f130084a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f130084a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f130084a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof r ? this.f130084a.equals(((r) obj).f130084a) : this.f130084a.equals(obj);
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f130084a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f130084a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f130084a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f130084a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f130084a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return this.f130084a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f130084a.removeAll(collection);
        lazySet(this.f130084a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f130084a.retainAll(collection);
        lazySet(this.f130084a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        return this.f130084a.set(i10, t10);
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return this.f130084a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f130084a.toArray(eArr);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f130084a.toString();
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        this.f130084a.add(i10, t10);
        lazySet(this.f130084a.size());
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = this.f130084a.addAll(i10, collection);
        lazySet(this.f130084a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (get() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T remove(int i10) {
        T tRemove = this.f130084a.remove(i10);
        lazySet(this.f130084a.size());
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }
}
