package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class OT implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69919a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7278Ry f69920b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f69921c;

    public OT(Context context, AbstractC7278Ry abstractC7278Ry, Executor executor) {
        this.f69919a = context;
        this.f69920b = abstractC7278Ry;
        this.f69921c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, final Z50 z50, C8767lT c8767lT) throws zzfcq, zzegu {
        final View viewF;
        if (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) {
            InterfaceC7062Ll interfaceC7062LlH = ((S60) c8767lT.f76666b).h();
            if (interfaceC7062LlH == null) {
                Sc.p.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) com.google.android.gms.dynamic.d.c2(interfaceC7062LlH.zze());
                boolean zZzf = interfaceC7062LlH.zzf();
                if (viewF == null) {
                    throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewF = (View) Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.LT
                            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                return this.f69209a.c(viewF, z50, obj);
                            }
                        }, C7033Kq.f69019f).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfcq(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfcq(e11);
            }
        } else {
            viewF = ((S60) c8767lT.f76666b).f();
        }
        AbstractC7278Ry abstractC7278Ry = this.f69920b;
        C7279Rz c7279Rz = new C7279Rz(c8733l60, z50, c8767lT.f76665a);
        final S60 s60 = (S60) c8767lT.f76666b;
        Objects.requireNonNull(s60);
        AbstractC9036ny abstractC9036nyA = abstractC7278Ry.a(c7279Rz, new C9677ty(viewF, null, new InterfaceC10214yz() { // from class: com.google.android.gms.internal.ads.NT
            @Override // com.google.android.gms.internal.ads.InterfaceC10214yz
            public final Oc.Y0 zza() {
                return s60.g();
            }
        }, (C7560a60) z50.f72901u.get(0)));
        abstractC9036nyA.i().R0(viewF);
        abstractC9036nyA.c().G0(new C7476Xw((S60) c8767lT.f76666b), this.f69921c);
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC9036nyA.g());
        return abstractC9036nyA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        Oc.d2 d2Var;
        Oc.d2 d2Var2 = c8733l60.f76588a.f75445a.f79579e;
        if (d2Var2.f23413n) {
            d2Var = new Oc.d2(this.f69919a, Gc.t.d(d2Var2.f23404e, d2Var2.f23401b));
        } else {
            d2Var = (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) ? new Oc.d2(this.f69919a, Gc.t.e(d2Var2.f23404e, d2Var2.f23401b)) : A60.a(this.f69919a, z50.f72901u);
        }
        Oc.d2 d2Var3 = d2Var;
        if (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) {
            Object obj = c8767lT.f76666b;
            ((S60) obj).s(this.f69919a, d2Var3, c8733l60.f76588a.f75445a.f79578d, z50.f72903v.toString(), Rc.U.m(z50.f72897s), (InterfaceC6960Il) c8767lT.f76667c);
            return;
        }
        Object obj2 = c8767lT.f76666b;
        ((S60) obj2).r(this.f69919a, d2Var3, c8733l60.f76588a.f75445a.f79578d, z50.f72903v.toString(), Rc.U.m(z50.f72897s), (InterfaceC6960Il) c8767lT.f76667c);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(View view, Z50 z50, Object obj) throws Exception {
        return Mj0.h(zzcql.a(this.f69919a, view, z50));
    }
}
