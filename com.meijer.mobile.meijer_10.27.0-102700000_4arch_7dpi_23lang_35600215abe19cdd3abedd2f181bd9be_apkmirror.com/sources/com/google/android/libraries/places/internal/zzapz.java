package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzapz {
    private final Object zza;
    private final LinkedHashMap zzb;
    private int zzc;

    final /* synthetic */ Object zzc() {
        return this.zza;
    }

    final /* synthetic */ int zzd() {
        return this.zzc;
    }

    final /* synthetic */ void zze(int i10) {
        this.zzc = i10;
    }

    final boolean zza() {
        return this.zzb.isEmpty();
    }

    final boolean zzb() {
        return this.zzb.isEmpty() && this.zzc == 0;
    }

    zzapz(zzaqa zzaqaVar, Object obj, int i10) {
        Objects.requireNonNull(zzaqaVar);
        this.zzb = new LinkedHashMap();
        this.zza = obj;
        this.zzc = i10;
    }
}
