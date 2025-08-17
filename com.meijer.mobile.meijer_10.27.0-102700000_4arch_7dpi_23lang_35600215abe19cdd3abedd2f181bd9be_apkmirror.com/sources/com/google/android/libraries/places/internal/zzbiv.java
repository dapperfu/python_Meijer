package com.google.android.libraries.places.internal;

import java.util.HashSet;

/* loaded from: classes6.dex */
public final class zzbiv {
    private static zzbiv zza;

    public static synchronized zzbiv zza() {
        try {
            if (zza == null) {
                zza = new zzbiv();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    zzbiv() {
        new HashSet();
    }
}
