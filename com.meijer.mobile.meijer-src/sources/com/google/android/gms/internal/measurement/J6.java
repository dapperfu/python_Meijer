package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class J6 implements I6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82650a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10574k4 f82651b;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c10520e4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c10520e4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f82650a = c10520e4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f82651b = c10520e4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c10520e4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zza() {
        return ((Boolean) f82650a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.I6
    public final boolean zzb() {
        return ((Boolean) f82651b.d()).booleanValue();
    }
}
