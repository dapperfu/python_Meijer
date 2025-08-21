package com.google.ads.interactivemedia.v3.internal;

import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class zzfk {
    public static void zza(String str) {
        if (zze(2)) {
            FS.log_e("IMASDK", str);
        }
    }

    public static void zzb(String str, Throwable th2) {
        if (zze(2)) {
            FS.log_e("IMASDK", str, th2);
        }
    }

    public static void zzc(String str) {
        if (zze(1)) {
            FS.log_i("IMASDK", str);
        }
    }

    public static void zzd(String str) {
        if (zze(2)) {
            FS.log_w("IMASDK", str);
        }
    }

    private static boolean zze(int i10) {
        return i10 + (-1) > 0;
    }
}
