package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10530t5 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile K5 f82419a;

    /* renamed from: b, reason: collision with root package name */
    private volatile G4 f82420b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f82421c;

    public final K5 a(K5 k52) {
        K5 k53 = this.f82419a;
        this.f82420b = null;
        this.f82419a = k52;
        return k53;
    }

    public int hashCode() {
        return 1;
    }

    public final int b() {
        if (this.f82420b != null) {
            return ((F4) this.f82420b).f81764c.length;
        }
        if (this.f82419a != null) {
            return this.f82419a.a();
        }
        return 0;
    }

    public final G4 c() {
        if (this.f82420b != null) {
            return this.f82420b;
        }
        synchronized (this) {
            try {
                if (this.f82420b != null) {
                    return this.f82420b;
                }
                if (this.f82419a == null) {
                    this.f82420b = G4.f81770b;
                } else {
                    this.f82420b = this.f82419a.b();
                }
                return this.f82420b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(K5 k52) {
        if (this.f82419a != null) {
            return;
        }
        synchronized (this) {
            if (this.f82419a != null) {
                return;
            }
            try {
                this.f82419a = k52;
                this.f82420b = G4.f81770b;
            } catch (zzmr unused) {
                this.f82421c = true;
                this.f82419a = k52;
                this.f82420b = G4.f81770b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10530t5)) {
            return false;
        }
        C10530t5 c10530t5 = (C10530t5) obj;
        K5 k52 = this.f82419a;
        K5 k53 = c10530t5.f82419a;
        if (k52 == null && k53 == null) {
            return c().equals(c10530t5.c());
        }
        if (k52 != null && k53 != null) {
            return k52.equals(k53);
        }
        if (k52 != null) {
            c10530t5.d(k52.f());
            return k52.equals(c10530t5.f82419a);
        }
        d(k53.f());
        return this.f82419a.equals(k53);
    }
}
