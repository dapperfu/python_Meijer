package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9713vV implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79072a;

    /* renamed from: b, reason: collision with root package name */
    private final DL f79073b;

    public C9713vV(Context context, DL dl2) {
        this.f79072a = context;
        this.f79073b = dl2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        C9071pU c9071pU = new C9071pU(z50, (InterfaceC10170zm) c8642lT.f75826b, Ec.b.REWARDED);
        AbstractC10131zL abstractC10131zLB = this.f79073b.b(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new AL(c9071pU));
        c9071pU.b(abstractC10131zLB.b());
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC10131zLB.o());
        return abstractC10131zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            ((InterfaceC10170zm) c8642lT.f75826b).p0(z50.f72020Z);
            if (c8608l60.f75748a.f74605a.f78749o.f74242a == 3) {
                ((InterfaceC10170zm) c8642lT.f75826b).b9(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f79072a), new BinderC9499tV(this, c8642lT, null), (InterfaceC6835Il) c8642lT.f75827c);
            } else {
                ((InterfaceC10170zm) c8642lT.f75826b).I7(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f79072a), new BinderC9499tV(this, c8642lT, null), (InterfaceC6835Il) c8642lT.f75827c);
            }
        } catch (RemoteException e10) {
            Pc.p0.l("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
