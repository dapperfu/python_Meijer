package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10666u7 implements InterfaceC10657t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83272a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f83272a = c10520e4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c10520e4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10657t7
    public final boolean zza() {
        return ((Boolean) f83272a.d()).booleanValue();
    }
}
