package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7856cv implements InterfaceC7477Xx {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f74124a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f74125b;

    /* renamed from: c, reason: collision with root package name */
    private C9584t40 f74126c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f74127d;

    /* renamed from: e, reason: collision with root package name */
    private IB f74128e;

    /* synthetic */ C7856cv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f74124a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f74125b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9584t40 c9584t40) {
        this.f74126c = c9584t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7477Xx
    public final /* bridge */ /* synthetic */ InterfaceC7477Xx a(ZE ze2) {
        this.f74127d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7477Xx
    public final /* bridge */ /* synthetic */ InterfaceC7477Xx b(IB ib2) {
        this.f74128e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final AbstractC7543Zx zzh() {
        C9358qy0.c(this.f74127d, ZE.class);
        C9358qy0.c(this.f74128e, IB.class);
        return new C7962dv(this.f74124a, new C8421iA(), new Z60(), new C8528jB(), new MN(), this.f74127d, this.f74128e, C9197pV.a(), null, this.f74125b, this.f74126c, null);
    }
}
