package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzzp extends zzzl {
    static final Map zza;
    private final Constructor zzb;
    private final Object[] zzc;
    private final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        zza = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzl
    final /* bridge */ /* synthetic */ Object zza() {
        return (Object[]) this.zzc.clone();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzl
    final /* bridge */ /* synthetic */ void zzc(Object obj, zzacc zzaccVar, zzzm zzzmVar) throws IllegalAccessException, zzwa, IOException {
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) this.zzd.get(zzzmVar.zzi);
        if (num != null) {
            zzzmVar.zza(zzaccVar, num.intValue(), objArr);
            return;
        }
        Constructor constructor = this.zzb;
        String str = zzzmVar.zzi;
        throw new IllegalStateException("Could not find the index in the constructor '" + zzabp.zzc(constructor) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.zzzl
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Object zzb(Object[] objArr) {
        try {
            return this.zzb.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            throw zzabp.zzb(e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + zzabp.zzc(this.zzb) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + zzabp.zzc(this.zzb) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + zzabp.zzc(this.zzb) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    zzzp(Class cls, zzzo zzzoVar, boolean z10) throws zzvx, SecurityException {
        super(zzzoVar);
        this.zzd = new HashMap();
        Constructor constructorZzg = zzabp.zzg(cls);
        this.zzb = constructorZzg;
        if (z10) {
            zzzq.zzb(null, constructorZzg);
        } else {
            zzabp.zzi(constructorZzg);
        }
        String[] strArrZzl = zzabp.zzl(cls);
        for (int i10 = 0; i10 < strArrZzl.length; i10++) {
            this.zzd.put(strArrZzl[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.zzb.getParameterTypes();
        this.zzc = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.zzc[i11] = zza.get(parameterTypes[i11]);
        }
    }
}
