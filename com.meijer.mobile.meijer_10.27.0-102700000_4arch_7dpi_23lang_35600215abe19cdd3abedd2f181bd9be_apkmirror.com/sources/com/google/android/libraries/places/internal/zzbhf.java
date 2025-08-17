package com.google.android.libraries.places.internal;

import Be.p;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class zzbhf {
    private static final AtomicLong zza = new AtomicLong();
    private final String zzb;
    private final String zzc;
    private final long zzd;

    public final long zzc() {
        return this.zzd;
    }

    public static zzbhf zza(Class cls, String str) {
        String simpleName = ((Class) p.r(cls, "type")).getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return zzb(simpleName, str);
    }

    public static zzbhf zzb(String str, String str2) {
        return new zzbhf(str, str2, zza.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.zzb;
        int length = String.valueOf(str).length();
        long j10 = this.zzd;
        StringBuilder sb3 = new StringBuilder(length + 1 + String.valueOf(j10).length() + 1);
        sb3.append(str);
        sb3.append("<");
        sb3.append(j10);
        sb3.append(">");
        sb2.append(sb3.toString());
        String str2 = this.zzc;
        if (str2 != null) {
            sb2.append(": (");
            sb2.append(str2);
            sb2.append(')');
        }
        return sb2.toString();
    }

    zzbhf(String str, String str2, long j10) {
        p.r(str, "typeName");
        p.e(!str.isEmpty(), "empty type");
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j10;
    }
}
