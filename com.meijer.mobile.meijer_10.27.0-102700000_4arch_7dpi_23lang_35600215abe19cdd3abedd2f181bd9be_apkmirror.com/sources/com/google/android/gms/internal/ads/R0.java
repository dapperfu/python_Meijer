package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class R0 {

    /* renamed from: c, reason: collision with root package name */
    public static final R0 f69706c = new R0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f69707a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69708b;

    public R0(long j10, long j11) {
        this.f69707a = j10;
        this.f69708b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R0.class == obj.getClass()) {
            R0 r02 = (R0) obj;
            if (this.f69707a == r02.f69707a && this.f69708b == r02.f69708b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f69707a) * 31) + ((int) this.f69708b);
    }

    public final String toString() {
        return "[timeUs=" + this.f69707a + ", position=" + this.f69708b + "]";
    }
}
