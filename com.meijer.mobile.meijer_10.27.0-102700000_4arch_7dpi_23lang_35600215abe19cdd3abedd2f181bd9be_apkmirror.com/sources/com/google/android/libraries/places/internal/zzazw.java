package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import fsimpl.C14045dq;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class zzazw extends zzayp implements RandomAccess, zzbal, zzbbu {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzazw(fArr, 0, false);
    }

    zzazw() {
        this(zza, 0, true);
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        zzbC();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i10);
            System.arraycopy(this.zzb, i10, fArr2, i12, this.zzc - i10);
            this.zzb = fArr2;
        }
        this.zzb[i10] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzazw)) {
            return super.equals(obj);
        }
        zzazw zzazwVar = (zzazw) obj;
        if (this.zzc != zzazwVar.zzc) {
            return false;
        }
        float[] fArr = zzazwVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Float.floatToIntBits(this.zzb[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    private zzazw(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i10;
    }

    private static int zzh(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzj(i10));
        }
    }

    private final String zzj(int i10) {
        return zzays.zzb(this.zzc, i10, C14045dq.DARKEN, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzbC();
        zzi(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // com.google.android.libraries.places.internal.zzbao, com.google.android.libraries.places.internal.zzbag
    /* renamed from: zzd */
    public final zzbal zzg(int i10) {
        if (i10 >= this.zzc) {
            return new zzazw(i10 == 0 ? zza : Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbC();
        byte[] bArr = zzbap.zzb;
        collection.getClass();
        if (!(collection instanceof zzazw)) {
            return super.addAll(collection);
        }
        zzazw zzazwVar = (zzazw) collection;
        int i10 = zzazwVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.zzb;
            if (i12 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(zzazwVar.zzb, 0, this.zzb, this.zzc, zzazwVar.zzc);
            this.zzc = i12;
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
        return Float.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbC();
        zzi(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzbC();
        if (i11 >= i10) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i11, fArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final float zze(int i10) {
        zzi(i10);
        return this.zzb[i10];
    }

    public final void zzf(float f10) {
        zzbC();
        int i10 = this.zzc;
        int length = this.zzb.length;
        if (i10 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.libraries.places.internal.zzayp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
