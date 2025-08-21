package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10683w6 implements InterfaceC10674v6 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83291a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f83291a = c10520e4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c10520e4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c10520e4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10674v6
    public final boolean zza() {
        return ((Boolean) f83291a.d()).booleanValue();
    }
}
