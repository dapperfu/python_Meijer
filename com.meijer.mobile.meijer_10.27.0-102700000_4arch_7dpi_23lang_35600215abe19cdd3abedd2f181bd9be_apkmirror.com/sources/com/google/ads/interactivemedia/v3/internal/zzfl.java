package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;

/* loaded from: classes4.dex */
public final class zzfl implements com.google.ads.interactivemedia.v3.impl.zzbh {
    private final Context zza;
    private boolean zzb = false;

    private zzfl(Context context, zzfm zzfmVar) {
        this.zza = context;
    }

    public static zzfl zzb(Context context) {
        return new zzfl(context, new zzfm());
    }

    public final boolean zzc() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.zzbh
    public final void zza(JavaScriptMessage javaScriptMessage) {
        boolean z10;
        JavaScriptMessage.MsgType msgType = JavaScriptMessage.MsgType.activate;
        int iOrdinal = javaScriptMessage.zzb().ordinal();
        if (iOrdinal == 53) {
            zzcj.zza(this.zza);
            z10 = true;
        } else if (iOrdinal != 54) {
            return;
        } else {
            z10 = false;
        }
        this.zzb = z10;
    }
}
