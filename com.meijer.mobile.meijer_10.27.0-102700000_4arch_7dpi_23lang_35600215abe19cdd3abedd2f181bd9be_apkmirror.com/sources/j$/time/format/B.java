package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class B implements TemporalAccessor {

    /* renamed from: b, reason: collision with root package name */
    public ZoneId f138800b;

    /* renamed from: c, reason: collision with root package name */
    public Chronology f138801c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f138802d;

    /* renamed from: e, reason: collision with root package name */
    public ResolverStyle f138803e;

    /* renamed from: f, reason: collision with root package name */
    public ChronoLocalDate f138804f;

    /* renamed from: g, reason: collision with root package name */
    public LocalTime f138805g;

    /* renamed from: a, reason: collision with root package name */
    public final Map f138799a = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public Period f138806h = Period.f138713d;

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        if (((HashMap) this.f138799a).containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f138804f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return true;
        }
        LocalTime localTime = this.f138805g;
        if (localTime == null || !localTime.h(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.C(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        Long l10 = (Long) ((HashMap) this.f138799a).get(temporalField);
        if (l10 != null) {
            return l10.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f138804f;
        if (chronoLocalDate != null && chronoLocalDate.h(temporalField)) {
            return this.f138804f.j(temporalField);
        }
        LocalTime localTime = this.f138805g;
        if (localTime != null && localTime.h(temporalField)) {
            return this.f138805g.j(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138956a) {
            return this.f138800b;
        }
        if (temporalQuery == j$.time.temporal.n.f138957b) {
            return this.f138801c;
        }
        if (temporalQuery == j$.time.temporal.n.f138961f) {
            ChronoLocalDate chronoLocalDate = this.f138804f;
            if (chronoLocalDate != null) {
                return LocalDate.from(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f138962g) {
            return this.f138805g;
        }
        if (temporalQuery == j$.time.temporal.n.f138959d) {
            Long l10 = (Long) ((HashMap) this.f138799a).get(ChronoField.OFFSET_SECONDS);
            if (l10 != null) {
                return ZoneOffset.ofTotalSeconds(l10.intValue());
            }
            ZoneId zoneId = this.f138800b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.n.f138960e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.n.f138958c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final void w(TemporalField temporalField, ChronoField chronoField, Long l10) {
        Long l11 = (Long) ((HashMap) this.f138799a).put(chronoField, l10);
        if (l11 == null || l11.longValue() == l10.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l11 + " differs from " + chronoField + " " + l10 + " while resolving  " + temporalField);
    }

    public final void p() {
        if (((HashMap) this.f138799a).containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f138800b;
            if (zoneId != null) {
                q(zoneId);
                return;
            }
            Long l10 = (Long) ((HashMap) this.f138799a).get(ChronoField.OFFSET_SECONDS);
            if (l10 != null) {
                q(ZoneOffset.ofTotalSeconds(l10.intValue()));
            }
        }
    }

    public final void q(ZoneId zoneId) {
        Map map = this.f138799a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        v(this.f138801c.d0(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(chronoField)).longValue()), zoneId).l());
        w(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().o0()));
    }

    public final void v(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f138804f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f138804f + " " + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f138801c.equals(chronoLocalDate.g())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f138801c);
            }
            this.f138804f = chronoLocalDate;
        }
    }

    public final void s() {
        Map map = this.f138799a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(chronoField)) {
            long jLongValue = ((Long) ((HashMap) this.f138799a).remove(chronoField)).longValue();
            ResolverStyle resolverStyle = this.f138803e;
            if (resolverStyle == ResolverStyle.STRICT || (resolverStyle == ResolverStyle.SMART && jLongValue != 0)) {
                chronoField.i0(jLongValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            w(chronoField, chronoField2, Long.valueOf(jLongValue));
        }
        Map map2 = this.f138799a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(chronoField3)) {
            long jLongValue2 = ((Long) ((HashMap) this.f138799a).remove(chronoField3)).longValue();
            ResolverStyle resolverStyle2 = this.f138803e;
            if (resolverStyle2 == ResolverStyle.STRICT || (resolverStyle2 == ResolverStyle.SMART && jLongValue2 != 0)) {
                chronoField3.i0(jLongValue2);
            }
            w(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.f138799a;
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(chronoField4)) {
            Map map4 = this.f138799a;
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(chronoField5)) {
                long jLongValue3 = ((Long) ((HashMap) this.f138799a).remove(chronoField4)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.f138799a).remove(chronoField5)).longValue();
                if (this.f138803e == ResolverStyle.LENIENT) {
                    w(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    chronoField4.i0(jLongValue3);
                    chronoField5.i0(jLongValue3);
                    w(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.f138799a;
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(chronoField6)) {
            long jLongValue5 = ((Long) ((HashMap) this.f138799a).remove(chronoField6)).longValue();
            if (this.f138803e != ResolverStyle.LENIENT) {
                chronoField6.i0(jLongValue5);
            }
            w(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            w(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            w(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            w(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.f138799a;
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(chronoField7)) {
            long jLongValue6 = ((Long) ((HashMap) this.f138799a).remove(chronoField7)).longValue();
            if (this.f138803e != ResolverStyle.LENIENT) {
                chronoField7.i0(jLongValue6);
            }
            w(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            w(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.f138799a;
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(chronoField8)) {
            long jLongValue7 = ((Long) ((HashMap) this.f138799a).remove(chronoField8)).longValue();
            if (this.f138803e != ResolverStyle.LENIENT) {
                chronoField8.i0(jLongValue7);
            }
            w(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            w(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.f138799a;
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(chronoField9)) {
            long jLongValue8 = ((Long) ((HashMap) this.f138799a).remove(chronoField9)).longValue();
            if (this.f138803e != ResolverStyle.LENIENT) {
                chronoField9.i0(jLongValue8);
            }
            w(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            w(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            w(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.f138799a;
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(chronoField10)) {
            long jLongValue9 = ((Long) ((HashMap) this.f138799a).remove(chronoField10)).longValue();
            if (this.f138803e != ResolverStyle.LENIENT) {
                chronoField10.i0(jLongValue9);
            }
            w(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            w(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.f138799a;
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(chronoField11)) {
            long jLongValue10 = ((Long) ((HashMap) this.f138799a).get(chronoField11)).longValue();
            ResolverStyle resolverStyle3 = this.f138803e;
            ResolverStyle resolverStyle4 = ResolverStyle.LENIENT;
            if (resolverStyle3 != resolverStyle4) {
                chronoField11.i0(jLongValue10);
            }
            Map map11 = this.f138799a;
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(chronoField12)) {
                long jLongValue11 = ((Long) ((HashMap) this.f138799a).remove(chronoField12)).longValue();
                if (this.f138803e != resolverStyle4) {
                    chronoField12.i0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                w(chronoField12, chronoField11, Long.valueOf(jLongValue10));
            }
            Map map12 = this.f138799a;
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(chronoField13)) {
                long jLongValue12 = ((Long) ((HashMap) this.f138799a).remove(chronoField13)).longValue();
                if (this.f138803e != resolverStyle4) {
                    chronoField13.i0(jLongValue12);
                }
                w(chronoField13, chronoField11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.f138799a;
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(chronoField14)) {
            Map map14 = this.f138799a;
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(chronoField15)) {
                Map map15 = this.f138799a;
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(chronoField16) && ((HashMap) this.f138799a).containsKey(chronoField11)) {
                    r(((Long) ((HashMap) this.f138799a).remove(chronoField14)).longValue(), ((Long) ((HashMap) this.f138799a).remove(chronoField15)).longValue(), ((Long) ((HashMap) this.f138799a).remove(chronoField16)).longValue(), ((Long) ((HashMap) this.f138799a).remove(chronoField11)).longValue());
                }
            }
        }
    }

    public final void r(long j10, long j11, long j12, long j13) {
        if (this.f138803e == ResolverStyle.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j10, 3600000000000L), Math.multiplyExact(j11, 60000000000L)), Math.multiplyExact(j12, 1000000000L)), j13);
            u(LocalTime.Z(Math.floorMod(jAddExact, 86400000000000L)), Period.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        ChronoField chronoField = ChronoField.MINUTE_OF_HOUR;
        int iA = chronoField.f138926d.a(j11, chronoField);
        ChronoField chronoField2 = ChronoField.NANO_OF_SECOND;
        int iA2 = chronoField2.f138926d.a(j13, chronoField2);
        if (this.f138803e == ResolverStyle.SMART && j10 == 24 && iA == 0 && j12 == 0 && iA2 == 0) {
            u(LocalTime.MIDNIGHT, Period.a(0, 0, 1));
            return;
        }
        ChronoField chronoField3 = ChronoField.HOUR_OF_DAY;
        int iA3 = chronoField3.f138926d.a(j10, chronoField3);
        ChronoField chronoField4 = ChronoField.SECOND_OF_MINUTE;
        u(LocalTime.Q(iA3, iA, chronoField4.f138926d.a(j12, chronoField4), iA2), Period.f138713d);
    }

    public final void u(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.f138805g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.f138805g + " " + localTime);
            }
            Period period2 = this.f138806h;
            period2.getClass();
            Period period3 = Period.f138713d;
            if (period2 != period3 && period != period3 && !this.f138806h.equals(period)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f138806h + " " + period);
            }
            this.f138806h = period;
            return;
        }
        this.f138805g = localTime;
        this.f138806h = period;
    }

    public final void o(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f138799a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.h(temporalField)) {
                try {
                    long j10 = temporalAccessor.j(temporalField);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (j10 != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + temporalField + " " + j10 + " differs from " + temporalField + " " + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f138799a);
        sb2.append(',');
        sb2.append(this.f138801c);
        if (this.f138800b != null) {
            sb2.append(',');
            sb2.append(this.f138800b);
        }
        if (this.f138804f != null || this.f138805g != null) {
            sb2.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f138804f;
            if (chronoLocalDate != null) {
                sb2.append(chronoLocalDate);
                if (this.f138805g != null) {
                    sb2.append('T');
                    sb2.append(this.f138805g);
                }
            } else {
                sb2.append(this.f138805g);
            }
        }
        return sb2.toString();
    }
}
