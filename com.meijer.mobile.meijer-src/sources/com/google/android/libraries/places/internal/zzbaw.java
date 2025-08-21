package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public class zzbaw {
    protected volatile zzbbl zza;
    private volatile zzayz zzb;
    private volatile boolean zzc;

    public int hashCode() {
        return 1;
    }

    public final zzbbl zza(zzbbl zzbblVar) {
        zzbbl zzbblVar2 = this.zza;
        this.zzb = null;
        this.zza = zzbblVar;
        return zzbblVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbaw)) {
            return false;
        }
        zzbaw zzbawVar = (zzbaw) obj;
        zzbbl zzbblVar = this.zza;
        zzbbl zzbblVar2 = zzbawVar.zza;
        if (zzbblVar == null && zzbblVar2 == null) {
            return zzc().equals(zzbawVar.zzc());
        }
        if (zzbblVar != null && zzbblVar2 != null) {
            return zzbblVar.equals(zzbblVar2);
        }
        if (zzbblVar != null) {
            zzbawVar.zzd(zzbblVar.zzbB());
            return zzbblVar.equals(zzbawVar.zza);
        }
        zzd(zzbblVar2.zzbB());
        return this.zza.equals(zzbblVar2);
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzayy) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbl();
        }
        return 0;
    }

    public final zzayz zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzayz.zzb;
                } else {
                    this.zzb = this.zza.zzaY();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void zzd(zzbbl zzbblVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzbblVar;
                this.zzb = zzayz.zzb;
            } catch (zzbar unused) {
                this.zzc = true;
                this.zza = zzbblVar;
                this.zzb = zzayz.zzb;
            }
        }
    }
}
