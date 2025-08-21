package y9;

import D9.ResponseModel;
import a9.C5670b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u9.C17361a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Ly9/f;", "", "La9/b;", "connectionProvider", "Lu9/a;", "timestampProvider", "LD9/b;", "responseHandlersProcessor", "", "LS8/c;", "LA9/c;", "requestModelMappers", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(La9/b;Lu9/a;LD9/b;Ljava/util/List;Ln9/b;)V", "", "requestId", "LX8/c;", "LD9/c;", "result", "LS8/a;", "completionHandler", "", "h", "(Ljava/lang/String;LX8/c;LS8/a;)V", "requestModel", "g", "(LA9/c;)LA9/c;", "", "responseCode", "", "f", "(I)Z", "model", "c", "(LA9/c;LS8/a;)V", "a", "La9/b;", "b", "Lu9/a;", "LD9/b;", "d", "Ljava/util/List;", "e", "Ln9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5670b connectionProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D9.b responseHandlersProcessor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<S8.c<A9.c, A9.c>> requestModelMappers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public f(C5670b connectionProvider, C17361a timestampProvider, D9.b responseHandlersProcessor, List<? extends S8.c<A9.c, A9.c>> requestModelMappers, n9.b concurrentHandlerHolder) {
        Intrinsics.j(connectionProvider, "connectionProvider");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(responseHandlersProcessor, "responseHandlersProcessor");
        Intrinsics.j(requestModelMappers, "requestModelMappers");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.connectionProvider = connectionProvider;
        this.timestampProvider = timestampProvider;
        this.responseHandlersProcessor = responseHandlersProcessor;
        this.requestModelMappers = requestModelMappers;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    private final boolean f(int responseCode) {
        return 200 <= responseCode && responseCode < 300;
    }

    private final A9.c g(A9.c requestModel) {
        Iterator<S8.c<A9.c, A9.c>> it = this.requestModelMappers.iterator();
        while (it.hasNext()) {
            requestModel = it.next().a(requestModel);
        }
        return requestModel;
    }

    public void c(final A9.c model, final S8.a completionHandler) {
        Intrinsics.j(model, "model");
        Intrinsics.j(completionHandler, "completionHandler");
        final c cVar = new c(g(model), this.connectionProvider, this.timestampProvider);
        this.concurrentHandlerHolder.i(new Runnable() { // from class: y9.d
            @Override // java.lang.Runnable
            public final void run() {
                f.d(cVar, this, model, completionHandler);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(c cVar, final f fVar, final A9.c cVar2, final S8.a aVar) {
        final X8.c<ResponseModel> cVarA = cVar.a();
        fVar.concurrentHandlerHolder.f(new Runnable() { // from class: y9.e
            @Override // java.lang.Runnable
            public final void run() {
                f.e(this.f171321a, cVar2, cVarA, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(f fVar, A9.c cVar, X8.c cVar2, S8.a aVar) {
        fVar.h(cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), cVar2, aVar);
    }

    private final void h(String requestId, X8.c<ResponseModel> result, S8.a completionHandler) {
        if (result.getErrorCause() != null) {
            Throwable errorCause = result.getErrorCause();
            Intrinsics.h(errorCause, "null cannot be cast to non-null type java.lang.Exception");
            completionHandler.a(requestId, (Exception) errorCause);
            return;
        }
        ResponseModel responseModelB = result.b();
        Intrinsics.g(responseModelB);
        ResponseModel responseModel = responseModelB;
        this.responseHandlersProcessor.b(result.b());
        if (f(responseModel.getStatusCode())) {
            completionHandler.b(requestId, responseModel);
        } else {
            completionHandler.d(requestId, responseModel);
        }
    }
}
