package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbwt extends zzbww {
    final /* synthetic */ zzbwx zza;

    @Override // com.google.android.libraries.places.internal.zzbww
    public final void zza() throws IOException {
        zzcbj zzcbjVar = new zzcbj();
        int i10 = zzcba.zza;
        zzbwx zzbwxVar = this.zza;
        synchronized (zzbwxVar.zzd()) {
            zzcbjVar.zzc(zzbwxVar.zze(), zzbwxVar.zze().zzb());
            zzbwxVar.zzh(false);
        }
        zzbwx zzbwxVar2 = this.zza;
        zzbwxVar2.zzi().zzc(zzcbjVar, zzcbjVar.zzb());
        zzbwxVar2.zzi().flush();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbwt(zzbwx zzbwxVar) {
        super(zzbwxVar, null);
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
        int i10 = zzcba.zza;
    }
}
