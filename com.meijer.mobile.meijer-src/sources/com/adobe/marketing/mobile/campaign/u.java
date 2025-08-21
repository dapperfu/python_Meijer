package com.adobe.marketing.mobile.campaign;

import android.content.Context;
import g6.C14328a;
import java.util.Map;

/* loaded from: classes4.dex */
class u extends l {

    /* renamed from: d, reason: collision with root package name */
    String f63295d;

    /* renamed from: e, reason: collision with root package name */
    String f63296e;

    /* renamed from: f, reason: collision with root package name */
    String f63297f;

    /* renamed from: g, reason: collision with root package name */
    Map<String, Object> f63298g;

    /* renamed from: h, reason: collision with root package name */
    int f63299h;

    /* renamed from: i, reason: collision with root package name */
    long f63300i;

    /* renamed from: j, reason: collision with root package name */
    String f63301j;

    /* renamed from: k, reason: collision with root package name */
    Context f63302k;

    @Override // com.adobe.marketing.mobile.campaign.l
    void h() {
        i();
        Map<String, Object> map = this.f63298g;
        if (map != null && !map.isEmpty() && this.f63298g.containsKey("broadlogId") && this.f63298g.containsKey("deliveryId")) {
            String strO = C14328a.o(this.f63298g, "broadlogId", "");
            String strO2 = C14328a.o(this.f63298g, "deliveryId", "");
            if (g6.i.a(strO) && g6.i.a(strO2)) {
                R5.t.a("Campaign", "LocalNotificationMessage", "showMessage -  Cannot dispatch message info because broadlogid and/or deliveryid are empty.", new Object[0]);
            } else {
                R5.t.e("Campaign", "LocalNotificationMessage", "showMessage -  Calling dispatch message Info with broadlogId(%s) and deliveryId(%s) for the triggered message.", strO, strO2);
                a(strO, strO2, "7");
            }
        }
        w wVarA = w.a(this.f63258a, this.f63295d, this.f63300i, this.f63299h, this.f63296e, this.f63298g, this.f63297f, this.f63301j);
        R5.t.a("Campaign", "LocalNotificationMessage", "showMessage -  Scheduling local notification message with ID (%s)", this.f63258a);
        v.a(this.f63302k, wVarA);
    }
}
