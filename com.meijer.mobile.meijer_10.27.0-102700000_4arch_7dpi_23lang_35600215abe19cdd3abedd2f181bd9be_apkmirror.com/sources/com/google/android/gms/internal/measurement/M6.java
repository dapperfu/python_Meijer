package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class M6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81837a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f81838b;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f81837a = c10395e4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f81838b = c10395e4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zza() {
        return ((Boolean) f81837a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zzb() {
        return ((Boolean) f81838b.d()).booleanValue();
    }
}
