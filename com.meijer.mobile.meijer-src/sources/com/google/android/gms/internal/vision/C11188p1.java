package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11188p1 implements InterfaceC11211x1 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC11211x1[] f85474a;

    @Override // com.google.android.gms.internal.vision.InterfaceC11211x1
    public final boolean zza(Class<?> cls) {
        for (InterfaceC11211x1 interfaceC11211x1 : this.f85474a) {
            if (interfaceC11211x1.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11211x1
    public final InterfaceC11202u1 zzb(Class<?> cls) {
        for (InterfaceC11211x1 interfaceC11211x1 : this.f85474a) {
            if (interfaceC11211x1.zza(cls)) {
                return interfaceC11211x1.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    C11188p1(InterfaceC11211x1... interfaceC11211x1Arr) {
        this.f85474a = interfaceC11211x1Arr;
    }
}
