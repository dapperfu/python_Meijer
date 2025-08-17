package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9285rV implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78033a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f78034b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f78035c;

    public C9285rV(Context context, Executor executor, DL dl2) {
        this.f78033a = context;
        this.f78034b = executor;
        this.f78035c = dl2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, final C8642lT c8642lT) throws zzfcq, zzegu {
        AbstractC10131zL abstractC10131zLB = this.f78035c.b(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new AL(new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.qV
            @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
            public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
                C8642lT c8642lT2 = c8642lT;
                try {
                    ((S60) c8642lT2.f75826b).A(z10);
                    ((S60) c8642lT2.f75826b).E(context);
                } catch (zzfcq e10) {
                    throw new zzdgb(e10.getCause());
                }
            }
        }));
        abstractC10131zLB.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f78034b);
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC10131zLB.n());
        return abstractC10131zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
            if (c9570u60.f78749o.f74242a == 3) {
                ((S60) c8642lT.f75826b).w(this.f78033a, c9570u60.f78738d, z50.f72063v.toString(), (InterfaceC6835Il) c8642lT.f75827c);
            } else {
                ((S60) c8642lT.f75826b).v(this.f78033a, c9570u60.f78738d, z50.f72063v.toString(), (InterfaceC6835Il) c8642lT.f75827c);
            }
        } catch (Exception e10) {
            Qc.p.h("Fail to load ad from adapter ".concat(String.valueOf(c8642lT.f75825a)), e10);
        }
    }
}
