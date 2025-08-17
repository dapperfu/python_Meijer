package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11312h f88258a;

    /* renamed from: b, reason: collision with root package name */
    private C11319o f88259b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile Q f88260c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC11312h f88261d;

    public int hashCode() {
        return 1;
    }

    protected void a(Q q10) {
        if (this.f88260c != null) {
            return;
        }
        synchronized (this) {
            if (this.f88260c != null) {
                return;
            }
            try {
                if (this.f88258a != null) {
                    this.f88260c = q10.f().b(this.f88258a, this.f88259b);
                    this.f88261d = this.f88258a;
                } else {
                    this.f88260c = q10;
                    this.f88261d = AbstractC11312h.f88342b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f88260c = q10;
                this.f88261d = AbstractC11312h.f88342b;
            }
        }
    }

    public int b() {
        if (this.f88261d != null) {
            return this.f88261d.size();
        }
        AbstractC11312h abstractC11312h = this.f88258a;
        if (abstractC11312h != null) {
            return abstractC11312h.size();
        }
        if (this.f88260c != null) {
            return this.f88260c.c();
        }
        return 0;
    }

    public Q d(Q q10) {
        Q q11 = this.f88260c;
        this.f88258a = null;
        this.f88261d = null;
        this.f88260c = q10;
        return q11;
    }

    public AbstractC11312h e() {
        if (this.f88261d != null) {
            return this.f88261d;
        }
        AbstractC11312h abstractC11312h = this.f88258a;
        if (abstractC11312h != null) {
            return abstractC11312h;
        }
        synchronized (this) {
            try {
                if (this.f88261d != null) {
                    return this.f88261d;
                }
                if (this.f88260c == null) {
                    this.f88261d = AbstractC11312h.f88342b;
                } else {
                    this.f88261d = this.f88260c.g();
                }
                return this.f88261d;
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
        Q q10 = this.f88260c;
        Q q11 = c10.f88260c;
        return (q10 == null && q11 == null) ? e().equals(c10.e()) : (q10 == null || q11 == null) ? q10 != null ? q10.equals(c10.c(q10.e())) : c(q11.e()).equals(q11) : q10.equals(q11);
    }

    public Q c(Q q10) {
        a(q10);
        return this.f88260c;
    }
}
