package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10532f7 implements InterfaceC10523e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83025a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.gbraid_campaign.gbraid.client", true);
        f83025a = c10520e4B.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10523e7
    public final boolean zza() {
        return ((Boolean) f83025a.d()).booleanValue();
    }
}
