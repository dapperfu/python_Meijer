package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7317Tb0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    private long f71258c;

    /* renamed from: b, reason: collision with root package name */
    private long f71257b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f71256a = new GQ();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C7317Tb0 c7317Tb0 = (C7317Tb0) obj;
        int iCompare = Long.compare(this.f71257b, c7317Tb0.f71257b);
        return iCompare != 0 ? iCompare : Long.compare(this.f71258c, c7317Tb0.f71258c);
    }

    public final void e(long j10, long j11, GQ gq2) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.f(z10);
        this.f71257b = j10;
        this.f71258c = j11;
        this.f71256a.i(gq2.r());
        System.arraycopy(gq2.n(), gq2.t(), this.f71256a.n(), 0, gq2.r());
    }
}
