package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.z;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzht implements j {
    final /* synthetic */ z zza;

    zzht(zzip zzipVar, z zVar) {
        this.zza = zVar;
        Objects.requireNonNull(zzipVar);
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        com.google.android.libraries.places.api.auth.zza zzaVarZzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzaVarZzd.zza(true);
        zzaVarZzd.zzb((String) obj);
        zzaVarZzd.zzc(null);
        this.zza.set(zzaVarZzd.zzd());
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        com.google.android.libraries.places.api.auth.zza zzaVarZzd = com.google.android.libraries.places.api.auth.zzb.zzd();
        zzaVarZzd.zza(true);
        zzaVarZzd.zzb("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==");
        zzaVarZzd.zzc(th2.getMessage());
        this.zza.set(zzaVarZzd.zzd());
    }
}
