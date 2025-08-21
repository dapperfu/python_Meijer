package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
abstract class zzbcs {
    final Unsafe zza;

    zzbcs(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j10, byte b10);

    public abstract boolean zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract float zzd(Object obj, long j10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract double zzf(Object obj, long j10);

    public abstract void zzg(Object obj, long j10, double d10);
}
