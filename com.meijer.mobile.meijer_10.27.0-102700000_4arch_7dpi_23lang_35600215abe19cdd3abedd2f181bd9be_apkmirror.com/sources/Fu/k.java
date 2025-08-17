package Fu;

import io.constructor.data.interceptor.RequestInterceptor;
import kv.InterfaceC15323a;
import okhttp3.OkHttpClient;

/* loaded from: classes7.dex */
public final class k implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<iw.a> f11086a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<RequestInterceptor> f11087b;

    public static k a(InterfaceC15323a<iw.a> interfaceC15323a, InterfaceC15323a<RequestInterceptor> interfaceC15323a2) {
        return new k(interfaceC15323a, interfaceC15323a2);
    }

    public static OkHttpClient c(iw.a aVar, RequestInterceptor requestInterceptor) {
        return (OkHttpClient) Bu.c.d(h.f11083a.c(aVar, requestInterceptor));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public OkHttpClient get() {
        return c(this.f11086a.get(), this.f11087b.get());
    }

    public k(InterfaceC15323a<iw.a> interfaceC15323a, InterfaceC15323a<RequestInterceptor> interfaceC15323a2) {
        this.f11086a = interfaceC15323a;
        this.f11087b = interfaceC15323a2;
    }
}
