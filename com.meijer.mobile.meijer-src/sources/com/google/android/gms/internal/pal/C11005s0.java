package com.google.android.gms.internal.pal;

/* renamed from: com.google.android.gms.internal.pal.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11005s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC10974q0 f84685a = new C10989r0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC10974q0 f84686b;

    static AbstractC10974q0 b() {
        return f84685a;
    }

    static {
        AbstractC10974q0 abstractC10974q0 = null;
        try {
            abstractC10974q0 = (AbstractC10974q0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f84686b = abstractC10974q0;
    }

    static AbstractC10974q0 a() {
        AbstractC10974q0 abstractC10974q0 = f84686b;
        if (abstractC10974q0 != null) {
            return abstractC10974q0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
