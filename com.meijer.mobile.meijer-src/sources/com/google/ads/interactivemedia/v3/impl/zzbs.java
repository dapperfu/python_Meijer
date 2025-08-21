package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;
import com.google.ads.interactivemedia.v3.internal.zzfk;
import com.google.ads.interactivemedia.v3.internal.zzuk;
import com.google.ads.interactivemedia.v3.internal.zzuv;
import com.google.ads.interactivemedia.v3.internal.zzvb;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
final class zzbs {
    private final zzbq zza;
    private final zzbi zzb;
    private final zzuv zzc;

    final /* synthetic */ com.google.ads.interactivemedia.v3.impl.data.zzbz zzb(com.google.ads.interactivemedia.v3.impl.data.zzby zzbyVar) throws Exception {
        return this.zza.zza(zzbyVar);
    }

    final void zzc(JavaScriptMessage.MsgType msgType, String str, final com.google.ads.interactivemedia.v3.impl.data.zzby zzbyVar) {
        JavaScriptMessage.MsgType msgType2 = JavaScriptMessage.MsgType.activate;
        if (msgType.ordinal() != 35) {
            zzfk.zzc("Unexpected network request of type".concat(String.valueOf(msgType)));
        } else {
            zzuk.zze(this.zzc.zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.impl.zzbm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb(zzbyVar);
                }
            }), new zzbn(this, str), this.zzc);
        }
    }

    zzbs(Context context, zzbi zzbiVar, ExecutorService executorService, zzbq zzbqVar) {
        this.zzc = zzvb.zza(executorService);
        this.zza = zzbqVar;
        this.zzb = zzbiVar;
    }
}
