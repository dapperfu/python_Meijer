package sd;

@Deprecated
/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16934a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f160417a;

    /* renamed from: b, reason: collision with root package name */
    private final String f160418b;

    /* renamed from: c, reason: collision with root package name */
    private final T f160419c;

    @Deprecated
    /* renamed from: sd.a$a, reason: collision with other inner class name */
    public static class C2502a extends AbstractC16934a<Boolean> {
        public C2502a(int i10, String str, Boolean bool) {
            super(i10, str, bool);
        }
    }

    private AbstractC16934a(int i10, String str, T t10) {
        this.f160417a = i10;
        this.f160418b = str;
        this.f160419c = t10;
        C16936c.a().a(this);
    }

    @Deprecated
    public static C2502a a(int i10, String str, Boolean bool) {
        return new C2502a(i10, str, bool);
    }
}
