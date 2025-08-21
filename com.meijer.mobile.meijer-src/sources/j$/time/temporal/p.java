package j$.time.temporal;

import j$.time.DateTimeException;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f139553a;

    /* renamed from: b, reason: collision with root package name */
    public final long f139554b;

    /* renamed from: c, reason: collision with root package name */
    public final long f139555c;

    /* renamed from: d, reason: collision with root package name */
    public final long f139556d;

    public static p f(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j10, j10, j11, j11);
    }

    public static p g(long j10, long j11, long j12) {
        if (j10 > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j12) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new p(j10, 1L, j11, j12);
    }

    public p(long j10, long j11, long j12, long j13) {
        this.f139553a = j10;
        this.f139554b = j11;
        this.f139555c = j12;
        this.f139556d = j13;
    }

    public final boolean d() {
        return this.f139553a >= -2147483648L && this.f139556d <= 2147483647L;
    }

    public final boolean e(long j10) {
        return j10 >= this.f139553a && j10 <= this.f139556d;
    }

    public final int a(long j10, TemporalField temporalField) {
        if (d() && e(j10)) {
            return (int) j10;
        }
        throw new DateTimeException(c(j10, temporalField));
    }

    public final void b(long j10, TemporalField temporalField) {
        if (!e(j10)) {
            throw new DateTimeException(c(j10, temporalField));
        }
    }

    public final String c(long j10, TemporalField temporalField) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j10 = this.f139553a;
        long j11 = this.f139554b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.f139555c;
        long j13 = this.f139556d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f139553a == pVar.f139553a && this.f139554b == pVar.f139554b && this.f139555c == pVar.f139555c && this.f139556d == pVar.f139556d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f139553a;
        long j11 = this.f139554b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.f139555c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.f139556d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f139553a);
        if (this.f139553a != this.f139554b) {
            sb2.append('/');
            sb2.append(this.f139554b);
        }
        sb2.append(" - ");
        sb2.append(this.f139555c);
        if (this.f139555c != this.f139556d) {
            sb2.append('/');
            sb2.append(this.f139556d);
        }
        return sb2.toString();
    }
}
