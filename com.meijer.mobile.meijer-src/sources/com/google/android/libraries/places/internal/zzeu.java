package com.google.android.libraries.places.internal;

import com.fullstory.FS;
import com.google.common.util.concurrent.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzeu implements j {
    final /* synthetic */ zzev zza;

    zzeu(zzev zzevVar) {
        this.zza = zzevVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        FS.log_w("ZBCC", "Failed to get session", throwable);
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        zzbdr response = (zzbdr) obj;
        Intrinsics.j(response, "response");
        String strZzc = response.zzc();
        Intrinsics.i(strZzc, "getValidatedNidCookie(...)");
        if (strZzc.length() > 0) {
            zzeo zzeoVar = this.zza.zzc;
            String strZzc2 = response.zzc();
            Intrinsics.i(strZzc2, "getValidatedNidCookie(...)");
            zzeoVar.zzb(strZzc2);
        }
    }
}
