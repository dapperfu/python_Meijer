package com.bazaarvoice.bvandroidsdk;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes4.dex */
class DateUtil {
    static SimpleDateFormat dateFormat;

    private static void initDateFormat() {
        if (dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }
    }

    DateUtil() {
    }

    static Date dateFromString(String str) {
        try {
            initDateFormat();
            return dateFormat.parse(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
