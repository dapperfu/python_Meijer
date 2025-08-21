package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10655t5 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile K5 f83259a;

    /* renamed from: b, reason: collision with root package name */
    private volatile G4 f83260b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f83261c;

    public final K5 a(K5 k52) {
        K5 k53 = this.f83259a;
        this.f83260b = null;
        this.f83259a = k52;
        return k53;
    }

    public int hashCode() {
        return 1;
    }

    public final int b() {
        if (this.f83260b != null) {
            return ((F4) this.f83260b).f82604c.length;
        }
        if (this.f83259a != null) {
            return this.f83259a.a();
        }
        return 0;
    }

    public final G4 c() {
        if (this.f83260b != null) {
            return this.f83260b;
        }
        synchronized (this) {
            try {
                if (this.f83260b != null) {
                    return this.f83260b;
                }
                if (this.f83259a == null) {
                    this.f83260b = G4.f82610b;
                } else {
                    this.f83260b = this.f83259a.b();
                }
                return this.f83260b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(K5 k52) {
        if (this.f83259a != null) {
            return;
        }
        synchronized (this) {
            if (this.f83259a != null) {
                return;
            }
            try {
                this.f83259a = k52;
                this.f83260b = G4.f82610b;
            } catch (zzmr unused) {
                this.f83261c = true;
                this.f83259a = k52;
                this.f83260b = G4.f82610b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10655t5)) {
            return false;
        }
        C10655t5 c10655t5 = (C10655t5) obj;
        K5 k52 = this.f83259a;
        K5 k53 = c10655t5.f83259a;
        if (k52 == null && k53 == null) {
            return c().equals(c10655t5.c());
        }
        if (k52 != null && k53 != null) {
            return k52.equals(k53);
        }
        if (k52 != null) {
            c10655t5.d(k52.f());
            return k52.equals(c10655t5.f83259a);
        }
        d(k53.f());
        return this.f83259a.equals(k53);
    }
}
