package I8;

import java.lang.Enum;
import v8.C17648a;

/* loaded from: classes4.dex */
public class b<T extends Enum<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final T f14381a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14382b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14383c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f14382b == bVar.f14382b && this.f14383c == bVar.f14383c && this.f14381a == bVar.f14381a) {
                return true;
            }
        }
        return false;
    }

    public T a() {
        return this.f14381a;
    }

    public int b() {
        return this.f14383c;
    }

    public long c() {
        return this.f14382b;
    }

    public int hashCode() {
        int iHashCode = this.f14381a.hashCode() * 31;
        long j10 = this.f14382b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f14383c;
    }

    public String toString() {
        return "LifecycleEvent{eventType=" + this.f14381a + ", timestamp=" + this.f14382b + ", sequenceNumber=" + this.f14383c + '}';
    }

    public b(T t10, C17648a c17648a) {
        this.f14381a = t10;
        this.f14382b = c17648a.b();
        this.f14383c = c17648a.a();
    }
}
