package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzblb {
    private final zzbie zza;
    private final String zzb = (String) p.r("pick_first", "defaultPolicy");

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.libraries.places.internal.zzbiz zza(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzblb.zza(java.util.Map):com.google.android.libraries.places.internal.zzbiz");
    }

    final /* synthetic */ zzbie zzc() {
        return this.zza;
    }

    final /* synthetic */ String zzd() {
        return this.zzb;
    }

    final /* synthetic */ zzbic zzb(String str, String str2) throws zzbla {
        zzbic zzbicVarZzb = this.zza.zzb(str);
        if (zzbicVarZzb != null) {
            return zzbicVarZzb;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68);
        sb2.append("Trying to load '");
        sb2.append(str);
        sb2.append("' because using default policy, but it's unavailable");
        throw new zzbla(sb2.toString(), null);
    }

    zzblb(zzbie zzbieVar, String str) {
        this.zza = (zzbie) p.r(zzbieVar, "registry");
    }
}
