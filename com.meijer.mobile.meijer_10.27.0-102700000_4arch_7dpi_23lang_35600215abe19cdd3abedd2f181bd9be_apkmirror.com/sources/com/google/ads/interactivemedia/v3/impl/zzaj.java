package com.google.ads.interactivemedia.v3.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzaj implements zzbh {
    final /* synthetic */ zzak zza;

    zzaj(zzak zzakVar) {
        this.zza = zzakVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        com.google.ads.interactivemedia.v3.impl.data.zzbu zzbuVar = (com.google.ads.interactivemedia.v3.impl.data.zzbu) javaScriptMessage.zzc();
        ArrayList arrayList = new ArrayList();
        com.google.ads.interactivemedia.v3.impl.data.zzbm zzbmVar = zzbuVar.iconsView;
        if (zzbmVar != null && zzbmVar.icons() != null) {
            Iterator<com.google.ads.interactivemedia.v3.impl.data.zzbl> it = zzbuVar.iconsView.icons().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        zzak zzakVar = this.zza;
        zzakVar.zzo(new com.google.ads.interactivemedia.v3.impl.data.zze(zzakVar.zza, arrayList, zzakVar.zzb));
    }
}
