package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzacn extends zzacj implements RandomAccess, zzaed {
    private boolean[] zza;
    private int zzb;

    zzacn() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.zza;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zza, i10, zArr2, i12, this.zzb - i10);
            this.zza = zArr2;
        }
        this.zza[i10] = zBooleanValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacn)) {
            return super.equals(obj);
        }
        zzacn zzacnVar = (zzacn) obj;
        if (this.zzb != zzacnVar.zzb) {
            return false;
        }
        boolean[] zArr = zzacnVar.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zza[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            iZza = (iZza * 31) + zzaee.zza(this.zza[i10]);
        }
        return iZza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    static {
        new zzacn(new boolean[0], 0, false);
    }

    private zzacn(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.zza = zArr;
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
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaed
    public final /* bridge */ /* synthetic */ zzaed zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzacn(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzaee.zzb;
        collection.getClass();
        if (!(collection instanceof zzacn)) {
            return super.addAll(collection);
        }
        zzacn zzacnVar = (zzacn) collection;
        int i10 = zzacnVar.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zza;
            if (i12 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzacnVar.zza, 0, this.zza, this.zzb, zzacnVar.zzb);
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
        return Boolean.valueOf(this.zza[i10]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        boolean[] zArr = this.zza;
        boolean z10 = zArr[i10];
        if (i10 < this.zzb - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i11, zArr, i10, this.zzb - i11);
            this.zzb -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void zze(boolean z10) {
        zza();
        int i10 = this.zzb;
        boolean[] zArr = this.zza;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        zArr3[i11] = z10;
    }

    public final boolean zzf(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
