package xb;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18147a {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?>[] f170663a;

    /* renamed from: b, reason: collision with root package name */
    protected C18147a f170664b;

    Class<?> a(Class<?> cls, String str, Object obj) {
        C18147a c18147a = this.f170664b;
        return c18147a != null ? c18147a.a(cls, str, obj) : cls;
    }

    boolean b(Class<?> cls, String str) {
        C18147a c18147a = this.f170664b;
        if (c18147a != null) {
            return c18147a.b(cls, str);
        }
        return false;
    }

    public C18147a(Class<?>... clsArr) {
        this.f170663a = clsArr;
    }
}
