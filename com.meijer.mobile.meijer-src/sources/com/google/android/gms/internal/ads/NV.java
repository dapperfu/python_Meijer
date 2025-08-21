package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class NV implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69735a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f69736b;

    /* renamed from: c, reason: collision with root package name */
    private final DL f69737c;

    public NV(Context context, Executor executor, DL dl2) {
        this.f69735a = context;
        this.f69736b = executor;
        this.f69737c = dl2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) {
        try {
            ((S60) c8767lT.f76666b).p(c8733l60.f76588a.f75445a.f79578d, z50.f72903v.toString());
        } catch (Exception e10) {
            Sc.p.h("Fail to load ad from adapter ".concat(String.valueOf(c8767lT.f76665a)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, final C8767lT c8767lT) throws zzfcq, zzegu {
        AbstractC10256zL abstractC10256zLB = this.f69737c.b(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new AL(new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.JV
            @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
            public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
                C8767lT c8767lT2 = c8767lT;
                try {
                    ((S60) c8767lT2.f76666b).A(z10);
                    ((S60) c8767lT2.f76666b).a();
                } catch (zzfcq e10) {
                    Sc.p.h("Cannot show rewarded video.", e10);
                    throw new zzdgb(e10.getCause());
                }
            }
        }));
        abstractC10256zLB.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f69736b);
        IC icD = abstractC10256zLB.d();
        XB xbA = abstractC10256zLB.a();
        ((BinderC8235gU) c8767lT.f76667c).C9(new MV(this, abstractC10256zLB.h(), xbA, icD, abstractC10256zLB.i()));
        return abstractC10256zLB.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        if (((S60) c8767lT.f76666b).c()) {
            e(c8733l60, z50, c8767lT);
            return;
        }
        ((BinderC8235gU) c8767lT.f76667c).D9(new LV(this, c8733l60, z50, c8767lT));
        Object obj = c8767lT.f76666b;
        Context context = this.f69735a;
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        ((S60) obj).m(context, c9695u60.f79578d, null, (InterfaceC7369Uo) c8767lT.f76667c, z50.f72903v.toString());
    }
}
