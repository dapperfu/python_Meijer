package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
final class zzboz implements zzbwd {
    zzboz() {
    }

    public final String toString() {
        return "grpc-default-executor";
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Executors.newCachedThreadPool(zzbpf.zzd("grpc-default-executor-%d", true));
    }
}
