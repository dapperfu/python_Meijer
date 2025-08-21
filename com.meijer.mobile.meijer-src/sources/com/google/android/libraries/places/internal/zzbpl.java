package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class zzbpl {
    private final ArrayList zza = new ArrayList();

    public final String toString() {
        return this.zza.toString();
    }

    public final zzbpl zza(Object obj) {
        this.zza.add(String.valueOf(obj));
        return this;
    }

    public final zzbpl zzb(String str, Object obj) {
        String strValueOf = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + strValueOf.length());
        sb2.append(str);
        sb2.append("=");
        sb2.append(strValueOf);
        this.zza.add(sb2.toString());
        return this;
    }
}
