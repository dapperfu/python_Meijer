package wa;

import F9.l;
import N9.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w9.f;
import x9.C18026b;
import x9.InterfaceC18025a;
import ya.C18198g;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lwa/b;", "Lx9/a;", "Lx9/b;", "coreCompletionHandlerMiddlewareProvider", "Lw9/f;", "restClient", "LF9/l;", "", "contactTokenStorage", "pushTokenStorage", "LQ8/a;", "defaultHandler", "LDa/b;", "requestModelHelper", "Lya/g;", "tokenResponseHandler", "Lwa/c;", "requestModelFactory", "<init>", "(Lx9/b;Lw9/f;LF9/l;LF9/l;LQ8/a;LDa/b;Lya/g;Lwa/c;)V", "LN9/p;", "worker", "completionHandler", "Lwa/a;", "b", "(LN9/p;LQ8/a;)Lwa/a;", "a", "Lx9/b;", "Lw9/f;", "c", "LF9/l;", "d", "e", "LQ8/a;", "f", "LDa/b;", "g", "Lya/g;", "h", "Lwa/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b implements InterfaceC18025a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18026b coreCompletionHandlerMiddlewareProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f restClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<String> contactTokenStorage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Q8.a defaultHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C18198g tokenResponseHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c requestModelFactory;

    public b(C18026b coreCompletionHandlerMiddlewareProvider, f restClient, l<String> contactTokenStorage, l<String> pushTokenStorage, Q8.a defaultHandler, Da.b requestModelHelper, C18198g tokenResponseHandler, c requestModelFactory) {
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

    @Override // x9.InterfaceC18025a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17804a a(p worker, Q8.a completionHandler) {
        Q8.a aVar = this.defaultHandler;
        if (completionHandler == null) {
            completionHandler = aVar;
        }
        if (worker != null) {
            completionHandler = this.coreCompletionHandlerMiddlewareProvider.a(worker, completionHandler);
        }
        return new C17804a(completionHandler, this.restClient, this.contactTokenStorage, this.pushTokenStorage, this.tokenResponseHandler, this.requestModelHelper, this.requestModelFactory);
    }
}
