package com.google.android.libraries.places.internal;

import De.p;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbra implements zzbsi {
    final /* synthetic */ zzbrx zza;

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final zzbez zza(zzbez zzbezVar) {
        return zzbezVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzc(boolean z10) {
        zzbrx zzbrxVar = this.zza;
        zzbrxVar.zzf.zza(zzbrxVar.zzK(), z10);
        if (z10) {
            zzbrxVar.zze();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzd(zzbjv zzbjvVar) {
        p.x(this.zza.zzM().get(), "Channel must have been shut down");
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zze() {
        zzbrx zzbrxVar = this.zza;
        p.x(zzbrxVar.zzM().get(), "Channel must have been shut down");
        zzbrxVar.zzQ(true);
        zzbrxVar.zzj(false);
        zzbrxVar.zzi();
        zzbrxVar.zzq();
    }

    /* synthetic */ zzbra(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
