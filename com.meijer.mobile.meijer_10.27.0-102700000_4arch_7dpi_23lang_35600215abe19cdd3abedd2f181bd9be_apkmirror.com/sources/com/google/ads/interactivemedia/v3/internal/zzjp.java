package com.google.ads.interactivemedia.v3.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
final class zzjp extends BroadcastReceiver {
    final /* synthetic */ zzjq zza;

    zzjp(zzjq zzjqVar) {
        this.zza = zzjqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
