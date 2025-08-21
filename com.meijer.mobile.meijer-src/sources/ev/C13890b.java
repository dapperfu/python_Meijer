package ev;

import java.util.concurrent.TimeUnit;

/* renamed from: ev.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13890b<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f130909a;

    /* renamed from: b, reason: collision with root package name */
    final long f130910b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f130911c;

    public long a() {
        return this.f130910b;
    }

    public T b() {
        return this.f130909a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13890b) {
            C13890b c13890b = (C13890b) obj;
            if (Nu.b.c(this.f130909a, c13890b.f130909a) && this.f130910b == c13890b.f130910b && Nu.b.c(this.f130911c, c13890b.f130911c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f130909a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f130910b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f130911c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f130910b + ", unit=" + this.f130911c + ", value=" + this.f130909a + "]";
    }

    public C13890b(T t10, long j10, TimeUnit timeUnit) {
        this.f130909a = t10;
        this.f130910b = j10;
        this.f130911c = (TimeUnit) Nu.b.e(timeUnit, "unit is null");
    }
}
