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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class C extends AbstractC14870a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C f139328c = new C();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.Chronology
    public final j I(int i10) {
        if (i10 == 0) {
            return F.BEFORE_BE;
        }
        if (i10 == 1) {
            return F.BE;
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.Chronology
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final String v() {
        return "buddhist";
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate a0(int i10, int i11, int i12) {
        return new E(LocalDate.of(i10 - 543, i11, i12));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate y(int i10, int i11) {
        return new E(LocalDate.m0(i10 - 543, i11));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate o(long j10) {
        return new E(LocalDate.l0(j10));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate U() {
        return new E(LocalDate.from(LocalDate.k0(Clock.systemDefaultZone())));
    }

    @Override // j$.time.chrono.Chronology
    public final ChronoLocalDate P(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof E) {
            return (E) temporalAccessor;
        }
        return new E(LocalDate.from(temporalAccessor));
    }

    @Override // j$.time.chrono.Chronology
    public final boolean g0(long j10) {
        return IsoChronology.INSTANCE.g0(j10 - 543);
    }

    @Override // j$.time.chrono.Chronology
    public final int L(j jVar, int i10) {
        if (jVar instanceof F) {
            return jVar == F.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private C() {
    }

    @Override // j$.time.chrono.Chronology
    public final List G() {
        return j$.desugar.sun.nio.fs.g.o(F.values());
    }

    @Override // j$.time.chrono.Chronology
    public final j$.time.temporal.p F(ChronoField chronoField) {
        int i10 = B.f139327a[chronoField.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.p pVar = ChronoField.PROLEPTIC_MONTH.f139516d;
            return j$.time.temporal.p.f(pVar.f139553a + 6516, pVar.f139556d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.p pVar2 = ChronoField.YEAR.f139516d;
            return j$.time.temporal.p.g(1L, (-(pVar2.f139553a + 543)) + 1, pVar2.f139556d + 543);
        }
        if (i10 != 3) {
            return chronoField.f139516d;
        }
        j$.time.temporal.p pVar3 = ChronoField.YEAR.f139516d;
        return j$.time.temporal.p.f(pVar3.f139553a + 543, pVar3.f139556d + 543);
    }

    @Override // j$.time.chrono.AbstractC14870a, j$.time.chrono.Chronology
    public final ChronoLocalDate c0(Map map, ResolverStyle resolverStyle) {
        return (E) super.c0(map, resolverStyle);
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
