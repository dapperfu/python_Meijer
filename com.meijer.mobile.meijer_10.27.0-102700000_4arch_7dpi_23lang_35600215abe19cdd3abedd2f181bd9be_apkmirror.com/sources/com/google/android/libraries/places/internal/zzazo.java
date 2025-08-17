package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzazo {
    private final Object zza;
    private final int zzb;

    zzazo(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzazo)) {
            return false;
        }
        zzazo zzazoVar = (zzazo) obj;
        return this.zza == zzazoVar.zza && this.zzb == zzazoVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
