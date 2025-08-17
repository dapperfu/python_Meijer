package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class G6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81773a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.client.3p_consent_state_v1", true);
        f81773a = c10395e4B.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final long zza() {
        return ((Long) f81773a.d()).longValue();
    }
}
