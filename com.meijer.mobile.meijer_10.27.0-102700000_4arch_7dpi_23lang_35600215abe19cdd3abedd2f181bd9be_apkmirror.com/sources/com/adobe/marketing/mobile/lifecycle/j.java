package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;

/* loaded from: classes4.dex */
class j {
    static v a(InterfaceC5078j.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar == InterfaceC5078j.a.TABLET ? v.TABLET : v.MOBILE;
    }

    static x b(String str) {
        if (!f6.i.a(str) && "application".equalsIgnoreCase(str)) {
            return x.APPLICATION;
        }
        return null;
    }
}
