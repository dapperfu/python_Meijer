package com.launchdarkly.sdk.android;

import ih.C14724c;
import java.util.ArrayList;
import java.util.Iterator;
import mh.InterfaceC15630k;

/* loaded from: classes7.dex */
abstract class j0 {
    static void a(InterfaceC15630k interfaceC15630k, C14724c c14724c) {
        if (interfaceC15630k.d("LaunchDarkly-migrations", "v4.0.0") != null) {
            return;
        }
        b(interfaceC15630k, c14724c);
        interfaceC15630k.a("LaunchDarkly-migrations", "v4.0.0", "v4.0.0");
    }

    static void b(InterfaceC15630k interfaceC15630k, C14724c c14724c) {
        ArrayList arrayList = new ArrayList();
        String strD = null;
        for (String str : interfaceC15630k.b()) {
            if (str.startsWith("LaunchDarkly-")) {
                arrayList.add(str);
                if (str.equals("LaunchDarkly-id")) {
                    strD = interfaceC15630k.d(str, "instanceId");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            interfaceC15630k.e((String) it.next(), true);
        }
        if (strD != null) {
            new m0(interfaceC15630k, c14724c).m(com.launchdarkly.sdk.d.f91300b, strD);
        }
        if (arrayList.size() != 0) {
            c14724c.a("initialized v4.0.0 store schema and removed earlier SDK data");
        }
    }
}
