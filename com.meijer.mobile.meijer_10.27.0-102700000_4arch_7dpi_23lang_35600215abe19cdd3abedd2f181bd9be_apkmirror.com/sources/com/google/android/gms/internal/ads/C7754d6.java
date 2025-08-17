package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7754d6 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private final C7999fQ f73361a = new C7999fQ(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7967f6 f73362b;

    public C7754d6(C7967f6 c7967f6) {
        this.f73362b = c7967f6;
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(C8857nU c8857nU, InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void a(GQ gq2) {
        if (gq2.C() == 0 && (gq2.C() & 128) != 0) {
            gq2.m(6);
            int iR = gq2.r() / 4;
            for (int i10 = 0; i10 < iR; i10++) {
                gq2.g(this.f73361a, 4);
                C7999fQ c7999fQ = this.f73361a;
                int iD = c7999fQ.d(16);
                c7999fQ.n(3);
                if (iD == 0) {
                    this.f73361a.n(13);
                } else {
                    int iD2 = this.f73361a.d(13);
                    if (this.f73362b.f74037g.get(iD2) == null) {
                        C7967f6 c7967f6 = this.f73362b;
                        c7967f6.f74037g.put(iD2, new X5(new C7860e6(c7967f6, iD2)));
                        this.f73362b.f74043m++;
                    }
                }
            }
            this.f73362b.f74037g.remove(0);
        }
    }
}
