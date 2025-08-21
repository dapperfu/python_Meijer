package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class R0 {

    /* renamed from: c, reason: collision with root package name */
    public static final R0 f70546c = new R0(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f70547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f70548b;

    public R0(long j10, long j11) {
        this.f70547a = j10;
        this.f70548b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R0.class == obj.getClass()) {
            R0 r02 = (R0) obj;
            if (this.f70547a == r02.f70547a && this.f70548b == r02.f70548b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f70547a) * 31) + ((int) this.f70548b);
    }

    public final String toString() {
        return "[timeUs=" + this.f70547a + ", position=" + this.f70548b + "]";
    }
}
