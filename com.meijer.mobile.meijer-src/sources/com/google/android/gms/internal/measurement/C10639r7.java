package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10639r7 implements InterfaceC10631q7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83224a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10574k4 f83225b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC10574k4 f83226c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC10574k4 f83227d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC10574k4 f83228e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC10574k4 f83229f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC10574k4 f83230g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC10574k4 f83231h;

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zza() {
        return true;
    }

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c10520e4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f83224a = c10520e4B.d("measurement.rb.attribution.client2", true);
        f83225b = c10520e4B.d("measurement.rb.attribution.followup1.service", false);
        c10520e4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f83226c = c10520e4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c10520e4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f83227d = c10520e4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f83228e = c10520e4B.d("measurement.rb.attribution.retry_disposition", false);
        f83229f = c10520e4B.d("measurement.rb.attribution.service", true);
        f83230g = c10520e4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f83231h = c10520e4B.d("measurement.rb.attribution.uuid_generation", true);
        c10520e4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c10520e4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzb() {
        return ((Boolean) f83224a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzc() {
        return ((Boolean) f83225b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzd() {
        return ((Boolean) f83226c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zze() {
        return ((Boolean) f83227d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzf() {
        return ((Boolean) f83228e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzg() {
        return ((Boolean) f83229f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzh() {
        return ((Boolean) f83230g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10631q7
    public final boolean zzi() {
        return ((Boolean) f83231h.d()).booleanValue();
    }
}
