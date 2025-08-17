package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.Collections;

/* loaded from: classes6.dex */
final class zzbta {
    private final zzbez zza;
    private final SocketAddress zzb;

    public zzbta(zzbez zzbezVar, SocketAddress socketAddress) {
        this.zza = zzbezVar;
        this.zzb = socketAddress;
    }

    final /* synthetic */ zzbez zzb() {
        return this.zza;
    }

    final /* synthetic */ SocketAddress zzc() {
        return this.zzb;
    }

    final /* synthetic */ zzbgl zza() {
        return new zzbgl(Collections.singletonList(this.zzb), this.zza);
    }
}
