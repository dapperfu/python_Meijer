package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class KU implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68099a;

    /* renamed from: b, reason: collision with root package name */
    private final GH f68100b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7106Ql f68101c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f68102d;

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        if (!c8608l60.f75748a.f74605a.f78741g.contains(Integer.toString(6))) {
            throw new zzegu(2, "Unified must be used for RTB.");
        }
        C9914xI c9914xIG0 = C9914xI.g0(this.f68101c);
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        if (!c9570u60.f78741g.contains(Integer.toString(c9914xIG0.P()))) {
            throw new zzegu(1, "No corresponding native ad listener");
        }
        AbstractC10128zI abstractC10128zID = this.f68100b.d(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JI(c9914xIG0), new EJ(null, null, this.f68101c));
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC10128zID.f());
        return abstractC10128zID.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            ((InterfaceC10170zm) c8642lT.f75826b).p0(z50.f72020Z);
            JU ju2 = null;
            if (this.f68102d.f29931c < ((Integer) Mc.A.c().a(C8659lf.f76098P1)).intValue()) {
                ((InterfaceC10170zm) c8642lT.f75826b).r5(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f68099a), new IU(this, c8642lT, ju2), (InterfaceC6835Il) c8642lT.f75827c);
            } else {
                ((InterfaceC10170zm) c8642lT.f75826b).h8(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f68099a), new IU(this, c8642lT, ju2), (InterfaceC6835Il) c8642lT.f75827c, c8608l60.f75748a.f74605a.f78743i);
            }
        } catch (RemoteException e10) {
            throw new zzfcq(e10);
        }
    }

    public KU(Context context, GH gh2, Qc.a aVar) {
        this.f68099a = context;
        this.f68100b = gh2;
        this.f68102d = aVar;
    }
}
