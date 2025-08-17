package qc;

import java.util.List;
import qc.C16500k;

/* renamed from: qc.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16510u {
    public abstract AbstractC16504o b();

    public abstract List<AbstractC16509t> c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC16513x f();

    public abstract long g();

    public abstract long h();

    /* renamed from: qc.u$a */
    public static abstract class a {
        public abstract AbstractC16510u a();

        public abstract a b(AbstractC16504o abstractC16504o);

        public abstract a c(List<AbstractC16509t> list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(EnumC16513x enumC16513x);

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
        return new C16500k.b();
    }
}
