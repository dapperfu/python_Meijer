package com.google.android.gms.internal.atv_ads_framework;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10220g1 implements InterfaceC10241n1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10241n1[] f80979a;

    C10220g1(InterfaceC10241n1... interfaceC10241n1Arr) {
        this.f80979a = interfaceC10241n1Arr;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10241n1
    public final InterfaceC10238m1 zzb(Class cls) {
        InterfaceC10241n1[] interfaceC10241n1Arr = this.f80979a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC10241n1 interfaceC10241n1 = interfaceC10241n1Arr[i10];
            if (interfaceC10241n1.zzc(cls)) {
                return interfaceC10241n1.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10241n1
    public final boolean zzc(Class cls) {
        InterfaceC10241n1[] interfaceC10241n1Arr = this.f80979a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC10241n1Arr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
