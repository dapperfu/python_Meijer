package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10461l7 implements InterfaceC10452k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10449k4 f82263a;

    static {
        C10395e4 c10395e4B = new C10395e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10395e4B.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f82263a = c10395e4B.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c10395e4B.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10452k7
    public final boolean zza() {
        return ((Boolean) f82263a.d()).booleanValue();
    }
}
