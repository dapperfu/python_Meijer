package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class E7 implements D7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82601a;

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean zza() {
        return true;
    }

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82601a = c10520e4B.d("measurement.session_stitching_token_enabled", false);
        c10520e4B.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.D7
    public final boolean zzb() {
        return ((Boolean) f82601a.d()).booleanValue();
    }
}
