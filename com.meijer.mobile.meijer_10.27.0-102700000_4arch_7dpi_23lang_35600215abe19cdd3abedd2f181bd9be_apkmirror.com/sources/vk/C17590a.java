package vk;

import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.ResolverStyle;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.LongIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\bh\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\fR\u0017\u0010$\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000eR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0017\u0010-\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u0014\u0010.\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u0014\u00100\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\fR\u0014\u00102\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\fR\u0014\u00103\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\fR\u0014\u00104\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\fR\u0014\u00105\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u00106\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0017\u00107\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b(\u0010\u000eR\u0017\u00108\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b+\u0010\u000eR\u0014\u0010:\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\fR\u0017\u0010=\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010\u000eR\u0017\u0010@\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010\u000eR\u0017\u0010B\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bA\u0010\u000eR\u0014\u0010C\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\fR\u0017\u0010F\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010\u000eR\u0017\u0010G\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010H\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010J\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010\f\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010M\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bK\u0010\f\u001a\u0004\bL\u0010\u000eR\u0017\u0010O\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bN\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010Q\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010S\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bR\u0010\f\u001a\u0004\bI\u0010\u000eR\u0017\u0010U\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bT\u0010\f\u001a\u0004\bK\u0010\u000eR\u0017\u0010W\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bV\u0010\f\u001a\u0004\b9\u0010\u000eR\u0017\u0010Y\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bX\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010[\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bZ\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010]\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\\\u0010\f\u001a\u0004\b\"\u0010\u000eR\u0017\u0010_\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b^\u0010\f\u001a\u0004\bD\u0010\u000eR\u0017\u0010a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b`\u0010\f\u001a\u0004\b;\u0010\u000eR\u0017\u0010c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bb\u0010\f\u001a\u0004\b>\u0010\u000eR\u0017\u0010e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\bN\u0010\u000eR\u0017\u0010g\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bf\u0010\f\u001a\u0004\b%\u0010\u000eR\u0014\u0010i\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\fR\u0014\u0010k\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\fR\u0017\u0010m\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bl\u0010\f\u001a\u0004\b/\u0010\u000eR\u0017\u0010o\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bn\u0010\f\u001a\u0004\b1\u0010\u000e¨\u0006p"}, d2 = {"Lvk/a;", "", "<init>", "()V", "j$/time/format/DateTimeFormatterBuilder", "a", "(Lj$/time/format/DateTimeFormatterBuilder;)Lj$/time/format/DateTimeFormatterBuilder;", "", "useShortDayOfWeek", "j$/time/format/DateTimeFormatter", "b", "(Z)Lj$/time/format/DateTimeFormatter;", "Lj$/time/format/DateTimeFormatter;", "t", "()Lj$/time/format/DateTimeFormatter;", "ISO_INSTANT", "c", "s", "ISO_8601_FLEX_DATE_TIME", "d", "u", "ISO_LOCAL_TIME", "e", "v", "ISO_LOCAL_TIME_STRICT", "f", "ISO_LOCAL_DATE", "g", "ISO_LOCAL_DATE_TIME", "h", "n", "FULL_DAY_FULL_MONTH_DATE_ORDINAL", "i", "SHORT_DAY_FULL_MONTH_DATE_ORDINAL", "j", "q", "HOUR_OF_DAY_SHORT", "k", "r", "HOUR_OF_DAY_SHORT_WSPACE", "l", "C", "WHOLE_HOUR_OF_DAY_SHORT", "m", "D", "WHOLE_HOUR_OF_DAY_SHORT_WSPACE", "DATE_SLASHES_SHORT", "o", "NUMERIC_MONTH_DAY", "p", "SHORT_MONTH_WITH_DAY", "DATE_FORMAT_MM_DD_YYYY", "NUMERIC_MONTH_YEAR_FULL", "NUMERIC_MONTH_YEAR_SHORT", "NUMERIC_MONTH_YEAR_SHORT_NO_DELIMITER", "FULL_DATE", "FULL_DATE_SHORT", "w", "FULL_NUMERIC_MONTH_DATE_TIME", "x", "getISO_DATE_TIME_24HR", "ISO_DATE_TIME_24HR", "y", "A", "SQL_LOCAL_DATE_TIME_SHORT", "z", "SQL_LOCAL_DATE_TIME", "SQL_LOCAL_DATE_TIME_LOW_PRECISION", "B", "getLOCAL_DATE_TIME_12HR", "LOCAL_DATE_TIME_12HR", "DATE_YEAR_FULL", "DATE_YEAR_SHORT", "E", "DATE_MONTH_SHORT", "F", "getDATE_SHORT_MONTH_FULL_YEAR", "DATE_SHORT_MONTH_FULL_YEAR", "G", "DATE_MONTH_DAY_YEAR_MEDIUM", "H", "DATE_FULL_MONTH_FULL_DAY", "I", "YEAR_MONTH_FULL_MONTH_FULLYEAR", "J", "YEAR_MONTH_SHORT_MONTH_FULLYEAR", "K", "MONTH_FULL_NAME", "L", "DATE_DAY_OF_WEEK", "M", "DATE_DAY_OF_WEEK_SHORT", "N", "DAY_FULL_DATE_SHORT", "O", "TODAY_DATE_SHORT", "P", "MONTH_TWO_DIGIT", "Q", "MONTH_TWO_DIGIT_MONTH_SHORT", "R", "YEAR_TWO_DIGIT", "S", "EPOCH_MILLIS_DATE", "T", "MONTH_DAY_YEAR_SHORT", "U", "HOUR_MINUTE_SECOND_SHORT", "V", "FULL_DAY_FULL_MONTH_DATE_YEAR_ORDINAL", "W", "FULL_WEEKDAY_MONTH_DAY_ORDINAL", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17590a {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter SQL_LOCAL_DATE_TIME_LOW_PRECISION;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter LOCAL_DATE_TIME_12HR;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_YEAR_FULL;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_YEAR_SHORT;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_MONTH_SHORT;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_SHORT_MONTH_FULL_YEAR;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_MONTH_DAY_YEAR_MEDIUM;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_FULL_MONTH_FULL_DAY;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter YEAR_MONTH_FULL_MONTH_FULLYEAR;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter YEAR_MONTH_SHORT_MONTH_FULLYEAR;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter MONTH_FULL_NAME;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_DAY_OF_WEEK;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DATE_DAY_OF_WEEK_SHORT;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter DAY_FULL_DATE_SHORT;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter TODAY_DATE_SHORT;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter MONTH_TWO_DIGIT;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter MONTH_TWO_DIGIT_MONTH_SHORT;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter YEAR_TWO_DIGIT;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter EPOCH_MILLIS_DATE;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter MONTH_DAY_YEAR_SHORT;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter HOUR_MINUTE_SECOND_SHORT;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter FULL_DAY_FULL_MONTH_DATE_YEAR_ORDINAL;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter FULL_WEEKDAY_MONTH_DAY_ORDINAL;

    /* renamed from: a, reason: collision with root package name */
    public static final C17590a f164803a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter ISO_INSTANT;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter ISO_8601_FLEX_DATE_TIME;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter ISO_LOCAL_TIME;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter ISO_LOCAL_TIME_STRICT;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter FULL_DAY_FULL_MONTH_DATE_ORDINAL;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter SHORT_DAY_FULL_MONTH_DATE_ORDINAL;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter HOUR_OF_DAY_SHORT;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter HOUR_OF_DAY_SHORT_WSPACE;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter WHOLE_HOUR_OF_DAY_SHORT;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter WHOLE_HOUR_OF_DAY_SHORT_WSPACE;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter DATE_SLASHES_SHORT;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter NUMERIC_MONTH_DAY;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter SHORT_MONTH_WITH_DAY;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter DATE_FORMAT_MM_DD_YYYY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter NUMERIC_MONTH_YEAR_FULL;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter NUMERIC_MONTH_YEAR_SHORT;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter NUMERIC_MONTH_YEAR_SHORT_NO_DELIMITER;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter FULL_DATE;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter FULL_DATE_SHORT;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public static final DateTimeFormatter FULL_NUMERIC_MONTH_DATE_TIME;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter ISO_DATE_TIME_24HR;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter SQL_LOCAL_DATE_TIME_SHORT;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final DateTimeFormatter SQL_LOCAL_DATE_TIME;

    static {
        C17590a c17590a = new C17590a();
        f164803a = c17590a;
        DateTimeFormatter ISO_INSTANT2 = DateTimeFormatter.ISO_INSTANT;
        Intrinsics.i(ISO_INSTANT2, "ISO_INSTANT");
        ISO_INSTANT = ISO_INSTANT2;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        DateTimeFormatter ISO_LOCAL_DATE2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = caseInsensitive.append(ISO_LOCAL_DATE2).appendLiteral('T');
        DateTimeFormatter ISO_LOCAL_TIME2 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dateTimeFormatterWithChronology = dateTimeFormatterBuilderAppendLiteral.append(ISO_LOCAL_TIME2).optionalStart().appendPattern("[xxx][xx][X]").toFormatter().withResolverStyle(ResolverStyle.STRICT).withChronology(IsoChronology.INSTANCE);
        Intrinsics.i(dateTimeFormatterWithChronology, "withChronology(...)");
        ISO_8601_FLEX_DATE_TIME = dateTimeFormatterWithChronology;
        Intrinsics.i(ISO_LOCAL_TIME2, "ISO_LOCAL_TIME");
        ISO_LOCAL_TIME = ISO_LOCAL_TIME2;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        Intrinsics.i(dateTimeFormatterOfPattern, "ofPattern(...)");
        ISO_LOCAL_TIME_STRICT = dateTimeFormatterOfPattern;
        Intrinsics.i(ISO_LOCAL_DATE2, "ISO_LOCAL_DATE");
        ISO_LOCAL_DATE = ISO_LOCAL_DATE2;
        DateTimeFormatter ISO_LOCAL_DATE_TIME2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Intrinsics.i(ISO_LOCAL_DATE_TIME2, "ISO_LOCAL_DATE_TIME");
        ISO_LOCAL_DATE_TIME = ISO_LOCAL_DATE_TIME2;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendPattern = new DateTimeFormatterBuilder().appendPattern("EEEE, MMMM ");
        Intrinsics.i(dateTimeFormatterBuilderAppendPattern, "appendPattern(...)");
        DateTimeFormatter formatter = c17590a.a(dateTimeFormatterBuilderAppendPattern).toFormatter();
        Intrinsics.i(formatter, "toFormatter(...)");
        FULL_DAY_FULL_MONTH_DATE_ORDINAL = formatter;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendPattern2 = new DateTimeFormatterBuilder().appendPattern("E, MMMM ");
        Intrinsics.i(dateTimeFormatterBuilderAppendPattern2, "appendPattern(...)");
        DateTimeFormatter formatter2 = c17590a.a(dateTimeFormatterBuilderAppendPattern2).toFormatter();
        Intrinsics.i(formatter2, "toFormatter(...)");
        SHORT_DAY_FULL_MONTH_DATE_ORDINAL = formatter2;
        Locale locale = Locale.US;
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h:mma", locale);
        Intrinsics.i(dateTimeFormatterOfPattern2, "ofPattern(...)");
        HOUR_OF_DAY_SHORT = dateTimeFormatterOfPattern2;
        DateTimeFormatter dateTimeFormatterOfPattern3 = DateTimeFormatter.ofPattern("h:mm a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern3, "ofPattern(...)");
        HOUR_OF_DAY_SHORT_WSPACE = dateTimeFormatterOfPattern3;
        DateTimeFormatter dateTimeFormatterOfPattern4 = DateTimeFormatter.ofPattern("ha", locale);
        Intrinsics.i(dateTimeFormatterOfPattern4, "ofPattern(...)");
        WHOLE_HOUR_OF_DAY_SHORT = dateTimeFormatterOfPattern4;
        DateTimeFormatter dateTimeFormatterOfPattern5 = DateTimeFormatter.ofPattern("h a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern5, "ofPattern(...)");
        WHOLE_HOUR_OF_DAY_SHORT_WSPACE = dateTimeFormatterOfPattern5;
        DateTimeFormatter dateTimeFormatterOfPattern6 = DateTimeFormatter.ofPattern("M/d/yy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern6, "ofPattern(...)");
        DATE_SLASHES_SHORT = dateTimeFormatterOfPattern6;
        DateTimeFormatter dateTimeFormatterOfPattern7 = DateTimeFormatter.ofPattern("M/dd", locale);
        Intrinsics.i(dateTimeFormatterOfPattern7, "ofPattern(...)");
        NUMERIC_MONTH_DAY = dateTimeFormatterOfPattern7;
        DateTimeFormatter dateTimeFormatterOfPattern8 = DateTimeFormatter.ofPattern("MMM dd", locale);
        Intrinsics.i(dateTimeFormatterOfPattern8, "ofPattern(...)");
        SHORT_MONTH_WITH_DAY = dateTimeFormatterOfPattern8;
        DateTimeFormatter dateTimeFormatterOfPattern9 = DateTimeFormatter.ofPattern("MM/dd/yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern9, "ofPattern(...)");
        DATE_FORMAT_MM_DD_YYYY = dateTimeFormatterOfPattern9;
        DateTimeFormatter dateTimeFormatterOfPattern10 = DateTimeFormatter.ofPattern("MM/yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern10, "ofPattern(...)");
        NUMERIC_MONTH_YEAR_FULL = dateTimeFormatterOfPattern10;
        DateTimeFormatter dateTimeFormatterOfPattern11 = DateTimeFormatter.ofPattern("MM/yy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern11, "ofPattern(...)");
        NUMERIC_MONTH_YEAR_SHORT = dateTimeFormatterOfPattern11;
        DateTimeFormatter dateTimeFormatterOfPattern12 = DateTimeFormatter.ofPattern("MMyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern12, "ofPattern(...)");
        NUMERIC_MONTH_YEAR_SHORT_NO_DELIMITER = dateTimeFormatterOfPattern12;
        DateTimeFormatter dateTimeFormatterOfPattern13 = DateTimeFormatter.ofPattern("MMMM d, yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern13, "ofPattern(...)");
        FULL_DATE = dateTimeFormatterOfPattern13;
        DateTimeFormatter dateTimeFormatterOfPattern14 = DateTimeFormatter.ofPattern("MMM d, yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern14, "ofPattern(...)");
        FULL_DATE_SHORT = dateTimeFormatterOfPattern14;
        DateTimeFormatter dateTimeFormatterOfPattern15 = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern15, "ofPattern(...)");
        FULL_NUMERIC_MONTH_DATE_TIME = dateTimeFormatterOfPattern15;
        DateTimeFormatter dateTimeFormatterOfPattern16 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", locale);
        Intrinsics.i(dateTimeFormatterOfPattern16, "ofPattern(...)");
        ISO_DATE_TIME_24HR = dateTimeFormatterOfPattern16;
        DateTimeFormatter dateTimeFormatterOfPattern17 = DateTimeFormatter.ofPattern("M/d/yyyy h:mm:ss a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern17, "ofPattern(...)");
        SQL_LOCAL_DATE_TIME_SHORT = dateTimeFormatterOfPattern17;
        DateTimeFormatter dateTimeFormatterOfPattern18 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern18, "ofPattern(...)");
        SQL_LOCAL_DATE_TIME = dateTimeFormatterOfPattern18;
        DateTimeFormatter dateTimeFormatterOfPattern19 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern19, "ofPattern(...)");
        SQL_LOCAL_DATE_TIME_LOW_PRECISION = dateTimeFormatterOfPattern19;
        DateTimeFormatter dateTimeFormatterOfPattern20 = DateTimeFormatter.ofPattern("M/d/yy h:mm a", locale);
        Intrinsics.i(dateTimeFormatterOfPattern20, "ofPattern(...)");
        LOCAL_DATE_TIME_12HR = dateTimeFormatterOfPattern20;
        DateTimeFormatter dateTimeFormatterOfPattern21 = DateTimeFormatter.ofPattern("yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern21, "ofPattern(...)");
        DATE_YEAR_FULL = dateTimeFormatterOfPattern21;
        DateTimeFormatter dateTimeFormatterOfPattern22 = DateTimeFormatter.ofPattern("yy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern22, "ofPattern(...)");
        DATE_YEAR_SHORT = dateTimeFormatterOfPattern22;
        DateTimeFormatter dateTimeFormatterOfPattern23 = DateTimeFormatter.ofPattern("M", locale);
        Intrinsics.i(dateTimeFormatterOfPattern23, "ofPattern(...)");
        DATE_MONTH_SHORT = dateTimeFormatterOfPattern23;
        DateTimeFormatter dateTimeFormatterOfPattern24 = DateTimeFormatter.ofPattern("M/yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern24, "ofPattern(...)");
        DATE_SHORT_MONTH_FULL_YEAR = dateTimeFormatterOfPattern24;
        DateTimeFormatter dateTimeFormatterOfPattern25 = DateTimeFormatter.ofPattern("MM/dd/yy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern25, "ofPattern(...)");
        DATE_MONTH_DAY_YEAR_MEDIUM = dateTimeFormatterOfPattern25;
        DateTimeFormatter dateTimeFormatterOfPattern26 = DateTimeFormatter.ofPattern("MMMM dd", locale);
        Intrinsics.i(dateTimeFormatterOfPattern26, "ofPattern(...)");
        DATE_FULL_MONTH_FULL_DAY = dateTimeFormatterOfPattern26;
        DateTimeFormatter dateTimeFormatterOfPattern27 = DateTimeFormatter.ofPattern("MMMM yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern27, "ofPattern(...)");
        YEAR_MONTH_FULL_MONTH_FULLYEAR = dateTimeFormatterOfPattern27;
        DateTimeFormatter dateTimeFormatterOfPattern28 = DateTimeFormatter.ofPattern("MMM yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern28, "ofPattern(...)");
        YEAR_MONTH_SHORT_MONTH_FULLYEAR = dateTimeFormatterOfPattern28;
        DateTimeFormatter dateTimeFormatterOfPattern29 = DateTimeFormatter.ofPattern("MMMM");
        Intrinsics.i(dateTimeFormatterOfPattern29, "ofPattern(...)");
        MONTH_FULL_NAME = dateTimeFormatterOfPattern29;
        DateTimeFormatter dateTimeFormatterOfPattern30 = DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern30, "ofPattern(...)");
        DATE_DAY_OF_WEEK = dateTimeFormatterOfPattern30;
        DateTimeFormatter dateTimeFormatterOfPattern31 = DateTimeFormatter.ofPattern("EEE, MMM d", locale);
        Intrinsics.i(dateTimeFormatterOfPattern31, "ofPattern(...)");
        DATE_DAY_OF_WEEK_SHORT = dateTimeFormatterOfPattern31;
        DateTimeFormatter dateTimeFormatterOfPattern32 = DateTimeFormatter.ofPattern("EEEE, M/dd", locale);
        Intrinsics.i(dateTimeFormatterOfPattern32, "ofPattern(...)");
        DAY_FULL_DATE_SHORT = dateTimeFormatterOfPattern32;
        DateTimeFormatter dateTimeFormatterOfPattern33 = DateTimeFormatter.ofPattern("'Today', M/dd", locale);
        Intrinsics.i(dateTimeFormatterOfPattern33, "ofPattern(...)");
        TODAY_DATE_SHORT = dateTimeFormatterOfPattern33;
        DateTimeFormatter dateTimeFormatterOfPattern34 = DateTimeFormatter.ofPattern("MM", locale);
        Intrinsics.i(dateTimeFormatterOfPattern34, "ofPattern(...)");
        MONTH_TWO_DIGIT = dateTimeFormatterOfPattern34;
        DateTimeFormatter dateTimeFormatterOfPattern35 = DateTimeFormatter.ofPattern("MM - MMM", locale);
        Intrinsics.i(dateTimeFormatterOfPattern35, "ofPattern(...)");
        MONTH_TWO_DIGIT_MONTH_SHORT = dateTimeFormatterOfPattern35;
        DateTimeFormatter dateTimeFormatterOfPattern36 = DateTimeFormatter.ofPattern("yy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern36, "ofPattern(...)");
        YEAR_TWO_DIGIT = dateTimeFormatterOfPattern36;
        DateTimeFormatter formatter3 = new DateTimeFormatterBuilder().appendLiteral("/Date(").appendValue(ChronoField.INSTANT_SECONDS, 1, 19, SignStyle.NEVER).appendValue(ChronoField.MILLI_OF_SECOND, 3).appendLiteral(")/").toFormatter(locale);
        Intrinsics.i(formatter3, "toFormatter(...)");
        EPOCH_MILLIS_DATE = formatter3;
        DateTimeFormatter dateTimeFormatterOfPattern37 = DateTimeFormatter.ofPattern("MMddyy", locale);
        Intrinsics.i(dateTimeFormatterOfPattern37, "ofPattern(...)");
        MONTH_DAY_YEAR_SHORT = dateTimeFormatterOfPattern37;
        DateTimeFormatter dateTimeFormatterOfPattern38 = DateTimeFormatter.ofPattern("HHmmss", locale);
        Intrinsics.i(dateTimeFormatterOfPattern38, "ofPattern(...)");
        HOUR_MINUTE_SECOND_SHORT = dateTimeFormatterOfPattern38;
        DateTimeFormatter formatter4 = new DateTimeFormatterBuilder().appendPattern("EEEE, MMMM d, yyyy").toFormatter();
        Intrinsics.i(formatter4, "toFormatter(...)");
        FULL_DAY_FULL_MONTH_DATE_YEAR_ORDINAL = formatter4;
        DateTimeFormatter formatter5 = new DateTimeFormatterBuilder().appendPattern("EEEE, MMMM d").toFormatter();
        Intrinsics.i(formatter5, "toFormatter(...)");
        FULL_WEEKDAY_MONTH_DAY_ORDINAL = formatter5;
    }

    private final DateTimeFormatterBuilder a(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        Map<Long, String> mapR = MapsKt.r(TuplesKt.a(1L, "1st"), TuplesKt.a(2L, "2nd"), TuplesKt.a(3L, "3rd"), TuplesKt.a(21L, "21st"), TuplesKt.a(22L, "22nd"), TuplesKt.a(23L, "23rd"), TuplesKt.a(31L, "31st"));
        Iterator<Long> it = new LongRange(1L, 31L).iterator();
        while (it.hasNext()) {
            long jNextLong = ((LongIterator) it).nextLong();
            Long lValueOf = Long.valueOf(jNextLong);
            if (mapR.get(lValueOf) == null) {
                mapR.put(lValueOf, jNextLong + "th");
            }
        }
        Unit unit = Unit.f142422a;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendText = dateTimeFormatterBuilder.appendText(chronoField, mapR);
        Intrinsics.i(dateTimeFormatterBuilderAppendText, "appendText(...)");
        return dateTimeFormatterBuilderAppendText;
    }

    public final DateTimeFormatter A() {
        return SQL_LOCAL_DATE_TIME_SHORT;
    }

    public final DateTimeFormatter B() {
        return TODAY_DATE_SHORT;
    }

    public final DateTimeFormatter C() {
        return WHOLE_HOUR_OF_DAY_SHORT;
    }

    public final DateTimeFormatter D() {
        return WHOLE_HOUR_OF_DAY_SHORT_WSPACE;
    }

    public final DateTimeFormatter E() {
        return YEAR_MONTH_FULL_MONTH_FULLYEAR;
    }

    public final DateTimeFormatter F() {
        return YEAR_MONTH_SHORT_MONTH_FULLYEAR;
    }

    public final DateTimeFormatter G() {
        return YEAR_TWO_DIGIT;
    }

    public final DateTimeFormatter b(boolean useShortDayOfWeek) {
        return useShortDayOfWeek ? SHORT_DAY_FULL_MONTH_DATE_ORDINAL : FULL_DAY_FULL_MONTH_DATE_ORDINAL;
    }

    public final DateTimeFormatter c() {
        return DATE_DAY_OF_WEEK;
    }

    public final DateTimeFormatter d() {
        return DATE_DAY_OF_WEEK_SHORT;
    }

    public final DateTimeFormatter e() {
        return DATE_FULL_MONTH_FULL_DAY;
    }

    public final DateTimeFormatter f() {
        return DATE_MONTH_DAY_YEAR_MEDIUM;
    }

    public final DateTimeFormatter g() {
        return DATE_MONTH_SHORT;
    }

    public final DateTimeFormatter h() {
        return DATE_YEAR_FULL;
    }

    public final DateTimeFormatter i() {
        return DATE_YEAR_SHORT;
    }

    public final DateTimeFormatter j() {
        return DAY_FULL_DATE_SHORT;
    }

    public final DateTimeFormatter k() {
        return EPOCH_MILLIS_DATE;
    }

    public final DateTimeFormatter l() {
        return FULL_DATE;
    }

    public final DateTimeFormatter m() {
        return FULL_DATE_SHORT;
    }

    public final DateTimeFormatter n() {
        return FULL_DAY_FULL_MONTH_DATE_ORDINAL;
    }

    public final DateTimeFormatter o() {
        return FULL_DAY_FULL_MONTH_DATE_YEAR_ORDINAL;
    }

    public final DateTimeFormatter p() {
        return FULL_WEEKDAY_MONTH_DAY_ORDINAL;
    }

    public final DateTimeFormatter q() {
        return HOUR_OF_DAY_SHORT;
    }

    public final DateTimeFormatter r() {
        return HOUR_OF_DAY_SHORT_WSPACE;
    }

    public final DateTimeFormatter s() {
        return ISO_8601_FLEX_DATE_TIME;
    }

    public final DateTimeFormatter t() {
        return ISO_INSTANT;
    }

    public final DateTimeFormatter u() {
        return ISO_LOCAL_TIME;
    }

    public final DateTimeFormatter v() {
        return ISO_LOCAL_TIME_STRICT;
    }

    public final DateTimeFormatter w() {
        return MONTH_FULL_NAME;
    }

    public final DateTimeFormatter x() {
        return MONTH_TWO_DIGIT;
    }

    public final DateTimeFormatter y() {
        return MONTH_TWO_DIGIT_MONTH_SHORT;
    }

    public final DateTimeFormatter z() {
        return SQL_LOCAL_DATE_TIME;
    }

    private C17590a() {
    }
}
