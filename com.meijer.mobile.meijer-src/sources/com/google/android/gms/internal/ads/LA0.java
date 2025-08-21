package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class LA0 {

    /* renamed from: c, reason: collision with root package name */
    public static final LA0 f69143c;

    /* renamed from: d, reason: collision with root package name */
    public static final LA0 f69144d;

    /* renamed from: a, reason: collision with root package name */
    public final long f69145a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69146b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LA0.class == obj.getClass()) {
            LA0 la0 = (LA0) obj;
            if (this.f69145a == la0.f69145a && this.f69146b == la0.f69146b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f69145a) * 31) + ((int) this.f69146b);
    }

    static {
        LA0 la0 = new LA0(0L, 0L);
        f69143c = la0;
        new LA0(Long.MAX_VALUE, Long.MAX_VALUE);
        new LA0(Long.MAX_VALUE, 0L);
        new LA0(0L, Long.MAX_VALUE);
        f69144d = la0;
    }

    public LA0(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        C8211gC.d(j11 >= 0);
        this.f69145a = j10;
        this.f69146b = j11;
    }
}
