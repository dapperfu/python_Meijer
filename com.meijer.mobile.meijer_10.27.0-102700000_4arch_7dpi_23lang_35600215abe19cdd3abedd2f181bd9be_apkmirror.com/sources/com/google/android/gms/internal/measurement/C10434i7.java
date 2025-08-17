package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10434i7 implements InterfaceC10425h7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82214a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.gmscore_feature_tracking", true);
        f82214a = c10395e4B.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10425h7
    public final boolean zza() {
        return ((Boolean) f82214a.d()).booleanValue();
    }
}
