package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class BT implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f65538a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7418Zx f65539b;

    BT(Context context, AbstractC7418Zx abstractC7418Zx) {
        this.f65538a = context;
        this.f65539b = abstractC7418Zx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        C9071pU c9071pU = new C9071pU(z50, (InterfaceC10170zm) c8642lT.f75826b, Ec.b.APP_OPEN_AD);
        AbstractC7286Vx abstractC7286VxA = this.f65539b.a(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JG(c9071pU, null), new C7319Wx(z50.f72022a0));
        c9071pU.b(abstractC7286VxA.b());
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC7286VxA.f());
        return abstractC7286VxA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            ((InterfaceC10170zm) c8642lT.f75826b).p0(z50.f72020Z);
            ((InterfaceC10170zm) c8642lT.f75826b).Z2(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f65538a), new BinderC10139zT(c8642lT, null), (InterfaceC6835Il) c8642lT.f75827c);
        } catch (RemoteException e10) {
            Pc.p0.l("Remote exception loading an app open RTB ad", e10);
            throw new zzfcq(e10);
        }
    }
}
