package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC6083g f54367a;

    /* renamed from: b, reason: collision with root package name */
    private C6090n f54368b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f54369c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC6083g f54370d;

    public int hashCode() {
        return 1;
    }

    protected void a(P p10) {
        if (this.f54369c != null) {
            return;
        }
        synchronized (this) {
            if (this.f54369c != null) {
                return;
            }
            try {
                if (this.f54367a != null) {
                    this.f54369c = p10.f().a(this.f54367a, this.f54368b);
                    this.f54370d = this.f54367a;
                } else {
                    this.f54369c = p10;
                    this.f54370d = AbstractC6083g.f54456b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f54369c = p10;
                this.f54370d = AbstractC6083g.f54456b;
            }
        }
    }

    public int b() {
        if (this.f54370d != null) {
            return this.f54370d.size();
        }
        AbstractC6083g abstractC6083g = this.f54367a;
        if (abstractC6083g != null) {
            return abstractC6083g.size();
        }
        if (this.f54369c != null) {
            return this.f54369c.c();
        }
        return 0;
    }

    public P d(P p10) {
        P p11 = this.f54369c;
        this.f54367a = null;
        this.f54370d = null;
        this.f54369c = p10;
        return p11;
    }

    public AbstractC6083g e() {
        if (this.f54370d != null) {
            return this.f54370d;
        }
        AbstractC6083g abstractC6083g = this.f54367a;
        if (abstractC6083g != null) {
            return abstractC6083g;
        }
        synchronized (this) {
            try {
                if (this.f54370d != null) {
                    return this.f54370d;
                }
                if (this.f54369c == null) {
                    this.f54370d = AbstractC6083g.f54456b;
                } else {
                    this.f54370d = this.f54369c.g();
                }
                return this.f54370d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        P p10 = this.f54369c;
        P p11 = b10.f54369c;
        return (p10 == null && p11 == null) ? e().equals(b10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(b10.c(p10.e())) : c(p11.e()).equals(p11) : p10.equals(p11);
    }

    public P c(P p10) {
        a(p10);
        return this.f54369c;
    }
}
