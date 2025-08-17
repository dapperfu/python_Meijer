package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7349Xu implements FH {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f71432a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f71433b;

    /* renamed from: c, reason: collision with root package name */
    private C9459t40 f71434c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f71435d;

    /* renamed from: e, reason: collision with root package name */
    private IB f71436e;

    /* renamed from: f, reason: collision with root package name */
    private BH f71437f;

    /* renamed from: g, reason: collision with root package name */
    private C8483jy f71438g;

    /* synthetic */ C7349Xu(C7518av c7518av, C6777Gv c6777Gv) {
        this.f71432a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f71433b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9459t40 c9459t40) {
        this.f71434c = c9459t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FH
    public final /* bridge */ /* synthetic */ FH c(BH bh2) {
        this.f71437f = bh2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FH
    public final /* bridge */ /* synthetic */ FH d(C8483jy c8483jy) {
        this.f71438g = c8483jy;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FH
    public final /* bridge */ /* synthetic */ FH i(IB ib2) {
        this.f71436e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FH
    public final /* bridge */ /* synthetic */ FH n(ZE ze2) {
        this.f71435d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final GH zzh() {
        C9233qy0.c(this.f71435d, ZE.class);
        C9233qy0.c(this.f71436e, IB.class);
        C9233qy0.c(this.f71437f, BH.class);
        C9233qy0.c(this.f71438g, C8483jy.class);
        return new C7382Yu(this.f71432a, this.f71438g, this.f71437f, new C8296iA(), new Z60(), new C8403jB(), new MN(), this.f71435d, this.f71436e, C9072pV.a(), null, this.f71433b, this.f71434c, null);
    }
}
