package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11437h f89098a;

    /* renamed from: b, reason: collision with root package name */
    private C11444o f89099b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile Q f89100c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC11437h f89101d;

    public int hashCode() {
        return 1;
    }

    protected void a(Q q10) {
        if (this.f89100c != null) {
            return;
        }
        synchronized (this) {
            if (this.f89100c != null) {
                return;
            }
            try {
                if (this.f89098a != null) {
                    this.f89100c = q10.f().b(this.f89098a, this.f89099b);
                    this.f89101d = this.f89098a;
                } else {
                    this.f89100c = q10;
                    this.f89101d = AbstractC11437h.f89182b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f89100c = q10;
                this.f89101d = AbstractC11437h.f89182b;
            }
        }
    }

    public int b() {
        if (this.f89101d != null) {
            return this.f89101d.size();
        }
        AbstractC11437h abstractC11437h = this.f89098a;
        if (abstractC11437h != null) {
            return abstractC11437h.size();
        }
        if (this.f89100c != null) {
            return this.f89100c.c();
        }
        return 0;
    }

    public Q d(Q q10) {
        Q q11 = this.f89100c;
        this.f89098a = null;
        this.f89101d = null;
        this.f89100c = q10;
        return q11;
    }

    public AbstractC11437h e() {
        if (this.f89101d != null) {
            return this.f89101d;
        }
        AbstractC11437h abstractC11437h = this.f89098a;
        if (abstractC11437h != null) {
            return abstractC11437h;
        }
        synchronized (this) {
            try {
                if (this.f89101d != null) {
                    return this.f89101d;
                }
                if (this.f89100c == null) {
                    this.f89101d = AbstractC11437h.f89182b;
                } else {
                    this.f89101d = this.f89100c.g();
                }
                return this.f89101d;
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
        Q q10 = this.f89100c;
        Q q11 = c10.f89100c;
        return (q10 == null && q11 == null) ? e().equals(c10.e()) : (q10 == null || q11 == null) ? q10 != null ? q10.equals(c10.c(q10.e())) : c(q11.e()).equals(q11) : q10.equals(q11);
    }

    public Q c(Q q10) {
        a(q10);
        return this.f89100c;
    }
}
