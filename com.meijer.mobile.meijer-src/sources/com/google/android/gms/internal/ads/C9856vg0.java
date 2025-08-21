package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.vg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9856vg0 extends C9642tg0 implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f79950f;

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C9749ug0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9856vg0(AbstractC9963wg0 abstractC9963wg0, Object obj, List list, C9642tg0 c9642tg0) {
        super(abstractC9963wg0, obj, list, c9642tg0);
        this.f79950f = abstractC9963wg0;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.f79452b.isEmpty();
        ((List) this.f79452b).add(i10, obj);
        this.f79950f.f80358e++;
        if (zIsEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f79452b).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f79452b.size();
            this.f79950f.f80358e += size2 - size;
            if (size == 0) {
                zza();
                return true;
            }
            return zAddAll;
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f79452b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f79452b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f79452b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new C9749ug0(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.f79452b).remove(i10);
        AbstractC9963wg0 abstractC9963wg0 = this.f79950f;
        abstractC9963wg0.f80358e--;
        a();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f79452b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List listSubList = ((List) this.f79452b).subList(i10, i11);
        C9642tg0 c9642tg0 = this.f79453c;
        if (c9642tg0 == null) {
            c9642tg0 = this;
        }
        return this.f79950f.k(this.f79451a, listSubList, c9642tg0);
    }
}
