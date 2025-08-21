package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f139568e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f139569a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f139570b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f139571c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f139572d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f139569a, ((b) obj).f139569a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f139569a = localDateTime.A(zoneOffset);
        this.f139570b = localDateTime;
        this.f139571c = zoneOffset;
        this.f139572d = zoneOffset2;
    }

    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f139569a = j10;
        this.f139570b = LocalDateTime.H(j10, 0, zoneOffset);
        this.f139571c = zoneOffset;
        this.f139572d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean C() {
        return this.f139572d.f139317b > this.f139571c.f139317b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f139569a == bVar.f139569a && this.f139571c.equals(bVar.f139571c) && this.f139572d.equals(bVar.f139572d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f139570b.hashCode() ^ this.f139571c.f139317b) ^ Integer.rotateLeft(this.f139572d.f139317b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(C() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f139570b);
        sb2.append(this.f139571c);
        sb2.append(" to ");
        sb2.append(this.f139572d);
        sb2.append(']');
        return sb2.toString();
    }
}
