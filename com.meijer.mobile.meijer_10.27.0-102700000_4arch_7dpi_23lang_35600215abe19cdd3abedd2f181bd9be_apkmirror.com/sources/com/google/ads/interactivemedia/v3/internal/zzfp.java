package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import android.content.Context;
import android.os.Build;
import com.google.ads.interactivemedia.pal.PlatformSignalCollector;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ze.j;

/* loaded from: classes4.dex */
public final class zzfp {
    private final Context zza;
    private final ExecutorService zzb;
    private final PlatformSignalCollector zzc;
    private final zzfd zzd;
    private final C5233k zze;

    public zzfp(Context context, ExecutorService executorService, zzfd zzfdVar, TestingConfiguration testingConfiguration) {
        j jVar = null;
        if (Build.VERSION.SDK_INT >= 26 && zzel.zzc(context, testingConfiguration)) {
            jVar = new j();
        }
        this.zze = new C5233k();
        this.zza = context;
        this.zzb = executorService;
        this.zzd = zzfdVar;
        this.zzc = jVar;
    }

    public final AbstractC5232j zza() {
        return this.zze.a();
    }

    public final void zzb(Integer num) {
        PlatformSignalCollector platformSignalCollector = this.zzc;
        if (platformSignalCollector == null || num == null) {
            this.zze.c(null);
            return;
        }
        AbstractC5232j abstractC5232jL = C5235m.l(platformSignalCollector.collectSignals(this.zza, this.zzb), num.intValue(), TimeUnit.MILLISECONDS);
        final C5233k c5233k = this.zze;
        Objects.requireNonNull(c5233k);
        abstractC5232jL.g(new InterfaceC5229g() { // from class: com.google.ads.interactivemedia.v3.internal.zzfn
            @Override // Td.InterfaceC5229g
            public final void onSuccess(Object obj) {
                c5233k.c((Map) obj);
            }
        });
        abstractC5232jL.e(new InterfaceC5228f() { // from class: com.google.ads.interactivemedia.v3.internal.zzfo
            @Override // Td.InterfaceC5228f
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
