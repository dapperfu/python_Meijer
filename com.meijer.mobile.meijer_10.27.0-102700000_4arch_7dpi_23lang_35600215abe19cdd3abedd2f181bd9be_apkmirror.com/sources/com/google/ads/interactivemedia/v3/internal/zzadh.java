package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzadh extends zzacj implements RandomAccess, zzaed {
    private double[] zza;
    private int zzb;

    zzadh() {
        this(new double[10], 0, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        double[] dArr = this.zza;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.zza, i10, dArr2, i12, this.zzb - i10);
            this.zza = dArr2;
        }
        this.zza[i10] = dDoubleValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzadh)) {
            return super.equals(obj);
        }
        zzadh zzadhVar = (zzadh) obj;
        if (this.zzb != zzadhVar.zzb) {
            return false;
        }
        double[] dArr = zzadhVar.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Double.doubleToLongBits(this.zza[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i11]);
            byte[] bArr = zzaee.zzb;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    static {
        new zzadh(new double[0], 0, false);
    }

    private zzadh(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.zza = dArr;
        this.zzb = i10;
    }

    private final String zzg(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzb;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaed
    public final /* bridge */ /* synthetic */ zzaed zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzadh(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzaee.zzb;
        collection.getClass();
        if (!(collection instanceof zzadh)) {
            return super.addAll(collection);
        }
        zzadh zzadhVar = (zzadh) collection;
        int i10 = zzadhVar.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.zza;
            if (i12 > dArr.length) {
                this.zza = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(zzadhVar.zza, 0, this.zza, this.zzb, zzadhVar.zzb);
            this.zzb = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Double.valueOf(this.zza[i10]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        double[] dArr = this.zza;
        double d10 = dArr[i10];
        if (i10 < this.zzb - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            double[] dArr = this.zza;
            System.arraycopy(dArr, i11, dArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final double zze(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    public final void zzf(double d10) {
        zza();
        int i10 = this.zzb;
        double[] dArr = this.zza;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
