package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class EH0 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f67260c;

    /* renamed from: e, reason: collision with root package name */
    private int f67262e;

    /* renamed from: a, reason: collision with root package name */
    private DH0 f67258a = new DH0();

    /* renamed from: b, reason: collision with root package name */
    private DH0 f67259b = new DH0();

    /* renamed from: d, reason: collision with root package name */
    private long f67261d = -9223372036854775807L;

    public final int b() {
        return this.f67262e;
    }

    public final float a() {
        if (this.f67258a.f()) {
            return (float) (1.0E9d / this.f67258a.a());
        }
        return -1.0f;
    }

    public final long c() {
        if (this.f67258a.f()) {
            return this.f67258a.a();
        }
        return -9223372036854775807L;
    }

    public final long d() {
        if (this.f67258a.f()) {
            return this.f67258a.b();
        }
        return -9223372036854775807L;
    }

    public final void e(long j10) {
        this.f67258a.c(j10);
        if (this.f67258a.f()) {
            this.f67260c = false;
        } else if (this.f67261d != -9223372036854775807L) {
            if (!this.f67260c || this.f67259b.e()) {
                this.f67259b.d();
                this.f67259b.c(this.f67261d);
            }
            this.f67260c = true;
            this.f67259b.c(j10);
        }
        if (this.f67260c && this.f67259b.f()) {
            DH0 dh0 = this.f67258a;
            this.f67258a = this.f67259b;
            this.f67259b = dh0;
            this.f67260c = false;
        }
        this.f67261d = j10;
        this.f67262e = this.f67258a.f() ? 0 : this.f67262e + 1;
    }

    public final void f() {
        this.f67258a.d();
        this.f67259b.d();
        this.f67260c = false;
        this.f67261d = -9223372036854775807L;
        this.f67262e = 0;
    }

    public final boolean g() {
        return this.f67258a.f();
    }
}
