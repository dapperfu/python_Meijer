package com.launchdarkly.sdk.android;

import java.util.ArrayList;
import java.util.Iterator;
import jh.C15034c;
import nh.InterfaceC15953k;

/* loaded from: classes8.dex */
abstract class j0 {
    static void a(InterfaceC15953k interfaceC15953k, C15034c c15034c) {
        if (interfaceC15953k.d("LaunchDarkly-migrations", "v4.0.0") != null) {
            return;
        }
        b(interfaceC15953k, c15034c);
        interfaceC15953k.a("LaunchDarkly-migrations", "v4.0.0", "v4.0.0");
    }

    static void b(InterfaceC15953k interfaceC15953k, C15034c c15034c) {
        ArrayList arrayList = new ArrayList();
        String strD = null;
        for (String str : interfaceC15953k.b()) {
            if (str.startsWith("LaunchDarkly-")) {
                arrayList.add(str);
                if (str.equals("LaunchDarkly-id")) {
                    strD = interfaceC15953k.d(str, "instanceId");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC15953k.e((String) it.next(), true);
        }
        if (strD != null) {
            new m0(interfaceC15953k, c15034c).m(com.launchdarkly.sdk.d.f92139b, strD);
        }
        if (arrayList.size() != 0) {
            c15034c.a("initialized v4.0.0 store schema and removed earlier SDK data");
        }
    }
}
