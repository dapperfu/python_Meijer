package com.google.ads.interactivemedia.v3.internal;

import Td.C5233k;
import android.graphics.Bitmap;

/* loaded from: classes4.dex */
final class zzfb implements zzug {
    final /* synthetic */ C5233k zza;
    final /* synthetic */ String zzb;

    zzfb(zzfc zzfcVar, C5233k c5233k, String str) {
        this.zza = c5233k;
        this.zzb = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzug
    public final void zza(Throwable th2) {
        this.zza.b(new Exception("Failed to load image from: ".concat(String.valueOf(this.zzb)), th2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzug
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.e((Bitmap) obj);
    }
}
