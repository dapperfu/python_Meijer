package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9137ov implements ZN {

    /* renamed from: a, reason: collision with root package name */
    private final C7643av f78285a;

    /* renamed from: b, reason: collision with root package name */
    private final C9457rv f78286b;

    /* renamed from: c, reason: collision with root package name */
    private Long f78287c;

    /* renamed from: d, reason: collision with root package name */
    private String f78288d;

    /* synthetic */ C9137ov(C7643av c7643av, C9457rv c9457rv, C6902Gv c6902Gv) {
        this.f78285a = c7643av;
        this.f78286b = c9457rv;
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final InterfaceC7589aO zzc() {
        C9358qy0.c(this.f78287c, Long.class);
        C9358qy0.c(this.f78288d, String.class);
        return new C9244pv(this.f78285a, this.f78286b, this.f78287c, this.f78288d, null);
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final /* bridge */ /* synthetic */ ZN a(long j10) {
        this.f78287c = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final /* bridge */ /* synthetic */ ZN zza(String str) {
        str.getClass();
        this.f78288d = str;
        return this;
    }
}
