package com.google.android.libraries.places.internal;

import com.google.common.annotations.GoogleInternal;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes6.dex */
public abstract class zzsw {

    @GoogleInternal
    private static String zza = "com.google.android.libraries.places.internal.zzta";

    @GoogleInternal
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.libraries.places.internal.zzta", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    protected abstract zzsv zzc();

    protected abstract zzsh zze(String str);

    protected abstract String zzn();

    protected long zzl() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public static int zza() {
        return zzty.zza();
    }

    public static zzsv zzb() {
        return zzsu.zza.zzc();
    }

    public static zzsh zzd(String str) {
        return zzsu.zza.zze(str);
    }

    public static zztj zzf() {
        return zzsu.zza.zzg();
    }

    public static boolean zzh(String str, Level level, boolean z10) {
        zzf().zzb(str, level, z10);
        return false;
    }

    public static zztu zzi() {
        return zzf().zzc();
    }

    public static zzsj zzj() {
        return zzf().zzd();
    }

    public static long zzk() {
        return zzsu.zza.zzl();
    }

    public static String zzm() {
        return zzsu.zza.zzn();
    }

    protected zztj zzg() {
        return zztj.zze();
    }
}
