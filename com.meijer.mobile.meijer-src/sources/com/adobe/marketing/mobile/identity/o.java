package com.adobe.marketing.mobile.identity;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    static ArrayList<Integer> f63366a = new ArrayList<>(Arrays.asList(Integer.valueOf(HttpResponseStatus.ERROR_REQUEST_TIMEOUT), Integer.valueOf(HttpResponseStatus.ERROR_GATEWAY_TIMEOUT), Integer.valueOf(HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE)));

    static Map<String, String> a(boolean z10) {
        return b(z10, null);
    }

    static Map<String, String> b(boolean z10, String str) {
        HashMap map = new HashMap();
        if (!z10) {
            map.put("connection", "close");
        }
        if (g6.i.a(str)) {
            str = "application/x-www-form-urlencoded";
        }
        map.put("Content-Type", str);
        return map;
    }
}
