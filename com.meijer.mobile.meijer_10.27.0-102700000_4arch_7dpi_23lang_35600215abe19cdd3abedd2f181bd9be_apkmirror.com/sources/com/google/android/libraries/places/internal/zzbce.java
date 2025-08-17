package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbce implements Iterator {
    final /* synthetic */ zzbcg zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzbcg zzbcgVar = this.zza;
        return i10 < zzbcgVar.zzj() ? (zzbcd) zzbcgVar.zzi()[i10] : (Map.Entry) zza().next();
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzbcg zzbcgVar = this.zza;
        if (i10 >= zzbcgVar.zzj()) {
            return !zzbcgVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzbcg zzbcgVar = this.zza;
        zzbcgVar.zzh();
        int i10 = this.zzb;
        if (i10 >= zzbcgVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzbcgVar.zzg(i10);
        }
    }

    /* synthetic */ zzbce(zzbcg zzbcgVar, byte[] bArr) {
        Objects.requireNonNull(zzbcgVar);
        this.zza = zzbcgVar;
        this.zzb = -1;
    }
}
