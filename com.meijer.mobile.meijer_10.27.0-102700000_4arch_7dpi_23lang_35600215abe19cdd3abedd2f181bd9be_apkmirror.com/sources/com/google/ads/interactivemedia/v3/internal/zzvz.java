package com.google.ads.interactivemedia.v3.internal;

import java.util.Set;

/* loaded from: classes4.dex */
public final class zzvz extends zzvw {
    private final zzxy zza = new zzxy(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzvz) && ((zzvz) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Set zza() {
        return this.zza.entrySet();
    }

    public final void zzb(String str, zzvw zzvwVar) {
        this.zza.put(str, zzvwVar);
    }
}
