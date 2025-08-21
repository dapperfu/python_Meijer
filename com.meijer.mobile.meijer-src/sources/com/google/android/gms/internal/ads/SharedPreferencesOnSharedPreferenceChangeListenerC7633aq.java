package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC7633aq implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f73394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7740bq f73395b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC7633aq(C7740bq c7740bq, String str) {
        this.f73395b = c7740bq;
        this.f73394a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f73395b) {
            try {
                for (C7535Zp c7535Zp : this.f73395b.f73716b) {
                    c7535Zp.f73091a.b(c7535Zp.f73092b, sharedPreferences, this.f73394a, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
