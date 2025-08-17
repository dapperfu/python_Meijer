package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class N7 implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f81930a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f81930a = c10395e4B.d("measurement.tcf.consent_fix", true);
        c10395e4B.d("measurement.tcf.client", true);
        c10395e4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.M7
    public final boolean zza() {
        return ((Boolean) f81930a.d()).booleanValue();
    }
}
