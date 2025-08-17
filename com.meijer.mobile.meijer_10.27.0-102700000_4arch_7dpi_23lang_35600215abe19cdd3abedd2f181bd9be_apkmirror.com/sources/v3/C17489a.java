package v3;

import java.util.Arrays;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17489a {

    /* renamed from: c, reason: collision with root package name */
    private boolean f164423c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f164424d;

    /* renamed from: f, reason: collision with root package name */
    private int f164426f;

    /* renamed from: a, reason: collision with root package name */
    private C2592a f164421a = new C2592a();

    /* renamed from: b, reason: collision with root package name */
    private C2592a f164422b = new C2592a();

    /* renamed from: e, reason: collision with root package name */
    private long f164425e = -9223372036854775807L;

    /* renamed from: v3.a$a, reason: collision with other inner class name */
    private static final class C2592a {

        /* renamed from: a, reason: collision with root package name */
        private long f164427a;

        /* renamed from: b, reason: collision with root package name */
        private long f164428b;

        /* renamed from: c, reason: collision with root package name */
        private long f164429c;

        /* renamed from: d, reason: collision with root package name */
        private long f164430d;

        /* renamed from: e, reason: collision with root package name */
        private long f164431e;

        /* renamed from: f, reason: collision with root package name */
        private long f164432f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f164433g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f164434h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f164431e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f164432f / j10;
        }

        public long b() {
            return this.f164432f;
        }

        public boolean d() {
            long j10 = this.f164430d;
            if (j10 == 0) {
                return false;
            }
            return this.f164433g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f164430d > 15 && this.f164434h == 0;
        }

        public void f(long j10) {
            long j11 = this.f164430d;
            if (j11 == 0) {
                this.f164427a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f164427a;
                this.f164428b = j12;
                this.f164432f = j12;
                this.f164431e = 1L;
            } else {
                long j13 = j10 - this.f164429c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f164428b) <= 1000000) {
                    this.f164431e++;
                    this.f164432f += j13;
                    boolean[] zArr = this.f164433g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f164434h--;
                    }
                } else {
                    boolean[] zArr2 = this.f164433g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f164434h++;
                    }
                }
            }
            this.f164430d++;
            this.f164429c = j10;
        }

        public void g() {
            this.f164430d = 0L;
            this.f164431e = 0L;
            this.f164432f = 0L;
            this.f164434h = 0;
            Arrays.fill(this.f164433g, false);
        }
    }

    public int c() {
        return this.f164426f;
    }

    public boolean e() {
        return this.f164421a.e();
    }

    public void f(long j10) {
        this.f164421a.f(j10);
        if (this.f164421a.e() && !this.f164424d) {
            this.f164423c = false;
        } else if (this.f164425e != -9223372036854775807L) {
            if (!this.f164423c || this.f164422b.d()) {
                this.f164422b.g();
                this.f164422b.f(this.f164425e);
            }
            this.f164423c = true;
            this.f164422b.f(j10);
        }
        if (this.f164423c && this.f164422b.e()) {
            C2592a c2592a = this.f164421a;
            this.f164421a = this.f164422b;
            this.f164422b = c2592a;
            this.f164423c = false;
            this.f164424d = false;
        }
        this.f164425e = j10;
        this.f164426f = this.f164421a.e() ? 0 : this.f164426f + 1;
    }

    public void g() {
        this.f164421a.g();
        this.f164422b.g();
        this.f164423c = false;
        this.f164425e = -9223372036854775807L;
        this.f164426f = 0;
    }

    public long a() {
        if (e()) {
            return this.f164421a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f164421a.a());
        }
        return -1.0f;
    }

    public long d() {
        if (e()) {
            return this.f164421a.b();
        }
        return -9223372036854775807L;
    }
}
