package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81810a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f81811b;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c10395e4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c10395e4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f81810a = c10395e4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f81811b = c10395e4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c10395e4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zza() {
        return ((Boolean) f81810a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zzb() {
        return ((Boolean) f81811b.d()).booleanValue();
    }
}
