package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.rU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9409rU implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78869a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8647kH f78870b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.a f78871c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f78872d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, final C8767lT c8767lT) throws zzfcq, zzegu {
        GG ggC = this.f78870b.c(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JG(new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.qU
            @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
            public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
                this.f78625a.c(c8767lT, z10, context, c8958nC);
            }
        }, null));
        ggC.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f78872d);
        ((BinderC8128fU) c8767lT.f76667c).C9(ggC.g());
        return ggC.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws JSONException, zzfcq, IOException {
        S60 s60 = (S60) c8767lT.f76666b;
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        String string = z50.f72903v.toString();
        String strM = Rc.U.m(z50.f72897s);
        s60.t(this.f78869a, c9695u60.f79578d, string, strM, (InterfaceC6960Il) c8767lT.f76667c);
    }

    final /* synthetic */ void c(C8767lT c8767lT, boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
        try {
            ((S60) c8767lT.f76666b).A(z10);
            if (this.f78871c.f34481c < ((Integer) Oc.A.c().a(C8784lf.f76979S0)).intValue()) {
                ((S60) c8767lT.f76666b).C();
            } else {
                ((S60) c8767lT.f76666b).D(context);
            }
        } catch (zzfcq e10) {
            Sc.p.f("Cannot show interstitial.");
            throw new zzdgb(e10.getCause());
        }
    }

    public C9409rU(Context context, Sc.a aVar, AbstractC8647kH abstractC8647kH, Executor executor) {
        this.f78869a = context;
        this.f78871c = aVar;
        this.f78870b = abstractC8647kH;
        this.f78872d = executor;
    }
}
