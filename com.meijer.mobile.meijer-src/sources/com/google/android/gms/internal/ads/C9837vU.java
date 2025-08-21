package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.vU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9837vU implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79910a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8647kH f79911b;

    public C9837vU(Context context, AbstractC8647kH abstractC8647kH) {
        this.f79910a = context;
        this.f79911b = abstractC8647kH;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        C9196pU c9196pU = new C9196pU(z50, (InterfaceC10295zm) c8767lT.f76666b, Gc.b.INTERSTITIAL);
        GG ggC = this.f79911b.c(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JG(c9196pU, null));
        c9196pU.b(ggC.b());
        ((BinderC8128fU) c8767lT.f76667c).C9(ggC.f());
        return ggC.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            ((InterfaceC10295zm) c8767lT.f76666b).q0(z50.f72860Z);
            ((InterfaceC10295zm) c8767lT.f76666b).A1(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f79910a), new BinderC9623tU(this, c8767lT, null), (InterfaceC6960Il) c8767lT.f76667c);
        } catch (RemoteException e10) {
            Rc.p0.l("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfcq(e10);
        }
    }
}
