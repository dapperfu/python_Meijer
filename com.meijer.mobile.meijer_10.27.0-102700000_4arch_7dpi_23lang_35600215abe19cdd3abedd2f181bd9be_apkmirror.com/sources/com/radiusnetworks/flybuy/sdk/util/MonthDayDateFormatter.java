package com.radiusnetworks.flybuy.sdk.util;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/util/MonthDayDateFormatter;", "", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "j$/time/LocalDateTime", "dateTime", "", "format", "(Lj$/time/LocalDateTime;)Ljava/lang/String;", "j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "dateFormatter", "Lj$/time/format/DateTimeFormatter;", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MonthDayDateFormatter {
    private static final Regex REGEX_YEAR_STRIPPER = new Regex("([^Md]*[yu]+[^Md]*)");
    private final DateTimeFormatter dateFormatter;

    public MonthDayDateFormatter(Locale locale) {
        Intrinsics.j(locale, "locale");
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.MEDIUM, null, IsoChronology.INSTANCE, locale);
        try {
            Intrinsics.g(localizedDateTimePattern);
            localizedDateTimePattern = REGEX_YEAR_STRIPPER.k(localizedDateTimePattern, "");
        } catch (Exception unused) {
        }
        this.dateFormatter = DateTimeFormatter.ofPattern(localizedDateTimePattern).withLocale(locale).withZone(ZoneId.of("UTC"));
    }

    public final String format(LocalDateTime dateTime) {
        Intrinsics.j(dateTime, "dateTime");
        String str = this.dateFormatter.format(dateTime);
        Intrinsics.i(str, "format(...)");
        return str;
    }
}
