package iv;

import java.util.concurrent.TimeUnit;

/* renamed from: iv.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14765b<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f138520a;

    /* renamed from: b, reason: collision with root package name */
    final long f138521b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f138522c;

    public long a() {
        return this.f138521b;
    }

    public T b() {
        return this.f138520a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14765b) {
            C14765b c14765b = (C14765b) obj;
            if (Ru.b.c(this.f138520a, c14765b.f138520a) && this.f138521b == c14765b.f138521b && Ru.b.c(this.f138522c, c14765b.f138522c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f138520a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f138521b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f138522c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f138521b + ", unit=" + this.f138522c + ", value=" + this.f138520a + "]";
    }

    public C14765b(T t10, long j10, TimeUnit timeUnit) {
        this.f138520a = t10;
        this.f138521b = j10;
        this.f138522c = (TimeUnit) Ru.b.e(timeUnit, "unit is null");
    }
}
