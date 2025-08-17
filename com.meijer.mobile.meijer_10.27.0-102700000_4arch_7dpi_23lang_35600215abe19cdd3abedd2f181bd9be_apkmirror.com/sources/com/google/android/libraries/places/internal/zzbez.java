package com.google.android.libraries.places.internal;

import Be.l;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbez {
    public static final zzbez zza;
    private static final IdentityHashMap zzc;
    private final IdentityHashMap zzb;

    private zzbez(IdentityHashMap identityHashMap) {
        this.zzb = identityHashMap;
    }

    public static zzbex zzb() {
        return new zzbex(zza, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbez.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.zzb;
        IdentityHashMap identityHashMap2 = ((zzbez) obj).zzb;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !l.a(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final zzbex zzc() {
        return new zzbex(this, null);
    }

    final /* synthetic */ IdentityHashMap zzd() {
        return this.zzb;
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        zzc = identityHashMap;
        zza = new zzbez(identityHashMap);
    }

    /* synthetic */ zzbez(IdentityHashMap identityHashMap, byte[] bArr) {
        this.zzb = identityHashMap;
    }

    public final int hashCode() {
        int iB = 0;
        for (Map.Entry entry : this.zzb.entrySet()) {
            iB += l.b(entry.getKey(), entry.getValue());
        }
        return iB;
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Object zza(zzbey zzbeyVar) {
        return this.zzb.get(zzbeyVar);
    }
}
