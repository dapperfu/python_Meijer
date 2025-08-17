package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class W0 implements InterfaceC10657e1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10657e1[] f82931a;

    W0(InterfaceC10657e1... interfaceC10657e1Arr) {
        this.f82931a = interfaceC10657e1Arr;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10657e1
    public final InterfaceC10640d1 zzb(Class cls) {
        InterfaceC10657e1[] interfaceC10657e1Arr = this.f82931a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC10657e1 interfaceC10657e1 = interfaceC10657e1Arr[i10];
            if (interfaceC10657e1.zzc(cls)) {
                return interfaceC10657e1.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10657e1
    public final boolean zzc(Class cls) {
        InterfaceC10657e1[] interfaceC10657e1Arr = this.f82931a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC10657e1Arr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
