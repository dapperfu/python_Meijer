package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public class L0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10833p0 f82733c = C10833p0.a();

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC10690g1 f82734a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC10605b0 f82735b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f82735b != null) {
            return ((Y) this.f82735b).f82967e.length;
        }
        if (this.f82734a != null) {
            return this.f82734a.D();
        }
        return 0;
    }

    public final AbstractC10605b0 b() {
        if (this.f82735b != null) {
            return this.f82735b;
        }
        synchronized (this) {
            try {
                if (this.f82735b != null) {
                    return this.f82735b;
                }
                if (this.f82734a == null) {
                    this.f82735b = AbstractC10605b0.f83055b;
                } else {
                    this.f82735b = this.f82734a.a();
                }
                return this.f82735b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void c(InterfaceC10690g1 interfaceC10690g1) {
        if (this.f82734a != null) {
            return;
        }
        synchronized (this) {
            if (this.f82734a == null) {
                try {
                    this.f82734a = interfaceC10690g1;
                    this.f82735b = AbstractC10605b0.f83055b;
                } catch (zzadi unused) {
                    this.f82734a = interfaceC10690g1;
                    this.f82735b = AbstractC10605b0.f83055b;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        InterfaceC10690g1 interfaceC10690g1 = this.f82734a;
        InterfaceC10690g1 interfaceC10690g12 = l02.f82734a;
        if (interfaceC10690g1 == null && interfaceC10690g12 == null) {
            return b().equals(l02.b());
        }
        if (interfaceC10690g1 != null && interfaceC10690g12 != null) {
            return interfaceC10690g1.equals(interfaceC10690g12);
        }
        if (interfaceC10690g1 != null) {
            l02.c(interfaceC10690g1.C());
            return interfaceC10690g1.equals(l02.f82734a);
        }
        c(interfaceC10690g12.C());
        return this.f82734a.equals(interfaceC10690g12);
    }
}
