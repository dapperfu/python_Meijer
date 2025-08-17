package Fu;

import io.constructor.data.remote.ConstructorApi;
import kv.InterfaceC15323a;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class b implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Retrofit> f11075a;

    public static b a(InterfaceC15323a<Retrofit> interfaceC15323a) {
        return new b(interfaceC15323a);
    }

    public static ConstructorApi c(Retrofit retrofit) {
        return (ConstructorApi) Bu.c.d(a.f11074a.a(retrofit));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstructorApi get() {
        return c(this.f11075a.get());
    }

    public b(InterfaceC15323a<Retrofit> interfaceC15323a) {
        this.f11075a = interfaceC15323a;
    }
}
