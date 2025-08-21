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
public final class C14869m implements TemporalAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139246a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f139247b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f139248c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f139249d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f139250e;

    public C14869m(n nVar, Path path, BasicFileAttributes basicFileAttributes, IOException iOException) {
        this.f139247b = nVar;
        this.f139248c = path;
        this.f139249d = basicFileAttributes;
        this.f139250e = iOException;
    }

    public C14869m(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f139247b = chronoLocalDate;
        this.f139248c = temporalAccessor;
        this.f139249d = chronology;
        this.f139250e = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean h(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f139247b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.h(temporalField);
        }
        return ((TemporalAccessor) this.f139248c).h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public j$.time.temporal.p k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f139247b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.k(temporalField);
        }
        return ((TemporalAccessor) this.f139248c).k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) this.f139247b;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.j(temporalField);
        }
        return ((TemporalAccessor) this.f139248c).j(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return (Chronology) this.f139249d;
        }
        if (temporalQuery == j$.time.temporal.n.f139546a) {
            return (ZoneId) this.f139250e;
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ((TemporalAccessor) this.f139248c).d(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public String toString() {
        String str;
        switch (this.f139246a) {
            case 1:
                TemporalAccessor temporalAccessor = (TemporalAccessor) this.f139248c;
                Chronology chronology = (Chronology) this.f139249d;
                String str2 = "";
                if (chronology != null) {
                    str = " with chronology " + chronology;
                } else {
                    str = "";
                }
                ZoneId zoneId = (ZoneId) this.f139250e;
                if (zoneId != null) {
                    str2 = " with zone " + zoneId;
                }
                return temporalAccessor + str + str2;
            default:
                return super.toString();
        }
    }
}
