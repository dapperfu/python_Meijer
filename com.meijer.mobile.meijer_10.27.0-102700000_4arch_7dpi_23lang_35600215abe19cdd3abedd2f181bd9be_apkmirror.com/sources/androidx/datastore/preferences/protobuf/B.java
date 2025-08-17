package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5941g f54143a;

    /* renamed from: b, reason: collision with root package name */
    private C5948n f54144b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f54145c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC5941g f54146d;

    public int hashCode() {
        return 1;
    }

    protected void a(P p10) {
        if (this.f54145c != null) {
            return;
        }
        synchronized (this) {
            if (this.f54145c != null) {
                return;
            }
            try {
                if (this.f54143a != null) {
                    this.f54145c = p10.f().a(this.f54143a, this.f54144b);
                    this.f54146d = this.f54143a;
                } else {
                    this.f54145c = p10;
                    this.f54146d = AbstractC5941g.f54232b;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f54145c = p10;
                this.f54146d = AbstractC5941g.f54232b;
            }
        }
    }

    public int b() {
        if (this.f54146d != null) {
            return this.f54146d.size();
        }
        AbstractC5941g abstractC5941g = this.f54143a;
        if (abstractC5941g != null) {
            return abstractC5941g.size();
        }
        if (this.f54145c != null) {
            return this.f54145c.c();
        }
        return 0;
    }

    public P d(P p10) {
        P p11 = this.f54145c;
        this.f54143a = null;
        this.f54146d = null;
        this.f54145c = p10;
        return p11;
    }

    public AbstractC5941g e() {
        if (this.f54146d != null) {
            return this.f54146d;
        }
        AbstractC5941g abstractC5941g = this.f54143a;
        if (abstractC5941g != null) {
            return abstractC5941g;
        }
        synchronized (this) {
            try {
                if (this.f54146d != null) {
                    return this.f54146d;
                }
                if (this.f54145c == null) {
                    this.f54146d = AbstractC5941g.f54232b;
                } else {
                    this.f54146d = this.f54145c.g();
                }
                return this.f54146d;
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
        P p10 = this.f54145c;
        P p11 = b10.f54145c;
        return (p10 == null && p11 == null) ? e().equals(b10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(b10.c(p10.e())) : c(p11.e()).equals(p11) : p10.equals(p11);
    }

    public P c(P p10) {
        a(p10);
        return this.f54145c;
    }
}
