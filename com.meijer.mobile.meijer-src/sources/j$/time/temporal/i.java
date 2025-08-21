package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.format.B;
import j$.time.format.ResolverStyle;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class i implements TemporalField {
    public static final i JULIAN_DAY;
    public static final i MODIFIED_JULIAN_DAY;
    public static final i RATA_DIE;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i[] f139537f;
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f139538a;

    /* renamed from: b, reason: collision with root package name */
    public final transient TemporalUnit f139539b;

    /* renamed from: c, reason: collision with root package name */
    public final transient TemporalUnit f139540c;

    /* renamed from: d, reason: collision with root package name */
    public final transient p f139541d;

    /* renamed from: e, reason: collision with root package name */
    public final transient long f139542e;

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f139537f.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        i iVar = new i("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = iVar;
        i iVar2 = new i("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = iVar2;
        i iVar3 = new i("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = iVar3;
        f139537f = new i[]{iVar, iVar2, iVar3};
    }

    public i(String str, int i10, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j10) {
        this.f139538a = str2;
        this.f139539b = chronoUnit;
        this.f139540c = chronoUnit2;
        this.f139541d = p.f((-365243219162L) + j10, 365241780471L + j10);
        this.f139542e = j10;
    }

    @Override // j$.time.temporal.TemporalField
    public final p Q() {
        return this.f139541d;
    }

    @Override // j$.time.temporal.TemporalField
    public final Temporal f0(Temporal temporal, long j10) {
        if (!this.f139541d.e(j10)) {
            throw new DateTimeException("Invalid value: " + this.f139538a + " " + j10);
        }
        return temporal.a(Math.subtractExact(j10, this.f139542e), ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean C(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(ChronoField.EPOCH_DAY);
    }

    @Override // j$.time.temporal.TemporalField
    public final p H(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.h(ChronoField.EPOCH_DAY)) {
            return this.f139541d;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.TemporalField
    public final long Z(TemporalAccessor temporalAccessor) {
        return temporalAccessor.j(ChronoField.EPOCH_DAY) + this.f139542e;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor O(Map map, B b10, ResolverStyle resolverStyle) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyQ = Chronology.q(b10);
        ResolverStyle resolverStyle2 = ResolverStyle.LENIENT;
        long j10 = this.f139542e;
        if (resolverStyle == resolverStyle2) {
            return chronologyQ.o(Math.subtractExact(jLongValue, j10));
        }
        this.f139541d.b(jLongValue, this);
        return chronologyQ.o(jLongValue - j10);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f139538a;
    }
}
