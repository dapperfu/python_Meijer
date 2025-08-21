package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9838vV implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79912a;

    /* renamed from: b, reason: collision with root package name */
    private final DL f79913b;

    public C9838vV(Context context, DL dl2) {
        this.f79912a = context;
        this.f79913b = dl2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        C9196pU c9196pU = new C9196pU(z50, (InterfaceC10295zm) c8767lT.f76666b, Gc.b.REWARDED);
        AbstractC10256zL abstractC10256zLB = this.f79913b.b(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new AL(c9196pU));
        c9196pU.b(abstractC10256zLB.b());
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC10256zLB.o());
        return abstractC10256zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            ((InterfaceC10295zm) c8767lT.f76666b).q0(z50.f72860Z);
            if (c8733l60.f76588a.f75445a.f79589o.f75082a == 3) {
                ((InterfaceC10295zm) c8767lT.f76666b).e3(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f79912a), new BinderC9624tV(this, c8767lT, null), (InterfaceC6960Il) c8767lT.f76667c);
            } else {
                ((InterfaceC10295zm) c8767lT.f76666b).u2(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f79912a), new BinderC9624tV(this, c8767lT, null), (InterfaceC6960Il) c8767lT.f76667c);
            }
        } catch (RemoteException e10) {
            Rc.p0.l("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
