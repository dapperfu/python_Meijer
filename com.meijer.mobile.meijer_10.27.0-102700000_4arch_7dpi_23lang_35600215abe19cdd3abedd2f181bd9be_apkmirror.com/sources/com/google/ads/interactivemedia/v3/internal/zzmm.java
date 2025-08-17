package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzmm {
    public static final zzml zza;
    public static final zzml zzb;

    static {
        zzml.zzb("gads:always_enable_crash_loop_counter:enabled", false);
        zzml.zzb("gads:crash_loop_stats_signal:enabled", false);
        zzml.zzb("gads:crash_without_flag_write_count:enabled", false);
        zza = zzml.zza("gads:crash_without_write_reset:count", -1L);
        zzml.zzb("gads:init_without_flag_write_count:enabled", false);
        zzb = zzml.zza("gads:init_without_write_reset:count", -1L);
        zzml.zzb("gads:reset_app_settings:enabled", false);
        zzml.zzb("gads:reset_counts_on_failure_service:enabled", false);
        zzml.zzb("gads:reset_counts_on_local_flag_save:enabled", false);
        zzml.zzb("gads:reset_counts_on_successful_service:enabled", false);
    }
}
