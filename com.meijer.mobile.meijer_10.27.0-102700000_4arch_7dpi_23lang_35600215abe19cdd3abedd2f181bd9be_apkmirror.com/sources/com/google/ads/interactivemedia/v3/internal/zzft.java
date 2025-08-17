package com.google.ads.interactivemedia.v3.internal;

import Td.AbstractC5232j;
import Td.C5233k;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;

/* loaded from: classes4.dex */
final class zzft {
    private final SecureSignalsAdapter zza;
    private final Context zzb;
    private final String zzc;
    private final C5233k zzd = new C5233k();

    final String zze() {
        return this.zzc;
    }

    final AbstractC5232j zzb() {
        C5233k c5233k = new C5233k();
        this.zza.collectSignals(this.zzb, new zzfs(this, c5233k));
        return c5233k.a();
    }

    final AbstractC5232j zzc() {
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
