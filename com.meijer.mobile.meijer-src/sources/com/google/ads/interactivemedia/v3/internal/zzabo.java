package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class zzabo extends zzabk {
    private final Method zza;
    private final Method zzb;
    private final Method zzc;
    private final Method zzd;

    private zzabo() throws NoSuchMethodException, ClassNotFoundException {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        this.zzb = Class.class.getMethod("getRecordComponents", null);
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.zzc = cls.getMethod("getName", null);
        this.zzd = cls.getMethod("getType", null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzabk
    public final Constructor zza(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.zzd.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw zzabp.zza(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzabk
    final boolean zzc(Class cls) {
        try {
            return ((Boolean) this.zza.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw zzabp.zza(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzabk
    final String[] zzd(Class cls) {
        try {
            Object[] objArr = (Object[]) this.zzb.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.zzc.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw zzabp.zza(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzabk
    public final Method zzb(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw zzabp.zza(e10);
        }
    }

    /* synthetic */ zzabo(zzabn zzabnVar) throws ClassNotFoundException {
        super(null);
        this.zza = Class.class.getMethod("isRecord", null);
        this.zzb = Class.class.getMethod("getRecordComponents", null);
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.zzc = cls.getMethod("getName", null);
        this.zzd = cls.getMethod("getType", null);
    }
}
