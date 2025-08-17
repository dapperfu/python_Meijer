package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
final class zzsl extends zzrv {
    static final zzsl zzc;
    final transient zzrm zzd;

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzrv) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.zzd.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!zzsr.zza(((zzrv) this).zza, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            zzst zzstVarListIterator = this.zzd.listIterator(0);
            while (zzstVarListIterator.hasNext()) {
                E next = zzstVarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || ((zzrv) this).zza.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iZzu = zzu(obj, true) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.zzd.get(iZzu);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iZzu = zzu(obj, false) - 1;
        if (iZzu == -1) {
            return null;
        }
        return this.zzd.get(iZzu);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    public final zzrm zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv
    final zzrv zzo(Object obj, boolean z10) {
        return zzw(0, zzu(obj, z10));
    }

    static {
        int i10 = zzrm.zzd;
        zzc = new zzsl(zzse.zza, zzsb.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        zzrm zzrmVar = this.zzd;
        int iZzv = zzv(obj, true);
        if (iZzv == zzrmVar.size()) {
            return null;
        }
        return this.zzd.get(iZzv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzsa) {
            collection = ((zzsa) collection).zza();
        }
        if (!zzsr.zza(((zzrv) this).zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzst zzstVarListIterator = this.zzd.listIterator(0);
        Iterator it = collection.iterator();
        if (!zzstVarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = zzstVarListIterator.next();
        while (true) {
            try {
                int iCompare = ((zzrv) this).zza.compare(next2, next);
                if (iCompare >= 0) {
                    if (iCompare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!zzstVarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = zzstVarListIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.NavigableSet
    public final Object higher(Object obj) {
        zzrm zzrmVar = this.zzd;
        int iZzv = zzv(obj, false);
        if (iZzv == zzrmVar.size()) {
            return null;
        }
        return this.zzd.get(iZzv);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zza(Object[] objArr, int i10) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    /* renamed from: zze */
    public final zzss iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return this.zzd.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv
    final zzrv zzh() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(((zzrv) this).zza);
        return isEmpty() ? zzrv.zzs(comparatorReverseOrder) : new zzsl(this.zzd.zzh(), comparatorReverseOrder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv
    final zzrv zzr(Object obj, boolean z10) {
        return zzw(zzv(obj, z10), this.zzd.size());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.NavigableSet
    /* renamed from: zzt */
    public final zzss descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    final zzsl zzw(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.zzd.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return zzrv.zzs(((zzrv) this).zza);
        }
        zzrm zzrmVar = this.zzd;
        return new zzsl(zzrmVar.subList(i10, i11), ((zzrv) this).zza);
    }

    zzsl(zzrm zzrmVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzrmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.zzd.get(r0.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrv
    final zzrv zzq(Object obj, boolean z10, Object obj2, boolean z11) {
        return zzr(obj, z10).zzo(obj2, z11);
    }

    final int zzu(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzrv) this).zza);
        if (iBinarySearch >= 0) {
            if (z10) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int zzv(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.zzd, obj, ((zzrv) this).zza);
        if (iBinarySearch >= 0) {
            if (z10) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
