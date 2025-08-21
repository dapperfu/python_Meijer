package v3;

import java.util.Arrays;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17628a {

    /* renamed from: c, reason: collision with root package name */
    private boolean f165457c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f165458d;

    /* renamed from: f, reason: collision with root package name */
    private int f165460f;

    /* renamed from: a, reason: collision with root package name */
    private C2613a f165455a = new C2613a();

    /* renamed from: b, reason: collision with root package name */
    private C2613a f165456b = new C2613a();

    /* renamed from: e, reason: collision with root package name */
    private long f165459e = -9223372036854775807L;

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    private static final class C2613a {

        /* renamed from: a, reason: collision with root package name */
        private long f165461a;

        /* renamed from: b, reason: collision with root package name */
        private long f165462b;

        /* renamed from: c, reason: collision with root package name */
        private long f165463c;

        /* renamed from: d, reason: collision with root package name */
        private long f165464d;

        /* renamed from: e, reason: collision with root package name */
        private long f165465e;

        /* renamed from: f, reason: collision with root package name */
        private long f165466f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f165467g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f165468h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f165465e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f165466f / j10;
        }

        public long b() {
            return this.f165466f;
        }

        public boolean d() {
            long j10 = this.f165464d;
            if (j10 == 0) {
                return false;
            }
            return this.f165467g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f165464d > 15 && this.f165468h == 0;
        }

        public void f(long j10) {
            long j11 = this.f165464d;
            if (j11 == 0) {
                this.f165461a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f165461a;
                this.f165462b = j12;
                this.f165466f = j12;
                this.f165465e = 1L;
            } else {
                long j13 = j10 - this.f165463c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f165462b) <= 1000000) {
                    this.f165465e++;
                    this.f165466f += j13;
                    boolean[] zArr = this.f165467g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f165468h--;
                    }
                } else {
                    boolean[] zArr2 = this.f165467g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f165468h++;
                    }
                }
            }
            this.f165464d++;
            this.f165463c = j10;
        }

        public void g() {
            this.f165464d = 0L;
            this.f165465e = 0L;
            this.f165466f = 0L;
            this.f165468h = 0;
            Arrays.fill(this.f165467g, false);
        }
    }

    public int c() {
        return this.f165460f;
    }

    public boolean e() {
        return this.f165455a.e();
    }

    public void f(long j10) {
        this.f165455a.f(j10);
        if (this.f165455a.e() && !this.f165458d) {
            this.f165457c = false;
        } else if (this.f165459e != -9223372036854775807L) {
            if (!this.f165457c || this.f165456b.d()) {
                this.f165456b.g();
                this.f165456b.f(this.f165459e);
            }
            this.f165457c = true;
            this.f165456b.f(j10);
        }
        if (this.f165457c && this.f165456b.e()) {
            C2613a c2613a = this.f165455a;
            this.f165455a = this.f165456b;
            this.f165456b = c2613a;
            this.f165457c = false;
            this.f165458d = false;
        }
        this.f165459e = j10;
        this.f165460f = this.f165455a.e() ? 0 : this.f165460f + 1;
    }

    public void g() {
        this.f165455a.g();
        this.f165456b.g();
        this.f165457c = false;
        this.f165459e = -9223372036854775807L;
        this.f165460f = 0;
    }

    public long a() {
        if (e()) {
            return this.f165455a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f165455a.a());
        }
        return -1.0f;
    }

    public long d() {
        if (e()) {
            return this.f165455a.b();
        }
        return -9223372036854775807L;
    }
}
