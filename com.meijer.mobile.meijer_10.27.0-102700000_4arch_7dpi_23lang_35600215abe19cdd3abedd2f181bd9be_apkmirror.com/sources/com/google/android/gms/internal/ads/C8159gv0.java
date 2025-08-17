package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8159gv0 implements InterfaceC8906nv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8906nv0[] f74548a;

    C8159gv0(InterfaceC8906nv0... interfaceC8906nv0Arr) {
        this.f74548a = interfaceC8906nv0Arr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8906nv0
    public final InterfaceC8799mv0 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC8906nv0 interfaceC8906nv0 = this.f74548a[i10];
            if (interfaceC8906nv0.zzc(cls)) {
                return interfaceC8906nv0.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8906nv0
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f74548a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
