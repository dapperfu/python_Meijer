package com.google.android.libraries.places.internal;

import Ee.O;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class zzqj {
    static final zzpx zza;
    public static final /* synthetic */ int zzb = 0;
    private static final AtomicReference zzc;
    private static final WeakHashMap zzd;
    private static final zzqm zze;

    @TargetApi(29)
    final class zza {
        public static boolean zza() {
            return Trace.isEnabled();
        }
    }

    static {
        O.D("androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        zzc = new AtomicReference(O.x());
        zza = new zzpx("tiktok_systrace");
        zzd = new WeakHashMap();
        zze = new zzqm();
        new ArrayDeque();
        new ArrayDeque();
    }

    static O zza() {
        return (O) zzc.get();
    }

    public static zzra zzc(zzqy zzqyVar, zzra zzraVar) {
        zzra zzraVar2;
        zzrj zzrjVar = zzqyVar.zzc;
        zzra zzraVar3 = zzqyVar.zzb;
        if (zzraVar3 != zzraVar) {
            if (zzraVar3 == null) {
                zzqyVar.zza = Build.VERSION.SDK_INT >= 29 ? zza.zza() : zzpz.zza(zza);
            }
            if (zzqyVar.zza) {
                if (zzraVar3 != null) {
                    zzraVar2 = zzraVar != null ? zzraVar : null;
                    zzqz.zzb(zzraVar3);
                } else {
                    zzraVar2 = zzraVar;
                }
                if (zzraVar2 != null) {
                    zzqz.zza(zzraVar2);
                }
            }
            if (zzraVar3 != zzraVar) {
                if (zzraVar == null) {
                    zzraVar = null;
                }
                zzqyVar.zzb = zzraVar;
                return zzraVar3;
            }
        }
        return zzraVar;
    }

    public static zzqy zzd() {
        return (zzqy) zze.get();
    }

    static zzra zzb(boolean z10) {
        zzqy zzqyVarZzd = zzd();
        zzra zzraVar = zzqyVarZzd.zzb;
        if (zzraVar != null && zzraVar != zzqq.zza) {
            return zzraVar;
        }
        return zzqp.zzh(zzqyVarZzd);
    }

    public static boolean zze() {
        zzra zzraVar = zzd().zzb;
        if (zzraVar != null && zzraVar != zzqq.zza) {
            return true;
        }
        return false;
    }
}
