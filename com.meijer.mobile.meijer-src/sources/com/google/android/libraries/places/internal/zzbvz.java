package com.google.android.libraries.places.internal;

import De.C;
import com.google.common.base.VerifyException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class zzbvz {
    private zzbvz() {
    }

    static Set zza(Map map) {
        Set setZzc = zzc(map, "retryableStatusCodes");
        C.a(setZzc != null, "%s is required in retry policy", "retryableStatusCodes");
        C.a(true ^ setZzc.contains(zzbjs.OK), "%s must not contain OK", "retryableStatusCodes");
        return setZzc;
    }

    static Set zzb(Map map) {
        Set setZzc = zzc(map, "nonFatalStatusCodes");
        if (setZzc == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(zzbjs.class));
        }
        C.a(!setZzc.contains(zzbjs.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setZzc;
    }

    private static Set zzc(Map map, String str) {
        zzbjs zzbjsVarZzg;
        boolean z10;
        List listZza = zzbqj.zza(map, str);
        if (listZza == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(zzbjs.class);
        for (Object obj : listZza) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                boolean z11 = false;
                if (iIntValue == d10.doubleValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C.a(z10, "Status code %s is not integral", obj);
                zzbjsVarZzg = zzbjv.zza(iIntValue).zzg();
                if (zzbjsVarZzg.zza() == d10.intValue()) {
                    z11 = true;
                }
                C.a(z11, "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    zzbjs zzbjsVar = zzbjs.OK;
                    zzbjsVarZzg = (zzbjs) Enum.valueOf(zzbjs.class, (String) obj);
                } catch (IllegalArgumentException e10) {
                    String strValueOf = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                    sb2.append("Status code ");
                    sb2.append(strValueOf);
                    sb2.append(" is not valid");
                    throw new VerifyException(sb2.toString(), e10);
                }
            } else {
                String strValueOf2 = String.valueOf(obj);
                String strValueOf3 = String.valueOf(obj.getClass());
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 65 + strValueOf3.length());
                sb3.append("Can not convert status code ");
                sb3.append(strValueOf2);
                sb3.append(" to Status.Code, because its type is ");
                sb3.append(strValueOf3);
                throw new VerifyException(sb3.toString());
            }
            enumSetNoneOf.add(zzbjsVarZzg);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }
}
