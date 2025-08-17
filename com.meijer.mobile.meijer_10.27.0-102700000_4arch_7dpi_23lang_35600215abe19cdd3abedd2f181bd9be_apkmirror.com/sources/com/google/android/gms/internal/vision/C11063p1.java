package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11063p1 implements InterfaceC11086x1 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC11086x1[] f84634a;

    @Override // com.google.android.gms.internal.vision.InterfaceC11086x1
    public final boolean zza(Class<?> cls) {
        for (InterfaceC11086x1 interfaceC11086x1 : this.f84634a) {
            if (interfaceC11086x1.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11086x1
    public final InterfaceC11077u1 zzb(Class<?> cls) {
        for (InterfaceC11086x1 interfaceC11086x1 : this.f84634a) {
            if (interfaceC11086x1.zza(cls)) {
                return interfaceC11086x1.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    C11063p1(InterfaceC11086x1... interfaceC11086x1Arr) {
        this.f84634a = interfaceC11086x1Arr;
    }
}
