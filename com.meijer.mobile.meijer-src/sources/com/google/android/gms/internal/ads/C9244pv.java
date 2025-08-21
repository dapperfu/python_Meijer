package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9244pv implements InterfaceC7589aO {

    /* renamed from: a, reason: collision with root package name */
    private final Long f78498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78499b;

    /* renamed from: c, reason: collision with root package name */
    private final C7643av f78500c;

    /* renamed from: d, reason: collision with root package name */
    private final C9457rv f78501d;

    /* synthetic */ C9244pv(C7643av c7643av, C9457rv c9457rv, Long l10, String str, C6902Gv c6902Gv) {
        this.f78500c = c7643av;
        this.f78501d = c9457rv;
        this.f78498a = l10;
        this.f78499b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7589aO
    public final C8762lO zza() {
        C9457rv c9457rv = this.f78501d;
        return C8869mO.a(this.f78498a.longValue(), c9457rv.f78925a, C8122fO.b(c9457rv.f78926b), this.f78500c, this.f78499b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7589aO
    public final C9190pO zzb() {
        C9457rv c9457rv = this.f78501d;
        return C9297qO.a(this.f78498a.longValue(), c9457rv.f78925a, C8122fO.b(c9457rv.f78926b), this.f78500c, this.f78499b);
    }
}
