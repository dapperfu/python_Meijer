package Bu;

import gv.InterfaceC14411a;
import io.constructor.data.remote.ConstructorApi;
import retrofit2.Retrofit;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class b implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Retrofit> f3670a;

    public static b a(InterfaceC14411a<Retrofit> interfaceC14411a) {
        return new b(interfaceC14411a);
    }

    public static ConstructorApi c(Retrofit retrofit) {
        return (ConstructorApi) C18225c.d(a.f3669a.a(retrofit));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstructorApi get() {
        return c(this.f3670a.get());
    }

    public b(InterfaceC14411a<Retrofit> interfaceC14411a) {
        this.f3670a = interfaceC14411a;
    }
}
