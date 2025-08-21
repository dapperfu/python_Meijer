package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import fsimpl.C14170dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class zzbba extends zzayp implements RandomAccess, zzban, zzbbu {
    private static final long[] zza;
    private static final zzbba zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzbba(jArr, 0, false);
    }

    zzbba() {
        this(zza, 0, true);
    }

    public static zzbba zzd() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zzbC();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[zzh(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i10);
            System.arraycopy(this.zzc, i10, jArr2, i12, this.zzd - i10);
            this.zzc = jArr2;
        }
        this.zzc[i10] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbba)) {
            return super.equals(obj);
        }
        zzbba zzbbaVar = (zzbba) obj;
        if (this.zzd != zzbbaVar.zzd) {
            return false;
        }
        long[] jArr = zzbbaVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (this.zzc[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzd; i11++) {
            long j10 = this.zzc[i11];
            byte[] bArr = zzbap.zzb;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    private zzbba(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zzc = jArr;
        this.zzd = i10;
    }

    private static int zzh(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
    }

    private final String zzj(int i10) {
        return zzays.zzb(this.zzd, i10, C14170dq.DARKEN, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zzbC();
        zzi(i10);
        long[] jArr = this.zzc;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzbao, com.google.android.libraries.places.internal.zzbag
    /* renamed from: zzc */
    public final zzban zzg(int i10) {
        if (i10 >= this.zzd) {
            return new zzbba(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbC();
        byte[] bArr = zzbap.zzb;
        collection.getClass();
        if (!(collection instanceof zzbba)) {
            return super.addAll(collection);
        }
        zzbba zzbbaVar = (zzbba) collection;
        int i10 = zzbbaVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzc;
            if (i12 > jArr.length) {
                this.zzc = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzbbaVar.zzc, 0, this.zzc, this.zzd, zzbbaVar.zzd);
            this.zzd = i12;
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
        zzi(i10);
        return Long.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbC();
        zzi(i10);
        long[] jArr = this.zzc;
        long j10 = jArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzbC();
        if (i11 >= i10) {
            long[] jArr = this.zzc;
            System.arraycopy(jArr, i11, jArr, i10, this.zzd - i11);
            this.zzd -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final long zze(int i10) {
        zzi(i10);
        return this.zzc[i10];
    }

    public final void zzf(long j10) {
        zzbC();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            long[] jArr = new long[zzh(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
