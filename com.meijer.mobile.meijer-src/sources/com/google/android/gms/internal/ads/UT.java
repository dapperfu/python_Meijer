package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public final class UT implements InterfaceC9088oT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71456a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7278Ry f71457b;

    /* renamed from: c, reason: collision with root package name */
    private View f71458c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7062Ll f71459d;

    public UT(Context context, AbstractC7278Ry abstractC7278Ry) {
        this.f71456a = context;
        this.f71457b = abstractC7278Ry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final /* bridge */ /* synthetic */ Object a(C8733l60 c8733l60, final Z50 z50, final C8767lT c8767lT) throws zzfcq, zzegu {
        final View view;
        if (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) {
            try {
                view = (View) com.google.android.gms.dynamic.d.c2(this.f71459d.zze());
                boolean zZzf = this.f71459d.zzf();
                if (view == null) {
                    throw new zzfcq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.RT
                            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                return this.f70713a.c(view, z50, obj);
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
            view = this.f71458c;
        }
        AbstractC9036ny abstractC9036nyA = this.f71457b.a(new C7279Rz(c8733l60, z50, c8767lT.f76665a), new C9677ty(view, null, new InterfaceC10214yz() { // from class: com.google.android.gms.internal.ads.QT
            @Override // com.google.android.gms.internal.ads.InterfaceC10214yz
            public final Oc.Y0 zza() throws zzfcq {
                try {
                    return ((InterfaceC10295zm) c8767lT.f76666b).zze();
                } catch (RemoteException e12) {
                    throw new zzfcq(e12);
                }
            }
        }, (C7560a60) z50.f72901u.get(0)));
        abstractC9036nyA.i().R0(view);
        ((BinderC8128fU) c8767lT.f76667c).C9(abstractC9036nyA.f());
        return abstractC9036nyA.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9088oT
    public final void b(C8733l60 c8733l60, Z50 z50, C8767lT c8767lT) throws zzfcq {
        try {
            ((InterfaceC10295zm) c8767lT.f76666b).q0(z50.f72860Z);
            TT tt2 = null;
            if (((Boolean) Oc.A.c().a(C8784lf.f76860J7)).booleanValue() && z50.f72874g0) {
                ((InterfaceC10295zm) c8767lT.f76666b).m1(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f71456a), new ST(this, c8767lT, tt2), (InterfaceC6960Il) c8767lT.f76667c, c8733l60.f76588a.f75445a.f79579e);
            } else {
                ((InterfaceC10295zm) c8767lT.f76666b).G1(z50.f72855U, z50.f72903v.toString(), c8733l60.f76588a.f75445a.f79578d, com.google.android.gms.dynamic.d.I2(this.f71456a), new ST(this, c8767lT, tt2), (InterfaceC6960Il) c8767lT.f76667c, c8733l60.f76588a.f75445a.f79579e);
            }
        } catch (RemoteException e10) {
            throw new zzfcq(e10);
        }
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(View view, Z50 z50, Object obj) throws Exception {
        return Mj0.h(zzcql.a(this.f71456a, view, z50));
    }
}
