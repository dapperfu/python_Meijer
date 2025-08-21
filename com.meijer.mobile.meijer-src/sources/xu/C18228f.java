package xu;

/* renamed from: xu.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18228f<T> implements InterfaceC18226d<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f171032c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC18226d<T> f171033a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f171034b = f171032c;

    public static <T> InterfaceC18226d<T> a(InterfaceC18226d<T> interfaceC18226d) {
        return ((interfaceC18226d instanceof C18228f) || (interfaceC18226d instanceof C18223a)) ? interfaceC18226d : new C18228f((InterfaceC18226d) C18225c.b(interfaceC18226d));
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        T t10 = (T) this.f171034b;
        if (t10 != f171032c) {
            return t10;
        }
        InterfaceC18226d<T> interfaceC18226d = this.f171033a;
        if (interfaceC18226d == null) {
            return (T) this.f171034b;
        }
        T t11 = interfaceC18226d.get();
        this.f171034b = t11;
        this.f171033a = null;
        return t11;
    }

    private C18228f(InterfaceC18226d<T> interfaceC18226d) {
        this.f171033a = interfaceC18226d;
    }
}
