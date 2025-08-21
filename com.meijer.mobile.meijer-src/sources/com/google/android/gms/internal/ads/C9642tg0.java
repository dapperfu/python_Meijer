package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9642tg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f79451a;

    /* renamed from: b, reason: collision with root package name */
    Collection f79452b;

    /* renamed from: c, reason: collision with root package name */
    final C9642tg0 f79453c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f79454d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f79455e;

    C9642tg0(AbstractC9963wg0 abstractC9963wg0, Object obj, Collection collection, C9642tg0 c9642tg0) {
        this.f79455e = abstractC9963wg0;
        this.f79451a = obj;
        this.f79452b = collection;
        this.f79453c = c9642tg0;
        this.f79454d = c9642tg0 == null ? null : c9642tg0.f79452b;
    }

    final void a() {
        C9642tg0 c9642tg0 = this.f79453c;
        if (c9642tg0 != null) {
            c9642tg0.a();
        } else if (this.f79452b.isEmpty()) {
            AbstractC9963wg0 abstractC9963wg0 = this.f79455e;
            abstractC9963wg0.f80357d.remove(this.f79451a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f79452b.equals(obj);
    }

    final void zza() {
        C9642tg0 c9642tg0 = this.f79453c;
        if (c9642tg0 != null) {
            c9642tg0.zza();
            return;
        }
        AbstractC9963wg0 abstractC9963wg0 = this.f79455e;
        abstractC9963wg0.f80357d.put(this.f79451a, this.f79452b);
    }

    final void zzb() {
        C9642tg0 c9642tg0 = this.f79453c;
        if (c9642tg0 != null) {
            c9642tg0.zzb();
            C9642tg0 c9642tg02 = this.f79453c;
            if (c9642tg02.f79452b != this.f79454d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f79452b.isEmpty()) {
            AbstractC9963wg0 abstractC9963wg0 = this.f79455e;
            Collection collection = (Collection) abstractC9963wg0.f80357d.get(this.f79451a);
            if (collection != null) {
                this.f79452b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f79452b.isEmpty();
        boolean zAdd = this.f79452b.add(obj);
        if (zAdd) {
            this.f79455e.f80358e++;
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
        boolean zAddAll = this.f79452b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f79452b.size();
            this.f79455e.f80358e += size2 - size;
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
        this.f79452b.clear();
        this.f79455e.f80358e -= size;
        a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f79452b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f79452b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f79452b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C9535sg0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f79452b.remove(obj);
        if (zRemove) {
            AbstractC9963wg0 abstractC9963wg0 = this.f79455e;
            abstractC9963wg0.f80358e--;
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
        boolean zRemoveAll = this.f79452b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f79452b.size();
            this.f79455e.f80358e += size2 - size;
            a();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f79452b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f79452b.size();
            this.f79455e.f80358e += size2 - size;
            a();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f79452b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f79452b.toString();
    }
}
