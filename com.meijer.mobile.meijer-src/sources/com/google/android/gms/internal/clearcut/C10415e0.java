package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;

/* renamed from: com.google.android.gms.internal.clearcut.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10415e0 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10415e0 f82254a = new C10415e0();

    private C10415e0() {
    }

    public static C10415e0 a() {
        return f82254a;
    }

    @Override // com.google.android.gms.internal.clearcut.I0
    public final boolean zza(Class<?> cls) {
        return AbstractC10418f0.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.clearcut.I0
    public final H0 zzb(Class<?> cls) {
        if (!AbstractC10418f0.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (H0) AbstractC10418f0.p(cls.asSubclass(AbstractC10418f0.class)).f(AbstractC10418f0.e.f82276c, null, null);
        } catch (Exception e10) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e10);
        }
    }
}
