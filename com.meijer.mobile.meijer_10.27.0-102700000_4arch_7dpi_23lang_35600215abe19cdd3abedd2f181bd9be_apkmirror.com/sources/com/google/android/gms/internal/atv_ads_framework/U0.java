package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public class U0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10275z0 f80902c = C10275z0.f81087b;

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC10247p1 f80903a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC10249q0 f80904b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f80904b != null) {
            return ((C10240n0) this.f80904b).f81025e.length;
        }
        if (this.f80903a != null) {
            return this.f80903a.zzn();
        }
        return 0;
    }

    public final AbstractC10249q0 b() {
        if (this.f80904b != null) {
            return this.f80904b;
        }
        synchronized (this) {
            try {
                if (this.f80904b != null) {
                    return this.f80904b;
                }
                if (this.f80903a == null) {
                    this.f80904b = AbstractC10249q0.f81030b;
                } else {
                    this.f80904b = this.f80903a.zzk();
                }
                return this.f80904b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void c(InterfaceC10247p1 interfaceC10247p1) {
        if (this.f80903a != null) {
            return;
        }
        synchronized (this) {
            if (this.f80903a == null) {
                try {
                    this.f80903a = interfaceC10247p1;
                    this.f80904b = AbstractC10249q0.f81030b;
                } catch (zzdr unused) {
                    this.f80903a = interfaceC10247p1;
                    this.f80904b = AbstractC10249q0.f81030b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        InterfaceC10247p1 interfaceC10247p1 = this.f80903a;
        InterfaceC10247p1 interfaceC10247p12 = u02.f80903a;
        if (interfaceC10247p1 == null && interfaceC10247p12 == null) {
            return b().equals(u02.b());
        }
        if (interfaceC10247p1 != null && interfaceC10247p12 != null) {
            return interfaceC10247p1.equals(interfaceC10247p12);
        }
        if (interfaceC10247p1 != null) {
            u02.c(interfaceC10247p1.zzl());
            return interfaceC10247p1.equals(u02.f80903a);
        }
        c(interfaceC10247p12.zzl());
        return this.f80903a.equals(interfaceC10247p12);
    }
}
