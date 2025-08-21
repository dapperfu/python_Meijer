package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
public final class N7 implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f82770a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82770a = c10520e4B.d("measurement.tcf.consent_fix", true);
        c10520e4B.d("measurement.tcf.client", true);
        c10520e4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.M7
    public final boolean zza() {
        return ((Boolean) f82770a.d()).booleanValue();
    }
}
