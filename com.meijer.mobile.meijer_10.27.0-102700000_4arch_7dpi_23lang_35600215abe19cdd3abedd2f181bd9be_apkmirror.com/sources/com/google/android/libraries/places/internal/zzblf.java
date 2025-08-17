package com.google.android.libraries.places.internal;

import Be.p;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
final class zzblf implements zzblw {
    private final zzblw zza;

    @Override // com.google.android.libraries.places.internal.zzblw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final zzbmg zza(SocketAddress socketAddress, zzblv zzblvVar, zzbfg zzbfgVar) {
        return new zzble(this, this.zza.zza(socketAddress, zzblvVar, zzbfgVar), zzblvVar.zza());
    }

    @Override // com.google.android.libraries.places.internal.zzblw
    public final ScheduledExecutorService zzb() {
        return this.zza.zzb();
    }

    zzblf(zzblw zzblwVar, zzbfa zzbfaVar, Executor executor) {
        this.zza = (zzblw) p.r(zzblwVar, "delegate");
    }
}
