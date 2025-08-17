package com.adobe.marketing.mobile.campaign;

import android.content.Context;
import f6.C13845a;
import java.util.Map;

/* loaded from: classes4.dex */
class u extends l {

    /* renamed from: d, reason: collision with root package name */
    String f62456d;

    /* renamed from: e, reason: collision with root package name */
    String f62457e;

    /* renamed from: f, reason: collision with root package name */
    String f62458f;

    /* renamed from: g, reason: collision with root package name */
    Map<String, Object> f62459g;

    /* renamed from: h, reason: collision with root package name */
    int f62460h;

    /* renamed from: i, reason: collision with root package name */
    long f62461i;

    /* renamed from: j, reason: collision with root package name */
    String f62462j;

    /* renamed from: k, reason: collision with root package name */
    Context f62463k;

    @Override // com.adobe.marketing.mobile.campaign.l
    void h() {
        i();
        Map<String, Object> map = this.f62459g;
        if (map != null && !map.isEmpty() && this.f62459g.containsKey("broadlogId") && this.f62459g.containsKey("deliveryId")) {
            String strO = C13845a.o(this.f62459g, "broadlogId", "");
            String strO2 = C13845a.o(this.f62459g, "deliveryId", "");
            if (f6.i.a(strO) && f6.i.a(strO2)) {
                Q5.t.a("Campaign", "LocalNotificationMessage", "showMessage -  Cannot dispatch message info because broadlogid and/or deliveryid are empty.", new Object[0]);
            } else {
                Q5.t.e("Campaign", "LocalNotificationMessage", "showMessage -  Calling dispatch message Info with broadlogId(%s) and deliveryId(%s) for the triggered message.", strO, strO2);
                a(strO, strO2, "7");
            }
        }
        w wVarA = w.a(this.f62419a, this.f62456d, this.f62461i, this.f62460h, this.f62457e, this.f62459g, this.f62458f, this.f62462j);
        Q5.t.a("Campaign", "LocalNotificationMessage", "showMessage -  Scheduling local notification message with ID (%s)", this.f62419a);
        v.a(this.f62463k, wVarA);
    }
}
