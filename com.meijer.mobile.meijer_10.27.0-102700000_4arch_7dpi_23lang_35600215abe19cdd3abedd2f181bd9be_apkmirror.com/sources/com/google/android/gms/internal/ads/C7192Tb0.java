package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7192Tb0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    private long f70418c;

    /* renamed from: b, reason: collision with root package name */
    private long f70417b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f70416a = new GQ();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C7192Tb0 c7192Tb0 = (C7192Tb0) obj;
        int iCompare = Long.compare(this.f70417b, c7192Tb0.f70417b);
        return iCompare != 0 ? iCompare : Long.compare(this.f70418c, c7192Tb0.f70418c);
    }

    public final void e(long j10, long j11, GQ gq2) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.f(z10);
        this.f70417b = j10;
        this.f70418c = j11;
        this.f70416a.i(gq2.r());
        System.arraycopy(gq2.n(), gq2.t(), this.f70416a.n(), 0, gq2.r());
    }
}
