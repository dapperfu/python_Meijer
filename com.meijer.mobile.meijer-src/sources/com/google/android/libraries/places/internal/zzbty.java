package com.google.android.libraries.places.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbty implements zzbqm {
    private static final Logger zza = Logger.getLogger(zzbty.class.getName());
    private static final Constructor zzb;
    private static final Method zzc;
    private static final RuntimeException zzd;
    private static final Object[] zzf;
    private final Object zze;

    static boolean zzb() {
        return zzd == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    static {
        /*
            java.lang.Class<com.google.android.libraries.places.internal.zzbty> r0 = com.google.android.libraries.places.internal.zzbty.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.libraries.places.internal.zzbty.zza = r0
            r1 = 0
            java.lang.String r0 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "add"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L41
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "sum"
            r0.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()     // Catch: java.lang.Throwable -> L39
            int r3 = r0.length     // Catch: java.lang.Throwable -> L39
            r4 = 0
        L2a:
            if (r4 >= r3) goto L3b
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L39
            int r6 = r6.length     // Catch: java.lang.Throwable -> L39
            if (r6 != 0) goto L36
            goto L3c
        L36:
            int r4 = r4 + 1
            goto L2a
        L39:
            r0 = move-exception
            goto L3e
        L3b:
            r5 = r1
        L3c:
            r7 = r1
            goto L53
        L3e:
            r7 = r0
            r0 = r2
            goto L44
        L41:
            r0 = move-exception
            r7 = r0
            r0 = r1
        L44:
            java.util.logging.Logger r2 = com.google.android.libraries.places.internal.zzbty.zza
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r5 = "<clinit>"
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            java.lang.String r4 = "io.grpc.internal.ReflectionLongAdderCounter"
            r2.logp(r3, r4, r5, r6, r7)
            r2 = r0
            r5 = r1
        L53:
            if (r7 != 0) goto L5e
            if (r5 == 0) goto L5e
            com.google.android.libraries.places.internal.zzbty.zzb = r5
            com.google.android.libraries.places.internal.zzbty.zzc = r2
            com.google.android.libraries.places.internal.zzbty.zzd = r1
            goto L69
        L5e:
            com.google.android.libraries.places.internal.zzbty.zzb = r1
            com.google.android.libraries.places.internal.zzbty.zzc = r1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            com.google.android.libraries.places.internal.zzbty.zzd = r0
        L69:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.google.android.libraries.places.internal.zzbty.zzf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbty.<clinit>():void");
    }

    @Override // com.google.android.libraries.places.internal.zzbqm
    public final void zza(long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            zzc.invoke(this.zze, zzf);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    zzbty() {
        RuntimeException runtimeException = zzd;
        if (runtimeException == null) {
            try {
                this.zze = zzb.newInstance(null);
                return;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }
        throw runtimeException;
    }
}
