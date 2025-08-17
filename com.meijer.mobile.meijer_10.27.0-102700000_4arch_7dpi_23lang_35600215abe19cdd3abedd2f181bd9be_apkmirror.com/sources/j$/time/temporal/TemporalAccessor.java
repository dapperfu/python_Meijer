package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface TemporalAccessor {
    boolean h(TemporalField temporalField);

    long j(TemporalField temporalField);

    default p k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.H(this);
        }
        if (h(temporalField)) {
            return ((ChronoField) temporalField).f138926d;
        }
        throw new o(j$.time.b.a("Unsupported field: ", temporalField));
    }

    default int get(TemporalField temporalField) {
        p pVarK = k(temporalField);
        if (!pVarK.d()) {
            throw new o("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j10 = j(temporalField);
        if (pVarK.e(j10)) {
            return (int) j10;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + pVarK + "): " + j10);
    }

    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == n.f138956a || temporalQuery == n.f138957b || temporalQuery == n.f138958c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
