package rc;

/* renamed from: rc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16884d<T> {
    public abstract Integer a();

    public abstract AbstractC16885e b();

    public abstract T c();

    public abstract EnumC16886f d();

    public abstract AbstractC16887g e();

    public static <T> AbstractC16884d<T> f(T t10) {
        return new C16881a(null, t10, EnumC16886f.DEFAULT, null, null);
    }

    public static <T> AbstractC16884d<T> g(T t10, AbstractC16887g abstractC16887g) {
        return new C16881a(null, t10, EnumC16886f.DEFAULT, abstractC16887g, null);
    }

    public static <T> AbstractC16884d<T> h(T t10) {
        return new C16881a(null, t10, EnumC16886f.VERY_LOW, null, null);
    }

    public static <T> AbstractC16884d<T> i(T t10) {
        return new C16881a(null, t10, EnumC16886f.HIGHEST, null, null);
    }
}
