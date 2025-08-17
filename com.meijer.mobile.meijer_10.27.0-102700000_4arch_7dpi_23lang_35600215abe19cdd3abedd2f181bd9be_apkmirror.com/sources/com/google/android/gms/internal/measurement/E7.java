package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class E7 implements D7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81761a;

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean zza() {
        return true;
    }

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f81761a = c10395e4B.d("measurement.session_stitching_token_enabled", false);
        c10395e4B.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean zzb() {
        return ((Boolean) f81761a.d()).booleanValue();
    }
}
