package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class BT implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f66378a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7543Zx f66379b;

    BT(Context context, AbstractC7543Zx abstractC7543Zx) {
        this.f66378a = context;
        this.f66379b = abstractC7543Zx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        C9196pU c9196pU = new C9196pU(z50, (InterfaceC10295zm) c8767lT.f76666b, Gc.b.APP_OPEN_AD);
        AbstractC7411Vx abstractC7411VxA = this.f66379b.a(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JG(c9196pU, null), new C7444Wx(z50.f72862a0));
        c9196pU.b(abstractC7411VxA.b());
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC7411VxA.f());
        return abstractC7411VxA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            ((InterfaceC10295zm) c8767lT.f76666b).q0(z50.f72860Z);
            ((InterfaceC10295zm) c8767lT.f76666b).x9(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f66378a), new BinderC10264zT(c8767lT, null), (InterfaceC6960Il) c8767lT.f76667c);
        } catch (RemoteException e10) {
            Rc.p0.l("Remote exception loading an app open RTB ad", e10);
            throw new zzfcq(e10);
        }
    }
}
