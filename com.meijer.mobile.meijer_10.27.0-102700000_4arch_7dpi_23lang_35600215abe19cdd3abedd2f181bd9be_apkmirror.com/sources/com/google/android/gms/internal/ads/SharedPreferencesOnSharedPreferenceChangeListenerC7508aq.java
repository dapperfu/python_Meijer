package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC7508aq implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f72554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7615bq f72555b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC7508aq(C7615bq c7615bq, String str) {
        this.f72555b = c7615bq;
        this.f72554a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f72555b) {
            try {
                for (C7410Zp c7410Zp : this.f72555b.f72876b) {
                    c7410Zp.f72251a.b(c7410Zp.f72252b, sharedPreferences, this.f72554a, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
