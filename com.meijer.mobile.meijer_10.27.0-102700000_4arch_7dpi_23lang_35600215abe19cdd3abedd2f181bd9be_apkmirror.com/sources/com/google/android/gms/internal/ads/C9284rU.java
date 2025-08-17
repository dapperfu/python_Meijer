package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9284rU implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78029a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8522kH f78030b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.a f78031c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f78032d;

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, final C8642lT c8642lT) throws zzfcq, zzegu {
        GG ggC = this.f78030b.c(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JG(new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.qU
            @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
            public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
                this.f77785a.c(c8642lT, z10, context, c8833nC);
            }
        }, null));
        ggC.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f78032d);
        ((BinderC8003fU) c8642lT.f75827c).C9(ggC.g());
        return ggC.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws JSONException, zzfcq, IOException {
        S60 s60 = (S60) c8642lT.f75826b;
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        String string = z50.f72063v.toString();
        String strM = Pc.U.m(z50.f72057s);
        s60.t(this.f78029a, c9570u60.f78738d, string, strM, (InterfaceC6835Il) c8642lT.f75827c);
    }

    final /* synthetic */ void c(C8642lT c8642lT, boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
        try {
            ((S60) c8642lT.f75826b).A(z10);
            if (this.f78031c.f29931c < ((Integer) Mc.A.c().a(C8659lf.f76139S0)).intValue()) {
                ((S60) c8642lT.f75826b).C();
            } else {
                ((S60) c8642lT.f75826b).D(context);
            }
        } catch (zzfcq e10) {
            Qc.p.f("Cannot show interstitial.");
            throw new zzdgb(e10.getCause());
        }
    }

    public C9284rU(Context context, Qc.a aVar, AbstractC8522kH abstractC8522kH, Executor executor) {
        this.f78029a = context;
        this.f78031c = aVar;
        this.f78030b = abstractC8522kH;
        this.f78032d = executor;
    }
}
