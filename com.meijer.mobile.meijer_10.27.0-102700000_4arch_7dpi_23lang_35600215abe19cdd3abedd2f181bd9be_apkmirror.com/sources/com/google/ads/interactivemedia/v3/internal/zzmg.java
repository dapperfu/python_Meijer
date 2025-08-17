package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
final class zzmg implements zzmq {
    final /* synthetic */ SharedPreferences zza;

    zzmg(zzmh zzmhVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmq
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmq
    public final Long zzb(String str, long j10) {
        try {
            return Long.valueOf(this.zza.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j10));
        }
    }
}
