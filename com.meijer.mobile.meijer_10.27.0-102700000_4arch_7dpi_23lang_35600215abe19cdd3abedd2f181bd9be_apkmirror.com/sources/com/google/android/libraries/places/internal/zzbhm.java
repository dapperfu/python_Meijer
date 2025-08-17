package com.google.android.libraries.places.internal;

import Be.p;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbhm {
    private List zza;
    private final zzbez zzb = zzbez.zza;
    private Object[][] zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final zzbhm zza(zzbhn zzbhnVar, Object obj) {
        p.r(zzbhnVar, "key");
        p.r(obj, "value");
        int length = 0;
        while (true) {
            Object[][] objArr = this.zzc;
            if (length >= objArr.length) {
                length = -1;
                break;
            }
            if (zzbhnVar.equals(objArr[length][0])) {
                break;
            }
            length++;
        }
        if (length == -1) {
            Object[][] objArr2 = this.zzc;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.zzc = objArr3;
            length = objArr3.length - 1;
        }
        this.zzc[length] = new Object[]{zzbhnVar, obj};
        return this;
    }

    public final zzbho zzc() {
        return new zzbho(this.zza, this.zzb, this.zzc, null);
    }

    zzbhm() {
    }

    public final zzbhm zzb(List list) {
        p.e(!list.isEmpty(), "addrs is empty");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }
}
