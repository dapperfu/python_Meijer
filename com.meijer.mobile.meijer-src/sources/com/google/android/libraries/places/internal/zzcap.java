package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
public class zzcap extends zzcao {
    final /* synthetic */ zzcaq zza;

    @Override // com.google.android.libraries.places.internal.zzcao
    protected final zzbhr zzf() {
        return this.zza.zza.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzcao, com.google.android.libraries.places.internal.zzbhr
    public void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        zzcaq zzcaqVar = this.zza;
        if (zzcaqVar.zzh() == zzbfy.SHUTDOWN) {
            return;
        }
        zzcaqVar.zzi(zzbfyVar);
        zzcaqVar.zzj(zzbhyVar);
        zzcas zzcasVar = zzcaqVar.zza;
        if (zzcasVar.zzf) {
            return;
        }
        zzcasVar.zze();
    }

    protected zzcap(zzcaq zzcaqVar) {
        Objects.requireNonNull(zzcaqVar);
        this.zza = zzcaqVar;
    }
}
