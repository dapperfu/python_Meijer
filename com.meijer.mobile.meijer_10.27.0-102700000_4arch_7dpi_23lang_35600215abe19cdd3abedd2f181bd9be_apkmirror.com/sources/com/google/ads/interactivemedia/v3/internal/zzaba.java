package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaba extends zzwj {
    zzaba() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        zzaceVar.zzl(bool == null ? BuildConfig.TRAVIS : bool.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        return Boolean.valueOf(zzaccVar.zzh());
    }
}
