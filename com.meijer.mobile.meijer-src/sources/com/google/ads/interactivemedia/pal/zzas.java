package com.google.ads.interactivemedia.pal;

import Vd.AbstractC5516j;
import Vd.InterfaceC5509c;
import com.google.android.gms.internal.pal.R4;

/* loaded from: classes4.dex */
final class zzas implements InterfaceC5509c {
    final /* synthetic */ NonceManager zza;

    zzas(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // Vd.InterfaceC5509c
    public final /* bridge */ /* synthetic */ Object then(AbstractC5516j abstractC5516j) throws Exception {
        return ((R4) abstractC5516j.n()).c(this.zza.zzd, null, NonceManager.zza(this.zza));
    }
}
