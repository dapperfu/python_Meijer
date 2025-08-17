package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;
    public static final DateTimeFormatter ISO_LOCAL_TIME;
    public static final DateTimeFormatter ISO_OFFSET_DATE_TIME;

    /* renamed from: a, reason: collision with root package name */
    public final d f138814a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f138815b;

    /* renamed from: c, reason: collision with root package name */
    public final A f138816c;

    /* renamed from: d, reason: collision with root package name */
    public final ResolverStyle f138817d;

    /* renamed from: e, reason: collision with root package name */
    public final Chronology f138818e;

    /* renamed from: f, reason: collision with root package name */
    public final ZoneId f138819f;

    public static DateTimeFormatter ofPattern(String str) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter();
    }

    public static DateTimeFormatter ofPattern(String str, Locale locale) {
        return new DateTimeFormatterBuilder().appendPattern(str).toFormatter(locale);
    }

    public static DateTimeFormatter ofLocalizedTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.b(new i(formatStyle));
        return dateTimeFormatterBuilder.i(ResolverStyle.SMART, IsoChronology.INSTANCE);
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        DateTimeFormatter dateTimeFormatterI = dateTimeFormatterBuilderAppendValue.i(resolverStyle, isoChronology);
        ISO_LOCAL_DATE = dateTimeFormatterI;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppend = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI);
        dateTimeFormatterBuilderAppend.getClass();
        k kVar = k.f138851e;
        dateTimeFormatterBuilderAppend.b(kVar);
        dateTimeFormatterBuilderAppend.i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI).optionalStart();
        dateTimeFormatterBuilderOptionalStart.getClass();
        dateTimeFormatterBuilderOptionalStart.b(kVar);
        dateTimeFormatterBuilderOptionalStart.i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2).optionalStart().appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart2 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2).optionalStart();
        dateTimeFormatterBuilderOptionalStart2.a(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterI2 = dateTimeFormatterBuilderOptionalStart2.i(resolverStyle, null);
        ISO_LOCAL_TIME = dateTimeFormatterI2;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppend2 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI2);
        dateTimeFormatterBuilderAppend2.getClass();
        dateTimeFormatterBuilderAppend2.b(kVar);
        dateTimeFormatterBuilderAppend2.i(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart3 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI2).optionalStart();
        dateTimeFormatterBuilderOptionalStart3.getClass();
        dateTimeFormatterBuilderOptionalStart3.b(kVar);
        dateTimeFormatterBuilderOptionalStart3.i(resolverStyle, null);
        DateTimeFormatter dateTimeFormatterI3 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI).appendLiteral('T').append(dateTimeFormatterI2).i(resolverStyle, isoChronology);
        ISO_LOCAL_DATE_TIME = dateTimeFormatterI3;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppend3 = new DateTimeFormatterBuilder().parseCaseInsensitive().append(dateTimeFormatterI3);
        q qVar = q.LENIENT;
        dateTimeFormatterBuilderAppend3.b(qVar);
        dateTimeFormatterBuilderAppend3.b(kVar);
        q qVar2 = q.STRICT;
        dateTimeFormatterBuilderAppend3.b(qVar2);
        DateTimeFormatter dateTimeFormatterI4 = dateTimeFormatterBuilderAppend3.i(resolverStyle, isoChronology);
        ISO_OFFSET_DATE_TIME = dateTimeFormatterI4;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = new DateTimeFormatterBuilder().append(dateTimeFormatterI4).optionalStart().appendLiteral('[');
        q qVar3 = q.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral5.b(qVar3);
        j$.time.c cVar = DateTimeFormatterBuilder.f138820h;
        dateTimeFormatterBuilderAppendLiteral5.b(new t(cVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral5.appendLiteral(']').i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart4 = new DateTimeFormatterBuilder().append(dateTimeFormatterI3).optionalStart();
        dateTimeFormatterBuilderOptionalStart4.getClass();
        dateTimeFormatterBuilderOptionalStart4.b(kVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilderOptionalStart4.optionalStart().appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral6.b(qVar3);
        dateTimeFormatterBuilderAppendLiteral6.b(new t(cVar, "ZoneRegionId()"));
        dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3).optionalStart();
        dateTimeFormatterBuilderOptionalStart5.getClass();
        dateTimeFormatterBuilderOptionalStart5.b(kVar);
        dateTimeFormatterBuilderOptionalStart5.i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.h.f138945c, 4, 10, signStyle).appendLiteral("-W").appendValue(j$.time.temporal.h.f138944b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart6 = dateTimeFormatterBuilderAppendLiteral7.appendValue(chronoField7, 1).optionalStart();
        dateTimeFormatterBuilderOptionalStart6.getClass();
        dateTimeFormatterBuilderOptionalStart6.b(kVar);
        dateTimeFormatterBuilderOptionalStart6.i(resolverStyle, isoChronology);
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.getClass();
        caseInsensitive.b(new g());
        ISO_INSTANT = caseInsensitive.i(resolverStyle, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderOptionalStart7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2).optionalStart();
        dateTimeFormatterBuilderOptionalStart7.b(qVar);
        dateTimeFormatterBuilderOptionalStart7.d("+HHMMss", "Z");
        dateTimeFormatterBuilderOptionalStart7.b(qVar2);
        dateTimeFormatterBuilderOptionalStart7.i(resolverStyle, isoChronology);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.b(qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = caseInsensitive2.optionalStart().appendText(chronoField7, map).appendLiteral(", ");
        dateTimeFormatterBuilderAppendLiteral8.h();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue2 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ').appendText(chronoField2, map2).appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2).optionalStart().appendLiteral(':').appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue2.h();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral9 = dateTimeFormatterBuilderAppendValue2.appendLiteral(' ');
        dateTimeFormatterBuilderAppendLiteral9.d("+HHMM", "GMT");
        dateTimeFormatterBuilderAppendLiteral9.i(ResolverStyle.SMART, isoChronology);
    }

    public DateTimeFormatter(d dVar, Locale locale, A a10, ResolverStyle resolverStyle, Chronology chronology, ZoneId zoneId) {
        Objects.requireNonNull(dVar, "printerParser");
        this.f138814a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.f138815b = locale;
        Objects.requireNonNull(a10, "decimalStyle");
        this.f138816c = a10;
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        this.f138817d = resolverStyle;
        this.f138818e = chronology;
        this.f138819f = zoneId;
    }

    public DateTimeFormatter withLocale(Locale locale) {
        if (this.f138815b.equals(locale)) {
            return this;
        }
        return new DateTimeFormatter(this.f138814a, locale, this.f138816c, this.f138817d, this.f138818e, this.f138819f);
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        if (Objects.equals(this.f138818e, chronology)) {
            return this;
        }
        return new DateTimeFormatter(this.f138814a, this.f138815b, this.f138816c, this.f138817d, chronology, this.f138819f);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        if (Objects.equals(this.f138819f, zoneId)) {
            return this;
        }
        return new DateTimeFormatter(this.f138814a, this.f138815b, this.f138816c, this.f138817d, this.f138818e, zoneId);
    }

    public DateTimeFormatter withResolverStyle(ResolverStyle resolverStyle) {
        Objects.requireNonNull(resolverStyle, "resolverStyle");
        if (Objects.equals(this.f138817d, resolverStyle)) {
            return this;
        }
        return new DateTimeFormatter(this.f138814a, this.f138815b, this.f138816c, resolverStyle, this.f138818e, this.f138819f);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        d dVar = this.f138814a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.C(new w(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new DateTimeException(e10.getMessage(), e10);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).d(temporalQuery);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e11.getMessage(), e11);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.B a(java.lang.CharSequence r27) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.a(java.lang.CharSequence):j$.time.format.B");
    }

    public final String toString() {
        String string = this.f138814a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public final d b() {
        d dVar = this.f138814a;
        return !dVar.f138838b ? dVar : new d(dVar.f138837a, false);
    }
}
