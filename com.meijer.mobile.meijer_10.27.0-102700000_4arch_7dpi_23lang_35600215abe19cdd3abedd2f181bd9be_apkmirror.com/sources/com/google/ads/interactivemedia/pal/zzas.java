package com.google.ads.interactivemedia.pal;

import Td.AbstractC5232j;
import Td.InterfaceC5225c;
import com.google.android.gms.internal.pal.R4;

/* loaded from: classes4.dex */
final class zzas implements InterfaceC5225c {
    final /* synthetic */ NonceManager zza;

    zzas(NonceManager nonceManager) {
        this.zza = nonceManager;
    }

    @Override // Td.InterfaceC5225c
    public final /* bridge */ /* synthetic */ Object then(AbstractC5232j abstractC5232j) throws Exception {
        return ((R4) abstractC5232j.n()).c(this.zza.zzd, null, NonceManager.zza(this.zza));
    }
}
