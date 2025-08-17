package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzcat extends zzcap {
    final /* synthetic */ zzcau zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcat(zzcau zzcauVar) {
        super(zzcauVar);
        Objects.requireNonNull(zzcauVar);
        this.zzb = zzcauVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcap, com.google.android.libraries.places.internal.zzcao, com.google.android.libraries.places.internal.zzbhr
    public final void zzb(zzbfy zzbfyVar, zzbhy zzbhyVar) {
        super.zzb(zzbfyVar, zzbhyVar);
        zzcau zzcauVar = this.zzb;
        if (!zzcauVar.zzb.zzf && zzbfyVar == zzbfy.IDLE) {
            zzcauVar.zzd().zzd();
        }
    }
}
