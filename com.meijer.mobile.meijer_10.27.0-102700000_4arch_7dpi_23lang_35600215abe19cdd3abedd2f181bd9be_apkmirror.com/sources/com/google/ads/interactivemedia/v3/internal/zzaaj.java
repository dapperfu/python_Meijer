package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.net.URL;

/* loaded from: classes4.dex */
final class zzaaj extends zzwj {
    zzaaj() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        URL url = (URL) obj;
        zzaceVar.zzl(url == null ? null : url.toExternalForm());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        if (!strZzh.equals(BuildConfig.TRAVIS)) {
            return new URL(strZzh);
        }
        return null;
    }
}
