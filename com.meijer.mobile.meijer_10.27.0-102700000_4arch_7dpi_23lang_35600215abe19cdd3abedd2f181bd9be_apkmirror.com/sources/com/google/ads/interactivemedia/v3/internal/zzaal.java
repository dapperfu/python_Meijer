package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.net.InetAddress;

/* loaded from: classes4.dex */
final class zzaal extends zzwj {
    zzaal() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        zzaceVar.zzl(inetAddress == null ? null : inetAddress.getHostAddress());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        return InetAddress.getByName(zzaccVar.zzh());
    }
}
