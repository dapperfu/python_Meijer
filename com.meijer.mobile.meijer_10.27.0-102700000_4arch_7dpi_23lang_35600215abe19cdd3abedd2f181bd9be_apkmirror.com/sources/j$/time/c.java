package j$.time;

import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements TemporalQuery, j$.time.temporal.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138734a;

    public /* synthetic */ c(int i10) {
        this.f138734a = i10;
    }

    @Override // j$.time.temporal.k
    public Temporal f(Temporal temporal) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return temporal.a(temporal.k(chronoField).f138966d, chronoField);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i10 = this.f138734a;
        c cVar = j$.time.temporal.n.f138956a;
        switch (i10) {
            case 0:
                return Instant.from(temporalAccessor);
            case 1:
                return LocalDate.from(temporalAccessor);
            case 2:
                return LocalDateTime.from(temporalAccessor);
            case 3:
                return LocalTime.from(temporalAccessor);
            case 4:
                return OffsetDateTime.from(temporalAccessor);
            case 5:
                return YearMonth.from(temporalAccessor);
            case 6:
                c cVar2 = DateTimeFormatterBuilder.f138820h;
                ZoneId zoneId = (ZoneId) temporalAccessor.d(cVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 7:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.h(chronoField)) {
                    return LocalTime.Z(temporalAccessor.j(chronoField));
                }
                return null;
            case 8:
                return (ZoneId) temporalAccessor.d(cVar);
            case 9:
                return (Chronology) temporalAccessor.d(j$.time.temporal.n.f138957b);
            case 10:
                return (TemporalUnit) temporalAccessor.d(j$.time.temporal.n.f138958c);
            case 11:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.h(chronoField2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField2));
                }
                return null;
            case 12:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.d(cVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.d(j$.time.temporal.n.f138959d);
            case 13:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.h(chronoField3)) {
                    return LocalDate.l0(temporalAccessor.j(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f138734a) {
            case 8:
                return "ZoneId";
            case 9:
                return "Chronology";
            case 10:
                return "Precision";
            case 11:
                return "ZoneOffset";
            case 12:
                return "Zone";
            case 13:
                return "LocalDate";
            case 14:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
