package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10451q0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Q f82381d = Q.b();

    /* renamed from: a, reason: collision with root package name */
    private A f82382a;

    /* renamed from: b, reason: collision with root package name */
    private volatile J0 f82383b;

    /* renamed from: c, reason: collision with root package name */
    private volatile A f82384c;

    private final J0 b(J0 j02) {
        if (this.f82383b == null) {
            synchronized (this) {
                if (this.f82383b == null) {
                    try {
                        this.f82383b = j02;
                        this.f82384c = A.f81937b;
                    } catch (zzco unused) {
                        this.f82383b = j02;
                        this.f82384c = A.f81937b;
                    }
                }
            }
        }
        return this.f82383b;
    }

    public final int a() {
        if (this.f82384c != null) {
            return this.f82384c.size();
        }
        if (this.f82383b != null) {
            return this.f82383b.i();
        }
        return 0;
    }

    public final J0 c(J0 j02) {
        J0 j03 = this.f82383b;
        this.f82382a = null;
        this.f82384c = null;
        this.f82383b = j02;
        return j03;
    }

    public final A d() {
        A a10;
        if (this.f82384c != null) {
            return this.f82384c;
        }
        synchronized (this) {
            try {
                if (this.f82384c != null) {
                    a10 = this.f82384c;
                } else {
                    this.f82384c = this.f82383b == null ? A.f81937b : this.f82383b.zzr();
                    a10 = this.f82384c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10451q0)) {
            return false;
        }
        C10451q0 c10451q0 = (C10451q0) obj;
        J0 j02 = this.f82383b;
        J0 j03 = c10451q0.f82383b;
        return (j02 == null && j03 == null) ? d().equals(c10451q0.d()) : (j02 == null || j03 == null) ? j02 != null ? j02.equals(c10451q0.b(j02.b())) : b(j03.b()).equals(j03) : j02.equals(j03);
    }

    public int hashCode() {
        return 1;
    }
}
