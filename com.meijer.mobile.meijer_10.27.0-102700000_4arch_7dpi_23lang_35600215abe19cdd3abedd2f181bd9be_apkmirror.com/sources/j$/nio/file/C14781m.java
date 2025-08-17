package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;

/* renamed from: j$.nio.file.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14781m implements TemporalAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138657a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f138658b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f138659c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f138660d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f138661e;

    public C14781m(n nVar, Path path, BasicFileAttributes basicFileAttributes, IOException iOException) {
        this.f138658b = nVar;
        this.f138659c = path;
        this.f138660d = basicFileAttributes;
        this.f138661e = iOException;
    }

    public C14781m(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f138658b = chronoLocalDate;
        this.f138659c = temporalAccessor;
        this.f138660d = chronology;
        this.f138661e = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f138658b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.h(temporalField);
        }
        return ((TemporalAccessor) this.f138659c).h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public j$.time.temporal.p k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f138658b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.k(temporalField);
        }
        return ((TemporalAccessor) this.f138659c).k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f138658b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.j(temporalField);
        }
        return ((TemporalAccessor) this.f138659c).j(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f138957b) {
            return (Chronology) this.f138660d;
        }
        if (temporalQuery == j$.time.temporal.n.f138956a) {
            return (ZoneId) this.f138661e;
        }
        if (temporalQuery == j$.time.temporal.n.f138958c) {
            return ((TemporalAccessor) this.f138659c).d(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public String toString() {
        String str;
        switch (this.f138657a) {
            case 1:
                TemporalAccessor temporalAccessor = (TemporalAccessor) this.f138659c;
                Chronology chronology = (Chronology) this.f138660d;
                String str2 = "";
                if (chronology != null) {
                    str = " with chronology " + chronology;
                } else {
                    str = "";
                }
                ZoneId zoneId = (ZoneId) this.f138661e;
                if (zoneId != null) {
                    str2 = " with zone " + zoneId;
                }
                return temporalAccessor + str + str2;
            default:
                return super.toString();
        }
    }
}
