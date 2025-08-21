package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class zzrm<E> extends zzri<E> implements List<E>, RandomAccess {
    private static final zzst zza = new zzrj(zzse.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!zzqe.zza(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it = iterator();
        Iterator<E> it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zzqe.zza(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    @Deprecated
    public final zzrm zzd() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    /* renamed from: zze */
    public final zzss iterator() {
        return listIterator(0);
    }

    static zzrm zzj(Object[] objArr, int i10) {
        return i10 == 0 ? zzse.zza : new zzse(objArr, i10);
    }

    public static zzrm zzk(Collection collection) {
        if (!(collection instanceof zzri)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzsc.zzb(array, length);
            return zzj(array, length);
        }
        zzrm zzrmVarZzd = ((zzri) collection).zzd();
        if (!zzrmVarZzd.zzf()) {
            return zzrmVarZzd;
        }
        Object[] array2 = zzrmVarZzd.toArray();
        return zzj(array2, array2.length);
    }

    public static zzrm zzm() {
        return zzse.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    zzrm() {
    }

    public static zzrm zzl(Object[] objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzsc.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    public zzrm zzh() {
        if (size() <= 1) {
            return this;
        }
        return new zzrk(this);
    }

    @Override // java.util.List
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public zzrm subList(int i10, int i11) {
        zzqh.zzh(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzse.zza;
        }
        return new zzrl(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzst listIterator(int i10) {
        zzqh.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzrj(this, i10);
    }
}
