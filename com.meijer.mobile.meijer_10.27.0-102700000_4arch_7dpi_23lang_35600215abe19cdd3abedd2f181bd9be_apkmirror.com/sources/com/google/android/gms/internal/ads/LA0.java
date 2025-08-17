package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class LA0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LA0 f68303c;

    /* renamed from: d, reason: collision with root package name */
    public static final LA0 f68304d;

    /* renamed from: a, reason: collision with root package name */
    public final long f68305a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68306b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LA0.class == obj.getClass()) {
            LA0 la0 = (LA0) obj;
            if (this.f68305a == la0.f68305a && this.f68306b == la0.f68306b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f68305a) * 31) + ((int) this.f68306b);
    }

    static {
        LA0 la0 = new LA0(0L, 0L);
        f68303c = la0;
        new LA0(Long.MAX_VALUE, Long.MAX_VALUE);
        new LA0(Long.MAX_VALUE, 0L);
        new LA0(0L, Long.MAX_VALUE);
        f68304d = la0;
    }

    public LA0(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        C8086gC.d(j11 >= 0);
        this.f68305a = j10;
        this.f68306b = j11;
    }
}
