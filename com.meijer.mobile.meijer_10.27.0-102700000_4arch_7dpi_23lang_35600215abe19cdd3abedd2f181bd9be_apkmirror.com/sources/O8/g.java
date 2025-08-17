package O8;

import B9.ResponseModel;
import F9.l;
import G9.o;
import I9.e;
import J9.k;
import Ka.PredictRequestContext;
import P8.RemoteConfig;
import U9.MobileEngageRequestContext;
import U9.j;
import V8.c;
import aa.InterfaceC5588a;
import b9.C6213b;
import com.emarsys.core.api.ResponseErrorException;
import com.fullstory.FS;
import h9.DeviceInfo;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import va.InterfaceC17532h;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0017\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0012¢\u0006\u0004\b%\u0010&J1\u0010-\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0012¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u00100J#\u00104\u001a\u00020$2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130201H\u0016¢\u0006\u0004\b4\u00105J#\u00107\u001a\u00020$2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060201H\u0016¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020$H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b8\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b7\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b4\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0014\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u001f\u001a\u00020\u001e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010(\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010Q¨\u0006R"}, d2 = {"LO8/g;", "LO8/c;", "LU9/k;", "mobileEngageRequestContext", "LU9/j;", "mobileEngageInternal", "Lva/h;", "pushInternal", "LKa/b;", "predictRequestContext", "Lh9/c;", "deviceInfo", "Lw9/b;", "requestManager", "LL8/e;", "emarsysRequestModelFactory", "LO8/i;", "configResponseMapper", "LF9/l;", "", "clientServiceStorage", "eventServiceStorage", "deeplinkServiceStorage", "predictServiceStorage", "messageInboxServiceStorage", "logLevelStorage", "Lb9/b;", "crypto", "Laa/a;", "clientServiceInternal", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(LU9/k;LU9/j;Lva/h;LKa/b;Lh9/c;Lw9/b;LL8/e;LO8/i;LF9/l;LF9/l;LF9/l;LF9/l;LF9/l;LF9/l;Lb9/b;Laa/a;Ll9/b;)V", "LP8/a;", "remoteConfig", "", "i", "(LP8/a;)V", "label", "applicationCode", "", "throwable", "LV8/a;", "completionListener", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;LV8/a;)V", "b", "(LV8/a;)V", "LV8/b;", "LV8/c;", "resultListener", "g", "(LV8/b;)V", "LB9/c;", "f", "e", "l", "()V", "a", "LU9/k;", "LU9/j;", "c", "Lva/h;", "d", "LKa/b;", "Lh9/c;", "Lw9/b;", "LL8/e;", "LO8/i;", "LF9/l;", "j", "k", "m", "n", "o", "Lb9/b;", "p", "Laa/a;", "q", "Ll9/b;", "()Ljava/lang/String;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext mobileEngageRequestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j mobileEngageInternal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17532h pushInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PredictRequestContext predictRequestContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final DeviceInfo deviceInfo;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final L8.e emarsysRequestModelFactory;

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
    private final C6213b crypto;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5588a clientServiceInternal;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"O8/g$a", "LQ8/a;", "", PreferencesHelper.PREF_ID, "LB9/c;", "responseModel", "", "d", "(Ljava/lang/String;LB9/c;)V", "b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Q8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V8.b<V8.c<ResponseModel>> f23408a;

        a(V8.b<V8.c<ResponseModel>> bVar) {
            this.f23408a = bVar;
        }

        @Override // Q8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
            this.f23408a.onResult(V8.c.INSTANCE.a(cause));
        }

        @Override // Q8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f23408a.onResult(V8.c.INSTANCE.a(new ResponseErrorException(responseModel.getStatusCode(), responseModel.getMessage(), responseModel.getBody())));
        }

        @Override // Q8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f23408a.onResult(V8.c.INSTANCE.b(responseModel));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"O8/g$b", "LQ8/a;", "", PreferencesHelper.PREF_ID, "LB9/c;", "responseModel", "", "d", "(Ljava/lang/String;LB9/c;)V", "b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Q8.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V8.b<V8.c<String>> f23409a;

        b(V8.b<V8.c<String>> bVar) {
            this.f23409a = bVar;
        }

        @Override // Q8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
            this.f23409a.onResult(V8.c.INSTANCE.a(cause));
        }

        @Override // Q8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            this.f23409a.onResult(V8.c.INSTANCE.a(new ResponseErrorException(responseModel.getStatusCode(), responseModel.getMessage(), responseModel.getBody())));
        }

        @Override // Q8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            c.Companion companion = V8.c.INSTANCE;
            String body = responseModel.getBody();
            Intrinsics.g(body);
            this.f23409a.onResult(companion.b(body));
        }
    }

    public g(MobileEngageRequestContext mobileEngageRequestContext, j mobileEngageInternal, InterfaceC17532h pushInternal, PredictRequestContext predictRequestContext, DeviceInfo deviceInfo, w9.b requestManager, L8.e emarsysRequestModelFactory, i configResponseMapper, l<String> clientServiceStorage, l<String> eventServiceStorage, l<String> deeplinkServiceStorage, l<String> predictServiceStorage, l<String> messageInboxServiceStorage, l<String> logLevelStorage, C6213b crypto, InterfaceC5588a clientServiceInternal, l9.b concurrentHandlerHolder) {
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
    public static final void j(final g gVar, final V8.a aVar, final String str, V8.c signatureResponse) {
        Intrinsics.j(signatureResponse, "signatureResponse");
        final String str2 = (String) signatureResponse.b();
        if (str2 != null) {
            gVar.f(new V8.b() { // from class: O8.f
                @Override // V8.b
                public final void onResult(Object obj) {
                    g.k(this.f23387a, str2, aVar, str, (V8.c) obj);
                }
            });
        }
        Throwable errorCause = signatureResponse.getErrorCause();
        if (errorCause != null) {
            gVar.h("remoteConfigSignatureFetchingFailed", str, errorCause, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(g gVar, String str, V8.a aVar, String str2, V8.c it) {
        Intrinsics.j(it, "it");
        ResponseModel responseModel = (ResponseModel) it.b();
        if (responseModel != null) {
            C6213b c6213b = gVar.crypto;
            String body = responseModel.getBody();
            Intrinsics.g(body);
            byte[] bytes = body.getBytes(Charsets.UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            if (c6213b.e(bytes, str)) {
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

    @Override // O8.c
    public String a() {
        return this.mobileEngageRequestContext.getApplicationCode();
    }

    @Override // O8.c
    public void b(final V8.a completionListener) {
        final String applicationCode = this.mobileEngageRequestContext.getApplicationCode();
        if (applicationCode != null) {
            g(new V8.b() { // from class: O8.e
                @Override // V8.b
                public final void onResult(Object obj) {
                    g.j(this.f23384a, completionListener, applicationCode, (V8.c) obj);
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
        I9.a logLevel = remoteConfig.getLogLevel();
        lVar.set(logLevel != null ? logLevel.name() : null);
        i(remoteConfig);
    }

    public void f(V8.b<V8.c<ResponseModel>> resultListener) {
        Intrinsics.j(resultListener, "resultListener");
        this.requestManager.e(this.emarsysRequestModelFactory.a(), new a(resultListener));
    }

    public void g(V8.b<V8.c<String>> resultListener) {
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

    private void h(String label, String applicationCode, Throwable throwable, V8.a completionListener) {
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
        e.Companion companion = I9.e.INSTANCE;
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
            for (N8.a aVar : N8.a.values()) {
                if (Intrinsics.e(remoteConfig.f().get(aVar), Boolean.TRUE)) {
                    C15125a.b(aVar);
                } else if (Intrinsics.e(remoteConfig.f().get(aVar), Boolean.FALSE)) {
                    C15125a.a(aVar);
                }
            }
        }
    }
}
