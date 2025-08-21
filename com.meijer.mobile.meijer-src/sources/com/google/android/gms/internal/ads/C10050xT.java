package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10050xT implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80631a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7543Zx f80632b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f80633c;

    C10050xT(Context context, AbstractC7543Zx abstractC7543Zx, Executor executor) {
        this.f80631a = context;
        this.f80632b = abstractC7543Zx;
        this.f80633c = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, Z50 z50, final C8767lT c8767lT) throws zzfcq, zzegu {
        AbstractC7411Vx abstractC7411VxA = this.f80632b.a(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new JG(new InterfaceC9502sH() { // from class: com.google.android.gms.internal.ads.wT
            @Override // com.google.android.gms.internal.ads.InterfaceC9502sH
            public final void a(boolean z10, Context context, C8958nC c8958nC) throws zzdgb {
                C8767lT c8767lT2 = c8767lT;
                try {
                    ((S60) c8767lT2.f76666b).A(z10);
                    ((S60) c8767lT2.f76666b).B(context);
                } catch (zzfcq e10) {
                    throw new zzdgb(e10.getCause());
                }
            }
        }, null), new C7444Wx(z50.f72862a0));
        abstractC7411VxA.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f80633c);
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC7411VxA.g());
        return abstractC7411VxA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        S60 s60 = (S60) c8767lT.f76666b;
        C9695u60 c9695u60 = c8733l60.f76588a.f75445a;
        String string = z50.f72903v.toString();
        s60.q(this.f80631a, c9695u60.f79578d, string, (InterfaceC6960Il) c8767lT.f76667c);
    }
}
