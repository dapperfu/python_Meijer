package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9673tw {

    /* renamed from: a, reason: collision with root package name */
    private final Map f79524a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f79525b;

    C9673tw(Map map, Map map2) {
        this.f79524a = map;
        this.f79525b = map2;
    }

    public final void a(C8733l60 c8733l60) throws Exception {
        for (C8414i60 c8414i60 : c8733l60.f76589b.f76178c) {
            if (this.f79524a.containsKey(c8414i60.f75721a) && c8414i60.f75722b != null) {
                ((InterfaceC10101xw) this.f79524a.get(c8414i60.f75721a)).a(c8414i60.f75722b);
            } else if (this.f79525b.containsKey(c8414i60.f75721a) && c8414i60.f75722b != null) {
                InterfaceC9994ww interfaceC9994ww = (InterfaceC9994ww) this.f79525b.get(c8414i60.f75721a);
                JSONObject jSONObject = c8414i60.f75722b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                interfaceC9994ww.a(map);
            }
        }
    }
}
