package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class M6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82677a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10574k4 f82678b;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82677a = c10520e4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f82678b = c10520e4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zza() {
        return ((Boolean) f82677a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zzb() {
        return ((Boolean) f82678b.d()).booleanValue();
    }
}
