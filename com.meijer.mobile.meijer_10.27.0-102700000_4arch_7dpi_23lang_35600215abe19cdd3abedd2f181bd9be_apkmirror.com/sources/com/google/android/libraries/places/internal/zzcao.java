package com.google.android.libraries.places.internal;

import Be.j;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public abstract class zzcao extends zzbhr {
    @Override // com.google.android.libraries.places.internal.zzbhr
    public void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        throw null;
    }

    protected abstract zzbhr zzf();

    public final String toString() {
        return j.c(this).d("delegate", zzf()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbhx zza(zzbho zzbhoVar) {
        return zzf().zza(zzbhoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzc() {
        zzf().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbkd zzd() {
        return zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final ScheduledExecutorService zze() {
        return zzf().zze();
    }
}
