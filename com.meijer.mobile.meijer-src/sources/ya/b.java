package ya;

import Aa.g;
import H9.l;
import P9.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y9.f;
import z9.C18463b;
import z9.InterfaceC18462a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lya/b;", "Lz9/a;", "Lz9/b;", "coreCompletionHandlerMiddlewareProvider", "Ly9/f;", "restClient", "LH9/l;", "", "contactTokenStorage", "pushTokenStorage", "LS8/a;", "defaultHandler", "LFa/b;", "requestModelHelper", "LAa/g;", "tokenResponseHandler", "Lya/c;", "requestModelFactory", "<init>", "(Lz9/b;Ly9/f;LH9/l;LH9/l;LS8/a;LFa/b;LAa/g;Lya/c;)V", "LP9/p;", "worker", "completionHandler", "Lya/a;", "b", "(LP9/p;LS8/a;)Lya/a;", "a", "Lz9/b;", "Ly9/f;", "c", "LH9/l;", "d", "e", "LS8/a;", "f", "LFa/b;", "g", "LAa/g;", "h", "Lya/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b implements InterfaceC18462a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18463b coreCompletionHandlerMiddlewareProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f restClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<String> contactTokenStorage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S8.a defaultHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g tokenResponseHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c requestModelFactory;

    public b(C18463b coreCompletionHandlerMiddlewareProvider, f restClient, l<String> contactTokenStorage, l<String> pushTokenStorage, S8.a defaultHandler, Fa.b requestModelHelper, g tokenResponseHandler, c requestModelFactory) {
        Intrinsics.j(coreCompletionHandlerMiddlewareProvider, "coreCompletionHandlerMiddlewareProvider");
        Intrinsics.j(restClient, "restClient");
        Intrinsics.j(contactTokenStorage, "contactTokenStorage");
        Intrinsics.j(pushTokenStorage, "pushTokenStorage");
        Intrinsics.j(defaultHandler, "defaultHandler");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        Intrinsics.j(tokenResponseHandler, "tokenResponseHandler");
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        this.coreCompletionHandlerMiddlewareProvider = coreCompletionHandlerMiddlewareProvider;
        this.restClient = restClient;
        this.contactTokenStorage = contactTokenStorage;
        this.pushTokenStorage = pushTokenStorage;
        this.defaultHandler = defaultHandler;
        this.requestModelHelper = requestModelHelper;
        this.tokenResponseHandler = tokenResponseHandler;
        this.requestModelFactory = requestModelFactory;
    }

    @Override // z9.InterfaceC18462a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C18297a a(p worker, S8.a completionHandler) {
        S8.a aVar = this.defaultHandler;
        if (completionHandler == null) {
            completionHandler = aVar;
        }
        if (worker != null) {
            completionHandler = this.coreCompletionHandlerMiddlewareProvider.a(worker, completionHandler);
        }
        return new C18297a(completionHandler, this.restClient, this.contactTokenStorage, this.pushTokenStorage, this.tokenResponseHandler, this.requestModelHelper, this.requestModelFactory);
    }
}
