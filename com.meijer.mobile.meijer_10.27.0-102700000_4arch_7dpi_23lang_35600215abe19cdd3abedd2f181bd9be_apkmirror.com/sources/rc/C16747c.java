package rc;

import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import rc.o;

/* renamed from: rc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16747c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f157949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f157950b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16280d<?> f157951c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC16284h<?, byte[]> f157952d;

    /* renamed from: e, reason: collision with root package name */
    private final C16279c f157953e;

    /* renamed from: rc.c$b */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f157954a;

        /* renamed from: b, reason: collision with root package name */
        private String f157955b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16280d<?> f157956c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC16284h<?, byte[]> f157957d;

        /* renamed from: e, reason: collision with root package name */
        private C16279c f157958e;

        @Override // rc.o.a
        public o a() {
            String str = "";
            if (this.f157954a == null) {
                str = " transportContext";
            }
            if (this.f157955b == null) {
                str = str + " transportName";
            }
            if (this.f157956c == null) {
                str = str + " event";
            }
            if (this.f157957d == null) {
                str = str + " transformer";
            }
            if (this.f157958e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C16747c(this.f157954a, this.f157955b, this.f157956c, this.f157957d, this.f157958e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // rc.o.a
        o.a b(C16279c c16279c) {
            if (c16279c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f157958e = c16279c;
            return this;
        }

        @Override // rc.o.a
        o.a c(AbstractC16280d<?> abstractC16280d) {
            if (abstractC16280d == null) {
                throw new NullPointerException("Null event");
            }
            this.f157956c = abstractC16280d;
            return this;
        }

        @Override // rc.o.a
        o.a d(InterfaceC16284h<?, byte[]> interfaceC16284h) {
            if (interfaceC16284h == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f157957d = interfaceC16284h;
            return this;
        }

        @Override // rc.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f157954a = pVar;
            return this;
        }

        @Override // rc.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f157955b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f157949a.equals(oVar.f()) && this.f157950b.equals(oVar.g()) && this.f157951c.equals(oVar.c()) && this.f157952d.equals(oVar.e()) && this.f157953e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    private C16747c(p pVar, String str, AbstractC16280d<?> abstractC16280d, InterfaceC16284h<?, byte[]> interfaceC16284h, C16279c c16279c) {
        this.f157949a = pVar;
        this.f157950b = str;
        this.f157951c = abstractC16280d;
        this.f157952d = interfaceC16284h;
        this.f157953e = c16279c;
    }

    @Override // rc.o
    public C16279c b() {
        return this.f157953e;
    }

    @Override // rc.o
    AbstractC16280d<?> c() {
        return this.f157951c;
    }

    @Override // rc.o
    InterfaceC16284h<?, byte[]> e() {
        return this.f157952d;
    }

    @Override // rc.o
    public p f() {
        return this.f157949a;
    }

    @Override // rc.o
    public String g() {
        return this.f157950b;
    }

    public int hashCode() {
        return ((((((((this.f157949a.hashCode() ^ 1000003) * 1000003) ^ this.f157950b.hashCode()) * 1000003) ^ this.f157951c.hashCode()) * 1000003) ^ this.f157952d.hashCode()) * 1000003) ^ this.f157953e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f157949a + ", transportName=" + this.f157950b + ", event=" + this.f157951c + ", transformer=" + this.f157952d + ", encoding=" + this.f157953e + "}";
    }
}
