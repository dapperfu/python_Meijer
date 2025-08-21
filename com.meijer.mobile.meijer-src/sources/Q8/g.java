package Q8;

import D9.ResponseModel;
import H9.l;
import I9.o;
import K9.e;
import L9.k;
import Ma.PredictRequestContext;
import R8.RemoteConfig;
import W9.MobileEngageRequestContext;
import W9.j;
import X8.c;
import ca.InterfaceC6494a;
import com.emarsys.core.api.ResponseErrorException;
import com.fullstory.FS;
import d9.C13644b;
import io.constructor.data.local.PreferencesHelper;
import j9.DeviceInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import m9.C15696a;
import xa.InterfaceC18144h;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0012¢\u0006\u0004\b%\u0010&J1\u0010-\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0012¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u00100J#\u00104\u001a\u00020$2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130201H\u0016¢\u0006\u0004\b4\u00105J#\u00107\u001a\u00020$2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060201H\u0016¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020$H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b8\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b7\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b4\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001f\u001a\u00020\u001e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010(\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010Q¨\u0006R"}, d2 = {"LQ8/g;", "LQ8/c;", "LW9/k;", "mobileEngageRequestContext", "LW9/j;", "mobileEngageInternal", "Lxa/h;", "pushInternal", "LMa/b;", "predictRequestContext", "Lj9/c;", "deviceInfo", "Ly9/b;", "requestManager", "LN8/e;", "emarsysRequestModelFactory", "LQ8/i;", "configResponseMapper", "LH9/l;", "", "clientServiceStorage", "eventServiceStorage", "deeplinkServiceStorage", "predictServiceStorage", "messageInboxServiceStorage", "logLevelStorage", "Ld9/b;", "crypto", "Lca/a;", "clientServiceInternal", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(LW9/k;LW9/j;Lxa/h;LMa/b;Lj9/c;Ly9/b;LN8/e;LQ8/i;LH9/l;LH9/l;LH9/l;LH9/l;LH9/l;LH9/l;Ld9/b;Lca/a;Ln9/b;)V", "LR8/a;", "remoteConfig", "", "i", "(LR8/a;)V", "label", "applicationCode", "", "throwable", "LX8/a;", "completionListener", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;LX8/a;)V", "b", "(LX8/a;)V", "LX8/b;", "LX8/c;", "resultListener", "g", "(LX8/b;)V", "LD9/c;", "f", "e", "l", "()V", "a", "LW9/k;", "LW9/j;", "c", "Lxa/h;", "d", "LMa/b;", "Lj9/c;", "Ly9/b;", "LN8/e;", "LQ8/i;", "LH9/l;", "j", "k", "m", "n", "o", "Ld9/b;", "p", "Lca/a;", "q", "Ln9/b;", "()Ljava/lang/String;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext mobileEngageRequestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j mobileEngageInternal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18144h pushInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PredictRequestContext predictRequestContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final N8.e emarsysRequestModelFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i configResponseMapper;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l<String> clientServiceStorage;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l<String> eventServiceStorage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<String> deeplinkServiceStorage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l<String> predictServiceStorage;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l<String> messageInboxServiceStorage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l<String> logLevelStorage;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C13644b crypto;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6494a clientServiceInternal;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Q8/g$a", "LS8/a;", "", PreferencesHelper.PREF_ID, "LD9/c;", "responseModel", "", "b", "(Ljava/lang/String;LD9/c;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements S8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X8.b<X8.c<ResponseModel>> f27896a;

        a(X8.b<X8.c<ResponseModel>> bVar) {
            this.f27896a = bVar;
        }

        @Override // S8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
            this.f27896a.onResult(X8.c.INSTANCE.a(cause));
        }

        @Override // S8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f27896a.onResult(X8.c.INSTANCE.b(responseModel));
        }

        @Override // S8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f27896a.onResult(X8.c.INSTANCE.a(new ResponseErrorException(responseModel.getStatusCode(), responseModel.getMessage(), responseModel.getBody())));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Q8/g$b", "LS8/a;", "", PreferencesHelper.PREF_ID, "LD9/c;", "responseModel", "", "b", "(Ljava/lang/String;LD9/c;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements S8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X8.b<X8.c<String>> f27897a;

        b(X8.b<X8.c<String>> bVar) {
            this.f27897a = bVar;
        }

        @Override // S8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
            this.f27897a.onResult(X8.c.INSTANCE.a(cause));
        }

        @Override // S8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            c.Companion companion = X8.c.INSTANCE;
            String body = responseModel.getBody();
            Intrinsics.g(body);
            this.f27897a.onResult(companion.b(body));
        }

        @Override // S8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f27897a.onResult(X8.c.INSTANCE.a(new ResponseErrorException(responseModel.getStatusCode(), responseModel.getMessage(), responseModel.getBody())));
        }
    }

    public g(MobileEngageRequestContext mobileEngageRequestContext, j mobileEngageInternal, InterfaceC18144h pushInternal, PredictRequestContext predictRequestContext, DeviceInfo deviceInfo, y9.b requestManager, N8.e emarsysRequestModelFactory, i configResponseMapper, l<String> clientServiceStorage, l<String> eventServiceStorage, l<String> deeplinkServiceStorage, l<String> predictServiceStorage, l<String> messageInboxServiceStorage, l<String> logLevelStorage, C13644b crypto, InterfaceC6494a clientServiceInternal, n9.b concurrentHandlerHolder) {
        Intrinsics.j(mobileEngageRequestContext, "mobileEngageRequestContext");
        Intrinsics.j(mobileEngageInternal, "mobileEngageInternal");
        Intrinsics.j(pushInternal, "pushInternal");
        Intrinsics.j(predictRequestContext, "predictRequestContext");
        Intrinsics.j(deviceInfo, "deviceInfo");
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(emarsysRequestModelFactory, "emarsysRequestModelFactory");
        Intrinsics.j(configResponseMapper, "configResponseMapper");
        Intrinsics.j(clientServiceStorage, "clientServiceStorage");
        Intrinsics.j(eventServiceStorage, "eventServiceStorage");
        Intrinsics.j(deeplinkServiceStorage, "deeplinkServiceStorage");
        Intrinsics.j(predictServiceStorage, "predictServiceStorage");
        Intrinsics.j(messageInboxServiceStorage, "messageInboxServiceStorage");
        Intrinsics.j(logLevelStorage, "logLevelStorage");
        Intrinsics.j(crypto, "crypto");
        Intrinsics.j(clientServiceInternal, "clientServiceInternal");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.mobileEngageRequestContext = mobileEngageRequestContext;
        this.mobileEngageInternal = mobileEngageInternal;
        this.pushInternal = pushInternal;
        this.predictRequestContext = predictRequestContext;
        this.deviceInfo = deviceInfo;
        this.requestManager = requestManager;
        this.emarsysRequestModelFactory = emarsysRequestModelFactory;
        this.configResponseMapper = configResponseMapper;
        this.clientServiceStorage = clientServiceStorage;
        this.eventServiceStorage = eventServiceStorage;
        this.deeplinkServiceStorage = deeplinkServiceStorage;
        this.predictServiceStorage = predictServiceStorage;
        this.messageInboxServiceStorage = messageInboxServiceStorage;
        this.logLevelStorage = logLevelStorage;
        this.crypto = crypto;
        this.clientServiceInternal = clientServiceInternal;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final g gVar, final X8.a aVar, final String str, X8.c signatureResponse) {
        Intrinsics.j(signatureResponse, "signatureResponse");
        final String str2 = (String) signatureResponse.b();
        if (str2 != null) {
            gVar.f(new X8.b() { // from class: Q8.f
                @Override // X8.b
                public final void onResult(Object obj) {
                    g.k(this.f27875a, str2, aVar, str, (X8.c) obj);
                }
            });
        }
        Throwable errorCause = signatureResponse.getErrorCause();
        if (errorCause != null) {
            gVar.h("remoteConfigSignatureFetchingFailed", str, errorCause, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(g gVar, String str, X8.a aVar, String str2, X8.c it) {
        Intrinsics.j(it, "it");
        ResponseModel responseModel = (ResponseModel) it.b();
        if (responseModel != null) {
            C13644b c13644b = gVar.crypto;
            String body = responseModel.getBody();
            Intrinsics.g(body);
            byte[] bytes = body.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            if (c13644b.e(bytes, str)) {
                gVar.e(gVar.configResponseMapper.a(responseModel));
                if (aVar != null) {
                    aVar.a(null);
                }
            } else {
                gVar.l();
                if (aVar != null) {
                    aVar.a(new Exception("Verify failed"));
                }
            }
        }
        Throwable errorCause = it.getErrorCause();
        if (errorCause != null) {
            gVar.h("remoteConfigFetchingFailed", str2, errorCause, aVar);
        }
    }

    @Override // Q8.c
    public String a() {
        return this.mobileEngageRequestContext.getApplicationCode();
    }

    @Override // Q8.c
    public void b(final X8.a completionListener) {
        final String applicationCode = this.mobileEngageRequestContext.getApplicationCode();
        if (applicationCode != null) {
            g(new X8.b() { // from class: Q8.e
                @Override // X8.b
                public final void onResult(Object obj) {
                    g.j(this.f27872a, completionListener, applicationCode, (X8.c) obj);
                }
            });
        }
    }

    public void e(RemoteConfig remoteConfig) {
        Intrinsics.j(remoteConfig, "remoteConfig");
        this.clientServiceStorage.set(remoteConfig.getClientServiceUrl());
        this.eventServiceStorage.set(remoteConfig.getEventServiceUrl());
        this.deeplinkServiceStorage.set(remoteConfig.getDeepLinkServiceUrl());
        this.predictServiceStorage.set(remoteConfig.getPredictServiceUrl());
        this.messageInboxServiceStorage.set(remoteConfig.getMessageInboxServiceUrl());
        l<String> lVar = this.logLevelStorage;
        K9.a logLevel = remoteConfig.getLogLevel();
        lVar.set(logLevel != null ? logLevel.name() : null);
        i(remoteConfig);
    }

    public void f(X8.b<X8.c<ResponseModel>> resultListener) {
        Intrinsics.j(resultListener, "resultListener");
        this.requestManager.e(this.emarsysRequestModelFactory.a(), new a(resultListener));
    }

    public void g(X8.b<X8.c<String>> resultListener) {
        Intrinsics.j(resultListener, "resultListener");
        this.requestManager.e(this.emarsysRequestModelFactory.b(), new b(resultListener));
    }

    public void l() {
        this.clientServiceStorage.set(null);
        this.eventServiceStorage.set(null);
        this.deeplinkServiceStorage.set(null);
        this.predictServiceStorage.set(null);
        this.messageInboxServiceStorage.set(null);
        this.logLevelStorage.set(null);
    }

    private void h(String label, String applicationCode, Throwable throwable, X8.a completionListener) {
        Map mapD = MapsKt.d();
        mapD.put("source", label);
        if (throwable instanceof ResponseErrorException) {
            ResponseErrorException responseErrorException = (ResponseErrorException) throwable;
            mapD.put("statusCode", Integer.valueOf(responseErrorException.getStatusCode()));
            String statusMessage = responseErrorException.getStatusMessage();
            if (statusMessage != null) {
                mapD.put("statusMessage", statusMessage);
            }
            String body = responseErrorException.getBody();
            if (body != null) {
                mapD.put("body", body);
            }
        }
        String message = throwable.getMessage();
        if (message != null) {
            mapD.put("message", message);
        }
        Map mapC = MapsKt.c(mapD);
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = getClass();
        String strA = o.a();
        Intrinsics.i(strA, "getCallerMethodName(...)");
        companion.c(new k(cls, strA, MapsKt.k(), mapC));
        l();
        FS.log_e("EmarsysSDK", "ApplicationCode(" + applicationCode + ") not found. Consult with your Implementation Consultant");
        if (completionListener != null) {
            completionListener.a(throwable);
        }
    }

    private void i(RemoteConfig remoteConfig) {
        if (remoteConfig.f() != null) {
            for (P8.a aVar : P8.a.values()) {
                if (Intrinsics.e(remoteConfig.f().get(aVar), Boolean.TRUE)) {
                    C15696a.b(aVar);
                } else if (Intrinsics.e(remoteConfig.f().get(aVar), Boolean.FALSE)) {
                    C15696a.a(aVar);
                }
            }
        }
    }
}
