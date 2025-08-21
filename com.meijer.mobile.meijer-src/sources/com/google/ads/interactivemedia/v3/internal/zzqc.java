package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzqc {
    private final String zza;
    private final zzqa zzb;
    private zzqa zzc;

    private final zzqa zzc() {
        zzqa zzqaVar = new zzqa();
        this.zzc.zzc = zzqaVar;
        this.zzc = zzqaVar;
        return zzqaVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzqa zzqaVar = this.zzb.zzc;
        String str = "";
        while (zzqaVar != null) {
            Object obj = zzqaVar.zzb;
            sb2.append(str);
            String str2 = zzqaVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzqaVar = zzqaVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* synthetic */ zzqc(String str, zzqb zzqbVar) {
        zzqa zzqaVar = new zzqa();
        this.zzb = zzqaVar;
        this.zzc = zzqaVar;
        str.getClass();
        this.zza = str;
    }

    public final zzqc zza(String str, Object obj) {
        zzqa zzqaVarZzc = zzc();
        zzqaVarZzc.zzb = obj;
        zzqaVarZzc.zza = "consentKeyTypes";
        return this;
    }

    public final zzqc zzb(Object obj) {
        zzc().zzb = obj;
        return this;
    }
}
