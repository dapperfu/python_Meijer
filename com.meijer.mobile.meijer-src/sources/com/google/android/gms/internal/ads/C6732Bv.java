package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6732Bv implements CL {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f66459a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f66460b;

    /* renamed from: c, reason: collision with root package name */
    private C9584t40 f66461c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f66462d;

    /* renamed from: e, reason: collision with root package name */
    private IB f66463e;

    /* synthetic */ C6732Bv(C7643av c7643av, C6902Gv c6902Gv) {
        this.f66459a = c7643av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f66460b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9584t40 c9584t40) {
        this.f66461c = c9584t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.CL
    public final /* bridge */ /* synthetic */ CL a(ZE ze2) {
        this.f66462d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.CL
    public final /* bridge */ /* synthetic */ CL b(IB ib2) {
        this.f66463e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final DL zzh() {
        C9358qy0.c(this.f66462d, ZE.class);
        C9358qy0.c(this.f66463e, IB.class);
        return new C6766Cv(this.f66459a, new C8421iA(), new Z60(), new C8528jB(), new MN(), this.f66462d, this.f66463e, C9197pV.a(), null, this.f66460b, this.f66461c, null);
    }
}
