package tc;

import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import tc.o;

/* renamed from: tc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17221c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f162439a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162440b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16884d<?> f162441c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC16888h<?, byte[]> f162442d;

    /* renamed from: e, reason: collision with root package name */
    private final C16883c f162443e;

    /* renamed from: tc.c$b */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f162444a;

        /* renamed from: b, reason: collision with root package name */
        private String f162445b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC16884d<?> f162446c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC16888h<?, byte[]> f162447d;

        /* renamed from: e, reason: collision with root package name */
        private C16883c f162448e;

        @Override // tc.o.a
        public o a() {
            String str = "";
            if (this.f162444a == null) {
                str = " transportContext";
            }
            if (this.f162445b == null) {
                str = str + " transportName";
            }
            if (this.f162446c == null) {
                str = str + " event";
            }
            if (this.f162447d == null) {
                str = str + " transformer";
            }
            if (this.f162448e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C17221c(this.f162444a, this.f162445b, this.f162446c, this.f162447d, this.f162448e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // tc.o.a
        o.a b(C16883c c16883c) {
            if (c16883c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f162448e = c16883c;
            return this;
        }

        @Override // tc.o.a
        o.a c(AbstractC16884d<?> abstractC16884d) {
            if (abstractC16884d == null) {
                throw new NullPointerException("Null event");
            }
            this.f162446c = abstractC16884d;
            return this;
        }

        @Override // tc.o.a
        o.a d(InterfaceC16888h<?, byte[]> interfaceC16888h) {
            if (interfaceC16888h == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f162447d = interfaceC16888h;
            return this;
        }

        @Override // tc.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f162444a = pVar;
            return this;
        }

        @Override // tc.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f162445b = str;
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
            if (this.f162439a.equals(oVar.f()) && this.f162440b.equals(oVar.g()) && this.f162441c.equals(oVar.c()) && this.f162442d.equals(oVar.e()) && this.f162443e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    private C17221c(p pVar, String str, AbstractC16884d<?> abstractC16884d, InterfaceC16888h<?, byte[]> interfaceC16888h, C16883c c16883c) {
        this.f162439a = pVar;
        this.f162440b = str;
        this.f162441c = abstractC16884d;
        this.f162442d = interfaceC16888h;
        this.f162443e = c16883c;
    }

    @Override // tc.o
    public C16883c b() {
        return this.f162443e;
    }

    @Override // tc.o
    AbstractC16884d<?> c() {
        return this.f162441c;
    }

    @Override // tc.o
    InterfaceC16888h<?, byte[]> e() {
        return this.f162442d;
    }

    @Override // tc.o
    public p f() {
        return this.f162439a;
    }

    @Override // tc.o
    public String g() {
        return this.f162440b;
    }

    public int hashCode() {
        return ((((((((this.f162439a.hashCode() ^ 1000003) * 1000003) ^ this.f162440b.hashCode()) * 1000003) ^ this.f162441c.hashCode()) * 1000003) ^ this.f162442d.hashCode()) * 1000003) ^ this.f162443e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f162439a + ", transportName=" + this.f162440b + ", event=" + this.f162441c + ", transformer=" + this.f162442d + ", encoding=" + this.f162443e + "}";
    }
}
