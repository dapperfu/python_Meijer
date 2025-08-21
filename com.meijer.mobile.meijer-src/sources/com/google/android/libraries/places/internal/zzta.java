package com.google.android.libraries.places.internal;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes6.dex */
public final class zzta extends zzsw {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzsv zzc;

    @Override // com.google.android.libraries.places.internal.zzsw
    protected zzsv zzc() {
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected String zzn() {
        return "platform: Android";
    }

    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzta.zzp();
        }
    }

    static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z10 = true;
        if (str != null && !"robolectric".equals(str)) {
            z10 = false;
        }
        zzb = z10;
        zzc = new zzsv() { // from class: com.google.android.libraries.places.internal.zzta.1
            @Override // com.google.android.libraries.places.internal.zzsv
            public zzsc zzb(Class<?> cls, int i10) {
                return zzsc.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzsv
            public String zza(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzta.zza) {
                    try {
                        if (cls.equals(zzta.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (zzta.zzb && (stackTraceElementZza = zztv.zza(cls, 1)) != null) {
                    return stackTraceElementZza.getClassName();
                }
                return null;
            }
        };
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected zzsh zze(String str) {
        return zzte.zzb(str);
    }

    @Override // com.google.android.libraries.places.internal.zzsw
    protected zztj zzg() {
        return zztf.zza();
    }
}
