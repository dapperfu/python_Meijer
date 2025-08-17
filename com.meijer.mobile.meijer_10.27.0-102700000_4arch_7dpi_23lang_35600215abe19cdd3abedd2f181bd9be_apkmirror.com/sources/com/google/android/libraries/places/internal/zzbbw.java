package com.google.android.libraries.places.internal;

import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class zzbbw extends zzayp implements RandomAccess {
    private static final Object[] zza;
    private static final zzbbw zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzbbw(objArr, 0, false);
    }

    zzbbw() {
        this(zza, 0, true);
    }

    public static zzbbw zzd() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zzbC();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i10);
            System.arraycopy(this.zzc, i10, objArr2, i12, this.zzd - i10);
            this.zzc = objArr2;
        }
        this.zzc[i10] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    private zzbbw(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzc = objArr;
        this.zzd = i10;
    }

    private static int zzf(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    private final String zzi(int i10) {
        return zzays.zzb(this.zzd, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    final void zze(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.libraries.places.internal.zzbao, com.google.android.libraries.places.internal.zzbag
    public final /* bridge */ /* synthetic */ zzbao zzg(int i10) {
        if (i10 >= this.zzd) {
            return new zzbbw(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzh(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zzbC();
        zzh(i10);
        Object[] objArr = this.zzc;
        Object obj = objArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zzbC();
        zzh(i10);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbC();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
