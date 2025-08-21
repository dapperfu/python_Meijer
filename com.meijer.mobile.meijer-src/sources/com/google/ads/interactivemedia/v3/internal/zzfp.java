package com.google.ads.interactivemedia.v3.internal;

import Be.j;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5512f;
import Vd.InterfaceC5513g;
import android.content.Context;
import android.os.Build;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzfp {
    private final Context zza;
    private final ExecutorService zzb;
    private final PlatformSignalCollector zzc;
    private final zzfd zzd;
    private final C5517k zze;

    public zzfp(Context context, ExecutorService executorService, zzfd zzfdVar, TestingConfiguration testingConfiguration) {
        j jVar = null;
        if (Build.VERSION.SDK_INT >= 26 && zzel.zzc(context, testingConfiguration)) {
            jVar = new j();
        }
        this.zze = new C5517k();
        this.zza = context;
        this.zzb = executorService;
        this.zzd = zzfdVar;
        this.zzc = jVar;
    }

    public final AbstractC5516j zza() {
        return this.zze.a();
    }

    public final void zzb(Integer num) {
        PlatformSignalCollector platformSignalCollector = this.zzc;
        if (platformSignalCollector == null || num == null) {
            this.zze.c(null);
            return;
        }
        AbstractC5516j abstractC5516jL = C5519m.l(platformSignalCollector.collectSignals(this.zza, this.zzb), num.intValue(), TimeUnit.MILLISECONDS);
        final C5517k c5517k = this.zze;
        Objects.requireNonNull(c5517k);
        abstractC5516jL.g(new InterfaceC5513g() { // from class: com.google.ads.interactivemedia.v3.internal.zzfn
            @Override // Vd.InterfaceC5513g
            public final void onSuccess(Object obj) {
                c5517k.c((Map) obj);
            }
        });
        abstractC5516jL.e(new InterfaceC5512f() { // from class: com.google.ads.interactivemedia.v3.internal.zzfo
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                this.zza.zzc(exc);
            }
        });
    }

    final /* synthetic */ void zzc(Exception exc) {
        this.zzd.zzg(com.google.ads.interactivemedia.v3.impl.data.zzbp.PLATFORM_SIGNAL_COLLECTOR, com.google.ads.interactivemedia.v3.impl.data.zzbq.PLATFORM_COLLECT_SIGNALS, exc);
        this.zze.b(exc);
    }
}
