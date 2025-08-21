package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.av0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7644av0 {

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC9245pv0 f73524a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Zt0 f73525b;

    public final InterfaceC9245pv0 c(InterfaceC9245pv0 interfaceC9245pv0) {
        InterfaceC9245pv0 interfaceC9245pv02 = this.f73524a;
        this.f73525b = null;
        this.f73524a = interfaceC9245pv0;
        return interfaceC9245pv02;
    }

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f73525b != null) {
            return ((Wt0) this.f73525b).f72036c.length;
        }
        if (this.f73524a != null) {
            return this.f73524a.zzaY();
        }
        return 0;
    }

    public final Zt0 b() {
        if (this.f73525b != null) {
            return this.f73525b;
        }
        synchronized (this) {
            try {
                if (this.f73525b != null) {
                    return this.f73525b;
                }
                if (this.f73524a == null) {
                    this.f73525b = Zt0.f73122b;
                } else {
                    this.f73525b = this.f73524a.a();
                }
                return this.f73525b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void d(InterfaceC9245pv0 interfaceC9245pv0) {
        if (this.f73524a != null) {
            return;
        }
        synchronized (this) {
            if (this.f73524a != null) {
                return;
            }
            try {
                this.f73524a = interfaceC9245pv0;
                this.f73525b = Zt0.f73122b;
            } catch (zzgyg unused) {
                this.f73524a = interfaceC9245pv0;
                this.f73525b = Zt0.f73122b;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7644av0)) {
            return false;
        }
        C7644av0 c7644av0 = (C7644av0) obj;
        InterfaceC9245pv0 interfaceC9245pv0 = this.f73524a;
        InterfaceC9245pv0 interfaceC9245pv02 = c7644av0.f73524a;
        if (interfaceC9245pv0 == null && interfaceC9245pv02 == null) {
            return b().equals(c7644av0.b());
        }
        if (interfaceC9245pv0 != null && interfaceC9245pv02 != null) {
            return interfaceC9245pv0.equals(interfaceC9245pv02);
        }
        if (interfaceC9245pv0 != null) {
            c7644av0.d(interfaceC9245pv0.A());
            return interfaceC9245pv0.equals(c7644av0.f73524a);
        }
        d(interfaceC9245pv02.A());
        return this.f73524a.equals(interfaceC9245pv02);
    }
}
