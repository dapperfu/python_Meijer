package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzcba {
    public static final /* synthetic */ int zza = 0;

    private zzcba() {
    }

    public static zzcbb zza(String str) {
        return zzcay.zza;
    }

    public static zzcaz zzb() {
        return zzcay.zzb;
    }

    static {
        Object obj;
        Class<?> cls;
        zzcay zzcayVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th2) {
            obj = th2;
            cls = null;
        }
        if (cls != null) {
            try {
                zzcayVar = (zzcay) cls.asSubclass(zzcay.class).getConstructor(zzcbb.class).newInstance(zzcay.zza);
            } catch (Throwable th3) {
                obj = th3;
            }
        } else {
            zzcayVar = null;
        }
        if (zzcayVar == null) {
            new zzcay(zzcay.zza);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, zzcba.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
