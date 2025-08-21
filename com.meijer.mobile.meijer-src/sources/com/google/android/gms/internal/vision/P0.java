package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;

/* loaded from: classes6.dex */
final class P0 implements InterfaceC11211x1 {

    /* renamed from: a, reason: collision with root package name */
    private static final P0 f85280a = new P0();

    private P0() {
    }

    public static P0 a() {
        return f85280a;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11211x1
    public final boolean zza(Class<?> cls) {
        return O0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11211x1
    public final InterfaceC11202u1 zzb(Class<?> cls) {
        if (!O0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (InterfaceC11202u1) O0.f(cls.asSubclass(O0.class)).h(O0.f.f85255c, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
