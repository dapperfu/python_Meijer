package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.u7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10541u7 implements InterfaceC10532t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82432a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        f82432a = c10395e4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c10395e4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10532t7
    public final boolean zza() {
        return ((Boolean) f82432a.d()).booleanValue();
    }
}
