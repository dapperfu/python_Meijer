package com.google.android.libraries.places.internal;

import Be.j;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class zzbic extends zzbhp {
    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract boolean zzb();

    public abstract int zzc();

    public abstract String zzd();

    public zzbiz zze(Map map) {
        throw null;
    }

    static {
        zzbiz.zza(new zzbib());
    }

    public final String toString() {
        return j.c(this).d("policy", zzd()).b("priority", 5).e("available", true).toString();
    }
}
