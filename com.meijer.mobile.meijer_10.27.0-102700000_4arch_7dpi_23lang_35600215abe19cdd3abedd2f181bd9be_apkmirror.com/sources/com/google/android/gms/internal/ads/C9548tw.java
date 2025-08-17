package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9548tw {

    /* renamed from: a, reason: collision with root package name */
    private final Map f78684a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f78685b;

    C9548tw(Map map, Map map2) {
        this.f78684a = map;
        this.f78685b = map2;
    }

    public final void a(C8608l60 c8608l60) throws Exception {
        for (C8289i60 c8289i60 : c8608l60.f75749b.f75338c) {
            if (this.f78684a.containsKey(c8289i60.f74881a) && c8289i60.f74882b != null) {
                ((InterfaceC9976xw) this.f78684a.get(c8289i60.f74881a)).a(c8289i60.f74882b);
            } else if (this.f78685b.containsKey(c8289i60.f74881a) && c8289i60.f74882b != null) {
                InterfaceC9869ww interfaceC9869ww = (InterfaceC9869ww) this.f78685b.get(c8289i60.f74881a);
                JSONObject jSONObject = c8289i60.f74882b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                interfaceC9869ww.a(map);
            }
        }
    }
}
