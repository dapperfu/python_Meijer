package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzacc;
import com.google.ads.interactivemedia.v3.internal.zzace;
import com.google.ads.interactivemedia.v3.internal.zzwj;
import java.io.IOException;

/* loaded from: classes4.dex */
final class zzck extends zzwj {
    zzck() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public zzcl read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() != 9) {
            return new zzcl(zzaccVar.zzh());
        }
        zzaccVar.zzm();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public void write(zzace zzaceVar, zzcl zzclVar) throws IOException {
        if (zzclVar == null) {
            zzaceVar.zzg();
        } else {
            zzaceVar.zzl(zzclVar.getName());
        }
    }
}
