package x3;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static final K f170170c = new K(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f170171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f170172b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k10 = (K) obj;
            if (this.f170171a == k10.f170171a && this.f170172b == k10.f170172b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f170171a) * 31) + ((int) this.f170172b);
    }

    public String toString() {
        return "[timeUs=" + this.f170171a + ", position=" + this.f170172b + "]";
    }

    public K(long j10, long j11) {
        this.f170171a = j10;
        this.f170172b = j11;
    }
}
