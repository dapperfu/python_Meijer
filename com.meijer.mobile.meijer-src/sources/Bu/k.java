package Bu;

import gv.InterfaceC14411a;
import io.constructor.data.interceptor.RequestInterceptor;
import okhttp3.OkHttpClient;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class k implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<ew.a> f3681a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<RequestInterceptor> f3682b;

    public static k a(InterfaceC14411a<ew.a> interfaceC14411a, InterfaceC14411a<RequestInterceptor> interfaceC14411a2) {
        return new k(interfaceC14411a, interfaceC14411a2);
    }

    public static OkHttpClient c(ew.a aVar, RequestInterceptor requestInterceptor) {
        return (OkHttpClient) C18225c.d(h.f3678a.c(aVar, requestInterceptor));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public OkHttpClient get() {
        return c(this.f3681a.get(), this.f3682b.get());
    }

    public k(InterfaceC14411a<ew.a> interfaceC14411a, InterfaceC14411a<RequestInterceptor> interfaceC14411a2) {
        this.f3681a = interfaceC14411a;
        this.f3682b = interfaceC14411a2;
    }
}
