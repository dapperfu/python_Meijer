package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Jw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7005Jw implements InterfaceC9994ww {
    C7005Jw() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77282na)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Nc.v.s().j().y(Boolean.parseBoolean(str));
    }
}
