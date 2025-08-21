package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9410rV implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78873a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f78874b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f78875c;

    public C9410rV(Context context, Executor executor, DL dl2) {
        this.f78873a = context;
        this.f78874b = executor;
        this.f78875c = dl2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, final C8767lT c8767lT) throws zzfcq, zzegu {
        AbstractC10256zL abstractC10256zLB = this.f78875c.b(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new AL(new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.qV
            @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
            public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
                C8767lT c8767lT2 = c8767lT;
                try {
                    ((S60) c8767lT2.f76666b).A(z10);
                    ((S60) c8767lT2.f76666b).E(context);
                } catch (zzfcq e10) {
                    throw new zzdgb(e10.getCause());
                }
            }
        }));
        abstractC10256zLB.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f78874b);
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC10256zLB.n());
        return abstractC10256zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
            if (c9695u60.f79589o.f75082a == 3) {
                ((S60) c8767lT.f76666b).w(this.f78873a, c9695u60.f79578d, z50.f72903v.toString(), (InterfaceC6960Il) c8767lT.f76667c);
            } else {
                ((S60) c8767lT.f76666b).v(this.f78873a, c9695u60.f79578d, z50.f72903v.toString(), (InterfaceC6960Il) c8767lT.f76667c);
            }
        } catch (Exception e10) {
            Sc.p.h("Fail to load ad from adapter ".concat(String.valueOf(c8767lT.f76665a)), e10);
        }
    }
}
