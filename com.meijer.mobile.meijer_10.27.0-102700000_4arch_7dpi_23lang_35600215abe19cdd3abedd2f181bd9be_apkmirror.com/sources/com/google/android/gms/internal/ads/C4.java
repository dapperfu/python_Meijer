package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes6.dex */
public final class C4 implements InterfaceC8924o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f65694a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final GQ f65695b = new GQ();

    /* renamed from: c, reason: collision with root package name */
    private final B4 f65696c = new B4();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f65697d;

    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    public final void a(byte[] bArr, int i10, int i11, C8817n4 c8817n4, ME me2) {
        this.f65694a.j(bArr, i11 + i10);
        this.f65694a.l(i10);
        GQ gq2 = this.f65694a;
        if (gq2.r() > 0 && gq2.v() == 120) {
            if (this.f65697d == null) {
                this.f65697d = new Inflater();
            }
            if (OV.h(gq2, this.f65695b, this.f65697d)) {
                GQ gq3 = this.f65695b;
                gq2.j(gq3.n(), gq3.u());
            }
        }
        this.f65696c.e();
        ArrayList arrayList = new ArrayList();
        while (true) {
            GQ gq4 = this.f65694a;
            if (gq4.r() < 3) {
                me2.zza(new C8070g4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            B4 b42 = this.f65696c;
            int iU = gq4.u();
            int iC = gq4.C();
            int iG = gq4.G();
            int iT = gq4.t() + iG;
            C7385Yx c7385YxA = null;
            if (iT > iU) {
                gq4.l(iU);
            } else {
                if (iC != 128) {
                    switch (iC) {
                        case 20:
                            B4.d(b42, gq4, iG);
                            break;
                        case 21:
                            B4.b(b42, gq4, iG);
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            B4.c(b42, gq4, iG);
                            break;
                    }
                } else {
                    c7385YxA = b42.a();
                    b42.e();
                }
                gq4.l(iT);
            }
            if (c7385YxA != null) {
                arrayList.add(c7385YxA);
            }
        }
    }
}
