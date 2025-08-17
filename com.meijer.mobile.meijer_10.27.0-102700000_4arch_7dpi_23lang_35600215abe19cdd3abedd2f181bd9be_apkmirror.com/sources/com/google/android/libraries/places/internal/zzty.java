package com.google.android.libraries.places.internal;

import java.io.Closeable;

/* loaded from: classes6.dex */
public final class zzty implements Closeable {
    private static final ThreadLocal zza = new zztx();
    private int zzb = 0;

    public static int zza() {
        return ((zzty) zza.get()).zzb;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.zzb;
        if (i10 <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.zzb = i10 - 1;
    }
}
