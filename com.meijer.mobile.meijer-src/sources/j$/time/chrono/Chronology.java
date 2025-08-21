package j$.time.chrono;

import io.constructor.data.local.PreferencesHelper;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.format.ResolverStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public interface Chronology extends Comparable<Chronology> {
    j$.time.temporal.p F(ChronoField chronoField);

    List G();

    j I(int i10);

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    int compareTo(Chronology chronology);

    int L(j jVar, int i10);

    ChronoLocalDate P(TemporalAccessor temporalAccessor);

    ChronoLocalDate U();

    ChronoLocalDate a0(int i10, int i11, int i12);

    ChronoLocalDate c0(Map map, ResolverStyle resolverStyle);

    boolean equals(Object obj);

    boolean g0(long j10);

    String getId();

    int hashCode();

    ChronoLocalDate o(long j10);

    String toString();

    String v();

    ChronoLocalDate y(int i10, int i11);

    static Chronology q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.d(j$.time.temporal.n.f139547b);
        IsoChronology isoChronology = IsoChronology.INSTANCE;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(isoChronology, "defaultObj");
        return isoChronology;
    }

    static Chronology of(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC14870a.f139332a;
        Objects.requireNonNull(str, PreferencesHelper.PREF_ID);
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC14870a.f139332a;
            Chronology chronology = (Chronology) concurrentHashMap2.get(str);
            if (chronology == null) {
                chronology = (Chronology) AbstractC14870a.f139333b.get(str);
            }
            if (chronology != null) {
                return chronology;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(Chronology.class).iterator();
                while (it.hasNext()) {
                    Chronology chronology2 = (Chronology) it.next();
                    if (str.equals(chronology2.getId()) || str.equals(chronology2.v())) {
                        return chronology2;
                    }
                }
                throw new DateTimeException("Unknown chronology: ".concat(str));
            }
            l lVar = l.f139349l;
            lVar.getClass();
            AbstractC14870a.H(lVar, "Hijrah-umalqura");
            r rVar = r.f139367c;
            rVar.getClass();
            AbstractC14870a.H(rVar, "Japanese");
            w wVar = w.f139379c;
            wVar.getClass();
            AbstractC14870a.H(wVar, "Minguo");
            C c10 = C.f139328c;
            c10.getClass();
            AbstractC14870a.H(c10, "ThaiBuddhist");
            try {
                for (AbstractC14870a abstractC14870a : Arrays.asList(new AbstractC14870a[0])) {
                    if (!abstractC14870a.getId().equals("ISO")) {
                        AbstractC14870a.H(abstractC14870a, abstractC14870a.getId());
                    }
                }
                IsoChronology isoChronology = IsoChronology.INSTANCE;
                isoChronology.getClass();
                AbstractC14870a.H(isoChronology, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    default ChronoLocalDateTime V(TemporalAccessor temporalAccessor) {
        try {
            return P(temporalAccessor).T(LocalTime.from(temporalAccessor));
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    default ChronoZonedDateTime x(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdC = ZoneId.C(temporalAccessor);
            try {
                temporalAccessor = d0(Instant.from(temporalAccessor), zoneIdC);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return i.H(zoneIdC, null, C14874e.C(this, V(temporalAccessor)));
            }
        } catch (DateTimeException e10) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e10);
        }
    }

    default ChronoZonedDateTime d0(Instant instant, ZoneId zoneId) {
        return i.O(this, instant, zoneId);
    }
}
