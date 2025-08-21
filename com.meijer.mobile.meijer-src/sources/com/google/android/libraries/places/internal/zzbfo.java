package com.google.android.libraries.places.internal;

import De.j;
import De.p;

/* loaded from: classes6.dex */
public final class zzbfo {
    private final zzbfd zza;
    private final int zzb;
    private final boolean zzc;

    public static zzbfn zza() {
        return new zzbfn();
    }

    zzbfo(zzbfd zzbfdVar, int i10, boolean z10) {
        this.zza = (zzbfd) p.r(zzbfdVar, "callOptions");
        this.zzb = i10;
        this.zzc = z10;
    }

    public final String toString() {
        return j.c(this).d("callOptions", this.zza).b("previousAttempts", this.zzb).e("isTransparentRetry", this.zzc).toString();
    }
}
