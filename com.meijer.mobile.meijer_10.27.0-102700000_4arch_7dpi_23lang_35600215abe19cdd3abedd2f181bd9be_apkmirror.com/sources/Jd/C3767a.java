package Jd;

import Ad.C2816g0;
import Ad.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Jd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3767a extends AbstractC15136a {
    public static final Parcelable.Creator<C3767a> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    private final long f14797a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14798b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14799c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14800d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14801e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14802f;

    /* renamed from: g, reason: collision with root package name */
    private final WorkSource f14803g;

    /* renamed from: h, reason: collision with root package name */
    private final Q f14804h;

    /* renamed from: Jd.a$a, reason: collision with other inner class name */
    public static final class C0237a {

        /* renamed from: a, reason: collision with root package name */
        private long f14805a = 10000;

        /* renamed from: b, reason: collision with root package name */
        private int f14806b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f14807c = 102;

        /* renamed from: d, reason: collision with root package name */
        private long f14808d = Long.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f14809e = false;

        /* renamed from: f, reason: collision with root package name */
        private final int f14810f = 0;

        /* renamed from: g, reason: collision with root package name */
        private final WorkSource f14811g = null;

        /* renamed from: h, reason: collision with root package name */
        private final Q f14812h = null;

        public C3767a a() {
            return new C3767a(this.f14805a, this.f14806b, this.f14807c, this.f14808d, this.f14809e, this.f14810f, new WorkSource(this.f14811g), this.f14812h);
        }

        public C0237a b(long j10) {
            com.google.android.gms.common.internal.r.b(j10 > 0, "durationMillis must be greater than 0");
            this.f14808d = j10;
            return this;
        }

        public C0237a c(int i10) {
            C.a(i10);
            this.f14807c = i10;
            return this;
        }
    }

    public long B() {
        return this.f14800d;
    }

    public final int K0() {
        return this.f14802f;
    }

    public int T() {
        return this.f14798b;
    }

    public final WorkSource W0() {
        return this.f14803g;
    }

    public long c0() {
        return this.f14797a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3767a)) {
            return false;
        }
        C3767a c3767a = (C3767a) obj;
        return this.f14797a == c3767a.f14797a && this.f14798b == c3767a.f14798b && this.f14799c == c3767a.f14799c && this.f14800d == c3767a.f14800d && this.f14801e == c3767a.f14801e && this.f14802f == c3767a.f14802f && C6535q.a(this.f14803g, c3767a.f14803g) && C6535q.a(this.f14804h, c3767a.f14804h);
    }

    public int hashCode() {
        return C6535q.b(Long.valueOf(this.f14797a), Integer.valueOf(this.f14798b), Integer.valueOf(this.f14799c), Long.valueOf(this.f14800d));
    }

    public int q0() {
        return this.f14799c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(C.b(this.f14799c));
        if (this.f14797a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            C2816g0.c(this.f14797a, sb2);
        }
        if (this.f14800d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f14800d);
            sb2.append("ms");
        }
        if (this.f14798b != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f14798b));
        }
        if (this.f14801e) {
            sb2.append(", bypass");
        }
        if (this.f14802f != 0) {
            sb2.append(", ");
            sb2.append(D.b(this.f14802f));
        }
        if (!com.google.android.gms.common.util.t.d(this.f14803g)) {
            sb2.append(", workSource=");
            sb2.append(this.f14803g);
        }
        if (this.f14804h != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f14804h);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean zza() {
        return this.f14801e;
    }

    C3767a(long j10, int i10, int i11, long j11, boolean z10, int i12, WorkSource workSource, Q q10) {
        this.f14797a = j10;
        this.f14798b = i10;
        this.f14799c = i11;
        this.f14800d = j11;
        this.f14801e = z10;
        this.f14802f = i12;
        this.f14803g = workSource;
        this.f14804h = q10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 1, c0());
        C15137b.n(parcel, 2, T());
        C15137b.n(parcel, 3, q0());
        C15137b.s(parcel, 4, B());
        C15137b.c(parcel, 5, this.f14801e);
        C15137b.u(parcel, 6, this.f14803g, i10, false);
        C15137b.n(parcel, 7, this.f14802f);
        C15137b.u(parcel, 9, this.f14804h, i10, false);
        C15137b.b(parcel, iA);
    }
}
