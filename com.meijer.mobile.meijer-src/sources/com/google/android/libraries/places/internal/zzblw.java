package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public interface zzblw extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    zzbmg zza(SocketAddress socketAddress, zzblv zzblvVar, zzbfg zzbfgVar);

    ScheduledExecutorService zzb();
}
