package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class S6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81985a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10449k4 f81986b;

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zza() {
        return true;
    }

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.collection.event_safelist", true);
        f81985a = c10395e4B.d("measurement.service.store_null_safelist", true);
        f81986b = c10395e4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzb() {
        return ((Boolean) f81985a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzc() {
        return ((Boolean) f81986b.d()).booleanValue();
    }
}
