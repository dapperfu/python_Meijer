package tc;

import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import tc.C17221c;

/* loaded from: classes4.dex */
abstract class o {

    public static abstract class a {
        public abstract o a();

        abstract a b(C16883c c16883c);

        abstract a c(AbstractC16884d<?> abstractC16884d);

        abstract a d(InterfaceC16888h<?, byte[]> interfaceC16888h);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public abstract C16883c b();

    abstract AbstractC16884d<?> c();

    abstract InterfaceC16888h<?, byte[]> e();

    public abstract p f();

    public abstract String g();

    public static a a() {
        return new C17221c.b();
    }

    o() {
    }

    public byte[] d() {
        return e().apply(c().c());
    }
}
