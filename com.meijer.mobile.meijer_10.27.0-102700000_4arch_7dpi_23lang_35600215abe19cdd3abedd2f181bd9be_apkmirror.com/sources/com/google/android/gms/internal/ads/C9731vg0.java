package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.vg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9731vg0 extends C9517tg0 implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f79110f;

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C9624ug0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9731vg0(AbstractC9838wg0 abstractC9838wg0, Object obj, List list, C9517tg0 c9517tg0) {
        super(abstractC9838wg0, obj, list, c9517tg0);
        this.f79110f = abstractC9838wg0;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.f78612b.isEmpty();
        ((List) this.f78612b).add(i10, obj);
        this.f79110f.f79518e++;
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
        boolean zAddAll = ((List) this.f78612b).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f78612b.size();
            this.f79110f.f79518e += size2 - size;
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
        return ((List) this.f78612b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f78612b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f78612b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new C9624ug0(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.f78612b).remove(i10);
        AbstractC9838wg0 abstractC9838wg0 = this.f79110f;
        abstractC9838wg0.f79518e--;
        a();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f78612b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List listSubList = ((List) this.f78612b).subList(i10, i11);
        C9517tg0 c9517tg0 = this.f78613c;
        if (c9517tg0 == null) {
            c9517tg0 = this;
        }
        return this.f79110f.k(this.f78611a, listSubList, c9517tg0);
    }
}
