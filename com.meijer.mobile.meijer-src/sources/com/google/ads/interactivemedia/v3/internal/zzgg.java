package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class zzgg {
    private final Context zza;
    private final zzuv zzb;
    private final zzfd zzc;
    private final zzuu zzd;

    /* JADX WARN: Multi-variable type inference failed */
    public final String zza(Integer num) {
        if (num == null || num.intValue() <= 0) {
            return zzb();
        }
        zzuu zzuuVarZza = this.zzb.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzgf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
        try {
            return (String) zzuuVarZza.get(num.intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.zzc.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.SPAM_MS_PARAMETER_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_SPAM_MS_PARAMETER, e10);
            String str = true != (e10 instanceof TimeoutException) ? "3" : "17";
            zzuuVarZza.cancel(false);
            return str;
        }
    }

    public zzgg(final Context context, final zzuv zzuvVar, final TestingConfiguration testingConfiguration, final zzfd zzfdVar) {
        this.zza = context;
        this.zzb = zzuvVar;
        this.zzc = zzfdVar;
        this.zzd = zzuvVar.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzge
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzl zzlVarZza = zzm.zza();
                zzlVarZza.zze(3);
                zzlVarZza.zzd("a.3.35.1");
                zzlVarZza.zzb(false);
                zzlVarZza.zzc(false);
                Context context2 = context;
                int i10 = Build.VERSION.SDK_INT;
                zzuv zzuvVar2 = zzuvVar;
                if (i10 < 30 && zzel.zzd(context2, testingConfiguration)) {
                    zzah zzahVarZzb = zzai.zzb();
                    zzahVarZzb.zza(true);
                    zzlVarZza.zza((zzai) zzahVarZzb.zzal());
                }
                try {
                    return zzqf.zzh(new zzlj(context2, zzuvVar2, (zzm) zzlVarZza.zzal()));
                } catch (RuntimeException e10) {
                    zzfdVar.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.SPAM_MS_PARAMETER_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.SETUP_AD_SHIELD, e10);
                    return zzqf.zzf();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final String zzb() {
        zzqf zzqfVarZzf = zzqf.zzf();
        try {
            zzqfVarZzf = (zzqf) this.zzd.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        if (!zzqfVarZzf.zze()) {
            return "3";
        }
        try {
            return ((zzlj) zzqfVarZzf.zzb()).zza(this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.SPAM_MS_PARAMETER_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbq.GET_SPAM_MS_PARAMETER_FROM_ADSHIELD, e10);
            return "3";
        }
    }
}
