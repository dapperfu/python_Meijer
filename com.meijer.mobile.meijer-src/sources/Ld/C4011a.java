package Ld;

import Cd.C3054g0;
import Cd.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Ld.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4011a extends AbstractC15707a {
    public static final Parcelable.Creator<C4011a> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    private final long f18134a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18135b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18136c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18137d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18138e;

    /* renamed from: f, reason: collision with root package name */
    private final int f18139f;

    /* renamed from: g, reason: collision with root package name */
    private final WorkSource f18140g;

    /* renamed from: h, reason: collision with root package name */
    private final Q f18141h;

    /* renamed from: Ld.a$a, reason: collision with other inner class name */
    public static final class C0329a {

        /* renamed from: a, reason: collision with root package name */
        private long f18142a = 10000;

        /* renamed from: b, reason: collision with root package name */
        private int f18143b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f18144c = 102;

        /* renamed from: d, reason: collision with root package name */
        private long f18145d = Long.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f18146e = false;

        /* renamed from: f, reason: collision with root package name */
        private final int f18147f = 0;

        /* renamed from: g, reason: collision with root package name */
        private final WorkSource f18148g = null;

        /* renamed from: h, reason: collision with root package name */
        private final Q f18149h = null;

        public C4011a a() {
            return new C4011a(this.f18142a, this.f18143b, this.f18144c, this.f18145d, this.f18146e, this.f18147f, new WorkSource(this.f18148g), this.f18149h);
        }

        public C0329a b(long j10) {
            com.google.android.gms.common.internal.r.b(j10 > 0, "durationMillis must be greater than 0");
            this.f18145d = j10;
            return this;
        }

        public C0329a c(int i10) {
            C.a(i10);
            this.f18144c = i10;
            return this;
        }
    }

    public long B() {
        return this.f18137d;
    }

    public final int I0() {
        return this.f18139f;
    }

    public int T() {
        return this.f18135b;
    }

    public final WorkSource U0() {
        return this.f18140g;
    }

    public long b0() {
        return this.f18134a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4011a)) {
            return false;
        }
        C4011a c4011a = (C4011a) obj;
        return this.f18134a == c4011a.f18134a && this.f18135b == c4011a.f18135b && this.f18136c == c4011a.f18136c && this.f18137d == c4011a.f18137d && this.f18138e == c4011a.f18138e && this.f18139f == c4011a.f18139f && C6660q.a(this.f18140g, c4011a.f18140g) && C6660q.a(this.f18141h, c4011a.f18141h);
    }

    public int hashCode() {
        return C6660q.b(Long.valueOf(this.f18134a), Integer.valueOf(this.f18135b), Integer.valueOf(this.f18136c), Long.valueOf(this.f18137d));
    }

    public int r0() {
        return this.f18136c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(C.b(this.f18136c));
        if (this.f18134a != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            C3054g0.c(this.f18134a, sb2);
        }
        if (this.f18137d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f18137d);
            sb2.append("ms");
        }
        if (this.f18135b != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f18135b));
        }
        if (this.f18138e) {
            sb2.append(", bypass");
        }
        if (this.f18139f != 0) {
            sb2.append(", ");
            sb2.append(D.b(this.f18139f));
        }
        if (!com.google.android.gms.common.util.t.d(this.f18140g)) {
            sb2.append(", workSource=");
            sb2.append(this.f18140g);
        }
        if (this.f18141h != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f18141h);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean zza() {
        return this.f18138e;
    }

    C4011a(long j10, int i10, int i11, long j11, boolean z10, int i12, WorkSource workSource, Q q10) {
        this.f18134a = j10;
        this.f18135b = i10;
        this.f18136c = i11;
        this.f18137d = j11;
        this.f18138e = z10;
        this.f18139f = i12;
        this.f18140g = workSource;
        this.f18141h = q10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 1, b0());
        C15708b.n(parcel, 2, T());
        C15708b.n(parcel, 3, r0());
        C15708b.s(parcel, 4, B());
        C15708b.c(parcel, 5, this.f18138e);
        C15708b.u(parcel, 6, this.f18140g, i10, false);
        C15708b.n(parcel, 7, this.f18139f);
        C15708b.u(parcel, 9, this.f18141h, i10, false);
        C15708b.b(parcel, iA);
    }
}
