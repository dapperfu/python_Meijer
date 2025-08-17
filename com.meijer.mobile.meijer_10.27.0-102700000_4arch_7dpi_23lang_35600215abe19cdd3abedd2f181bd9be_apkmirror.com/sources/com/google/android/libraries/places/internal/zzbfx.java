package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbfx {
    private static zzbfx zza;
    private final List zzb = Collections.EMPTY_LIST;
    private int zzc = 0;

    public final synchronized List zzb() {
        this.zzc++;
        return this.zzb;
    }

    public final synchronized boolean zzc() {
        return false;
    }

    public static synchronized zzbfx zza() {
        try {
            if (zza == null) {
                zza = new zzbfx();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    zzbfx() {
    }
}
