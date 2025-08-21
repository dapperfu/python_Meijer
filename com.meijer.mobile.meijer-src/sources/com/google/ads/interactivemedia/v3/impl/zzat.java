package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.internal.zzfd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzat {
    private final List zza;
    private final zzfd zzb;

    public zzat() {
        this.zza = Collections.synchronizedList(new ArrayList(1));
        this.zzb = null;
    }

    public final String toString() {
        return "ErrorListenerSupport [errorListeners=" + String.valueOf(this.zza) + "]";
    }

    public final void zza(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zza.add(adErrorListener);
    }

    public final void zzb() {
        this.zza.clear();
    }

    public final void zzc(AdErrorEvent adErrorEvent) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((AdErrorEvent.AdErrorListener) it.next()).onAdError(adErrorEvent);
        }
        zzfd zzfdVar = this.zzb;
        if (zzfdVar != null) {
            zzfdVar.zzf(adErrorEvent);
        }
    }

    public final void zzd(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zza.remove(adErrorListener);
    }

    public zzat(zzfd zzfdVar) {
        this.zza = Collections.synchronizedList(new ArrayList(1));
        this.zzb = zzfdVar;
    }
}
