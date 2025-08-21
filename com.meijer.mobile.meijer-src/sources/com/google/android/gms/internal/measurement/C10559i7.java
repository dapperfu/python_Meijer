package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10559i7 implements InterfaceC10550h7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83054a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.gmscore_feature_tracking", true);
        f83054a = c10520e4B.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10550h7
    public final boolean zza() {
        return ((Boolean) f83054a.d()).booleanValue();
    }
}
