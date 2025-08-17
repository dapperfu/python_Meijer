package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzabg extends zzwj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        zzaceVar.zzl(r32 == null ? null : (String) this.zzc.get(r32));
    }

    public zzabg(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            ArrayList arrayList = new ArrayList(declaredFields.length);
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    arrayList.add(field);
                }
            }
            Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                zzwm zzwmVar = (zzwm) field2.getAnnotation(zzwm.class);
                if (zzwmVar != null) {
                    strName = zzwmVar.zza();
                    for (String str : zzwmVar.zzb()) {
                        this.zza.put(str, r42);
                    }
                }
                this.zza.put(strName, r42);
                this.zzb.put(string, r42);
                this.zzc.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        Enum r02 = (Enum) this.zza.get(strZzh);
        if (r02 != null) {
            return r02;
        }
        return (Enum) this.zzb.get(strZzh);
    }
}
