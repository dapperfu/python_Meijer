package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzbfc {
    private final String zza;

    private zzbfc(String str, Object obj) {
        this.zza = str;
    }

    public final String toString() {
        return this.zza;
    }

    public static zzbfc zza(String str) {
        p.r(str, "debugString");
        return new zzbfc(str, null);
    }
}
