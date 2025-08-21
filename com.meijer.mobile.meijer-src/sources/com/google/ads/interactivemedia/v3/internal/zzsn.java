package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzsn extends zzsd implements Serializable {
    final zzsd zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd
    public final zzsd zza() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsn) {
            return this.zza.equals(((zzsn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    zzsn(zzsd zzsdVar) {
        this.zza = zzsdVar;
    }
}
