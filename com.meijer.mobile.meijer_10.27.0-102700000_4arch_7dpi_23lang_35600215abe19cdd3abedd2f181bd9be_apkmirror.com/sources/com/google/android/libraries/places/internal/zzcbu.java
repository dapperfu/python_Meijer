package com.google.android.libraries.places.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbu {

    @JvmField
    public final byte[] zza;

    @JvmField
    public int zzb;

    @JvmField
    public int zzc;

    @JvmField
    public boolean zzd;

    @JvmField
    public final boolean zze;

    @JvmField
    public zzcbu zzf;

    @JvmField
    public zzcbu zzg;

    public zzcbu() {
        this.zza = new byte[8192];
        this.zze = true;
        this.zzd = false;
    }

    public final zzcbu zza() {
        this.zzd = true;
        return new zzcbu(this.zza, this.zzb, this.zzc, true, false);
    }

    public zzcbu(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.j(data, "data");
        this.zza = data;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = false;
    }

    public final zzcbu zzb() {
        zzcbu zzcbuVar = this.zzf;
        if (zzcbuVar == this) {
            zzcbuVar = null;
        }
        zzcbu zzcbuVar2 = this.zzg;
        Intrinsics.g(zzcbuVar2);
        zzcbuVar2.zzf = this.zzf;
        zzcbu zzcbuVar3 = this.zzf;
        Intrinsics.g(zzcbuVar3);
        zzcbuVar3.zzg = this.zzg;
        this.zzf = null;
        this.zzg = null;
        return zzcbuVar;
    }

    public final zzcbu zzc(zzcbu segment) {
        Intrinsics.j(segment, "segment");
        segment.zzg = this;
        segment.zzf = this.zzf;
        zzcbu zzcbuVar = this.zzf;
        Intrinsics.g(zzcbuVar);
        zzcbuVar.zzg = segment;
        this.zzf = segment;
        return segment;
    }

    public final zzcbu zzd(int i10) {
        zzcbu zzcbuVarZza;
        if (i10 > this.zzc - this.zzb) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            zzcbuVarZza = zza();
        } else {
            byte[] bArr = this.zza;
            zzcbuVarZza = zzcbv.zza();
            byte[] bArr2 = zzcbuVarZza.zza;
            int i11 = this.zzb;
            ArraysKt.p(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        zzcbuVarZza.zzc = zzcbuVarZza.zzb + i10;
        this.zzb += i10;
        zzcbu zzcbuVar = this.zzg;
        Intrinsics.g(zzcbuVar);
        zzcbuVar.zzc(zzcbuVarZza);
        return zzcbuVarZza;
    }

    public final void zze(zzcbu sink, int i10) {
        Intrinsics.j(sink, "sink");
        if (!sink.zze) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.zzc;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (sink.zzd) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.zzb;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.zza;
            ArraysKt.p(bArr, bArr, 0, i13, i11, 2, null);
            i11 = sink.zzc - sink.zzb;
            sink.zzc = i11;
            sink.zzb = 0;
        }
        byte[] bArr2 = this.zza;
        byte[] bArr3 = sink.zza;
        int i14 = this.zzb;
        ArraysKt.j(bArr2, bArr3, i11, i14, i14 + i10);
        sink.zzc += i10;
        this.zzb += i10;
    }
}
