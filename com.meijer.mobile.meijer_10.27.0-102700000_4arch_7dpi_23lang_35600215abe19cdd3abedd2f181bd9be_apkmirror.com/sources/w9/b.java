package w9;

import N9.n;
import N9.p;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x9.InterfaceC18025a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0014\u0010\u0012\u001a\u00020\u00118\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0014\u001a\u00020\u00138\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0016\u001a\u00020\u00158\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lw9/b;", "", "Ll9/b;", "concurrentHandlerHolder", "Le9/c;", "Ly9/c;", "Le9/d;", "requestRepository", "LD9/a;", "shardRepository", "LN9/p;", "worker", "Lw9/f;", "restClient", "LQ8/d;", "LV8/a;", "callbackRegistry", "LQ8/a;", "defaultCoreCompletionHandler", "Lx9/a;", "completionHandlerProxyProvider", "LN9/n;", "delegatorCompletionHandlerProvider", "<init>", "(Ll9/b;Le9/c;Le9/c;LN9/p;Lw9/f;LQ8/d;LQ8/a;Lx9/a;LN9/n;)V", "model", "callback", "", "b", "(Ly9/c;LV8/a;)V", "requestModel", "d", "(Ly9/c;)V", "completionHandler", "e", "(Ly9/c;LQ8/a;)V", "Landroid/os/Handler;", "handler", "f", "(Ly9/c;LQ8/a;Landroid/os/Handler;)V", "a", "Ll9/b;", "Le9/c;", "c", "LN9/p;", "Lw9/f;", "LQ8/d;", "g", "LQ8/a;", "h", "Lx9/a;", "i", "LN9/n;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e9.c<y9.c, e9.d> requestRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e9.c<D9.a, e9.d> shardRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p worker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f restClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Q8.d<y9.c, V8.a> callbackRegistry;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Q8.a defaultCoreCompletionHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18025a completionHandlerProxyProvider;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final n delegatorCompletionHandlerProvider;

    public b(l9.b concurrentHandlerHolder, e9.c<y9.c, e9.d> requestRepository, e9.c<D9.a, e9.d> shardRepository, p worker, f restClient, Q8.d<y9.c, V8.a> callbackRegistry, Q8.a defaultCoreCompletionHandler, InterfaceC18025a completionHandlerProxyProvider, n delegatorCompletionHandlerProvider) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(requestRepository, "requestRepository");
        Intrinsics.j(shardRepository, "shardRepository");
        Intrinsics.j(worker, "worker");
        Intrinsics.j(restClient, "restClient");
        Intrinsics.j(callbackRegistry, "callbackRegistry");
        Intrinsics.j(defaultCoreCompletionHandler, "defaultCoreCompletionHandler");
        Intrinsics.j(completionHandlerProxyProvider, "completionHandlerProxyProvider");
        Intrinsics.j(delegatorCompletionHandlerProvider, "delegatorCompletionHandlerProvider");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.requestRepository = requestRepository;
        this.shardRepository = shardRepository;
        this.worker = worker;
        this.restClient = restClient;
        this.callbackRegistry = callbackRegistry;
        this.defaultCoreCompletionHandler = defaultCoreCompletionHandler;
        this.completionHandlerProxyProvider = completionHandlerProxyProvider;
        this.delegatorCompletionHandlerProvider = delegatorCompletionHandlerProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar, y9.c cVar, V8.a aVar) {
        bVar.requestRepository.add(cVar);
        bVar.callbackRegistry.c(cVar, aVar);
        bVar.worker.run();
    }

    public void b(final y9.c model, final V8.a callback) {
        Intrinsics.j(model, "model");
        this.concurrentHandlerHolder.f(new Runnable() { // from class: w9.a
            @Override // java.lang.Runnable
            public final void run() {
                b.c(this.f165979a, model, callback);
            }
        });
    }

    public void d(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        e(requestModel, this.completionHandlerProxyProvider.a(null, this.defaultCoreCompletionHandler));
    }

    public void e(y9.c requestModel, Q8.a completionHandler) {
        Intrinsics.j(requestModel, "requestModel");
        Intrinsics.j(completionHandler, "completionHandler");
        f(requestModel, completionHandler, this.concurrentHandlerHolder.getCoreHandler().getHandler());
    }

    public void f(y9.c requestModel, Q8.a completionHandler, Handler handler) {
        Intrinsics.j(requestModel, "requestModel");
        Intrinsics.j(completionHandler, "completionHandler");
        Intrinsics.j(handler, "handler");
        this.restClient.c(requestModel, this.completionHandlerProxyProvider.a(null, this.delegatorCompletionHandlerProvider.a(handler, completionHandler)));
    }
}
