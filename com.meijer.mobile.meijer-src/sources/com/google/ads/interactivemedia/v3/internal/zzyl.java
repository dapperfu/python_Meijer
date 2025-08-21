package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class zzyl {
    public static final zzyl zzc;

    public abstract Object zza(Class cls) throws Exception;

    static {
        zzyl zzykVar;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    zzykVar = new zzyh(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    zzykVar = new zzyk();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                zzykVar = new zzyj(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            zzykVar = new zzyi(declaredMethod3, iIntValue);
        }
        zzc = zzykVar;
    }

    static /* bridge */ /* synthetic */ void zzb(Class cls) {
        String strZzb = zzxl.zzb(cls);
        if (strZzb == null) {
        } else {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strZzb));
        }
    }
}
