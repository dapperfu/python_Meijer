package com.google.ads.interactivemedia.v3.internal;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class zzqo {
    private static final Object zza;

    private static Object zzb() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzc(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzd(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Method methodZzc = zzc("getStackTraceDepth", Throwable.class);
            if (methodZzc == null) {
                return null;
            }
            methodZzc.invoke(obj, new Throwable());
            return methodZzc;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String zza(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    static {
        Object objZzb = zzb();
        zza = objZzb;
        if (objZzb != null) {
            zzc("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objZzb == null) {
            return;
        }
        zzd(objZzb);
    }
}
