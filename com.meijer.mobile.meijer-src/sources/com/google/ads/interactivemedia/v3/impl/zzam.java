package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
final class zzam {
    private final zzaf zza;
    private final zzat zzb;
    private final ExecutorService zzc;
    private final zzbi zzd;
    private final String zze;
    private final zzgi zzf;
    private final float zzg;

    private final void zzb() {
        this.zzb.zzc(new zzd(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Unable to parse companion information.")));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.ads.interactivemedia.v3.impl.data.zzbu r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.impl.zzam.zza(com.google.ads.interactivemedia.v3.impl.data.zzbu):void");
    }

    zzam(Context context, ExecutorService executorService, String str, zzaf zzafVar, zzat zzatVar, zzgi zzgiVar, zzbi zzbiVar) {
        this.zzf = zzgiVar;
        this.zzc = executorService;
        this.zzb = zzatVar;
        this.zza = zzafVar;
        this.zzd = zzbiVar;
        this.zze = str;
        this.zzg = context.getResources().getDisplayMetrics().density;
    }
}
