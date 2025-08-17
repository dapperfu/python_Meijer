package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes4.dex */
public final class zzabp {
    private static final zzabk zza;

    static {
        zzabk zzabmVar;
        try {
            zzabmVar = new zzabo(null);
        } catch (ReflectiveOperationException unused) {
            zzabmVar = new zzabm(null);
        }
        zza = zzabmVar;
    }

    public static String zzf(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + zzc(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + zzm(e10);
        }
    }

    public static void zzi(AccessibleObject accessibleObject) throws zzvx, SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new zzvx("Failed making " + zze(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + zzm(e10), e10);
        }
    }

    static /* bridge */ /* synthetic */ RuntimeException zza(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException zzb(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String zzc(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        zzn(constructor, sb2);
        return sb2.toString();
    }

    public static String zze(AccessibleObject accessibleObject, boolean z10) {
        String strConcat;
        if (accessibleObject instanceof Field) {
            strConcat = "field '" + zzd((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            zzn(method, sb2);
            String string = sb2.toString();
            strConcat = "method '" + method.getDeclaringClass().getName() + "#" + string + "'";
        } else if (accessibleObject instanceof Constructor) {
            strConcat = "constructor '" + zzc((Constructor) accessibleObject) + "'";
        } else {
            strConcat = "<unknown AccessibleObject> ".concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z10 || !Character.isLowerCase(strConcat.charAt(0))) {
            return strConcat;
        }
        return Character.toUpperCase(strConcat.charAt(0)) + strConcat.substring(1);
    }

    public static Constructor zzg(Class cls) {
        return zza.zza(cls);
    }

    public static Method zzh(Class cls, Field field) {
        return zza.zzb(cls, field);
    }

    public static boolean zzk(Class cls) {
        return zza.zzc(cls);
    }

    public static String[] zzl(Class cls) {
        return zza.zzd(cls);
    }

    private static void zzn(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String zzd(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static boolean zzj(Class cls) {
        if (Modifier.isStatic(cls.getModifiers())) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    private static String zzm(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str));
        }
        return "";
    }
}
