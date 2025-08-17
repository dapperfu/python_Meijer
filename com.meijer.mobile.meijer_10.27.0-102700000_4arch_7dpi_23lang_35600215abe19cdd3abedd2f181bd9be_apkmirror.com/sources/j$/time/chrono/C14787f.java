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
public final class C14787f implements j$.time.temporal.m, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f138748e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final Chronology f138749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f138751c;

    /* renamed from: d, reason: collision with root package name */
    public final int f138752d;

    static {
        j$.desugar.sun.nio.fs.g.o(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C14787f(Chronology chronology, int i10, int i11, int i12) {
        this.f138749a = chronology;
        this.f138750b = i10;
        this.f138751c = i11;
        this.f138752d = i12;
    }

    public final String toString() {
        if (this.f138750b == 0 && this.f138751c == 0 && this.f138752d == 0) {
            return this.f138749a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f138749a.toString());
        sb2.append(" P");
        int i10 = this.f138750b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f138751c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f138752d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public final Temporal C(ChronoLocalDate chronoLocalDate) {
        Temporal temporalB;
        Chronology chronology = (Chronology) chronoLocalDate.d(j$.time.temporal.n.f138957b);
        if (chronology == null || this.f138749a.equals(chronology)) {
            if (this.f138751c != 0) {
                j$.time.temporal.p pVarF = this.f138749a.F(ChronoField.MONTH_OF_YEAR);
                long j10 = (pVarF.f138963a == pVarF.f138964b && pVarF.f138965c == pVarF.f138966d && pVarF.d()) ? (pVarF.f138966d - pVarF.f138963a) + 1 : -1L;
                if (j10 > 0) {
                    temporalB = chronoLocalDate.b((this.f138750b * j10) + this.f138751c, (TemporalUnit) ChronoUnit.MONTHS);
                } else {
                    int i10 = this.f138750b;
                    Temporal temporalB2 = chronoLocalDate;
                    if (i10 != 0) {
                        temporalB2 = chronoLocalDate.b(i10, (TemporalUnit) ChronoUnit.YEARS);
                    }
                    temporalB = temporalB2.b(this.f138751c, ChronoUnit.MONTHS);
                }
            } else {
                int i11 = this.f138750b;
                temporalB = chronoLocalDate;
                if (i11 != 0) {
                    temporalB = chronoLocalDate.b(i11, (TemporalUnit) ChronoUnit.YEARS);
                }
            }
            int i12 = this.f138752d;
            return i12 != 0 ? temporalB.b(i12, ChronoUnit.DAYS) : temporalB;
        }
        throw new DateTimeException("Chronology mismatch, expected: " + this.f138749a.getId() + ", actual: " + chronology.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14787f) {
            C14787f c14787f = (C14787f) obj;
            if (this.f138750b == c14787f.f138750b && this.f138751c == c14787f.f138751c && this.f138752d == c14787f.f138752d && this.f138749a.equals(c14787f.f138749a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f138752d, 16) + (Integer.rotateLeft(this.f138751c, 8) + this.f138750b)) ^ this.f138749a.hashCode();
    }

    public Object writeReplace() {
        return new A((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
