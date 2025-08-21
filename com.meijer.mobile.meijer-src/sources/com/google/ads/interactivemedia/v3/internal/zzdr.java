package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzdr {
    private final zzcu zza;
    private final ArrayList zzb;

    public final zzcu zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        this.zzb.add(str);
    }

    public zzdr(zzcu zzcuVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzcuVar;
        arrayList.add(str);
    }
}
