package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8233hf implements InterfaceC6624Cg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f74761a;

    C8233hf(SharedPreferencesOnSharedPreferenceChangeListenerC8445jf sharedPreferencesOnSharedPreferenceChangeListenerC8445jf, SharedPreferences sharedPreferences) {
        this.f74761a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6624Cg
    public final String a(String str, String str2) {
        return this.f74761a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6624Cg
    public final Double b(String str, double d10) {
        try {
            return Double.valueOf(this.f74761a.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f74761a.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6624Cg
    public final Long c(String str, long j10) {
        try {
            return Long.valueOf(this.f74761a.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f74761a.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6624Cg
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.f74761a.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f74761a.getString(str, String.valueOf(z10)));
        }
    }
}
