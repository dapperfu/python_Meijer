package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class OT implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69079a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7153Ry f69080b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f69081c;

    public OT(Context context, AbstractC7153Ry abstractC7153Ry, Executor executor) {
        this.f69079a = context;
        this.f69080b = abstractC7153Ry;
        this.f69081c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, final Z50 z50, C8642lT c8642lT) throws zzfcq, zzegu {
        final View viewF;
        if (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) {
            InterfaceC6937Ll interfaceC6937LlH = ((S60) c8642lT.f75826b).h();
            if (interfaceC6937LlH == null) {
                Qc.p.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) com.google.android.gms.dynamic.d.b2(interfaceC6937LlH.zze());
                boolean zZzf = interfaceC6937LlH.zzf();
                if (viewF == null) {
                    throw new zzfcq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewF = (View) Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.LT
                            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                return this.f68369a.c(viewF, z50, obj);
                            }
                        }, C6908Kq.f68179f).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfcq(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfcq(e11);
            }
        } else {
            viewF = ((S60) c8642lT.f75826b).f();
        }
        AbstractC7153Ry abstractC7153Ry = this.f69080b;
        C7154Rz c7154Rz = new C7154Rz(c8608l60, z50, c8642lT.f75825a);
        final S60 s60 = (S60) c8642lT.f75826b;
        Objects.requireNonNull(s60);
        AbstractC8911ny abstractC8911nyA = abstractC7153Ry.a(c7154Rz, new C9552ty(viewF, null, new InterfaceC10089yz() { // from class: com.google.android.gms.internal.ads.NT
            @Override // com.google.android.gms.internal.ads.InterfaceC10089yz
            public final Mc.Y0 zza() {
                return s60.g();
            }
        }, (C7435a60) z50.f72061u.get(0)));
        abstractC8911nyA.i().R0(viewF);
        abstractC8911nyA.c().H0(new C7351Xw((S60) c8642lT.f75826b), this.f69081c);
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC8911nyA.g());
        return abstractC8911nyA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        Mc.d2 d2Var;
        Mc.d2 d2Var2 = c8608l60.f75748a.f74605a.f78739e;
        if (d2Var2.f19226n) {
            d2Var = new Mc.d2(this.f69079a, Ec.t.d(d2Var2.f19217e, d2Var2.f19214b));
        } else {
            d2Var = (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) ? new Mc.d2(this.f69079a, Ec.t.e(d2Var2.f19217e, d2Var2.f19214b)) : A60.a(this.f69079a, z50.f72061u);
        }
        Mc.d2 d2Var3 = d2Var;
        if (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) {
            Object obj = c8642lT.f75826b;
            ((S60) obj).s(this.f69079a, d2Var3, c8608l60.f75748a.f74605a.f78738d, z50.f72063v.toString(), Pc.U.m(z50.f72057s), (InterfaceC6835Il) c8642lT.f75827c);
            return;
        }
        Object obj2 = c8642lT.f75826b;
        ((S60) obj2).r(this.f69079a, d2Var3, c8608l60.f75748a.f74605a.f78738d, z50.f72063v.toString(), Pc.U.m(z50.f72057s), (InterfaceC6835Il) c8642lT.f75827c);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(View view, Z50 z50, Object obj) throws Exception {
        return Mj0.h(zzcql.a(this.f69079a, view, z50));
    }
}
