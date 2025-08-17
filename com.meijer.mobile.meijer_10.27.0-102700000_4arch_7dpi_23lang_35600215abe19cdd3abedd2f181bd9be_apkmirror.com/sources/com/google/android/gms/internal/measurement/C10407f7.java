package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10407f7 implements InterfaceC10398e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82185a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.gbraid_campaign.gbraid.client", true);
        f82185a = c10395e4B.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10398e7
    public final boolean zza() {
        return ((Boolean) f82185a.d()).booleanValue();
    }
}
