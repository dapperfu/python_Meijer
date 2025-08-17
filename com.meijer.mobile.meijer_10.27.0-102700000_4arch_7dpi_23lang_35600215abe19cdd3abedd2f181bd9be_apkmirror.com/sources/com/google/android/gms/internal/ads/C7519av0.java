package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.av0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7519av0 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC9120pv0 f72684a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Zt0 f72685b;

    public final InterfaceC9120pv0 c(InterfaceC9120pv0 interfaceC9120pv0) {
        InterfaceC9120pv0 interfaceC9120pv02 = this.f72684a;
        this.f72685b = null;
        this.f72684a = interfaceC9120pv0;
        return interfaceC9120pv02;
    }

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f72685b != null) {
            return ((Wt0) this.f72685b).f71196c.length;
        }
        if (this.f72684a != null) {
            return this.f72684a.zzaY();
        }
        return 0;
    }

    public final Zt0 b() {
        if (this.f72685b != null) {
            return this.f72685b;
        }
        synchronized (this) {
            try {
                if (this.f72685b != null) {
                    return this.f72685b;
                }
                if (this.f72684a == null) {
                    this.f72685b = Zt0.f72282b;
                } else {
                    this.f72685b = this.f72684a.a();
                }
                return this.f72685b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(InterfaceC9120pv0 interfaceC9120pv0) {
        if (this.f72684a != null) {
            return;
        }
        synchronized (this) {
            if (this.f72684a != null) {
                return;
            }
            try {
                this.f72684a = interfaceC9120pv0;
                this.f72685b = Zt0.f72282b;
            } catch (zzgyg unused) {
                this.f72684a = interfaceC9120pv0;
                this.f72685b = Zt0.f72282b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7519av0)) {
            return false;
        }
        C7519av0 c7519av0 = (C7519av0) obj;
        InterfaceC9120pv0 interfaceC9120pv0 = this.f72684a;
        InterfaceC9120pv0 interfaceC9120pv02 = c7519av0.f72684a;
        if (interfaceC9120pv0 == null && interfaceC9120pv02 == null) {
            return b().equals(c7519av0.b());
        }
        if (interfaceC9120pv0 != null && interfaceC9120pv02 != null) {
            return interfaceC9120pv0.equals(interfaceC9120pv02);
        }
        if (interfaceC9120pv0 != null) {
            c7519av0.d(interfaceC9120pv0.A());
            return interfaceC9120pv0.equals(c7519av0.f72684a);
        }
        d(interfaceC9120pv02.A());
        return this.f72684a.equals(interfaceC9120pv02);
    }
}
