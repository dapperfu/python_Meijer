package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10345g1 implements InterfaceC10366n1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10366n1[] f81819a;

    C10345g1(InterfaceC10366n1... interfaceC10366n1Arr) {
        this.f81819a = interfaceC10366n1Arr;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10366n1
    public final InterfaceC10363m1 zzb(Class cls) {
        InterfaceC10366n1[] interfaceC10366n1Arr = this.f81819a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC10366n1 interfaceC10366n1 = interfaceC10366n1Arr[i10];
            if (interfaceC10366n1.zzc(cls)) {
                return interfaceC10366n1.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10366n1
    public final boolean zzc(Class cls) {
        InterfaceC10366n1[] interfaceC10366n1Arr = this.f81819a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC10366n1Arr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
