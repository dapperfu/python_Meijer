package com.google.protobuf;

/* loaded from: classes8.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final C11653n f91255e = C11653n.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11646g f91256a;

    /* renamed from: b, reason: collision with root package name */
    private C11653n f91257b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f91258c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC11646g f91259d;

    public int hashCode() {
        return 1;
    }

    protected void a(P p10) {
        if (this.f91258c != null) {
            return;
        }
        synchronized (this) {
            if (this.f91258c != null) {
                return;
            }
            try {
                if (this.f91256a != null) {
                    this.f91258c = p10.f().a(this.f91256a, this.f91257b);
                    this.f91259d = this.f91256a;
                } else {
                    this.f91258c = p10;
                    this.f91259d = AbstractC11646g.f91343b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f91258c = p10;
                this.f91259d = AbstractC11646g.f91343b;
            }
        }
    }

    public int b() {
        if (this.f91259d != null) {
            return this.f91259d.size();
        }
        AbstractC11646g abstractC11646g = this.f91256a;
        if (abstractC11646g != null) {
            return abstractC11646g.size();
        }
        if (this.f91258c != null) {
            return this.f91258c.c();
        }
        return 0;
    }

    public P d(P p10) {
        P p11 = this.f91258c;
        this.f91256a = null;
        this.f91259d = null;
        this.f91258c = p10;
        return p11;
    }

    public AbstractC11646g e() {
        if (this.f91259d != null) {
            return this.f91259d;
        }
        AbstractC11646g abstractC11646g = this.f91256a;
        if (abstractC11646g != null) {
            return abstractC11646g;
        }
        synchronized (this) {
            try {
                if (this.f91259d != null) {
                    return this.f91259d;
                }
                if (this.f91258c == null) {
                    this.f91259d = AbstractC11646g.f91343b;
                } else {
                    this.f91259d = this.f91258c.g();
                }
                return this.f91259d;
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
        P p10 = this.f91258c;
        P p11 = c10.f91258c;
        return (p10 == null && p11 == null) ? e().equals(c10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.c(p10.e())) : c(p11.e()).equals(p11) : p10.equals(p11);
    }

    public P c(P p10) {
        a(p10);
        return this.f91258c;
    }
}
