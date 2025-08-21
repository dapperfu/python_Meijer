package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.app.Application;
import android.net.ParseException;
import android.net.Uri;
import com.adobe.marketing.mobile.assurance.internal.ui.AssuranceActivity;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f62976a = new HashSet<>(Arrays.asList("clientId", "orgId", "sessionId", "token"));

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f62977b = Pattern.compile("(connect)(-)?(.*)(\\.griffon\\.adobe\\.com)");

    static String d(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("adb_validation_sessionid");
        if (g6.i.a(queryParameter)) {
            return null;
        }
        if (UUID.fromString(queryParameter).toString().equals(queryParameter)) {
            return queryParameter;
        }
        return null;
    }

    static boolean i(String str) {
        if (str == null) {
            return true;
        }
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (!n(scheme) || !l(host, path) || !e(uri)) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("sessionId");
        if (queryParameter != null && !p(queryParameter)) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("clientId");
        if (queryParameter2 != null && !p(queryParameter2)) {
            return false;
        }
        String queryParameter3 = uri.getQueryParameter("orgId");
        if (queryParameter3 != null && !m(queryParameter3)) {
            return false;
        }
        String queryParameter4 = uri.getQueryParameter("token");
        return queryParameter4 == null || o(queryParameter4);
    }

    static boolean j(Map<?, ?> map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() == null || !(entry.getKey() instanceof String)) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(String str) {
        try {
            if (str.length() == 4) {
                if (Integer.parseInt(str) > 0) {
                    return true;
                }
            }
        } catch (ParseException unused) {
        }
        return false;
    }

    static EnumC6551h b(Uri uri) {
        if (uri == null || uri.getHost() == null) {
            return EnumC6551h.PROD;
        }
        Matcher matcher = f62977b.matcher(uri.getHost());
        return !matcher.find() ? EnumC6551h.PROD : matcher.groupCount() < 3 ? EnumC6551h.PROD : EnumC6551h.e(matcher.group(3));
    }

    static String c(EnumC6551h enumC6551h) {
        return (enumC6551h == null || enumC6551h == EnumC6551h.PROD) ? "" : String.format("-%s", enumC6551h.stringValue);
    }

    static boolean f(Activity activity) {
        return activity instanceof AssuranceActivity;
    }

    static boolean h(Map<String, Object> map) {
        return map == null || map.isEmpty();
    }

    private static boolean l(String str, String str2) {
        Matcher matcher = f62977b.matcher(str);
        if (matcher.find() && k(matcher.group(3))) {
            return "/client/v1".equalsIgnoreCase(str2);
        }
        return false;
    }

    private static boolean m(String str) {
        return str.endsWith("@AdobeOrg");
    }

    private static boolean n(String str) {
        return "wss".equalsIgnoreCase(str);
    }

    static EnumC6551h a(String str) {
        if (g6.i.a(str)) {
            return EnumC6551h.PROD;
        }
        return EnumC6551h.e(str);
    }

    private static boolean e(Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            if (!f62976a.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static boolean g(Application application) {
        if ((application.getApplicationContext().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private static boolean k(String str) {
        if (g6.i.a(str)) {
            return true;
        }
        return EnumC6551h.e(str).stringValue.equalsIgnoreCase(str);
    }

    private static boolean p(String str) {
        try {
            UUID.fromString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
