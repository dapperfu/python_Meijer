package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7879d6 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private final C8124fQ f74201a = new C8124fQ(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8092f6 f74202b;

    public C7879d6(C8092f6 c8092f6) {
        this.f74202b = c8092f6;
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(C8982nU c8982nU, InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void a(GQ gq2) {
        if (gq2.C() == 0 && (gq2.C() & 128) != 0) {
            gq2.m(6);
            int iR = gq2.r() / 4;
            for (int i10 = 0; i10 < iR; i10++) {
                gq2.g(this.f74201a, 4);
                C8124fQ c8124fQ = this.f74201a;
                int iD = c8124fQ.d(16);
                c8124fQ.n(3);
                if (iD == 0) {
                    this.f74201a.n(13);
                } else {
                    int iD2 = this.f74201a.d(13);
                    if (this.f74202b.f74877g.get(iD2) == null) {
                        C8092f6 c8092f6 = this.f74202b;
                        c8092f6.f74877g.put(iD2, new X5(new C7985e6(c8092f6, iD2)));
                        this.f74202b.f74883m++;
                    }
                }
            }
            this.f74202b.f74877g.remove(0);
        }
    }
}
