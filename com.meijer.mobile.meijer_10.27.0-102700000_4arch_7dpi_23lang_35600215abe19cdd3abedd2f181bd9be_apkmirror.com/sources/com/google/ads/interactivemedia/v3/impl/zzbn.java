package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzug;

/* loaded from: classes4.dex */
final class zzbn implements zzug {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbs zzb;

    zzbn(zzbs zzbsVar, String str) {
        this.zza = str;
        this.zzb = zzbsVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzug
    public final void zza(Throwable th2) {
        zzfk.zzb("Failure to make Native-layer network request", th2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzug
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzb.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.nativeXhr, JavaScriptMessage.MsgType.nativeResponse, this.zza, (com.google.ads.interactivemedia.v3.impl.data.zzbz) obj));
    }
}
