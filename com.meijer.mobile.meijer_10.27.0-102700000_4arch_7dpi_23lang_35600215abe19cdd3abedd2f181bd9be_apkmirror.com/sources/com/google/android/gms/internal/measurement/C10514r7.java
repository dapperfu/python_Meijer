package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10514r7 implements InterfaceC10506q7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82384a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f82385b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC10449k4 f82386c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC10449k4 f82387d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC10449k4 f82388e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC10449k4 f82389f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC10449k4 f82390g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC10449k4 f82391h;

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zza() {
        return true;
    }

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c10395e4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f82384a = c10395e4B.d("measurement.rb.attribution.client2", true);
        f82385b = c10395e4B.d("measurement.rb.attribution.followup1.service", false);
        c10395e4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f82386c = c10395e4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c10395e4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f82387d = c10395e4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f82388e = c10395e4B.d("measurement.rb.attribution.retry_disposition", false);
        f82389f = c10395e4B.d("measurement.rb.attribution.service", true);
        f82390g = c10395e4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f82391h = c10395e4B.d("measurement.rb.attribution.uuid_generation", true);
        c10395e4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c10395e4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzb() {
        return ((Boolean) f82384a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzc() {
        return ((Boolean) f82385b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzd() {
        return ((Boolean) f82386c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zze() {
        return ((Boolean) f82387d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzf() {
        return ((Boolean) f82388e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzg() {
        return ((Boolean) f82389f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzh() {
        return ((Boolean) f82390g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10506q7
    public final boolean zzi() {
        return ((Boolean) f82391h.d()).booleanValue();
    }
}
