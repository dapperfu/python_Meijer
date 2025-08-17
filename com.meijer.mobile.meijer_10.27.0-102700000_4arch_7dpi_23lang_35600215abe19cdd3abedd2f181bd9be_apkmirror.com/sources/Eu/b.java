package Eu;

import Fu.d;
import Fu.e;
import Fu.f;
import Fu.g;
import Fu.i;
import Fu.j;
import Fu.k;
import Fu.l;
import Fu.m;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.t;
import io.constructor.data.DataManager;
import io.constructor.data.DataManager_Factory;
import io.constructor.data.interceptor.RequestInterceptor;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import io.constructor.data.remote.ConstructorApi;
import kv.InterfaceC15323a;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes7.dex */
public final class b implements Eu.a {

    /* renamed from: a, reason: collision with root package name */
    private final Fu.c f9872a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC15323a<iw.a> f9873b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC15323a<Context> f9874c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC15323a<SharedPreferences> f9875d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC15323a<PreferencesHelper> f9876e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC15323a<ConfigMemoryHolder> f9877f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC15323a<RequestInterceptor> f9878g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC15323a<OkHttpClient> f9879h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC15323a<t> f9880i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC15323a<Retrofit> f9881j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC15323a<ConstructorApi> f9882k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC15323a<DataManager> f9883l;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Fu.c f9884a;

        private a() {
        }

        public Eu.a b() {
            Bu.c.a(this.f9884a, Fu.c.class);
            return new b(this.f9884a);
        }

        public a a(Fu.c cVar) {
            this.f9884a = (Fu.c) Bu.c.b(cVar);
            return this;
        }
    }

    private b(Fu.c cVar) {
        this.f9872a = cVar;
        f(cVar);
    }

    public static a d() {
        return new a();
    }

    private SharedPreferences e() {
        Fu.c cVar = this.f9872a;
        return e.c(cVar, f.c(cVar));
    }

    @Override // Eu.a
    public DataManager a() {
        return this.f9883l.get();
    }

    @Override // Eu.a
    public PreferencesHelper b() {
        return g.c(this.f9872a, e());
    }

    @Override // Eu.a
    public ConfigMemoryHolder c() {
        return this.f9877f.get();
    }

    private void f(Fu.c cVar) {
        this.f9873b = Bu.a.c(i.a());
        f fVarA = f.a(cVar);
        this.f9874c = fVarA;
        e eVarA = e.a(cVar, fVarA);
        this.f9875d = eVarA;
        this.f9876e = g.a(cVar, eVarA);
        InterfaceC15323a<ConfigMemoryHolder> interfaceC15323aC = Bu.a.c(d.a(cVar));
        this.f9877f = interfaceC15323aC;
        InterfaceC15323a<RequestInterceptor> interfaceC15323aC2 = Bu.a.c(l.a(this.f9876e, interfaceC15323aC));
        this.f9878g = interfaceC15323aC2;
        this.f9879h = Bu.a.c(k.a(this.f9873b, interfaceC15323aC2));
        InterfaceC15323a<t> interfaceC15323aC3 = Bu.a.c(j.a());
        this.f9880i = interfaceC15323aC3;
        InterfaceC15323a<Retrofit> interfaceC15323aC4 = Bu.a.c(m.a(this.f9879h, interfaceC15323aC3, this.f9876e));
        this.f9881j = interfaceC15323aC4;
        InterfaceC15323a<ConstructorApi> interfaceC15323aC5 = Bu.a.c(Fu.b.a(interfaceC15323aC4));
        this.f9882k = interfaceC15323aC5;
        this.f9883l = Bu.a.c(DataManager_Factory.create(interfaceC15323aC5, this.f9880i));
    }
}
