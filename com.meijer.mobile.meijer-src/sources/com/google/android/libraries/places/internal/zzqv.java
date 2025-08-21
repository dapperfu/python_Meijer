package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzqv {
    int zza;
    final int zzb;
    zzqv zzc;
    final Map zzd = new HashMap(0);

    zzqv(int i10, int i11, zzqv zzqvVar) {
        if (i10 <= i11) {
            this.zza = i10;
            this.zzb = i11;
            this.zzc = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4);
        sb2.append("Node");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }
}
