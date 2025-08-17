package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class zzbgb {
    static final zzbgc zza;

    static {
        zzbgc zzbkeVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzbkeVar = (zzbgc) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzbgc.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            atomicReference.set(e10);
            zzbkeVar = new zzbke();
        } catch (Exception e11) {
            throw new RuntimeException("Storage override failed to initialize", e11);
        }
        zza = zzbkeVar;
        Throwable th2 = (Throwable) atomicReference.get();
        if (th2 != null) {
            zzbgd.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th2);
        }
    }
}
