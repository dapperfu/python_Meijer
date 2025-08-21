package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9966wi implements InterfaceC7194Pi {
    C9966wi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            Rc.p0.k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        AbstractC7085Me0 abstractC7085Me0L = AbstractC7119Ne0.l();
        abstractC7085Me0L.b((String) map.get("appId"));
        abstractC7085Me0L.h(interfaceC9133ot.getWidth());
        abstractC7085Me0L.g(interfaceC9133ot.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            abstractC7085Me0L.d(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            abstractC7085Me0L.d(81);
        }
        if (map.containsKey("verticalMargin")) {
            abstractC7085Me0L.e(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            abstractC7085Me0L.e(0.02f);
        }
        if (map.containsKey("enifd")) {
            abstractC7085Me0L.a((String) map.get("enifd"));
        }
        try {
            Nc.v.n().j(interfaceC9133ot, abstractC7085Me0L.i());
        } catch (NullPointerException e10) {
            Nc.v.s().x(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            Rc.p0.k("Missing parameters for LMD Overlay show request");
        }
    }
}
