package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class W0 implements InterfaceC10782e1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10782e1[] f83771a;

    W0(InterfaceC10782e1... interfaceC10782e1Arr) {
        this.f83771a = interfaceC10782e1Arr;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10782e1
    public final InterfaceC10765d1 zzb(Class cls) {
        InterfaceC10782e1[] interfaceC10782e1Arr = this.f83771a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC10782e1 interfaceC10782e1 = interfaceC10782e1Arr[i10];
            if (interfaceC10782e1.zzc(cls)) {
                return interfaceC10782e1.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10782e1
    public final boolean zzc(Class cls) {
        InterfaceC10782e1[] interfaceC10782e1Arr = this.f83771a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC10782e1Arr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
