package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class zzff {
    protected ArrayList zza;

    public final zzfe zza(Context context, Uri uri, TestingConfiguration testingConfiguration, ExecutorService executorService) {
        if (this.zza.isEmpty()) {
            return zzc(context, uri, testingConfiguration, executorService);
        }
        zzfe zzfeVar = (zzfe) this.zza.remove(0);
        return !zzd(uri, testingConfiguration, zzfeVar) ? zzc(context, uri, testingConfiguration, executorService) : zzfeVar;
    }

    public final void zzb(Context context, Uri uri, TestingConfiguration testingConfiguration, ExecutorService executorService) {
        if (!this.zza.isEmpty()) {
            if (zzd(uri, testingConfiguration, (zzfe) this.zza.get(0))) {
                return;
            } else {
                this.zza.remove(0);
            }
        }
        zzahj zzahjVarZzd = zzahk.zzd();
        zzfl zzflVarZzb = zzfl.zzb(context);
        com.google.ads.interactivemedia.v3.impl.zzba zzbaVarZzc = com.google.ads.interactivemedia.v3.impl.zzba.zzc(context.getApplicationContext(), testingConfiguration, uri, zzahjVarZzd, executorService);
        zzbaVarZzc.zzi("*", JavaScriptMessage.MsgChannel.omid, zzflVarZzb);
        this.zza.add(new zzeo(uri, testingConfiguration, zzbaVarZzc, zzahjVarZzd, executorService, zzflVarZzb));
    }

    public zzff() {
        this.zza = new ArrayList();
        this.zza = new ArrayList();
    }

    private static final zzfe zzc(Context context, Uri uri, TestingConfiguration testingConfiguration, ExecutorService executorService) {
        zzahj zzahjVarZzd = zzahk.zzd();
        zzfl zzflVarZzb = zzfl.zzb(context);
        com.google.ads.interactivemedia.v3.impl.zzba zzbaVarZzc = com.google.ads.interactivemedia.v3.impl.zzba.zzc(context.getApplicationContext(), testingConfiguration, uri, zzahjVarZzd, executorService);
        zzbaVarZzc.zzi("*", JavaScriptMessage.MsgChannel.omid, zzflVarZzb);
        return new zzeo(uri, testingConfiguration, zzbaVarZzc, zzahjVarZzd, executorService, zzflVarZzb);
    }

    private static final boolean zzd(Uri uri, TestingConfiguration testingConfiguration, zzfe zzfeVar) {
        if (Objects.equals(zzfeVar.zza(), uri) && Objects.equals(zzfeVar.zzc(), testingConfiguration)) {
            return true;
        }
        return false;
    }
}
