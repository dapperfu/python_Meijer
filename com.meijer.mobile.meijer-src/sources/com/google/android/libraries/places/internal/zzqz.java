package com.google.android.libraries.places.internal;

import android.os.Trace;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes6.dex */
final class zzqz {
    static void zza(zzra zzraVar) {
        zzc(zzraVar);
        Trace.beginSection(zzraVar.zzd());
        String strZze = zzraVar.zze();
        int i10 = zzqj.zzb;
        if (strZze.length() > 127) {
            strZze = strZze.substring(0, l3.f93324d);
        }
        Trace.beginSection(strZze);
    }

    static void zzb(zzra zzraVar) {
        zzc(zzraVar);
        Trace.endSection();
        Trace.endSection();
    }

    private static boolean zzc(zzra zzraVar) {
        if (zzraVar.zza() != Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
