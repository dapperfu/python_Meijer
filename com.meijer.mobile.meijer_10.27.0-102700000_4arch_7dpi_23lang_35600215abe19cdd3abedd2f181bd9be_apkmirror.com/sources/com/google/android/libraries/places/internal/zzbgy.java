package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbgy {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzbgy.class.getName());
    private static final zzbgy zzc = new zzbgy();
    private final ConcurrentNavigableMap zzd;
    private final ConcurrentMap zze;
    private final ConcurrentMap zzf;

    public static zzbgy zza() {
        return zzc;
    }

    public final void zzb(zzbhe zzbheVar) {
        zzi(this.zze, zzbheVar);
    }

    public final void zzc(zzbhe zzbheVar) {
        zzi(this.zzd, zzbheVar);
    }

    public final void zzd(zzbhe zzbheVar) {
        zzi(this.zzf, zzbheVar);
    }

    public final void zze(zzbhe zzbheVar) {
        zzj(this.zze, zzbheVar);
    }

    public final void zzf(zzbhe zzbheVar) {
        zzj(this.zzd, zzbheVar);
    }

    public final void zzg(zzbhe zzbheVar) {
        zzj(this.zzf, zzbheVar);
    }

    public zzbgy() {
        new ConcurrentSkipListMap();
        this.zzd = new ConcurrentSkipListMap();
        this.zze = new ConcurrentHashMap();
        this.zzf = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    private static void zzi(Map map, zzbhe zzbheVar) {
    }

    private static void zzj(Map map, zzbhe zzbheVar) {
    }
}
