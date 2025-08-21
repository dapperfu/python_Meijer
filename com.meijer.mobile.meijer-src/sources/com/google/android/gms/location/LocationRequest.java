package com.google.android.gms.location;

import Cd.C3054g0;
import Cd.Q;
import Ld.C;
import Ld.D;
import Ld.H;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.t;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.q2;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class LocationRequest extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private int f85552a;

    /* renamed from: b, reason: collision with root package name */
    private long f85553b;

    /* renamed from: c, reason: collision with root package name */
    private long f85554c;

    /* renamed from: d, reason: collision with root package name */
    private long f85555d;

    /* renamed from: e, reason: collision with root package name */
    private long f85556e;

    /* renamed from: f, reason: collision with root package name */
    private int f85557f;

    /* renamed from: g, reason: collision with root package name */
    private float f85558g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f85559h;

    /* renamed from: i, reason: collision with root package name */
    private long f85560i;

    /* renamed from: j, reason: collision with root package name */
    private final int f85561j;

    /* renamed from: k, reason: collision with root package name */
    private final int f85562k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f85563l;

    /* renamed from: m, reason: collision with root package name */
    private final WorkSource f85564m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f85565n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f85566a;

        /* renamed from: b, reason: collision with root package name */
        private long f85567b;

        /* renamed from: c, reason: collision with root package name */
        private long f85568c;

        /* renamed from: d, reason: collision with root package name */
        private long f85569d;

        /* renamed from: e, reason: collision with root package name */
        private long f85570e;

        /* renamed from: f, reason: collision with root package name */
        private int f85571f;

        /* renamed from: g, reason: collision with root package name */
        private float f85572g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f85573h;

        /* renamed from: i, reason: collision with root package name */
        private long f85574i;

        /* renamed from: j, reason: collision with root package name */
        private int f85575j;

        /* renamed from: k, reason: collision with root package name */
        private int f85576k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f85577l;

        /* renamed from: m, reason: collision with root package name */
        private WorkSource f85578m;

        /* renamed from: n, reason: collision with root package name */
        private Q f85579n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        public a h(float f10) {
            r.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f85572g = f10;
            return this;
        }

        public a k(boolean z10) {
            this.f85573h = z10;
            return this;
        }

        public final a m(boolean z10) {
            this.f85577l = z10;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f85578m = workSource;
            return this;
        }

        public LocationRequest a() {
            int i10 = this.f85566a;
            long j10 = this.f85567b;
            long jMin = this.f85568c;
            if (jMin == -1) {
                jMin = j10;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j10);
            }
            long jMax = Math.max(this.f85569d, this.f85567b);
            long j11 = this.f85570e;
            int i11 = this.f85571f;
            float f10 = this.f85572g;
            boolean z10 = this.f85573h;
            long j12 = this.f85574i;
            if (j12 == -1) {
                j12 = this.f85567b;
            }
            return new LocationRequest(i10, j10, jMin, jMax, Long.MAX_VALUE, j11, i11, f10, z10, j12, this.f85575j, this.f85576k, this.f85577l, new WorkSource(this.f85578m), this.f85579n);
        }

        public a b(long j10) {
            r.b(j10 > 0, "durationMillis must be greater than 0");
            this.f85570e = j10;
            return this;
        }

        public a d(long j10) {
            r.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f85567b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            r.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f85574i = j10;
            return this;
        }

        public a f(long j10) {
            r.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f85569d = j10;
            return this;
        }

        public a g(int i10) {
            r.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f85571f = i10;
            return this;
        }

        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            r.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f85568c = j10;
            return this;
        }

        public a(long j10) {
            this.f85566a = 102;
            this.f85568c = -1L;
            this.f85569d = 0L;
            this.f85570e = Long.MAX_VALUE;
            this.f85571f = a.e.API_PRIORITY_OTHER;
            this.f85572g = 0.0f;
            this.f85573h = true;
            this.f85574i = -1L;
            this.f85575j = 0;
            this.f85576k = 0;
            this.f85577l = false;
            this.f85578m = null;
            this.f85579n = null;
            d(j10);
        }

        public a c(int i10) {
            H.a(i10);
            this.f85575j = i10;
            return this;
        }

        public a j(int i10) {
            C.a(i10);
            this.f85566a = i10;
            return this;
        }

        public final a l(int i10) {
            D.a(i10);
            this.f85576k = i10;
            return this;
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.j1(), locationRequest.b0());
            i(locationRequest.h1());
            f(locationRequest.I0());
            b(locationRequest.B());
            g(locationRequest.U0());
            h(locationRequest.d1());
            k(locationRequest.a2());
            e(locationRequest.r0());
            c(locationRequest.T());
            int iC2 = locationRequest.c2();
            D.a(iC2);
            this.f85576k = iC2;
            this.f85577l = locationRequest.j2();
            this.f85578m = locationRequest.H2();
            Q qL2 = locationRequest.L2();
            boolean z10 = true;
            if (qL2 != null && qL2.zza()) {
                z10 = false;
            }
            r.a(z10);
            this.f85579n = qL2;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, l8.b.f93365c, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0.0f, true, l8.b.f93365c, 0, 0, false, new WorkSource(), null);
    }

    public long B() {
        return this.f85556e;
    }

    public final WorkSource H2() {
        return this.f85564m;
    }

    public long I0() {
        return this.f85555d;
    }

    public boolean P1() {
        return this.f85552a == 105;
    }

    public int T() {
        return this.f85561j;
    }

    public int U0() {
        return this.f85557f;
    }

    public boolean a2() {
        return this.f85559h;
    }

    public long b0() {
        return this.f85553b;
    }

    public final int c2() {
        return this.f85562k;
    }

    public float d1() {
        return this.f85558g;
    }

    public long h1() {
        return this.f85554c;
    }

    public int j1() {
        return this.f85552a;
    }

    public final boolean j2() {
        return this.f85563l;
    }

    public long r0() {
        return this.f85560i;
    }

    public boolean y1() {
        long j10 = this.f85555d;
        return j10 > 0 && (j10 >> 1) >= this.f85553b;
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, Q q10) {
        this.f85552a = i10;
        if (i10 == 105) {
            this.f85553b = Long.MAX_VALUE;
        } else {
            this.f85553b = j10;
        }
        this.f85554c = j11;
        this.f85555d = j12;
        this.f85556e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f85557f = i11;
        this.f85558g = f10;
        this.f85559h = z10;
        this.f85560i = j15 != -1 ? j15 : j10;
        this.f85561j = i12;
        this.f85562k = i13;
        this.f85563l = z11;
        this.f85564m = workSource;
        this.f85565n = q10;
    }

    public final Q L2() {
        return this.f85565n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f85552a == locationRequest.f85552a && ((P1() || this.f85553b == locationRequest.f85553b) && this.f85554c == locationRequest.f85554c && y1() == locationRequest.y1() && ((!y1() || this.f85555d == locationRequest.f85555d) && this.f85556e == locationRequest.f85556e && this.f85557f == locationRequest.f85557f && this.f85558g == locationRequest.f85558g && this.f85559h == locationRequest.f85559h && this.f85561j == locationRequest.f85561j && this.f85562k == locationRequest.f85562k && this.f85563l == locationRequest.f85563l && this.f85564m.equals(locationRequest.f85564m) && C6660q.a(this.f85565n, locationRequest.f85565n)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f85552a), Long.valueOf(this.f85553b), Long.valueOf(this.f85554c), this.f85564m);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (P1()) {
            sb2.append(C.b(this.f85552a));
            if (this.f85555d > 0) {
                sb2.append(q2.f93563c);
                C3054g0.c(this.f85555d, sb2);
            }
        } else {
            sb2.append("@");
            if (y1()) {
                C3054g0.c(this.f85553b, sb2);
                sb2.append(q2.f93563c);
                C3054g0.c(this.f85555d, sb2);
            } else {
                C3054g0.c(this.f85553b, sb2);
            }
            sb2.append(" ");
            sb2.append(C.b(this.f85552a));
        }
        if (P1() || this.f85554c != this.f85553b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(N2(this.f85554c));
        }
        if (this.f85558g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f85558g);
        }
        if (!P1() ? this.f85560i != this.f85553b : this.f85560i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(N2(this.f85560i));
        }
        if (this.f85556e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            C3054g0.c(this.f85556e, sb2);
        }
        if (this.f85557f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f85557f);
        }
        if (this.f85562k != 0) {
            sb2.append(", ");
            sb2.append(D.b(this.f85562k));
        }
        if (this.f85561j != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f85561j));
        }
        if (this.f85559h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f85563l) {
            sb2.append(", bypass");
        }
        if (!t.d(this.f85564m)) {
            sb2.append(", ");
            sb2.append(this.f85564m);
        }
        if (this.f85565n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f85565n);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, j1());
        C15708b.s(parcel, 2, b0());
        C15708b.s(parcel, 3, h1());
        C15708b.n(parcel, 6, U0());
        C15708b.k(parcel, 7, d1());
        C15708b.s(parcel, 8, I0());
        C15708b.c(parcel, 9, a2());
        C15708b.s(parcel, 10, B());
        C15708b.s(parcel, 11, r0());
        C15708b.n(parcel, 12, T());
        C15708b.n(parcel, 13, this.f85562k);
        C15708b.c(parcel, 15, this.f85563l);
        C15708b.u(parcel, 16, this.f85564m, i10, false);
        C15708b.u(parcel, 17, this.f85565n, i10, false);
        C15708b.b(parcel, iA);
    }

    private static String N2(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        return C3054g0.b(j10);
    }
}
