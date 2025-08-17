package rc;

import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import rc.C16747c;

/* loaded from: classes4.dex */
abstract class o {

    public static abstract class a {
        public abstract o a();

        abstract a b(C16279c c16279c);

        abstract a c(AbstractC16280d<?> abstractC16280d);

        abstract a d(InterfaceC16284h<?, byte[]> interfaceC16284h);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public abstract C16279c b();

    abstract AbstractC16280d<?> c();

    abstract InterfaceC16284h<?, byte[]> e();

    public abstract p f();

    public abstract String g();

    public static a a() {
        return new C16747c.b();
    }

    o() {
    }

    public byte[] d() {
        return e().apply(c().c());
    }
}
