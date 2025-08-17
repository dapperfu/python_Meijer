package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6607Bv implements CL {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f65619a;

    /* renamed from: b, reason: collision with root package name */
    private R40 f65620b;

    /* renamed from: c, reason: collision with root package name */
    private C9459t40 f65621c;

    /* renamed from: d, reason: collision with root package name */
    private ZE f65622d;

    /* renamed from: e, reason: collision with root package name */
    private IB f65623e;

    /* synthetic */ C6607Bv(C7518av c7518av, C6777Gv c6777Gv) {
        this.f65619a = c7518av;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB f(R40 r40) {
        this.f65620b = r40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    public final /* synthetic */ DB p(C9459t40 c9459t40) {
        this.f65621c = c9459t40;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.CL
    public final /* bridge */ /* synthetic */ CL a(ZE ze2) {
        this.f65622d = ze2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.CL
    public final /* bridge */ /* synthetic */ CL b(IB ib2) {
        this.f65623e = ib2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.DB
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final DL zzh() {
        C9233qy0.c(this.f65622d, ZE.class);
        C9233qy0.c(this.f65623e, IB.class);
        return new C6641Cv(this.f65619a, new C8296iA(), new Z60(), new C8403jB(), new MN(), this.f65622d, this.f65623e, C9072pV.a(), null, this.f65620b, this.f65621c, null);
    }
}
