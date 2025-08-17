package com.google.android.gms.ads.internal;

import Lc.u;
import Mc.AbstractBinderC4129k0;
import Mc.InterfaceC4111e0;
import Mc.InterfaceC4161v0;
import Mc.Q;
import Mc.Q0;
import Mc.V;
import Mc.d2;
import Oc.c;
import Oc.g;
import Oc.i;
import Oc.j;
import Oc.r;
import Qc.a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.ads.AbstractC9010ou;
import com.google.android.gms.internal.ads.GW;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC6940Lo;
import com.google.android.gms.internal.ads.InterfaceC7540b50;
import com.google.android.gms.internal.ads.InterfaceC7703ch;
import com.google.android.gms.internal.ads.InterfaceC7719cp;
import com.google.android.gms.internal.ads.InterfaceC8237hh;
import com.google.android.gms.internal.ads.InterfaceC8318iO;
import com.google.android.gms.internal.ads.InterfaceC8361iq;
import com.google.android.gms.internal.ads.InterfaceC8390j40;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9202qj;
import com.google.android.gms.internal.ads.InterfaceC9415sj;
import com.google.android.gms.internal.ads.InterfaceC9457t30;
import com.google.android.gms.internal.ads.InterfaceC9530tn;
import com.google.android.gms.internal.ads.RI;
import com.google.android.gms.internal.ads.S50;
import com.google.android.gms.internal.ads.UI;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ClientApi extends AbstractBinderC4129k0 {
    @Override // Mc.InterfaceC4132l0
    public final InterfaceC7719cp D2(b bVar, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        S50 s50C = AbstractC9010ou.i(context, interfaceC6631Cl, i10).C();
        s50C.a(context);
        s50C.zza(str);
        return s50C.zzc().zza();
    }

    @Override // Mc.InterfaceC4132l0
    public final V D4(b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        InterfaceC9457t30 interfaceC9457t30Z = AbstractC9010ou.i(context, interfaceC6631Cl, i10).z();
        interfaceC9457t30Z.zza(str);
        interfaceC9457t30Z.a(context);
        return interfaceC9457t30Z.zzc().zza();
    }

    @Override // Mc.InterfaceC4132l0
    public final Q F7(b bVar, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        return new GW(AbstractC9010ou.i(context, interfaceC6631Cl, i10), context, str);
    }

    @Override // Mc.InterfaceC4132l0
    public final Q0 J1(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        return AbstractC9010ou.i((Context) d.b2(bVar), interfaceC6631Cl, i10).t();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC7703ch K2(b bVar, b bVar2) {
        return new UI((FrameLayout) d.b2(bVar), (FrameLayout) d.b2(bVar2), 244410000);
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC8361iq L5(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        return AbstractC9010ou.i((Context) d.b2(bVar), interfaceC6631Cl, i10).x();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC4111e0 P2(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        return AbstractC9010ou.i((Context) d.b2(bVar), interfaceC6631Cl, i10).b();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC9415sj Q3(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10, InterfaceC9202qj interfaceC9202qj) {
        Context context = (Context) d.b2(bVar);
        InterfaceC8318iO interfaceC8318iOR = AbstractC9010ou.i(context, interfaceC6631Cl, i10).r();
        interfaceC8318iOR.a(context);
        interfaceC8318iOR.b(interfaceC9202qj);
        return interfaceC8318iOR.zzc().zzd();
    }

    @Override // Mc.InterfaceC4132l0
    public final V S4(b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        InterfaceC8390j40 interfaceC8390j40A = AbstractC9010ou.i(context, interfaceC6631Cl, i10).A();
        interfaceC8390j40A.zzc(context);
        interfaceC8390j40A.a(d2Var);
        interfaceC8390j40A.d(str);
        return interfaceC8390j40A.zzd().zza();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC6940Lo U6(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        S50 s50C = AbstractC9010ou.i(context, interfaceC6631Cl, i10).C();
        s50C.a(context);
        return s50C.zzc().zzb();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC4161v0 j4(b bVar, int i10) {
        return AbstractC9010ou.i((Context) d.b2(bVar), null, i10).j();
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC8675ln k8(b bVar, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        return AbstractC9010ou.i((Context) d.b2(bVar), interfaceC6631Cl, i10).u();
    }

    @Override // Mc.InterfaceC4132l0
    public final V w3(b bVar, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl, int i10) {
        Context context = (Context) d.b2(bVar);
        InterfaceC7540b50 interfaceC7540b50B = AbstractC9010ou.i(context, interfaceC6631Cl, i10).B();
        interfaceC7540b50B.zzc(context);
        interfaceC7540b50B.a(d2Var);
        interfaceC7540b50B.d(str);
        return interfaceC7540b50B.zzd().zza();
    }

    @Override // Mc.InterfaceC4132l0
    public final V x3(b bVar, d2 d2Var, String str, int i10) {
        return new u((Context) d.b2(bVar), d2Var, str, new a(244410000, i10, true, false));
    }

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC9530tn y(b bVar) {
        Activity activity = (Activity) d.b2(bVar);
        AdOverlayInfoParcel adOverlayInfoParcelB = AdOverlayInfoParcel.B(activity.getIntent());
        if (adOverlayInfoParcelB == null) {
            return new m(activity);
        }
        int i10 = adOverlayInfoParcelB.f64577k;
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

    @Override // Mc.InterfaceC4132l0
    public final InterfaceC8237hh zzk(b bVar, b bVar2, b bVar3) {
        return new RI((View) d.b2(bVar), (HashMap) d.b2(bVar2), (HashMap) d.b2(bVar3));
    }
}
