package com.radiusnetworks.flybuy.api.network.common;

import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b {
    public static final LinkedHashMap a(b bVar, String str) {
        bVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Matcher matcher = ApiSuccessResponse.LINK_PATTERN.matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 2) {
                String strGroup = matcher.group(2);
                Intrinsics.i(strGroup, "group(...)");
                String strGroup2 = matcher.group(1);
                Intrinsics.i(strGroup2, "group(...)");
                linkedHashMap.put(strGroup, strGroup2);
            }
        }
        return linkedHashMap;
    }
}
