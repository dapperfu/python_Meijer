package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Bg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C6716Bg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final Collection f66411a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6816Ef0 f66412b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C9110oh0.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        C6782Df0.e(this.f66412b.zza(obj));
        return this.f66411a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C8682kh0.b(this.f66411a, this.f66412b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (C6750Cg0.a(this.f66411a, obj)) {
            return this.f66412b.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC6816Ef0 interfaceC6816Ef0 = this.f66412b;
        Iterator it = this.f66411a.iterator();
        C6782Df0.c(interfaceC6816Ef0, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC6816Ef0.zza(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f66411a.iterator();
        it.getClass();
        InterfaceC6816Ef0 interfaceC6816Ef0 = this.f66412b;
        interfaceC6816Ef0.getClass();
        return new C8789lh0(it, interfaceC6816Ef0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f66411a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f66412b.zza(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f66411a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f66412b.zza(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f66411a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f66412b.zza(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    C6716Bg0(Collection collection, InterfaceC6816Ef0 interfaceC6816Ef0) {
        this.f66411a = collection;
        this.f66412b = interfaceC6816Ef0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C6782Df0.e(this.f66412b.zza(it.next()));
        }
        return this.f66411a.addAll(collection);
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
        if (contains(obj) && this.f66411a.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        C9110oh0.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
