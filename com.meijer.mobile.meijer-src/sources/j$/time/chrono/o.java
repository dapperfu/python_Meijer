package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o implements j {
    public static final o AH;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o[] f139364a;

    @Override // j$.time.chrono.j
    public final int getValue() {
        return 1;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f139364a.clone();
    }

    static {
        o oVar = new o("AH", 0);
        AH = oVar;
        f139364a = new o[]{oVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return j$.time.temporal.p.f(1L, 1L);
        }
        return super.k(temporalField);
    }
}
