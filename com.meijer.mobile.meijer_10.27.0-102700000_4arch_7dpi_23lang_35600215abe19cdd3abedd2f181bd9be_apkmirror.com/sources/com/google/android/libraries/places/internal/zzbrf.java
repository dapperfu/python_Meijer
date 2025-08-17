package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
final class zzbrf extends zzbhr {
    zzbkw zza;
    final /* synthetic */ zzbrx zzb;

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final zzbkd zzd() {
        return this.zzb.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final ScheduledExecutorService zze() {
        return this.zzb.zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final /* bridge */ /* synthetic */ zzbhx zza(zzbho zzbhoVar) {
        zzbrx zzbrxVar = this.zzb;
        zzbrxVar.zze.zzc();
        p.x(!zzbrxVar.zzP(), "Channel is being terminated");
        return new zzbrv(zzbrxVar, zzbhoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        zzbrx zzbrxVar = this.zzb;
        zzbrxVar.zze.zzc();
        p.r(zzbfyVar, "newState");
        p.r(zzbhyVar, "newPicker");
        if (this != zzbrxVar.zzE() || zzbrxVar.zzF()) {
            return;
        }
        zzbrxVar.zzo(zzbhyVar);
        if (zzbfyVar != zzbfy.SHUTDOWN) {
            zzbrxVar.zzV().zzb(2, "Entering {0} state with picker: {1}", zzbfyVar, zzbhyVar);
            zzbrxVar.zzA().zza(zzbfyVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhr
    public final void zzc() {
        zzbkd zzbkdVar = this.zzb.zze;
        zzbkdVar.zzc();
        zzbkdVar.zzb(new zzbre(this));
        zzbkdVar.zza();
    }

    /* synthetic */ zzbrf(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zzb = zzbrxVar;
    }
}
