package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10806n5 implements InterfaceC10933v5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC10822o5 f83238a;

    C10806n5(SharedPreferencesOnSharedPreferenceChangeListenerC10822o5 sharedPreferencesOnSharedPreferenceChangeListenerC10822o5) {
        this.f83238a = sharedPreferencesOnSharedPreferenceChangeListenerC10822o5;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10933v5
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.f83238a.f83262e.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f83238a.f83262e.getString(str, String.valueOf(z10)));
        }
    }
}
