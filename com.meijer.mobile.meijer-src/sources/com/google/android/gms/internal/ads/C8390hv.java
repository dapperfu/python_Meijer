package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8390hv implements InterfaceC7244Qy {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f75644a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f75645b;

    /* renamed from: c, reason: collision with root package name */
    private C9584t40 f75646c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f75647d;

    /* renamed from: e, reason: collision with root package name */
    private IB f75648e;

    /* renamed from: f, reason: collision with root package name */
    private C8770lW f75649f;

    /* renamed from: g, reason: collision with root package name */
    private C9572sz f75650g;

    /* renamed from: h, reason: collision with root package name */
    private C8876mV f75651h;

    /* renamed from: i, reason: collision with root package name */
    private C8608jy f75652i;

    /* renamed from: j, reason: collision with root package name */
    private BH f75653j;

    /* synthetic */ C8390hv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f75644a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f75645b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9584t40 c9584t40) {
        this.f75646c = c9584t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy c(BH bh2) {
        this.f75653j = bh2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy d(C8608jy c8608jy) {
        this.f75652i = c8608jy;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy e(IB ib2) {
        this.f75648e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy g(C8770lW c8770lW) {
        this.f75649f = c8770lW;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy j(C8876mV c8876mV) {
        this.f75651h = c8876mV;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy l(C9572sz c9572sz) {
        this.f75650g = c9572sz;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Qy
    public final /* bridge */ /* synthetic */ InterfaceC7244Qy m(ZE ze2) {
        this.f75647d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final AbstractC7278Ry zzh() {
        C9358qy0.c(this.f75647d, ZE.class);
        C9358qy0.c(this.f75648e, IB.class);
        C9358qy0.c(this.f75649f, C8770lW.class);
        C9358qy0.c(this.f75650g, C9572sz.class);
        if (this.f75651h == null) {
            this.f75651h = C9197pV.a();
        }
        C9358qy0.c(this.f75652i, C8608jy.class);
        C9358qy0.c(this.f75653j, BH.class);
        return new C8495iv(this.f75644a, this.f75652i, this.f75653j, new C8421iA(), new Z60(), new C8528jB(), new MN(), this.f75647d, this.f75648e, this.f75651h, this.f75649f, this.f75650g, null, this.f75645b, this.f75646c, null);
    }
}
