package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9712vU implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79070a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8522kH f79071b;

    public C9712vU(Context context, AbstractC8522kH abstractC8522kH) {
        this.f79070a = context;
        this.f79071b = abstractC8522kH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        C9071pU c9071pU = new C9071pU(z50, (InterfaceC10170zm) c8642lT.f75826b, Ec.b.INTERSTITIAL);
        GG ggC = this.f79071b.c(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JG(c9071pU, null));
        c9071pU.b(ggC.b());
        ((BinderC8003fU) c8642lT.f75827c).C9(ggC.f());
        return ggC.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            ((InterfaceC10170zm) c8642lT.f75826b).p0(z50.f72020Z);
            ((InterfaceC10170zm) c8642lT.f75826b).b1(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f79070a), new BinderC9498tU(this, c8642lT, null), (InterfaceC6835Il) c8642lT.f75827c);
        } catch (RemoteException e10) {
            Pc.p0.l("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfcq(e10);
        }
    }
}
