package x3;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f169082c = new K(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f169083a;

    /* renamed from: b, reason: collision with root package name */
    public final long f169084b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f169083a == k10.f169083a && this.f169084b == k10.f169084b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f169083a) * 31) + ((int) this.f169084b);
    }

    public String toString() {
        return "[timeUs=" + this.f169083a + ", position=" + this.f169084b + "]";
    }

    public K(long j10, long j11) {
        this.f169083a = j10;
        this.f169084b = j11;
    }
}
