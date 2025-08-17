package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzro {
    Object[] zza;
    int zzb;
    zzrn zzc;

    public zzro() {
        this(4);
    }

    zzro(int i10) {
        this.zza = new Object[i10 + i10];
        this.zzb = 0;
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzrh.zza(length, i11));
        }
    }

    public final zzro zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzqt.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.zzb = i10 + 1;
        return this;
    }

    public final zzro zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzrp zzc() {
        zzrn zzrnVar = this.zzc;
        if (zzrnVar != null) {
            throw zzrnVar.zza();
        }
        zzsj zzsjVarZzl = zzsj.zzl(this.zzb, this.zza, this);
        zzrn zzrnVar2 = this.zzc;
        if (zzrnVar2 == null) {
            return zzsjVarZzl;
        }
        throw zzrnVar2.zza();
    }
}
