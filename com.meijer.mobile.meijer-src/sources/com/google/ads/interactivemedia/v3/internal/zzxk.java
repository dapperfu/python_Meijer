package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
final class zzxk implements zzya {
    final /* synthetic */ Constructor zza;

    zzxk(Constructor constructor) {
        this.zza = constructor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzya
    public final Object zza() {
        try {
            return this.zza.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw zzabp.zzb(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + zzabp.zzc(this.zza) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + zzabp.zzc(this.zza) + "' with no args", e12.getCause());
        }
    }
}
