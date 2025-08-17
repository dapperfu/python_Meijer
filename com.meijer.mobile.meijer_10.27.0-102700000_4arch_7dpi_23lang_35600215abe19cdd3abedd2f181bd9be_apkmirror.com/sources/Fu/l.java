package Fu;

import io.constructor.data.interceptor.RequestInterceptor;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class l implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<PreferencesHelper> f11088a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<ConfigMemoryHolder> f11089b;

    public static l a(InterfaceC15323a<PreferencesHelper> interfaceC15323a, InterfaceC15323a<ConfigMemoryHolder> interfaceC15323a2) {
        return new l(interfaceC15323a, interfaceC15323a2);
    }

    public static RequestInterceptor c(PreferencesHelper preferencesHelper, ConfigMemoryHolder configMemoryHolder) {
        return (RequestInterceptor) Bu.c.d(h.f11083a.d(preferencesHelper, configMemoryHolder));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestInterceptor get() {
        return c(this.f11088a.get(), this.f11089b.get());
    }

    public l(InterfaceC15323a<PreferencesHelper> interfaceC15323a, InterfaceC15323a<ConfigMemoryHolder> interfaceC15323a2) {
        this.f11088a = interfaceC15323a;
        this.f11089b = interfaceC15323a2;
    }
}
