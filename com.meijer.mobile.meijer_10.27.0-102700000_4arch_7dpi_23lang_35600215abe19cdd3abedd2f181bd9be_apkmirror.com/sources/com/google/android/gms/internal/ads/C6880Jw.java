package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6880Jw implements InterfaceC9869ww {
    C6880Jw() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76442na)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Lc.v.s().j().y(Boolean.parseBoolean(str));
    }
}
