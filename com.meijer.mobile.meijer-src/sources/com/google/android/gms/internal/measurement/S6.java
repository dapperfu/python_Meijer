package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class S6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82825a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10574k4 f82826b;

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zza() {
        return true;
    }

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.collection.event_safelist", true);
        f82825a = c10520e4B.d("measurement.service.store_null_safelist", true);
        f82826b = c10520e4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzb() {
        return ((Boolean) f82825a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zzc() {
        return ((Boolean) f82826b.d()).booleanValue();
    }
}
