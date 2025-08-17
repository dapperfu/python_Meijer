package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9841wi implements InterfaceC7069Pi {
    C9841wi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            Pc.p0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        AbstractC6960Me0 abstractC6960Me0L = AbstractC6994Ne0.l();
        abstractC6960Me0L.b((String) map.get("appId"));
        abstractC6960Me0L.h(interfaceC9008ot.getWidth());
        abstractC6960Me0L.g(interfaceC9008ot.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            abstractC6960Me0L.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            abstractC6960Me0L.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            abstractC6960Me0L.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            abstractC6960Me0L.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            abstractC6960Me0L.a((String) map.get("enifd"));
        }
        try {
            Lc.v.n().j(interfaceC9008ot, abstractC6960Me0L.i());
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            Pc.p0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
