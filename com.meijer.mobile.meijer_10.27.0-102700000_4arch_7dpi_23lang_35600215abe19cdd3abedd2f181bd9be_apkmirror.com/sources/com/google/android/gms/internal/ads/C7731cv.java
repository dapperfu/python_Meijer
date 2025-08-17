package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7731cv implements InterfaceC7352Xx {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f73284a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f73285b;

    /* renamed from: c, reason: collision with root package name */
    private C9459t40 f73286c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f73287d;

    /* renamed from: e, reason: collision with root package name */
    private IB f73288e;

    /* synthetic */ C7731cv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f73284a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f73285b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9459t40 c9459t40) {
        this.f73286c = c9459t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7352Xx
    public final /* bridge */ /* synthetic */ InterfaceC7352Xx a(ZE ze2) {
        this.f73287d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7352Xx
    public final /* bridge */ /* synthetic */ InterfaceC7352Xx b(IB ib2) {
        this.f73288e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final AbstractC7418Zx zzh() {
        C9233qy0.c(this.f73287d, ZE.class);
        C9233qy0.c(this.f73288e, IB.class);
        return new C7837dv(this.f73284a, new C8296iA(), new Z60(), new C8403jB(), new MN(), this.f73287d, this.f73288e, C9072pV.a(), null, this.f73285b, this.f73286c, null);
    }
}
