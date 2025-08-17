package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes4.dex */
final class zzaak extends zzwj {
    zzaak() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        zzaceVar.zzl(uri == null ? null : uri.toASCIIString());
    }

    public static final URI zza(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        try {
            String strZzh = zzaccVar.zzh();
            if (strZzh.equals(BuildConfig.TRAVIS)) {
                return null;
            }
            return new URI(strZzh);
        } catch (URISyntaxException e10) {
            throw new zzvx(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        return zza(zzaccVar);
    }
}
