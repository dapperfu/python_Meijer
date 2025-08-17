package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9653uv implements InterfaceC8415jH {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f78938a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f78939b;

    /* renamed from: c, reason: collision with root package name */
    private C9459t40 f78940c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f78941d;

    /* renamed from: e, reason: collision with root package name */
    private IB f78942e;

    /* renamed from: f, reason: collision with root package name */
    private C8645lW f78943f;

    /* synthetic */ C9653uv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f78938a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f78939b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9459t40 c9459t40) {
        this.f78940c = c9459t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8415jH
    public final /* bridge */ /* synthetic */ InterfaceC8415jH h(C8645lW c8645lW) {
        this.f78943f = c8645lW;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8415jH
    public final /* bridge */ /* synthetic */ InterfaceC8415jH k(IB ib2) {
        this.f78942e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8415jH
    public final /* bridge */ /* synthetic */ InterfaceC8415jH o(ZE ze2) {
        this.f78941d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final AbstractC8522kH zzh() {
        C9233qy0.c(this.f78941d, ZE.class);
        C9233qy0.c(this.f78942e, IB.class);
        C9233qy0.c(this.f78943f, C8645lW.class);
        return new C9760vv(this.f78938a, new C8296iA(), new Z60(), new C8403jB(), new MN(), this.f78941d, this.f78942e, C9072pV.a(), this.f78943f, null, this.f78939b, this.f78940c, null);
    }
}
