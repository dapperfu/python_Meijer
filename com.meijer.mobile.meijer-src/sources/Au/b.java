package Au;

import Bu.d;
import Bu.e;
import Bu.f;
import Bu.g;
import Bu.i;
import Bu.j;
import Bu.k;
import Bu.l;
import Bu.m;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.t;
import gv.InterfaceC14411a;
import io.constructor.data.DataManager;
import io.constructor.data.DataManager_Factory;
import io.constructor.data.interceptor.RequestInterceptor;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import io.constructor.data.remote.ConstructorApi;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import xu.C18223a;
import xu.C18225c;

/* loaded from: classes8.dex */
public final class b implements Au.a {

    /* renamed from: a, reason: collision with root package name */
    private final Bu.c f2112a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC14411a<ew.a> f2113b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC14411a<Context> f2114c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC14411a<SharedPreferences> f2115d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC14411a<PreferencesHelper> f2116e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC14411a<ConfigMemoryHolder> f2117f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC14411a<RequestInterceptor> f2118g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC14411a<OkHttpClient> f2119h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC14411a<t> f2120i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC14411a<Retrofit> f2121j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC14411a<ConstructorApi> f2122k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC14411a<DataManager> f2123l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Bu.c f2124a;

        private a() {
        }

        public Au.a b() {
            C18225c.a(this.f2124a, Bu.c.class);
            return new b(this.f2124a);
        }

        public a a(Bu.c cVar) {
            this.f2124a = (Bu.c) C18225c.b(cVar);
            return this;
        }
    }

    private b(Bu.c cVar) {
        this.f2112a = cVar;
        f(cVar);
    }

    public static a d() {
        return new a();
    }

    private SharedPreferences e() {
        Bu.c cVar = this.f2112a;
        return e.c(cVar, f.c(cVar));
    }

    @Override // Au.a
    public DataManager a() {
        return this.f2123l.get();
    }

    @Override // Au.a
    public PreferencesHelper b() {
        return g.c(this.f2112a, e());
    }

    @Override // Au.a
    public ConfigMemoryHolder c() {
        return this.f2117f.get();
    }

    private void f(Bu.c cVar) {
        this.f2113b = C18223a.b(i.a());
        f fVarA = f.a(cVar);
        this.f2114c = fVarA;
        e eVarA = e.a(cVar, fVarA);
        this.f2115d = eVarA;
        this.f2116e = g.a(cVar, eVarA);
        InterfaceC14411a<ConfigMemoryHolder> interfaceC14411aB = C18223a.b(d.a(cVar));
        this.f2117f = interfaceC14411aB;
        InterfaceC14411a<RequestInterceptor> interfaceC14411aB2 = C18223a.b(l.a(this.f2116e, interfaceC14411aB));
        this.f2118g = interfaceC14411aB2;
        this.f2119h = C18223a.b(k.a(this.f2113b, interfaceC14411aB2));
        InterfaceC14411a<t> interfaceC14411aB3 = C18223a.b(j.a());
        this.f2120i = interfaceC14411aB3;
        InterfaceC14411a<Retrofit> interfaceC14411aB4 = C18223a.b(m.a(this.f2119h, interfaceC14411aB3, this.f2116e));
        this.f2121j = interfaceC14411aB4;
        InterfaceC14411a<ConstructorApi> interfaceC14411aB5 = C18223a.b(Bu.b.a(interfaceC14411aB4));
        this.f2122k = interfaceC14411aB5;
        this.f2123l = C18223a.b(DataManager_Factory.create(interfaceC14411aB5, this.f2120i));
    }
}
