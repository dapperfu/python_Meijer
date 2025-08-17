package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes4.dex */
class p {

    /* renamed from: c, reason: collision with root package name */
    private static final p f86932c = new p(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f86933a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f86934b;

    static p c() {
        return f86932c;
    }

    Calendar a() {
        return b(this.f86934b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f86933a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }

    private p(Long l10, TimeZone timeZone) {
        this.f86933a = l10;
        this.f86934b = timeZone;
    }
}
