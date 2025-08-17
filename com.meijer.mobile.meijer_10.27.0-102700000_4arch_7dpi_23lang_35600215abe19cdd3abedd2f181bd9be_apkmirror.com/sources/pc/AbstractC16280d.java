package pc;

/* renamed from: pc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16280d<T> {
    public abstract Integer a();

    public abstract AbstractC16281e b();

    public abstract T c();

    public abstract EnumC16282f d();

    public abstract AbstractC16283g e();

    public static <T> AbstractC16280d<T> f(T t10) {
        return new C16277a(null, t10, EnumC16282f.DEFAULT, null, null);
    }

    public static <T> AbstractC16280d<T> g(T t10, AbstractC16283g abstractC16283g) {
        return new C16277a(null, t10, EnumC16282f.DEFAULT, abstractC16283g, null);
    }

    public static <T> AbstractC16280d<T> h(T t10) {
        return new C16277a(null, t10, EnumC16282f.VERY_LOW, null, null);
    }

    public static <T> AbstractC16280d<T> i(T t10) {
        return new C16277a(null, t10, EnumC16282f.HIGHEST, null, null);
    }
}
