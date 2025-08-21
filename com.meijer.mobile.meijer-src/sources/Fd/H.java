package Fd;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
class H extends F implements List {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ I f9261f;

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new G(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(I i10, Object obj, List list, F f10) {
        super(i10, obj, list, f10);
        this.f9261f = i10;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.f9242b.isEmpty();
        ((List) this.f9242b).add(i10, obj);
        this.f9261f.f9285d++;
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
        boolean zAddAll = ((List) this.f9242b).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f9242b.size();
            this.f9261f.f9285d += size2 - size;
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
        return ((List) this.f9242b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f9242b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f9242b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new G(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.f9242b).remove(i10);
        I i11 = this.f9261f;
        i11.f9285d--;
        a();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f9242b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List listSubList = ((List) this.f9242b).subList(i10, i11);
        F f10 = this.f9243c;
        if (f10 == null) {
            f10 = this;
        }
        return this.f9261f.h(this.f9241a, listSubList, f10);
    }
}
