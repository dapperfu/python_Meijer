package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzbfn {
    private zzbfd zza = zzbfd.zza;
    private int zzb;
    private boolean zzc;

    public final zzbfn zzb(int i10) {
        this.zzb = i10;
        return this;
    }

    public final zzbfn zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzbfn zza(zzbfd zzbfdVar) {
        this.zza = (zzbfd) p.r(zzbfdVar, "callOptions cannot be null");
        return this;
    }

    public final zzbfo zzd() {
        return new zzbfo(this.zza, this.zzb, this.zzc);
    }

    zzbfn() {
    }
}
