package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10326q0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Q f81541d = Q.b();

    /* renamed from: a, reason: collision with root package name */
    private A f81542a;

    /* renamed from: b, reason: collision with root package name */
    private volatile J0 f81543b;

    /* renamed from: c, reason: collision with root package name */
    private volatile A f81544c;

    private final J0 b(J0 j02) {
        if (this.f81543b == null) {
            synchronized (this) {
                if (this.f81543b == null) {
                    try {
                        this.f81543b = j02;
                        this.f81544c = A.f81097b;
                    } catch (zzco unused) {
                        this.f81543b = j02;
                        this.f81544c = A.f81097b;
                    }
                }
            }
        }
        return this.f81543b;
    }

    public final int a() {
        if (this.f81544c != null) {
            return this.f81544c.size();
        }
        if (this.f81543b != null) {
            return this.f81543b.i();
        }
        return 0;
    }

    public final J0 c(J0 j02) {
        J0 j03 = this.f81543b;
        this.f81542a = null;
        this.f81544c = null;
        this.f81543b = j02;
        return j03;
    }

    public final A d() {
        A a10;
        if (this.f81544c != null) {
            return this.f81544c;
        }
        synchronized (this) {
            try {
                if (this.f81544c != null) {
                    a10 = this.f81544c;
                } else {
                    this.f81544c = this.f81543b == null ? A.f81097b : this.f81543b.zzr();
                    a10 = this.f81544c;
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
        if (!(obj instanceof C10326q0)) {
            return false;
        }
        C10326q0 c10326q0 = (C10326q0) obj;
        J0 j02 = this.f81543b;
        J0 j03 = c10326q0.f81543b;
        return (j02 == null && j03 == null) ? d().equals(c10326q0.d()) : (j02 == null || j03 == null) ? j02 != null ? j02.equals(c10326q0.b(j02.b())) : b(j03.b()).equals(j03) : j02.equals(j03);
    }

    public int hashCode() {
        return 1;
    }
}
