package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10880s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC10849q0 f83845a = new C10864r0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC10849q0 f83846b;

    static AbstractC10849q0 b() {
        return f83845a;
    }

    static {
        AbstractC10849q0 abstractC10849q0 = null;
        try {
            abstractC10849q0 = (AbstractC10849q0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f83846b = abstractC10849q0;
    }

    static AbstractC10849q0 a() {
        AbstractC10849q0 abstractC10849q0 = f83846b;
        if (abstractC10849q0 != null) {
            return abstractC10849q0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
