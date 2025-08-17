package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class u implements j, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final u f138783d;

    /* renamed from: e, reason: collision with root package name */
    public static final u[] f138784e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f138785a;

    /* renamed from: b, reason: collision with root package name */
    public final transient LocalDate f138786b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f138787c;

    static {
        u uVar = new u(-1, LocalDate.of(1868, 1, 1), "Meiji");
        f138783d = uVar;
        f138784e = new u[]{uVar, new u(0, LocalDate.of(1912, 7, 30), "Taisho"), new u(1, LocalDate.of(1926, 12, 25), "Showa"), new u(2, LocalDate.of(1989, 1, 8), "Heisei"), new u(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public final u p() {
        if (this == f138784e[r0.length - 1]) {
            return null;
        }
        return q(this.f138785a + 1);
    }

    public u(int i10, LocalDate localDate, String str) {
        this.f138785a = i10;
        this.f138786b = localDate;
        this.f138787c = str;
    }

    public static u q(int i10) {
        int i11 = i10 + 1;
        if (i11 >= 0) {
            u[] uVarArr = f138784e;
            if (i11 < uVarArr.length) {
                return uVarArr[i11];
            }
        }
        throw new DateTimeException("Invalid era: " + i10);
    }

    public static u o(LocalDate localDate) {
        if (localDate.isBefore(t.f138779d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f138784e.length - 1; length >= 0; length--) {
            u uVar = f138784e[length];
            if (localDate.compareTo((ChronoLocalDate) uVar.f138786b) >= 0) {
                return uVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.f138785a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return r.f138777c.F(chronoField);
        }
        return super.k(temporalField);
    }

    public final String toString() {
        return this.f138787c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new A((byte) 5, this);
    }
}
