package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DateTimeFormatterBuilder {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.time.c f138820h = new j$.time.c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final Map f138821i;

    /* renamed from: a, reason: collision with root package name */
    public DateTimeFormatterBuilder f138822a;

    /* renamed from: b, reason: collision with root package name */
    public final DateTimeFormatterBuilder f138823b;

    /* renamed from: c, reason: collision with root package name */
    public final List f138824c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f138825d;

    /* renamed from: e, reason: collision with root package name */
    public int f138826e;

    /* renamed from: f, reason: collision with root package name */
    public char f138827f;

    /* renamed from: g, reason: collision with root package name */
    public int f138828g;

    static {
        HashMap map = new HashMap();
        f138821i = map;
        map.put('G', ChronoField.ERA);
        map.put('y', ChronoField.YEAR_OF_ERA);
        map.put('u', ChronoField.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.f138943a;
        map.put('Q', fVar);
        map.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        map.put('M', chronoField);
        map.put('L', chronoField);
        map.put('D', ChronoField.DAY_OF_YEAR);
        map.put('d', ChronoField.DAY_OF_MONTH);
        map.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        map.put('E', chronoField2);
        map.put('c', chronoField2);
        map.put('e', chronoField2);
        map.put('a', ChronoField.AMPM_OF_DAY);
        map.put('H', ChronoField.HOUR_OF_DAY);
        map.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        map.put('K', ChronoField.HOUR_OF_AMPM);
        map.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        map.put('m', ChronoField.MINUTE_OF_HOUR);
        map.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        map.put('S', chronoField3);
        map.put('A', ChronoField.MILLI_OF_DAY);
        map.put('n', chronoField3);
        map.put('N', ChronoField.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.f138953a);
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat dateTimeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            dateTimeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else if (formatStyle == null) {
            dateTimeInstance = DateFormat.getTimeInstance(formatStyle2.ordinal(), locale);
        } else {
            dateTimeInstance = DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (dateTimeInstance instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
            if (pattern == null) {
                return null;
            }
            int i10 = 0;
            boolean z10 = pattern.indexOf(66) != -1;
            boolean z11 = pattern.indexOf(98) != -1;
            if (!z10 && !z11) {
                return pattern;
            }
            StringBuilder sb2 = new StringBuilder(pattern.length());
            char c10 = ' ';
            while (i10 < pattern.length()) {
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != ' ') {
                    if (cCharAt != 'B' && cCharAt != 'b') {
                        sb2.append(cCharAt);
                    }
                } else if (i10 == 0 || (c10 != 'B' && c10 != 'b')) {
                    sb2.append(cCharAt);
                }
                i10++;
                c10 = cCharAt;
            }
            int length = sb2.length() - 1;
            if (length >= 0 && sb2.charAt(length) == ' ') {
                sb2.deleteCharAt(length);
            }
            return sb2.toString();
        }
        throw new UnsupportedOperationException("Can't determine pattern from " + dateTimeInstance);
    }

    public DateTimeFormatterBuilder() {
        this.f138822a = this;
        this.f138824c = new ArrayList();
        this.f138828g = -1;
        this.f138823b = null;
        this.f138825d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.f138822a = this;
        this.f138824c = new ArrayList();
        this.f138828g = -1;
        this.f138823b = dateTimeFormatterBuilder;
        this.f138825d = true;
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        b(q.INSENSITIVE);
        return this;
    }

    public final void g(TemporalField temporalField) {
        f(new j(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10) {
        Objects.requireNonNull(temporalField, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        f(new j(temporalField, i10, i10, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i10, int i11, SignStyle signStyle) {
        if (i10 == i11 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i11);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        f(new j(temporalField, i10, i11, signStyle));
        return this;
    }

    public final void f(j jVar) {
        j jVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f138822a;
        int i10 = dateTimeFormatterBuilder.f138828g;
        if (i10 < 0) {
            dateTimeFormatterBuilder.f138828g = b(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.f138824c).get(i10);
        int i11 = jVar.f138846b;
        int i12 = jVar.f138847c;
        if (i11 == i12 && jVar.f138848d == SignStyle.NOT_NEGATIVE) {
            jVarD = jVar2.e(i12);
            b(jVar.d());
            this.f138822a.f138828g = i10;
        } else {
            jVarD = jVar2.d();
            this.f138822a.f138828g = b(jVar);
        }
        ((ArrayList) this.f138822a.f138824c).set(i10, jVarD);
    }

    public final void a(ChronoField chronoField, int i10, int i11, boolean z10) {
        if (i10 == i11 && !z10) {
            f(new f(chronoField, i10, i11, z10));
        } else {
            b(new f(chronoField, i10, i11, z10));
        }
    }

    public final void e(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        b(new r(temporalField, textStyle, z.f138899c));
    }

    public DateTimeFormatterBuilder appendText(TemporalField temporalField, Map<Long, String> map) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        b(new r(temporalField, textStyle, new C14788a(new y(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    public final void d(String str, String str2) {
        b(new k(str, str2));
    }

    public final void c(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        b(new h(textStyle, 0));
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        b(new C14790c(c10));
        return this;
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            if (str.length() == 1) {
                b(new C14790c(str.charAt(0)));
                return this;
            }
            b(new h(str, 1));
        }
        return this;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        b(dateTimeFormatter.b());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0471 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j$.time.format.DateTimeFormatterBuilder appendPattern(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatterBuilder.appendPattern(java.lang.String):j$.time.format.DateTimeFormatterBuilder");
    }

    public DateTimeFormatterBuilder optionalStart() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f138822a;
        dateTimeFormatterBuilder.f138828g = -1;
        this.f138822a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
        return this;
    }

    public final void h() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f138822a;
        if (dateTimeFormatterBuilder.f138823b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.f138824c).size() > 0) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.f138822a;
            d dVar = new d(dateTimeFormatterBuilder2.f138824c, dateTimeFormatterBuilder2.f138825d);
            this.f138822a = this.f138822a.f138823b;
            b(dVar);
            return;
        }
        this.f138822a = this.f138822a.f138823b;
    }

    public final int b(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.f138822a;
        int i10 = dateTimeFormatterBuilder.f138826e;
        if (i10 > 0) {
            l lVar = new l(eVar, i10, dateTimeFormatterBuilder.f138827f);
            dateTimeFormatterBuilder.f138826e = 0;
            dateTimeFormatterBuilder.f138827f = (char) 0;
            eVar = lVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.f138824c).add(eVar);
        this.f138822a.f138828g = -1;
        return ((ArrayList) r5.f138824c).size() - 1;
    }

    public DateTimeFormatter toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public DateTimeFormatter toFormatter(Locale locale) {
        return j(locale, ResolverStyle.SMART, null);
    }

    public final DateTimeFormatter i(ResolverStyle resolverStyle, IsoChronology isoChronology) {
        return j(Locale.getDefault(), resolverStyle, isoChronology);
    }

    public final DateTimeFormatter j(Locale locale, ResolverStyle resolverStyle, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.f138822a.f138823b != null) {
            h();
        }
        return new DateTimeFormatter(new d(this.f138824c, false), locale, A.f138798a, resolverStyle, chronology, null);
    }
}
