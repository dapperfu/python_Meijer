package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class UT implements InterfaceC8963oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70616a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7153Ry f70617b;

    /* renamed from: c, reason: collision with root package name */
    private View f70618c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6937Ll f70619d;

    public UT(Context context, AbstractC7153Ry abstractC7153Ry) {
        this.f70616a = context;
        this.f70617b = abstractC7153Ry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final /* bridge */ /* synthetic */ Object a(C8608l60 c8608l60, final Z50 z50, final C8642lT c8642lT) throws zzfcq, zzegu {
        final View view;
        if (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) {
            try {
                view = (View) com.google.android.gms.dynamic.d.b2(this.f70619d.zze());
                boolean zZzf = this.f70619d.zzf();
                if (view == null) {
                    throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.RT
                            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                return this.f69873a.c(view, z50, obj);
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
            view = this.f70618c;
        }
        AbstractC8911ny abstractC8911nyA = this.f70617b.a(new C7154Rz(c8608l60, z50, c8642lT.f75825a), new C9552ty(view, null, new InterfaceC10089yz() { // from class: com.google.android.gms.internal.ads.QT
            @Override // com.google.android.gms.internal.ads.InterfaceC10089yz
            public final Mc.Y0 zza() throws zzfcq {
                try {
                    return ((InterfaceC10170zm) c8642lT.f75826b).zze();
                } catch (RemoteException e12) {
                    throw new zzfcq(e12);
                }
            }
        }, (C7435a60) z50.f72061u.get(0)));
        abstractC8911nyA.i().R0(view);
        ((BinderC8003fU) c8642lT.f75827c).C9(abstractC8911nyA.f());
        return abstractC8911nyA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8963oT
    public final void b(C8608l60 c8608l60, Z50 z50, C8642lT c8642lT) throws zzfcq {
        try {
            ((InterfaceC10170zm) c8642lT.f75826b).p0(z50.f72020Z);
            TT tt2 = null;
            if (((Boolean) Mc.A.c().a(C8659lf.f76020J7)).booleanValue() && z50.f72034g0) {
                ((InterfaceC10170zm) c8642lT.f75826b).O1(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f70616a), new ST(this, c8642lT, tt2), (InterfaceC6835Il) c8642lT.f75827c, c8608l60.f75748a.f74605a.f78739e);
            } else {
                ((InterfaceC10170zm) c8642lT.f75826b).n2(z50.f72015U, z50.f72063v.toString(), c8608l60.f75748a.f74605a.f78738d, com.google.android.gms.dynamic.d.F2(this.f70616a), new ST(this, c8642lT, tt2), (InterfaceC6835Il) c8642lT.f75827c, c8608l60.f75748a.f74605a.f78739e);
            }
        } catch (RemoteException e10) {
            throw new zzfcq(e10);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(View view, Z50 z50, Object obj) throws Exception {
        return Mj0.h(zzcql.a(this.f70616a, view, z50));
    }
}
