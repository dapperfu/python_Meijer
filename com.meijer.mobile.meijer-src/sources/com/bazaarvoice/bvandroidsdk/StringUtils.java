package com.bazaarvoice.bvandroidsdk;

import java.util.List;

/* loaded from: classes4.dex */
class StringUtils {
    static String componentsSeparatedBy(List list, String str) {
        return componentsSeparatedBy(list, str, false);
    }

    static String componentsSeparatedByWithEscapes(List list, String str) {
        return componentsSeparatedBy(list, str, true);
    }

    private static String bvCustomEscape(String str) {
        return str.replace(",", "\\,").replace(":", "\\:").replace("&", "%26");
    }

    private static String componentsSeparatedBy(List list, String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (obj != null) {
                String string = obj.toString();
                if (z10) {
                    string = bvCustomEscape(string);
                }
                sb2.append(string);
                if (i10 < list.size() - 1) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    StringUtils() {
    }
}
