package com.google.android.libraries.places.internal;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbse extends zzbou {
    private static final ReferenceQueue zza = new ReferenceQueue();
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final Logger zzc = Logger.getLogger(zzbse.class.getName());
    private final zzbsd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbse(zzbif zzbifVar) {
        super(zzbifVar);
        ReferenceQueue referenceQueue = zza;
        ConcurrentMap concurrentMap = zzb;
        this.zzd = new zzbsd(this, zzbifVar, referenceQueue, concurrentMap);
    }

    @Override // com.google.android.libraries.places.internal.zzbou, com.google.android.libraries.places.internal.zzbif
    public final zzbif zzd() {
        this.zzd.zzb();
        return super.zzd();
    }
}
