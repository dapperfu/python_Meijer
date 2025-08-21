package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Leg;
import com.google.android.libraries.places.api.model.RoutingSummary;
import j$.time.Duration;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class zzjq {
    zzjq() {
    }

    public static final RoutingSummary zza(zzaxq zzaxqVar) {
        ArrayList arrayList = new ArrayList();
        for (zzaxp zzaxpVar : zzaxqVar.zza()) {
            arrayList.add(Leg.newInstance(Duration.ofSeconds(zzaxpVar.zza().zzc(), r2.zze()), zzaxpVar.zzc()));
        }
        return RoutingSummary.newInstance(arrayList);
    }
}
