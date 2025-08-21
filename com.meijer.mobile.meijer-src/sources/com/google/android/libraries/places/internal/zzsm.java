package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzsm {
    private static final zzsp zza = new zzsk();
    private static final zzso zzb = new zzsl();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();

    final /* synthetic */ Map zzc() {
        return this.zzc;
    }

    final /* synthetic */ Map zzd() {
        return this.zzd;
    }

    final void zza(zzsd zzsdVar) {
        zztw.zza(zzsdVar, "key");
        if (!zzsdVar.zzb()) {
            zzsp zzspVar = zza;
            zztw.zza(zzsdVar, "key");
            this.zzd.remove(zzsdVar);
            this.zzc.put(zzsdVar, zzspVar);
            return;
        }
        zzso zzsoVar = zzb;
        zztw.zza(zzsdVar, "key");
        if (!zzsdVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzsdVar);
        this.zzd.put(zzsdVar, zzsoVar);
    }

    public final zzsq zzb() {
        return new zzsn(this, null);
    }

    /* synthetic */ zzsm(zzsp zzspVar, byte[] bArr) {
    }
}
