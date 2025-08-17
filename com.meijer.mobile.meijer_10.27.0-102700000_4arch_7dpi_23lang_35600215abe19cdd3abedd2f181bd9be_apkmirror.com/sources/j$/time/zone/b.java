package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f138978e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f138979a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f138980b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f138981c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f138982d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f138979a, ((b) obj).f138979a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f138979a = localDateTime.A(zoneOffset);
        this.f138980b = localDateTime;
        this.f138981c = zoneOffset;
        this.f138982d = zoneOffset2;
    }

    public b(long j10, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f138979a = j10;
        this.f138980b = LocalDateTime.H(j10, 0, zoneOffset);
        this.f138981c = zoneOffset;
        this.f138982d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean C() {
        return this.f138982d.f138727b > this.f138981c.f138727b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f138979a == bVar.f138979a && this.f138981c.equals(bVar.f138981c) && this.f138982d.equals(bVar.f138982d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f138980b.hashCode() ^ this.f138981c.f138727b) ^ Integer.rotateLeft(this.f138982d.f138727b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(C() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f138980b);
        sb2.append(this.f138981c);
        sb2.append(" to ");
        sb2.append(this.f138982d);
        sb2.append(']');
        return sb2.toString();
    }
}
