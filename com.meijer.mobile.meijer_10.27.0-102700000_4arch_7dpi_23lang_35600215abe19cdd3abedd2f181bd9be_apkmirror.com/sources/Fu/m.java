package Fu;

import com.squareup.moshi.t;
import io.constructor.data.local.PreferencesHelper;
import kv.InterfaceC15323a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class m implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<OkHttpClient> f11090a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<t> f11091b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<PreferencesHelper> f11092c;

    public static m a(InterfaceC15323a<OkHttpClient> interfaceC15323a, InterfaceC15323a<t> interfaceC15323a2, InterfaceC15323a<PreferencesHelper> interfaceC15323a3) {
        return new m(interfaceC15323a, interfaceC15323a2, interfaceC15323a3);
    }

    public static Retrofit c(OkHttpClient okHttpClient, t tVar, PreferencesHelper preferencesHelper) {
        return (Retrofit) Bu.c.d(h.f11083a.e(okHttpClient, tVar, preferencesHelper));
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Retrofit get() {
        return c(this.f11090a.get(), this.f11091b.get(), this.f11092c.get());
    }

    public m(InterfaceC15323a<OkHttpClient> interfaceC15323a, InterfaceC15323a<t> interfaceC15323a2, InterfaceC15323a<PreferencesHelper> interfaceC15323a3) {
        this.f11090a = interfaceC15323a;
        this.f11091b = interfaceC15323a2;
        this.f11092c = interfaceC15323a3;
    }
}
