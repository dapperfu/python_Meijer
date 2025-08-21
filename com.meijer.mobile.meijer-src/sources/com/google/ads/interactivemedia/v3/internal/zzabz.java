package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzabz {
    public static final boolean zza;
    public static final zzwk zzb;
    public static final zzwk zzc;
    public static final zzwk zzd;

    static {
        boolean z10;
        zzwk zzwkVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        zza = z10;
        if (z10) {
            zzb = zzabs.zza;
            zzc = zzabv.zza;
            zzwkVar = zzaby.zza;
        } else {
            zzwkVar = null;
            zzb = null;
            zzc = null;
        }
        zzd = zzwkVar;
    }
}
