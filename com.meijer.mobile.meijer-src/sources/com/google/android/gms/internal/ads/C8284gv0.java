package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8284gv0 implements InterfaceC9031nv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9031nv0[] f75388a;

    C8284gv0(InterfaceC9031nv0... interfaceC9031nv0Arr) {
        this.f75388a = interfaceC9031nv0Arr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9031nv0
    public final InterfaceC8924mv0 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC9031nv0 interfaceC9031nv0 = this.f75388a[i10];
            if (interfaceC9031nv0.zzc(cls)) {
                return interfaceC9031nv0.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9031nv0
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f75388a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
