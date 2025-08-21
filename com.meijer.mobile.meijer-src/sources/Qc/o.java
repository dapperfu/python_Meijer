package Qc;

import Nc.v;
import Oc.A;
import Oc.InterfaceC4376a;
import Rc.D0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9937wN;
import com.google.android.gms.internal.ads.InterfaceC8326hG;

/* loaded from: classes4.dex */
public final class o {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10, C9937wN c9937wN) throws NumberFormatException {
        if (adOverlayInfoParcel.f65417k == 4 && adOverlayInfoParcel.f65409c == null) {
            InterfaceC4376a interfaceC4376a = adOverlayInfoParcel.f65408b;
            if (interfaceC4376a != null) {
                interfaceC4376a.v();
            }
            InterfaceC8326hG interfaceC8326hG = adOverlayInfoParcel.f65427u;
            if (interfaceC8326hG != null) {
                interfaceC8326hG.Z();
            }
            Activity activityZzi = adOverlayInfoParcel.f65410d.zzi();
            l lVar = adOverlayInfoParcel.f65407a;
            Context context2 = (lVar == null || !lVar.f28027j || activityZzi == null) ? context : activityZzi;
            v.l();
            l lVar2 = adOverlayInfoParcel.f65407a;
            a.b(context2, lVar2, adOverlayInfoParcel.f65415i, lVar2 != null ? lVar2.f28026i : null, c9937wN, adOverlayInfoParcel.f65423q);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f65419m.f34482d);
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
        if (((Boolean) A.c().a(C8784lf.f77033Vc)).booleanValue()) {
            v.t();
            D0.x(context, intent, c9937wN, adOverlayInfoParcel.f65423q);
        } else {
            v.t();
            D0.t(context, intent);
        }
    }
}
