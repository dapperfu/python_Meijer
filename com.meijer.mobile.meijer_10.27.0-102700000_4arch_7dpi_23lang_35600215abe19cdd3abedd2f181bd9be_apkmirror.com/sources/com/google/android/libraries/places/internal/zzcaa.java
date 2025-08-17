package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class zzcaa {
    private final zzbfe zza;
    private final zzbfd zzb;

    protected abstract zzcaa zza(zzbfe zzbfeVar, zzbfd zzbfdVar);

    public final zzbfe zzc() {
        return this.zza;
    }

    public final zzbfd zzd() {
        return this.zzb;
    }

    public final zzcaa zze(zzbfj... zzbfjVarArr) {
        return zza(zzbfl.zza(this.zza, Arrays.asList(zzbfjVarArr)), this.zzb);
    }

    protected zzcaa(zzbfe zzbfeVar, zzbfd zzbfdVar) {
        this.zza = (zzbfe) p.r(zzbfeVar, "channel");
        this.zzb = (zzbfd) p.r(zzbfdVar, "callOptions");
    }
}
