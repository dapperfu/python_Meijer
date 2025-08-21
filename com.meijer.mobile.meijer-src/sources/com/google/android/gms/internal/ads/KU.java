package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class KU implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68939a;

    /* renamed from: b, reason: collision with root package name */
    private final GH f68940b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7231Ql f68941c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f68942d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        if (!c8733l60.f76588a.f75445a.f79581g.contains(Integer.toString(6))) {
            throw new zzegu(2, "Unified must be used for RTB.");
        }
        C10039xI c10039xIG0 = C10039xI.g0(this.f68941c);
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        if (!c9695u60.f79581g.contains(Integer.toString(c10039xIG0.P()))) {
            throw new zzegu(1, "No corresponding native ad listener");
        }
        AbstractC10253zI abstractC10253zID = this.f68940b.d(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JI(c10039xIG0), new EJ(null, null, this.f68941c));
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC10253zID.f());
        return abstractC10253zID.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            ((InterfaceC10295zm) c8767lT.f76666b).q0(z50.f72860Z);
            JU ju2 = null;
            if (this.f68942d.f34481c < ((Integer) Oc.A.c().a(C8784lf.f76938P1)).intValue()) {
                ((InterfaceC10295zm) c8767lT.f76666b).c6(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f68939a), new IU(this, c8767lT, ju2), (InterfaceC6960Il) c8767lT.f76667c);
            } else {
                ((InterfaceC10295zm) c8767lT.f76666b).g3(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f68939a), new IU(this, c8767lT, ju2), (InterfaceC6960Il) c8767lT.f76667c, c8733l60.f76588a.f75445a.f79583i);
            }
        } catch (RemoteException e10) {
            throw new zzfcq(e10);
        }
    }

    public KU(Context context, GH gh2, Sc.a aVar) {
        this.f68939a = context;
        this.f68940b = gh2;
        this.f68942d = aVar;
    }
}
