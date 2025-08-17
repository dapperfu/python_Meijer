package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9925xT implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79791a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7418Zx f79792b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f79793c;

    C9925xT(Context context, AbstractC7418Zx abstractC7418Zx, Executor executor) {
        this.f79791a = context;
        this.f79792b = abstractC7418Zx;
        this.f79793c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, Z50 z50, final C8642lT c8642lT) throws zzfcq, zzegu {
        AbstractC7286Vx abstractC7286VxA = this.f79792b.a(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new JG(new InterfaceC9377sH() { // from class: com.google.android.gms.internal.ads.wT
            @Override // com.google.android.gms.internal.ads.InterfaceC9377sH
            public final void a(boolean z10, Context context, C8833nC c8833nC) throws zzdgb {
                C8642lT c8642lT2 = c8642lT;
                try {
                    ((S60) c8642lT2.f75826b).A(z10);
                    ((S60) c8642lT2.f75826b).B(context);
                } catch (zzfcq e10) {
                    throw new zzdgb(e10.getCause());
                }
            }
        }, null), new C7319Wx(z50.f72022a0));
        abstractC7286VxA.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f79793c);
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC7286VxA.g());
        return abstractC7286VxA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        S60 s60 = (S60) c8642lT.f75826b;
        C9570u60 c9570u60 = c8608l60.f75748a.f74605a;
        String string = z50.f72063v.toString();
        s60.q(this.f79791a, c9570u60.f78738d, string, (InterfaceC6835Il) c8642lT.f75827c);
    }
}
