package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8358hf implements InterfaceC6749Cg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferences f75601a;

    C8358hf(SharedPreferencesOnSharedPreferenceChangeListenerC8570jf sharedPreferencesOnSharedPreferenceChangeListenerC8570jf, SharedPreferences sharedPreferences) {
        this.f75601a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6749Cg
    public final String a(String str, String str2) {
        return this.f75601a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6749Cg
    public final Double b(String str, double d10) {
        try {
            return Double.valueOf(this.f75601a.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f75601a.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6749Cg
    public final Long c(String str, long j10) {
        try {
            return Long.valueOf(this.f75601a.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f75601a.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6749Cg
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.f75601a.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f75601a.getString(str, String.valueOf(z10)));
        }
    }
}
