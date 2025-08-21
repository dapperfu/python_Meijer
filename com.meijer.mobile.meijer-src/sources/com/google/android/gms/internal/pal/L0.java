package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public class L0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C10958p0 f83573c = C10958p0.a();

    /* renamed from: a, reason: collision with root package name */
    protected volatile InterfaceC10815g1 f83574a;

    /* renamed from: b, reason: collision with root package name */
    private volatile AbstractC10730b0 f83575b;

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f83575b != null) {
            return ((Y) this.f83575b).f83807e.length;
        }
        if (this.f83574a != null) {
            return this.f83574a.D();
        }
        return 0;
    }

    public final AbstractC10730b0 b() {
        if (this.f83575b != null) {
            return this.f83575b;
        }
        synchronized (this) {
            try {
                if (this.f83575b != null) {
                    return this.f83575b;
                }
                if (this.f83574a == null) {
                    this.f83575b = AbstractC10730b0.f83895b;
                } else {
                    this.f83575b = this.f83574a.a();
                }
                return this.f83575b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void c(InterfaceC10815g1 interfaceC10815g1) {
        if (this.f83574a != null) {
            return;
        }
        synchronized (this) {
            if (this.f83574a == null) {
                try {
                    this.f83574a = interfaceC10815g1;
                    this.f83575b = AbstractC10730b0.f83895b;
                } catch (zzadi unused) {
                    this.f83574a = interfaceC10815g1;
                    this.f83575b = AbstractC10730b0.f83895b;
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
        InterfaceC10815g1 interfaceC10815g1 = this.f83574a;
        InterfaceC10815g1 interfaceC10815g12 = l02.f83574a;
        if (interfaceC10815g1 == null && interfaceC10815g12 == null) {
            return b().equals(l02.b());
        }
        if (interfaceC10815g1 != null && interfaceC10815g12 != null) {
            return interfaceC10815g1.equals(interfaceC10815g12);
        }
        if (interfaceC10815g1 != null) {
            l02.c(interfaceC10815g1.C());
            return interfaceC10815g1.equals(l02.f83574a);
        }
        c(interfaceC10815g12.C());
        return this.f83574a.equals(interfaceC10815g12);
    }
}
