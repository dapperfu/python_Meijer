package com.google.android.libraries.places.internal;

import Td.AbstractC5223a;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class zzfz {
    private final zzmg zza;

    protected zzfz(zzmg zzmgVar) {
        this.zza = zzmgVar;
    }

    protected final zzmg zza() {
        return this.zza;
    }

    protected abstract Map zzc();

    protected abstract String zzd();

    protected final AbstractC5223a zzb() {
        return this.zza.getCancellationToken();
    }
}
