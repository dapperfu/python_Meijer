package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14875f implements j$.time.temporal.m, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f139338e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final Chronology f139339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f139340b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139342d;

    static {
        j$.desugar.sun.nio.fs.g.o(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C14875f(Chronology chronology, int i10, int i11, int i12) {
        this.f139339a = chronology;
        this.f139340b = i10;
        this.f139341c = i11;
        this.f139342d = i12;
    }

    public final String toString() {
        if (this.f139340b == 0 && this.f139341c == 0 && this.f139342d == 0) {
            return this.f139339a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f139339a.toString());
        sb2.append(" P");
        int i10 = this.f139340b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f139341c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f139342d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public final Temporal C(ChronoLocalDate chronoLocalDate) {
        Temporal temporalB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.n.f139547b);
        if (chronology == null || this.f139339a.equals(chronology)) {
            if (this.f139341c != 0) {
                j$.time.temporal.p pVarF = this.f139339a.F(ChronoField.MONTH_OF_YEAR);
                long j10 = (pVarF.f139553a == pVarF.f139554b && pVarF.f139555c == pVarF.f139556d && pVarF.d()) ? (pVarF.f139556d - pVarF.f139553a) + 1 : -1L;
                if (j10 > 0) {
                    temporalB = chronoLocalDate.b((this.f139340b * j10) + this.f139341c, (TemporalUnit) ChronoUnit.MONTHS);
                } else {
                    int i10 = this.f139340b;
                    Temporal temporalB2 = chronoLocalDate;
                    if (i10 != 0) {
                        temporalB2 = chronoLocalDate.b(i10, (TemporalUnit) ChronoUnit.YEARS);
                    }
                    temporalB = temporalB2.b(this.f139341c, ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f139340b;
                temporalB = chronoLocalDate;
                if (i11 != 0) {
                    temporalB = chronoLocalDate.b(i11, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            int i12 = this.f139342d;
            return i12 != 0 ? temporalB.b(i12, ChronoUnit.DAYS) : temporalB;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.f139339a.getId() + ", actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14875f) {
            C14875f c14875f = (C14875f) obj;
            if (this.f139340b == c14875f.f139340b && this.f139341c == c14875f.f139341c && this.f139342d == c14875f.f139342d && this.f139339a.equals(c14875f.f139339a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f139342d, 16) + (Integer.rotateLeft(this.f139341c, 8) + this.f139340b)) ^ this.f139339a.hashCode();
    }

    public Object writeReplace() {
        return new A((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
