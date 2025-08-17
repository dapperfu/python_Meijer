package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class EH0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f66420c;

    /* renamed from: e, reason: collision with root package name */
    private int f66422e;

    /* renamed from: a, reason: collision with root package name */
    private DH0 f66418a = new DH0();

    /* renamed from: b, reason: collision with root package name */
    private DH0 f66419b = new DH0();

    /* renamed from: d, reason: collision with root package name */
    private long f66421d = -9223372036854775807L;

    public final int b() {
        return this.f66422e;
    }

    public final float a() {
        if (this.f66418a.f()) {
            return (float) (1.0E9d / this.f66418a.a());
        }
        return -1.0f;
    }

    public final long c() {
        if (this.f66418a.f()) {
            return this.f66418a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f66418a.f()) {
            return this.f66418a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j10) {
        this.f66418a.c(j10);
        if (this.f66418a.f()) {
            this.f66420c = false;
        } else if (this.f66421d != -9223372036854775807L) {
            if (!this.f66420c || this.f66419b.e()) {
                this.f66419b.d();
                this.f66419b.c(this.f66421d);
            }
            this.f66420c = true;
            this.f66419b.c(j10);
        }
        if (this.f66420c && this.f66419b.f()) {
            DH0 dh0 = this.f66418a;
            this.f66418a = this.f66419b;
            this.f66419b = dh0;
            this.f66420c = false;
        }
        this.f66421d = j10;
        this.f66422e = this.f66418a.f() ? 0 : this.f66422e + 1;
    }

    public final void f() {
        this.f66418a.d();
        this.f66419b.d();
        this.f66420c = false;
        this.f66421d = -9223372036854775807L;
        this.f66422e = 0;
    }

    public final boolean g() {
        return this.f66418a.f();
    }
}
