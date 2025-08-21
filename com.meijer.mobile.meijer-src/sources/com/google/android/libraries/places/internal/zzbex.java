package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbex {
    private zzbez zza;
    private IdentityHashMap zzb;

    /* synthetic */ zzbex(zzbez zzbezVar, byte[] bArr) {
        this.zza = zzbezVar;
    }

    public final zzbex zza(zzbey zzbeyVar, Object obj) {
        if (this.zzb == null) {
            this.zzb = new IdentityHashMap(1);
        }
        this.zzb.put(zzbeyVar, obj);
        return this;
    }

    public final zzbex zzb(zzbey zzbeyVar) {
        if (this.zza.zzd().containsKey(zzbeyVar)) {
            IdentityHashMap identityHashMap = new IdentityHashMap(this.zza.zzd());
            identityHashMap.remove(zzbeyVar);
            this.zza = new zzbez(identityHashMap, null);
        }
        IdentityHashMap identityHashMap2 = this.zzb;
        if (identityHashMap2 != null) {
            identityHashMap2.remove(zzbeyVar);
        }
        return this;
    }

    public final zzbez zzc() {
        if (this.zzb != null) {
            for (Map.Entry entry : this.zza.zzd().entrySet()) {
                if (!this.zzb.containsKey(entry.getKey())) {
                    this.zzb.put((zzbey) entry.getKey(), entry.getValue());
                }
            }
            this.zza = new zzbez(this.zzb, null);
            this.zzb = null;
        }
        return this.zza;
    }
}
