package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class H7 implements G7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81785a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f81785a = c10395e4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c10395e4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c10395e4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.G7
    public final boolean zza() {
        return ((Boolean) f81785a.d()).booleanValue();
    }
}
