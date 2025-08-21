package sc;

import java.util.List;
import sc.C17048k;

/* renamed from: sc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17058u {
    public abstract AbstractC17052o b();

    public abstract List<AbstractC17057t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC17061x f();

    public abstract long g();

    public abstract long h();

    /* renamed from: sc.u$a */
    public static abstract class a {
        public abstract AbstractC17058u a();

        public abstract a b(AbstractC17052o abstractC17052o);

        public abstract a c(List<AbstractC17057t> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(EnumC17061x enumC17061x);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C17048k.b();
    }
}
