package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final class zzahr {
    private static final ThreadLocal zza = new ThreadLocal();
    private int zzb = 17;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzahr) && this.zzb == ((zzahr) obj).zzb;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final zzahr zzc(long j10) {
        this.zzb = (this.zzb * 37) + ((int) (j10 ^ (j10 >> 32)));
        return this;
    }

    public static int zza(Object obj, String... strArr) {
        Objects.requireNonNull(obj, "object");
        zzahr zzahrVar = new zzahr();
        Class<?> superclass = obj.getClass();
        zze(obj, superclass, zzahrVar, false, strArr);
        while (superclass.getSuperclass() != null) {
            superclass = superclass.getSuperclass();
            zze(obj, superclass, zzahrVar, false, strArr);
        }
        return zzahrVar.zzb;
    }

    static Set zzb() {
        return (Set) zza.get();
    }

    public final zzahr zzd(Object obj) {
        if (obj == null) {
            this.zzb *= 37;
            return this;
        }
        if (!zzahm.zza(obj)) {
            this.zzb = (this.zzb * 37) + obj.hashCode();
            return this;
        }
        int i10 = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            while (i10 < length) {
                zzc(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length2 = iArr.length;
            while (i10 < length2) {
                this.zzb = (this.zzb * 37) + iArr[i10];
                i10++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            while (i10 < length3) {
                this.zzb = (this.zzb * 37) + sArr[i10];
                i10++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i10 < length4) {
                this.zzb = (this.zzb * 37) + cArr[i10];
                i10++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i10 < length5) {
                this.zzb = (this.zzb * 37) + bArr[i10];
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i10 < length6) {
                zzc(Double.doubleToLongBits(dArr[i10]));
                i10++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length7 = fArr.length;
            while (i10 < length7) {
                this.zzb = (this.zzb * 37) + Float.floatToIntBits(fArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length8 = zArr.length;
            while (i10 < length8) {
                this.zzb = (this.zzb * 37) + (!zArr[i10] ? 1 : 0);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length9 = objArr.length;
            while (i10 < length9) {
                zzd(objArr[i10]);
                i10++;
            }
        }
        return this;
    }

    private static void zze(Object obj, Class cls, zzahr zzahrVar, boolean z10, String[] strArr) {
        Set setZzb = zzb();
        if (setZzb != null && setZzb.contains(new zzaht(obj))) {
            return;
        }
        try {
            Set setZzb2 = zzb();
            if (setZzb2 == null) {
                setZzb2 = new HashSet();
                zza.set(setZzb2);
            }
            setZzb2.add(new zzaht(obj));
            Field[] declaredFields = cls.getDeclaredFields();
            Arrays.sort(declaredFields, Comparator.comparing(new Function() { // from class: com.google.ads.interactivemedia.v3.internal.zzahq
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ((Field) obj2).getName();
                }
            }));
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!zzahl.zza(strArr, field.getName()) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(zzahs.class)) {
                    zzahrVar.zzd(zzahu.zza(field, obj));
                }
            }
            zzf(obj);
        } catch (Throwable th2) {
            zzf(obj);
            throw th2;
        }
    }

    private static void zzf(Object obj) {
        Set setZzb = zzb();
        if (setZzb != null) {
            setZzb.remove(new zzaht(obj));
            if (setZzb.isEmpty()) {
                zza.remove();
            }
        }
    }
}
