package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public abstract class zzrr<E> extends zzri<E> implements Set<E> {
    private transient zzrm zza;

    static int zzj(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            zzqh.zze(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzrr) && zzi() && ((zzrr) obj).zzi() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzss iterator();

    boolean zzi() {
        return false;
    }

    private static zzrr zzh(int i10, Object... objArr) {
        if (i10 == 0) {
            return zzsk.zza;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzsp(obj);
        }
        int iZzj = zzj(i10);
        Object[] objArr2 = new Object[iZzj];
        int i11 = iZzj - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            zzsc.zza(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iZzb = zzrg.zzb(iHashCode);
            while (true) {
                int i15 = iZzb & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iZzb++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzsp(obj4);
        }
        if (zzj(i13) < iZzj / 2) {
            return zzh(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new zzsk(objArr, i12, objArr2, i11, i13);
    }

    public static zzrr zzl(Collection collection) {
        if ((collection instanceof zzrr) && !(collection instanceof SortedSet)) {
            zzrr zzrrVar = (zzrr) collection;
            if (!zzrrVar.zzf()) {
                return zzrrVar;
            }
        }
        Object[] array = collection.toArray();
        return zzh(array.length, array);
    }

    public static zzrr zzm(Object obj) {
        return new zzsp(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    public zzrm zzd() {
        zzrm zzrmVar = this.zza;
        if (zzrmVar != null) {
            return zzrmVar;
        }
        zzrm zzrmVarZzk = zzk();
        this.zza = zzrmVarZzk;
        return zzrmVarZzk;
    }

    zzrr() {
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzso.zza(this);
    }

    zzrm zzk() {
        Object[] array = toArray();
        int i10 = zzrm.zzd;
        return zzrm.zzj(array, array.length);
    }
}
