package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10558w6 implements InterfaceC10549v6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82451a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82451a = c10395e4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c10395e4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c10395e4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10549v6
    public final boolean zza() {
        return ((Boolean) f82451a.d()).booleanValue();
    }
}
