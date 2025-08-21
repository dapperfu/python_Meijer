package Bu;

import gv.InterfaceC14411a;
import io.constructor.data.interceptor.RequestInterceptor;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class l implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<PreferencesHelper> f3683a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<ConfigMemoryHolder> f3684b;

    public static l a(InterfaceC14411a<PreferencesHelper> interfaceC14411a, InterfaceC14411a<ConfigMemoryHolder> interfaceC14411a2) {
        return new l(interfaceC14411a, interfaceC14411a2);
    }

    public static RequestInterceptor c(PreferencesHelper preferencesHelper, ConfigMemoryHolder configMemoryHolder) {
        return (RequestInterceptor) C18225c.d(h.f3678a.d(preferencesHelper, configMemoryHolder));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestInterceptor get() {
        return c(this.f3683a.get(), this.f3684b.get());
    }

    public l(InterfaceC14411a<PreferencesHelper> interfaceC14411a, InterfaceC14411a<ConfigMemoryHolder> interfaceC14411a2) {
        this.f3683a = interfaceC14411a;
        this.f3684b = interfaceC14411a2;
    }
}
