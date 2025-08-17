package com.medallia.digital.mobilesdk;

import android.webkit.URLUtil;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
final class q2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f92722a = "file://";

    /* renamed from: b, reason: collision with root package name */
    private static final int f92723b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final String f92724c = "/";

    q2() {
    }

    protected static String a(String str) {
        String host;
        try {
            return (!URLUtil.isValidUrl(str) || (host = new URL(str).getHost()) == null) ? str : host.startsWith("www.") ? host.substring(4) : host;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return str;
        }
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(f92724c);
        return str.equals(sb2.toString());
    }

    protected static boolean a(String str, boolean z10, ArrayList<String> arrayList, String str2, FormTriggerType formTriggerType) {
        if (str.startsWith(f92722a)) {
            return false;
        }
        if (z10) {
            return true;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            String strA = a(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (a(str, next) || strA.endsWith(next)) {
                }
            }
            return true;
        }
        Broadcasts.d.a(Broadcasts.d.a.formLinkSelected, str2, formTriggerType, str);
        return false;
    }
}
