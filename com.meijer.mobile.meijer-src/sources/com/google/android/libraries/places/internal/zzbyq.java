package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class zzbyq {
    private final Class zza;
    private final String zzb;
    private final Class[] zzc;

    public zzbyq(Class cls, String str, Class... clsArr) {
        this.zza = cls;
        this.zzb = str;
        this.zzc = clsArr;
    }

    private static Method zze(Class cls, String str, Class[] clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return zze(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    private final Method zzd(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2;
        Method methodZze = zze(cls, this.zzb, this.zzc);
        if (methodZze == null || (cls2 = this.zza) == null || cls2.isAssignableFrom(methodZze.getReturnType())) {
            return methodZze;
        }
        return null;
    }

    public final Object zzc(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodZzd = zzd(obj.getClass());
            if (methodZzd != null) {
                try {
                    return methodZzd.invoke(obj, objArr);
                } catch (IllegalAccessException e10) {
                    AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(methodZzd.toString()));
                    assertionError.initCause(e10);
                    throw assertionError;
                }
            }
            String str = this.zzb;
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 33 + strValueOf.length());
            sb2.append("Method ");
            sb2.append(str);
            sb2.append(" not supported for object ");
            sb2.append(strValueOf);
            throw new AssertionError(sb2.toString());
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean zza(Object obj) {
        if (zzd(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    public final Object zzb(Object obj, Object... objArr) throws NoSuchMethodException, SecurityException {
        try {
            Method methodZzd = zzd(obj.getClass());
            if (methodZzd == null) {
                return null;
            }
            try {
                return methodZzd.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
                return null;
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
