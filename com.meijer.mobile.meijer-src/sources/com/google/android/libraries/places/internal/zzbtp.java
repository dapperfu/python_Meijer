package com.google.android.libraries.places.internal;

import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbtp extends zzbic {
    static final boolean zza = zzbpf.zzj("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int zzb = 0;

    @Override // com.google.android.libraries.places.internal.zzbic
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final String zzd() {
        return "pick_first";
    }

    @Override // com.google.android.libraries.places.internal.zzbhp
    public final zzbia zza(zzbhr zzbhrVar) {
        return zza ? new zzbti(zzbhrVar) : new zzbto(zzbhrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbic
    public final zzbiz zze(Map map) {
        try {
            Boolean boolZzi = zzbqj.zzi(map, "shuffleAddressList");
            return zzbiz.zza(zza ? new zzbtd(boolZzi, null) : new zzbtk(boolZzi, null));
        } catch (RuntimeException e10) {
            return zzbiz.zzb(zzbjv.zzi.zzd(e10).zze("Failed parsing configuration for pick_first"));
        }
    }
}
