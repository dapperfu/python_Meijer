package Fd;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes6.dex */
class F extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f9241a;

    /* renamed from: b, reason: collision with root package name */
    Collection f9242b;

    /* renamed from: c, reason: collision with root package name */
    final F f9243c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f9244d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I f9245e;

    F(I i10, Object obj, Collection collection, F f10) {
        this.f9245e = i10;
        this.f9241a = obj;
        this.f9242b = collection;
        this.f9243c = f10;
        this.f9244d = f10 == null ? null : f10.f9242b;
    }

    final void a() {
        F f10 = this.f9243c;
        if (f10 != null) {
            f10.a();
        } else if (this.f9242b.isEmpty()) {
            I i10 = this.f9245e;
            i10.f9284c.remove(this.f9241a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f9242b.equals(obj);
    }

    final void zza() {
        F f10 = this.f9243c;
        if (f10 != null) {
            f10.zza();
            return;
        }
        I i10 = this.f9245e;
        i10.f9284c.put(this.f9241a, this.f9242b);
    }

    final void zzb() {
        F f10 = this.f9243c;
        if (f10 != null) {
            f10.zzb();
            F f11 = this.f9243c;
            if (f11.f9242b != this.f9244d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f9242b.isEmpty()) {
            I i10 = this.f9245e;
            Collection collection = (Collection) i10.f9284c.get(this.f9241a);
            if (collection != null) {
                this.f9242b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f9242b.isEmpty();
        boolean zAdd = this.f9242b.add(obj);
        if (zAdd) {
            this.f9245e.f9285d++;
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
        boolean zAddAll = this.f9242b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f9242b.size();
            this.f9245e.f9285d += size2 - size;
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
        this.f9242b.clear();
        this.f9245e.f9285d -= size;
        a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f9242b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f9242b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f9242b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new E(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f9242b.remove(obj);
        if (zRemove) {
            I i10 = this.f9245e;
            i10.f9285d--;
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
        boolean zRemoveAll = this.f9242b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f9242b.size();
            this.f9245e.f9285d += size2 - size;
            a();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f9242b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f9242b.size();
            this.f9245e.f9285d += size2 - size;
            a();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f9242b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f9242b.toString();
    }
}
