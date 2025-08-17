package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class p extends j {

    /* renamed from: h, reason: collision with root package name */
    public static final LocalDate f138869h = LocalDate.of(2000, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public final ChronoLocalDate f138870g;

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        if (vVar.f138889c) {
            return super.b(vVar);
        }
        return false;
    }

    public p(TemporalField temporalField, int i10, int i11, ChronoLocalDate chronoLocalDate, int i12) {
        super(temporalField, i10, i11, SignStyle.NOT_NEGATIVE, i12);
        this.f138870g = chronoLocalDate;
    }

    @Override // j$.time.format.j
    public final long a(w wVar, long j10) {
        long jAbs = Math.abs(j10);
        ChronoLocalDate chronoLocalDate = this.f138870g;
        long j11 = chronoLocalDate != null ? Chronology.q(wVar.f138892a).P(chronoLocalDate).get(this.f138845a) : 0;
        long[] jArr = j.f138844f;
        if (j10 >= j11) {
            long j12 = jArr[this.f138846b];
            if (j10 < j11 + j12) {
                return jAbs % j12;
            }
        }
        return jAbs % jArr[this.f138847c];
    }

    @Override // j$.time.format.j
    public final int c(v vVar, long j10, int i10, int i11) {
        final p pVar;
        final v vVar2;
        final long j11;
        final int i12;
        final int i13;
        int i14;
        long j12;
        ChronoLocalDate chronoLocalDate = this.f138870g;
        if (chronoLocalDate != null) {
            i14 = vVar.d().P(chronoLocalDate).get(this.f138845a);
            pVar = this;
            vVar2 = vVar;
            j11 = j10;
            i12 = i10;
            i13 = i11;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f138864a.c(vVar2, j11, i12, i13);
                }
            };
            if (vVar2.f138891e == null) {
                vVar2.f138891e = new ArrayList();
            }
            vVar2.f138891e.add(consumer);
        } else {
            pVar = this;
            vVar2 = vVar;
            j11 = j10;
            i12 = i10;
            i13 = i11;
            i14 = 0;
        }
        int i15 = i13 - i12;
        int i16 = pVar.f138846b;
        if (i15 != i16 || j11 < 0) {
            j12 = j11;
        } else {
            long j13 = j.f138844f[i16];
            long j14 = i14;
            long j15 = j14 - (j14 % j13);
            long j16 = i14 > 0 ? j15 + j11 : j15 - j11;
            j12 = j16 < j14 ? j16 + j13 : j16;
        }
        return vVar2.g(pVar.f138845a, j12, i12, i13);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f138849e == -1) {
            return this;
        }
        return new p(this.f138845a, this.f138846b, this.f138847c, this.f138870g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i10) {
        return new p(this.f138845a, this.f138846b, this.f138847c, this.f138870g, this.f138849e + i10);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Comparable comparable = this.f138870g;
        return "ReducedValue(" + this.f138845a + "," + this.f138846b + "," + this.f138847c + "," + (comparable != null ? comparable : 0) + ")";
    }
}
