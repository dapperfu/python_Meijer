package com.radiusnetworks.flybuy.sdk.data.room.domain;

import com.radiusnetworks.flybuy.sdk.util.MonthDayDateFormatter;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"j$/time/Instant", "Ljava/util/Locale;", "locale", "", "toFormattedTimeWithDateIfNotToday", "(Lj$/time/Instant;Ljava/util/Locale;)Ljava/lang/String;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstantKt {
    public static final String toFormattedTimeWithDateIfNotToday(Instant instant, Locale locale) {
        Intrinsics.j(locale, "locale");
        if (instant == null) {
            return "";
        }
        DateTimeFormatter dateTimeFormatterOfLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        MonthDayDateFormatter monthDayDateFormatter = new MonthDayDateFormatter(locale);
        StringBuilder sb2 = new StringBuilder();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        sb2.append(dateTimeFormatterOfLocalizedTime.format(localDateTimeOfInstant));
        if (!localDateTimeOfInstant.l().isEqual(localDateTimeOfInstant2.l())) {
            sb2.append(", ");
            Intrinsics.g(localDateTimeOfInstant);
            sb2.append(monthDayDateFormatter.format(localDateTimeOfInstant));
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
