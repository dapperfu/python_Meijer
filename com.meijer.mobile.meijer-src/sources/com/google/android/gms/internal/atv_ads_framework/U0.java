package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public class U0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10400z0 f81742c = C10400z0.f81927b;

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC10372p1 f81743a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC10374q0 f81744b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f81744b != null) {
            return ((C10365n0) this.f81744b).f81865e.length;
        }
        if (this.f81743a != null) {
            return this.f81743a.zzn();
        }
        return 0;
    }

    public final AbstractC10374q0 b() {
        if (this.f81744b != null) {
            return this.f81744b;
        }
        synchronized (this) {
            try {
                if (this.f81744b != null) {
                    return this.f81744b;
                }
                if (this.f81743a == null) {
                    this.f81744b = AbstractC10374q0.f81870b;
                } else {
                    this.f81744b = this.f81743a.zzk();
                }
                return this.f81744b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void c(InterfaceC10372p1 interfaceC10372p1) {
        if (this.f81743a != null) {
            return;
        }
        synchronized (this) {
            if (this.f81743a == null) {
                try {
                    this.f81743a = interfaceC10372p1;
                    this.f81744b = AbstractC10374q0.f81870b;
                } catch (zzdr unused) {
                    this.f81743a = interfaceC10372p1;
                    this.f81744b = AbstractC10374q0.f81870b;
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
        InterfaceC10372p1 interfaceC10372p1 = this.f81743a;
        InterfaceC10372p1 interfaceC10372p12 = u02.f81743a;
        if (interfaceC10372p1 == null && interfaceC10372p12 == null) {
            return b().equals(u02.b());
        }
        if (interfaceC10372p1 != null && interfaceC10372p12 != null) {
            return interfaceC10372p1.equals(interfaceC10372p12);
        }
        if (interfaceC10372p1 != null) {
            u02.c(interfaceC10372p1.zzl());
            return interfaceC10372p1.equals(u02.f81743a);
        }
        c(interfaceC10372p12.zzl());
        return this.f81743a.equals(interfaceC10372p12);
    }
}
