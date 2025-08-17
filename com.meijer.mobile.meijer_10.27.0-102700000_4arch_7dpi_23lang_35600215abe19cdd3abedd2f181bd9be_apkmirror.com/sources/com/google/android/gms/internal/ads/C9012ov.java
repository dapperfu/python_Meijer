package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ov, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9012ov implements ZN {

    /* renamed from: a, reason: collision with root package name */
    private final C7518av f77445a;

    /* renamed from: b, reason: collision with root package name */
    private final C9332rv f77446b;

    /* renamed from: c, reason: collision with root package name */
    private Long f77447c;

    /* renamed from: d, reason: collision with root package name */
    private String f77448d;

    /* synthetic */ C9012ov(C7518av c7518av, C9332rv c9332rv, C6777Gv c6777Gv) {
        this.f77445a = c7518av;
        this.f77446b = c9332rv;
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final InterfaceC7464aO zzc() {
        C9233qy0.c(this.f77447c, Long.class);
        C9233qy0.c(this.f77448d, String.class);
        return new C9119pv(this.f77445a, this.f77446b, this.f77447c, this.f77448d, null);
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final /* bridge */ /* synthetic */ ZN a(long j10) {
        this.f77447c = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ZN
    public final /* bridge */ /* synthetic */ ZN zza(String str) {
        str.getClass();
        this.f77448d = str;
        return this;
    }
}
