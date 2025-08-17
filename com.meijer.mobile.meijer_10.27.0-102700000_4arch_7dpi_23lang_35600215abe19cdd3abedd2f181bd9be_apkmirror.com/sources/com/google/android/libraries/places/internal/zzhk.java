package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.common.util.concurrent.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzhk implements zzcan {
    final List zza;
    final /* synthetic */ z zzb;

    zzhk(zzhl zzhlVar, z zVar) {
        this.zzb = zVar;
        Objects.requireNonNull(zzhlVar);
        this.zza = new ArrayList();
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zza(Throwable th2) {
        this.zzb.setException(th2);
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zzb() {
        List<zzash> list = this.zza;
        for (zzash zzashVar : list) {
            if (zzashVar.zzc().contains(PlaceTypes.POINT_OF_INTEREST)) {
                this.zzb.set(zzashVar.zza());
                return;
            }
        }
        this.zzb.set(list.isEmpty() ? "" : ((zzash) list.get(0)).zza());
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final /* bridge */ /* synthetic */ void zzc(Object obj) {
        this.zza.addAll(((zzasd) obj).zza());
    }
}
