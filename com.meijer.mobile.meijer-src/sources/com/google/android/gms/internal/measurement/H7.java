package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class H7 implements G7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82625a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82625a = c10520e4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c10520e4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c10520e4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.G7
    public final boolean zza() {
        return ((Boolean) f82625a.d()).booleanValue();
    }
}
