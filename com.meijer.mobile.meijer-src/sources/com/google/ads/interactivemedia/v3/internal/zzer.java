package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
final class zzer implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzet zza;

    zzer(zzet zzetVar) {
        this.zza = zzetVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzet zzetVar = this.zza;
        zzetVar.zzd = zzetVar.zzf();
    }
}
