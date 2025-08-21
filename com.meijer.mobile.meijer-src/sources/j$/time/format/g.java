package j$.time.format;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        Long lA = wVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = wVar.f139482a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long lValueOf = temporalAccessor.h(chronoField) ? Long.valueOf(temporalAccessor.j(chronoField)) : null;
        int i10 = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = chronoField.f139516d.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
        if (jLongValue >= -62167219200L) {
            long j10 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j10, 315569520000L) + 1;
            LocalDateTime localDateTimeH = LocalDateTime.H(Math.floorMod(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb2.append('+');
                sb2.append(jFloorDiv);
            }
            sb2.append(localDateTimeH);
            if (localDateTimeH.f139291b.f139296c == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = jLongValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime localDateTimeH2 = LocalDateTime.H(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(localDateTimeH2);
            if (localDateTimeH2.f139291b.f139296c == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (localDateTimeH2.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (iA > 0) {
            sb2.append('.');
            int i11 = 100000000;
            while (true) {
                if (iA <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = iA / i11;
                sb2.append((char) (i12 + 48));
                iA -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i11 = 1;
        dateTimeFormatterBuilderAppendValue.a(chronoField4, 0, 9, true);
        d dVarB = dateTimeFormatterBuilderAppendValue.appendLiteral('Z').toFormatter().b();
        v vVar2 = new v(vVar.f139477a);
        vVar2.f139478b = vVar.f139478b;
        vVar2.f139479c = vVar.f139479c;
        int iH = dVarB.H(vVar2, charSequence, i10);
        if (iH < 0) {
            return iH;
        }
        long jLongValue = vVar2.e(ChronoField.YEAR).longValue();
        int iIntValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int iIntValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int iIntValue3 = vVar2.e(chronoField).intValue();
        int iIntValue4 = vVar2.e(chronoField2).intValue();
        Long lE = vVar2.e(chronoField3);
        Long lE2 = vVar2.e(chronoField4);
        int iIntValue5 = lE != null ? lE.intValue() : 0;
        int iIntValue6 = lE2 != null ? lE2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            vVar.c().f139392d = true;
            i11 = 0;
            iIntValue5 = 59;
        } else {
            i11 = 0;
        }
        int i12 = ((int) jLongValue) % 10000;
        try {
            LocalDateTime localDateTime = LocalDateTime.MIN;
            return vVar.g(chronoField4, iIntValue6, i10, vVar.g(ChronoField.INSTANT_SECONDS, new LocalDateTime(LocalDate.of(i12, iIntValue, iIntValue2), LocalTime.Q(iIntValue3, iIntValue4, iIntValue5, 0)).plusDays(i11).A(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i10, iH));
        } catch (RuntimeException unused) {
            return ~i10;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
