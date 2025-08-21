package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class G6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82613a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.client.3p_consent_state_v1", true);
        f82613a = c10520e4B.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final long zza() {
        return ((Long) f82613a.d()).longValue();
    }
}
