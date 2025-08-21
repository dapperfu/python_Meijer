package Bu;

import com.squareup.moshi.t;
import gv.InterfaceC14411a;
import io.constructor.data.local.PreferencesHelper;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class m implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<OkHttpClient> f3685a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<t> f3686b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<PreferencesHelper> f3687c;

    public static m a(InterfaceC14411a<OkHttpClient> interfaceC14411a, InterfaceC14411a<t> interfaceC14411a2, InterfaceC14411a<PreferencesHelper> interfaceC14411a3) {
        return new m(interfaceC14411a, interfaceC14411a2, interfaceC14411a3);
    }

    public static Retrofit c(OkHttpClient okHttpClient, t tVar, PreferencesHelper preferencesHelper) {
        return (Retrofit) C18225c.d(h.f3678a.e(okHttpClient, tVar, preferencesHelper));
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Retrofit get() {
        return c(this.f3685a.get(), this.f3686b.get(), this.f3687c.get());
    }

    public m(InterfaceC14411a<OkHttpClient> interfaceC14411a, InterfaceC14411a<t> interfaceC14411a2, InterfaceC14411a<PreferencesHelper> interfaceC14411a3) {
        this.f3685a = interfaceC14411a;
        this.f3686b = interfaceC14411a2;
        this.f3687c = interfaceC14411a3;
    }
}
