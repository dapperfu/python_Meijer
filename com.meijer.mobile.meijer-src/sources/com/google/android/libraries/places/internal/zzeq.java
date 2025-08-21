package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzeq implements zzapa {
    private static final zzbil zzb = zzbil.zzc("Cookie", zzbip.zza);
    private q zza;
    private final zzeo zzc;

    public zzeq(zzeo zwiebackCookieManager) {
        Intrinsics.j(zwiebackCookieManager, "zwiebackCookieManager");
        this.zzc = zwiebackCookieManager;
    }

    @Override // com.google.android.libraries.places.internal.zzapa
    public final zzaqg zza(zzaoy context) {
        Intrinsics.j(context, "context");
        q qVarZza = this.zzc.zza();
        this.zza = qVarZza;
        zzaqg zzaqgVarZzb = zzaqg.zzb(qVarZza);
        Intrinsics.i(zzaqgVarZzb, "continueAfter(...)");
        return zzaqgVarZzb;
    }

    @Override // com.google.android.libraries.places.internal.zzapa
    public final zzaqg zzb(zzaoy context) {
        Intrinsics.j(context, "context");
        q qVar = this.zza;
        if (qVar == null) {
            zzaqg zzaqgVarZza = zzaqg.zza();
            Intrinsics.i(zzaqgVarZza, "proceed(...)");
            return zzaqgVarZza;
        }
        try {
            Intrinsics.g(qVar);
            Object objB = k.b(qVar);
            Intrinsics.i(objB, "getDone(...)");
            String str = (String) objB;
            if (!Intrinsics.e(str, "")) {
                zzbip zzbipVarZzb = context.zzb();
                zzbil zzbilVar = zzb;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4);
                sb2.append("NID=");
                sb2.append(str);
                zzbipVarZzb.zzc(zzbilVar, sb2.toString());
            }
        } catch (Exception unused) {
        }
        zzaqg zzaqgVarZza2 = zzaqg.zza();
        Intrinsics.i(zzaqgVarZza2, "proceed(...)");
        return zzaqgVarZza2;
    }
}
