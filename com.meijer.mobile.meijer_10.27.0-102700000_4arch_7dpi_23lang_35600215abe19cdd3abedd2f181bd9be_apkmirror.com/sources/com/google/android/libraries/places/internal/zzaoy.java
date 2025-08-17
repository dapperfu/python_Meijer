package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzaoy {
    private final zzbip zza;
    private final zzbfd zzb;
    private final String zzc;

    private zzaoy(int i10, zzbiu zzbiuVar, String str, zzbfd zzbfdVar, zzbip zzbipVar, String str2) {
        this.zzb = zzbfdVar;
        this.zza = zzbipVar;
        this.zzc = str2;
    }

    public final zzbip zzb() {
        return this.zza;
    }

    public final zzbfd zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public static zzaoy zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbip zzbipVar, String str) {
        return new zzaoy(2, (zzbiu) p.q(zzbiuVar), null, (zzbfd) p.q(zzbfdVar), (zzbip) p.q(zzbipVar), (String) p.q(str));
    }
}
