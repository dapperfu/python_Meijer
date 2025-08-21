package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10586l7 implements InterfaceC10577k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC10574k4 f83103a;

    static {
        C10520e4 c10520e4B = new C10520e4(Z3.a("com.google.android.gms.measurement")).a().b();
        c10520e4B.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f83103a = c10520e4B.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c10520e4B.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10577k7
    public final boolean zza() {
        return ((Boolean) f83103a.d()).booleanValue();
    }
}
