package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class EL implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f66432a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66433b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f66434c;

    public EL(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f66432a = interfaceC10088yy0;
        this.f66433b = interfaceC10088yy02;
        this.f66434c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        int i10 = ((QB) this.f66434c).a().f78749o.f74242a;
        if (i10 != 0) {
            return i10 + (-1) != 0 ? ((YV) this.f66433b).zzb() : ((YV) this.f66432a).zzb();
        }
        throw null;
    }
}
