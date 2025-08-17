package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbrc extends zzbpk {
    final /* synthetic */ zzbrx zza;

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zzd() {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbpk
    protected final void zze() {
        zzbrx zzbrxVar = this.zza;
        if (zzbrxVar.zzM().get()) {
            return;
        }
        zzbrxVar.zzm();
    }

    /* synthetic */ zzbrc(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
