package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
final class zzbpa implements zzbwd {
    zzbpa() {
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* synthetic */ void zza(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final /* bridge */ /* synthetic */ Object zzb() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, zzbpf.zzd("grpc-timer-%d", true));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
        return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }
}
