package com.google.ads.interactivemedia.v3.internal;

import Td.C5233k;
import android.os.Bundle;

/* loaded from: classes4.dex */
final class zznk extends zzmw {
    final /* synthetic */ C5233k zza;

    zznk(zznm zznmVar, C5233k c5233k) {
        this.zza = c5233k;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmx
    public final void zzb(int i10) {
        this.zza.d(new zzng(i10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmx
    public final void zzc(Bundle bundle) {
        this.zza.e(bundle.getString("newToken"));
    }
}
