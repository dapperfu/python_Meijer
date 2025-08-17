package j$.time.temporal;

import j$.time.format.B;
import j$.time.format.ResolverStyle;
import java.util.Map;

/* loaded from: classes3.dex */
public interface TemporalField {
    boolean C(TemporalAccessor temporalAccessor);

    p H(TemporalAccessor temporalAccessor);

    p Q();

    long Z(TemporalAccessor temporalAccessor);

    Temporal f0(Temporal temporal, long j10);

    boolean isDateBased();

    default TemporalAccessor O(Map map, B b10, ResolverStyle resolverStyle) {
        return null;
    }
}
