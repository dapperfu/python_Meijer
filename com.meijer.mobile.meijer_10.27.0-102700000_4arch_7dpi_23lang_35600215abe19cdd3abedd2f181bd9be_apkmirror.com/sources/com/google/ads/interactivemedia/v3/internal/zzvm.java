package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzvm extends zzwj {
    zzvm(zzvr zzvrVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            zzaceVar.zzg();
            return;
        }
        double dDoubleValue = number.doubleValue();
        zzvr.zzg(dDoubleValue);
        zzaceVar.zzh(dDoubleValue);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        return Double.valueOf(zzaccVar.zza());
    }
}
