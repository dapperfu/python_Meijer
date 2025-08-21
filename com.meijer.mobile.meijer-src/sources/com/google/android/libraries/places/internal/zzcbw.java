package com.google.android.libraries.places.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbw extends zzcbn {
    private final transient byte[][] zzb;
    private final transient int[] zzc;

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcbn) {
            zzcbn zzcbnVar = (zzcbn) obj;
            return zzcbnVar.zzj() == zzj() && zzn(0, zzcbnVar, 0, zzj());
        }
        return false;
    }

    public final byte[][] zzq() {
        return this.zzb;
    }

    public final int[] zzr() {
        return this.zzc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcbw(byte[][] segments, int[] directory) {
        super(zzcbn.zza.zza());
        Intrinsics.j(segments, "segments");
        Intrinsics.j(directory, "directory");
        this.zzb = segments;
        this.zzc = directory;
    }

    private final zzcbn zzs() {
        return new zzcbn(zzk());
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte zzi(int i10) {
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int[] iArr = this.zzc;
        zzcbf.zza(iArr[length - 1], i10, 1L);
        int iZza = zzccf.zza(this, i10);
        return bArr[iZza][(i10 - (iZza == 0 ? 0 : iArr[iZza - 1])) + iArr[length + iZza]];
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final int zzj() {
        return this.zzc[this.zzb.length - 1];
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final void zzm(zzcbj buffer, int i10, int i11) {
        int i12;
        Intrinsics.j(buffer, "buffer");
        int iZza = zzccf.zza(this, 0);
        int i13 = 0;
        while (i13 < i11) {
            if (iZza == 0) {
                iZza = 0;
                i12 = 0;
            } else {
                i12 = this.zzc[iZza - 1];
            }
            int[] iArr = this.zzc;
            int i14 = iArr[iZza] - i12;
            byte[][] bArr = this.zzb;
            int i15 = iArr[bArr.length + iZza];
            int iMin = Math.min(i11, i14 + i12) - i13;
            int i16 = i15 + (i13 - i12);
            zzcbu zzcbuVar = new zzcbu(bArr[iZza], i16, i16 + iMin, true, false);
            zzcbu zzcbuVar2 = buffer.zza;
            if (zzcbuVar2 == null) {
                zzcbuVar.zzg = zzcbuVar;
                zzcbuVar.zzf = zzcbuVar;
                buffer.zza = zzcbuVar;
            } else {
                Intrinsics.g(zzcbuVar2);
                zzcbu zzcbuVar3 = zzcbuVar2.zzg;
                Intrinsics.g(zzcbuVar3);
                zzcbuVar3.zzc(zzcbuVar);
            }
            i13 += iMin;
            iZza++;
        }
        buffer.zzd(buffer.zzb() + i11);
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final boolean zzn(int i10, zzcbn other, int i11, int i12) {
        int i13;
        Intrinsics.j(other, "other");
        if (zzj() - i12 < 0) {
            return false;
        }
        int iZza = zzccf.zza(this, 0);
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            if (iZza == 0) {
                iZza = 0;
                i13 = 0;
            } else {
                i13 = this.zzc[iZza - 1];
            }
            int[] iArr = this.zzc;
            int i16 = iArr[iZza] - i13;
            byte[][] bArr = this.zzb;
            int i17 = iArr[bArr.length + iZza];
            int iMin = Math.min(i12, i16 + i13) - i14;
            if (!other.zzo(i15, bArr[iZza], i17 + (i14 - i13), iMin)) {
                return false;
            }
            i15 += iMin;
            i14 += iMin;
            iZza++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final boolean zzo(int i10, byte[] other, int i11, int i12) {
        int i13;
        Intrinsics.j(other, "other");
        if (i10 < 0 || i10 > zzj() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int iZza = zzccf.zza(this, i10);
        while (i10 < i14) {
            if (iZza == 0) {
                iZza = 0;
                i13 = 0;
            } else {
                i13 = this.zzc[iZza - 1];
            }
            int[] iArr = this.zzc;
            int i15 = iArr[iZza] - i13;
            byte[][] bArr = this.zzb;
            int i16 = iArr[bArr.length + iZza];
            int iMin = Math.min(i14, i15 + i13) - i10;
            if (!zzcbf.zzb(bArr[iZza], i16 + (i10 - i13), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iZza++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final int hashCode() {
        int iZzb = zzb();
        if (iZzb != 0) {
            return iZzb;
        }
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.zzc;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        zzc(i11);
        return i11;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final String toString() {
        return zzs().toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final String zzg() {
        return zzs().zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final zzcbn zzh() {
        return zzs().zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte[] zzk() {
        byte[] bArr = new byte[zzj()];
        byte[][] bArr2 = this.zzb;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.zzc;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            ArraysKt.j(bArr2[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcbn
    public final byte[] zzl() {
        return zzk();
    }
}
