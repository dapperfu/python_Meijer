package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class NV implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68895a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f68896b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f68897c;

    public NV(Context context, Executor executor, DL dl2) {
        this.f68895a = context;
        this.f68896b = executor;
        this.f68897c = dl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) {
        try {
            ((S60) c8642lT.f75826b).p(c8608l60.f75748a.f74605a.f78738d, z50.f72063v.toString());
        } catch (Exception e10) {
            Qc.p.h("Fail to load ad from adapter ".concat(String.valueOf(c8642lT.f75825a)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, final C8642lT c8642lT) throws zzfcq, zzegu {
        AbstractC10131zL abstractC10131zLB = this.f68897c.b(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new AL(new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.JV
            @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
            public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
                C8642lT c8642lT2 = c8642lT;
                try {
                    ((S60) c8642lT2.f75826b).A(z10);
                    ((S60) c8642lT2.f75826b).a();
                } catch (zzfcq e10) {
                    Qc.p.h("Cannot show rewarded video.", e10);
                    throw new zzdgb(e10.getCause());
                }
            }
        }));
        abstractC10131zLB.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f68896b);
        IC icD = abstractC10131zLB.d();
        XB xbA = abstractC10131zLB.a();
        ((BinderC8110gU) c8642lT.f75827c).C9(new MV(this, abstractC10131zLB.h(), xbA, icD, abstractC10131zLB.i()));
        return abstractC10131zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        if (((S60) c8642lT.f75826b).c()) {
            e(c8608l60, z50, c8642lT);
            return;
        }
        ((BinderC8110gU) c8642lT.f75827c).D9(new LV(this, c8608l60, z50, c8642lT));
        Object obj = c8642lT.f75826b;
        Context context = this.f68895a;
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        ((S60) obj).m(context, c9570u60.f78738d, null, (InterfaceC7244Uo) c8642lT.f75827c, z50.f72063v.toString());
    }
}
