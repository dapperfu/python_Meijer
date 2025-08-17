package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.tg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9517tg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Object f78611a;

    /* renamed from: b, reason: collision with root package name */
    Collection f78612b;

    /* renamed from: c, reason: collision with root package name */
    final C9517tg0 f78613c;

    /* renamed from: d, reason: collision with root package name */
    final Collection f78614d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f78615e;

    C9517tg0(AbstractC9838wg0 abstractC9838wg0, Object obj, Collection collection, C9517tg0 c9517tg0) {
        this.f78615e = abstractC9838wg0;
        this.f78611a = obj;
        this.f78612b = collection;
        this.f78613c = c9517tg0;
        this.f78614d = c9517tg0 == null ? null : c9517tg0.f78612b;
    }

    final void a() {
        C9517tg0 c9517tg0 = this.f78613c;
        if (c9517tg0 != null) {
            c9517tg0.a();
        } else if (this.f78612b.isEmpty()) {
            AbstractC9838wg0 abstractC9838wg0 = this.f78615e;
            abstractC9838wg0.f79517d.remove(this.f78611a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f78612b.equals(obj);
    }

    final void zza() {
        C9517tg0 c9517tg0 = this.f78613c;
        if (c9517tg0 != null) {
            c9517tg0.zza();
            return;
        }
        AbstractC9838wg0 abstractC9838wg0 = this.f78615e;
        abstractC9838wg0.f79517d.put(this.f78611a, this.f78612b);
    }

    final void zzb() {
        C9517tg0 c9517tg0 = this.f78613c;
        if (c9517tg0 != null) {
            c9517tg0.zzb();
            C9517tg0 c9517tg02 = this.f78613c;
            if (c9517tg02.f78612b != this.f78614d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f78612b.isEmpty()) {
            AbstractC9838wg0 abstractC9838wg0 = this.f78615e;
            Collection collection = (Collection) abstractC9838wg0.f79517d.get(this.f78611a);
            if (collection != null) {
                this.f78612b = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f78612b.isEmpty();
        boolean zAdd = this.f78612b.add(obj);
        if (zAdd) {
            this.f78615e.f79518e++;
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
        boolean zAddAll = this.f78612b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f78612b.size();
            this.f78615e.f79518e += size2 - size;
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
        this.f78612b.clear();
        this.f78615e.f79518e -= size;
        a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f78612b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f78612b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f78612b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C9410sg0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f78612b.remove(obj);
        if (zRemove) {
            AbstractC9838wg0 abstractC9838wg0 = this.f78615e;
            abstractC9838wg0.f79518e--;
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
        boolean zRemoveAll = this.f78612b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f78612b.size();
            this.f78615e.f79518e += size2 - size;
            a();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f78612b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f78612b.size();
            this.f78615e.f79518e += size2 - size;
            a();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f78612b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f78612b.toString();
    }
}
