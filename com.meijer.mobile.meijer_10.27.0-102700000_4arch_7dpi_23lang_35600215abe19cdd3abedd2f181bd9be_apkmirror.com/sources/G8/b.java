package G8;

import java.lang.Enum;
import t8.C17073a;

/* loaded from: classes4.dex */
public class b<T extends Enum<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final T f11282a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11283b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11284c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f11283b == bVar.f11283b && this.f11284c == bVar.f11284c && this.f11282a == bVar.f11282a) {
                return true;
            }
        }
        return false;
    }

    public T a() {
        return this.f11282a;
    }

    public int b() {
        return this.f11284c;
    }

    public long c() {
        return this.f11283b;
    }

    public int hashCode() {
        int iHashCode = this.f11282a.hashCode() * 31;
        long j10 = this.f11283b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f11284c;
    }

    public String toString() {
        return "LifecycleEvent{eventType=" + this.f11282a + ", timestamp=" + this.f11283b + ", sequenceNumber=" + this.f11284c + '}';
    }

    public b(T t10, C17073a c17073a) {
        this.f11282a = t10;
        this.f11283b = c17073a.b();
        this.f11284c = c17073a.a();
    }
}
