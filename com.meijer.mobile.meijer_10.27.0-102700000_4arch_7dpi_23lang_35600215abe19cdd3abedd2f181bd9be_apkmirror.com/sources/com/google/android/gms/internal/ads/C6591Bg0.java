package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Bg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C6591Bg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Collection f65571a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6691Ef0 f65572b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C8985oh0.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C6657Df0.e(this.f65572b.zza(obj));
        return this.f65571a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C8557kh0.b(this.f65571a, this.f65572b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (C6625Cg0.a(this.f65571a, obj)) {
            return this.f65572b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC6691Ef0 interfaceC6691Ef0 = this.f65572b;
        Iterator it = this.f65571a.iterator();
        C6657Df0.c(interfaceC6691Ef0, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC6691Ef0.zza(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f65571a.iterator();
        it.getClass();
        InterfaceC6691Ef0 interfaceC6691Ef0 = this.f65572b;
        interfaceC6691Ef0.getClass();
        return new C8664lh0(it, interfaceC6691Ef0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f65571a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f65572b.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f65571a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f65572b.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f65571a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f65572b.zza(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    C6591Bg0(Collection collection, InterfaceC6691Ef0 interfaceC6691Ef0) {
        this.f65571a = collection;
        this.f65572b = interfaceC6691Ef0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6657Df0.e(this.f65572b.zza(it.next()));
        }
        return this.f65571a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f65571a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C8985oh0.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
