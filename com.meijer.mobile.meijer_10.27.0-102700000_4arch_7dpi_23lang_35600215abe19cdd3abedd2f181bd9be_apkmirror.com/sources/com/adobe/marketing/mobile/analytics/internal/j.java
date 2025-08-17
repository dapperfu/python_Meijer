package com.adobe.marketing.mobile.analytics.internal;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f62115a;

    static {
        Calendar calendar = Calendar.getInstance();
        f62115a = "00/00/0000 00:00:00 0 " + TimeUnit.MILLISECONDS.toMinutes((calendar.get(15) * (-1)) - calendar.get(16));
    }
}
