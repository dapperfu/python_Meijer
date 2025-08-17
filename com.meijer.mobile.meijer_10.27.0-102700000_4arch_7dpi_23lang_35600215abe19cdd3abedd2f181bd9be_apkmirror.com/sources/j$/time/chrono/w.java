package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w extends AbstractC14782a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final w f138789c = new w();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.Chronology
    public final j I(int i10) {
        if (i10 == 0) {
            return z.BEFORE_ROC;
        }
        if (i10 == 1) {
            return z.ROC;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.Chronology
    public final String v() {
        return "roc";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate a0(int i10, int i11, int i12) {
        return new y(LocalDate.of(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate y(int i10, int i11) {
        return new y(LocalDate.m0(i10 + 1911, i11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate o(long j10) {
        return new y(LocalDate.l0(j10));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate U() {
        return new y(LocalDate.from(LocalDate.k0(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof y) {
            return (y) temporalAccessor;
        }
        return new y(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean g0(long j10) {
        return IsoChronology.INSTANCE.g0(j10 + 1911);
    }

    @Override // j$.time.chrono.Chronology
    public final int L(j jVar, int i10) {
        if (jVar instanceof z) {
            return jVar == z.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.Chronology
    public final List G() {
        return j$.desugar.sun.nio.fs.g.o(z.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p F(ChronoField chronoField) {
        int i10 = v.f138788a[chronoField.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f138926d;
            return j$.time.temporal.p.f(pVar.f138963a - 22932, pVar.f138966d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f138926d;
            return j$.time.temporal.p.g(1L, pVar2.f138966d - 1911, (-pVar2.f138963a) + 1912);
        }
        if (i10 != 3) {
            return chronoField.f138926d;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f138926d;
        return j$.time.temporal.p.f(pVar3.f138963a - 1911, pVar3.f138966d - 1911);
    }

    @Override // j$.time.chrono.AbstractC14782a, j$.time.chrono.Chronology
    public final ChronoLocalDate c0(Map map, ResolverStyle resolverStyle) {
        return (y) super.c0(map, resolverStyle);
    }

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new A((byte) 1, this);
    }
}
