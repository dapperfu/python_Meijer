package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbho {
    private final List zza;
    private final zzbez zzb;
    private final Object[][] zzc;

    public final List zza() {
        return this.zza;
    }

    public final zzbez zzb() {
        return this.zzb;
    }

    public static zzbhm zzd() {
        return new zzbhm();
    }

    public final Object zzc(zzbhn zzbhnVar) {
        p.r(zzbhnVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.zzc;
            if (i10 >= objArr.length) {
                return zzbhnVar.zzc();
            }
            if (zzbhnVar.equals(objArr[i10][0])) {
                return objArr[i10][1];
            }
            i10++;
        }
    }

    /* synthetic */ zzbho(List list, zzbez zzbezVar, Object[][] objArr, byte[] bArr) {
        this.zza = (List) p.r(list, "addresses are not set");
        this.zzb = (zzbez) p.r(zzbezVar, "attrs");
        this.zzc = (Object[][]) p.r(objArr, "customOptions");
    }

    public final String toString() {
        return j.c(this).d("addrs", this.zza).d("attrs", this.zzb).d("customOptions", Arrays.deepToString(this.zzc)).toString();
    }
}
