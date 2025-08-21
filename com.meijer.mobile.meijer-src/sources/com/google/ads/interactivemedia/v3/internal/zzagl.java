package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzagl extends zzagn {
    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzago.zzb) {
            zzago.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzago.zzE(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzago.zzb) {
            zzago.zzD(obj, j10, b10);
        } else {
            zzago.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final boolean zzg(Object obj, long j10) {
        return zzago.zzb ? zzago.zzt(obj, j10) : zzago.zzu(obj, j10);
    }

    zzagl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzagn
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }
}
