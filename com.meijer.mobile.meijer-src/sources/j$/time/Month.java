package j$.time;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.TextStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.k {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* renamed from: a, reason: collision with root package name */
    public static final Month[] f139298a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Month[] f139299b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f139299b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f139299b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f139298a = values();
    }

    public static Month O(int i10) {
        if (i10 < 1 || i10 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i10);
        }
        return f139298a[i10 - 1];
    }

    public static Month from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Month) {
            return (Month) temporalAccessor;
        }
        try {
            if (!IsoChronology.INSTANCE.equals(Chronology.q(temporalAccessor))) {
                temporalAccessor = LocalDate.from(temporalAccessor);
            }
            return O(temporalAccessor.get(ChronoField.MONTH_OF_YEAR));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain Month from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e10);
        }
    }

    public int getValue() {
        return ordinal() + 1;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e(ChronoField.MONTH_OF_YEAR, textStyle);
        return dateTimeFormatterBuilder.toFormatter(locale).format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.Q();
        }
        return super.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.Z(this);
    }

    public final int H(boolean z10) {
        int i10 = h.f139492a[ordinal()];
        return i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : z10 ? 29 : 28;
    }

    public int maxLength() {
        int i10 = h.f139492a[ordinal()];
        if (i10 != 1) {
            return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int C(boolean z10) {
        switch (h.f139492a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z10 ? 1 : 0) + 91;
            case 3:
                return (z10 ? 1 : 0) + 152;
            case 4:
                return (z10 ? 1 : 0) + 244;
            case 5:
                return (z10 ? 1 : 0) + HttpResponseStatus.REDIRECTION_USE_PROXY;
            case 6:
                return 1;
            case 7:
                return (z10 ? 1 : 0) + 60;
            case 8:
                return (z10 ? 1 : 0) + 121;
            case 9:
                return (z10 ? 1 : 0) + 182;
            case 10:
                return (z10 ? 1 : 0) + 213;
            case 11:
                return (z10 ? 1 : 0) + 274;
            default:
                return (z10 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return IsoChronology.INSTANCE;
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.MONTHS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        if (!Chronology.q(temporal).equals(IsoChronology.INSTANCE)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(getValue(), ChronoField.MONTH_OF_YEAR);
    }
}
