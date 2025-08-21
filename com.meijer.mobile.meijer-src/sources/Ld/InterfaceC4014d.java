package Ld;

import Cd.C3046c0;

/* renamed from: Ld.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4014d {

    /* renamed from: Ld.d$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private double f18154e;

        /* renamed from: f, reason: collision with root package name */
        private double f18155f;

        /* renamed from: g, reason: collision with root package name */
        private float f18156g;

        /* renamed from: a, reason: collision with root package name */
        private String f18150a = null;

        /* renamed from: b, reason: collision with root package name */
        private int f18151b = 3;

        /* renamed from: c, reason: collision with root package name */
        private long f18152c = -1;

        /* renamed from: d, reason: collision with root package name */
        private short f18153d = -1;

        /* renamed from: h, reason: collision with root package name */
        private int f18157h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f18158i = -1;

        public InterfaceC4014d a() {
            if (this.f18150a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.f18151b;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.f18158i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f18152c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f18153d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f18157h >= 0) {
                return new C3046c0(this.f18150a, this.f18151b, (short) 1, this.f18154e, this.f18155f, this.f18156g, this.f18152c, this.f18157h, this.f18158i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public a c(long j10) {
            if (j10 < 0) {
                this.f18152c = -1L;
                return this;
            }
            this.f18152c = com.google.android.gms.common.util.i.d().c() + j10;
            return this;
        }

        public a d(String str) {
            this.f18150a = (String) com.google.android.gms.common.internal.r.m(str, "Request ID can't be set to null");
            return this;
        }

        public a e(int i10) {
            this.f18151b = i10;
            return this;
        }

        public a b(double d10, double d11, float f10) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            if (d10 >= -90.0d && d10 <= 90.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 18);
            sb2.append("Invalid latitude: ");
            sb2.append(d10);
            com.google.android.gms.common.internal.r.b(z10, sb2.toString());
            if (d11 >= -180.0d && d11 <= 180.0d) {
                z11 = true;
            } else {
                z11 = false;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 19);
            sb3.append("Invalid longitude: ");
            sb3.append(d11);
            com.google.android.gms.common.internal.r.b(z11, sb3.toString());
            if (f10 > 0.0f) {
                z12 = true;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb4.append("Invalid radius: ");
            sb4.append(f10);
            com.google.android.gms.common.internal.r.b(z12, sb4.toString());
            this.f18153d = (short) 1;
            this.f18154e = d10;
            this.f18155f = d11;
            this.f18156g = f10;
            return this;
        }
    }

    String w();
}
