package Oc;

import Lc.v;
import Mc.A;
import Mc.InterfaceC4098a;
import Pc.D0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9812wN;
import com.google.android.gms.internal.ads.InterfaceC8201hG;

/* loaded from: classes4.dex */
public final class o {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10, C9812wN c9812wN) throws NumberFormatException {
        if (adOverlayInfoParcel.f64577k == 4 && adOverlayInfoParcel.f64569c == null) {
            InterfaceC4098a interfaceC4098a = adOverlayInfoParcel.f64568b;
            if (interfaceC4098a != null) {
                interfaceC4098a.v();
            }
            InterfaceC8201hG interfaceC8201hG = adOverlayInfoParcel.f64587u;
            if (interfaceC8201hG != null) {
                interfaceC8201hG.Z();
            }
            Activity activityZzi = adOverlayInfoParcel.f64570d.zzi();
            l lVar = adOverlayInfoParcel.f64567a;
            Context context2 = (lVar == null || !lVar.f23539j || activityZzi == null) ? context : activityZzi;
            v.l();
            l lVar2 = adOverlayInfoParcel.f64567a;
            a.b(context2, lVar2, adOverlayInfoParcel.f64575i, lVar2 != null ? lVar2.f23538i : null, c9812wN, adOverlayInfoParcel.f64583q);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f64579m.f29932d);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!com.google.android.gms.common.util.n.d()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) A.c().a(C8659lf.f76193Vc)).booleanValue()) {
            v.t();
            D0.x(context, intent, c9812wN, adOverlayInfoParcel.f64583q);
        } else {
            v.t();
            D0.t(context, intent);
        }
    }
}
