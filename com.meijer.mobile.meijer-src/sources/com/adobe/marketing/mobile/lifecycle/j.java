package com.adobe.marketing.mobile.lifecycle;

import R5.InterfaceC5123j;

/* loaded from: classes4.dex */
class j {
    static v a(InterfaceC5123j.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar == InterfaceC5123j.a.TABLET ? v.TABLET : v.MOBILE;
    }

    static x b(String str) {
        if (!g6.i.a(str) && "application".equalsIgnoreCase(str)) {
            return x.APPLICATION;
        }
        return null;
    }
}
