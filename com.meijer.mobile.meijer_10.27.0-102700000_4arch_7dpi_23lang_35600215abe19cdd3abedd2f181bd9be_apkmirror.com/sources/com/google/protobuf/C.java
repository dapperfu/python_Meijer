package com.google.protobuf;

/* loaded from: classes7.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final C11528n f90416e = C11528n.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11521g f90417a;

    /* renamed from: b, reason: collision with root package name */
    private C11528n f90418b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f90419c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC11521g f90420d;

    public int hashCode() {
        return 1;
    }

    protected void a(P p10) {
        if (this.f90419c != null) {
            return;
        }
        synchronized (this) {
            if (this.f90419c != null) {
                return;
            }
            try {
                if (this.f90417a != null) {
                    this.f90419c = p10.f().a(this.f90417a, this.f90418b);
                    this.f90420d = this.f90417a;
                } else {
                    this.f90419c = p10;
                    this.f90420d = AbstractC11521g.f90504b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f90419c = p10;
                this.f90420d = AbstractC11521g.f90504b;
            }
        }
    }

    public int b() {
        if (this.f90420d != null) {
            return this.f90420d.size();
        }
        AbstractC11521g abstractC11521g = this.f90417a;
        if (abstractC11521g != null) {
            return abstractC11521g.size();
        }
        if (this.f90419c != null) {
            return this.f90419c.c();
        }
        return 0;
    }

    public P d(P p10) {
        P p11 = this.f90419c;
        this.f90417a = null;
        this.f90420d = null;
        this.f90419c = p10;
        return p11;
    }

    public AbstractC11521g e() {
        if (this.f90420d != null) {
            return this.f90420d;
        }
        AbstractC11521g abstractC11521g = this.f90417a;
        if (abstractC11521g != null) {
            return abstractC11521g;
        }
        synchronized (this) {
            try {
                if (this.f90420d != null) {
                    return this.f90420d;
                }
                if (this.f90419c == null) {
                    this.f90420d = AbstractC11521g.f90504b;
                } else {
                    this.f90420d = this.f90419c.g();
                }
                return this.f90420d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        P p10 = this.f90419c;
        P p11 = c10.f90419c;
        return (p10 == null && p11 == null) ? e().equals(c10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.c(p10.e())) : c(p11.e()).equals(p11) : p10.equals(p11);
    }

    public P c(P p10) {
        a(p10);
        return this.f90419c;
    }
}
