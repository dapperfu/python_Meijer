package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10931n5 implements InterfaceC11058v5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC10947o5 f84078a;

    C10931n5(SharedPreferencesOnSharedPreferenceChangeListenerC10947o5 sharedPreferencesOnSharedPreferenceChangeListenerC10947o5) {
        this.f84078a = sharedPreferencesOnSharedPreferenceChangeListenerC10947o5;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11058v5
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.f84078a.f84102e.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f84078a.f84102e.getString(str, String.valueOf(z10)));
        }
    }
}
