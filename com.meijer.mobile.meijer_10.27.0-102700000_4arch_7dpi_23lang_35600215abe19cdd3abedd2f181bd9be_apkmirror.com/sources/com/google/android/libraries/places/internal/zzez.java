package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzez {
    private final String zza;

    private zzez(String str) {
        this.zza = str;
    }

    public final String toString() {
        return this.zza;
    }

    public static zzez zza(String str) {
        return new zzez((String) p.q(str));
    }

    public static zzez zzb(zzez zzezVar, zzez zzezVar2) {
        return new zzez(String.valueOf(zzezVar.zza).concat(String.valueOf(zzezVar2.zza)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzez) {
            return this.zza.equals(((zzez) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }
}
