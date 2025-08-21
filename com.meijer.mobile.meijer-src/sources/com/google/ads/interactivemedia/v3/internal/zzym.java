package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
final class zzym implements zzwk {
    zzym() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Type genericComponentType;
        Type typeZzd = zzacaVar.zzd();
        if (!(typeZzd instanceof GenericArrayType)) {
            if (typeZzd instanceof Class) {
                Class cls = (Class) typeZzd;
                if (cls.isArray()) {
                    genericComponentType = cls.getComponentType();
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else {
            genericComponentType = ((GenericArrayType) typeZzd).getGenericComponentType();
        }
        return new zzyn(zzvrVar, zzvrVar.zza(zzaca.zzb(genericComponentType)), zzwr.zza(genericComponentType));
    }
}
