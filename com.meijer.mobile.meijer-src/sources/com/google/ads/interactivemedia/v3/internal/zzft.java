package com.google.ads.interactivemedia.v3.internal;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;

/* loaded from: classes4.dex */
final class zzft {
    private final SecureSignalsAdapter zza;
    private final Context zzb;
    private final String zzc;
    private final C5517k zzd = new C5517k();

    final String zze() {
        return this.zzc;
    }

    final AbstractC5516j zzb() {
        C5517k c5517k = new C5517k();
        this.zza.collectSignals(this.zzb, new zzfs(this, c5517k));
        return c5517k.a();
    }

    final AbstractC5516j zzc() {
        this.zza.initialize(this.zzb, new zzfr(this));
        return this.zzd.a();
    }

    final String zzf() {
        return this.zza.getVersion().toString();
    }

    zzft(SecureSignalsAdapter secureSignalsAdapter, String str, Context context) {
        this.zza = secureSignalsAdapter;
        this.zzc = str;
        this.zzb = context;
    }
}
