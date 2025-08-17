package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9119pv implements InterfaceC7464aO {

    /* renamed from: a, reason: collision with root package name */
    private final Long f77658a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77659b;

    /* renamed from: c, reason: collision with root package name */
    private final C7518av f77660c;

    /* renamed from: d, reason: collision with root package name */
    private final C9332rv f77661d;

    /* synthetic */ C9119pv(C7518av c7518av, C9332rv c9332rv, Long l10, String str, C6777Gv c6777Gv) {
        this.f77660c = c7518av;
        this.f77661d = c9332rv;
        this.f77658a = l10;
        this.f77659b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7464aO
    public final C8637lO zza() {
        C9332rv c9332rv = this.f77661d;
        return C8744mO.a(this.f77658a.longValue(), c9332rv.f78085a, C7997fO.b(c9332rv.f78086b), this.f77660c, this.f77659b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7464aO
    public final C9065pO zzb() {
        C9332rv c9332rv = this.f77661d;
        return C9172qO.a(this.f77658a.longValue(), c9332rv.f78085a, C7997fO.b(c9332rv.f78086b), this.f77660c, this.f77659b);
    }
}
