package com.google.android.gms.ads.internal;

import Nc.u;
import Oc.AbstractBinderC4407k0;
import Oc.InterfaceC4389e0;
import Oc.InterfaceC4439v0;
import Oc.Q;
import Oc.Q0;
import Oc.V;
import Oc.d2;
import Qc.c;
import Qc.g;
import Qc.i;
import Qc.j;
import Qc.r;
import Sc.a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.AbstractC9135ou;
import com.google.android.gms.internal.ads.GW;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7065Lo;
import com.google.android.gms.internal.ads.InterfaceC7665b50;
import com.google.android.gms.internal.ads.InterfaceC7828ch;
import com.google.android.gms.internal.ads.InterfaceC7844cp;
import com.google.android.gms.internal.ads.InterfaceC8362hh;
import com.google.android.gms.internal.ads.InterfaceC8443iO;
import com.google.android.gms.internal.ads.InterfaceC8486iq;
import com.google.android.gms.internal.ads.InterfaceC8515j40;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9327qj;
import com.google.android.gms.internal.ads.InterfaceC9540sj;
import com.google.android.gms.internal.ads.InterfaceC9582t30;
import com.google.android.gms.internal.ads.InterfaceC9655tn;
import com.google.android.gms.internal.ads.RI;
import com.google.android.gms.internal.ads.S50;
import com.google.android.gms.internal.ads.UI;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ClientApi extends AbstractBinderC4407k0 {
    @Override // Oc.InterfaceC4410l0
    public final V B4(b bVar, d2 d2Var, String str, int i10) {
        return new u((Context) d.c2(bVar), d2Var, str, new a(244410000, i10, true, false));
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC7844cp G2(b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        S50 s50C = AbstractC9135ou.i(context, interfaceC6756Cl, i10).C();
        s50C.a(context);
        s50C.zza(str);
        return s50C.zzc().zza();
    }

    @Override // Oc.InterfaceC4410l0
    public final Q J7(b bVar, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        return new GW(AbstractC9135ou.i(context, interfaceC6756Cl, i10), context, str);
    }

    @Override // Oc.InterfaceC4410l0
    public final V O7(b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        InterfaceC7665b50 interfaceC7665b50B = AbstractC9135ou.i(context, interfaceC6756Cl, i10).B();
        interfaceC7665b50B.zzc(context);
        interfaceC7665b50B.a(d2Var);
        interfaceC7665b50B.d(str);
        return interfaceC7665b50B.zzd().zza();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC7828ch P2(b bVar, b bVar2) {
        return new UI((FrameLayout) d.c2(bVar), (FrameLayout) d.c2(bVar2), 244410000);
    }

    @Override // Oc.InterfaceC4410l0
    public final Q0 Q1(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        return AbstractC9135ou.i((Context) d.c2(bVar), interfaceC6756Cl, i10).t();
    }

    @Override // Oc.InterfaceC4410l0
    public final V T2(b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        InterfaceC8515j40 interfaceC8515j40A = AbstractC9135ou.i(context, interfaceC6756Cl, i10).A();
        interfaceC8515j40A.zzc(context);
        interfaceC8515j40A.a(d2Var);
        interfaceC8515j40A.d(str);
        return interfaceC8515j40A.zzd().zza();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC8486iq U5(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        return AbstractC9135ou.i((Context) d.c2(bVar), interfaceC6756Cl, i10).x();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC4389e0 W2(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        return AbstractC9135ou.i((Context) d.c2(bVar), interfaceC6756Cl, i10).b();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC9540sj c4(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10, InterfaceC9327qj interfaceC9327qj) {
        Context context = (Context) d.c2(bVar);
        InterfaceC8443iO interfaceC8443iOR = AbstractC9135ou.i(context, interfaceC6756Cl, i10).r();
        interfaceC8443iOR.a(context);
        interfaceC8443iOR.b(interfaceC9327qj);
        return interfaceC8443iOR.zzc().zzd();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC7065Lo f7(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        S50 s50C = AbstractC9135ou.i(context, interfaceC6756Cl, i10).C();
        s50C.a(context);
        return s50C.zzc().zzb();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC8800ln h8(b bVar, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        return AbstractC9135ou.i((Context) d.c2(bVar), interfaceC6756Cl, i10).u();
    }

    @Override // Oc.InterfaceC4410l0
    public final V r2(b bVar, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl, int i10) {
        Context context = (Context) d.c2(bVar);
        InterfaceC9582t30 interfaceC9582t30Z = AbstractC9135ou.i(context, interfaceC6756Cl, i10).z();
        interfaceC9582t30Z.zza(str);
        interfaceC9582t30Z.a(context);
        return interfaceC9582t30Z.zzc().zza();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC4439v0 x4(b bVar, int i10) {
        return AbstractC9135ou.i((Context) d.c2(bVar), null, i10).j();
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC9655tn y(b bVar) {
        Activity activity = (Activity) d.c2(bVar);
        AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.B(activity.getIntent());
        if (adOverlayInfoParcelB == null) {
            return new m(activity);
        }
        int i10 = adOverlayInfoParcelB.f65417k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new m(activity);
                        }
                        return new g(activity);
                    }
                    return new c(activity, adOverlayInfoParcelB);
                }
                return new j(activity);
            }
            return new i(activity);
        }
        return new r(activity);
    }

    @Override // Oc.InterfaceC4410l0
    public final InterfaceC8362hh zzk(b bVar, b bVar2, b bVar3) {
        return new RI((View) d.c2(bVar), (HashMap) d.c2(bVar2), (HashMap) d.c2(bVar3));
    }
}
