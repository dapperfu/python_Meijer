package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class zzcr {
    private static final zzcr zza = new zzcr();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    public static zzcr zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        this.zzb.add(zzeVar);
    }

    public final void zze(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzeVar);
        this.zzc.remove(zzeVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzcz.zzb().zzg();
    }

    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzeVar);
        if (zZzg) {
            return;
        }
        zzcz.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }

    private zzcr() {
    }
}
