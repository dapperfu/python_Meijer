package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class GU implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67202a;

    /* renamed from: b, reason: collision with root package name */
    private final GH f67203b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f67204c;

    public GU(Context context, GH gh2, Executor executor) {
        this.f67202a = context;
        this.f67203b = gh2;
        this.f67204c = executor;
    }

    private static final boolean c(C8608l60 c8608l60, int i10) {
        return c8608l60.f75748a.f74605a.f78741g.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        C9914xI c9914xII;
        C6970Ml c6970MlD = ((S60) c8642lT.f75826b).d();
        C7004Nl c7004NlE = ((S60) c8642lT.f75826b).e();
        InterfaceC7106Ql interfaceC7106QlI = ((S60) c8642lT.f75826b).i();
        if (interfaceC7106QlI != null && c(c8608l60, 6)) {
            c9914xII = C9914xI.g0(interfaceC7106QlI);
        } else if (c6970MlD != null && c(c8608l60, 6)) {
            c9914xII = C9914xI.J(c6970MlD);
        } else if (c6970MlD != null && c(c8608l60, 2)) {
            c9914xII = C9914xI.H(c6970MlD);
        } else if (c7004NlE != null && c(c8608l60, 6)) {
            c9914xII = C9914xI.K(c7004NlE);
        } else {
            if (c7004NlE == null || !c(c8608l60, 1)) {
                throw new zzegu(1, "No native ad mappers");
            }
            c9914xII = C9914xI.I(c7004NlE);
        }
        if (c9914xII != null) {
            C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
            if (c9570u60.f78741g.contains(Integer.toString(c9914xII.P()))) {
                AbstractC10128zI abstractC10128zID = this.f67203b.d(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JI(c9914xII), new EJ(c7004NlE, c6970MlD, interfaceC7106QlI));
                ((BinderC8003fU) c8642lT.f75827c).C9(abstractC10128zID.g());
                abstractC10128zID.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f67204c);
                return abstractC10128zID.h();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws JSONException, zzfcq, IOException {
        S60 s60 = (S60) c8642lT.f75826b;
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        String string = z50.f72063v.toString();
        String strM = Pc.U.m(z50.f72057s);
        InterfaceC6835Il interfaceC6835Il = (InterfaceC6835Il) c8642lT.f75827c;
        C9570u60 c9570u602 = c8608l60.f75748a.f74605a;
        s60.u(this.f67202a, c9570u60.f78738d, string, strM, interfaceC6835Il, c9570u602.f78743i, c9570u602.f78741g);
    }
}
