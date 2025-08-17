package com.adobe.marketing.mobile.lifecycle;

import Q5.InterfaceC5078j;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
final class h {
    static String a(Date date) {
        return b(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    private static String b(Date date, String str) {
        if (date == null) {
            return "";
        }
        if (f6.i.a(str)) {
            str = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        }
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new Locale(locale.getLanguage(), locale.getCountry(), "POSIX"));
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    static String c(Locale locale) {
        if (locale == null) {
            return null;
        }
        return locale.toString().replace('_', '-');
    }

    static String d(Locale locale) {
        if (locale == null) {
            return null;
        }
        return locale.toLanguageTag();
    }

    static String e(InterfaceC5078j interfaceC5078j) {
        if (interfaceC5078j == null) {
            return null;
        }
        String strG = interfaceC5078j.g();
        String strR = interfaceC5078j.r();
        return String.format("%s%s", !f6.i.a(strG) ? String.format("%s", strG) : "", f6.i.a(strR) ? "" : String.format(" (%s)", strR));
    }
}
