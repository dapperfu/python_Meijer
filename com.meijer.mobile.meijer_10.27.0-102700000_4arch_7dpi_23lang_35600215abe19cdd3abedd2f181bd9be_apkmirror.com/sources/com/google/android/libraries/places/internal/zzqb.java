package com.google.android.libraries.places.internal;

import android.os.Looper;

/* loaded from: classes6.dex */
public final class zzqb {
    private static Thread zza;

    public static boolean zza(Thread thread) {
        if (zza == null) {
            zza = Looper.getMainLooper().getThread();
        }
        return thread == zza;
    }
}
