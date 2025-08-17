package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class zzbcq extends zzbcs {
    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zza(Object obj, long j10, byte b10) {
        if (zzbct.zzb) {
            zzbct.zzD(obj, j10, b10);
        } else {
            zzbct.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final boolean zzb(Object obj, long j10) {
        return zzbct.zzb ? zzbct.zzu(obj, j10) : zzbct.zzv(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.zzbct.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.libraries.places.internal.zzbct.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.libraries.places.internal.zzbct.zzw(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.libraries.places.internal.zzbct.zzx(java.lang.Object, long, boolean):void */
    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzbct.zzb) {
            zzbct.zzw(obj, j10, z10);
        } else {
            zzbct.zzx(obj, j10, z10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    zzbcq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcs
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
