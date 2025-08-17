package com.google.android.gms.location;

import Ad.C2816g0;
import Ad.Q;
import Jd.C;
import Jd.D;
import Jd.H;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.t;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.q2;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class LocationRequest extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private int f84712a;

    /* renamed from: b, reason: collision with root package name */
    private long f84713b;

    /* renamed from: c, reason: collision with root package name */
    private long f84714c;

    /* renamed from: d, reason: collision with root package name */
    private long f84715d;

    /* renamed from: e, reason: collision with root package name */
    private long f84716e;

    /* renamed from: f, reason: collision with root package name */
    private int f84717f;

    /* renamed from: g, reason: collision with root package name */
    private float f84718g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f84719h;

    /* renamed from: i, reason: collision with root package name */
    private long f84720i;

    /* renamed from: j, reason: collision with root package name */
    private final int f84721j;

    /* renamed from: k, reason: collision with root package name */
    private final int f84722k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f84723l;

    /* renamed from: m, reason: collision with root package name */
    private final WorkSource f84724m;

    /* renamed from: n, reason: collision with root package name */
    private final Q f84725n;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f84726a;

        /* renamed from: b, reason: collision with root package name */
        private long f84727b;

        /* renamed from: c, reason: collision with root package name */
        private long f84728c;

        /* renamed from: d, reason: collision with root package name */
        private long f84729d;

        /* renamed from: e, reason: collision with root package name */
        private long f84730e;

        /* renamed from: f, reason: collision with root package name */
        private int f84731f;

        /* renamed from: g, reason: collision with root package name */
        private float f84732g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f84733h;

        /* renamed from: i, reason: collision with root package name */
        private long f84734i;

        /* renamed from: j, reason: collision with root package name */
        private int f84735j;

        /* renamed from: k, reason: collision with root package name */
        private int f84736k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f84737l;

        /* renamed from: m, reason: collision with root package name */
        private WorkSource f84738m;

        /* renamed from: n, reason: collision with root package name */
        private Q f84739n;

        public a(int i10, long j10) {
            this(j10);
            j(i10);
        }

        public a h(float f10) {
            r.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f84732g = f10;
            return this;
        }

        public a k(boolean z10) {
            this.f84733h = z10;
            return this;
        }

        public final a m(boolean z10) {
            this.f84737l = z10;
            return this;
        }

        public final a n(WorkSource workSource) {
            this.f84738m = workSource;
            return this;
        }

        public LocationRequest a() {
            int i10 = this.f84726a;
            long j10 = this.f84727b;
            long jMin = this.f84728c;
            if (jMin == -1) {
                jMin = j10;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j10);
            }
            long jMax = Math.max(this.f84729d, this.f84727b);
            long j11 = this.f84730e;
            int i11 = this.f84731f;
            float f10 = this.f84732g;
            boolean z10 = this.f84733h;
            long j12 = this.f84734i;
            if (j12 == -1) {
                j12 = this.f84727b;
            }
            return new LocationRequest(i10, j10, jMin, jMax, Long.MAX_VALUE, j11, i11, f10, z10, j12, this.f84735j, this.f84736k, this.f84737l, new WorkSource(this.f84738m), this.f84739n);
        }

        public a b(long j10) {
            r.b(j10 > 0, "durationMillis must be greater than 0");
            this.f84730e = j10;
            return this;
        }

        public a d(long j10) {
            r.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f84727b = j10;
            return this;
        }

        public a e(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            r.b(z10, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f84734i = j10;
            return this;
        }

        public a f(long j10) {
            r.b(j10 >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.f84729d = j10;
            return this;
        }

        public a g(int i10) {
            r.b(i10 > 0, "maxUpdates must be greater than 0");
            this.f84731f = i10;
            return this;
        }

        public a i(long j10) {
            boolean z10 = true;
            if (j10 != -1 && j10 < 0) {
                z10 = false;
            }
            r.b(z10, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f84728c = j10;
            return this;
        }

        public a(long j10) {
            this.f84726a = 102;
            this.f84728c = -1L;
            this.f84729d = 0L;
            this.f84730e = Long.MAX_VALUE;
            this.f84731f = a.e.API_PRIORITY_OTHER;
            this.f84732g = 0.0f;
            this.f84733h = true;
            this.f84734i = -1L;
            this.f84735j = 0;
            this.f84736k = 0;
            this.f84737l = false;
            this.f84738m = null;
            this.f84739n = null;
            d(j10);
        }

        public a c(int i10) {
            H.a(i10);
            this.f84735j = i10;
            return this;
        }

        public a j(int i10) {
            C.a(i10);
            this.f84726a = i10;
            return this;
        }

        public final a l(int i10) {
            D.a(i10);
            this.f84736k = i10;
            return this;
        }

        public a(LocationRequest locationRequest) {
            this(locationRequest.P1(), locationRequest.q0());
            i(locationRequest.i1());
            f(locationRequest.W0());
            b(locationRequest.T());
            g(locationRequest.d1());
            h(locationRequest.g1());
            k(locationRequest.d2());
            e(locationRequest.K0());
            c(locationRequest.c0());
            int iT2 = locationRequest.T2();
            D.a(iT2);
            this.f84736k = iT2;
            this.f84737l = locationRequest.W2();
            this.f84738m = locationRequest.B3();
            Q qU3 = locationRequest.U3();
            boolean z10 = true;
            if (qU3 != null && qU3.zza()) {
                z10 = false;
            }
            r.a(z10);
            this.f84739n = qU3;
        }
    }

    @Deprecated
    public LocationRequest() {
        this(102, l8.b.f92526c, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0.0f, true, l8.b.f92526c, 0, 0, false, new WorkSource(), null);
    }

    public final WorkSource B3() {
        return this.f84724m;
    }

    public long K0() {
        return this.f84720i;
    }

    @Deprecated
    public LocationRequest O2(float f10) {
        if (f10 >= 0.0f) {
            this.f84718g = f10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(f10).length() + 22);
        sb2.append("invalid displacement: ");
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int P1() {
        return this.f84712a;
    }

    public long T() {
        return this.f84716e;
    }

    public final int T2() {
        return this.f84722k;
    }

    public long W0() {
        return this.f84715d;
    }

    public final boolean W2() {
        return this.f84723l;
    }

    public boolean a2() {
        long j10 = this.f84715d;
        return j10 > 0 && (j10 >> 1) >= this.f84713b;
    }

    public boolean b2() {
        return this.f84712a == 105;
    }

    public int c0() {
        return this.f84721j;
    }

    public int d1() {
        return this.f84717f;
    }

    public boolean d2() {
        return this.f84719h;
    }

    public float g1() {
        return this.f84718g;
    }

    public long i1() {
        return this.f84714c;
    }

    public long q0() {
        return this.f84713b;
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, boolean z11, WorkSource workSource, Q q10) {
        this.f84712a = i10;
        if (i10 == 105) {
            this.f84713b = Long.MAX_VALUE;
        } else {
            this.f84713b = j10;
        }
        this.f84714c = j11;
        this.f84715d = j12;
        this.f84716e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f84717f = i11;
        this.f84718g = f10;
        this.f84719h = z10;
        this.f84720i = j15 != -1 ? j15 : j10;
        this.f84721j = i12;
        this.f84722k = i13;
        this.f84723l = z11;
        this.f84724m = workSource;
        this.f84725n = q10;
    }

    @Deprecated
    public static LocationRequest B() {
        return new LocationRequest(102, l8.b.f92526c, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0.0f, true, l8.b.f92526c, 0, 0, false, new WorkSource(), null);
    }

    @Deprecated
    public LocationRequest J2(long j10) {
        r.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f84714c;
        long j12 = this.f84713b;
        if (j11 == j12 / 6) {
            this.f84714c = j10 / 6;
        }
        if (this.f84720i == j12) {
            this.f84720i = j10;
        }
        this.f84713b = j10;
        return this;
    }

    public final Q U3() {
        return this.f84725n;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f84712a == locationRequest.f84712a && ((b2() || this.f84713b == locationRequest.f84713b) && this.f84714c == locationRequest.f84714c && a2() == locationRequest.a2() && ((!a2() || this.f84715d == locationRequest.f84715d) && this.f84716e == locationRequest.f84716e && this.f84717f == locationRequest.f84717f && this.f84718g == locationRequest.f84718g && this.f84719h == locationRequest.f84719h && this.f84721j == locationRequest.f84721j && this.f84722k == locationRequest.f84722k && this.f84723l == locationRequest.f84723l && this.f84724m.equals(locationRequest.f84724m) && C6535q.a(this.f84725n, locationRequest.f84725n)))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f84712a), Long.valueOf(this.f84713b), Long.valueOf(this.f84714c), this.f84724m);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (b2()) {
            sb2.append(C.b(this.f84712a));
            if (this.f84715d > 0) {
                sb2.append(q2.f92724c);
                C2816g0.c(this.f84715d, sb2);
            }
        } else {
            sb2.append("@");
            if (a2()) {
                C2816g0.c(this.f84713b, sb2);
                sb2.append(q2.f92724c);
                C2816g0.c(this.f84715d, sb2);
            } else {
                C2816g0.c(this.f84713b, sb2);
            }
            sb2.append(" ");
            sb2.append(C.b(this.f84712a));
        }
        if (b2() || this.f84714c != this.f84713b) {
            sb2.append(", minUpdateInterval=");
            sb2.append(V3(this.f84714c));
        }
        if (this.f84718g > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f84718g);
        }
        if (!b2() ? this.f84720i != this.f84713b : this.f84720i != Long.MAX_VALUE) {
            sb2.append(", maxUpdateAge=");
            sb2.append(V3(this.f84720i));
        }
        if (this.f84716e != Long.MAX_VALUE) {
            sb2.append(", duration=");
            C2816g0.c(this.f84716e, sb2);
        }
        if (this.f84717f != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f84717f);
        }
        if (this.f84722k != 0) {
            sb2.append(", ");
            sb2.append(D.b(this.f84722k));
        }
        if (this.f84721j != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f84721j));
        }
        if (this.f84719h) {
            sb2.append(", waitForAccurateLocation");
        }
        if (this.f84723l) {
            sb2.append(", bypass");
        }
        if (!t.d(this.f84724m)) {
            sb2.append(", ");
            sb2.append(this.f84724m);
        }
        if (this.f84725n != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f84725n);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Deprecated
    public LocationRequest M2(int i10) {
        C.a(i10);
        this.f84712a = i10;
        return this;
    }

    @Deprecated
    public LocationRequest l2(long j10) {
        boolean z10;
        Object[] objArr = {Long.valueOf(j10)};
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r.c(z10, "illegal fastest interval: %d", objArr);
        this.f84714c = j10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, P1());
        C15137b.s(parcel, 2, q0());
        C15137b.s(parcel, 3, i1());
        C15137b.n(parcel, 6, d1());
        C15137b.k(parcel, 7, g1());
        C15137b.s(parcel, 8, W0());
        C15137b.c(parcel, 9, d2());
        C15137b.s(parcel, 10, T());
        C15137b.s(parcel, 11, K0());
        C15137b.n(parcel, 12, c0());
        C15137b.n(parcel, 13, this.f84722k);
        C15137b.c(parcel, 15, this.f84723l);
        C15137b.u(parcel, 16, this.f84724m, i10, false);
        C15137b.u(parcel, 17, this.f84725n, i10, false);
        C15137b.b(parcel, iA);
    }

    private static String V3(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        return C2816g0.b(j10);
    }
}
