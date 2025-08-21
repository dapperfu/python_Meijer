package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzqh {
    public static int zza(int i10, int i11, String str) {
        String strZzb;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzb = zzqm.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strZzb = zzqm.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzj(i10, i11, "index"));
        }
        return i10;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Executor was null.");
    }

    public static void zzd(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzqm.zzb(str, Character.valueOf(c10)));
        }
    }

    public static void zzg(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzqm.zzb(str, obj));
        }
    }

    public static void zzh(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzj(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzj(i11, i12, "end index") : zzqm.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void zzi(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzqm.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzqm.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
