package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class GU implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68042a;

    /* renamed from: b, reason: collision with root package name */
    private final GH f68043b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f68044c;

    public GU(Context context, GH gh2, Executor executor) {
        this.f68042a = context;
        this.f68043b = gh2;
        this.f68044c = executor;
    }

    private static final boolean c(C8733l60 c8733l60, int i10) {
        return c8733l60.f76588a.f75445a.f79581g.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        C10039xI c10039xII;
        C7095Ml c7095MlD = ((S60) c8767lT.f76666b).d();
        C7129Nl c7129NlE = ((S60) c8767lT.f76666b).e();
        InterfaceC7231Ql interfaceC7231QlI = ((S60) c8767lT.f76666b).i();
        if (interfaceC7231QlI != null && c(c8733l60, 6)) {
            c10039xII = C10039xI.g0(interfaceC7231QlI);
        } else if (c7095MlD != null && c(c8733l60, 6)) {
            c10039xII = C10039xI.J(c7095MlD);
        } else if (c7095MlD != null && c(c8733l60, 2)) {
            c10039xII = C10039xI.H(c7095MlD);
        } else if (c7129NlE != null && c(c8733l60, 6)) {
            c10039xII = C10039xI.K(c7129NlE);
        } else {
            if (c7129NlE == null || !c(c8733l60, 1)) {
                throw new zzegu(1, "No native ad mappers");
            }
            c10039xII = C10039xI.I(c7129NlE);
        }
        if (c10039xII != null) {
            C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
            if (c9695u60.f79581g.contains(Integer.toString(c10039xII.P()))) {
                AbstractC10253zI abstractC10253zID = this.f68043b.d(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JI(c10039xII), new EJ(c7129NlE, c7095MlD, interfaceC7231QlI));
                ((BinderC8128fU) c8767lT.f76667c).C9(abstractC10253zID.g());
                abstractC10253zID.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f68044c);
                return abstractC10253zID.h();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws JSONException, zzfcq, IOException {
        S60 s60 = (S60) c8767lT.f76666b;
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        String string = z50.f72903v.toString();
        String strM = Rc.U.m(z50.f72897s);
        InterfaceC6960Il interfaceC6960Il = (InterfaceC6960Il) c8767lT.f76667c;
        C9695u60 c9695u602 = c8733l60.f76588a.f75445a;
        s60.u(this.f68042a, c9695u60.f79578d, string, strM, interfaceC6960Il, c9695u602.f79583i, c9695u602.f79581g);
    }
}
