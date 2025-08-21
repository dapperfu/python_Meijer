package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class EL implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f67272a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f67273b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f67274c;

    public EL(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f67272a = interfaceC10213yy0;
        this.f67273b = interfaceC10213yy02;
        this.f67274c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        int i10 = ((QB) this.f67274c).a().f79589o.f75082a;
        if (i10 != 0) {
            return i10 + (-1) != 0 ? ((YV) this.f67273b).zzb() : ((YV) this.f67272a).zzb();
        }
        throw null;
    }
}
