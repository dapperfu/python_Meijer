package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9778uv implements InterfaceC8540jH {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f79778a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f79779b;

    /* renamed from: c, reason: collision with root package name */
    private C9584t40 f79780c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f79781d;

    /* renamed from: e, reason: collision with root package name */
    private IB f79782e;

    /* renamed from: f, reason: collision with root package name */
    private C8770lW f79783f;

    /* synthetic */ C9778uv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f79778a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f79779b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9584t40 c9584t40) {
        this.f79780c = c9584t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8540jH
    public final /* bridge */ /* synthetic */ InterfaceC8540jH h(C8770lW c8770lW) {
        this.f79783f = c8770lW;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8540jH
    public final /* bridge */ /* synthetic */ InterfaceC8540jH k(IB ib2) {
        this.f79782e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8540jH
    public final /* bridge */ /* synthetic */ InterfaceC8540jH o(ZE ze2) {
        this.f79781d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final AbstractC8647kH zzh() {
        C9358qy0.c(this.f79781d, ZE.class);
        C9358qy0.c(this.f79782e, IB.class);
        C9358qy0.c(this.f79783f, C8770lW.class);
        return new C9885vv(this.f79778a, new C8421iA(), new Z60(), new C8528jB(), new MN(), this.f79781d, this.f79782e, C9197pV.a(), this.f79783f, null, this.f79779b, this.f79780c, null);
    }
}
