package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class V6 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82075a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f82076b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC10449k4 f82077c;

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean zza() {
        return true;
    }

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f82075a = c10395e4B.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f82076b = c10395e4B.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f82077c = c10395e4B.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean zzb() {
        return ((Boolean) f82075a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean zzc() {
        return ((Boolean) f82076b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean zzd() {
        return ((Boolean) f82077c.d()).booleanValue();
    }
}
