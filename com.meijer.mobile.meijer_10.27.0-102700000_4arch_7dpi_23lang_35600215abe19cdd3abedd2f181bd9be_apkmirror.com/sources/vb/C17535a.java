package vb;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17535a {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?>[] f164627a;

    /* renamed from: b, reason: collision with root package name */
    protected C17535a f164628b;

    Class<?> a(Class<?> cls, String str, Object obj) {
        C17535a c17535a = this.f164628b;
        return c17535a != null ? c17535a.a(cls, str, obj) : cls;
    }

    boolean b(Class<?> cls, String str) {
        C17535a c17535a = this.f164628b;
        if (c17535a != null) {
            return c17535a.b(cls, str);
        }
        return false;
    }

    public C17535a(Class<?>... clsArr) {
        this.f164627a = clsArr;
    }
}
