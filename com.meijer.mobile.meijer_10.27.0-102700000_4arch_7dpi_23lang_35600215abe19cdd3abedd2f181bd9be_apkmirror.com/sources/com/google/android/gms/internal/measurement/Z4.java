package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class Z4 implements I5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Z4 f82116a = new Z4();

    private Z4() {
    }

    public static Z4 a() {
        return f82116a;
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final boolean zzb(Class cls) {
        return AbstractC10396e5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.I5
    public final H5 zzc(Class cls) {
        if (!AbstractC10396e5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (H5) AbstractC10396e5.s(cls.asSubclass(AbstractC10396e5.class)).D(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
