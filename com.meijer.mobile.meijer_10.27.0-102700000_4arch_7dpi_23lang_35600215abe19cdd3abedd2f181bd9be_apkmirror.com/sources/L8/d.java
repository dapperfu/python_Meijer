package L8;

import Fa.h;
import J9.k;
import O8.EmarsysConfig;
import Oa.b;
import P9.X0;
import P9.Z0;
import P9.a1;
import U9.MobileEngageRequestContext;
import U9.i;
import androidx.view.C5992H;
import c9.InterfaceC6378a;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import da.C13500b;
import g9.EnumC14223a;
import g9.EnumC14225c;
import h9.DeviceInfo;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u001c8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"LL8/d;", "", "<init>", "()V", "LO8/h;", "emarsysConfig", "", "p", "(LO8/h;)V", "l", "", "contactFieldId", "", "contactFieldValue", "LV8/a;", "completionListener", "n", "(ILjava/lang/String;LV8/a;)V", "d", "(LV8/a;)V", "config", "m", "k", "h", "s", "applicationCode", "i", "(Ljava/lang/String;)V", "LO8/b;", "f", "()LO8/b;", "getConfig$annotations", "LOa/b;", "g", "()LOa/b;", "getPush$annotations", "push", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f17906a = new d();

    @JvmStatic
    @JvmOverloads
    public static final void d(V8.a completionListener) throws IllegalArgumentException {
        N8.a aVar = N8.a.f21471b;
        if (C15125a.c(aVar) || (!C15125a.c(aVar) && !C15125a.c(N8.a.f21472c))) {
            i iVarD = a1.d();
            l9.b bVarH = C13500b.b().getConcurrentHandlerHolder();
            Object objNewProxyInstance = Proxy.newProxyInstance(iVarD.getClass().getClassLoader(), iVarD.getClass().getInterfaces(), new S8.d(iVarD));
            if (objNewProxyInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
            }
            i iVar = (i) objNewProxyInstance;
            Object objNewProxyInstance2 = Proxy.newProxyInstance(iVar.getClass().getClassLoader(), iVar.getClass().getInterfaces(), new S8.b(iVar, bVarH, 5L));
            if (objNewProxyInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
            }
            ((i) objNewProxyInstance2).a(completionListener);
        }
        if (C15125a.c(N8.a.f21472c)) {
            h hVarE = a1.e();
            l9.b bVarH2 = C13500b.b().getConcurrentHandlerHolder();
            Object objNewProxyInstance3 = Proxy.newProxyInstance(hVarE.getClass().getClassLoader(), hVarE.getClass().getInterfaces(), new S8.d(hVarE));
            if (objNewProxyInstance3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
            }
            h hVar = (h) objNewProxyInstance3;
            Object objNewProxyInstance4 = Proxy.newProxyInstance(hVar.getClass().getClassLoader(), hVar.getClass().getInterfaces(), new S8.b(hVar, bVarH2, 5L));
            if (objNewProxyInstance4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
            }
            ((h) objNewProxyInstance4).a();
        }
    }

    public static /* synthetic */ void e(V8.a aVar, int i10, Object obj) throws IllegalArgumentException {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        d(aVar);
    }

    private final void i(final String applicationCode) throws IllegalArgumentException {
        String lowerCase;
        List listP = CollectionsKt.p("", BuildConfig.TRAVIS, "nil", "0");
        if (applicationCode != null) {
            lowerCase = applicationCode.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (CollectionsKt.h0(listP, lowerCase) || applicationCode == null) {
            FS.log_w("EmarsysSdk", "Invalid applicationCode: " + applicationCode);
            I9.e.INSTANCE.f(new k(d.class, "refreshRemoteConfig", MapsKt.g(TuplesKt.a("applicationCode", applicationCode)), null, 8, null));
            return;
        }
        O8.c cVarL = Z0.a().L();
        l9.b bVarH = C13500b.b().getConcurrentHandlerHolder();
        Object objNewProxyInstance = Proxy.newProxyInstance(cVarL.getClass().getClassLoader(), cVarL.getClass().getInterfaces(), new S8.d(cVarL));
        if (objNewProxyInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.config.ConfigInternal");
        }
        O8.c cVar = (O8.c) objNewProxyInstance;
        Object objNewProxyInstance2 = Proxy.newProxyInstance(cVar.getClass().getClassLoader(), cVar.getClass().getInterfaces(), new S8.b(cVar, bVarH, 5L));
        if (objNewProxyInstance2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.config.ConfigInternal");
        }
        ((O8.c) objNewProxyInstance2).b(new V8.a() { // from class: L8.c
            @Override // V8.a
            public final void a(Throwable th2) {
                d.j(applicationCode, th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(String str, Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new k(d.class, "refreshRemoteConfig", MapsKt.o(TuplesKt.a("applicationCode", str), TuplesKt.a("exception", th2.getMessage())), null, 8, null));
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void n(int contactFieldId, String contactFieldValue, V8.a completionListener) throws IllegalArgumentException {
        Intrinsics.j(contactFieldValue, "contactFieldValue");
        N8.a aVar = N8.a.f21471b;
        if (C15125a.c(aVar) || (!C15125a.c(aVar) && !C15125a.c(N8.a.f21472c))) {
            i iVarD = a1.d();
            l9.b bVarH = C13500b.b().getConcurrentHandlerHolder();
            Object objNewProxyInstance = Proxy.newProxyInstance(iVarD.getClass().getClassLoader(), iVarD.getClass().getInterfaces(), new S8.d(iVarD));
            if (objNewProxyInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
            }
            i iVar = (i) objNewProxyInstance;
            Object objNewProxyInstance2 = Proxy.newProxyInstance(iVar.getClass().getClassLoader(), iVar.getClass().getInterfaces(), new S8.b(iVar, bVarH, 5L));
            if (objNewProxyInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
            }
            ((i) objNewProxyInstance2).b(Integer.valueOf(contactFieldId), contactFieldValue, completionListener);
        }
        if (C15125a.c(N8.a.f21472c)) {
            h hVarE = a1.e();
            l9.b bVarH2 = C13500b.b().getConcurrentHandlerHolder();
            Object objNewProxyInstance3 = Proxy.newProxyInstance(hVarE.getClass().getClassLoader(), hVarE.getClass().getInterfaces(), new S8.d(hVarE));
            if (objNewProxyInstance3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
            }
            h hVar = (h) objNewProxyInstance3;
            Object objNewProxyInstance4 = Proxy.newProxyInstance(hVar.getClass().getClassLoader(), hVar.getClass().getInterfaces(), new S8.b(hVar, bVarH2, 5L));
            if (objNewProxyInstance4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.emarsys.predict.PredictRestrictedApi");
            }
            ((h) objNewProxyInstance4).b(contactFieldId, contactFieldValue);
        }
    }

    public static /* synthetic */ void o(int i10, String str, V8.a aVar, int i11, Object obj) throws IllegalArgumentException {
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        n(i10, str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void p(final EmarsysConfig emarsysConfig) throws IllegalArgumentException {
        Intrinsics.j(emarsysConfig, "emarsysConfig");
        Iterator<T8.a> it = emarsysConfig.d().iterator();
        while (it.hasNext()) {
            C15125a.b(it.next());
        }
        if (emarsysConfig.getApplicationCode() != null) {
            C15125a.b(N8.a.f21471b);
            C15125a.b(N8.a.f21473d);
        }
        if (emarsysConfig.getMerchantId() != null) {
            C15125a.b(N8.a.f21472c);
        }
        if (!Z0.b()) {
            new X0(emarsysConfig, null, 2, 0 == true ? 1 : 0);
        }
        Z0.a().getConcurrentHandlerHolder().h(new Runnable() { // from class: L8.a
            @Override // java.lang.Runnable
            public final void run() {
                d.q(emarsysConfig);
            }
        });
        Z0.a().getConcurrentHandlerHolder().getCoreHandler().b(new Runnable() { // from class: L8.b
            @Override // java.lang.Runnable
            public final void run() throws IllegalArgumentException {
                d.r();
            }
        });
        f17906a.i(emarsysConfig.getApplicationCode());
        Z0.a().g(emarsysConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(EmarsysConfig emarsysConfig) {
        try {
            d dVar = f17906a;
            dVar.l();
            dVar.m(emarsysConfig);
        } catch (Throwable th2) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() throws IllegalArgumentException {
        d dVar = f17906a;
        dVar.k();
        if (C15125a.c(N8.a.f21471b)) {
            dVar.s();
            dVar.h();
        }
    }

    private d() {
    }

    public static final O8.b f() {
        return Z0.a().getConfig();
    }

    public static final Oa.b g() {
        return a1.f();
    }

    private final void h() throws IllegalArgumentException {
        String str = Z0.a().u().get();
        String str2 = Z0.a().C().get();
        MobileEngageRequestContext kVarV = Z0.a().v();
        String str3 = Z0.a().A().get();
        DeviceInfo deviceInfoD = Z0.a().D();
        if (str2 == null && !kVarV.n()) {
            if (str3 == null || (str != null && !Intrinsics.e(str, deviceInfoD.c()))) {
                M8.b bVarA = a1.a();
                Object objNewProxyInstance = Proxy.newProxyInstance(bVarA.getClass().getClassLoader(), bVarA.getClass().getInterfaces(), new S8.d(bVarA));
                if (objNewProxyInstance != null) {
                    ((M8.b) objNewProxyInstance).a(null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.emarsys.clientservice.ClientServiceApi");
                }
            }
            i iVarD = a1.d();
            Object objNewProxyInstance2 = Proxy.newProxyInstance(iVarD.getClass().getClassLoader(), iVarD.getClass().getInterfaces(), new S8.d(iVarD));
            if (objNewProxyInstance2 != null) {
                ((i) objNewProxyInstance2).a(null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.mobileengage.MobileEngageApi");
        }
    }

    private final void k() {
        InterfaceC6378a interfaceC6378aU = Z0.a().U();
        EnumC14225c enumC14225c = EnumC14225c.f133209b;
        EnumC14223a enumC14223a = EnumC14223a.f133200a;
        interfaceC6378aU.d("shard", enumC14225c, enumC14223a, Z0.a().o());
        Z0.a().U().d("shard", enumC14225c, enumC14223a, Z0.a().Q());
    }

    private final void l() {
        C5992H.INSTANCE.a().getLifecycle().a(Z0.a().l());
    }

    private final void m(EmarsysConfig config) {
        config.getApplication().registerActivityLifecycleCallbacks(Z0.a().M());
        config.getApplication().registerActivityLifecycleCallbacks(Z0.a().a());
    }

    private final void s() throws IllegalArgumentException {
        String str = Z0.a().B().get();
        if (str != null) {
            Oa.b bVarF = a1.f();
            Object objNewProxyInstance = Proxy.newProxyInstance(bVarF.getClass().getClassLoader(), bVarF.getClass().getInterfaces(), new S8.d(bVarF));
            if (objNewProxyInstance != null) {
                b.a.a((Oa.b) objNewProxyInstance, str, null, 2, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.emarsys.push.PushApi");
        }
    }
}
