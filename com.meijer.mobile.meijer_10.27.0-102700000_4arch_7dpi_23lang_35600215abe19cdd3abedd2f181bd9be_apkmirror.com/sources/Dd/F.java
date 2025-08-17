package Dd;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes6.dex */
class F extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f5208a;

    /* renamed from: b, reason: collision with root package name */
    Collection f5209b;

    /* renamed from: c, reason: collision with root package name */
    final F f5210c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f5211d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I f5212e;

    F(I i10, Object obj, Collection collection, F f10) {
        this.f5212e = i10;
        this.f5208a = obj;
        this.f5209b = collection;
        this.f5210c = f10;
        this.f5211d = f10 == null ? null : f10.f5209b;
    }

    final void a() {
        F f10 = this.f5210c;
        if (f10 != null) {
            f10.a();
        } else if (this.f5209b.isEmpty()) {
            I i10 = this.f5212e;
            i10.f5251c.remove(this.f5208a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f5209b.equals(obj);
    }

    final void zza() {
        F f10 = this.f5210c;
        if (f10 != null) {
            f10.zza();
            return;
        }
        I i10 = this.f5212e;
        i10.f5251c.put(this.f5208a, this.f5209b);
    }

    final void zzb() {
        F f10 = this.f5210c;
        if (f10 != null) {
            f10.zzb();
            F f11 = this.f5210c;
            if (f11.f5209b != this.f5211d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f5209b.isEmpty()) {
            I i10 = this.f5212e;
            Collection collection = (Collection) i10.f5251c.get(this.f5208a);
            if (collection != null) {
                this.f5209b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f5209b.isEmpty();
        boolean zAdd = this.f5209b.add(obj);
        if (zAdd) {
            this.f5212e.f5252d++;
            if (zIsEmpty) {
                zza();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f5209b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f5209b.size();
            this.f5212e.f5252d += size2 - size;
            if (size == 0) {
                zza();
                return true;
            }
            return zAddAll;
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5209b.clear();
        this.f5212e.f5252d -= size;
        a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f5209b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f5209b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f5209b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new E(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f5209b.remove(obj);
        if (zRemove) {
            I i10 = this.f5212e;
            i10.f5252d--;
            a();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f5209b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f5209b.size();
            this.f5212e.f5252d += size2 - size;
            a();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f5209b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f5209b.size();
            this.f5212e.f5252d += size2 - size;
            a();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f5209b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f5209b.toString();
    }
}
